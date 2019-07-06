package com.bawei.jinhao2019732.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/*
 *@Auther:Lenovo
 *@Date: 2019/7/3
 *@Time: 09:16:44
 *@Description:
 * */public class FragAdapter extends FragmentPagerAdapter {
    private List<Fragment> flist;
    private List<String> slist;

    public FragAdapter(FragmentManager fm, List<Fragment> flist, List<String> slist) {
        super(fm);
        this.flist = flist;
        this.slist = slist;
    }

    @Override
    public Fragment getItem(int i) {
        return flist.get(i);
    }

    @Override
    public int getCount() {
        return flist.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return slist.get(position);
    }
}
