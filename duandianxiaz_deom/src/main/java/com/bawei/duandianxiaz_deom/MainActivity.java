package com.bawei.duandianxiaz_deom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bawei.duandianxiaz_deom.dodwmoad.FileInfo;
import com.bawei.duandianxiaz_deom.service.DowloadService;

public class MainActivity extends AppCompatActivity {
     private TextView textView;
     private ProgressBar progressBar;
     private Button but,but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化组件
        textView=findViewById(R.id.teex);
        but=findViewById(R.id.but);
        but1=findViewById(R.id.but1);
        progressBar=findViewById(R.id.progress);
        //创建文件对象信息
        final FileInfo fileInfo = new FileInfo(0,
                "https://dldir1.qq.com/music/clntupate/",
                "QQMusic_YQQLogin.exe",
                0,
                0
                );
        //点击监听事件
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DowloadService.class);
                 intent.setAction(DowloadService.ACTION_START);
                 intent.putExtra("fileInfo",fileInfo);
                startService(intent);
            }

        });
    }
}
