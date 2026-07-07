package android.hardware.display;

public final class HdrConversionMode implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.display.HdrConversionMode> CREATOR = null;
    public static final int HDR_CONVERSION_FORCE = 3;
    public static final int HDR_CONVERSION_PASSTHROUGH = 1;
    public static final int HDR_CONVERSION_SYSTEM = 2;
    public static final int HDR_CONVERSION_UNSUPPORTED = 0;
    private final int mConversionMode = 0;
    private int mPreferredHdrOutputType;
    public HdrConversionMode(int p0) {}
    public HdrConversionMode(int p0, int p1) {}
    private HdrConversionMode(android.os.Parcel p0) {}
    private boolean equals(android.hardware.display.HdrConversionMode p0) { return false; }
    private static java.lang.String hdrConversionModeString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getConversionMode() { return 0; }
    public int getPreferredHdrOutputType() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConversionMode {
    }
}
