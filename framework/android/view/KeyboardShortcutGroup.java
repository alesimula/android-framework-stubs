package android.view;

public final class KeyboardShortcutGroup implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.KeyboardShortcutGroup> CREATOR = null;
    private final java.util.List<android.view.KeyboardShortcutInfo> mItems = null;
    private final java.lang.CharSequence mLabel = null;
    private java.lang.CharSequence mPackageName;
    private boolean mSystemGroup;
    private KeyboardShortcutGroup(android.os.Parcel p0) {}
    public KeyboardShortcutGroup(java.lang.CharSequence p0) {}
    public KeyboardShortcutGroup(java.lang.CharSequence p0, java.util.List<android.view.KeyboardShortcutInfo> p1) {}
    public KeyboardShortcutGroup(java.lang.CharSequence p0, java.util.List<android.view.KeyboardShortcutInfo> p1, boolean p2) {}
    public KeyboardShortcutGroup(java.lang.CharSequence p0, boolean p1) {}
    public void addItem(android.view.KeyboardShortcutInfo p0) {}
    public int describeContents() { return 0; }
    public java.util.List<android.view.KeyboardShortcutInfo> getItems() { return null; }
    public java.lang.CharSequence getLabel() { return null; }
    public java.lang.CharSequence getPackageName() { return null; }
    public boolean isSystemGroup() { return false; }
    public void setPackageName(java.lang.CharSequence p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
