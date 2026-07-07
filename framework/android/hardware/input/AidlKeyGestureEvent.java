package android.hardware.input;

public class AidlKeyGestureEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.AidlKeyGestureEvent> CREATOR = null;
    public int action;
    public java.lang.String appLaunchCategory;
    public java.lang.String appLaunchClassName;
    public java.lang.String appLaunchPackageName;
    public java.lang.String appLaunchRole;
    public android.hardware.input.AidlCustomizationAction customizationAction;
    public int deviceId;
    public int displayId;
    public int flags;
    public int gestureType;
    public int[] keycodes;
    public int modifierState;
    public AidlKeyGestureEvent() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
