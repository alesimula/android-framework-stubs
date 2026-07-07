package android.apex;

public class ApexInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.apex.ApexInfo> CREATOR = null;
    public boolean activeApexChanged;
    public boolean hasClassPathJars;
    public boolean isActive;
    public boolean isFactory;
    public java.lang.String moduleName;
    public java.lang.String modulePath;
    public byte partition;
    public java.lang.String preinstalledModulePath;
    public long versionCode;
    public java.lang.String versionName;
    public ApexInfo() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Partition {
        public static final byte ODM = 4;
        public static final byte PRODUCT = 2;
        public static final byte SYSTEM = 0;
        public static final byte SYSTEM_EXT = 1;
        public static final byte VENDOR = 3;
    }
}
