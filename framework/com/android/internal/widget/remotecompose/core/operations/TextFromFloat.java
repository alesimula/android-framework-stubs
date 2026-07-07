package com.android.internal.widget.remotecompose.core.operations;

public class TextFromFloat extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable, com.android.internal.widget.remotecompose.core.operations.ComponentData {
    private static final java.lang.String CLASS_NAME = "TextFromFloat";
    public static final int FULL_FORMAT = 4096;
    public static final int GROUPING_BY3 = 16;
    public static final int GROUPING_BY32 = 48;
    public static final int GROUPING_BY4 = 32;
    public static final int GROUPING_NONE = 0;
    public static final int LEGACY_MODE = 1024;
    public static final int OPTIONS_NEGATIVE_PARENTHESES = 256;
    public static final int OPTIONS_NONE = 0;
    public static final int OPTIONS_ROUNDING = 512;
    private static final int OP_CODE = 135;
    public static final int PAD_AFTER_NONE = 1;
    public static final int PAD_AFTER_SPACE = 0;
    public static final int PAD_AFTER_ZERO = 3;
    public static final int PAD_PRE_NONE = 4;
    public static final int PAD_PRE_SPACE = 0;
    public static final int PAD_PRE_ZERO = 12;
    public static final int SEPARATOR_COMMA_PERIOD = 0;
    public static final int SEPARATOR_PERIOD_COMMA = 64;
    public static final int SEPARATOR_SPACE_COMMA = 128;
    public static final int SEPARATOR_UNDER_PERIOD = 192;
    char mAfter;
    public short mDigitsAfter;
    public short mDigitsBefore;
    public int mFlags;
    boolean mFullFormat;
    byte mGroup;
    public boolean mLegacy;
    int mOptions;
    public float mOutValue;
    char mPre;
    byte mSeparator;
    public int mTextId;
    public float mValue;
    public TextFromFloat(int p0, float p1, short p2, short p3, int p4) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, short p3, short p4, int p5) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
