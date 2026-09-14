package com.android.internal.widget.remotecompose.core.operations.layout.managers;

public class Custom extends com.android.internal.widget.remotecompose.core.operations.layout.managers.LayoutManager implements com.android.internal.widget.remotecompose.core.VariableSupport {
    private java.lang.String mConfig;
    private int mConfigId;
    private java.lang.String mConfigValue;
    private boolean mInitialized;
    private final java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.layout.managers.Custom.CustomProperty> mProperties = null;
    float mTouchLocationX;
    float mTouchLocationY;
    public Custom(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6, int p7, java.lang.String p8, java.util.List<com.android.internal.widget.remotecompose.core.operations.layout.managers.Custom.CustomProperty> p9) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public Custom(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, int p3, java.lang.String p4, java.util.List<com.android.internal.widget.remotecompose.core.operations.layout.managers.Custom.CustomProperty> p5) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, java.util.List<com.android.internal.widget.remotecompose.core.operations.layout.managers.Custom.CustomProperty> p4) {}
    private void calcPos(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) {}
    private boolean isInside(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) { return false; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    private void verifyAndInitializeCustomContext(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void computeSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public void computeWrapSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, boolean p5, boolean p6, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p7, com.android.internal.widget.remotecompose.core.operations.layout.measure.Size p8) {}
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public boolean onTouchDown(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3) { return false; }
    public boolean onTouchDrag(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3, boolean p4) { return false; }
    public boolean onTouchUp(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3, float p4, float p5, boolean p6) { return false; }
    public void paintingComponent(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}

    public static class CustomProperty {
        public static final short FLOAT_PROP = 1;
        public static final short FLOAT_RETURN = 3;
        public static final short INT_PROP = 0;
        public static final short STRING_PROP = 2;
        public static final short TEXT_RETURN = 4;
        public final short mDataType = 0;
        private float mFloatOutValue;
        public final float mFloatValue = 0.0f;
        public final int mIntValue = 0;
        private boolean mNeedsUpdate;
        private java.lang.String mStringOutValue;
        public final short mType = 0;
        public CustomProperty(short p0, short p1, float p2) {}
        public CustomProperty(short p0, short p1, int p2) {}
        public boolean isFloat() { return false; }
        public boolean isString() { return false; }
    }
}
