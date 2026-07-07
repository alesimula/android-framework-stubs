package android.view.selectiontoolbar;

public class SelectionToolbarRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.selectiontoolbar.SelectionToolbarRequest> CREATOR = null;
    private android.content.res.Configuration mConfiguration;
    private android.graphics.Rect mContentRect;
    private android.window.InputTransferToken mHostInputToken;
    private boolean mIsLightTheme;
    private boolean mLayoutRequired;
    private java.util.List<android.view.selectiontoolbar.ToolbarMenuItem> mMenuItems;
    private int mSuggestedWidth;
    private android.graphics.Rect mViewPortOnScreen;
    public SelectionToolbarRequest(boolean p0, java.util.List<android.view.selectiontoolbar.ToolbarMenuItem> p1, android.graphics.Rect p2, int p3, android.graphics.Rect p4, android.window.InputTransferToken p5, boolean p6, android.content.res.Configuration p7) {}
    public int describeContents() { return 0; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public android.graphics.Rect getContentRect() { return null; }
    public android.window.InputTransferToken getHostInputToken() { return null; }
    public java.util.List<android.view.selectiontoolbar.ToolbarMenuItem> getMenuItems() { return null; }
    public int getSuggestedWidth() { return 0; }
    public android.graphics.Rect getViewPortOnScreen() { return null; }
    public int hashCode() { return 0; }
    public boolean isLayoutRequired() { return false; }
    public boolean isLightTheme() { return false; }
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
