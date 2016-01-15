package com.jdk2010.member.member.model;
import java.util.Date;
import com.jdk2010.framework.dal.model.Model;
import com.jdk2010.framework.dal.parse.annotation.TableField;

public class Member extends Model<Member> {
        	/* id */
    	private Integer id;
        	/* 会员名称 */
    	private String nickname;
        	/* 邮箱 */
    	private String email;
        	/* 手机 */
    	private String mobile;
        	/* 真实姓名 */
    	private String realname;
        	/* 性别 */
    	private String sex;
        	/* 启用标志 */
    	private Integer status;
        	/* 创建时间 */
    	private Date ctime;
             	 
  		@TableField
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
        	 
  		@TableField
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
        	 
  		@TableField
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
        	 
  		@TableField
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
        	 
  		@TableField
		public String getRealname() {
			return realname;
		}
		public void setRealname(String realname) {
			this.realname = realname;
		}
        	 
  		@TableField
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
        	 
  		@TableField
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
        	 
  		@TableField
		public Date getCtime() {
			return ctime;
		}
		public void setCtime(Date ctime) {
			this.ctime = ctime;
		}
		
		private String memberpwd;

		@TableField
        public String getMemberpwd() {
            return memberpwd;
        }
        public void setMemberpwd(String memberpwd) {
            this.memberpwd = memberpwd;
        }
		
    }