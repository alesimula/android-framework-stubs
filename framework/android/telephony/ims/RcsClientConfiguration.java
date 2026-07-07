package android.telephony.ims;

@android.annotation.SystemApi
public final class RcsClientConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsClientConfiguration> CREATOR = null;
    public static final java.lang.String RCS_PROFILE_1_0 = "UP_1.0";
    public static final java.lang.String RCS_PROFILE_2_3 = "UP_2.3";
    public static final java.lang.String RCS_PROFILE_2_4 = "UP_2.4";
    private java.lang.String mClientVendor;
    private java.lang.String mClientVersion;
    private boolean mRcsEnabledByUser;
    private java.lang.String mRcsProfile;
    private java.lang.String mRcsVersion;
    @java.lang.Deprecated
    public RcsClientConfiguration(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    public RcsClientConfiguration(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getClientVendor() { return null; }
    public java.lang.String getClientVersion() { return null; }
    public java.lang.String getRcsProfile() { return null; }
    public java.lang.String getRcsVersion() { return null; }
    public int hashCode() { return 0; }
    public boolean isRcsEnabledByUser() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StringRcsProfile {
    }
}
