package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class GraphicsLayerModifierOperation extends com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DecoratorModifierOperation {
    public static final int ALPHA = 11;
    public static final int AMBIENT_SHADOW_COLOR = 15;
    public static final int BLUR_RADIUS_X = 17;
    public static final int BLUR_RADIUS_Y = 18;
    public static final int BLUR_TILE_MODE = 19;
    public static final int CAMERA_DISTANCE = 12;
    public static final java.lang.String CLASS_NAME = "GraphicsLayerModifierOperation";
    public static final int COMPOSITING_STRATEGY = 13;
    private static final short DATA_TYPE_FLOAT = 1;
    private static final short DATA_TYPE_INT = 0;
    static final int FLOAT_VALUE = 0;
    public static final int HAS_BLUR = 16;
    static final int INT_VALUE = 1;
    private static final int OP_CODE = 224;
    public static final int ROTATION_X = 2;
    public static final int ROTATION_Y = 3;
    public static final int ROTATION_Z = 4;
    public static final int SCALE_X = 0;
    public static final int SCALE_Y = 1;
    public static final int SHADOW_ELEVATION = 10;
    public static final int SHAPE = 20;
    public static final int SHAPE_CIRCLE = 2;
    public static final int SHAPE_RADIUS = 21;
    public static final int SHAPE_RECT = 0;
    public static final int SHAPE_ROUND_RECT = 1;
    public static final int SPOT_SHADOW_COLOR = 14;
    public static final int TILE_MODE_CLAMP = 0;
    public static final int TILE_MODE_DECAL = 3;
    public static final int TILE_MODE_MIRROR = 2;
    public static final int TILE_MODE_REPEATED = 1;
    public static final int TRANSFORM_ORIGIN_X = 5;
    public static final int TRANSFORM_ORIGIN_Y = 6;
    public static final int TRANSLATION_X = 7;
    public static final int TRANSLATION_Y = 8;
    public static final int TRANSLATION_Z = 9;
    boolean mHasBlurEffect;
    com.android.internal.widget.remotecompose.core.operations.layout.modifiers.GraphicsLayerModifierOperation.AttributeValue[] mValues;
    public GraphicsLayerModifierOperation() { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.HashMap<java.lang.Integer, java.lang.Object> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    private void readAttributeValue(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    private static void writeFloatAttribute(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2) {}
    private static void writeIntAttribute(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void fillInAttributes(java.util.HashMap<java.lang.Integer, java.lang.Object> p0) {}
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, float p2, float p3) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}

    static class AttributeValue {
        com.android.internal.widget.remotecompose.core.operations.layout.AnimatableValue mAnimatableValue;
        float mDefaultValue;
        int mId;
        int mIntDefaultValue;
        int mIntValue;
        java.lang.String mName;
        int mType;
        AttributeValue(int p0, java.lang.String p1, float p2) {}
        AttributeValue(int p0, java.lang.String p1, int p2) {}
        public void evaluate(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
        public int getIntValue() { return 0; }
        public java.lang.Object getObjectValue() { return null; }
        public float getValue() { return 0.0f; }
        public boolean needsToWrite() { return false; }
        public void setValue(float p0) {}
        public void setValue(int p0) {}
        public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    }
}
