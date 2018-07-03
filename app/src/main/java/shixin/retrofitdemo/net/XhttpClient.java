package shixin.retrofitdemo.net;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by shixin on 2017/9/10.
 */

public class XhttpClient {
    private static Retrofit retrofit;
    //    private final static String baseUrl = "http://api.k780.com:88/";
    private static final String baseUrl = "http://10.0.0.222:8090/";
    private static String baseUrlHarf = "http://api.";

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
