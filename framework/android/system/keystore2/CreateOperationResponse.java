package android.system.keystore2;

public class CreateOperationResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.system.keystore2.CreateOperationResponse> CREATOR = null;
    public android.system.keystore2.IKeystoreOperation iOperation;
    public android.system.keystore2.OperationChallenge operationChallenge;
    public android.system.keystore2.KeyParameters parameters;
    public byte[] upgradedBlob;
    public CreateOperationResponse() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
