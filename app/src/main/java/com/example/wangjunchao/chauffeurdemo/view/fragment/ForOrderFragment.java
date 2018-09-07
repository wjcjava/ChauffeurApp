package com.example.wangjunchao.chauffeurdemo.view.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.wangjunchao.chauffeurdemo.R;
import com.example.wangjunchao.chauffeurdemo.library.BaseFragment;
import com.example.wangjunchao.chauffeurdemo.view.adapter.ForOrderAdapter;
import com.example.wangjunchao.chauffeurdemo.view.bean.ForOrderBean;
import com.example.wangjunchao.chauffeurdemo.view.home.PickGoodsActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForOrderFragment extends BaseFragment {
    @Bind(R.id.recycler_for_order)
    RecyclerView recyclerView;
    private List<ForOrderBean> forOrderBeans = new ArrayList<>();

    @Override
    protected int setLayoutResourceID() {
        return R.layout.fragment_for_order;
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    protected void initDate() {
        super.initDate();
        for (int i = 0; i < 5; i++) {
            forOrderBeans.add(new ForOrderBean());
        }
        ForOrderAdapter forOrderAdapter = new ForOrderAdapter(R.layout.item_for_order, forOrderBeans);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(forOrderAdapter);
        forOrderAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                getActivity().startActivity(new Intent(getActivity(), PickGoodsActivity.class));
            }
        });
    }
}
