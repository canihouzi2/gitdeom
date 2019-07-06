package com.bawei.jinhao2019732.tab;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ScrollView;

import com.bawei.jinhao2019732.LongActivity;
import com.bawei.jinhao2019732.Mylistview;
import com.bawei.jinhao2019732.R;
import com.bawei.jinhao2019732.adapter.MylisAdapter;
import com.bawei.jinhao2019732.bean.Bean;
import com.bawei.jinhao2019732.beas.BeasFragment;
import com.bawei.jinhao2019732.utils.HttpUitls;
import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/*
 *@Auther:Lenovo
 *@Date: 2019/7/3
 *@Time: 08:46:03
 *@Description:
 * */public class Tab1 extends BeasFragment {
     private Mylistview mylistview;
     private PullToRefreshScrollView pull;
     private HttpUitls uitls;
     private String str="http://blog.zhaoliang5156.cn/zixunnew/fengjing?page=";
     private int page=1;
    private List<Bean.DataBean.NewsBean> news=new ArrayList<>();
    private ArrayList<Bean.DataBean.NewsBean> list=new ArrayList<>();
    private MylisAdapter adapter;
    @Override
    public int setinLoyout() {
        return R.layout.tab1;
    }

    @Override
    public void intrView() {
        mylistview = getViewId(R.id.mylistvi);
        pull=getViewId(R.id.pull);
    }

    @Override
    public void intrData() {
        uitls = HttpUitls.getUitls();
        //上下拉
        pull.setMode(PullToRefreshScrollView.Mode.BOTH);
       //自定义一个方法
        getFadata();
    }

    private void getFadata() {
        uitls.getstAsynTack(str + page, new HttpUitls.getstBack() {

            @Override
            public void getData(String s) {

                Gson gson=new Gson();
                Bean bean = gson.fromJson(s, Bean.class);
                List<Bean.DataBean.NewsBean> listb = bean.data.news;
                news.addAll(listb);
                adapter = new MylisAdapter(news,getActivity());
                mylistview.setAdapter(adapter);
                adapter.notifyDataSetChanged();
                pull.onRefreshComplete();
            }
        });
    }

    @Override
    public void intrEnder() {
       pull.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ScrollView>() {
           @Override
           public void onPullDownToRefresh(PullToRefreshBase<ScrollView> pullToRefreshBase) {
              news.clear();
              page=1;
              getFadata();
           }

           @Override
           public void onPullUpToRefresh(PullToRefreshBase<ScrollView> pullToRefreshBase) {
              page++;
              getFadata();
           }
       });
       mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent=new Intent(getActivity(),LongActivity.class);
               startActivity(intent);
           }
       });
    }
}
