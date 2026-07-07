package android.view;

public final class DisplayShape implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.DisplayShape> CREATOR = null;
    public static final android.view.DisplayShape NONE = null;
    private static final int TYPE_DEFAULT = 3;
    private static final int TYPE_NONE = 4;
    private static final int TYPE_RESOURCES = 2;
    private static final int TYPE_SPEC = 1;
    private final int mDisplayHeight = 0;
    private final java.lang.String mDisplayUniqueId = null;
    private final int mDisplayWidth = 0;
    private boolean mInitialized;
    private final boolean mIsRound = false;
    private final int mOffsetX = 0;
    private final int mOffsetY = 0;
    private android.graphics.Path mPath;
    private final int mPhysicalDisplayHeight = 0;
    private final int mPhysicalDisplayWidth = 0;
    private float mPhysicalPixelDisplaySizeRatio;
    private final int mRotation = 0;
    private final float mScale = 0.0f;
    private final java.lang.String mSpec = null;
    private final float mSpecRatio = 0.0f;
    private final int mType = 0;
    private DisplayShape(int p0, java.lang.String p1, int p2, int p3, boolean p4, java.lang.String p5, float p6, int p7, int p8, int p9, int p10, int p11, float p12) {}
    public static android.view.DisplayShape createDefaultDisplayShape(int p0, int p1, boolean p2) { return null; }
    private static java.lang.String createDefaultSpecString(int p0, int p1, boolean p2) { return null; }
    public static android.view.DisplayShape fromResources(java.lang.String p0, int p1, int p2, int p3, int p4) { return null; }
    public static android.view.DisplayShape fromSpecString(java.lang.String p0, float p1, int p2, int p3) { return null; }
    public static java.lang.String getSpecString(android.content.res.Resources p0, java.lang.String p1) { return null; }
    private void initializeIfNeeded() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.Path getPath() { return null; }
    public int hashCode() { return 0; }
    public android.view.DisplayShape setOffset(int p0, int p1) { return null; }
    public android.view.DisplayShape setRotation(int p0) { return null; }
    public android.view.DisplayShape setScale(float p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static final class Cache {
        private static int sCachedDefaultDisplayHeight;
        private static int sCachedDefaultDisplayWidth;
        private static android.view.DisplayShape sCachedDisplayShapeFromDefault;
        private static android.view.DisplayShape sCachedDisplayShapeFromResources;
        private static android.view.DisplayShape sCachedDisplayShapeFromSpec;
        private static java.lang.String sCachedDisplayUniqueId;
        private static boolean sCachedIsRound;
        private static int sCachedPhysicalDisplayHeight;
        private static int sCachedPhysicalDisplayWidth;
        private static float sCachedPhysicalPixelDisplaySizeRatio;
        private static int sCachedResDisplayHeight;
        private static int sCachedResDisplayWidth;
        private static java.lang.String sCachedSpec;
        private static int sCachedSpecDisplayHeight;
        private static int sCachedSpecDisplayWidth;
        private Cache() {}
        static android.view.DisplayShape getDisplayShape(int p0, int p1, boolean p2) { return null; }
        static android.view.DisplayShape getDisplayShape(java.lang.String p0, float p1, int p2, int p3) { return null; }
        static android.view.DisplayShape getDisplayShape(java.lang.String p0, int p1, int p2, int p3, int p4) { return null; }
    }
}
