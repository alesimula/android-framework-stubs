package android.util;

public class Xml {
    public static final boolean ENABLE_BINARY_DEFAULT = Boolean.valueOf(false);
    public static final boolean ENABLE_RESOLVE_OPTIMIZATIONS = Boolean.valueOf(false);
    public static java.lang.String FEATURE_RELAXED;
    private Xml() {}
    public static android.util.AttributeSet asAttributeSet(org.xmlpull.v1.XmlPullParser p0) { return null; }
    public static void copy(org.xmlpull.v1.XmlPullParser p0, org.xmlpull.v1.XmlSerializer p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static android.util.Xml.Encoding findEncodingByName(java.lang.String p0) throws java.io.UnsupportedEncodingException { return null; }
    public static com.android.modules.utils.TypedXmlPullParser newBinaryPullParser() { return null; }
    public static com.android.modules.utils.TypedXmlPullParser newBinaryPullParser$ravenwood() { return null; }
    public static com.android.modules.utils.TypedXmlSerializer newBinarySerializer() { return null; }
    public static com.android.modules.utils.TypedXmlSerializer newBinarySerializer$ravenwood() { return null; }
    public static com.android.modules.utils.TypedXmlPullParser newFastPullParser() { return null; }
    public static com.android.modules.utils.TypedXmlSerializer newFastSerializer() { return null; }
    public static org.xmlpull.v1.XmlPullParser newPullParser() { return null; }
    public static org.xmlpull.v1.XmlPullParser newPullParser$ravenwood() { return null; }
    public static org.xmlpull.v1.XmlSerializer newSerializer() { return null; }
    private static org.xml.sax.XMLReader newXMLReader() { return null; }
    private static org.xml.sax.XMLReader newXMLReader$ravenwood() { return null; }
    private static org.xmlpull.v1.XmlPullParser newXmlPullParser() { return null; }
    private static org.xmlpull.v1.XmlPullParser newXmlPullParser$ravenwood() { return null; }
    private static org.xmlpull.v1.XmlSerializer newXmlSerializer() { return null; }
    private static org.xmlpull.v1.XmlSerializer newXmlSerializer$ravenwood() { return null; }
    private static java.lang.String normalizeNamespace(java.lang.String p0) { return null; }
    public static void parse(java.io.InputStream p0, android.util.Xml.Encoding p1, org.xml.sax.ContentHandler p2) throws java.io.IOException, org.xml.sax.SAXException {}
    public static void parse(java.io.Reader p0, org.xml.sax.ContentHandler p1) throws java.io.IOException, org.xml.sax.SAXException {}
    public static void parse(java.lang.String p0, org.xml.sax.ContentHandler p1) throws org.xml.sax.SAXException {}
    public static com.android.modules.utils.TypedXmlPullParser resolvePullParser(java.io.InputStream p0) throws java.io.IOException { return null; }
    public static com.android.modules.utils.TypedXmlSerializer resolveSerializer(java.io.OutputStream p0) throws java.io.IOException { return null; }
    public static com.android.modules.utils.TypedXmlSerializer resolveSerializer$ravenwood(java.io.OutputStream p0) throws java.io.IOException { return null; }
    private static boolean shouldEnableBinaryDefault() { return false; }
    private static boolean shouldEnableBinaryDefault$ravenwood() { return false; }
    private static boolean shouldEnableResolveOptimizations() { return false; }
    private static boolean shouldEnableResolveOptimizations$ravenwood() { return false; }

    public static enum Encoding {
        ISO_8859_1,
        US_ASCII,
        UTF_16,
        UTF_8;
        private static final android.util.Xml.Encoding[] $VALUES = null;
        final java.lang.String expatName = null;
        private Encoding() {}
    }
}
