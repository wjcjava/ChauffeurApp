package com.example.wangjunchao.chauffeurdemo.library;


import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.example.wangjunchao.chauffeurdemo.R;
import com.example.wangjunchao.chauffeurdemo.library.commonwidget.StatusBarCompat;

import butterknife.ButterKnife;


public abstract class BaseActivity extends SwipeActivity{
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//
 StatusBarCompat.setStatusBarColor(this, ContextCompat.getColor(this, R.color.black));
     //StatusBarUtil.getStatusBarLightMode(this.getWindow());

        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initData();
        initView();
        doFirstRequest();
    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    }

    @Override
    public void onStop() {
        super.onStop();

    }

    protected void initView() {
    }
    protected void initData() {
    }


    protected void doFirstRequest() {

    }

    protected abstract int getLayoutId();


}
