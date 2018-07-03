package shixin.retrofitdemo;

import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import shixin.retrofitdemo.bean.RequestBean;
import shixin.retrofitdemo.net.XhttpClient;
import shixin.retrofitdemo.net.server.TestService;

/**
 * Created by shixin on 2017/9/10.
 */

public class GetTestActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "GetTestActivity";
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_test);
        findViewById(R.id.btn_get).setOnClickListener(this);
        findViewById(R.id.btn_post).setOnClickListener(this);
        findViewById(R.id.btn_getMAP).setOnClickListener(this);
        findViewById(R.id.btn_post_body).setOnClickListener(this);
        findViewById(R.id.btn_post_up_file).setOnClickListener(this);

        textView = (TextView) findViewById(R.id.tv_respon);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_get:
                getTest();
                break;
            case R.id.btn_getMAP:
                getMapTest();
                break;
            case R.id.btn_post:
                postTest();
                break;
            case R.id.btn_post_body:
                postBodyTest();
                break;
            case R.id.btn_post_up_file:
                uploadFile();
                break;
        }
    }

    /**
     * 传对象
     */
    private void postBodyTest() {

        TestService testService = XhttpClient.getRetrofit().create(TestService.class);
        RequestBean requestBean = new RequestBean("weather.today", "1", "10003",
                "b59bc3ef6191eb9f747dd4e83c99f2a4", "json");
        Call<ResponseBody> bodyCall = testService.getDataPOSTBody(requestBean);
        bodyCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                Log.d(TAG, "主线成？" + (Looper.myLooper() == Looper.getMainLooper()));
                String responseS = null;
                try {
                    responseS = response.body().string();
                    Log.d(TAG, "内容:\n" + responseS);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText(responseS);

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "失败");

            }
        });
    }

    private void getMapTest() {

        TestService testService = XhttpClient.getRetrofit().create(TestService.class);
        Map<String, String> map = new HashMap<>();
        map.put("app", "weather.today");
        map.put("weaid", "1");
        map.put("appkey", "10003");
        map.put("sign", "b59bc3ef6191eb9f747dd4e83c99f2a4");
        map.put("format", "json");

        Call<ResponseBody> bodyCall = testService.getDataGETMap(map);
        bodyCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                Log.d(TAG, "主线成？" + (Looper.myLooper() == Looper.getMainLooper()));
                String responseS = null;
                try {
                    responseS = response.body().string();
                    Log.d(TAG, "内容:\n" + responseS);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText(responseS);

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "失败");

            }
        });

    }

    private void postTest() {

        TestService testService = XhttpClient.getRetrofit().create(TestService.class);
        Call<ResponseBody> bodyCall = testService.getDataPOST("weather.today", "1", "10003",
                "b59bc3ef6191eb9f747dd4e83c99f2a4", "json");
        bodyCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                Log.d(TAG, "主线成？" + (Looper.myLooper() == Looper.getMainLooper()));
                String responseS = null;
                try {
                    responseS = response.body().string();
                    Log.d(TAG, "内容:\n" + responseS);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText(responseS);

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "失败");

            }
        });
    }

    private void getTest() {

        TestService testService = XhttpClient.getRetrofit().create(TestService.class);
        Call<ResponseBody> bodyCall = testService.getDataGET("weather.today", "1", "10003",
                "b59bc3ef6191eb9f747dd4e83c99f2a4", "json");
        bodyCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                Log.d(TAG, "主线成？" + (Looper.myLooper() == Looper.getMainLooper()));
                String responseS = null;
                try {
                    responseS = response.body().string();
                    Log.d(TAG, "内容:\n" + responseS);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText(responseS);

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "失败");

            }
        });
    }

    public void uploadFile() {
        File file = new File("/storage/emulated/0/Advertisement/1514380228ae0ff2011a554339ad6920ae235c3a0a_20171227211014.png");
        if (file.exists()) {
            Log.d(TAG, "文件存在,准备上传");
        } else {
            Log.d(TAG, "文件不存在");
            return;
        }
        RequestBody requestFile = RequestBody.create(MediaType.parse("image/*"), file);
        MultipartBody.Part body = MultipartBody.Part.createFormData("file", file.getName(), requestFile);
        String tokenString = "toke";
        RequestBody token = RequestBody.create(MediaType.parse("multipart-data"), tokenString);
        Call<ResponseBody> call = XhttpClient.getRetrofit().create(TestService.class)
                .inerNetUploadFile(token,
                        body, SystemClock.currentThreadTimeMillis() + 60, 1394436, "file", 2
                );
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.d(TAG, "success:" + response.raw());
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "fail:" + t.getMessage());
            }
        });
    }
}
