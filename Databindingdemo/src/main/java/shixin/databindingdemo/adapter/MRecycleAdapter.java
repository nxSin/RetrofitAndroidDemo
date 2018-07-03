package shixin.databindingdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.android.databinding.library.baseAdapters.BR;

import java.util.List;

import shixin.databindingdemo.bean.User;
import shixin.databindingdemo.databinding.ItemUserBinding;

/**
 * Created by shixin on 2017/9/20.
 */

public class MRecycleAdapter extends RecyclerView.Adapter<BaseBindingViewHolder> {

    private static final String TAG = "MRecycleAdapter";
    private List<User> users;

    public MRecycleAdapter(List<User> users) {
        this.users = users;
    }

//    @Override
//    public MyClassHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        ItemUserBinding binding = ItemUserBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
//        return new MyClassHolder(binding);
//    }
    //    @Override
//    public void onBindViewHolder(MyClassHolder holder, int position) {
//        holder.bind(users.get(position));
//    }


    @Override
    public BaseBindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemUserBinding binding = ItemUserBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new BaseBindingViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(BaseBindingViewHolder holder, int position) {
        holder.getBinding().setVariable(BR.item_user, users.get(position));
    }


    @Override
    public int getItemCount() {
        return users == null ? 0 : users.size();
    }

//    class MyClassHolder extends RecyclerView.ViewHolder {
//        private final ItemUserBinding binding;
//
//        public MyClassHolder(ItemUserBinding itemView) {
//            super(itemView.getRoot());
//            this.binding = itemView;
//        }
//
//        public void bind(User item) {
//            Log.d(TAG, "user:" + item);
//            binding.setItemUser(item);
//            binding.executePendingBindings();
//        }
//    }
}
