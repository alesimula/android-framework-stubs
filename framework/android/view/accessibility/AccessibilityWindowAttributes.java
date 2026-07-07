package android.view.accessibility;

public final class AccessibilityWindowAttributes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityWindowAttributes> CREATOR = null;
    private final android.os.LocaleList mLocales = null;
    private final java.lang.CharSequence mWindowTitle = null;
    private AccessibilityWindowAttributes(android.os.Parcel p0) {}
    public AccessibilityWindowAttributes(android.view.WindowManager.LayoutParams p0, android.os.LocaleList p1) {}
    private java.lang.CharSequence populateWindowTitle(android.view.WindowManager.LayoutParams p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.LocaleList getLocales() { return null; }
    public java.lang.CharSequence getWindowTitle() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
