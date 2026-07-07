package android.content;

public final class UriRelativeFilterGroup {
    public static final int ACTION_ALLOW = 0;
    public static final int ACTION_BLOCK = 1;
    private static final java.lang.String ALLOW_STR = "allow";
    private static final java.lang.String TAG = "UriRelativeFilterGroup";
    private static final java.lang.String URI_RELATIVE_FILTER_GROUP_STR = "uriRelativeFilterGroup";
    private final int mAction = 0;
    private final android.util.ArraySet<android.content.UriRelativeFilter> mUriRelativeFilters = null;
    public UriRelativeFilterGroup(int p0) {}
    public UriRelativeFilterGroup(android.content.UriRelativeFilterGroupParcel p0) {}
    UriRelativeFilterGroup(android.os.Parcel p0) {}
    public UriRelativeFilterGroup(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static java.util.List<android.content.UriRelativeFilterGroupParcel> groupsToParcels(java.util.List<android.content.UriRelativeFilterGroup> p0) { return null; }
    public static boolean matchGroupsToUri(java.util.List<android.content.UriRelativeFilterGroup> p0, android.net.Uri p1) { return false; }
    public static java.util.List<android.content.UriRelativeFilterGroup> parcelsToGroups(java.util.List<android.content.UriRelativeFilterGroupParcel> p0) { return null; }
    public void addUriRelativeFilter(android.content.UriRelativeFilter p0) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAction() { return 0; }
    public java.util.Collection<android.content.UriRelativeFilter> getUriRelativeFilters() { return null; }
    public int hashCode() { return 0; }
    public boolean matchData(android.net.Uri p0) { return false; }
    public android.content.UriRelativeFilterGroupParcel toParcel() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Action {
    }
}
