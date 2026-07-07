package com.android.internal.protolog;

public class ProtoLog {
    private static final java.lang.String LOG_TAG = "ProtoLog";
    private static final com.android.internal.protolog.common.IProtoLogGroup PROTOLOG_GROUP = null;
    @java.lang.Deprecated
    public static boolean REQUIRE_PROTOLOGTOOL;
    private static volatile com.android.internal.protolog.ProtoLogController sController;
    private static com.android.internal.protolog.ProtoLogDataSource sDataSource;
    private static final java.lang.Object sDataSourceLock = null;
    public ProtoLog() {}
    public static void d(com.android.internal.protolog.common.IProtoLogGroup p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void e(com.android.internal.protolog.common.IProtoLogGroup p0, java.lang.String p1, java.lang.Object... p2) {}
    public static com.android.internal.protolog.ProtoLogController getControllerInstanceForTest() { return null; }
    public static com.android.internal.protolog.ProtoLogDataSource getSharedSingleInstanceDataSource() { return null; }
    public static com.android.internal.protolog.ProtoLogDataSource getSharedSingleInstanceDataSource(boolean p0) { return null; }
    public static com.android.internal.protolog.common.IProtoLog getSingleInstance() { return null; }
    public static void i(com.android.internal.protolog.common.IProtoLogGroup p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void init(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    public static void initAsync(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    private static com.android.internal.protolog.common.IProtoLog initializeInstance(com.android.internal.protolog.common.IProtoLogGroup p0) { return null; }
    public static boolean isEnabled(com.android.internal.protolog.common.IProtoLogGroup p0, com.android.internal.protolog.common.LogLevel p1) { return false; }
    static boolean logOnlyToLogcat() { return false; }
    static boolean logOnlyToLogcat$ravenwood() { return false; }
    private static void logStringMessage(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, java.lang.String p2, java.lang.Object... p3) {}
    public static void registerLogGroupInProcess(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    public static void setControllerInstanceForTest(com.android.internal.protolog.ProtoLogController p0) {}
    public static void v(com.android.internal.protolog.common.IProtoLogGroup p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void w(com.android.internal.protolog.common.IProtoLogGroup p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void waitForInitialization() {}
    public static void wtf(com.android.internal.protolog.common.IProtoLogGroup p0, java.lang.String p1, java.lang.Object... p2) {}
}
