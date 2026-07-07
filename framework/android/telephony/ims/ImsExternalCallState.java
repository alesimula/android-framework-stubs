package android.telephony.ims;

@android.annotation.SystemApi
public final class ImsExternalCallState implements android.os.Parcelable {
    public static final int CALL_STATE_CONFIRMED = 1;
    public static final int CALL_STATE_TERMINATED = 2;
    public static final android.os.Parcelable.Creator<android.telephony.ims.ImsExternalCallState> CREATOR = null;
    private static final java.lang.String TAG = "ImsExternalCallState";
    private android.net.Uri mAddress;
    private int mCallId;
    private int mCallState;
    private int mCallType;
    private boolean mIsHeld;
    private boolean mIsPullable;
    private android.net.Uri mLocalAddress;
    public ImsExternalCallState() {}
    public ImsExternalCallState(int p0, android.net.Uri p1, android.net.Uri p2, boolean p3, int p4, int p5, boolean p6) {}
    public ImsExternalCallState(int p0, android.net.Uri p1, boolean p2, int p3, int p4, boolean p5) {}
    public ImsExternalCallState(android.os.Parcel p0) {}
    public ImsExternalCallState(java.lang.String p0, android.net.Uri p1, android.net.Uri p2, boolean p3, int p4, int p5, boolean p6) {}
    private int getIdForString(java.lang.String p0) { return 0; }
    public int describeContents() { return 0; }
    public android.net.Uri getAddress() { return null; }
    public int getCallId() { return 0; }
    public int getCallState() { return 0; }
    public int getCallType() { return 0; }
    public android.net.Uri getLocalAddress() { return null; }
    public boolean isCallHeld() { return false; }
    public boolean isCallPullable() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ExternalCallState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ExternalCallType {
    }
}
