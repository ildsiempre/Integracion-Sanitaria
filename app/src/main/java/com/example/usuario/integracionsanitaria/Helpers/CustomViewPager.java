package com.example.usuario.integracionsanitaria.Helpers;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Switch;

import com.rey.material.widget.Slider;

/**
 * Created by Usuario on 11/04/2015.
 */
public class CustomViewPager extends ViewPager {
    public CustomViewPager(Context context, AttributeSet attributeSet){super(context,attributeSet);}

    public CustomViewPager(Context context){super(context);}

    protected boolean canScroll(View view,boolean checkV, int dx,int x,int y){
        return super.canScroll(view,checkV,dx,x,y)||(checkV && customCanScroll(view));
    }

    protected boolean customCanScroll(View view){
        if (view instanceof Slider || view instanceof Switch) return true;
        return false;
    }
}
