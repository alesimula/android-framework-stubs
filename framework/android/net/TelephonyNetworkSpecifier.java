package android.net;

public final class TelephonyNetworkSpecifier extends android.net.NetworkSpecifier implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.TelephonyNetworkSpecifier> CREATOR = null;
    private final int mSubId = 0;
    public TelephonyNetworkSpecifier(int p0) { super(); }
    public boolean canBeSatisfiedBy(android.net.NetworkSpecifier p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getSubscriptionId() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private static final int SENTINEL_SUB_ID = -2147483648;
        private int mSubId;
        public Builder() {}
        public android.net.TelephonyNetworkSpecifier build() { return null; }
        public android.net.TelephonyNetworkSpecifier.Builder setSubscriptionId(int p0) { return null; }
    }
}
