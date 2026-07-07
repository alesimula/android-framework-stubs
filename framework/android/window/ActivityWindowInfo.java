package android.window;

public final class ActivityWindowInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.ActivityWindowInfo> CREATOR = null;
    private boolean mIsEmbedded;
    private final android.graphics.Rect mTaskBounds = null;
    private final android.graphics.Rect mTaskFragmentBounds = null;
    public ActivityWindowInfo() {}
    private ActivityWindowInfo(android.os.Parcel p0) {}
    public ActivityWindowInfo(android.window.ActivityWindowInfo p0) {}
    public static android.window.ActivityWindowInfo getActivityWindowInfo(android.app.Activity p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.Rect getTaskBounds() { return null; }
    public android.graphics.Rect getTaskFragmentBounds() { return null; }
    public int hashCode() { return 0; }
    public boolean isEmbedded() { return false; }
    public void set(android.window.ActivityWindowInfo p0) {}
    public void set(boolean p0, android.graphics.Rect p1, android.graphics.Rect p2) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
