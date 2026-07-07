package com.android.internal.widget.remotecompose.core.operations.utilities.touch;

public class CommandParameters {
    public static final byte PA_FLOAT = 7;
    public static final byte PA_INT = 6;
    public static final byte PA_STRING = 8;
    public static final byte P_BOOLEAN = 5;
    public static final byte P_BYTE = 4;
    public static final byte P_FLOAT = 2;
    public static final byte P_INT = 1;
    public static final byte P_SHORT = 3;
    com.android.internal.widget.remotecompose.core.operations.utilities.touch.CommandParameters.Param[] mParams;
    int mParamsCount;
    public CommandParameters(com.android.internal.widget.remotecompose.core.operations.utilities.touch.CommandParameters.Param... p0) {}
    public static com.android.internal.widget.remotecompose.core.operations.utilities.touch.CommandParameters.Param param(java.lang.String p0, byte p1, byte p2) { return null; }
    public static com.android.internal.widget.remotecompose.core.operations.utilities.touch.CommandParameters.Param param(java.lang.String p0, byte p1, float p2) { return null; }
    public static com.android.internal.widget.remotecompose.core.operations.utilities.touch.CommandParameters.Param param(java.lang.String p0, byte p1, int p2) { return null; }
    public static com.android.internal.widget.remotecompose.core.operations.utilities.touch.CommandParameters.Param param(java.lang.String p0, byte p1, boolean p2) { return null; }
    public int countIfNotDefault(byte p0, float p1) { return 0; }
    public int countIfNotDefault(byte p0, int p1) { return 0; }
    public int countIfNotDefault(byte p0, boolean p1) { return 0; }
    public int getParamsCount() { return 0; }
    public boolean isDefault(byte p0, float p1) { return false; }
    public boolean isDefault(byte p0, int p1) { return false; }
    public boolean isDefault(byte p0, boolean p1) { return false; }
    public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, com.android.internal.widget.remotecompose.core.operations.utilities.touch.CommandParameters.Callback p1) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0, byte p1, byte p2) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0, byte p1, java.lang.String p2) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0, byte p1, float[] p2) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0, byte p1, int[] p2) {}
    public boolean write(com.android.internal.widget.remotecompose.core.WireBuffer p0, byte p1, float p2) { return false; }
    public boolean write(com.android.internal.widget.remotecompose.core.WireBuffer p0, byte p1, int p2) { return false; }
    public boolean write(com.android.internal.widget.remotecompose.core.WireBuffer p0, byte p1, boolean p2) { return false; }

    public static abstract class AbstractCallback implements com.android.internal.widget.remotecompose.core.operations.utilities.touch.CommandParameters.Callback {
        public AbstractCallback() {}
        public void value(int p0, byte p1) {}
        public void value(int p0, float p1) {}
        public void value(int p0, int p1) {}
        public void value(int p0, java.lang.String p1) {}
        public void value(int p0, short p1) {}
        public void value(int p0, boolean p1) {}
        public void value(int p0, float[] p1) {}
        public void value(int p0, int[] p1) {}
    }

    public static interface Callback {
        public void value(int p0, byte p1);
        public void value(int p0, float p1);
        public void value(int p0, int p1);
        public void value(int p0, java.lang.String p1);
        public void value(int p0, short p1);
        public void value(int p0, boolean p1);
        public void value(int p0, float[] p1);
        public void value(int p0, int[] p1);
    }

    public static class Param {
        boolean mDefaultBooleanValue;
        float mDefaultFloatValue;
        int mDefaultIntValue;
        byte mId;
        java.lang.String mName;
        byte mType;
        Param(java.lang.String p0, byte p1, byte p2) {}
        Param(java.lang.String p0, byte p1, float p2) {}
        Param(java.lang.String p0, byte p1, int p2) {}
        Param(java.lang.String p0, byte p1, boolean p2) {}
    }
}
