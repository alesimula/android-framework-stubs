package com.android.internal.compat;

public class CompatibilityChangeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.compat.CompatibilityChangeInfo> CREATOR = null;
    private final long mChangeId = 0L;
    private final java.lang.String mDescription = null;
    private final boolean mDisabled = false;
    private final int mEnableSinceTargetSdk = 0;
    private final boolean mLoggingOnly = false;
    private final java.lang.String mName = null;
    private final boolean mNoLogging = false;
    private final boolean mOverridable = false;
    private CompatibilityChangeInfo(android.os.Parcel p0) {}
    public CompatibilityChangeInfo(com.android.internal.compat.CompatibilityChangeInfo p0) {}
    public CompatibilityChangeInfo(java.lang.Long p0, java.lang.String p1, int p2, int p3, boolean p4, boolean p5, boolean p6, java.lang.String p7, boolean p8) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getDescription() { return null; }
    public boolean getDisabled() { return false; }
    public int getEnableSinceTargetSdk() { return 0; }
    public long getId() { return 0L; }
    public boolean getLoggingOnly() { return false; }
    public java.lang.String getName() { return null; }
    public boolean getNoLogging() { return false; }
    public boolean getOverridable() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
