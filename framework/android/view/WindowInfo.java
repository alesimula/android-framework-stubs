package android.view;

public class WindowInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.WindowInfo> CREATOR = null;
    private static final int MAX_POOL_SIZE = 10;
    private static final android.util.Pools.SynchronizedPool<android.view.WindowInfo> sPool = null;
    public long accessibilityIdOfAnchor;
    public android.os.IBinder activityToken;
    public java.util.List<android.os.IBinder> attachedByWindowTokens;
    public android.os.IBinder attachedToWindowToken;
    public java.util.List<android.os.IBinder> childTokens;
    public int displayId;
    public boolean focused;
    public boolean hasFlagWatchOutsideTouch;
    public boolean inPictureInPicture;
    public int layer;
    public android.os.LocaleList locales;
    public android.view.MagnificationSpec mMagnificationSpec;
    public float[] mTransformMatrix;
    public android.os.IBinder parentToken;
    public android.graphics.Region regionInScreen;
    public int taskId;
    public java.lang.CharSequence title;
    public android.os.IBinder token;
    public int type;
    private WindowInfo() {}
    private void clear() {}
    private void initFromParcel(android.os.Parcel p0) {}
    public static android.view.WindowInfo obtain() { return null; }
    public static android.view.WindowInfo obtain(android.view.WindowInfo p0) { return null; }
    public int describeContents() { return 0; }
    public void recycle() {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
