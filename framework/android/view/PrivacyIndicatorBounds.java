package android.view;

public class PrivacyIndicatorBounds implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.PrivacyIndicatorBounds> CREATOR = null;
    private final int mRotation = 0;
    private final android.graphics.Rect[] mStaticBounds = null;
    public PrivacyIndicatorBounds() {}
    protected PrivacyIndicatorBounds(android.os.Parcel p0) {}
    public PrivacyIndicatorBounds(android.graphics.Rect[] p0, int p1) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static android.graphics.Rect insetRect(android.graphics.Rect p0, int p1, int p2, int p3, int p4) { return null; }
    private static android.graphics.Rect scaleRect(android.graphics.Rect p0, float p1) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.Rect getStaticPrivacyIndicatorBounds() { return null; }
    public int hashCode() { return 0; }
    public android.view.PrivacyIndicatorBounds inset(int p0, int p1, int p2, int p3) { return null; }
    public android.view.PrivacyIndicatorBounds rotate(int p0) { return null; }
    public android.view.PrivacyIndicatorBounds scale(float p0) { return null; }
    public java.lang.String toString() { return null; }
    public android.view.PrivacyIndicatorBounds updateBoundsForRotation(android.graphics.Rect p0, int p1) { return null; }
    public android.view.PrivacyIndicatorBounds updateStaticBounds(android.graphics.Rect[] p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
