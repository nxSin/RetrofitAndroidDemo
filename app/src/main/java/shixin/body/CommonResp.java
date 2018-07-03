package shixin.body;

/**
 * Created by shixin on 2017/10/24.
 */

public class CommonResp {

    /**
     * error : 状态码
     * errormsg : 错误信息
     */

    private int error;
    private String errormsg;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    @Override
    public String toString() {
        return "CommonResp{" +
                "error=" + error +
                ", errormsg='" + errormsg + '\'' +
                '}';
    }
}
