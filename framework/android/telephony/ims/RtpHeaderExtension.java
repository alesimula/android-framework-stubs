package android.telephony.ims;

@android.annotation.SystemApi
public final class RtpHeaderExtension implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ims.RtpHeaderExtension> CREATOR = null;
    private byte[] mExtensionData;
    private int mLocalIdentifier;
    public RtpHeaderExtension(int p0, byte[] p1) {}
    private RtpHeaderExtension(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public byte[] getExtensionData() { return null; }
    public int getLocalIdentifier() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
