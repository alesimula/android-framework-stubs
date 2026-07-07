package com.android.internal.widget.remotecompose.core.operations;

public class DrawTextOnCircle extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "DrawTextOnCircle";
    private static final int OP_CODE = 57;
    com.android.internal.widget.remotecompose.core.operations.DrawTextOnCircle.Alignment mAlignment;
    float mCenterX;
    float mCenterY;
    com.android.internal.widget.remotecompose.core.operations.DrawTextOnCircle.Placement mPlacement;
    float mRadius;
    float mStartAngle;
    public int mTextId;
    float mWarpRadiusOffset;
    public DrawTextOnCircle(int p0, float p1, float p2, float p3, float p4, float p5, com.android.internal.widget.remotecompose.core.operations.DrawTextOnCircle.Alignment p6, com.android.internal.widget.remotecompose.core.operations.DrawTextOnCircle.Placement p7) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3, float p4, float p5, float p6, com.android.internal.widget.remotecompose.core.operations.DrawTextOnCircle.Alignment p7, com.android.internal.widget.remotecompose.core.operations.DrawTextOnCircle.Placement p8) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}

    public static enum Alignment {
        CENTER,
        END,
        START;
        private static final com.android.internal.widget.remotecompose.core.operations.DrawTextOnCircle.Alignment[] $VALUES = null;
        private Alignment() {}
    }

    public static enum Placement {
        INSIDE,
        OUTSIDE;
        private static final com.android.internal.widget.remotecompose.core.operations.DrawTextOnCircle.Placement[] $VALUES = null;
        private Placement() {}
    }
}
