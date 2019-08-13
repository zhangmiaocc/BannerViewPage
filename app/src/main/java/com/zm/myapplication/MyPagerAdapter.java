package com.zm.myapplication;

import android.view.View;
import android.view.ViewGroup;

import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

/**
 * Created by AZZ on 15/10/8.
 */
public class MyPagerAdapter extends PagerAdapter {

    protected List<View> views;

    public MyPagerAdapter(List<View> viewList) {
        views = viewList;
    }

    @Override
    public int getCount() {
        return views.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(views.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(views.get(position));
        return views.get(position);
    }

    @Override
    public float getPageWidth(int position) {
//        if (position < (views.size() - 1)) {
//            return 0.8f;
//        }
        return 0.8f;
    }
}
