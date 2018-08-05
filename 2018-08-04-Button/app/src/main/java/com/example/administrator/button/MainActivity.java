package com.example.administrator.button;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/************************************************
* 第一种按键事件处理方法：添加XML属性
* 优点：更加便捷，代码量能够减少
* 缺点：每一次维护的时候都要去XML里面改源码，不好维护
* ***********************************************/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("myLog", "Hello Button!");
    }

    public void button1OnClcik(View view){
        Toast.makeText(MainActivity.this, "第一个按键事件处理方法：添加XML属性", 2000).show();
    }
}

/******************************************************************************************
* 第二种按键事件处理方法：匿名内部类
* 优点：
* 1）不需要重新写一个类，直接在new的时候去实现想实现的方法，很方便。
* 2）当别的地方都用不到这个方法的时候使用匿名内部类
* 3）高内聚，高内聚是设计原则之一，匿名内部类的特性之一就是拥有高内聚
* 缺点：
* 1）当别的地方也需要同样的一个方法时还要重新再在那个地方写一次匿名内部类，这样使得代码的冗余性很高。
* 2）不方便后期的维护
* ******************************************************************************************/
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Log.i("myLog", "Hello Button!");
//
//        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switch (view.getId()){
//                    case R.id.button2:
//                        Toast.makeText(MainActivity.this, "第二个按键事件处理方法：匿名内部类-1", 2000).show();
//                        break;
//                }
//            }
//        });
//    }
//}

/*****************************************************
 * 第三种按键事件处理方法：独立类（外部类）
 * 优点：
 * 1）一定情况下可以方便维护
 * 2）可以降低代码的冗余性，可以同时使用到多个地方
 * 缺点：
 * 1）当只使用一次时浪费资源，程序的性能不高
 * 2）当有很多个方法时，代码的可读性不高，此时不方便维护
 * ****************************************************/
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Log.i("myLog", "Hello Button!");
//
//        Button button3 = (Button) findViewById(R.id.button3);
//        button3.setOnClickListener(new ButtonOnClickListener(MainActivity.this));
//    }
//}
//
//class ButtonOnClickListener implements View.OnClickListener{
//
//    private Context context;
//
//    public ButtonOnClickListener(Context ct){
//        this.context = ct;
//    }
//
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.button3:
//                Toast.makeText(context, "第三个按键事件处理方法：独立类（外部类）", 2000).show();
//                break;
//        }
//    }
//}

/*****************************************************
 * 第四种按键事件处理方法：实现接口
 * 优缺点与独立类方式差不多
 * ****************************************************/
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Log.i("myLog", "Hello Button!");
//
//        Button button4 = (Button) findViewById(R.id.button4);
//        button4.setOnClickListener(MainActivity.this);
//    }
//
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.button4:
//                Toast.makeText(MainActivity.this, "第四个按键事件处理方法：实现接口", 2000).show();
//                break;
//        }
//    }
//}

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Log.i("myLog", "Hello Button!");
//    }
//
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        Toast.makeText(MainActivity.this, "keycode:" + keyCode + " keyAction:" + event.getAction(), 2000).show();
//        return super.onKeyDown(keyCode, event);
//    }
//}