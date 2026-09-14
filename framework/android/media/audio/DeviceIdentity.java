package android.media.audio;

public class DeviceIdentity implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.DeviceIdentity> CREATOR = null;
    public final java.lang.String address = null;
    public final int role = 0;
    public final int type = 0;
    public DeviceIdentity(int p0, int p1, java.lang.String p2) {}
    private static android.media.audio.DeviceIdentity internalCreateFromParcel(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String address;
        private int role;
        private int type;
        public Builder() {}
        public android.media.audio.DeviceIdentity build() { return null; }
        public android.media.audio.DeviceIdentity.Builder setAddress(java.lang.String p0) { return null; }
        public android.media.audio.DeviceIdentity.Builder setRole(int p0) { return null; }
        public android.media.audio.DeviceIdentity.Builder setType(int p0) { return null; }
    }
}
