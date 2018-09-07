package com.example.wangjunchao.chauffeurdemo.view.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wangjunchao.chauffeurdemo.R;
import com.example.wangjunchao.chauffeurdemo.library.BaseFragment;
import com.example.wangjunchao.chauffeurdemo.library.NoScrollViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends BaseFragment{
    @Bind(R.id.tab_order)
    TabLayout orderTab;
    @Bind(R.id.pager_order)
    NoScrollViewPager orderPager;
    @Bind(R.id.title_title)
    TextView homeTitle;
    private List<Fragment> fragmentList;
    private List<String> tabList=new ArrayList<>();
    @Override
    protected int setLayoutResourceID() {
        return R.layout.fragment_order;
    }

    @Override
    protected void init() {
        super.init();
        homeTitle.setTextColor(getResources().getColor(R.color.white));
        homeTitle.setText("订单");
    }

    @Override
    protected void initDate() {
        super.initDate();
        fragmentList=new ArrayList<>();
        tabList.add("待提货");
        tabList.add("待送达");
        tabList.add("已完成");
        fragmentList.add(new ForOrderFragment());
        fragmentList.add(new EnquiryFragment());
        fragmentList.add(new MineFragment());
        MyAdapter myAdapter=new MyAdapter(getChildFragmentManager());
        orderPager.setAdapter(myAdapter);
        orderTab.setupWithViewPager(orderPager);
    }

    private class MyAdapter extends FragmentPagerAdapter{
        public MyAdapter(FragmentManager childFragmentManager) {
            super(childFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return tabList.get(position);
        }
    }
}
