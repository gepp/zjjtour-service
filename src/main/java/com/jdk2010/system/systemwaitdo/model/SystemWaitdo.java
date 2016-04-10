package com.jdk2010.system.systemwaitdo.model;
import java.util.Date;
import com.jdk2010.framework.dal.model.Model;
import com.jdk2010.framework.dal.parse.annotation.TableField;

public class SystemWaitdo extends Model<SystemWaitdo> {
        	/* id */
    	private Integer id;
        	/* 栏目名称 */
    	private String name;
        	/* 代办事项名称 */
    	private String title;
        	/* 创建时间 */
    	private Date ctime;
        	/* 状态 */
    	private Integer status;
        	/* user_id */
    	private Integer userId;
        	/* 类型 */
    	private String type;
        	/* 目标ID */
    	private Integer targetId;
             	 
  		@TableField
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
        	 
  		@TableField
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
        	 
  		@TableField
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
        	 
  		@TableField
		public Date getCtime() {
			return ctime;
		}
		public void setCtime(Date ctime) {
			this.ctime = ctime;
		}
        	 
  		@TableField
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
        	 
  		@TableField
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
        	 
  		@TableField
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
        	 
  		@TableField
		public Integer getTargetId() {
			return targetId;
		}
		public void setTargetId(Integer targetId) {
			this.targetId = targetId;
		}
		
		private Integer parentId;

		public Integer getParentId() {
			return parentId;
		}
		public void setParentId(Integer parentId) {
			this.parentId = parentId;
		}
		
    }