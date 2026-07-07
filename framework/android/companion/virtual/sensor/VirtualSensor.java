package android.companion.virtual.sensor;

@android.annotation.SystemApi
public final class VirtualSensor implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.virtual.sensor.VirtualSensor> CREATOR = null;
    private final java.lang.Object mAdditionalInfoLock = null;
    private final int mFlags = 0;
    private final int mHandle = 0;
    private final java.lang.String mName = null;
    private final android.os.IBinder mToken = null;
    private final int mType = 0;
    private final android.companion.virtual.IVirtualDevice mVirtualDevice = null;
    public VirtualSensor(int p0, int p1, java.lang.String p2) {}
    public VirtualSensor(int p0, int p1, java.lang.String p2, int p3, android.companion.virtual.IVirtualDevice p4, android.os.IBinder p5) {}
    public VirtualSensor(int p0, int p1, java.lang.String p2, android.companion.virtual.IVirtualDevice p3, android.os.IBinder p4) {}
    private VirtualSensor(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getDeviceId() { return 0; }
    public int getHandle() { return 0; }
    public java.lang.String getName() { return null; }
    public int getType() { return 0; }
    public void sendAdditionalInfo(android.companion.virtual.sensor.VirtualSensorAdditionalInfo p0) {}
    public void sendEvent(android.companion.virtual.sensor.VirtualSensorEvent p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
