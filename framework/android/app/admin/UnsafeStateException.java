package android.app.admin;

public final class UnsafeStateException extends java.lang.IllegalStateException implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.admin.UnsafeStateException> CREATOR = null;
    private final int mOperation = 0;
    private final int mReason = 0;
    public UnsafeStateException(int p0, int p1) { super(); }
    public int describeContents() { return 0; }
    public java.lang.String getMessage() { return null; }
    public int getOperation() { return 0; }
    public java.util.List<java.lang.Integer> getReasons() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
