package com.android.internal.widget;

public final class VerifyCredentialResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.widget.VerifyCredentialResponse> CREATOR = null;
    public static final com.android.internal.widget.VerifyCredentialResponse OK = null;
    public static final com.android.internal.widget.VerifyCredentialResponse OTHER_ERROR = null;
    private static final int RESPONSE_CRED_ALREADY_TRIED = 3;
    private static final int RESPONSE_CRED_INCORRECT = 4;
    private static final int RESPONSE_CRED_TOO_SHORT = 2;
    private static final int RESPONSE_OK = 0;
    private static final int RESPONSE_OTHER_ERROR = -1;
    private static final int RESPONSE_RETRY = 1;
    private static final java.lang.String TAG = "VerifyCredentialResponse";
    private final byte[] mGatekeeperHAT = null;
    private final long mGatekeeperPasswordHandle = 0L;
    private final int mResponseCode = 0;
    private final java.time.Duration mTimeout = null;
    private VerifyCredentialResponse(int p0, java.time.Duration p1, byte[] p2, long p3) {}
    public static com.android.internal.widget.VerifyCredentialResponse credAlreadyTried() { return null; }
    public static com.android.internal.widget.VerifyCredentialResponse credIncorrect() { return null; }
    public static com.android.internal.widget.VerifyCredentialResponse credIncorrect(java.time.Duration p0) { return null; }
    public static com.android.internal.widget.VerifyCredentialResponse credTooShort() { return null; }
    public static com.android.internal.widget.VerifyCredentialResponse fromError() { return null; }
    private static com.android.internal.widget.VerifyCredentialResponse fromError(int p0) { return null; }
    public static com.android.internal.widget.VerifyCredentialResponse fromGateKeeperResponse(android.service.gatekeeper.GateKeeperResponse p0) { return null; }
    public static com.android.internal.widget.VerifyCredentialResponse fromTimeout(int p0) { return null; }
    public static com.android.internal.widget.VerifyCredentialResponse fromTimeout(java.time.Duration p0) { return null; }
    public boolean containsGatekeeperPasswordHandle() { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public byte[] getGatekeeperHAT() { return null; }
    public long getGatekeeperPasswordHandle() { return 0L; }
    public java.time.Duration getTimeout() { return null; }
    public java.time.Duration getTimeoutAsDuration() { return null; }
    public boolean hasTimeout() { return false; }
    public int hashCode() { return 0; }
    public boolean isCredAlreadyTried() { return false; }
    public boolean isCredCertainlyIncorrect() { return false; }
    public boolean isCredTooShort() { return false; }
    public boolean isMatched() { return false; }
    public boolean isOtherError() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private byte[] mGatekeeperHAT;
        private long mGatekeeperPasswordHandle;
        public Builder() {}
        public com.android.internal.widget.VerifyCredentialResponse build() { return null; }
        public com.android.internal.widget.VerifyCredentialResponse.Builder setGatekeeperHAT(byte[] p0) { return null; }
        public com.android.internal.widget.VerifyCredentialResponse.Builder setGatekeeperPasswordHandle(long p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ResponseCode {
    }
}
