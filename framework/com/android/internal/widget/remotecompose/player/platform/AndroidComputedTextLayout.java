package com.android.internal.widget.remotecompose.player.platform;

public class AndroidComputedTextLayout implements com.android.internal.widget.remotecompose.core.RcPlatformServices.ComputedTextLayout {
    float mHeight;
    boolean mIsHyphenatedText;
    int mLineCount;
    android.text.StaticLayout mStaticLayout;
    float mWidth;
    public AndroidComputedTextLayout(android.text.StaticLayout p0, float p1, float p2, int p3, boolean p4) {}
    public android.text.StaticLayout get() { return null; }
    public float getHeight() { return 0.0f; }
    public int getVisibleLineCount() { return 0; }
    public float getWidth() { return 0.0f; }
    public boolean isHyphenatedText() { return false; }
    public void set(android.text.StaticLayout p0) {}
}
