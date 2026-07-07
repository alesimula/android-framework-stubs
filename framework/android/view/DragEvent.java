package android.view;

public class DragEvent implements android.os.Parcelable {
    public static final int ACTION_DRAG_ENDED = 4;
    public static final int ACTION_DRAG_ENTERED = 5;
    public static final int ACTION_DRAG_EXITED = 6;
    public static final int ACTION_DRAG_LOCATION = 2;
    public static final int ACTION_DRAG_STARTED = 1;
    public static final int ACTION_DROP = 3;
    public static final android.os.Parcelable.Creator<android.view.DragEvent> CREATOR = null;
    private static final int MAX_RECYCLED = 10;
    private static final boolean TRACK_RECYCLED_LOCATION = false;
    private static final java.lang.Object gRecyclerLock = null;
    private static android.view.DragEvent gRecyclerTop;
    private static int gRecyclerUsed;
    int mAction;
    android.content.ClipData mClipData;
    android.content.ClipDescription mClipDescription;
    private int mDisplayId;
    com.android.internal.view.IDragAndDropPermissions mDragAndDropPermissions;
    boolean mDragResult;
    private android.view.SurfaceControl mDragSurface;
    boolean mEventHandlerWasCalled;
    private int mFlags;
    private int mInputSource;
    java.lang.Object mLocalState;
    private int mMetaState;
    private android.view.DragEvent mNext;
    private float mOffsetX;
    private float mOffsetY;
    private boolean mRecycled;
    private java.lang.RuntimeException mRecycledLocation;
    float mX;
    float mY;
    private DragEvent() {}
    public static java.lang.String actionToString(int p0) { return null; }
    private void init(int p0, float p1, float p2, float p3, float p4, int p5, int p6, int p7, int p8, android.content.ClipDescription p9, android.content.ClipData p10, android.view.SurfaceControl p11, com.android.internal.view.IDragAndDropPermissions p12, java.lang.Object p13, boolean p14) {}
    static android.view.DragEvent obtain() { return null; }
    public static android.view.DragEvent obtain(int p0, float p1, float p2, float p3, float p4, int p5, int p6, int p7, int p8, java.lang.Object p9, android.content.ClipDescription p10, android.content.ClipData p11, android.view.SurfaceControl p12, com.android.internal.view.IDragAndDropPermissions p13, boolean p14) { return null; }
    public static android.view.DragEvent obtain(android.view.DragEvent p0) { return null; }
    public int describeContents() { return 0; }
    public int getAction() { return 0; }
    public android.content.ClipData getClipData() { return null; }
    public android.content.ClipDescription getClipDescription() { return null; }
    public int getDisplayId() { return 0; }
    public com.android.internal.view.IDragAndDropPermissions getDragAndDropPermissions() { return null; }
    public int getDragFlags() { return 0; }
    public android.view.SurfaceControl getDragSurface() { return null; }
    public int getInputSource() { return 0; }
    public java.lang.Object getLocalState() { return null; }
    public int getMetaState() { return 0; }
    public float getOffsetX() { return 0.0f; }
    public float getOffsetY() { return 0.0f; }
    public boolean getResult() { return false; }
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public final void recycle() {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
