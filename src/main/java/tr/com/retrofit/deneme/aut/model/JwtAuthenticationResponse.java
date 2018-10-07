package tr.com.retrofit.deneme.aut.model;

public class JwtAuthenticationResponse {
	private String token;
	private String userName;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
