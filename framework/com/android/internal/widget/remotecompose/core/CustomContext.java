package com.android.internal.widget.remotecompose.core;

public interface CustomContext {
    public static final int TOUCH_DOWN = 0;
    public static final int TOUCH_DRAG = 1;
    public static final int TOUCH_UP = 2;
    public void configureCustom(int p0, int p1, float p2);
    public void configureCustom(int p0, int p1, int p2);
    public void configureCustom(int p0, int p1, java.lang.String p2);
    public void createCustom(int p0, java.lang.String p1);
    public void drawCustom(int p0);
    public void layoutCustom(int p0, float[] p1);
    public void measureCustom(int p0, float[] p1);
    public boolean touchCustom(int p0, int p1, float p2, float p3);
}
