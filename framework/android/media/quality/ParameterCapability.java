package android.media.quality;

public final class ParameterCapability implements android.os.Parcelable {
    public static final java.lang.String CAPABILITY_DEFAULT = "default";
    public static final java.lang.String CAPABILITY_ENUM = "enum";
    public static final java.lang.String CAPABILITY_MAX = "max";
    public static final java.lang.String CAPABILITY_MIN = "min";
    public static final android.os.Parcelable.Creator<android.media.quality.ParameterCapability> CREATOR = null;
    public static final int TYPE_DOUBLE = 3;
    public static final int TYPE_INT = 1;
    public static final int TYPE_LONG = 2;
    public static final int TYPE_NONE = 0;
    public static final int TYPE_STRING = 4;
    private final android.os.Bundle mCaps = null;
    private final boolean mIsMutable = false;
    private final boolean mIsSupported = false;
    private final java.lang.String mName = null;
    private final int mType = 0;
    protected ParameterCapability(android.os.Parcel p0) {}
    public ParameterCapability(java.lang.String p0, boolean p1, boolean p2, int p3, android.os.Bundle p4) {}
    public int describeContents() { return 0; }
    public android.os.Bundle getCapabilities() { return null; }
    public java.lang.String getParameterName() { return null; }
    public int getParameterType() { return 0; }
    public boolean isMutable() { return false; }
    public boolean isSupported() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Capability {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ParameterType {
    }
}
