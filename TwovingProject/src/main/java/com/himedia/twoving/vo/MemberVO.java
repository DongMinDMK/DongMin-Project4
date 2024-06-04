package com.himedia.twoving.vo;

import java.sql.Timestamp;

public class MemberVO {
   private String userid;
   private String pwd;
   private String name;
   private String email;
   private String phone;
   private Timestamp indate;
   private String useyn;
   public String getUserid() {
      return userid;
   }
   public void setUserid(String userid) {
      this.userid = userid;
   }
   public String getPwd() {
      return pwd;
   }
   public void setPwd(String pwd) {
      this.pwd = pwd;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public String getPhone() {
      return phone;
   }
   public void setPhone(String phone) {
      this.phone = phone;
   }
   public Timestamp getIndate() {
      return indate;
   }
   public void setIndate(Timestamp indate) {
      this.indate = indate;
   }
   public String getUseyn() {
      return useyn;
   }
   public void setUseyn(String useyn) {
      this.useyn = useyn;
   }
}