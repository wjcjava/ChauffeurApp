package com.example.wangjunchao.chauffeurdemo.view.home;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.wangjunchao.chauffeurdemo.R;
import com.example.wangjunchao.chauffeurdemo.library.BaseActivity;
import com.example.wangjunchao.chauffeurdemo.library.NoScrollViewPager;
import com.example.wangjunchao.chauffeurdemo.view.fragment.EnquiryFragment;
import com.example.wangjunchao.chauffeurdemo.view.fragment.MineFragment;
import com.example.wangjunchao.chauffeurdemo.view.fragment.OrderFragment;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Bind(R.id.pager_home)
    NoScrollViewPager homePager;
    public List<Fragment> fragmentList=new ArrayList<>();
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        super.initView();

    }

    @Override
    protected void initData() {
        super.initData();
        fragmentList.add(new OrderFragment());
        fragmentList.add(new EnquiryFragment());
        fragmentList.add(new MineFragment());
        MyAdapter myAdapter=new MyAdapter(getSupportFragmentManager());
        homePager.setAdapter(myAdapter);
    }

    private class MyAdapter extends FragmentPagerAdapter{
        public MyAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);

        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
    }

    @OnClick({R.id.tv_order,R.id.tv_enquiry,R.id.tv_mine})
    public void click(View view) {
        switch (view.getId()) {
            case R.id.tv_order:
                homePager.setCurrentItem(0);
                break;
            case R.id.tv_enquiry:
                homePager.setCurrentItem(1);
                break;
            case R.id.tv_mine:
                homePager.setCurrentItem(2);
                break;


        }
    }
}
