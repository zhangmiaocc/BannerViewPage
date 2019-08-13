package com.zm.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.viewpager);
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) viewPager.getLayoutParams();

        int width = ScreenUtils.getScreenWidth(MainActivity.this);
        params.height = (int) (width * 1.3);//设置当前控件布局的高度width是屏幕宽度
        viewPager.setLayoutParams(params);//将设置好的布局参数应用到控件中

        List<View> views = new ArrayList<View>();
        ImageView imageView1 = new ImageView(this);
        imageView1.setBackgroundResource(R.mipmap.image142);

        ImageView imageView2 = new ImageView(this);
        imageView2.setBackgroundResource(R.mipmap.image143);

        ImageView imageView3 = new ImageView(this);
        imageView3.setBackgroundResource(R.mipmap.image144);

        ImageView imageView4 = new ImageView(this);
        imageView4.setBackgroundResource(R.mipmap.image145);

        ImageView imageView5 = new ImageView(this);
        imageView5.setBackgroundResource(R.mipmap.image146);


        views.add(imageView1);
        views.add(imageView2);
        views.add(imageView3);
        views.add(imageView4);
        views.add(imageView5);
        viewPager.setAdapter(new MyPagerAdapter(views));
        //左右各多加载2页（默认1页）
        viewPager.setOffscreenPageLimit(2);
        viewPager.setPageMargin(20);
    }

}
