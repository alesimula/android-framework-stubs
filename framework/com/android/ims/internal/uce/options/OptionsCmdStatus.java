package com.android.ims.internal.uce.options;

public class OptionsCmdStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.options.OptionsCmdStatus> CREATOR = null;
    private com.android.ims.internal.uce.common.CapInfo mCapInfo;
    private com.android.ims.internal.uce.options.OptionsCmdId mCmdId;
    private com.android.ims.internal.uce.common.StatusCode mStatus;
    private int mUserData;
    public OptionsCmdStatus() {}
    private OptionsCmdStatus(android.os.Parcel p0) {}
    public static com.android.ims.internal.uce.options.OptionsCmdStatus getOptionsCmdStatusInstance() { return null; }
    public int describeContents() { return 0; }
    public com.android.ims.internal.uce.common.CapInfo getCapInfo() { return null; }
    public com.android.ims.internal.uce.options.OptionsCmdId getCmdId() { return null; }
    public com.android.ims.internal.uce.common.StatusCode getStatus() { return null; }
    public int getUserData() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setCapInfo(com.android.ims.internal.uce.common.CapInfo p0) {}
    public void setCmdId(com.android.ims.internal.uce.options.OptionsCmdId p0) {}
    public void setStatus(com.android.ims.internal.uce.common.StatusCode p0) {}
    public void setUserData(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
