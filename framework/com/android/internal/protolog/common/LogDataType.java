package com.android.internal.protolog.common;

public class LogDataType {
    public static final int BOOLEAN = 3;
    public static final int DOUBLE = 2;
    public static final int LONG = 1;
    public static final int STRING = 0;
    private static final int TYPE_MASK = 3;
    private static final int TYPE_WIDTH = 2;
    public LogDataType() {}
    public static int bitmaskToLogDataType(long p0, int p1) { return 0; }
    public static long logDataTypesToBitMask(java.util.List<java.lang.Integer> p0) { return 0L; }
    public static java.util.List<java.lang.Integer> parseFormatString(java.lang.String p0) { return null; }
}
