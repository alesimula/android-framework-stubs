package android.view;

public final class VerifiedKeyEvent extends android.view.VerifiedInputEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.VerifiedKeyEvent> CREATOR = null;
    private static final java.lang.String TAG = "VerifiedKeyEvent";
    private int mAction;
    private long mDownTimeNanos;
    private int mFlags;
    private int mKeyCode;
    private int mMetaState;
    private int mRepeatCount;
    private int mScanCode;
    public VerifiedKeyEvent(int p0, long p1, int p2, int p3, int p4, long p5, int p6, int p7, int p8, int p9, int p10) { super((android.os.Parcel)null, 0); }
    VerifiedKeyEvent(android.os.Parcel p0) { super((android.os.Parcel)null, 0); }
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAction() { return 0; }
    public long getDownTimeNanos() { return 0L; }
    public java.lang.Boolean getFlag(int p0) { return null; }
    public int getFlags() { return 0; }
    public int getKeyCode() { return 0; }
    public int getMetaState() { return 0; }
    public int getRepeatCount() { return 0; }
    public int getScanCode() { return 0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface KeyEventAction {
    }
}
