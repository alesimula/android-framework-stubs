package com.android.internal.policy;

public class KeyguardState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.policy.KeyguardState> CREATOR = null;
    public static final int INTERACTIVE_STATE_AWAKE = 2;
    public static final int INTERACTIVE_STATE_GOING_TO_SLEEP = 3;
    public static final int INTERACTIVE_STATE_SLEEP = 0;
    public static final int INTERACTIVE_STATE_WAKING = 1;
    public static final int SCREEN_STATE_OFF = 0;
    public static final int SCREEN_STATE_ON = 2;
    public static final int SCREEN_STATE_TURNING_OFF = 3;
    public static final int SCREEN_STATE_TURNING_ON = 1;
    public boolean bootCompleted;
    public boolean dreaming;
    public boolean enabled;
    public int interactiveState;
    public boolean occluded;
    public int screenState;
    public boolean systemReady;
    public int userId;
    public KeyguardState() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
