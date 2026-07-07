package android.view;

public class RoundedCorners implements android.os.Parcelable {
    private static final java.lang.Object CACHE_LOCK = null;
    public static final android.os.Parcelable.Creator<android.view.RoundedCorners> CREATOR = null;
    public static final android.view.RoundedCorners NO_ROUNDED_CORNERS = null;
    public static final int ROUNDED_CORNER_POSITION_LENGTH = 4;
    private static int sCachedDisplayHeight;
    private static int sCachedDisplayWidth;
    private static float sCachedPhysicalPixelDisplaySizeRatio;
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> sCachedRadii;
    private static android.view.RoundedCorners sCachedRoundedCorners;
    public final android.view.RoundedCorner[] mRoundedCorners = null;
    public RoundedCorners(android.view.RoundedCorner p0, android.view.RoundedCorner p1, android.view.RoundedCorner p2, android.view.RoundedCorner p3) {}
    public RoundedCorners(android.view.RoundedCorners p0) {}
    public RoundedCorners(android.view.RoundedCorner[] p0) {}
    private static android.view.RoundedCorner createRoundedCorner(int p0, int p1, int p2, int p3) { return null; }
    public static android.view.RoundedCorners fromRadii(android.util.Pair<java.lang.Integer, java.lang.Integer> p0, int p1, int p2) { return null; }
    private static android.view.RoundedCorners fromRadii(android.util.Pair<java.lang.Integer, java.lang.Integer> p0, int p1, int p2, int p3, int p4) { return null; }
    public static android.view.RoundedCorners fromResources(android.content.res.Resources p0, java.lang.String p1, int p2, int p3, int p4, int p5) { return null; }
    public static boolean getBuiltInDisplayIsRound(android.content.res.Resources p0, java.lang.String p1) { return false; }
    private static int getRotatedIndex(int p0, int p1) { return 0; }
    public static int getRoundedCornerBottomRadius(android.content.res.Resources p0, java.lang.String p1) { return 0; }
    public static int getRoundedCornerRadius(android.content.res.Resources p0, java.lang.String p1) { return 0; }
    public static int getRoundedCornerRadiusAdjustment(android.content.res.Resources p0, java.lang.String p1) { return 0; }
    public static int getRoundedCornerRadiusBottomAdjustment(android.content.res.Resources p0, java.lang.String p1) { return 0; }
    public static int getRoundedCornerRadiusTopAdjustment(android.content.res.Resources p0, java.lang.String p1) { return 0; }
    public static int getRoundedCornerTopRadius(android.content.res.Resources p0, java.lang.String p1) { return 0; }
    private android.view.RoundedCorner insetRoundedCorner(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) { return null; }
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> loadRoundedCornerRadii(android.content.res.Resources p0, java.lang.String p1) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.view.RoundedCorner[] getAllRoundedCorners() { return null; }
    public android.view.RoundedCorner getRoundedCorner(int p0) { return null; }
    public int hashCode() { return 0; }
    public android.view.RoundedCorners inset(int p0, int p1, int p2, int p3) { return null; }
    public android.view.RoundedCorners insetWithFrame(android.graphics.Rect p0, android.graphics.Rect p1) { return null; }
    public android.view.RoundedCorners rotate(int p0, int p1, int p2) { return null; }
    public android.view.RoundedCorners scale(float p0) { return null; }
    public void setRoundedCorner(int p0, android.view.RoundedCorner p1) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
