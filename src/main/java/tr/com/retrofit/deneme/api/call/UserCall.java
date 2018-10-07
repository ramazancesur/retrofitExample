package tr.com.retrofit.deneme.api.call;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import tr.com.retrofit.deneme.aut.model.JwtAuthenticationRequest;
import tr.com.retrofit.deneme.aut.model.JwtAuthenticationResponse;
import tr.com.retrofit.deneme.model.Adres;
import tr.com.retrofit.deneme.model.User;

public interface UserCall {
	@GET("adres/getAll")
	Call<Adres> getAllAdres();

	@GET("user/getAll")
	Call<List<User>> getAllUser();
	
	@POST("auth")
	Call<JwtAuthenticationResponse> createToken(@Body JwtAuthenticationRequest request);
}