package shixin.retrofitdemo.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shixin on 2017/9/11.
 */

public class RequestBean {
    @SerializedName("app")
    private String app;
    @SerializedName("weaid")
    private String weaid;
    @SerializedName("appkey")
    private String appkey;
    @SerializedName("sign")
    private String sign;
    @SerializedName("format")
    private String format;

    public RequestBean(String app, String weaid, String appkey, String sign, String format) {
        this.app = app;
        this.weaid = weaid;
        this.appkey = appkey;
        this.sign = sign;
        this.format = format;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getWeaid() {
        return weaid;
    }

    public void setWeaid(String weaid) {
        this.weaid = weaid;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
