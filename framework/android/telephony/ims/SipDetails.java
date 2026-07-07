package android.telephony.ims;

public final class SipDetails implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ims.SipDetails> CREATOR = null;
    public static final int METHOD_PUBLISH = 2;
    public static final int METHOD_REGISTER = 1;
    public static final int METHOD_SUBSCRIBE = 3;
    public static final int METHOD_UNKNOWN = 0;
    private final java.lang.String mCallId = null;
    private final int mCseq = 0;
    private final int mMethod = 0;
    private final int mReasonHeaderCause = 0;
    private final java.lang.String mReasonHeaderText = null;
    private final int mResponseCode = 0;
    private final java.lang.String mResponsePhrase = null;
    private SipDetails(android.os.Parcel p0) {}
    private SipDetails(android.telephony.ims.SipDetails.Builder p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getCSeq() { return 0; }
    public java.lang.String getCallId() { return null; }
    public int getMethod() { return 0; }
    public int getReasonHeaderCause() { return 0; }
    public java.lang.String getReasonHeaderText() { return null; }
    public int getResponseCode() { return 0; }
    public java.lang.String getResponsePhrase() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mCallId;
        private int mCseq;
        private int mMethod;
        private int mReasonHeaderCause;
        private java.lang.String mReasonHeaderText;
        private int mResponseCode;
        private java.lang.String mResponsePhrase;
        public Builder(int p0) {}
        public android.telephony.ims.SipDetails build() { return null; }
        public android.telephony.ims.SipDetails.Builder setCSeq(int p0) { return null; }
        public android.telephony.ims.SipDetails.Builder setCallId(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDetails.Builder setSipResponseCode(int p0, java.lang.String p1) { return null; }
        public android.telephony.ims.SipDetails.Builder setSipResponseReasonHeader(int p0, java.lang.String p1) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Method {
    }
}
