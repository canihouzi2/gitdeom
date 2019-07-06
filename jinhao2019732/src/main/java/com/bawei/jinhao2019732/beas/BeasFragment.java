package com.bawei.jinhao2019732.beas;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
 *@Auther:Lenovo
 *@Date: 2019/7/3
 *@Time: 09:03:47
 *@Description:
 * */public abstract class BeasFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(setinLoyout(), container, false);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
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
    public <T extends View> T getViewId(int id) {
        return getView().findViewById(id);
    }
}
