package shixin.retrofitdemo.net.server;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import shixin.retrofitdemo.bean.RequestBean;

/**
 * Created by shixin on 2017/9/10.
 */

public interface TestService {
    /*
    如果你在注解中提供的url是完整的url，则url将作为请求的url。
如果你在注解中提供的url是不完整的url，且不以 / 开头，则请求的url为baseUrl+注解中提供的值
如：http://localhost:4567/path/to/other/	/post	http://localhost:4567/post

如果你在注解中提供的url是不完整的url，且以 / 开头，则请求的url为baseUrl的主机部分+注解中提供的值

作者：怪盗kidou
链接：http://www.jianshu.com/p/308f3c54abdd
來源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    */

//    String url = "http://api.k780.com:88/?app=weather.today&weaid=1&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json";

    @FormUrlEncoded
    @POST("/")
    Call<ResponseBody> getDataPOST(@Field("app") String app, @Field("weaid") String weaid,
                                   @Field("appkey") String appkey, @Field("sign") String sign,
                                   @Field("forma" +
                                           "t") String format);

    /**
     * 传入对象
     *
     * @param requestBean
     * @return
     */
    @POST("/")
    Call<ResponseBody> getDataPOSTBody(@Body RequestBean requestBean);

    @GET("/")
    Call<ResponseBody> getDataGET(@Query("app") String app, @Query("weaid") String weaid,
                                  @Query("appkey") String appkey, @Query("sign") String sign,
                                  @Query("format") String format);

    /**
     * 使用map方式
     */
    @GET("/")
    Call<ResponseBody> getDataGETMap(@QueryMap Map<String, String> map);

    @Multipart
    @POST("http://up.imgapi.com")
    Call<ResponseBody> inerNetUploadFile(@Part("Token") RequestBody token,
                                         @Part MultipartBody.Part file,
                                         @Query("deadline") long deadline,
                                         @Query("aid") int aid,
                                         @Query("from") String from,
                                         @Query("httptype") int httptype);
}
