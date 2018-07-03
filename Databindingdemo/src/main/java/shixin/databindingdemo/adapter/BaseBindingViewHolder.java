package shixin.databindingdemo.adapter;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by shixin on 2017/9/20.
 */

public class BaseBindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {

    private T mBinding;

    public BaseBindingViewHolder(T itemView) {
        super(itemView.getRoot());
        this.mBinding = itemView;
    }

    public T getBinding() {
        return mBinding;
    }
}
