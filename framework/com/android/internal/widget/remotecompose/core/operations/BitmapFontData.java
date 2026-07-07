package com.android.internal.widget.remotecompose.core.operations;

public class BitmapFontData extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "BitmapFontData";
    private static final int MAX_GLYPHS = 65535;
    private static final int MAX_KERNING_TABLE_SIZE = 65535;
    private static final int OP_CODE = 167;
    public static final short VERSION_1 = 0;
    public static final short VERSION_2 = 1;
    com.android.internal.widget.remotecompose.core.operations.BitmapFontData.Glyph[] mFontGlyphs;
    int mId;
    java.util.Map<java.lang.String, java.lang.Short> mKerningTable;
    short mVersion;
    public BitmapFontData(int p0, com.android.internal.widget.remotecompose.core.operations.BitmapFontData.Glyph[] p1) { super(); }
    public BitmapFontData(int p0, com.android.internal.widget.remotecompose.core.operations.BitmapFontData.Glyph[] p1, short p2, java.util.Map<java.lang.String, java.lang.Short> p3) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, com.android.internal.widget.remotecompose.core.operations.BitmapFontData.Glyph[] p2, java.util.Map<java.lang.String, java.lang.Short> p3) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public com.android.internal.widget.remotecompose.core.operations.BitmapFontData.Glyph lookupGlyph(java.lang.String p0, int p1) { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}

    public static class Glyph {
        public short mBitmapHeight;
        public int mBitmapId;
        public short mBitmapWidth;
        public java.lang.String mChars;
        public short mMarginBottom;
        public short mMarginLeft;
        public short mMarginRight;
        public short mMarginTop;
        public Glyph() {}
        public Glyph(java.lang.String p0, int p1, short p2, short p3, short p4, short p5, short p6, short p7) {}
    }
}
