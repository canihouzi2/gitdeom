package com.bawei.jinhao2019732;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bawei.jinhao2019732.adapter.FragAdapter;
import com.bawei.jinhao2019732.bean.ShopBean;
import com.bawei.jinhao2019732.beas.BeasActivity;
import com.bawei.jinhao2019732.tab.Tab1;
import com.bawei.jinhao2019732.tab.Tab2;
import com.bawei.jinhao2019732.tab.Tab3;
import com.bawei.jinhao2019732.tab.Tab4;
import com.bawei.jinhao2019732.tab.Tab5;
import com.bawei.jinhao2019732.tab.Tab6;
import com.bawei.jinhao2019732.tab.Tab7;
import com.bawei.jinhao2019732.utils.HttpUitls;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BeasActivity {
    private TabLayout table;
    private ViewPager viewPager;
    private List<Fragment> flist;
    private List<String> slist;
    private ImageView imageView;
    private String str="http://blog.zhaoliang5156.cn/zixunnew/categories";
    private HttpUitls uitls;

    @Override
    public int setinLoyout() {
        return R.layout.activity_main;
    }

    @Override
    public void intrView() {
        imageView=findViewById(R.id.iam);
        table=findViewById(R.id.teble);
        viewPager=findViewById(R.id.viewpa);
    }

    @Override
    public void intrData() {
        uitls = HttpUitls.getUitls();
        boolean nestad = uitls.isNestad(MainActivity.this);
        if (nestad){
            Toast.makeText(this, "有网", Toast.LENGTH_SHORT).show();
             uitls.getstAsynTack(str, new HttpUitls.getstBack() {
                 @Override
                 public void getData(String s) {
                     Gson gson=new Gson();
                     ShopBean bean = gson.fromJson(s, ShopBean.class);
                     List<ShopBean.ResultBean> result = bean.result;
                     flist=new ArrayList<>();
                     slist=new ArrayList<>();
                     for (int i = 0; i <result.get(0).children.size() ; i++) {
                         String title = result.get(0).children.get(i).title;
                         slist.add(title);
                     }
                     flist.add(new Tab1());
                     flist.add(new Tab2());
                     flist.add(new Tab3());
                     flist.add(new Tab4());
                     flist.add(new Tab5());
                     flist.add(new Tab6());
                     flist.add(new Tab7());
                     FragAdapter adapter=new FragAdapter(getSupportFragmentManager(),flist,slist);
                     viewPager.setAdapter(adapter);
                     table.setupWithViewPager(viewPager);
                 }
             });
        }else {
            Toast.makeText(this, "没有有网", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void intrEnder() {
       imageView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Intent.ACTION_PICK);
               intent.setType("image/*");
               startActivityForResult(intent,1);
           }
       });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode==RESULT_OK){
            switch (requestCode){
                case 1:
                    Uri uri = data.getData();
                    Glide.with(MainActivity.this).load(uri).into(imageView);
                    break;
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
