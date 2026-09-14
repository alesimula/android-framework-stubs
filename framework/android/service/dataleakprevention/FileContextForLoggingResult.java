package android.service.dataleakprevention;

public class FileContextForLoggingResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.dataleakprevention.FileContextForLoggingResult> CREATOR = null;
    public byte[] contentSha256Hash;
    public java.lang.String mimeType;
    public FileContextForLoggingResult() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
