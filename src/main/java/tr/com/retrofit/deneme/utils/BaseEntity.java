package tr.com.retrofit.deneme.utils;

import com.google.gson.annotations.SerializedName;

import tr.com.retrofit.deneme.utils.EnumUtils.EntityState;

public class BaseEntity {
	@SerializedName("oid")
	private Long id;
	@SerializedName("lastUpdated")
	private int lastUpdated;
	@SerializedName("createdDate")
	private Long createdDate;
	@SerializedName("updatedDate")
	private Long updatedDate;
	@SerializedName("entityState")
	private EntityState entityState;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(int lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public Long getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Long createdDate) {
		this.createdDate = createdDate;
	}
	public Long getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Long updatedDate) {
		this.updatedDate = updatedDate;
	}
	public EntityState getEntityState() {
		return entityState;
	}
	public void setEntityState(EntityState entityState) {
		this.entityState = entityState;
	}
}