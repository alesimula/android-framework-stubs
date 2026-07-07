package android.hardware.input;

public final class AidlCustomizationAction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.AidlCustomizationAction> CREATOR = null;
    public static final int appAction = 1;
    public static final int simpleAction = 0;
    public static final int uriAction = 2;
    private int _tag;
    private java.lang.Object _value;
    public AidlCustomizationAction() {}
    private AidlCustomizationAction(int p0, java.lang.Object p1) {}
    private AidlCustomizationAction(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.input.AidlCustomizationAction appAction(android.hardware.input.AidlAppAction p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.input.AidlCustomizationAction simpleAction(android.hardware.input.AidlSimpleAction p0) { return null; }
    public static android.hardware.input.AidlCustomizationAction uriAction(android.hardware.input.AidlUriAction p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.hardware.input.AidlAppAction getAppAction() { return null; }
    public android.hardware.input.AidlSimpleAction getSimpleAction() { return null; }
    public int getTag() { return 0; }
    public android.hardware.input.AidlUriAction getUriAction() { return null; }
    public int hashCode() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setAppAction(android.hardware.input.AidlAppAction p0) {}
    public void setSimpleAction(android.hardware.input.AidlSimpleAction p0) {}
    public void setUriAction(android.hardware.input.AidlUriAction p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int appAction = 1;
        public static final int simpleAction = 0;
        public static final int uriAction = 2;
    }
}
