package com.android.internal.widget.remotecompose.core.operations;

public class BitmapData extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.SerializableToString, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "BitmapData";
    public static final short ENCODING_EMPTY = 3;
    public static final short ENCODING_FILE = 2;
    public static final short ENCODING_INLINE = 0;
    public static final short ENCODING_URL = 1;
    private static final int OP_CODE = 101;
    public static final short TYPE_PNG = 1;
    public static final short TYPE_PNG_8888 = 0;
    public static final short TYPE_PNG_ALPHA_8 = 4;
    public static final short TYPE_RAW8 = 2;
    public static final short TYPE_RAW8888 = 3;
    byte[] mBitmap;
    short mEncoding;
    int mImageHeight;
    public final int mImageId = 0;
    int mImageWidth;
    short mType;
    public BitmapData(int p0, int p1, int p2, byte[] p3) { super(); }
    public BitmapData(int p0, short p1, short p2, short p3, short p4, byte[] p5) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, byte[] p4) {}
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, short p2, short p3, short p4, short p5, byte[] p6) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private java.lang.String getEncodingString(short p0) { return null; }
    private java.lang.String getImageTypeString(short p0) { return null; }
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public int getHeight() { return 0; }
    public int getType() { return 0; }
    public int getWidth() { return 0; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public java.lang.String toString() { return null; }
    public void update(com.android.internal.widget.remotecompose.core.operations.BitmapData p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
