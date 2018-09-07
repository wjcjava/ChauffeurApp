package com.example.wangjunchao.chauffeurdemo.view.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.wangjunchao.chauffeurdemo.R;
import com.example.wangjunchao.chauffeurdemo.library.BaseActivity;
import com.example.wangjunchao.chauffeurdemo.view.adapter.ForOrderAdapter;
import com.example.wangjunchao.chauffeurdemo.view.bean.ForOrderBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

public class PickGoodsActivity extends BaseActivity{
    @Bind(R.id.title_title)
    TextView pickTitle;
    @Bind(R.id.title_right)
    TextView pickRightTitle;
    @Bind(R.id.recycler_pick)
    RecyclerView pickRecycler;
    private List<ForOrderBean> forOrderBeans=new ArrayList<>();
    @Override
    protected int getLayoutId() {
        return R.layout.activity_pick_goods;
    }

    @Override
    protected void initView() {
        super.initView();
        pickTitle.setTextColor(getResources().getColor(R.color.white));
        pickRightTitle.setTextColor(getResources().getColor(R.color.qmui_config_color_red));
        pickRightTitle.setTextSize(14);
        pickTitle.setText("提货详情");
        pickRightTitle.setText("异常事件");
    }

    @Override
    protected void initData() {
        super.initData();
        for (int i = 0; i <5 ; i++) {
            forOrderBeans.add(new ForOrderBean());
        }
        ForOrderAdapter forOrderAdapter=new ForOrderAdapter(R.layout.item_for_order,forOrderBeans);
        pickRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        pickRecycler.setAdapter(forOrderAdapter);
    }
    @OnClick({R.id.tv_take_goods})
    public void click(View view) {
        switch (view.getId()) {
            case R.id.tv_take_goods:
            startActivity(new Intent(this,TackGoodsActivity.class));
                break;



        }
    }
}
