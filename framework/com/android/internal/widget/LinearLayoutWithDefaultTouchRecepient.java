package com.android.internal.widget;

public class LinearLayoutWithDefaultTouchRecepient extends android.widget.LinearLayout {
    private android.view.View mDefaultTouchRecepient;
    private final android.graphics.Rect mTempRect = null;
    public LinearLayoutWithDefaultTouchRecepient(android.content.Context p0) { super((android.content.Context)null); }
    public LinearLayoutWithDefaultTouchRecepient(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public void setDefaultTouchRecepient(android.view.View p0) {}
}
