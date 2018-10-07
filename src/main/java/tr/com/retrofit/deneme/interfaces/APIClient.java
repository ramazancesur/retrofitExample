package tr.com.retrofit.deneme.interfaces;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import tr.com.retrofit.deneme.aut.model.TokenClass;

public class APIClient {

	private static Retrofit retrofit = null;

	public static Retrofit getClient() {

		OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
			@Override
			public Response intercept(Chain chain) throws IOException {
				Request newRequest = chain.request().newBuilder()
						.addHeader("Authorization", TokenClass.getInstance().getToken()).build();
				return chain.proceed(newRequest);
			}
		}).build();

		if (retrofit == null) {
			retrofit = new Retrofit.Builder().client(client).baseUrl("http://localhost:8080/haliYikama/")
					.addConverterFactory(GsonConverterFactory.create()).build();
		}
		return retrofit;

	}
}