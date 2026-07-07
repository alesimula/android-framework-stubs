package android.view.selectiontoolbar;

public class ShowInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.selectiontoolbar.ShowInfo> CREATOR = null;
    public android.content.res.Configuration configuration;
    public android.graphics.Rect contentRect;
    public android.os.IBinder hostInputToken;
    public boolean isLightTheme;
    public boolean layoutRequired;
    public java.util.List<android.view.selectiontoolbar.ToolbarMenuItem> menuItems;
    public int sequenceNumber;
    public int suggestedWidth;
    public android.graphics.Rect viewPortOnScreen;
    public ShowInfo() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
