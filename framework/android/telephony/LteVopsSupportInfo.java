package android.telephony;

@android.annotation.SystemApi
public final class LteVopsSupportInfo extends android.telephony.VopsSupportInfo {
    public static final android.os.Parcelable.Creator<android.telephony.LteVopsSupportInfo> CREATOR = null;
    @java.lang.Deprecated
    public static final int LTE_STATUS_NOT_AVAILABLE = 1;
    public static final int LTE_STATUS_NOT_SUPPORTED = 3;
    public static final int LTE_STATUS_SUPPORTED = 2;
    private final int mEmcBearerSupport = 0;
    private final int mVopsSupport = 0;
    public LteVopsSupportInfo(int p0, int p1) { super(); }
    private LteVopsSupportInfo(android.os.Parcel p0) { super(); }
    protected static android.telephony.LteVopsSupportInfo createFromParcelBody(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getEmcBearerSupport() { return 0; }
    public int getVopsSupport() { return 0; }
    public int hashCode() { return 0; }
    public boolean isEmergencyServiceFallbackSupported() { return false; }
    public boolean isEmergencyServiceSupported() { return false; }
    public boolean isVopsSupported() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LteVopsStatus {
    }
}
