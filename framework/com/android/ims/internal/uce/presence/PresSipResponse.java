package com.android.ims.internal.uce.presence;

public class PresSipResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.presence.PresSipResponse> CREATOR = null;
    private com.android.ims.internal.uce.presence.PresCmdId mCmdId;
    private java.lang.String mReasonHeader;
    private java.lang.String mReasonPhrase;
    private int mRequestId;
    private int mRetryAfter;
    private int mSipResponseCode;
    public PresSipResponse() {}
    private PresSipResponse(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public com.android.ims.internal.uce.presence.PresCmdId getCmdId() { return null; }
    public java.lang.String getReasonHeader() { return null; }
    public java.lang.String getReasonPhrase() { return null; }
    public int getRequestId() { return 0; }
    public int getRetryAfter() { return 0; }
    public int getSipResponseCode() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setCmdId(com.android.ims.internal.uce.presence.PresCmdId p0) {}
    public void setReasonHeader(java.lang.String p0) {}
    public void setReasonPhrase(java.lang.String p0) {}
    public void setRequestId(int p0) {}
    public void setRetryAfter(int p0) {}
    public void setSipResponseCode(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
