package android.telephony.ims;

@android.annotation.SystemApi
public final class SipDialogState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ims.SipDialogState> CREATOR = null;
    public static final int STATE_CLOSED = 2;
    public static final int STATE_CONFIRMED = 1;
    public static final int STATE_EARLY = 0;
    private final int mState = 0;
    private SipDialogState(android.os.Parcel p0) {}
    private SipDialogState(android.telephony.ims.SipDialogState.Builder p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getState() { return 0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mState;
        public Builder(int p0) {}
        public android.telephony.ims.SipDialogState build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SipDialogStateCode {
    }
}
