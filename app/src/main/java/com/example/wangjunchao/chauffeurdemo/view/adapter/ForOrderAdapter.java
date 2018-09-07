package com.example.wangjunchao.chauffeurdemo.view.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.wangjunchao.chauffeurdemo.view.bean.ForOrderBean;

import java.util.List;

public class ForOrderAdapter extends BaseQuickAdapter<ForOrderBean,BaseViewHolder>{
    public ForOrderAdapter(int layoutResId, @Nullable List<ForOrderBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ForOrderBean item) {

    }
}
