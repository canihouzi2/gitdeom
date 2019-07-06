package com.bawei.jinhao2019732.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/*
 *@Auther:Lenovo
 *@Date: 2019/7/3
 *@Time: 08:50:13
 *@Description:
 * */public class HttpUitls {
     //单列模式
     private HttpUitls(){}
     private static HttpUitls uitls;
     public static HttpUitls getUitls(){//////////////////////////////////////////////////////////////////////////////////////////////////////////
         if (uitls==null){
             uitls=new HttpUitls();
         }
         return uitls;
     }
     //判断网络
    public boolean isNestad(Context context){
         ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getActiveNetworkInfo();
        if (info!=null){
            return true;
        }
        return false;
    }
    //网络请求数据
    public String getString(String strurl){
        HttpURLConnection connection=null;
         try {
             //将字符转换url
            URL url=new URL(strurl);
            //打开url
          connection = (HttpURLConnection) url.openConnection();
          //使用get请求
          connection.setRequestMethod("GET");
          //超时
          connection.setReadTimeout(5000);
          connection.setConnectTimeout(5000);
          //请求码
             int code = connection.getResponseCode();
             if (code==200){
                 //获取文件
                 InputStream stream = connection.getInputStream();
                 BufferedReader reader=new BufferedReader(new InputStreamReader(stream));
                //拼接字符串
                 StringBuffer buffer=new StringBuffer();
                 String str="";
                 while ((str=reader.readLine())!=null){
                     buffer.append(str);
                 }
                 //关流
                 stream.close();
                 connection.disconnect();
                 return buffer.toString();
             }
         } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public void getstAsynTack(String strurl,final getstBack back){
        new AsyncTask<String, Integer, String>() {
            @Override
            protected String doInBackground(String... strings) {
                return getString(strings[0]);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                back.getData(s);
            }
        }.execute(strurl);
    }
    //接口回调
    public interface getstBack{
         void getData(String s);
    }
    //图片请求
    public Bitmap getBitmap(String strurl){
        HttpURLConnection connection=null;
        Bitmap bitmap=null;
        try {
            //将字符转换url
            URL url=new URL(strurl);
            //打开url
            connection = (HttpURLConnection) url.openConnection();
            //使用get请求
            connection.setRequestMethod("GET");
            //超时
            connection.setReadTimeout(5000);
            connection.setConnectTimeout(5000);
            //请求码
            int code = connection.getResponseCode();
            if (code==200){
                //获取文件
                InputStream stream = connection.getInputStream();
                 bitmap = BitmapFactory.decodeStream(stream);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }
    public void getbiBitMap(String strurl,final getbiBack back){
        new AsyncTask<String, Integer, Bitmap>() {
            @Override
            protected Bitmap doInBackground(String... strings) {
                return getBitmap(strings[0]);
            }

            @Override
            protected void onPostExecute(Bitmap bitmap) {
                super.onPostExecute(bitmap);
                back.getData(bitmap);
            }
        }.execute(strurl);
    }
    public interface getbiBack{
         void getData(Bitmap bitmap);
    }
}
