package android.hardware.location;

@android.annotation.SystemApi
public final class HubInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.location.HubInfo> CREATOR = null;
    public static final int TYPE_CONTEXT_HUB = 0;
    public static final int TYPE_VENDOR_HUB = 1;
    private final android.hardware.location.ContextHubInfo mContextHubInfo = null;
    private final long mId = 0L;
    private final boolean mSupportsDataFlows = false;
    private final int mType = 0;
    private final android.hardware.location.VendorHubInfo mVendorHubInfo = null;
    public HubInfo(long p0, android.hardware.location.ContextHubInfo p1) {}
    public HubInfo(long p0, android.hardware.location.ContextHubInfo p1, boolean p2) {}
    public HubInfo(long p0, android.hardware.location.VendorHubInfo p1) {}
    public HubInfo(long p0, android.hardware.location.VendorHubInfo p1, boolean p2) {}
    private HubInfo(android.os.Parcel p0) {}
    public boolean areDataFlowsSupported() { return false; }
    public int describeContents() { return 0; }
    public android.hardware.location.ContextHubInfo getContextHubInfo() { return null; }
    public long getId() { return 0L; }
    public int getType() { return 0; }
    public android.hardware.location.VendorHubInfo getVendorHubInfo() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface HubType {
    }
}
