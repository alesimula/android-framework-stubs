package android.security.keystore;

public class KeystoreResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.keystore.KeystoreResponse> CREATOR = null;
    public final int error_code_ = 0;
    public final java.lang.String error_msg_ = null;
    protected KeystoreResponse(int p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public final int getErrorCode() { return 0; }
    public final java.lang.String getErrorMessage() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
