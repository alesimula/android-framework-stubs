package android.accessibilityservice;

public final class AccessibilityGestureEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.accessibilityservice.AccessibilityGestureEvent> CREATOR = null;
    private final int mDisplayId = 0;
    private final int mGestureId = 0;
    private java.util.List<android.view.MotionEvent> mMotionEvents;
    public AccessibilityGestureEvent(int p0, int p1) {}
    public AccessibilityGestureEvent(int p0, int p1, java.util.List<android.view.MotionEvent> p2) {}
    private AccessibilityGestureEvent(android.os.Parcel p0) {}
    public static java.lang.String gestureIdToString(int p0) { return null; }
    public android.accessibilityservice.AccessibilityGestureEvent copyForAsync() { return null; }
    public int describeContents() { return 0; }
    public int getDisplayId() { return 0; }
    public int getGestureId() { return 0; }
    public java.util.List<android.view.MotionEvent> getMotionEvents() { return null; }
    public void recycle() {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GestureId {
    }
}
