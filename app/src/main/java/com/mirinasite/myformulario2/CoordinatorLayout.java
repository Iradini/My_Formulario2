package com.mirinasite.myformulario2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;

public abstract class CoordinatorLayout extends ViewGroup implements NestedScrollingParent3 {
    public CoordinatorLayout(Context context) {
        super(context);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    @Override
    public abstract boolean onStartNestedScroll(View child, View target, int axes, int type);

    @Override
    public abstract void onNestedScrollAccepted(View child, View target, int axes, int type);

    @Override
    public abstract void onStopNestedScroll(View target, int type);

    @Override
    public void onNestedScroll(@NonNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {

    }

    @Override
    public void onNestedPreScroll(@NonNull View target, int dx, int dy, @NonNull int[] consumed, int type) {

    }

    @Override
    public void onNestedScroll(@NonNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, @NonNull int[] consumed) {

    }

    public interface AttachedBehavior {
    }
}
