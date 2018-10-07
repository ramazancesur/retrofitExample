package tr.com.retrofit.deneme.model;

import com.google.gson.annotations.SerializedName;

import tr.com.retrofit.deneme.utils.BaseEntity;

public class User extends BaseEntity{
    @SerializedName("kullaniciAdi")
    private String kullaniciAdi;
    @SerializedName("ePosta")
    private String email;
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [kullaniciAdi=" + kullaniciAdi + ", email=" + email + ", getId()=" + getId()
				+ ", getLastUpdated()=" + getLastUpdated() + ", getCreatedDate()=" + getCreatedDate()
				+ ", getUpdatedDate()=" + getUpdatedDate() + ", getEntityState()=" + getEntityState() + "]";
	}

}