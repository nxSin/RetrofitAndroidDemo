package shixin.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import shixin.databindingdemo.R;
import shixin.databindingdemo.adapter.MRecycleAdapter;
import shixin.databindingdemo.bean.User;
import shixin.databindingdemo.databinding.ActivityRecycleviewBinding;

/**
 * Created by shixin on 2017/9/20.
 */

public class RecycleViewActivity extends AppCompatActivity {

    private ActivityRecycleviewBinding recycleviewBinding;

    private MRecycleAdapter mRecycleAdapter;
    private List<User> users;

    private MyPresenter presenter;
    public class MyPresenter {
        public void onClickAddItem() {

        }

        public void onClickRemoveItem() {

        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recycleviewBinding = DataBindingUtil.setContentView(this, R.layout.activity_recycleview);
        initUser();
        presenter=new MyPresenter();
        mRecycleAdapter = new MRecycleAdapter(users);
        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recycleviewBinding.recycleView.setLayoutManager(linearLayoutManager);
        recycleviewBinding.recycleView.setAdapter(mRecycleAdapter);
    }

    private void initUser() {
        users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add(new User("啊啊啊", 19, true));
        }
    }
}
