package com.android.internal.widget.remotecompose.core.operations.utilities;

public interface ArrayAccess {
    public float getFloatValue(int p0);
    public float[] getFloats();
    default public int getId(int p0) { return 0; }
    default public int getIntValue(int p0) { return 0; }
    public int getLength();
}
