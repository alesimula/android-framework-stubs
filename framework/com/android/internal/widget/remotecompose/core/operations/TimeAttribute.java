package com.android.internal.widget.remotecompose.core.operations;

public class TimeAttribute extends com.android.internal.widget.remotecompose.core.PaintOperation {
    private static final java.lang.String CLASS_NAME = "TimeAttribute";
    private static final short MAX_ARG_LEN = 32;
    private static final int OP_CODE = 172;
    public static final short TIME_DAY_OF_MONTH = 9;
    public static final short TIME_DAY_OF_WEEK = 11;
    public static final short TIME_DAY_OF_YEAR = 15;
    public static final short TIME_FROM_ARG_HR = 5;
    public static final short TIME_FROM_ARG_MIN = 4;
    public static final short TIME_FROM_ARG_SEC = 3;
    public static final short TIME_FROM_LOAD_SEC = 14;
    public static final short TIME_FROM_NOW_HR = 2;
    public static final short TIME_FROM_NOW_MIN = 1;
    public static final short TIME_FROM_NOW_SEC = 0;
    public static final short TIME_IN_HR = 8;
    public static final short TIME_IN_MIN = 7;
    public static final short TIME_IN_SEC = 6;
    public static final short TIME_MONTH_VALUE = 10;
    public static final short TIME_YEAR = 12;
    private final int[] mArgs = null;
    public int mId;
    public int mTimeId;
    public short mType;
    public TimeAttribute(int p0, int p1, short p2, int[] p3) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, short p3) {}
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, short p3, int[] p4) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private java.lang.String getTypeString() { return null; }
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
