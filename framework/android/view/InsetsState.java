package android.view;

public class InsetsState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.InsetsState> CREATOR = null;
    private final android.view.DisplayCutout.ParcelableWrapper mDisplayCutout = null;
    private final android.graphics.Rect mDisplayFrame = null;
    private android.view.DisplayShape mDisplayShape;
    private android.view.PrivacyIndicatorBounds mPrivacyIndicatorBounds;
    private final android.graphics.Rect mRoundedCornerFrame = null;
    private android.view.RoundedCorners mRoundedCorners;
    private int mSeq;
    private final android.util.SparseArray<android.view.InsetsSource> mSources = null;
    public InsetsState() {}
    public InsetsState(android.os.Parcel p0) {}
    public InsetsState(android.view.InsetsState p0) {}
    public InsetsState(android.view.InsetsState p0, boolean p1) {}
    private android.view.DisplayCutout calculateRelativeCutout(android.graphics.Rect p0) { return null; }
    private android.view.DisplayShape calculateRelativeDisplayShape(android.graphics.Rect p0) { return null; }
    private android.view.PrivacyIndicatorBounds calculateRelativePrivacyIndicatorBounds(android.graphics.Rect p0) { return null; }
    private android.view.RoundedCorners calculateRelativeRoundedCorners(android.graphics.Rect p0, android.graphics.Rect p1) { return null; }
    private static boolean canControlSource(android.graphics.Rect p0, android.graphics.Rect p1, android.view.InsetsSource p2) { return false; }
    public static boolean clearsCompatInsets(int p0, int p1, int p2, int p3) { return false; }
    private static android.graphics.Rect[] concatenate(android.graphics.Rect[] p0, android.graphics.Rect[] p1) { return null; }
    private void processSource(android.view.InsetsSource p0, android.graphics.Rect p1, android.graphics.Rect p2, boolean p3, android.graphics.Insets[] p4, android.util.SparseIntArray p5, boolean[] p6, android.graphics.Rect[][] p7) {}
    private void processSourceAsPublicType(android.view.InsetsSource p0, android.graphics.Insets[] p1, android.util.SparseIntArray p2, boolean[] p3, android.graphics.Rect[][] p4, android.graphics.Insets p5, android.graphics.Rect[] p6, int p7) {}
    public static void traverse(android.view.InsetsState p0, android.view.InsetsState p1, android.view.InsetsState.OnTraverseCallbacks p2) {}
    public void addSource(android.view.InsetsSource p0) {}
    public android.graphics.Insets calculateInsets(android.graphics.Rect p0, android.graphics.Rect p1, int p2, int p3) { return null; }
    public android.graphics.Insets calculateInsets(android.graphics.Rect p0, android.graphics.Rect p1, int p2, boolean p3) { return null; }
    public android.view.WindowInsets calculateInsets(android.graphics.Rect p0, android.graphics.Rect p1, android.view.InsetsState p2, boolean p3, int p4, int p5, int p6, int p7, int p8, android.util.SparseIntArray p9) { return null; }
    public int calculateUncontrollableInsetsFromFrame(android.graphics.Rect p0, android.graphics.Rect p1) { return 0; }
    public android.graphics.Insets calculateVisibleInsets(android.graphics.Rect p0, android.graphics.Rect p1, int p2, int p3, int p4, int p5, int p6) { return null; }
    public int describeContents() { return 0; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean equals(java.lang.Object p0, boolean p1, boolean p2, boolean p3) { return false; }
    public android.view.DisplayCutout getDisplayCutout() { return null; }
    public void getDisplayCutoutSafe(android.graphics.Rect p0) {}
    public android.graphics.Rect getDisplayFrame() { return null; }
    public android.view.DisplayShape getDisplayShape() { return null; }
    public android.view.InsetsSource getOrCreateSource(int p0, int p1) { return null; }
    public android.view.PrivacyIndicatorBounds getPrivacyIndicatorBounds() { return null; }
    public android.view.RoundedCorners getRoundedCorners() { return null; }
    public int getSeq() { return 0; }
    public int hashCode() { return 0; }
    public boolean isSourceOrDefaultVisible(int p0, int p1) { return false; }
    public android.view.InsetsSource peekSource(int p0) { return null; }
    public android.util.SparseArray<android.view.InsetsSource> readFromParcel(android.os.Parcel p0) { return null; }
    public void removeSource(int p0) {}
    public void removeSourceAt(int p0) {}
    public void scale(float p0) {}
    public void set(android.view.InsetsState p0) {}
    public void set(android.view.InsetsState p0, int p1) {}
    public void set(android.view.InsetsState p0, boolean p1) {}
    public void setDisplayCutout(android.view.DisplayCutout p0) {}
    public void setDisplayFrame(android.graphics.Rect p0) {}
    public void setDisplayShape(android.view.DisplayShape p0) {}
    public void setPrivacyIndicatorBounds(android.view.PrivacyIndicatorBounds p0) {}
    public void setRoundedCornerFrame(android.graphics.Rect p0) {}
    public void setRoundedCorners(android.view.RoundedCorners p0) {}
    public void setSeq(int p0) {}
    public void setSourceVisible(int p0, boolean p1) {}
    public android.view.InsetsSource sourceAt(int p0) { return null; }
    public int sourceIdAt(int p0) { return 0; }
    public int sourceSize() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static interface OnTraverseCallbacks {
        default public void onFinish(android.view.InsetsState p0, android.view.InsetsState p1) {}
        default public void onIdMatch(android.view.InsetsSource p0, android.view.InsetsSource p1) {}
        default public void onIdNotFoundInState1(int p0, android.view.InsetsSource p1) {}
        default public void onIdNotFoundInState2(int p0, android.view.InsetsSource p1) {}
        default public void onStart(android.view.InsetsState p0, android.view.InsetsState p1) {}
    }
}
