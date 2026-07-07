package android.hardware.display;

public final class DisplayTopology implements android.os.Parcelable {
    static final boolean $assertionsDisabled = false;
    public static final android.os.Parcelable.Creator<android.hardware.display.DisplayTopology> CREATOR = null;
    private static final float EPSILON = 9.999999747378752e-05f;
    private static final float MAX_GAP = 5.0f;
    public static final int POSITION_BOTTOM = 3;
    public static final int POSITION_LEFT = 0;
    public static final int POSITION_RIGHT = 2;
    public static final int POSITION_TOP = 1;
    private static final java.lang.String TAG = "DisplayTopology";
    private int mDefaultPositionOfSecondDisplay;
    private int mPrimaryDisplayId;
    private android.hardware.display.DisplayTopology.TreeNode mRoot;
    public DisplayTopology() {}
    public DisplayTopology(android.hardware.display.DisplayTopology.TreeNode p0, int p1) {}
    private DisplayTopology(android.hardware.display.DisplayTopology.TreeNode p0, int p1, int p2) {}
    public DisplayTopology(android.os.Parcel p0) {}
    private void clampOffsets(android.hardware.display.DisplayTopology.TreeNode p0) {}
    public static float dpToPx(float p0, int p1) { return 0.0f; }
    public static android.hardware.display.DisplayTopology.TreeNode findDisplay(int p0, android.hardware.display.DisplayTopology.TreeNode p1) { return null; }
    private java.util.List<android.util.Pair<java.lang.Integer, java.lang.Float>> findDisplayPlacements(android.graphics.RectF p0, android.graphics.RectF p1) { return null; }
    private static android.util.Pair<android.hardware.display.DisplayTopology.TreeNode, java.lang.Float> findRightMostDisplay(android.hardware.display.DisplayTopology.TreeNode p0, float p1) { return null; }
    private static boolean floatEquals(float p0, float p1) { return false; }
    private android.graphics.PointF getDpCenterPosition(int p0, android.graphics.RectF p1, android.graphics.Rect p2) { return null; }
    private java.util.List<android.hardware.display.DisplayTopology.NodeDerivedInfo> getInfo() { return null; }
    private static void getSubTreeInfo(java.util.List<android.hardware.display.DisplayTopology.NodeDerivedInfo> p0, android.hardware.display.DisplayTopology.NodeDerivedInfo p1) {}
    public static float pxToDp(float p0, int p1) { return 0.0f; }
    public void addDisplay(int p0, int p1, int p2, int p3) {}
    public java.util.Map<java.lang.Integer, android.hardware.display.DisplayTopology.TreeNode> allNodesIdMap() { return null; }
    public android.graphics.PointF calculateRelativeDirection(int p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3) { return null; }
    public android.hardware.display.DisplayTopology copy() { return null; }
    public int describeContents() { return 0; }
    public void dump(android.util.IndentingPrintWriter p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.util.SparseArray<android.graphics.RectF> getAbsoluteBounds() { return null; }
    public android.hardware.display.DisplayTopologyGraph getGraph() { return null; }
    public int getPrimaryDisplayId() { return 0; }
    public android.hardware.display.DisplayTopology.TreeNode getRoot() { return null; }
    public boolean hasMultipleDisplays() { return false; }
    public int hashCode() { return 0; }
    public boolean isEmpty() { return false; }
    public void normalize() {}
    public void rearrange(java.util.Map<java.lang.Integer, android.graphics.PointF> p0) {}
    public boolean removeDisplay(int p0) { return false; }
    public void setDefaultPosition(int p0) {}
    public java.lang.String toString() { return null; }
    public boolean updateDisplay(int p0, int p1, int p2, int p3) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static final class NodeDerivedInfo {
        private final int depth = 0;
        private final float left = 0.0f;
        private final android.hardware.display.DisplayTopology.TreeNode node = null;
        private final android.hardware.display.DisplayTopology.NodeDerivedInfo parent = null;
        private final float top = 0.0f;
        private NodeDerivedInfo(android.hardware.display.DisplayTopology.TreeNode p0, float p1, float p2, android.hardware.display.DisplayTopology.NodeDerivedInfo p3, int p4) {}
        android.graphics.RectF absoluteBounds() { return null; }
        public int depth() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public float left() { return 0.0f; }
        public android.hardware.display.DisplayTopology.TreeNode node() { return null; }
        public android.hardware.display.DisplayTopology.NodeDerivedInfo parent() { return null; }
        public final java.lang.String toString() { return null; }
        public float top() { return 0.0f; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Position {
    }

    public static final class TreeNode implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.display.DisplayTopology.TreeNode> CREATOR = null;
        private final java.util.List<android.hardware.display.DisplayTopology.TreeNode> mChildren = null;
        private final int mDisplayId = 0;
        private int mLogicalDensity;
        private int mLogicalHeight;
        private int mLogicalWidth;
        private float mOffset;
        private int mPosition;
        public TreeNode(int p0, int p1, int p2, int p3, int p4, float p5) {}
        public TreeNode(int p0, int p1, int p2, int p3, int p4, float p5, java.util.List<android.hardware.display.DisplayTopology.TreeNode> p6) {}
        public TreeNode(android.os.Parcel p0) {}
        public static java.lang.String positionToString(int p0) { return null; }
        public void addChild(android.hardware.display.DisplayTopology.TreeNode p0) {}
        public android.hardware.display.DisplayTopology.TreeNode copy() { return null; }
        public int describeContents() { return 0; }
        public void dump(android.util.IndentingPrintWriter p0) {}
        public java.util.List<android.hardware.display.DisplayTopology.TreeNode> getChildren() { return null; }
        public int getDisplayId() { return 0; }
        public float getHeight() { return 0.0f; }
        public int getLogicalDensity() { return 0; }
        public int getLogicalHeight() { return 0; }
        public int getLogicalWidth() { return 0; }
        public float getOffset() { return 0.0f; }
        public int getPosition() { return 0; }
        public float getWidth() { return 0.0f; }
        public void setPosition(int p0) {}
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
