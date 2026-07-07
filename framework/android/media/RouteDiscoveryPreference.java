package android.media;

public final class RouteDiscoveryPreference implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.RouteDiscoveryPreference> CREATOR = null;
    @android.annotation.SystemApi
    public static final android.media.RouteDiscoveryPreference EMPTY = null;
    private final java.util.List<java.lang.String> mPackageOrder = null;
    private final java.util.List<java.lang.String> mPreferredFeatures = null;
    private final java.util.Set<java.lang.Integer> mRoutingTypes = null;
    private final boolean mShouldPerformActiveScan = false;
    RouteDiscoveryPreference(android.media.RouteDiscoveryPreference.Builder p0) {}
    RouteDiscoveryPreference(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<java.lang.String> getDeduplicationPackageOrder() { return null; }
    public java.util.List<java.lang.String> getPreferredFeatures() { return null; }
    public java.util.Set<java.lang.Integer> getRoutingTypes() { return null; }
    public int hashCode() { return 0; }
    public boolean shouldPerformActiveScan() { return false; }
    public boolean shouldRemoveDuplicates() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        boolean mActiveScan;
        java.util.List<java.lang.String> mPackageOrder;
        java.util.List<java.lang.String> mPreferredFeatures;
        java.util.Set<java.lang.Integer> mRoutingTypes;
        public Builder(android.media.RouteDiscoveryPreference p0) {}
        public Builder(java.util.Collection<android.media.RouteDiscoveryPreference> p0) {}
        public Builder(java.util.List<java.lang.String> p0, boolean p1) {}
        public android.media.RouteDiscoveryPreference build() { return null; }
        public android.media.RouteDiscoveryPreference.Builder setDeduplicationPackageOrder(java.util.List<java.lang.String> p0) { return null; }
        public android.media.RouteDiscoveryPreference.Builder setPreferredFeatures(java.util.List<java.lang.String> p0) { return null; }
        public android.media.RouteDiscoveryPreference.Builder setRoutingTypes(java.util.Set<java.lang.Integer> p0) { return null; }
        public android.media.RouteDiscoveryPreference.Builder setShouldPerformActiveScan(boolean p0) { return null; }
    }
}
