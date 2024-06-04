package com.himedia.twoving.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.himedia.twoving.util.DBman;
import com.himedia.twoving.util.Paging;
import com.himedia.twoving.vo.AdminVO;
import com.himedia.twoving.vo.CustomerInquiryVO;
import com.himedia.twoving.vo.FaqVO;
import com.himedia.twoving.vo.NoticeVO;
import com.himedia.twoving.vo.ProductVO;

public class AdminDao {
	private AdminDao() {}
	private static AdminDao itc = new AdminDao();
	public static AdminDao getInstance() {return itc;}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public AdminVO getAdmin(String adminid) {
		AdminVO avo = null;
		con = DBman.getConnection();
		String sql = "select * from admins where adminid=?"; 
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, adminid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				avo = new AdminVO();
				avo.setAdminid(rs.getString("adminid"));
				avo.setPwd(rs.getString("pwd"));
				avo.setName(rs.getString("name"));
				avo.setPhone(rs.getString("phone"));
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
		return avo;
	}
	
	public ArrayList<ProductVO> adminProductList(Paging paging, String key) {
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		con = DBman.getConnection();
		String sql = "select * from product where title like concat('%', ?, '%') "
				+ " order by pseq desc limit ? offset ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, key);
			pstmt.setInt(2, paging.getDisplayRow());
			pstmt.setInt(3, paging.getStartNum() - 1);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ProductVO pvo = new ProductVO();
				pvo.setPseq(rs.getInt("pseq"));
				pvo.setKind(rs.getInt("kind"));
				pvo.setGenre(rs.getString("genre"));
				pvo.setBestyn(rs.getString("bestyn"));
				pvo.setUseyn(rs.getString("useyn"));
				pvo.setNewyn(rs.getString("newyn"));
				pvo.setTitle(rs.getString("title"));
				pvo.setImage(rs.getString("image")); 
				pvo.setSavefilename(rs.getString("savefilename"));
				list.add(pvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		return list;
	}

	public int getAllCount(String tablename, String fieldname, String key) {
		int count = 0;
		con = DBman.getConnection();
		String sql = "select count(*) as cnt from " + tablename 
				+ " where " + fieldname + " like concat('%', ?, '%') "; 
		// 검색어가 '부츠'  concat의 결과 '%부츠%' -> '부츠'를 포함한 상품명 검색
		// 검색어가 ''  concat의 결과 '%%' -> 모든 상품명을 결과로 검색
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, key);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt("cnt");
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
		return count;
	}

	public ArrayList<NoticeVO> adminNoticeList(Paging paging, String key) {
		ArrayList<NoticeVO> list = new ArrayList<NoticeVO>();
		con = DBman.getConnection();
		String sql = "select * from notice where title like concat('%', ?, '%') "
				+ " order by noticeyn desc, nseq desc limit ? offset ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, key);
			pstmt.setInt(2, paging.getDisplayRow());
			pstmt.setInt(3, paging.getStartNum()-1);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				NoticeVO noticeVO = new NoticeVO();
				noticeVO.setNseq(rs.getInt("nseq"));
				noticeVO.setUserid(rs.getString("userid"));
				noticeVO.setTitle(rs.getString("title"));
				noticeVO.setContent(rs.getString("content"));
				noticeVO.setIndate(rs.getTimestamp("indate"));
				noticeVO.setReadcount(rs.getInt("readcount"));
				noticeVO.setNoticeyn(rs.getString("noticeyn"));				
				list.add(noticeVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}		
		return list;
	}

	public void adminWriteNotice(NoticeVO nvo) {
		con = DBman.getConnection();
		String sql = "insert into notice(userid, title, content, noticeyn) values(?,?,?,?)"; 
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, nvo.getUserid());
			pstmt.setString(2, nvo.getTitle());
			pstmt.setString(3, nvo.getContent());
			pstmt.setString(4, nvo.getNoticeyn());
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
	}

	public NoticeVO getNotice(int nseq) {
		NoticeVO nvo = new NoticeVO();
		String sql = "select * from notice where nseq = ?";
		con = DBman.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, nseq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				nvo.setNseq(nseq);
				nvo.setTitle(rs.getString("title"));
				nvo.setContent(rs.getString("content"));
				nvo.setNoticeyn(rs.getString("noticeyn"));
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
		return nvo;
	}

	public void updateNotice(NoticeVO nvo) {
		con = DBman.getConnection();
		String sql = "update notice set title=?, content=?, noticeyn=? where nseq=?"; 
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, nvo.getTitle());
			pstmt.setString(2, nvo.getContent());
			pstmt.setString(3, nvo.getNoticeyn());
			pstmt.setInt(4, nvo.getNseq());
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
	}

	public int deleteNotice(int nseq) {
		int result = 0;
		con = DBman.getConnection();
		String sql = "delete from notice where nseq=?"; 
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, nseq);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
		return result;
	}

	public ArrayList<FaqVO> adminFaqList(Paging paging, String key) {
		ArrayList<FaqVO> list = new ArrayList<FaqVO>();
		con = DBman.getConnection();
		String sql = "select * from faq where subject like concat('%', ?, '%') "
				+ " order by qseq desc limit ? offset ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, key);
			pstmt.setInt(2, paging.getDisplayRow());
			pstmt.setInt(3, paging.getStartNum()-1);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				FaqVO fvo = new FaqVO();
				fvo.setQseq(rs.getInt("qseq"));
				fvo.setInquirylist(rs.getString("inquirylist"));
				fvo.setSubject(rs.getString("subject"));
				fvo.setContent(rs.getString("content"));
				fvo.setIndate(rs.getTimestamp("indate"));
				list.add(fvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}		
		return list;
	}

	public void adminWriteFaq(FaqVO fvo) {
		con = DBman.getConnection();
		String sql = "insert into faq(inquirylist, subject, content) values(?,?,?)"; 
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, fvo.getInquirylist());
			pstmt.setString(2, fvo.getSubject());
			pstmt.setString(3, fvo.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
	}

	public FaqVO getFaq(int qseq) {
		FaqVO fvo = new FaqVO();
		String sql = "select * from faq where qseq = ?";
		con = DBman.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, qseq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				fvo.setQseq(qseq);
				fvo.setInquirylist(rs.getString("inquirylist"));
				fvo.setSubject(rs.getString("subject"));
				fvo.setContent(rs.getString("content"));
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
		return fvo;
	}

	public void updateFaq(FaqVO fvo) {
		con = DBman.getConnection();
		String sql = "update faq set inquirylist=?, subject=?, content=? where qseq=?"; 
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, fvo.getInquirylist());
			pstmt.setString(2, fvo.getSubject());
			pstmt.setString(3, fvo.getContent());
			pstmt.setInt(4, fvo.getQseq());
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
		
	}

	public int deleteFaq(int qseq) {
		int result = 0;
		con = DBman.getConnection();
		String sql = "delete from faq where qseq=?"; 
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, qseq);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
		return result;
	}

	public ArrayList<CustomerInquiryVO> adminInquiryList(Paging paging, String key) {
		ArrayList<CustomerInquiryVO> list = new ArrayList<CustomerInquiryVO>();
		con = DBman.getConnection();
		String sql = "select * from customerinquiry where inquirytitle like concat('%', ?, '%') "
				+ " order by reply asc, ciseq desc limit ? offset ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, key);
			pstmt.setInt(2, paging.getDisplayRow());
			pstmt.setInt(3, paging.getStartNum()-1);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CustomerInquiryVO cvo = new CustomerInquiryVO();
				cvo.setCiseq(rs.getInt("ciseq"));
				cvo.setName(rs.getString("name"));
				cvo.setEmail(rs.getString("email"));
				cvo.setPhone(rs.getString("phone"));
				cvo.setInquiryList(rs.getString("inquiryList"));
				cvo.setDevicephone(rs.getString("devicephone"));
				cvo.setDevicemodelname(rs.getString("devicemodelname"));
				cvo.setRunplace(rs.getString("runplace"));
				cvo.setRuntime1(rs.getString("runtime1"));
				cvo.setRuntime2(rs.getString("runtime2"));
				cvo.setRuncontent(rs.getString("runcontent"));
				cvo.setInquirytitle(rs.getString("inquirytitle"));
				cvo.setInquirycontent(rs.getString("inquirycontent"));
				cvo.setReply(rs.getString("reply"));
				cvo.setIndate(rs.getTimestamp("indate"));
				list.add(cvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}		
		return list;
	}

	public CustomerInquiryVO getInquiry(int ciseq) {
		CustomerInquiryVO cvo = new CustomerInquiryVO();
		String sql = "select * from customerinquiry where ciseq = ?";
		con = DBman.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, ciseq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cvo.setCiseq(rs.getInt("ciseq"));
				cvo.setName(rs.getString("name"));
				cvo.setEmail(rs.getString("email"));
				cvo.setPhone(rs.getString("phone"));
				cvo.setInquiryList(rs.getString("inquiryList"));
				cvo.setDevicephone(rs.getString("devicephone"));
				cvo.setDevicemodelname(rs.getString("devicemodelname"));
				cvo.setRunenvironment(rs.getString("runenvironment"));
				cvo.setRunplace(rs.getString("runplace"));
				cvo.setRuntime1(rs.getString("runtime1"));
				cvo.setRuntime2(rs.getString("runtime2"));
				cvo.setRuncontent(rs.getString("runcontent"));
				cvo.setInquirytitle(rs.getString("inquirytitle"));
				cvo.setInquirycontent(rs.getString("inquirycontent"));
				cvo.setReply(rs.getString("reply"));
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
		return cvo;
	}

	public void inquiryReplyUpdate(int ciseq, String reply) {
		con = DBman.getConnection();
		String sql = "update customerinquiry set reply = ? where ciseq=?"; 
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, reply);
			pstmt.setInt(2, ciseq);
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
	}

	public void insertAdminProduct(ProductVO pvo) {
		con = DBman.getConnection();
		String sql = "insert into product(kind, genre, useyn, newyn, bestyn, "
				+ " age, year, time, title, content, image, savefilename, image2, savefilename2) "
				+ " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pvo.getKind());
			pstmt.setString(2, pvo.getGenre());
			pstmt.setString(3, pvo.getUseyn());
			pstmt.setString(4, pvo.getNewyn());
			pstmt.setString(5, pvo.getBestyn());
			pstmt.setString(6, pvo.getAge());
			pstmt.setString(7, pvo.getYear());
			pstmt.setString(8, pvo.getTime());
			pstmt.setString(9, pvo.getTitle());
			pstmt.setString(10, pvo.getContent());
			pstmt.setString(11, pvo.getImage());
			pstmt.setString(12, pvo.getSavefilename());
			pstmt.setString(13, pvo.getImage2());
			pstmt.setString(14, pvo.getSavefilename2());
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
	}

	public ProductVO adminGetProduct(int pseq) {
		ProductVO pvo = new ProductVO();
		con = DBman.getConnection();
		String sql = "select * from product where pseq=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pseq);
			rs = pstmt.executeQuery();
			if(rs.next()){
			pvo.setPseq( rs.getInt("pseq"));
			pvo.setKind(rs.getInt("kind"));
			pvo.setGenre(rs.getString("genre"));
			pvo.setUseyn(rs.getString("useyn"));
			pvo.setNewyn(rs.getString("newyn"));
			pvo.setBestyn(rs.getString("bestyn"));
			pvo.setAge(rs.getString("age"));
			pvo.setYear(rs.getString("year"));
			pvo.setTime(rs.getString("time"));
			pvo.setTitle(rs.getString("title"));
			pvo.setContent(rs.getString("content"));
			pvo.setImage( rs.getString("image"));
			pvo.setSavefilename(rs.getString("savefilename"));
			pvo.setImage2( rs.getString("image2"));
			pvo.setSavefilename2(rs.getString("savefilename2"));
		}
		} catch (SQLException e) { e.printStackTrace();
		}finally{ DBman.close(con, pstmt, rs); } 
		return pvo;
	}

	public int deleteProduct(int pseq) {
		int result = 0;
		con = DBman.getConnection();
		String sql = "delete from product where pseq=?"; 
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pseq);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
		return result;
	}

	public void updateProduct(ProductVO pvo) {
		con = DBman.getConnection();
		String sql = "update product set kind=?, genre=?, bestyn=?, newyn=?, useyn=?, title=?, content=?, age=?, year=?, "
				+ " time=?, image=?, savefilename=?, image2=?, savefilename2=? where pseq=?"; 
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pvo.getKind());
			pstmt.setString(2, pvo.getGenre());
			pstmt.setString(3, pvo.getBestyn());
			pstmt.setString(4, pvo.getNewyn());
			pstmt.setString(5, pvo.getUseyn());
			pstmt.setString(6, pvo.getTitle());
			pstmt.setString(7, pvo.getContent());
			pstmt.setString(8, pvo.getAge());
			pstmt.setString(9, pvo.getYear());
			pstmt.setString(10, pvo.getTime());
			pstmt.setString(11, pvo.getImage());
			pstmt.setString(12, pvo.getSavefilename());
			pstmt.setString(13, pvo.getImage2());
			pstmt.setString(14, pvo.getSavefilename2());
			pstmt.setInt(15, pvo.getPseq());
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
	}
}
