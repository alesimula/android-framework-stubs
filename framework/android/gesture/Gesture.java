package android.gesture;

public class Gesture implements android.os.Parcelable {
    private static final boolean BITMAP_RENDERING_ANTIALIAS = true;
    private static final boolean BITMAP_RENDERING_DITHER = true;
    private static final int BITMAP_RENDERING_WIDTH = 2;
    public static final android.os.Parcelable.Creator<android.gesture.Gesture> CREATOR = null;
    private static final long GESTURE_ID_BASE = Long.valueOf(0L);
    private static final java.util.concurrent.atomic.AtomicInteger sGestureCount = null;
    private final android.graphics.RectF mBoundingBox = null;
    private long mGestureID;
    private final java.util.ArrayList<android.gesture.GestureStroke> mStrokes = null;
    public Gesture() {}
    static android.gesture.Gesture deserialize(java.io.DataInputStream p0) throws java.io.IOException { return null; }
    public void addStroke(android.gesture.GestureStroke p0) {}
    public java.lang.Object clone() { return null; }
    public int describeContents() { return 0; }
    public android.graphics.RectF getBoundingBox() { return null; }
    public long getID() { return 0L; }
    public float getLength() { return 0.0f; }
    public java.util.ArrayList<android.gesture.GestureStroke> getStrokes() { return null; }
    public int getStrokesCount() { return 0; }
    void serialize(java.io.DataOutputStream p0) throws java.io.IOException {}
    void setID(long p0) {}
    public android.graphics.Bitmap toBitmap(int p0, int p1, int p2, int p3) { return null; }
    public android.graphics.Bitmap toBitmap(int p0, int p1, int p2, int p3, int p4) { return null; }
    public android.graphics.Path toPath() { return null; }
    public android.graphics.Path toPath(int p0, int p1, int p2, int p3) { return null; }
    public android.graphics.Path toPath(android.graphics.Path p0) { return null; }
    public android.graphics.Path toPath(android.graphics.Path p0, int p1, int p2, int p3, int p4) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
