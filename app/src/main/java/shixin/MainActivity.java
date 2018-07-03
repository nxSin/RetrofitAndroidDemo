package shixin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import shixin.base.BaseActivity;
import shixin.retrofitdemo.GetTestActivity;
import shixin.retrofitdemo.R;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_get_activity).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_get_activity:
                startActivity(new Intent(this, GetTestActivity.class));
                break;
        }
    }
}
