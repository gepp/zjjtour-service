package com.jdk2010.member.memberactivity.model;
import java.util.Date;
import com.jdk2010.framework.dal.model.Model;
import com.jdk2010.framework.dal.parse.annotation.TableField;

public class MemberActivity extends Model<MemberActivity> {
        	/* id */
    	private Integer id;
        	/* 活动标题 */
    	private String title;
        	/* litter_title */
    	private String litterTitle;
        	/* 通告内容 */
    	private String content;
        	/* 用户id */
    	private Integer userid;
        	/* 活动状态全部、未开始、进行中、已结束 */
    	private Integer activityStatus;
        	/* 是否启用 */
    	private Integer status;
        	/* 创建时间 */
    	private Date ctime;
        	/* 缩略图 */
    	private String smallimg;
        	/* 首页图 */
    	private String indeximg;
        	/* url */
    	private String url;
        	/* 排序 */
    	private Integer orderlist;
        	/* 摘要 */
    	private String abstractContent;
        	/* 0会员 1全部 */
    	private String joinType;
        	/* 是否首页 */
    	private String indexStatus;
        	/* 是否置顶 */
    	private String topStatus;
        	/* 0页面 1页外 */
    	private String jumpType;
        	/* menu_id */
    	private Integer menuId;
        	/* 0未处理 1通过 2 失败 */
    	private String reviewStatus;
        	/* review_userid */
    	private Integer reviewUserid;
        	/* review_time */
    	private Date reviewTime;
        	/* review_reason */
    	private String reviewReason;
        	/* 是否支持报名 */
    	private String supportStatus;
        	/* 开始时间 */
    	private Date startTime;
        	/* 截止时间 */
    	private Date endTime;
             	 
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
		public String getLitterTitle() {
			return litterTitle;
		}
		public void setLitterTitle(String litterTitle) {
			this.litterTitle = litterTitle;
		}
        	 
  		@TableField
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
        	 
  		@TableField
		public Integer getUserid() {
			return userid;
		}
		public void setUserid(Integer userid) {
			this.userid = userid;
		}
        	 
  		@TableField
		public Integer getActivityStatus() {
			return activityStatus;
		}
		public void setActivityStatus(Integer activityStatus) {
			this.activityStatus = activityStatus;
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
        	 
  		@TableField
		public String getSmallimg() {
			return smallimg;
		}
		public void setSmallimg(String smallimg) {
			this.smallimg = smallimg;
		}
        	 
  		@TableField
		public String getIndeximg() {
			return indeximg;
		}
		public void setIndeximg(String indeximg) {
			this.indeximg = indeximg;
		}
        	 
  		@TableField
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
        	 
  		@TableField
		public Integer getOrderlist() {
			return orderlist;
		}
		public void setOrderlist(Integer orderlist) {
			this.orderlist = orderlist;
		}
        	 
  		@TableField
		public String getAbstractContent() {
			return abstractContent;
		}
		public void setAbstractContent(String abstractContent) {
			this.abstractContent = abstractContent;
		}
        	 
  		@TableField
		public String getJoinType() {
			return joinType;
		}
		public void setJoinType(String joinType) {
			this.joinType = joinType;
		}
        	 
  		@TableField
		public String getIndexStatus() {
			return indexStatus;
		}
		public void setIndexStatus(String indexStatus) {
			this.indexStatus = indexStatus;
		}
        	 
  		@TableField
		public String getTopStatus() {
			return topStatus;
		}
		public void setTopStatus(String topStatus) {
			this.topStatus = topStatus;
		}
        	 
  		@TableField
		public String getJumpType() {
			return jumpType;
		}
		public void setJumpType(String jumpType) {
			this.jumpType = jumpType;
		}
        	 
  		@TableField
		public Integer getMenuId() {
			return menuId;
		}
		public void setMenuId(Integer menuId) {
			this.menuId = menuId;
		}
        	 
  		@TableField
		public String getReviewStatus() {
			return reviewStatus;
		}
		public void setReviewStatus(String reviewStatus) {
			this.reviewStatus = reviewStatus;
		}
        	 
  		@TableField
		public Integer getReviewUserid() {
			return reviewUserid;
		}
		public void setReviewUserid(Integer reviewUserid) {
			this.reviewUserid = reviewUserid;
		}
        	 
  		@TableField
		public Date getReviewTime() {
			return reviewTime;
		}
		public void setReviewTime(Date reviewTime) {
			this.reviewTime = reviewTime;
		}
        	 
  		@TableField
		public String getReviewReason() {
			return reviewReason;
		}
		public void setReviewReason(String reviewReason) {
			this.reviewReason = reviewReason;
		}
        	 
  		@TableField
		public String getSupportStatus() {
			return supportStatus;
		}
		public void setSupportStatus(String supportStatus) {
			this.supportStatus = supportStatus;
		}
        	 
  		@TableField
		public Date getStartTime() {
			return startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
        	 
  		@TableField
		public Date getEndTime() {
			return endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
    }