package android.hardware.input;

public class AidlInputGestureData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.AidlInputGestureData> CREATOR = null;
    public boolean allowCaptureByFocusedWindow;
    public java.lang.String appLaunchCategory;
    public java.lang.String appLaunchClassName;
    public java.lang.String appLaunchPackageName;
    public java.lang.String appLaunchRole;
    public int gestureType;
    public android.hardware.input.AidlInputGestureData.Trigger trigger;
    public AidlInputGestureData() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class KeyTrigger implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.input.AidlInputGestureData.KeyTrigger> CREATOR = null;
        public int keycode;
        public int modifierState;
        public KeyTrigger() {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class TouchpadGestureTrigger implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.input.AidlInputGestureData.TouchpadGestureTrigger> CREATOR = null;
        public int gestureType;
        public TouchpadGestureTrigger() {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class Trigger implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.input.AidlInputGestureData.Trigger> CREATOR = null;
        public static final int key = 0;
        public static final int touchpadGesture = 1;
        private int _tag;
        private java.lang.Object _value;
        public Trigger() {}
        private Trigger(int p0, java.lang.Object p1) {}
        private Trigger(android.os.Parcel p0) {}
        private void _assertTag(int p0) {}
        private void _set(int p0, java.lang.Object p1) {}
        private java.lang.String _tagString(int p0) { return null; }
        private int describeContents(java.lang.Object p0) { return 0; }
        public static android.hardware.input.AidlInputGestureData.Trigger key(android.hardware.input.AidlInputGestureData.KeyTrigger p0) { return null; }
        public static android.hardware.input.AidlInputGestureData.Trigger touchpadGesture(android.hardware.input.AidlInputGestureData.TouchpadGestureTrigger p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.hardware.input.AidlInputGestureData.KeyTrigger getKey() { return null; }
        public int getTag() { return 0; }
        public android.hardware.input.AidlInputGestureData.TouchpadGestureTrigger getTouchpadGesture() { return null; }
        public int hashCode() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void setKey(android.hardware.input.AidlInputGestureData.KeyTrigger p0) {}
        public void setTouchpadGesture(android.hardware.input.AidlInputGestureData.TouchpadGestureTrigger p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}

        public static @interface Tag {
            public static final int key = 0;
            public static final int touchpadGesture = 1;
        }
    }
}
