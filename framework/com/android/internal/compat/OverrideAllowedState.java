package com.android.internal.compat;

public final class OverrideAllowedState implements android.os.Parcelable {
    public static final int ALLOWED = 0;
    public static final android.os.Parcelable.Creator<com.android.internal.compat.OverrideAllowedState> CREATOR = null;
    public static final int DEFERRED_VERIFICATION = 4;
    public static final int DISABLED_NON_TARGET_SDK = 2;
    public static final int DISABLED_NOT_DEBUGGABLE = 1;
    public static final int DISABLED_TARGET_SDK_TOO_HIGH = 3;
    public static final int LOGGING_ONLY_CHANGE = 5;
    public static final int PLATFORM_TOO_OLD = 6;
    public final int appTargetSdk = 0;
    public final int changeIdTargetSdk = 0;
    public final int state = 0;
    public OverrideAllowedState(int p0, int p1, int p2) {}
    private OverrideAllowedState(android.os.Parcel p0) {}
    private java.lang.String stateName() { return null; }
    public int describeContents() { return 0; }
    public void enforce(long p0, java.lang.String p1) throws java.lang.SecurityException {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
