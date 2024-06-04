package com.himedia.twoving.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.himedia.twoving.util.DBman;
import com.himedia.twoving.vo.MemberVO;

public class MemberDao {
    private MemberDao() {}
    private static MemberDao instance = new MemberDao();

    public static MemberDao getInstance() {
        return instance;
    }

    public MemberVO getMember(String userid) {
        MemberVO mvo = null;
        try (Connection con = DBman.getConnection();
             PreparedStatement pstmt = con.prepareStatement("SELECT * FROM member WHERE userid = ?")) {
            pstmt.setString(1, userid);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    mvo = new MemberVO();
                    mvo.setUserid(rs.getString("userid"));
                    mvo.setPwd(rs.getString("pwd"));
                    mvo.setName(rs.getString("name"));
                    mvo.setEmail(rs.getString("email"));
                    mvo.setPhone(rs.getString("phone"));
                    mvo.setUseyn(rs.getString("useyn"));
                    mvo.setIndate(rs.getTimestamp("indate"));
                }
            }
        } catch (SQLException e) {
            // Log the exception
            e.printStackTrace();
        }
        return mvo;
    }

    public int insertMember(MemberVO mvo) {
        int result = 0;
        String sql = "INSERT INTO member(userid, pwd, name, email) VALUES (?, ?, ?, ?)";
        try (Connection con = DBman.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, mvo.getUserid());
            pstmt.setString(2, mvo.getPwd());
            pstmt.setString(3, mvo.getName());
            pstmt.setString(4, mvo.getEmail());
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            // Log the exception
            e.printStackTrace();
        }
        return result;
    }

    public void updateMember(MemberVO mvo) {
        String sql = "UPDATE member SET pwd = ?, name = ?, email = ? WHERE userid = ?";
        try (Connection con = DBman.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, mvo.getPwd());
            pstmt.setString(2, mvo.getName());
            pstmt.setString(3, mvo.getEmail());
            pstmt.setString(4, mvo.getUserid());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            // Log the exception
            e.printStackTrace();
        }
    }
}