package android.media.audio.common;

public final class AudioDeviceAddress implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioDeviceAddress> CREATOR = null;
    public static final int alsa = 4;
    public static final int id = 0;
    public static final int ipv4 = 2;
    public static final int ipv6 = 3;
    public static final int mac = 1;
    private int _tag;
    private java.lang.Object _value;
    public AudioDeviceAddress() {}
    private AudioDeviceAddress(int p0, java.lang.Object p1) {}
    private AudioDeviceAddress(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.media.audio.common.AudioDeviceAddress alsa(int[] p0) { return null; }
    public static android.media.audio.common.AudioDeviceAddress id(java.lang.String p0) { return null; }
    public static android.media.audio.common.AudioDeviceAddress ipv4(byte[] p0) { return null; }
    public static android.media.audio.common.AudioDeviceAddress ipv6(int[] p0) { return null; }
    public static android.media.audio.common.AudioDeviceAddress mac(byte[] p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int[] getAlsa() { return null; }
    public java.lang.String getId() { return null; }
    public byte[] getIpv4() { return null; }
    public int[] getIpv6() { return null; }
    public byte[] getMac() { return null; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public int hashCode() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setAlsa(int[] p0) {}
    public void setId(java.lang.String p0) {}
    public void setIpv4(byte[] p0) {}
    public void setIpv6(int[] p0) {}
    public void setMac(byte[] p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int alsa = 4;
        public static final int id = 0;
        public static final int ipv4 = 2;
        public static final int ipv6 = 3;
        public static final int mac = 1;
    }
}
