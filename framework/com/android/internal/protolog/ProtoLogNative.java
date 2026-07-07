package com.android.internal.protolog;

public final class ProtoLogNative {
    private static final java.lang.String LOG_TAG = "ProtoLogNative";
    public static final int PERFETTO_BACKEND_IN_PROCESS = 1;
    public static final int PERFETTO_BACKEND_SYSTEM = 2;
    public static final int PROTO_LOG_LEVEL_DEBUG = 2;
    public static final int PROTO_LOG_LEVEL_ERROR = 5;
    public static final int PROTO_LOG_LEVEL_INFO = 3;
    public static final int PROTO_LOG_LEVEL_UNDEFINED = 0;
    public static final int PROTO_LOG_LEVEL_VERBOSE = 1;
    public static final int PROTO_LOG_LEVEL_WARN = 4;
    public static final int PROTO_LOG_LEVEL_WTF = 6;
    private static boolean sInitialized;
    private static final java.util.Set<com.android.internal.protolog.ProtoLogNative.NativeDataSourceListener> sListeners = null;
    private static final java.lang.ThreadLocal<com.android.internal.protolog.ProtoLogNative.ThreadBuffer> sThreadBuffer = null;
    public ProtoLogNative() {}
    public static void init() {}
    public static void init(int p0) {}
    private static native void log(int p0, java.lang.String p1, long p2, long p3, int p4, long[] p5, java.lang.Object[] p6);
    public static void log(int p0, java.lang.String p1, long p2, long p3, java.lang.Object... p4) {}
    private static native void log(int p0, java.lang.String p1, java.lang.String p2, long p3, int p4, long[] p5, java.lang.Object[] p6);
    public static void log(int p0, java.lang.String p1, java.lang.String p2, java.lang.Object... p3) {}
    private static native void nativeInit(int p0);
    public static void onTracingInstanceStart(java.lang.String p0, int p1, byte[] p2) {}
    public static void onTracingInstanceStop(java.lang.String p0, int p1, byte[] p2) {}
    public static void registerListener(com.android.internal.protolog.ProtoLogNative.NativeDataSourceListener p0) {}
    public static native void setThreadLocalTestDataSourceActive(boolean p0);
    public static void unregisterListener(com.android.internal.protolog.ProtoLogNative.NativeDataSourceListener p0) {}

    public static interface NativeDataSourceListener {
        public void onTracingInstanceStart(java.lang.String p0, int p1, byte[] p2);
        public void onTracingInstanceStop(java.lang.String p0, int p1, byte[] p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProtoLogLevel {
    }

    private static class ThreadBuffer {
        final long[] mPrimitiveArgs = null;
        final java.lang.Object[] mStringArgs = null;
        private ThreadBuffer() {}
    }
}
