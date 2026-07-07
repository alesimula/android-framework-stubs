package android.widget;

@android.widget.RemoteViews.RemoteView
public class GridLayout extends android.view.ViewGroup {
    private static final int ALIGNMENT_MODE = 6;
    public static final int ALIGN_BOUNDS = 0;
    public static final int ALIGN_MARGINS = 1;
    public static final android.widget.GridLayout.Alignment BASELINE = null;
    public static final android.widget.GridLayout.Alignment BOTTOM = null;
    private static final int CAN_STRETCH = 2;
    public static final android.widget.GridLayout.Alignment CENTER = null;
    private static final int COLUMN_COUNT = 3;
    private static final int COLUMN_ORDER_PRESERVED = 4;
    private static final int DEFAULT_ALIGNMENT_MODE = 1;
    static final int DEFAULT_CONTAINER_MARGIN = 0;
    private static final int DEFAULT_COUNT = -2147483648;
    private static final boolean DEFAULT_ORDER_PRESERVED = true;
    private static final int DEFAULT_ORIENTATION = 0;
    private static final boolean DEFAULT_USE_DEFAULT_MARGINS = false;
    public static final android.widget.GridLayout.Alignment END = null;
    public static final android.widget.GridLayout.Alignment FILL = null;
    public static final int HORIZONTAL = 0;
    private static final int INFLEXIBLE = 0;
    private static final android.widget.GridLayout.Alignment LEADING = null;
    public static final android.widget.GridLayout.Alignment LEFT = null;
    static final android.util.Printer LOG_PRINTER = null;
    static final int MAX_SIZE = 100000;
    static final android.util.Printer NO_PRINTER = null;
    private static final int ORIENTATION = 0;
    public static final android.widget.GridLayout.Alignment RIGHT = null;
    private static final int ROW_COUNT = 1;
    private static final int ROW_ORDER_PRESERVED = 2;
    public static final android.widget.GridLayout.Alignment START = null;
    public static final android.widget.GridLayout.Alignment TOP = null;
    private static final android.widget.GridLayout.Alignment TRAILING = null;
    public static final int UNDEFINED = -2147483648;
    static final android.widget.GridLayout.Alignment UNDEFINED_ALIGNMENT = null;
    static final int UNINITIALIZED_HASH = 0;
    private static final int USE_DEFAULT_MARGINS = 5;
    public static final int VERTICAL = 1;
    int mAlignmentMode;
    int mDefaultGap;
    final android.widget.GridLayout.Axis mHorizontalAxis = null;
    int mLastLayoutParamsHashCode;
    int mOrientation;
    android.util.Printer mPrinter;
    boolean mUseDefaultMargins;
    final android.widget.GridLayout.Axis mVerticalAxis = null;
    public GridLayout(android.content.Context p0) { super((android.content.Context)null); }
    public GridLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public GridLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public GridLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    static int adjust(int p0, int p1) { return 0; }
    static <T extends java.lang.Object> T[] append(T[] p0, T[] p1) { return null; }
    static boolean canStretch(int p0) { return false; }
    private void checkLayoutParams(android.widget.GridLayout.LayoutParams p0, boolean p1) {}
    private static int clip(android.widget.GridLayout.Interval p0, boolean p1, int p2) { return 0; }
    private int computeLayoutParamsHashCode() { return 0; }
    private void consistencyCheck() {}
    private static android.widget.GridLayout.Alignment createSwitchingAlignment(android.widget.GridLayout.Alignment p0, android.widget.GridLayout.Alignment p1) { return null; }
    private void drawLine(android.graphics.Canvas p0, int p1, int p2, int p3, int p4, android.graphics.Paint p5) {}
    private static boolean fits(int[] p0, int p1, int p2, int p3) { return false; }
    static android.widget.GridLayout.Alignment getAlignment(int p0, boolean p1) { return null; }
    private int getDefaultMargin(android.view.View p0, android.widget.GridLayout.LayoutParams p1, boolean p2, boolean p3) { return 0; }
    private int getDefaultMargin(android.view.View p0, boolean p1, boolean p2) { return 0; }
    private int getDefaultMargin(android.view.View p0, boolean p1, boolean p2, boolean p3) { return 0; }
    private int getMargin(android.view.View p0, boolean p1, boolean p2) { return 0; }
    private int getMeasurement(android.view.View p0, boolean p1) { return 0; }
    private int getTotalMargin(android.view.View p0, boolean p1) { return 0; }
    private static void handleInvalidParams(java.lang.String p0) {}
    private void invalidateStructure() {}
    private void invalidateValues() {}
    static int max2(int[] p0, int p1) { return 0; }
    private void measureChildWithMargins2(android.view.View p0, int p1, int p2, int p3, int p4) {}
    private void measureChildrenWithMargins(int p0, int p1, boolean p2) {}
    private static void procrusteanFill(int[] p0, int p1, int p2, int p3) {}
    private static void setCellGroup(android.widget.GridLayout.LayoutParams p0, int p1, int p2, int p3, int p4) {}
    public static android.widget.GridLayout.Spec spec(int p0) { return null; }
    public static android.widget.GridLayout.Spec spec(int p0, float p1) { return null; }
    public static android.widget.GridLayout.Spec spec(int p0, int p1) { return null; }
    public static android.widget.GridLayout.Spec spec(int p0, int p1, float p2) { return null; }
    public static android.widget.GridLayout.Spec spec(int p0, int p1, android.widget.GridLayout.Alignment p2) { return null; }
    public static android.widget.GridLayout.Spec spec(int p0, int p1, android.widget.GridLayout.Alignment p2, float p3) { return null; }
    public static android.widget.GridLayout.Spec spec(int p0, android.widget.GridLayout.Alignment p1) { return null; }
    public static android.widget.GridLayout.Spec spec(int p0, android.widget.GridLayout.Alignment p1, float p2) { return null; }
    private void validateLayoutParams() {}
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected android.widget.GridLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    public android.widget.GridLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.widget.GridLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public int getAlignmentMode() { return 0; }
    public int getColumnCount() { return 0; }
    final android.widget.GridLayout.LayoutParams getLayoutParams(android.view.View p0) { return null; }
    int getMargin1(android.view.View p0, boolean p1, boolean p2) { return 0; }
    final int getMeasurementIncludingMargin(android.view.View p0, boolean p1) { return 0; }
    public int getOrientation() { return 0; }
    public android.util.Printer getPrinter() { return null; }
    public int getRowCount() { return 0; }
    public boolean getUseDefaultMargins() { return false; }
    public boolean isColumnOrderPreserved() { return false; }
    public boolean isRowOrderPreserved() { return false; }
    protected void onChildVisibilityChanged(android.view.View p0, int p1, int p2) {}
    protected void onDebugDraw(android.graphics.Canvas p0) {}
    protected void onDebugDrawMargins(android.graphics.Canvas p0, android.graphics.Paint p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    protected void onSetLayoutParams(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void onViewAdded(android.view.View p0) {}
    public void onViewRemoved(android.view.View p0) {}
    public void requestLayout() {}
    @android.view.RemotableViewMethod
    public void setAlignmentMode(int p0) {}
    @android.view.RemotableViewMethod
    public void setColumnCount(int p0) {}
    public void setColumnOrderPreserved(boolean p0) {}
    public void setOrientation(int p0) {}
    public void setPrinter(android.util.Printer p0) {}
    @android.view.RemotableViewMethod
    public void setRowCount(int p0) {}
    public void setRowOrderPreserved(boolean p0) {}
    public void setUseDefaultMargins(boolean p0) {}

    public static abstract class Alignment {
        Alignment() {}
        abstract int getAlignmentValue(android.view.View p0, int p1, int p2);
        android.widget.GridLayout.Bounds getBounds() { return null; }
        abstract int getGravityOffset(android.view.View p0, int p1);
        int getSizeInCell(android.view.View p0, int p1, int p2) { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlignmentMode {
    }

    static final class Arc {
        public final android.widget.GridLayout.Interval span = null;
        public boolean valid;
        public final android.widget.GridLayout.MutableInt value = null;
        public Arc(android.widget.GridLayout.Interval p0, android.widget.GridLayout.MutableInt p1) {}
        public java.lang.String toString() { return null; }
    }

    static final class Assoc<K extends java.lang.Object, V extends java.lang.Object> extends java.util.ArrayList<android.util.Pair<K, V>> {
        private final java.lang.Class<K> keyType = null;
        private final java.lang.Class<V> valueType = null;
        private Assoc(java.lang.Class<K> p0, java.lang.Class<V> p1) { super(); }
        public static <K extends java.lang.Object, V extends java.lang.Object> android.widget.GridLayout.Assoc<K, V> of(java.lang.Class<K> p0, java.lang.Class<V> p1) { return null; }
        public android.widget.GridLayout.PackedMap<K, V> pack() { return null; }
        public void put(K p0, V p1) {}
    }

    final class Axis {
        static final boolean $assertionsDisabled = false;
        private static final int COMPLETE = 2;
        private static final int NEW = 0;
        private static final int PENDING = 1;
        public android.widget.GridLayout.Arc[] arcs;
        public boolean arcsValid;
        android.widget.GridLayout.PackedMap<android.widget.GridLayout.Interval, android.widget.GridLayout.MutableInt> backwardLinks;
        public boolean backwardLinksValid;
        public int definedCount;
        public int[] deltas;
        android.widget.GridLayout.PackedMap<android.widget.GridLayout.Interval, android.widget.GridLayout.MutableInt> forwardLinks;
        public boolean forwardLinksValid;
        android.widget.GridLayout.PackedMap<android.widget.GridLayout.Spec, android.widget.GridLayout.Bounds> groupBounds;
        public boolean groupBoundsValid;
        public boolean hasWeights;
        public boolean hasWeightsValid;
        public final boolean horizontal = false;
        public int[] leadingMargins;
        public boolean leadingMarginsValid;
        public int[] locations;
        public boolean locationsValid;
        private int maxIndex;
        boolean orderPreserved;
        private android.widget.GridLayout.MutableInt parentMax;
        private android.widget.GridLayout.MutableInt parentMin;
        public int[] trailingMargins;
        public boolean trailingMarginsValid;
        private Axis(android.widget.GridLayout p0, boolean p1) {}
        private void addComponentSizes(java.util.List<android.widget.GridLayout.Arc> p0, android.widget.GridLayout.PackedMap<android.widget.GridLayout.Interval, android.widget.GridLayout.MutableInt> p1) {}
        private java.lang.String arcsToString(java.util.List<android.widget.GridLayout.Arc> p0) { return null; }
        private int calculateMaxIndex() { return 0; }
        private float calculateTotalWeight() { return 0.0f; }
        private void computeArcs() {}
        private void computeGroupBounds() {}
        private boolean computeHasWeights() { return false; }
        private void computeLinks(android.widget.GridLayout.PackedMap<android.widget.GridLayout.Interval, android.widget.GridLayout.MutableInt> p0, boolean p1) {}
        private void computeLocations(int[] p0) {}
        private void computeMargins(boolean p0) {}
        private android.widget.GridLayout.Arc[] createArcs() { return null; }
        private android.widget.GridLayout.PackedMap<android.widget.GridLayout.Spec, android.widget.GridLayout.Bounds> createGroupBounds() { return null; }
        private android.widget.GridLayout.PackedMap<android.widget.GridLayout.Interval, android.widget.GridLayout.MutableInt> createLinks(boolean p0) { return null; }
        private android.widget.GridLayout.PackedMap<android.widget.GridLayout.Interval, android.widget.GridLayout.MutableInt> getBackwardLinks() { return null; }
        private android.widget.GridLayout.PackedMap<android.widget.GridLayout.Interval, android.widget.GridLayout.MutableInt> getForwardLinks() { return null; }
        private int getMaxIndex() { return 0; }
        private int getMeasure(int p0, int p1) { return 0; }
        private boolean hasWeights() { return false; }
        private void include(java.util.List<android.widget.GridLayout.Arc> p0, android.widget.GridLayout.Interval p1, android.widget.GridLayout.MutableInt p2) {}
        private void include(java.util.List<android.widget.GridLayout.Arc> p0, android.widget.GridLayout.Interval p1, android.widget.GridLayout.MutableInt p2, boolean p3) {}
        private void init(int[] p0) {}
        private void logError(java.lang.String p0, android.widget.GridLayout.Arc[] p1, boolean[] p2) {}
        private boolean relax(int[] p0, android.widget.GridLayout.Arc p1) { return false; }
        private void setParentConstraints(int p0, int p1) {}
        private void shareOutDelta(int p0, float p1) {}
        private int size(int[] p0) { return 0; }
        private boolean solve(int[] p0) { return false; }
        private boolean solve(android.widget.GridLayout.Arc[] p0, int[] p1) { return false; }
        private boolean solve(android.widget.GridLayout.Arc[] p0, int[] p1, boolean p2) { return false; }
        private void solveAndDistributeSpace(int[] p0) {}
        private android.widget.GridLayout.Arc[] topologicalSort(java.util.List<android.widget.GridLayout.Arc> p0) { return null; }
        private android.widget.GridLayout.Arc[] topologicalSort(android.widget.GridLayout.Arc[] p0) { return null; }
        public android.widget.GridLayout.Arc[] getArcs() { return null; }
        public int getCount() { return 0; }
        public int[] getDeltas() { return null; }
        public android.widget.GridLayout.PackedMap<android.widget.GridLayout.Spec, android.widget.GridLayout.Bounds> getGroupBounds() { return null; }
        public int[] getLeadingMargins() { return null; }
        public int[] getLocations() { return null; }
        public int getMeasure(int p0) { return 0; }
        public int[] getTrailingMargins() { return null; }
        android.widget.GridLayout.Arc[][] groupArcsByFirstVertex(android.widget.GridLayout.Arc[] p0) { return null; }
        public void invalidateStructure() {}
        public void invalidateValues() {}
        public boolean isOrderPreserved() { return false; }
        public void layout(int p0) {}
        public void setCount(int p0) {}
        public void setOrderPreserved(boolean p0) {}
    }

    static class Bounds {
        public int after;
        public int before;
        public int flexibility;
        private Bounds() {}
        protected int getOffset(android.widget.GridLayout p0, android.view.View p1, android.widget.GridLayout.Alignment p2, int p3, boolean p4) { return 0; }
        protected void include(int p0, int p1) {}
        protected final void include(android.widget.GridLayout p0, android.view.View p1, android.widget.GridLayout.Spec p2, android.widget.GridLayout.Axis p3, int p4) {}
        protected void reset() {}
        protected int size(boolean p0) { return 0; }
        public java.lang.String toString() { return null; }
    }

    static final class Interval {
        public final int max = 0;
        public final int min = 0;
        public Interval(int p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        android.widget.GridLayout.Interval inverse() { return null; }
        int size() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        private static final int BOTTOM_MARGIN = 6;
        private static final int COLUMN = 1;
        private static final int COLUMN_SPAN = 4;
        private static final int COLUMN_WEIGHT = 6;
        private static final int DEFAULT_COLUMN = -2147483648;
        private static final int DEFAULT_HEIGHT = -2;
        private static final int DEFAULT_MARGIN = -2147483648;
        private static final int DEFAULT_ROW = -2147483648;
        private static final android.widget.GridLayout.Interval DEFAULT_SPAN = null;
        private static final int DEFAULT_SPAN_SIZE = Integer.valueOf(0);
        private static final int DEFAULT_WIDTH = -2;
        private static final int GRAVITY = 0;
        private static final int LEFT_MARGIN = 3;
        private static final int MARGIN = 2;
        private static final int RIGHT_MARGIN = 5;
        private static final int ROW = 2;
        private static final int ROW_SPAN = 3;
        private static final int ROW_WEIGHT = 5;
        private static final int TOP_MARGIN = 4;
        public android.widget.GridLayout.Spec columnSpec;
        public android.widget.GridLayout.Spec rowSpec;
        public LayoutParams() { super((android.view.ViewGroup.LayoutParams)null); }
        private LayoutParams(int p0, int p1, int p2, int p3, int p4, int p5, android.widget.GridLayout.Spec p6, android.widget.GridLayout.Spec p7) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.widget.GridLayout.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.widget.GridLayout.Spec p0, android.widget.GridLayout.Spec p1) { super((android.view.ViewGroup.LayoutParams)null); }
        private void init(android.content.Context p0, android.util.AttributeSet p1) {}
        private void reInitSuper(android.content.Context p0, android.util.AttributeSet p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        protected void setBaseAttributes(android.content.res.TypedArray p0, int p1, int p2) {}
        final void setColumnSpecSpan(android.widget.GridLayout.Interval p0) {}
        public void setGravity(int p0) {}
        final void setRowSpecSpan(android.widget.GridLayout.Interval p0) {}
    }

    static final class MutableInt {
        public int value;
        public MutableInt() {}
        public MutableInt(int p0) {}
        public void reset() {}
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Orientation {
    }

    static final class PackedMap<K extends java.lang.Object, V extends java.lang.Object> {
        public final int[] index = null;
        public final K[] keys = null;
        public final V[] values = null;
        private PackedMap(K[] p0, V[] p1) {}
        private static <K extends java.lang.Object> K[] compact(K[] p0, int[] p1) { return null; }
        private static <K extends java.lang.Object> int[] createIndex(K[] p0) { return null; }
        public V getValue(int p0) { return null; }
    }

    public static class Spec {
        static final float DEFAULT_WEIGHT = 0.0f;
        static final android.widget.GridLayout.Spec UNDEFINED = null;
        final android.widget.GridLayout.Alignment alignment = null;
        final android.widget.GridLayout.Interval span = null;
        final boolean startDefined = false;
        final float weight = 0.0f;
        private Spec(boolean p0, int p1, int p2, android.widget.GridLayout.Alignment p3, float p4) {}
        private Spec(boolean p0, android.widget.GridLayout.Interval p1, android.widget.GridLayout.Alignment p2, float p3) {}
        private android.widget.GridLayout.Alignment getAbsoluteAlignment(boolean p0) { return null; }
        final android.widget.GridLayout.Spec copyWriteAlignment(android.widget.GridLayout.Alignment p0) { return null; }
        final android.widget.GridLayout.Spec copyWriteSpan(android.widget.GridLayout.Interval p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        final int getFlexibility() { return 0; }
        public int hashCode() { return 0; }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.GridLayout> {
        private int mAlignmentModeId;
        private int mColumnCountId;
        private int mColumnOrderPreservedId;
        private int mOrientationId;
        private boolean mPropertiesMapped;
        private int mRowCountId;
        private int mRowOrderPreservedId;
        private int mUseDefaultMarginsId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.GridLayout p0, android.view.inspector.PropertyReader p1) {}
    }
}
