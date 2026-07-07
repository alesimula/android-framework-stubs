package android.app.admin.dataleakprevention;

public final class TransferAction implements android.os.Parcelable {
    public static final int ACTION_TYPE_DATA_TRANSFER = 1;
    public static final int ACTION_TYPE_SCREEN_CAPTURE = 2;
    public static final android.os.Parcelable.Creator<android.app.admin.dataleakprevention.TransferAction> CREATOR = null;
    private final int mActionType = 0;
    public TransferAction(int p0) {}
    private TransferAction(android.os.Parcel p0) {}
    private void checkActionType(int p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getActionType() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActionType {
    }
}
