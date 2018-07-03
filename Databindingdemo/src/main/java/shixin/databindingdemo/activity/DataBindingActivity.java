package shixin.databindingdemo.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import shixin.databindingdemo.R;
import shixin.databindingdemo.bean.User;
import shixin.databindingdemo.databinding.ActivityDatabingBinding;

/**
 * Created by shixin on 2017/9/19.
 */

public class DataBindingActivity extends AppCompatActivity {

    private User user = new User("诗诗妹", 24, true);
    private static final String TAG = "DataBindingActivity";
    ActivityDatabingBinding activityDatabingBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDatabingBinding
                = DataBindingUtil.setContentView(this, R.layout.activity_databing);

        activityDatabingBinding.tvFist.setText("我爱你");

        activityDatabingBinding.setUser(user);
        activityDatabingBinding.setPresenter(new TextChangePresenter());//设置事件监听
        //初始化viewstub
        activityDatabingBinding.viewStubUser.getViewStub().inflate();
//        activityDatabingBinding.setVariable(BR.user,user);
    }

    public class TextChangePresenter {
        public void btnClick(View view) {
            Log.d(TAG, "btn click");
            user.setName("love ");
            user.setMan(true);
        }

        public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
            // intentionally empty, template pattern method can be overridden by subclasses
            Log.d(TAG, "add change");
            user.setName(text.toString());
        }

        public void listener(User user) {
            Log.d(TAG, "get user:" + user);

            startActivity(new Intent(DataBindingActivity.this, RecycleViewActivity.class));
        }
    }
}
