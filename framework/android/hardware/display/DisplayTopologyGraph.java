package android.hardware.display;

public class DisplayTopologyGraph {
    private final android.hardware.display.DisplayTopologyGraph.DisplayNode[] mDisplayNodes = null;
    private final int mPrimaryDisplayId = 0;
    public DisplayTopologyGraph(int p0, android.hardware.display.DisplayTopologyGraph.DisplayNode[] p1) {}
    public void dump(android.util.IndentingPrintWriter p0) {}
    public android.util.SparseArray<android.hardware.display.DisplayTopologyGraph.DisplayNode> getDisplayNodes() { return null; }
    public int getPrimaryDisplayId() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class AdjacentEdge {
        private final android.hardware.display.DisplayTopologyGraph.DisplayNode mDisplayNode = null;
        private final float mOffsetDp = 0.0f;
        private final int mPosition = 0;
        public AdjacentEdge(android.hardware.display.DisplayTopologyGraph.DisplayNode p0, int p1, float p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public android.hardware.display.DisplayTopologyGraph.DisplayNode getDisplayNode() { return null; }
        public float getOffsetDp() { return 0.0f; }
        public int getPosition() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class DisplayNode {
        private android.hardware.display.DisplayTopologyGraph.AdjacentEdge[] mAdjacentEdges;
        private final android.graphics.RectF mBoundsInGlobalDp = null;
        private final int mDensity = 0;
        private final int mDisplayId = 0;
        public DisplayNode(int p0, int p1, android.graphics.RectF p2) {}
        public void dump(android.util.IndentingPrintWriter p0) {}
        public java.util.List<android.hardware.display.DisplayTopologyGraph.AdjacentEdge> getAdjacentEdges() { return null; }
        public android.graphics.RectF getBoundsInGlobalDp() { return null; }
        public int getDensity() { return 0; }
        public int getDisplayId() { return 0; }
        void setAdjacentEdges(android.hardware.display.DisplayTopologyGraph.AdjacentEdge[] p0) {}
    }
}
