package android.content.pm;

public final class CapabilityParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.CapabilityParams> CREATOR = null;
    private final java.util.List<java.lang.String> mAliases = null;
    private final java.lang.String mName = null;
    private final java.lang.String mPrimaryValue = null;
    private CapabilityParams(android.content.pm.CapabilityParams.Builder p0) {}
    CapabilityParams(android.content.pm.CapabilityParams p0) {}
    private CapabilityParams(android.os.Parcel p0) {}
    private CapabilityParams(java.lang.String p0, java.lang.String p1, java.util.Collection<java.lang.String> p2) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<java.lang.String> getAliases() { return null; }
    public java.lang.String getName() { return null; }
    public java.lang.String getValue() { return null; }
    java.util.List<java.lang.String> getValues() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.Set<java.lang.String> mAliases;
        private final java.lang.String mKey = null;
        private final java.lang.String mPrimaryValue = null;
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public android.content.pm.CapabilityParams.Builder addAlias(java.lang.String p0) { return null; }
        public android.content.pm.CapabilityParams build() { return null; }
    }
}
