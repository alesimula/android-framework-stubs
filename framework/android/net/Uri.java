package android.net;

public abstract class Uri implements android.os.Parcelable, java.lang.Comparable<android.net.Uri> {
    public static final android.os.Parcelable.Creator<android.net.Uri> CREATOR = null;
    private static final java.lang.String DEFAULT_ENCODING = "UTF-8";
    public static final android.net.Uri EMPTY = null;
    private static final char[] HEX_DIGITS = null;
    private static final java.lang.String LOG = null;
    private static final int NOT_CALCULATED = -2;
    private static final int NOT_FOUND = -1;
    private static final java.lang.String NOT_HIERARCHICAL = "This isn't a hierarchical URI.";
    private static final int NULL_TYPE_ID = 0;
    private Uri() {}
    public static java.lang.String decode(java.lang.String p0) { return null; }
    public static java.lang.String decodeIfNeeded(java.lang.String p0) { return null; }
    public static java.lang.String encode(java.lang.String p0) { return null; }
    public static java.lang.String encode(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.lang.String encodeIfNotEncoded(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.net.Uri fromFile(java.io.File p0) { return null; }
    public static android.net.Uri fromParts(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    private static boolean isAllowed(char p0, java.lang.String p1) { return false; }
    private static boolean isEncoded(java.lang.String p0, java.lang.String p1) { return false; }
    public static android.net.Uri parse(java.lang.String p0) { return null; }
    public static android.net.Uri withAppendedPath(android.net.Uri p0, java.lang.String p1) { return null; }
    public static void writeToParcel(android.os.Parcel p0, android.net.Uri p1) {}
    public abstract android.net.Uri.Builder buildUpon();
    public void checkContentUriWithoutPermission(java.lang.String p0, int p1) {}
    public void checkFileUriExposed(java.lang.String p0) {}
    public int compareTo(android.net.Uri p0) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public abstract java.lang.String getAuthority();
    public boolean getBooleanQueryParameter(java.lang.String p0, boolean p1) { return false; }
    public android.net.Uri getCanonicalUri() { return null; }
    public abstract java.lang.String getEncodedAuthority();
    public abstract java.lang.String getEncodedFragment();
    public abstract java.lang.String getEncodedPath();
    public abstract java.lang.String getEncodedQuery();
    public abstract java.lang.String getEncodedSchemeSpecificPart();
    public abstract java.lang.String getEncodedUserInfo();
    public abstract java.lang.String getFragment();
    public abstract java.lang.String getHost();
    public abstract java.lang.String getLastPathSegment();
    public abstract java.lang.String getPath();
    public abstract java.util.List<java.lang.String> getPathSegments();
    public abstract int getPort();
    public abstract java.lang.String getQuery();
    public java.lang.String getQueryParameter(java.lang.String p0) { return null; }
    public java.util.Set<java.lang.String> getQueryParameterNames() { return null; }
    public java.util.List<java.lang.String> getQueryParameters(java.lang.String p0) { return null; }
    public abstract java.lang.String getScheme();
    public abstract java.lang.String getSchemeSpecificPart();
    public abstract java.lang.String getUserInfo();
    public int hashCode() { return 0; }
    public boolean isAbsolute() { return false; }
    public abstract boolean isHierarchical();
    public boolean isOpaque() { return false; }
    public boolean isPathPrefixMatch(android.net.Uri p0) { return false; }
    public abstract boolean isRelative();
    public android.net.Uri normalizeScheme() { return null; }
    @android.annotation.SystemApi
    public java.lang.String toSafeString() { return null; }
    public abstract java.lang.String toString();

    private static abstract class AbstractHierarchicalUri extends android.net.Uri {
        private volatile java.lang.String host;
        private volatile int port;
        private android.net.Uri.Part userInfo;
        private AbstractHierarchicalUri() { super(); }
        private int findPortSeparator(java.lang.String p0) { return 0; }
        private android.net.Uri.Part getUserInfoPart() { return null; }
        private java.lang.String parseHost() { return null; }
        private int parsePort() { return 0; }
        private java.lang.String parseUserInfo() { return null; }
        public final java.lang.String getEncodedUserInfo() { return null; }
        public java.lang.String getHost() { return null; }
        public java.lang.String getLastPathSegment() { return null; }
        public int getPort() { return 0; }
        public java.lang.String getUserInfo() { return null; }
    }

    static abstract class AbstractPart {
        volatile java.lang.String decoded;
        volatile java.lang.String encoded;
        AbstractPart(java.lang.String p0, java.lang.String p1) {}
        final java.lang.String getDecoded() { return null; }
        abstract java.lang.String getEncoded();
    }

    public static final class Builder {
        private android.net.Uri.Part authority;
        private android.net.Uri.Part fragment;
        private android.net.Uri.Part opaquePart;
        private android.net.Uri.PathPart path;
        private android.net.Uri.Part query;
        private java.lang.String scheme;
        public Builder() {}
        private boolean hasSchemeOrAuthority() { return false; }
        public android.net.Uri.Builder appendEncodedPath(java.lang.String p0) { return null; }
        public android.net.Uri.Builder appendPath(java.lang.String p0) { return null; }
        public android.net.Uri.Builder appendQueryParameter(java.lang.String p0, java.lang.String p1) { return null; }
        android.net.Uri.Builder authority(android.net.Uri.Part p0) { return null; }
        public android.net.Uri.Builder authority(java.lang.String p0) { return null; }
        public android.net.Uri build() { return null; }
        public android.net.Uri.Builder clearQuery() { return null; }
        public android.net.Uri.Builder encodedAuthority(java.lang.String p0) { return null; }
        public android.net.Uri.Builder encodedFragment(java.lang.String p0) { return null; }
        public android.net.Uri.Builder encodedOpaquePart(java.lang.String p0) { return null; }
        public android.net.Uri.Builder encodedPath(java.lang.String p0) { return null; }
        public android.net.Uri.Builder encodedQuery(java.lang.String p0) { return null; }
        android.net.Uri.Builder fragment(android.net.Uri.Part p0) { return null; }
        public android.net.Uri.Builder fragment(java.lang.String p0) { return null; }
        android.net.Uri.Builder opaquePart(android.net.Uri.Part p0) { return null; }
        public android.net.Uri.Builder opaquePart(java.lang.String p0) { return null; }
        android.net.Uri.Builder path(android.net.Uri.PathPart p0) { return null; }
        public android.net.Uri.Builder path(java.lang.String p0) { return null; }
        android.net.Uri.Builder query(android.net.Uri.Part p0) { return null; }
        public android.net.Uri.Builder query(java.lang.String p0) { return null; }
        public android.net.Uri.Builder scheme(java.lang.String p0) { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class HierarchicalUri extends android.net.Uri.AbstractHierarchicalUri {
        static final int TYPE_ID = 3;
        private final android.net.Uri.Part authority = null;
        private final android.net.Uri.Part fragment = null;
        private final android.net.Uri.PathPart path = null;
        private final android.net.Uri.Part query = null;
        private final java.lang.String scheme = null;
        private android.net.Uri.Part ssp;
        private volatile java.lang.String uriString;
        private HierarchicalUri(java.lang.String p0, android.net.Uri.Part p1, android.net.Uri.PathPart p2, android.net.Uri.Part p3, android.net.Uri.Part p4) { super(); }
        private void appendSspTo(java.lang.StringBuilder p0) {}
        private android.net.Uri.PathPart generatePath(android.net.Uri.PathPart p0) { return null; }
        private android.net.Uri.Part getSsp() { return null; }
        private java.lang.String makeSchemeSpecificPart() { return null; }
        private java.lang.String makeUriString() { return null; }
        static android.net.Uri readFrom(android.os.Parcel p0) { return null; }
        public android.net.Uri.Builder buildUpon() { return null; }
        public int describeContents() { return 0; }
        public java.lang.String getAuthority() { return null; }
        public java.lang.String getEncodedAuthority() { return null; }
        public java.lang.String getEncodedFragment() { return null; }
        public java.lang.String getEncodedPath() { return null; }
        public java.lang.String getEncodedQuery() { return null; }
        public java.lang.String getEncodedSchemeSpecificPart() { return null; }
        public java.lang.String getFragment() { return null; }
        public java.lang.String getPath() { return null; }
        public java.util.List<java.lang.String> getPathSegments() { return null; }
        public java.lang.String getQuery() { return null; }
        public java.lang.String getScheme() { return null; }
        public java.lang.String getSchemeSpecificPart() { return null; }
        public boolean isHierarchical() { return false; }
        public boolean isRelative() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    static class NotCachedHolder {
        static final java.lang.String NOT_CACHED = null;
        private NotCachedHolder() {}
    }

    private static class OpaqueUri extends android.net.Uri {
        static final int TYPE_ID = 2;
        private volatile java.lang.String cachedString;
        private final android.net.Uri.Part fragment = null;
        private final java.lang.String scheme = null;
        private final android.net.Uri.Part ssp = null;
        private OpaqueUri(java.lang.String p0, android.net.Uri.Part p1, android.net.Uri.Part p2) { super(); }
        static android.net.Uri readFrom(android.os.Parcel p0) { return null; }
        public android.net.Uri.Builder buildUpon() { return null; }
        public int describeContents() { return 0; }
        public java.lang.String getAuthority() { return null; }
        public java.lang.String getEncodedAuthority() { return null; }
        public java.lang.String getEncodedFragment() { return null; }
        public java.lang.String getEncodedPath() { return null; }
        public java.lang.String getEncodedQuery() { return null; }
        public java.lang.String getEncodedSchemeSpecificPart() { return null; }
        public java.lang.String getEncodedUserInfo() { return null; }
        public java.lang.String getFragment() { return null; }
        public java.lang.String getHost() { return null; }
        public java.lang.String getLastPathSegment() { return null; }
        public java.lang.String getPath() { return null; }
        public java.util.List<java.lang.String> getPathSegments() { return null; }
        public int getPort() { return 0; }
        public java.lang.String getQuery() { return null; }
        public java.lang.String getScheme() { return null; }
        public java.lang.String getSchemeSpecificPart() { return null; }
        public java.lang.String getUserInfo() { return null; }
        public boolean isHierarchical() { return false; }
        public boolean isRelative() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    static class Part extends android.net.Uri.AbstractPart {
        static final android.net.Uri.Part EMPTY = null;
        static final android.net.Uri.Part NULL = null;
        private Part(java.lang.String p0, java.lang.String p1) { super(null, null); }
        static android.net.Uri.Part from(java.lang.String p0, java.lang.String p1) { return null; }
        static android.net.Uri.Part fromDecoded(java.lang.String p0) { return null; }
        static android.net.Uri.Part fromEncoded(java.lang.String p0) { return null; }
        static android.net.Uri.Part nonNull(android.net.Uri.Part p0) { return null; }
        java.lang.String getEncoded() { return null; }
        boolean isEmpty() { return false; }

        private static class EmptyPart extends android.net.Uri.Part {
            public EmptyPart(java.lang.String p0) { super(null, null); }
            boolean isEmpty() { return false; }
        }
    }

    static class PathPart extends android.net.Uri.AbstractPart {
        static final android.net.Uri.PathPart EMPTY = null;
        static final android.net.Uri.PathPart NULL = null;
        private android.net.Uri.PathSegments pathSegments;
        private PathPart(java.lang.String p0, java.lang.String p1) { super(null, null); }
        static android.net.Uri.PathPart appendDecodedSegment(android.net.Uri.PathPart p0, java.lang.String p1) { return null; }
        static android.net.Uri.PathPart appendEncodedSegment(android.net.Uri.PathPart p0, java.lang.String p1) { return null; }
        static android.net.Uri.PathPart from(java.lang.String p0, java.lang.String p1) { return null; }
        static android.net.Uri.PathPart fromDecoded(java.lang.String p0) { return null; }
        static android.net.Uri.PathPart fromEncoded(java.lang.String p0) { return null; }
        static android.net.Uri.PathPart makeAbsolute(android.net.Uri.PathPart p0) { return null; }
        java.lang.String getEncoded() { return null; }
        android.net.Uri.PathSegments getPathSegments() { return null; }
    }

    static class PathSegments extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess {
        static final android.net.Uri.PathSegments EMPTY = null;
        final java.lang.String[] segments = null;
        final int size = 0;
        PathSegments(java.lang.String[] p0, int p1) { super(); }
        public java.lang.String get(int p0) { return null; }
        public int size() { return 0; }
    }

    static class PathSegmentsBuilder {
        java.lang.String[] segments;
        int size;
        PathSegmentsBuilder() {}
        void add(java.lang.String p0) {}
        android.net.Uri.PathSegments build() { return null; }
    }

    private static class StringUri extends android.net.Uri.AbstractHierarchicalUri {
        static final int TYPE_ID = 1;
        private android.net.Uri.Part authority;
        private volatile int cachedFsi;
        private volatile int cachedSsi;
        private android.net.Uri.Part fragment;
        private android.net.Uri.PathPart path;
        private android.net.Uri.Part query;
        private volatile java.lang.String scheme;
        private android.net.Uri.Part ssp;
        private final java.lang.String uriString = null;
        private StringUri(java.lang.String p0) { super(); }
        private int findFragmentSeparator() { return 0; }
        private int findSchemeSeparator() { return 0; }
        private android.net.Uri.Part getAuthorityPart() { return null; }
        private android.net.Uri.Part getFragmentPart() { return null; }
        private android.net.Uri.PathPart getPathPart() { return null; }
        private android.net.Uri.Part getQueryPart() { return null; }
        private android.net.Uri.Part getSsp() { return null; }
        static java.lang.String parseAuthority(java.lang.String p0, int p1) { return null; }
        private java.lang.String parseFragment() { return null; }
        private java.lang.String parsePath() { return null; }
        static java.lang.String parsePath(java.lang.String p0, int p1) { return null; }
        private java.lang.String parseQuery() { return null; }
        private java.lang.String parseScheme() { return null; }
        private java.lang.String parseSsp() { return null; }
        static android.net.Uri readFrom(android.os.Parcel p0) { return null; }
        public android.net.Uri.Builder buildUpon() { return null; }
        public int describeContents() { return 0; }
        public java.lang.String getAuthority() { return null; }
        public java.lang.String getEncodedAuthority() { return null; }
        public java.lang.String getEncodedFragment() { return null; }
        public java.lang.String getEncodedPath() { return null; }
        public java.lang.String getEncodedQuery() { return null; }
        public java.lang.String getEncodedSchemeSpecificPart() { return null; }
        public java.lang.String getFragment() { return null; }
        public java.lang.String getPath() { return null; }
        public java.util.List<java.lang.String> getPathSegments() { return null; }
        public java.lang.String getQuery() { return null; }
        public java.lang.String getScheme() { return null; }
        public java.lang.String getSchemeSpecificPart() { return null; }
        public boolean isHierarchical() { return false; }
        public boolean isRelative() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
