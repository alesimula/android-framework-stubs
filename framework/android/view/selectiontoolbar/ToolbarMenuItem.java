package android.view.selectiontoolbar;

public class ToolbarMenuItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.selectiontoolbar.ToolbarMenuItem> CREATOR = null;
    public static final int PRIORITY_OVERFLOW = 2;
    public static final int PRIORITY_PRIMARY = 1;
    public static final int PRIORITY_UNKNOWN = 0;
    public java.lang.CharSequence contentDescription;
    public int groupId;
    public android.graphics.drawable.Icon icon;
    public int itemId;
    public int itemIndex;
    public int priority;
    public java.lang.CharSequence title;
    public java.lang.CharSequence tooltipText;
    public ToolbarMenuItem() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
