package com.jdk2010.member.membercomplain.model;
import java.util.Date;
import com.jdk2010.framework.dal.model.Model;
import com.jdk2010.framework.dal.parse.annotation.TableField;

public class MemberComplain extends Model<MemberComplain> {
        	/* id */
    	private Integer id;
        	/* 会员ID */
    	private Integer memberId;
        	/* 会员手机 */
    	private String memberMobile;
        	/* 会员姓名 */
    	private String memberName;
        	/* 投诉内容 */
    	private String complainMessage;
        	/* 投诉时间 */
    	private Date complainTime;
        	/* 回复状态 */
    	private Integer replayStatus;
        	/* 回复人id */
    	private Integer replayUserid;
        	/* 回复时间 */
    	private Date replayTime;
        	/* 回复内容 */
    	private String replayMessage;
        	/* 审核状态 */
    	private Integer reviewStatus;
        	/* 审核人id */
    	private Integer reviewUserid;
        	/* 审核时间 */
    	private Date reviewTime;
        	/* 审核意见 */
    	private String reviewMessage;
             	 
  		@TableField
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
        	 
  		@TableField
		public Integer getMemberId() {
			return memberId;
		}
		public void setMemberId(Integer memberId) {
			this.memberId = memberId;
		}
        	 
  		@TableField
		public String getMemberMobile() {
			return memberMobile;
		}
		public void setMemberMobile(String memberMobile) {
			this.memberMobile = memberMobile;
		}
        	 
  		@TableField
		public String getMemberName() {
			return memberName;
		}
		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}
        	 
  		@TableField
		public String getComplainMessage() {
			return complainMessage;
		}
		public void setComplainMessage(String complainMessage) {
			this.complainMessage = complainMessage;
		}
        	 
  		@TableField
		public Date getComplainTime() {
			return complainTime;
		}
		public void setComplainTime(Date complainTime) {
			this.complainTime = complainTime;
		}
        	 
  		@TableField
		public Integer getReplayStatus() {
			return replayStatus;
		}
		public void setReplayStatus(Integer replayStatus) {
			this.replayStatus = replayStatus;
		}
        	 
  		@TableField
		public Integer getReplayUserid() {
			return replayUserid;
		}
		public void setReplayUserid(Integer replayUserid) {
			this.replayUserid = replayUserid;
		}
        	 
  		@TableField
		public Date getReplayTime() {
			return replayTime;
		}
		public void setReplayTime(Date replayTime) {
			this.replayTime = replayTime;
		}
        	 
  		@TableField
		public String getReplayMessage() {
			return replayMessage;
		}
		public void setReplayMessage(String replayMessage) {
			this.replayMessage = replayMessage;
		}
        	 
  		@TableField
		public Integer getReviewStatus() {
			return reviewStatus;
		}
		public void setReviewStatus(Integer reviewStatus) {
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
		public String getReviewMessage() {
			return reviewMessage;
		}
		public void setReviewMessage(String reviewMessage) {
			this.reviewMessage = reviewMessage;
		}
		
		private String complainTitle;

		@TableField
        public String getComplainTitle() {
            return complainTitle;
        }
        public void setComplainTitle(String complainTitle) {
            this.complainTitle = complainTitle;
        }
        
        private String replayName;
        private String reviewName;

        public String getReplayName() {
            return replayName;
        }
        public void setReplayName(String replayName) {
            this.replayName = replayName;
        }
        public String getReviewName() {
            return reviewName;
        }
        public void setReviewName(String reviewName) {
            this.reviewName = reviewName;
        }
        
    }