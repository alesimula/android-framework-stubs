package android.content;

public class IntentFilter implements android.os.Parcelable {
    private static final java.lang.String ACTION_STR = "action";
    private static final java.lang.String AGLOB_STR = "aglob";
    private static final java.lang.String AUTH_STR = "auth";
    private static final java.lang.String AUTO_VERIFY_STR = "autoVerify";
    public static final long BLOCK_NULL_ACTION_INTENTS = 293560872L;
    private static final java.lang.String CAT_STR = "cat";
    public static final android.os.Parcelable.Creator<android.content.IntentFilter> CREATOR = null;
    private static final boolean[] EMPTY_BOOLEAN_ARRAY = null;
    private static final double[] EMPTY_DOUBLE_ARRAY = null;
    private static final int[] EMPTY_INT_ARRAY = null;
    private static final long[] EMPTY_LONG_ARRAY = null;
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    private static final java.lang.String EXTRAS_STR = "extras";
    private static final java.lang.String GROUP_STR = "group";
    private static final java.lang.String HOST_STR = "host";
    private static final java.lang.String LITERAL_STR = "literal";
    public static final int MATCH_ADJUSTMENT_MASK = 65535;
    public static final int MATCH_ADJUSTMENT_NORMAL = 32768;
    public static final int MATCH_CATEGORY_EMPTY = 1048576;
    public static final int MATCH_CATEGORY_HOST = 3145728;
    public static final int MATCH_CATEGORY_MASK = 268369920;
    public static final int MATCH_CATEGORY_PATH = 5242880;
    public static final int MATCH_CATEGORY_PORT = 4194304;
    public static final int MATCH_CATEGORY_SCHEME = 2097152;
    public static final int MATCH_CATEGORY_SCHEME_SPECIFIC_PART = 5767168;
    public static final int MATCH_CATEGORY_TYPE = 6291456;
    private static final java.lang.String NAME_STR = "name";
    public static final int NO_MATCH_ACTION = -3;
    public static final int NO_MATCH_CATEGORY = -4;
    public static final int NO_MATCH_DATA = -2;
    public static final int NO_MATCH_EXTRAS = -5;
    public static final int NO_MATCH_TYPE = -1;
    private static final java.lang.String PATH_STR = "path";
    private static final java.lang.String PORT_STR = "port";
    private static final java.lang.String PREFIX_STR = "prefix";
    public static final java.lang.String SCHEME_HTTP = "http";
    public static final java.lang.String SCHEME_HTTPS = "https";
    public static final java.lang.String SCHEME_PACKAGE = "package";
    private static final java.lang.String SCHEME_STR = "scheme";
    private static final java.lang.String SGLOB_STR = "sglob";
    private static final java.lang.String SSP_STR = "ssp";
    private static final int STATE_NEED_VERIFY = 16;
    private static final int STATE_NEED_VERIFY_CHECKED = 256;
    private static final int STATE_VERIFIED = 4096;
    private static final int STATE_VERIFY_AUTO = 1;
    private static final java.lang.String STATIC_TYPE_STR = "staticType";
    private static final java.lang.String SUFFIX_STR = "suffix";
    public static final int SYSTEM_HIGH_PRIORITY = 1000;
    public static final int SYSTEM_LOW_PRIORITY = -1000;
    private static final java.lang.String TAG = "IntentFilter";
    private static final java.lang.String TYPE_STR = "type";
    private static final java.lang.String URI_RELATIVE_FILTER_GROUP_STR = "uriRelativeFilterGroup";
    public static final int VISIBILITY_EXPLICIT = 1;
    public static final int VISIBILITY_IMPLICIT = 2;
    public static final int VISIBILITY_NONE = 0;
    public static final java.lang.String WILDCARD = "*";
    public static final java.lang.String WILDCARD_PATH = "/*";
    private final android.util.ArraySet<java.lang.String> mActions = null;
    private java.util.ArrayList<java.lang.String> mCategories;
    private java.util.ArrayList<android.content.IntentFilter.AuthorityEntry> mDataAuthorities;
    private java.util.ArrayList<android.os.PatternMatcher> mDataPaths;
    private java.util.ArrayList<android.os.PatternMatcher> mDataSchemeSpecificParts;
    private java.util.ArrayList<java.lang.String> mDataSchemes;
    private java.util.ArrayList<java.lang.String> mDataTypes;
    private android.os.PersistableBundle mExtras;
    private boolean mHasDynamicPartialTypes;
    private boolean mHasStaticPartialTypes;
    private int mInstantAppVisibility;
    private java.util.ArrayList<java.lang.String> mMimeGroups;
    private int mOrder;
    private int mPriority;
    private java.util.ArrayList<java.lang.String> mStaticDataTypes;
    private java.util.ArrayList<android.content.UriRelativeFilterGroup> mUriRelativeFilterGroups;
    private int mVerifyState;
    public IntentFilter() {}
    public IntentFilter(android.content.IntentFilter p0) {}
    public IntentFilter(android.os.Parcel p0) {}
    public IntentFilter(java.lang.String p0) {}
    public IntentFilter(java.lang.String p0, java.lang.String p1) throws android.content.IntentFilter.MalformedMimeTypeException {}
    private static java.lang.String[] addStringToSet(java.lang.String[] p0, java.lang.String p1, int[] p2, int p3) { return null; }
    public static android.content.IntentFilter create(java.lang.String p0, java.lang.String p1) { return null; }
    public static boolean filterEquals(android.content.IntentFilter p0, android.content.IntentFilter p1) { return false; }
    private final boolean findMimeType(java.lang.String p0) { return false; }
    private static int findStringInSet(java.lang.String[] p0, java.lang.String p1, int[] p2, int p3) { return 0; }
    private boolean hasDataPath(java.lang.String p0, boolean p1) { return false; }
    private boolean hasDataSchemeSpecificPart(java.lang.String p0, boolean p1) { return false; }
    private boolean hasPartialTypes() { return false; }
    private boolean matchAction(java.lang.String p0, boolean p1, java.util.Collection<java.lang.String> p2) { return false; }
    private int matchData(java.lang.String p0, java.lang.String p1, android.net.Uri p2, boolean p3) { return 0; }
    private java.lang.String matchExtras(android.os.Bundle p0) { return null; }
    private boolean matchRelRefGroups(android.net.Uri p0) { return false; }
    private void processMimeType(java.lang.String p0, java.util.function.BiConsumer<java.lang.String, java.lang.Boolean> p1) throws android.content.IntentFilter.MalformedMimeTypeException {}
    private static java.lang.String[] removeStringFromSet(java.lang.String[] p0, java.lang.String p1, int[] p2, int p3) { return null; }
    private void writeDataTypeToXml(org.xmlpull.v1.XmlSerializer p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException {}
    private void writeDataTypesToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    public final java.util.Iterator<java.lang.String> actionsIterator() { return null; }
    public final void addAction(java.lang.String p0) {}
    public final void addCategory(java.lang.String p0) {}
    public final void addDataAuthority(android.content.IntentFilter.AuthorityEntry p0) {}
    public final void addDataAuthority(java.lang.String p0, java.lang.String p1) {}
    public final void addDataPath(android.os.PatternMatcher p0) {}
    public final void addDataPath(java.lang.String p0, int p1) {}
    public final void addDataScheme(java.lang.String p0) {}
    public final void addDataSchemeSpecificPart(android.os.PatternMatcher p0) {}
    public final void addDataSchemeSpecificPart(java.lang.String p0, int p1) {}
    public final void addDataType(java.lang.String p0) throws android.content.IntentFilter.MalformedMimeTypeException {}
    public final void addDynamicDataType(java.lang.String p0) throws android.content.IntentFilter.MalformedMimeTypeException {}
    public final void addExtra(java.lang.String p0, double p1) {}
    public final void addExtra(java.lang.String p0, int p1) {}
    public final void addExtra(java.lang.String p0, long p1) {}
    public final void addExtra(java.lang.String p0, java.lang.String p1) {}
    public final void addExtra(java.lang.String p0, boolean p1) {}
    public final void addExtra(java.lang.String p0, double[] p1) {}
    public final void addExtra(java.lang.String p0, int[] p1) {}
    public final void addExtra(java.lang.String p0, long[] p1) {}
    public final void addExtra(java.lang.String p0, java.lang.String[] p1) {}
    public final void addExtra(java.lang.String p0, boolean[] p1) {}
    public final void addMimeGroup(java.lang.String p0) {}
    public final void addUriRelativeFilterGroup(android.content.UriRelativeFilterGroup p0) {}
    public java.util.function.Predicate<android.content.Intent> asPredicate() { return null; }
    public java.util.function.Predicate<android.content.Intent> asPredicateWithTypeResolution(android.content.ContentResolver p0) { return null; }
    public final java.util.Iterator<android.content.IntentFilter.AuthorityEntry> authoritiesIterator() { return null; }
    public final java.util.Iterator<java.lang.String> categoriesIterator() { return null; }
    public boolean checkDataPathAndSchemeSpecificParts() { return false; }
    public final void clearDynamicDataTypes() {}
    public final void clearUriRelativeFilterGroups() {}
    public final int countActions() { return 0; }
    public final int countCategories() { return 0; }
    public final int countDataAuthorities() { return 0; }
    public final int countDataPaths() { return 0; }
    public final int countDataSchemeSpecificParts() { return 0; }
    public final int countDataSchemes() { return 0; }
    public final int countDataTypes() { return 0; }
    public final int countMimeGroups() { return 0; }
    public int countStaticDataTypes() { return 0; }
    public final int countUriRelativeFilterGroups() { return 0; }
    public final java.util.List<java.lang.String> dataTypes() { return null; }
    public boolean debugCheck() { return false; }
    public final int describeContents() { return 0; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public final java.lang.String getAction(int p0) { return null; }
    public final boolean getAutoVerify() { return false; }
    public final boolean[] getBooleanArrayExtra(java.lang.String p0) { return null; }
    public final boolean getBooleanExtra(java.lang.String p0) { return false; }
    public final java.lang.String getCategory(int p0) { return null; }
    public final android.content.IntentFilter.AuthorityEntry getDataAuthority(int p0) { return null; }
    public final android.os.PatternMatcher getDataPath(int p0) { return null; }
    public final java.lang.String getDataScheme(int p0) { return null; }
    public final android.os.PatternMatcher getDataSchemeSpecificPart(int p0) { return null; }
    public final java.lang.String getDataType(int p0) { return null; }
    public final double[] getDoubleArrayExtra(java.lang.String p0) { return null; }
    public final double getDoubleExtra(java.lang.String p0) { return 0.0; }
    public final android.os.PersistableBundle getExtras() { return null; }
    public java.lang.String[] getHosts() { return null; }
    public java.util.ArrayList<java.lang.String> getHostsList() { return null; }
    public final int[] getIntArrayExtra(java.lang.String p0) { return null; }
    public final int getIntExtra(java.lang.String p0) { return 0; }
    public final long[] getLongArrayExtra(java.lang.String p0) { return null; }
    public final long getLongExtra(java.lang.String p0) { return 0L; }
    public final java.lang.String getMimeGroup(int p0) { return null; }
    @android.annotation.SystemApi
    public final int getOrder() { return 0; }
    public final int getPriority() { return 0; }
    public final java.lang.String[] getStringArrayExtra(java.lang.String p0) { return null; }
    public final java.lang.String getStringExtra(java.lang.String p0) { return null; }
    public final android.content.UriRelativeFilterGroup getUriRelativeFilterGroup(int p0) { return null; }
    public int getVisibilityToInstantApp() { return 0; }
    public final boolean handleAllWebDataURI() { return false; }
    public final boolean handlesWebUris(boolean p0) { return false; }
    public final boolean hasAction(java.lang.String p0) { return false; }
    public final boolean hasCategory(java.lang.String p0) { return false; }
    public final boolean hasDataAuthority(android.content.IntentFilter.AuthorityEntry p0) { return false; }
    public final boolean hasDataAuthority(android.net.Uri p0) { return false; }
    public final boolean hasDataPath(android.os.PatternMatcher p0) { return false; }
    public final boolean hasDataPath(java.lang.String p0) { return false; }
    public final boolean hasDataScheme(java.lang.String p0) { return false; }
    public final boolean hasDataSchemeSpecificPart(android.os.PatternMatcher p0) { return false; }
    public final boolean hasDataSchemeSpecificPart(java.lang.String p0) { return false; }
    public final boolean hasDataType(java.lang.String p0) { return false; }
    public final boolean hasExactDataType(java.lang.String p0) { return false; }
    public final boolean hasExactDynamicDataType(java.lang.String p0) { return false; }
    public final boolean hasExactStaticDataType(java.lang.String p0) { return false; }
    public final boolean hasExtra(java.lang.String p0) { return false; }
    public final boolean hasMimeGroup(java.lang.String p0) { return false; }
    public boolean isExplicitlyVisibleToInstantApp() { return false; }
    public boolean isImplicitlyVisibleToInstantApp() { return false; }
    public final boolean isVerified() { return false; }
    public boolean isVisibleToInstantApp() { return false; }
    public final int match(android.content.ContentResolver p0, android.content.Intent p1, boolean p2, java.lang.String p3) { return 0; }
    public final int match(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.util.Set<java.lang.String> p4, java.lang.String p5) { return 0; }
    public final int match(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.util.Set<java.lang.String> p4, java.lang.String p5, boolean p6, java.util.Collection<java.lang.String> p7) { return 0; }
    public final int match(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.util.Set<java.lang.String> p4, java.lang.String p5, boolean p6, java.util.Collection<java.lang.String> p7, android.os.Bundle p8) { return 0; }
    public final boolean matchAction(java.lang.String p0) { return false; }
    public final java.lang.String matchCategories(java.util.Set<java.lang.String> p0) { return null; }
    public final int matchData(java.lang.String p0, java.lang.String p1, android.net.Uri p2) { return 0; }
    public final int matchDataAuthority(android.net.Uri p0) { return 0; }
    public final int matchDataAuthority(android.net.Uri p0, boolean p1) { return 0; }
    public final java.util.Iterator<java.lang.String> mimeGroupsIterator() { return null; }
    public final boolean needsVerification() { return false; }
    public final java.util.Iterator<android.os.PatternMatcher> pathsIterator() { return null; }
    public void printIntentFilterMatchDetails(java.io.PrintWriter p0, android.content.Intent p1) {}
    public void readFromXml(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public final int safeCountActions() { return 0; }
    public final java.util.Iterator<android.os.PatternMatcher> schemeSpecificPartsIterator() { return null; }
    public final java.util.Iterator<java.lang.String> schemesIterator() { return null; }
    public final void setAutoVerify(boolean p0) {}
    public final void setExtras(android.os.PersistableBundle p0) {}
    @android.annotation.SystemApi
    public final void setOrder(int p0) {}
    public final void setPriority(int p0) {}
    public void setVerified(boolean p0) {}
    public void setVisibilityToInstantApp(int p0) {}
    public java.lang.String toLongString() { return null; }
    public final java.util.Iterator<java.lang.String> typesIterator() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}

    public static final class AuthorityEntry {
        private final java.lang.String mHost = null;
        private final java.lang.String mOrigHost = null;
        private final int mPort = 0;
        private final boolean mWild = false;
        AuthorityEntry(android.os.Parcel p0) {}
        public AuthorityEntry(java.lang.String p0, java.lang.String p1) {}
        void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getHost() { return null; }
        public int getPort() { return 0; }
        public int match(android.net.Uri p0) { return 0; }
        public int match(android.net.Uri p0, boolean p1) { return 0; }
        public boolean match(android.content.IntentFilter.AuthorityEntry p0) { return false; }
        void writeToParcel(android.os.Parcel p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InstantAppVisibility {
    }

    public static class MalformedMimeTypeException extends android.util.AndroidException {
        public MalformedMimeTypeException() { super(); }
        public MalformedMimeTypeException(java.lang.String p0) { super(); }
    }
}
