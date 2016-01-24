package com.jdk2010.system.systemadv.model;
import java.util.Date;
import com.jdk2010.framework.dal.model.Model;
import com.jdk2010.framework.dal.parse.annotation.TableField;

public class SystemAdv extends Model<SystemAdv> {
        	/* id */
    	private Integer id;
        	/* 标题 */
    	private String title;
        	/* 跳转地址 */
    	private String jumpUrl;
        	/* 图片 */
    	private String imgUrl;
        	/* 类型 */
    	private String type;
        	/* 排序号 */
    	private Integer orderlist;
        	/* 是否启用 */
    	private Integer status;
             	 
  		@TableField
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
        	 
  		@TableField
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
        	 
  		@TableField
		public String getJumpUrl() {
			return jumpUrl;
		}
		public void setJumpUrl(String jumpUrl) {
			this.jumpUrl = jumpUrl;
		}
        	 
  		@TableField
		public String getImgUrl() {
			return imgUrl;
		}
		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}
        	 
  		@TableField
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
        	 
  		@TableField
		public Integer getOrderlist() {
			return orderlist;
		}
		public void setOrderlist(Integer orderlist) {
			this.orderlist = orderlist;
		}
        	 
  		@TableField
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
    }