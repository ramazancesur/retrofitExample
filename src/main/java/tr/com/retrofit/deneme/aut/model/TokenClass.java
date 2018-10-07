package tr.com.retrofit.deneme.aut.model;

import java.util.Calendar;

public class TokenClass {
	private Long createdDate;
	private String token="";
	private static TokenClass instance;

	private TokenClass(){
		createdDate= Calendar.getInstance().getTime().getTime();
	}
	
	public Long getCreatedDate() {
		return createdDate;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	public static TokenClass getInstance() {
		if (instance == null){
			instance= new TokenClass();
		}
		return instance;
	}
}