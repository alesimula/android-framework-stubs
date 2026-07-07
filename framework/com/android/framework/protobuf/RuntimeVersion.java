package com.android.framework.protobuf;

public final class RuntimeVersion {
    public static final com.android.framework.protobuf.RuntimeVersion.RuntimeDomain DOMAIN = null;
    public static final int MAJOR = 4;
    private static final int MAX_WARNING_COUNT = 20;
    public static final int MINOR = 33;
    public static final com.android.framework.protobuf.RuntimeVersion.RuntimeDomain OSS_DOMAIN = null;
    public static final int OSS_MAJOR = 4;
    public static final int OSS_MINOR = 33;
    public static final int OSS_PATCH = 5;
    public static final java.lang.String OSS_SUFFIX = "";
    public static final int PATCH = 5;
    public static final java.lang.String SUFFIX = "";
    private static final java.lang.String VERSION_STRING = null;
    private static final java.util.logging.Logger logger = null;
    static int majorWarningLoggedCount;
    static int minorWarningLoggedCount;
    static boolean preleaseRuntimeWarningLogged;
    private RuntimeVersion() {}
    private static boolean checkDisabled() { return false; }
    public static void validateProtobufGencodeVersion(com.android.framework.protobuf.RuntimeVersion.RuntimeDomain p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5) {}
    private static void validateProtobufGencodeVersionImpl(com.android.framework.protobuf.RuntimeVersion.RuntimeDomain p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5) {}
    private static java.lang.String versionString(int p0, int p1, int p2, java.lang.String p3) { return null; }

    public static final class ProtobufRuntimeVersionException extends java.lang.RuntimeException {
        public ProtobufRuntimeVersionException(java.lang.String p0) { super(); }
    }

    public static enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC;
        private static final com.android.framework.protobuf.RuntimeVersion.RuntimeDomain[] $VALUES = null;
        private RuntimeDomain() {}
    }
}
