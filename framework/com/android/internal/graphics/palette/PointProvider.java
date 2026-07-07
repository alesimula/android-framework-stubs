package com.android.internal.graphics.palette;

public interface PointProvider {
    public float distance(float[] p0, float[] p1);
    public float[] fromInt(int p0);
    public int toInt(float[] p0);
}
