package com.jdk2010.base.security.securitynews.model;

import java.math.BigDecimal;
import java.util.Date;

import com.jdk2010.framework.dal.model.Model;
import com.jdk2010.framework.dal.parse.annotation.TableField;

public class SecurityNews extends Model<SecurityNews> {
	/* id */
	private Integer id;
	/* 通告标题 */
	private String title;
	/* 通告内容 */
	private String content;
	/* 用户id */
	private Integer userid;
	/* 是否启用 */
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
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	private String realname;

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	private String litterTitle;
	private String smallimg;
	private String indeximg;
	private String url;
	private Integer orderlist;
	private String abstractContent;
	private String readType;
	private String topStatus;
	private String indexStatus;
	private String jumpType;
	private Integer menuId;
	private String reviewStatus;
	private Integer reviewUserid;
	private Date reviewTime;

	@TableField
	public String getLitterTitle() {
		return litterTitle;
	}

	public void setLitterTitle(String litterTitle) {
		this.litterTitle = litterTitle;
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
	public String getReadType() {
		return readType;
	}

	public void setReadType(String readType) {
		this.readType = readType;
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
	public String getTopStatus() {
		return topStatus;
	}

	public void setTopStatus(String topStatus) {
		this.topStatus = topStatus;
	}

	@TableField
	public String getIndexStatus() {
		return indexStatus;
	}

	public void setIndexStatus(String indexStatus) {
		this.indexStatus = indexStatus;
	}

	private String reviewName;

	public String getReviewName() {
		return reviewName;
	}

	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}

	private String menuName;

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	private String newsType;
	private String outStatus;
	private String outJs;

	@TableField
	public String getNewsType() {
		return newsType;
	}

	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}

	@TableField
	public String getOutStatus() {
		return outStatus;
	}

	public void setOutStatus(String outStatus) {
		this.outStatus = outStatus;
	}

	@TableField
	public String getOutJs() {
		return outJs;
	}

	public void setOutJs(String outJs) {
		this.outJs = outJs;
	}

	private String videoUrl;

	@TableField
	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	private String maodianStatus;

	@TableField
	public String getMaodianStatus() {
		return maodianStatus;
	}

	public void setMaodianStatus(String maodianStatus) {
		this.maodianStatus = maodianStatus;
	}

	private String quanjingUrl;

	@TableField
	public String getQuanjingUrl() {
		return quanjingUrl;
	}

	public void setQuanjingUrl(String quanjingUrl) {
		this.quanjingUrl = quanjingUrl;
	}

	private String keywords;

	@TableField
	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	private int readtotal;

	@TableField
	public int getReadtotal() {
		return readtotal;
	}

	public void setReadtotal(int readtotal) {
		this.readtotal = readtotal;
	}

	private String newsFrom;

	@TableField
	public String getNewsFrom() {
		return newsFrom;
	}

	public void setNewsFrom(String newsFrom) {
		this.newsFrom = newsFrom;
	}

	private BigDecimal price;
	private String goodUrl;

	@TableField
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@TableField
	public String getGoodUrl() {
		return goodUrl;
	}

	public void setGoodUrl(String goodUrl) {
		this.goodUrl = goodUrl;
	}

}