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
        for (int i = 0; i < 5; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setBackgroundResource(R.mipmap.ic_launcher);
            views.add(imageView);
        }

        viewPager.setAdapter(new MyPagerAdapter(views));
        //左右各多加载2页（默认1页）
        viewPager.setOffscreenPageLimit(2);
        viewPager.setPageMargin(20);
    }

}
