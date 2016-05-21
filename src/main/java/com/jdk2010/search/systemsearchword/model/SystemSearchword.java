package com.jdk2010.search.systemsearchword.model;

import java.util.Date;
import com.jdk2010.framework.dal.model.Model;
import com.jdk2010.framework.dal.parse.annotation.TableField;

public class SystemSearchword extends Model<SystemSearchword> {
	/* id */
	private Integer id;
	/* 常用搜索 */
	private String name;
	/* 启用标志 */
	private Integer status;
	/* 排序号 */
	private Integer orderlist;

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
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@TableField
	public Integer getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(Integer orderlist) {
		this.orderlist = orderlist;
	}
}