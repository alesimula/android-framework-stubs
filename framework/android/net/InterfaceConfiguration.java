package android.net;

public class InterfaceConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.InterfaceConfiguration> CREATOR = null;
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    private static final java.lang.String FLAG_DOWN = "down";
    private static final java.lang.String FLAG_UP = "up";
    private java.util.HashSet<java.lang.String> mFlags;
    private java.lang.String mHwAddr;
    public InterfaceConfiguration() {}
    private static void validateFlag(java.lang.String p0) {}
    public void clearFlag(java.lang.String p0) {}
    public int describeContents() { return 0; }
    public java.lang.Iterable<java.lang.String> getFlags() { return null; }
    public java.lang.String getHardwareAddress() { return null; }
    public android.net.LinkAddress getLinkAddress() { return null; }
    public boolean hasFlag(java.lang.String p0) { return false; }
    public void ignoreInterfaceUpDownStatus() {}
    public boolean isActive() { return false; }
    public boolean isUp() { return false; }
    public void setFlag(java.lang.String p0) {}
    public void setHardwareAddress(java.lang.String p0) {}
    public void setInterfaceDown() {}
    public void setInterfaceUp() {}
    public void setLinkAddress(android.net.LinkAddress p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
