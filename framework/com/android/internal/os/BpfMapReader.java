package com.android.internal.os;

public class BpfMapReader {
    public static final int KEY_TYPE_INT32 = 0;
    public static final int KEY_TYPE_INT64 = 1;
    public static final int KEY_TYPE_NO_KEY = 3;
    public static final int KEY_TYPE_STRING = 2;
    public BpfMapReader() {}
    private static native boolean nativePullBpfMap(java.lang.String p0, android.os.Parcel p1);
    public static boolean pullBpfMap(java.lang.String p0, android.os.Parcel p1) { return false; }
}
