package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public abstract class DimensionModifierOperation extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation, com.android.internal.widget.remotecompose.core.VariableSupport {
    float mOutValue;
    com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation.Type mType;
    float mValue;
    public DimensionModifierOperation(float p0) { super(); }
    public DimensionModifierOperation(com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation.Type p0) { super(); }
    public DimensionModifierOperation(com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation.Type p0, float p1) { super(); }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation.Type getType() { return null; }
    public float getValue() { return 0.0f; }
    public boolean hasWeight() { return false; }
    public boolean isExact() { return false; }
    public boolean isFill() { return false; }
    public boolean isFillParentMaxHeight() { return false; }
    public boolean isFillParentMaxWidth() { return false; }
    public boolean isIntrinsicMax() { return false; }
    public boolean isIntrinsicMin() { return false; }
    public boolean isWrap() { return false; }
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public java.lang.String serializedName() { return null; }
    public void setType(com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation.Type p0) {}
    public void setValue(float p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}

    public static enum Type {
        EXACT,
        EXACT_DP,
        FILL,
        FILL_PARENT_MAX_HEIGHT,
        FILL_PARENT_MAX_WIDTH,
        INTRINSIC_MAX,
        INTRINSIC_MIN,
        WEIGHT,
        WRAP;
        private static final com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation.Type[] $VALUES = null;
        private Type() {}
        public static com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation.Type fromInt(int p0) { return null; }
    }
}
