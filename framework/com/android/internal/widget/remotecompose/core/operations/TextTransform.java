package com.android.internal.widget.remotecompose.core.operations;

public class TextTransform extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "TextTransform";
    private static final int OP_CODE = 199;
    public static final int TEXT_CAPITALIZE = 4;
    public static final int TEXT_TO_LOWERCASE = 1;
    public static final int TEXT_TO_UPPERCASE = 2;
    public static final int TEXT_TRIM = 3;
    public static final int TEXT_UPPERCASE_FIRST_CHAR = 5;
    private float mLen;
    private final int mOperation = 0;
    private float mOutLen;
    private float mOutStart;
    private int mSrcId1;
    private float mStart;
    private int mTextId;
    public TextTransform(int p0, int p1, float p2, float p3, int p4) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, float p3, float p4, int p5) {}
    private static java.lang.String capitalizeFirstWord(java.lang.String p0) { return null; }
    private static java.lang.String capitalizeWords(java.lang.String p0) { return null; }
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
