package kr.or.ddit.member.model;

import java.util.Date;

public class UserVo {
   
   private String user_id;
   private String usernm;
   private String pass;
   private Date reg_dt;
   private String alias;
   private String addr1;
   private String addr2;
   private String zipcode;
   
   // 대다수의 framework는 기본 생성자를 필요로 한다
   public UserVo() {}
   
   
   public UserVo(String user_id, String usernm, String pass, Date reg_dt, String alias, String addr1,
         String addr2, String zipcode) {
      this.user_id = user_id;
      this.usernm = usernm;
      this.pass = pass;
      this.reg_dt = reg_dt;
      this.alias = alias;
      this.addr1 = addr1;
      this.addr2 = addr2;
      this.zipcode = zipcode;
   }


   // getters, setters, toString 생성
   public String getuser_id() {
      return user_id;
   }
   public void setuser_id(String user_id) {
      this.user_id = user_id;
   }
   public String getUsernm() {
      return usernm;
   }
   public void setUsernm(String usernm) {
      this.usernm = usernm;
   }
   public String getPass() {
      return pass;
   }
   public void setPass(String pass) {
      this.pass = pass;
   }
   public Date getReg_dt() {
      return reg_dt;
   }
   public void setReg_dt(Date reg_dt) {
      this.reg_dt = reg_dt;
   }
   public String getAlias() {
      return alias;
   }
   public void setAlias(String alias) {
      this.alias = alias;
   }
   public String getAddr1() {
      return addr1 == null ? "" : addr1;
   }
   public void setAddr1(String addr1) {
      this.addr1 = addr1;
   }
   public String getAddr2() {
      return addr2 == null ? "" : addr2;
   }
   public void setAddr2(String addr2) {
      this.addr2 = addr2;
   }
   public String getZipcode() {
      return zipcode == null ? "" : zipcode;
   }
   public void setZipcode(String zipcode) {
      this.zipcode = zipcode;
   }
   

   @Override
   public String toString() {
      return "UserVo [user_id=" + user_id + ", usernm=" + usernm + ", pass=" + pass + ", reg_dt=" + reg_dt + ", alias="
            + alias + ", addr1=" + addr1 + ", addr2=" + addr2 + ", zipcode=" + zipcode + "]";
   }

   
}