package android.content;

public final class UriRelativeFilter {
    private static final java.lang.String FILTER_STR = "filter";
    public static final int FRAGMENT = 2;
    private static final java.lang.String PART_STR = "part";
    public static final int PATH = 0;
    private static final java.lang.String PATTERN_STR = "pattern";
    public static final int QUERY = 1;
    static final java.lang.String URI_RELATIVE_FILTER_STR = "uriRelativeFilter";
    private final java.lang.String mFilter = null;
    private final int mPatternType = 0;
    private final int mUriPart = 0;
    public UriRelativeFilter(int p0, int p1, java.lang.String p2) {}
    public UriRelativeFilter(android.content.UriRelativeFilterParcel p0) {}
    UriRelativeFilter(android.os.Parcel p0) {}
    public UriRelativeFilter(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private boolean matchQuery(android.os.PatternMatcher p0, java.lang.String p1) { return false; }
    private java.lang.String patternTypeToString() { return null; }
    private java.lang.String uriPartToString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getFilter() { return null; }
    public int getPatternType() { return 0; }
    public int getUriPart() { return 0; }
    public int hashCode() { return 0; }
    public boolean matchData(android.net.Uri p0) { return false; }
    public android.content.UriRelativeFilterParcel toParcel() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UriPart {
    }
}
