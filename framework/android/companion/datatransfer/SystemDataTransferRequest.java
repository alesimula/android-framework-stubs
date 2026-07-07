package android.companion.datatransfer;

public abstract class SystemDataTransferRequest {
    public static final int DATA_TYPE_PERMISSION_SYNC = 1;
    final int mAssociationId = 0;
    final int mDataType = 0;
    boolean mUserConsented;
    int mUserId;
    SystemDataTransferRequest(int p0, int p1) {}
    SystemDataTransferRequest(android.os.Parcel p0) {}
    public abstract android.companion.datatransfer.SystemDataTransferRequest copyWithNewId(int p0);
    public int describeContents() { return 0; }
    public int getAssociationId() { return 0; }
    public int getDataType() { return 0; }
    public int getUserId() { return 0; }
    public boolean isUserConsented() { return false; }
    public void setUserConsented(boolean p0) {}
    public void setUserId(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
