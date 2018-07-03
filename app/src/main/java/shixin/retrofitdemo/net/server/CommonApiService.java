package shixin.retrofitdemo.net.server;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import shixin.body.CommonResp;
import shixin.body.OpenLogReq;

/**
 * 存放通用的一些API
 * Created by shixin on 2017/10/12.
 */

public interface CommonApiService {
    String HEADER_REQUEST = "Content-Type:application/json";

    /**
     * 开锁日志
     *
     * @param req 请求类
     * @return
     */
    @Headers(HEADER_REQUEST)
    @POST("door/openLog")
    Call<CommonResp> openLog(@Body OpenLogReq req);
}
