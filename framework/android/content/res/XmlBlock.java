package android.content.res;

public final class XmlBlock implements java.lang.AutoCloseable {
    public static final java.lang.String ANDROID_RESOURCES = "http://schemas.android.com/apk/res/android";
    private static final boolean DEBUG = false;
    private static final int ERROR_BAD_DOCUMENT = Integer.valueOf(0);
    private static final int ERROR_NULL_DOCUMENT = -2147483640;
    private final android.content.res.AssetManager mAssets = null;
    private long mNative;
    private boolean mOpen;
    private int mOpenCount;
    final android.content.res.StringBlock mStrings = null;
    private final boolean mUsesFeatureFlags = false;
    XmlBlock(android.content.res.AssetManager p0, long p1, boolean p2) {}
    public XmlBlock(byte[] p0) {}
    public XmlBlock(byte[] p0, int p1, int p2) {}
    private void decOpenCountLocked() {}
    private static final native long nativeCreate(byte[] p0, int p1, int p2);
    private static final native long nativeCreateParseState(long p0, int p1);
    private static final native void nativeDestroy(long p0);
    private static final native void nativeDestroyParseState(long p0);
    private static final native int nativeGetAttributeCount(long p0);
    private static final native int nativeGetAttributeData(long p0, int p1);
    private static final native int nativeGetAttributeDataType(long p0, int p1);
    private static native int nativeGetAttributeIndex(long p0, java.lang.String p1, java.lang.String p2);
    private static final native int nativeGetAttributeName(long p0, int p1);
    private static final native int nativeGetAttributeNamespace(long p0, int p1);
    private static final native int nativeGetAttributeResource(long p0, int p1);
    private static final native int nativeGetAttributeStringValue(long p0, int p1);
    private static final native int nativeGetClassAttribute(long p0);
    private static final native android.content.res.XmlBlock.FlagInfo nativeGetFlagInfo(long p0);
    private static final native int nativeGetIdAttribute(long p0);
    private static final native int nativeGetLineNumber(long p0);
    static final native int nativeGetName(long p0);
    private static final native int nativeGetNamespace(long p0);
    private static final native int nativeGetSourceResId(long p0);
    private static final native long nativeGetStringBlock(long p0);
    private static final native int nativeGetStyleAttribute(long p0);
    private static final native int nativeGetText(long p0);
    static final native int nativeNext(long p0);
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public android.content.res.XmlResourceParser newParser() { return null; }
    public android.content.res.XmlResourceParser newParser(int p0) { return null; }
    public android.content.res.XmlResourceParser newParser(int p0, android.content.res.Validator p1) { return null; }

    private static class FlagInfo {
        private int mNameIndex;
        private boolean mNegated;
        private FlagInfo(int p0, boolean p1) {}
    }

    public final class Parser implements android.content.res.XmlResourceParser {
        private final android.content.res.XmlBlock mBlock = null;
        private boolean mDecNextDepth;
        private int mDepth;
        private int mEventType;
        long mParseState;
        private boolean mStarted;
        android.content.res.Validator mValidator;
        Parser(android.content.res.XmlBlock p0, long p1, android.content.res.XmlBlock p2) {}
        Parser(android.content.res.XmlBlock p0, long p1, android.content.res.XmlBlock p2, android.content.res.Validator p3) {}
        private java.lang.String getSequenceString(java.lang.CharSequence p0) { return null; }
        public void close() {}
        public void defineEntityReplacementText(java.lang.String p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException {}
        protected void finalize() throws java.lang.Throwable {}
        public boolean getAttributeBooleanValue(int p0, boolean p1) { return false; }
        public boolean getAttributeBooleanValue(java.lang.String p0, java.lang.String p1, boolean p2) { return false; }
        public int getAttributeCount() { return 0; }
        public float getAttributeFloatValue(int p0, float p1) { return 0.0f; }
        public float getAttributeFloatValue(java.lang.String p0, java.lang.String p1, float p2) { return 0.0f; }
        public int getAttributeIntValue(int p0, int p1) { return 0; }
        public int getAttributeIntValue(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
        public int getAttributeListValue(int p0, java.lang.String[] p1, int p2) { return 0; }
        public int getAttributeListValue(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, int p3) { return 0; }
        public java.lang.String getAttributeName(int p0) { return null; }
        public int getAttributeNameResource(int p0) { return 0; }
        public java.lang.String getAttributeNamespace(int p0) { return null; }
        public java.lang.String getAttributePrefix(int p0) { return null; }
        public int getAttributeResourceValue(int p0, int p1) { return 0; }
        public int getAttributeResourceValue(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
        public java.lang.String getAttributeType(int p0) { return null; }
        public int getAttributeUnsignedIntValue(int p0, int p1) { return 0; }
        public int getAttributeUnsignedIntValue(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
        public java.lang.String getAttributeValue(int p0) { return null; }
        public java.lang.String getAttributeValue(java.lang.String p0, java.lang.String p1) { return null; }
        public java.lang.String getClassAttribute() { return null; }
        public int getColumnNumber() { return 0; }
        public int getDepth() { return 0; }
        public int getEventType() throws org.xmlpull.v1.XmlPullParserException { return 0; }
        public boolean getFeature(java.lang.String p0) { return false; }
        public java.lang.String getIdAttribute() { return null; }
        public int getIdAttributeResourceValue(int p0) { return 0; }
        public java.lang.String getInputEncoding() { return null; }
        public int getLineNumber() { return 0; }
        public java.lang.String getName() { return null; }
        public java.lang.String getNamespace() { return null; }
        public java.lang.String getNamespace(java.lang.String p0) { return null; }
        public int getNamespaceCount(int p0) throws org.xmlpull.v1.XmlPullParserException { return 0; }
        public java.lang.String getNamespacePrefix(int p0) throws org.xmlpull.v1.XmlPullParserException { return null; }
        public java.lang.String getNamespaceUri(int p0) throws org.xmlpull.v1.XmlPullParserException { return null; }
        final java.lang.CharSequence getPooledString(int p0) { return null; }
        public java.lang.String getPositionDescription() { return null; }
        public java.lang.String getPrefix() { return null; }
        public java.lang.Object getProperty(java.lang.String p0) { return null; }
        public int getSourceResId() { return 0; }
        public int getStyleAttribute() { return 0; }
        public java.lang.String getText() { return null; }
        public char[] getTextCharacters(int[] p0) { return null; }
        public boolean isAttributeDefault(int p0) { return false; }
        public boolean isEmptyElementTag() throws org.xmlpull.v1.XmlPullParserException { return false; }
        public boolean isWhitespace() throws org.xmlpull.v1.XmlPullParserException { return false; }
        public int next() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return 0; }
        public int nextTag() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return 0; }
        public java.lang.String nextText() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
        public int nextToken() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return 0; }
        public void require(int p0, java.lang.String p1, java.lang.String p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
        public void setFeature(java.lang.String p0, boolean p1) throws org.xmlpull.v1.XmlPullParserException {}
        public void setInput(java.io.InputStream p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException {}
        public void setInput(java.io.Reader p0) throws org.xmlpull.v1.XmlPullParserException {}
        public void setProperty(java.lang.String p0, java.lang.Object p1) throws org.xmlpull.v1.XmlPullParserException {}
    }
}
