package android.app.customization.clock;

public final class ClockInstance implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.customization.clock.ClockInstance> CREATOR = null;
    private final java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> mAssets = null;
    private final android.app.customization.clock.ClockDescription mClockDescription = null;
    public ClockInstance(android.app.customization.clock.ClockDescription p0, java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> p1) {}
    ClockInstance(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> getAssets() { return null; }
    public android.app.customization.clock.ClockDescription getClockDescription() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
