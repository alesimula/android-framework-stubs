package android.media;

@android.annotation.SystemApi
public final class AudioDeviceAttributes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioDeviceAttributes> CREATOR = null;
    public static final int ROLE_INPUT = 1;
    public static final int ROLE_OUTPUT = 2;
    private java.lang.String mAddress;
    private final java.util.List<android.media.AudioDescriptor> mAudioDescriptors = null;
    private final java.util.List<android.media.AudioProfile> mAudioProfiles = null;
    private final java.lang.String mName = null;
    private final int mNativeType = 0;
    private final int mRole = 0;
    private final int mType = 0;
    private AudioDeviceAttributes(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4, java.util.List<android.media.AudioProfile> p5, java.util.List<android.media.AudioDescriptor> p6) {}
    @android.annotation.SystemApi
    public AudioDeviceAttributes(int p0, int p1, java.lang.String p2) {}
    @android.annotation.SystemApi
    public AudioDeviceAttributes(int p0, int p1, java.lang.String p2, java.lang.String p3, java.util.List<android.media.AudioProfile> p4, java.util.List<android.media.AudioDescriptor> p5) {}
    public AudioDeviceAttributes(int p0, java.lang.String p1) {}
    public AudioDeviceAttributes(int p0, java.lang.String p1, int p2, java.lang.String p3, java.util.List<android.media.AudioProfile> p4, java.util.List<android.media.AudioDescriptor> p5) {}
    public AudioDeviceAttributes(int p0, java.lang.String p1, java.lang.String p2) {}
    public AudioDeviceAttributes(android.media.AudioDeviceAttributes p0) {}
    @android.annotation.SystemApi
    public AudioDeviceAttributes(android.media.AudioDeviceInfo p0) {}
    private AudioDeviceAttributes(android.os.Parcel p0) {}
    public static java.lang.String roleToString(int p0) { return null; }
    public android.media.AudioDeviceAttributes createFromTypeAndAddress() { return null; }
    public int describeContents() { return 0; }
    public boolean equalTypeAddress(java.lang.Object p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    @android.annotation.SystemApi
    public java.lang.String getAddress() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.media.AudioDescriptor> getAudioDescriptors() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.media.AudioProfile> getAudioProfiles() { return null; }
    public int getInternalType() { return 0; }
    @android.annotation.SystemApi
    public java.lang.String getName() { return null; }
    @android.annotation.SystemApi
    public int getRole() { return 0; }
    @android.annotation.SystemApi
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public void setAddress(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Role {
    }
}
