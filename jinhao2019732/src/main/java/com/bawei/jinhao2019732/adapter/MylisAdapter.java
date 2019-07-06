package com.bawei.jinhao2019732.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.jinhao2019732.R;
import com.bawei.jinhao2019732.bean.Bean;
import com.bawei.jinhao2019732.bean.Bean1;
import com.bumptech.glide.Glide;

import java.util.List;

/*
 *@Auther:Lenovo
 *@Date: 2019/7/3
 *@Time: 09:43:50
 *@Description:
 * */public class MylisAdapter extends BaseAdapter {
    private List<Bean.DataBean.NewsBean> list;
    private Context context;

    public MylisAdapter(List<Bean.DataBean.NewsBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
         switch (getItemViewType(position)){
             case 0:
                 ViewHolder holder;
                 if (convertView==null){
                     convertView=View.inflate(context, R.layout.item,null);
                     holder=new ViewHolder();
                     holder.item_iam=convertView.findViewById(R.id.item_imag);
                     holder.item_tete=convertView.findViewById(R.id.item_tete);
                     holder.item_tete1=convertView.findViewById(R.id.item_tete1);
                     convertView.setTag(holder);
                 }else {
                     holder= (ViewHolder) convertView.getTag();
                 }
                 holder.item_tete.setText(list.get(position).title);
                 holder.item_tete1.setText(list.get(position).publishAt);
                 Glide.with(context).load("http://blog.zhaoliang5156.cn/zixunnew/"+list.get(position).imageUrl).into(holder.item_iam);
                 break;
             case 1:
                 ViewHolder1 holder1;
                 if (convertView==null){
                     convertView=View.inflate(context, R.layout.item1,null);
                     holder1=new ViewHolder1();
                     holder1.item1_iam=convertView.findViewById(R.id.item1_imag);
                     holder1.item1_tete=convertView.findViewById(R.id.item1_tete);
                     holder1.item1_tete1=convertView.findViewById(R.id.item1_tete1);
                     convertView.setTag(holder1);
                 }else {
                     holder1= (ViewHolder1) convertView.getTag();
                 }
                 holder1.item1_tete.setText(list.get(position).title);
                 holder1.item1_tete1.setText(list.get(position).publishAt);
                 Glide.with(context).load("http://blog.zhaoliang5156.cn/zixunnew/"+list.get(position).imageUrl).into(holder1.item1_iam);
                 break;
         }

        return convertView;
    }
    //寄存器
    static class ViewHolder{
        ImageView item_iam;
        TextView item_tete,item_tete1;
    }
    //寄存器
    static class ViewHolder1{
        ImageView item1_iam;
        TextView item1_tete,item1_tete1;
    }
    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return position%2;
    }
}
