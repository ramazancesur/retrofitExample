package tr.com.retrofit.deneme.rest;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tr.com.retrofit.deneme.api.call.UserCall;
import tr.com.retrofit.deneme.aut.model.JwtAuthenticationRequest;
import tr.com.retrofit.deneme.aut.model.JwtAuthenticationResponse;
import tr.com.retrofit.deneme.aut.model.TokenClass;
import tr.com.retrofit.deneme.interfaces.APIClient;

public class RestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserCall userCall = APIClient.getClient().create(UserCall.class);
		
		if( TokenClass.getInstance().getToken()==""){
			
		JwtAuthenticationRequest request = new JwtAuthenticationRequest();
		request.setUsername("admin");
		request.setPassword("admin");
		
		String token="";

		try {
			JwtAuthenticationResponse response= userCall.createToken(request).execute().body();
			System.out.println(response.getUserName());
			token= response.getToken();
			TokenClass.getInstance().setToken(token);			
			System.out.println(token);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

		try {
			System.out.println(userCall.getAllUser().execute());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
			 * ApiInterface apiInterface=
			 * APIClient.getClient().create(ApiInterface.class);
			 * 
			 * Call<MultipleResource> call = apiInterface.doGetListResources();
			 * 
			 * try { MultipleResource response =call.execute().body();
			 * System.out.println(response.data); } catch (IOException e) { //
			 * TODO Auto-generated catch block e.printStackTrace(); };
			 * 
			 * User user= new User(); user.setJob("software engineer");
			 * user.setName("ramazan cesur"); try {
			 * user=apiInterface.createUser(user).execute().body();
			 * System.out.println(user); } catch (IOException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 * call.enqueue(new Callback<MultipleResource>() {
			 * 
			 * @Override public void onResponse(Call<MultipleResource> call,
			 * Response<MultipleResource> response) { // TODO Auto-generated
			 * method stub System.out.println(response.code());
			 * 
			 * String displayResponse = "";
			 * 
			 * MultipleResource resource = response.body(); Integer text =
			 * resource.page; Integer total = resource.total; Integer totalPages
			 * = resource.totalPages; List<Datum> datumList = resource.data;
			 * 
			 * displayResponse += text + " Page\n" + total + " Total\n" +
			 * totalPages + " Total Pages\n";
			 * 
			 * for (Datum datum : datumList) { displayResponse += datum.id + " "
			 * + datum.name + " " + datum.pantoneValue + " " + datum.year +
			 * "\n"; }
			 * 
			 * System.out.println("*** Sonuc text ****" +displayResponse);
			 * 
			 * }
			 * 
			 * @Override public void onFailure(Call<MultipleResource> call,
			 * Throwable arg1) { // TODO Auto-generated method stub
			 * call.cancel(); } });
			 */

	}

}
