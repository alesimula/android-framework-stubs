package android.app.admin;

public final class PreferentialNetworkServiceConfig implements android.os.Parcelable {
    private static final java.lang.String ATTR_VALUE = "value";
    public static final android.os.Parcelable.Creator<android.app.admin.PreferentialNetworkServiceConfig> CREATOR = null;
    public static final android.app.admin.PreferentialNetworkServiceConfig DEFAULT = null;
    private static final java.lang.String LOG_TAG = "PreferentialNetworkServiceConfig";
    public static final int PREFERENTIAL_NETWORK_ID_1 = 1;
    public static final int PREFERENTIAL_NETWORK_ID_2 = 2;
    public static final int PREFERENTIAL_NETWORK_ID_3 = 3;
    public static final int PREFERENTIAL_NETWORK_ID_4 = 4;
    public static final int PREFERENTIAL_NETWORK_ID_5 = 5;
    private static final java.lang.String TAG_ALLOW_FALLBACK_TO_DEFAULT_CONNECTION = "allow_fallback_to_default_connection";
    private static final java.lang.String TAG_BLOCK_NON_MATCHING_NETWORKS = "block_non_matching_networks";
    private static final java.lang.String TAG_CONFIG_ENABLED = "preferential_network_service_config_enabled";
    private static final java.lang.String TAG_EXCLUDED_UIDS = "excluded_uids";
    private static final java.lang.String TAG_INCLUDED_UIDS = "included_uids";
    private static final java.lang.String TAG_NETWORK_ID = "preferential_network_service_network_id";
    private static final java.lang.String TAG_PREFERENTIAL_NETWORK_SERVICE_CONFIG = "preferential_network_service_config";
    private static final java.lang.String TAG_UID = "uid";
    final boolean mAllowFallbackToDefaultConnection = false;
    final int[] mExcludedUids = null;
    final int[] mIncludedUids = null;
    final boolean mIsEnabled = false;
    final int mNetworkId = 0;
    final boolean mShouldBlockNonMatchingNetworks = false;
    private PreferentialNetworkServiceConfig(android.os.Parcel p0) {}
    private PreferentialNetworkServiceConfig(boolean p0, boolean p1, boolean p2, int[] p3, int[] p4, int p5) {}
    public static android.app.admin.PreferentialNetworkServiceConfig getPreferentialNetworkServiceConfig(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private java.util.List<java.lang.String> intArrayToStringList(int[] p0) { return null; }
    private static void readAttributeValues(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1, java.util.Collection<java.lang.String> p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private static int[] readStringListToIntArray(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private void writeAttributeValueToXml(com.android.modules.utils.TypedXmlSerializer p0, java.lang.String p1, int p2) throws java.io.IOException {}
    private void writeAttributeValueToXml(com.android.modules.utils.TypedXmlSerializer p0, java.lang.String p1, boolean p2) throws java.io.IOException {}
    private void writeAttributeValuesToXml(com.android.modules.utils.TypedXmlSerializer p0, java.lang.String p1, java.lang.String p2, java.util.Collection<java.lang.String> p3) throws java.io.IOException {}
    public int describeContents() { return 0; }
    public void dump(android.util.IndentingPrintWriter p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int[] getExcludedUids() { return null; }
    public int[] getIncludedUids() { return null; }
    public int getNetworkId() { return 0; }
    public int hashCode() { return 0; }
    public boolean isEnabled() { return false; }
    public boolean isFallbackToDefaultConnectionAllowed() { return false; }
    public boolean shouldBlockNonMatchingNetworks() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

    public static final class Builder {
        boolean mAllowFallbackToDefaultConnection;
        int[] mExcludedUids;
        int[] mIncludedUids;
        boolean mIsEnabled;
        int mNetworkId;
        boolean mShouldBlockNonMatchingNetworks;
        public Builder() {}
        public android.app.admin.PreferentialNetworkServiceConfig build() { return null; }
        public android.app.admin.PreferentialNetworkServiceConfig.Builder setEnabled(boolean p0) { return null; }
        public android.app.admin.PreferentialNetworkServiceConfig.Builder setExcludedUids(int[] p0) { return null; }
        public android.app.admin.PreferentialNetworkServiceConfig.Builder setFallbackToDefaultConnectionAllowed(boolean p0) { return null; }
        public android.app.admin.PreferentialNetworkServiceConfig.Builder setIncludedUids(int[] p0) { return null; }
        public android.app.admin.PreferentialNetworkServiceConfig.Builder setNetworkId(int p0) { return null; }
        public android.app.admin.PreferentialNetworkServiceConfig.Builder setShouldBlockNonMatchingNetworks(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PreferentialNetworkPreferenceId {
    }
}
