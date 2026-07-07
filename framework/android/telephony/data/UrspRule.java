package android.telephony.data;

public final class UrspRule implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.data.UrspRule> CREATOR = null;
    public static final int MAX_URSP_PRECEDENCE = 255;
    public static final int MIN_URSP_PRECEDENCE = 0;
    private final int mPrecedence = 0;
    private final java.util.List<android.telephony.data.RouteSelectionDescriptor> mRouteSelectionDescriptor = null;
    private final java.util.List<android.telephony.data.TrafficDescriptor> mTrafficDescriptors = null;
    public UrspRule(int p0, java.util.List<android.telephony.data.TrafficDescriptor> p1, java.util.List<android.telephony.data.RouteSelectionDescriptor> p2) {}
    private UrspRule(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getPrecedence() { return 0; }
    public java.util.List<android.telephony.data.RouteSelectionDescriptor> getRouteSelectionDescriptor() { return null; }
    public java.util.List<android.telephony.data.TrafficDescriptor> getTrafficDescriptors() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
