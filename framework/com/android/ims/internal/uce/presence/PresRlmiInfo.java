package com.android.ims.internal.uce.presence;

public class PresRlmiInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.presence.PresRlmiInfo> CREATOR = null;
    private boolean mFullState;
    private java.lang.String mListName;
    private com.android.ims.internal.uce.presence.PresSubscriptionState mPresSubscriptionState;
    private int mRequestId;
    private int mSubscriptionExpireTime;
    private java.lang.String mSubscriptionTerminatedReason;
    private java.lang.String mUri;
    private int mVersion;
    public PresRlmiInfo() {}
    private PresRlmiInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String getListName() { return null; }
    public com.android.ims.internal.uce.presence.PresSubscriptionState getPresSubscriptionState() { return null; }
    public int getRequestId() { return 0; }
    public int getSubscriptionExpireTime() { return 0; }
    public java.lang.String getSubscriptionTerminatedReason() { return null; }
    public java.lang.String getUri() { return null; }
    public int getVersion() { return 0; }
    public boolean isFullState() { return false; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setFullState(boolean p0) {}
    public void setListName(java.lang.String p0) {}
    public void setPresSubscriptionState(com.android.ims.internal.uce.presence.PresSubscriptionState p0) {}
    public void setRequestId(int p0) {}
    public void setSubscriptionExpireTime(int p0) {}
    public void setSubscriptionTerminatedReason(java.lang.String p0) {}
    public void setUri(java.lang.String p0) {}
    public void setVersion(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
