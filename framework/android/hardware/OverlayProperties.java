package android.hardware;

public final class OverlayProperties implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.OverlayProperties> CREATOR = null;
    private static android.hardware.OverlayProperties sDefaultOverlayProperties;
    private java.lang.Runnable mCloser;
    private android.hardware.LutProperties[] mLutProperties;
    private long mNativeObject;
    private OverlayProperties(long p0) {}
    public static android.hardware.OverlayProperties getDefault() { return null; }
    private static native long nCreateDefault();
    private static native long nGetDestructor();
    private static native android.hardware.LutProperties[] nGetLutProperties(long p0);
    private static native boolean nIsCombinationSupported(long p0, int p1, int p2);
    private static native long nReadOverlayPropertiesFromParcel(android.os.Parcel p0);
    private static native boolean nSupportMixedColorSpaces(long p0);
    private static native void nWriteOverlayPropertiesToParcel(long p0, android.os.Parcel p1);
    public int describeContents() { return 0; }
    public android.hardware.LutProperties[] getLutProperties() { return null; }
    public boolean isCombinationSupported(int p0, int p1) { return false; }
    public boolean isMixedColorSpacesSupported() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
