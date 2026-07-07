package android.graphics;

public class RectF implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.graphics.RectF> CREATOR = null;
    public float bottom;
    public float left;
    public float right;
    public float top;
    public RectF() {}
    public RectF(float p0, float p1, float p2, float p3) {}
    public RectF(android.graphics.Rect p0) {}
    public RectF(android.graphics.RectF p0) {}
    public static boolean intersects(android.graphics.RectF p0, android.graphics.RectF p1) { return false; }
    public final float centerX() { return 0.0f; }
    public final float centerY() { return 0.0f; }
    public boolean contains(float p0, float p1) { return false; }
    public boolean contains(float p0, float p1, float p2, float p3) { return false; }
    public boolean contains(android.graphics.RectF p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final float height() { return 0.0f; }
    public void inset(float p0, float p1) {}
    public boolean intersect(float p0, float p1, float p2, float p3) { return false; }
    public boolean intersect(android.graphics.RectF p0) { return false; }
    public boolean intersects(float p0, float p1, float p2, float p3) { return false; }
    public final boolean isEmpty() { return false; }
    public void offset(float p0, float p1) {}
    public void offsetTo(float p0, float p1) {}
    public void printShortString(java.io.PrintWriter p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public void round(android.graphics.Rect p0) {}
    public void roundOut(android.graphics.Rect p0) {}
    public void scale(float p0) {}
    public void set(float p0, float p1, float p2, float p3) {}
    public void set(android.graphics.Rect p0) {}
    public void set(android.graphics.RectF p0) {}
    public void setEmpty() {}
    public boolean setIntersect(android.graphics.RectF p0, android.graphics.RectF p1) { return false; }
    public void sort() {}
    public java.lang.String toShortString() { return null; }
    public java.lang.String toShortString(java.lang.StringBuilder p0) { return null; }
    public java.lang.String toString() { return null; }
    public void union(float p0, float p1) {}
    public void union(float p0, float p1, float p2, float p3) {}
    public void union(android.graphics.RectF p0) {}
    public final float width() { return 0.0f; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
