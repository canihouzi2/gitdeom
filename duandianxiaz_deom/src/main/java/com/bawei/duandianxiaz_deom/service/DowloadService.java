package com.bawei.duandianxiaz_deom.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.bawei.duandianxiaz_deom.dodwmoad.FileInfo;

/*
 *@Auther:Lenovo
 *@Date: 2019/7/4
 *@Time: 11:02:34
 *@Description:
 * */public class DowloadService extends Service {
    public static final String ACTION_START="ACTION_START";
    public static final String ACTION_STOP="ACTION_STOP";
     @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
         if (ACTION_START.equals(intent.getAction())){
           FileInfo fileInfo = (FileInfo) intent.getSerializableExtra("fileinfo");
             Log.i("Start",fileInfo.toString());
         }else if (ACTION_STOP.equals(intent.getAction())){
             FileInfo fileInfo = (FileInfo) intent.getSerializableExtra("fileinfo");
             Log.i("Stop",fileInfo.toString());
         }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
