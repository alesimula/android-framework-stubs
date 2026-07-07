package android.content.pm;

public class ConfigurationInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.ConfigurationInfo> CREATOR = null;
    public static final int GL_ES_VERSION_UNDEFINED = 0;
    public static final int INPUT_FEATURE_FIVE_WAY_NAV = 2;
    public static final int INPUT_FEATURE_HARD_KEYBOARD = 1;
    public int reqGlEsVersion;
    public int reqInputFeatures;
    public int reqKeyboardType;
    public int reqNavigation;
    public int reqTouchScreen;
    public ConfigurationInfo() {}
    public ConfigurationInfo(android.content.pm.ConfigurationInfo p0) {}
    private ConfigurationInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String getGlEsVersion() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
