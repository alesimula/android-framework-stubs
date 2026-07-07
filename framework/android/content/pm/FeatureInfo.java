package android.content.pm;

public class FeatureInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.FeatureInfo> CREATOR = null;
    public static final int FLAG_REQUIRED = 1;
    public static final int GL_ES_VERSION_UNDEFINED = 0;
    public int flags;
    public java.lang.String name;
    public int reqGlEsVersion;
    public int version;
    public FeatureInfo() {}
    public FeatureInfo(android.content.pm.FeatureInfo p0) {}
    private FeatureInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public java.lang.String getGlEsVersion() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
