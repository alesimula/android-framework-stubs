package android.view;

public class InsetsBoundingRect implements android.os.Parcelable {
    private static final int ALIGNMENT_MASK_HORIZONTAL = 5;
    private static final int ALIGNMENT_MASK_VERTICAL = 10;
    private static final int CENTER_HORIZONTAL = 0;
    private static final int CENTER_VERTICAL = 0;
    public static final android.os.Parcelable.Creator<android.view.InsetsBoundingRect> CREATOR = null;
    private final int mAlignment = 0;
    private int mHeight;
    private int mWidth;
    private int mX;
    private int mY;
    public InsetsBoundingRect(int p0, int p1, int p2, int p3, int p4) {}
    public InsetsBoundingRect(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void scale(float p0) {}
    public void toRect(android.graphics.Rect p0, android.graphics.Rect p1) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
