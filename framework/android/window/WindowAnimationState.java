package android.window;

public class WindowAnimationState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.WindowAnimationState> CREATOR = null;
    public float alpha;
    public float bottomLeftRadius;
    public float bottomRightRadius;
    public android.graphics.RectF bounds;
    public float scale;
    public long timestamp;
    public float topLeftRadius;
    public float topRightRadius;
    public android.graphics.PointF velocityPxPerMs;
    public WindowAnimationState() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
