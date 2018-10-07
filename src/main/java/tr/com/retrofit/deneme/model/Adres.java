package tr.com.retrofit.deneme.model;

import com.google.gson.annotations.SerializedName;

import tr.com.retrofit.deneme.utils.BaseEntity;
import tr.com.retrofit.deneme.utils.EnumUtils.ADRES_TYPE;
import tr.com.retrofit.deneme.utils.EnumUtils.ADRES_USER_TYPE;

public class Adres extends BaseEntity{
	@SerializedName("adres")
	private String adres;
	@SerializedName("adresType")
	private ADRES_TYPE adresType;
	@SerializedName("adresUserType")
	private ADRES_USER_TYPE adresUserType;
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public ADRES_TYPE getAdresType() {
		return adresType;
	}
	public void setAdresType(ADRES_TYPE adresType) {
		this.adresType = adresType;
	}
	public ADRES_USER_TYPE getAdresUserType() {
		return adresUserType;
	}
	public void setAdresUserType(ADRES_USER_TYPE adresUserType) {
		this.adresUserType = adresUserType;
	}
	 
	
	

}
