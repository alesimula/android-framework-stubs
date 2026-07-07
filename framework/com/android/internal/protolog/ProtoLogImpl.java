package com.android.internal.protolog;

public class ProtoLogImpl {
    private static final java.lang.String LOG_TAG = "ProtoLogImpl";
    private static com.android.internal.protolog.ProtoLogCacheUpdater sCacheUpdater;
    private static java.util.TreeMap<java.lang.String, com.android.internal.protolog.common.IProtoLogGroup> sLogGroups;
    private static com.android.internal.protolog.common.IProtoLog sServiceInstance;
    private static java.lang.String sViewerConfigPath;
    public ProtoLogImpl() {}
    public static void d(com.android.internal.protolog.common.IProtoLogGroup p0, long p1, long p2, java.lang.Object... p3) {}
    public static void e(com.android.internal.protolog.common.IProtoLogGroup p0, long p1, long p2, java.lang.Object... p3) {}
    public static com.android.internal.protolog.common.IProtoLog getSingleInstance() { return null; }
    public static void i(com.android.internal.protolog.common.IProtoLogGroup p0, long p1, long p2, java.lang.Object... p3) {}
    private static boolean isEnabled(com.android.internal.protolog.common.IProtoLog p0, com.android.internal.protolog.common.IProtoLogGroup p1, com.android.internal.protolog.common.LogLevel p2) { return false; }
    public static boolean isEnabled(com.android.internal.protolog.common.IProtoLogGroup p0, com.android.internal.protolog.common.LogLevel p1) { return false; }
    public static void setSingleInstance(com.android.internal.protolog.common.IProtoLog p0) {}
    public static void v(com.android.internal.protolog.common.IProtoLogGroup p0, long p1, long p2, java.lang.Object... p3) {}
    public static void w(com.android.internal.protolog.common.IProtoLogGroup p0, long p1, long p2, java.lang.Object... p3) {}
    public static void wtf(com.android.internal.protolog.common.IProtoLogGroup p0, long p1, long p2, java.lang.Object... p3) {}
}
