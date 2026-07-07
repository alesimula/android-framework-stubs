package com.android.ims.internal.uce.presence;

public class PresCmdStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.presence.PresCmdStatus> CREATOR = null;
    private com.android.ims.internal.uce.presence.PresCmdId mCmdId;
    private int mRequestId;
    private com.android.ims.internal.uce.common.StatusCode mStatus;
    private int mUserData;
    public PresCmdStatus() {}
    private PresCmdStatus(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public com.android.ims.internal.uce.presence.PresCmdId getCmdId() { return null; }
    public int getRequestId() { return 0; }
    public com.android.ims.internal.uce.common.StatusCode getStatus() { return null; }
    public int getUserData() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setCmdId(com.android.ims.internal.uce.presence.PresCmdId p0) {}
    public void setRequestId(int p0) {}
    public void setStatus(com.android.ims.internal.uce.common.StatusCode p0) {}
    public void setUserData(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
