package android.media;

public final class SuggestedDeviceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.SuggestedDeviceInfo> CREATOR = null;
    private final java.lang.String mDeviceDisplayName = null;
    private final android.os.Bundle mExtras = null;
    private final java.lang.String mRouteId = null;
    private final int mType = 0;
    private SuggestedDeviceInfo(android.media.SuggestedDeviceInfo.Builder p0) {}
    private SuggestedDeviceInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getDeviceDisplayName() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.String getRouteId() { return null; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final java.lang.String mDeviceDisplayName = null;
        private android.os.Bundle mExtras;
        private final java.lang.String mRouteId = null;
        private final int mType = 0;
        public Builder(java.lang.String p0, java.lang.String p1, int p2) {}
        public android.media.SuggestedDeviceInfo build() { return null; }
        public android.media.SuggestedDeviceInfo.Builder setExtras(android.os.Bundle p0) { return null; }
    }
}
