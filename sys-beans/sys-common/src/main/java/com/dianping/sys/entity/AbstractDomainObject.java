package com.dianping.sys.entity;

import java.util.Date;

public class AbstractDomainObject {
	private int id;
	
	private int creatorID;

	private int lastUpdatorID;

	private Date createTime;

	private Date lastUpdateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCreatorID() {
		return creatorID;
	}

	public void setCreatorID(int creatorID) {
		this.creatorID = creatorID;
	}

	public int getLastUpdatorID() {
		return lastUpdatorID;
	}

	public void setLastUpdatorID(int lastUpdatorID) {
		this.lastUpdatorID = lastUpdatorID;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
}
