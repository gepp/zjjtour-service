package com.jdk2010.base.security.securitynews.model;

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

}