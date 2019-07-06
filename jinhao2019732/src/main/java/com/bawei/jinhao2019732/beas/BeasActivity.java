package com.bawei.jinhao2019732.beas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

/*
 *@Auther:Lenovo
 *@Date: 2019/7/3
 *@Time: 09:01:00
 *@Description:
 * */public abstract class BeasActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setinLoyout());
        intrView();
        intrData();
        intrEnder();
    }
    //布局
    public abstract int setinLoyout();
    //获取资源
    public abstract void intrView();
    //数据
    public abstract void intrData();
    //点击事件
    public abstract void intrEnder();
}
