package android.view;

public final class DragAndDropPermissions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.DragAndDropPermissions> CREATOR = null;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "DragAndDrop";
    private final com.android.internal.view.IDragAndDropPermissions mDragAndDropPermissions = null;
    private DragAndDropPermissions(android.os.Parcel p0) {}
    private DragAndDropPermissions(com.android.internal.view.IDragAndDropPermissions p0) {}
    public static android.view.DragAndDropPermissions obtain(android.view.DragEvent p0) { return null; }
    public int describeContents() { return 0; }
    public void release() {}
    public boolean take(android.os.IBinder p0) { return false; }
    public boolean takeTransient() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
