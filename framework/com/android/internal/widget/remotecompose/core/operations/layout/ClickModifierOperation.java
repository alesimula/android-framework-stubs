package com.android.internal.widget.remotecompose.core.operations.layout;

public class ClickModifierOperation extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.operations.layout.Container, com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation, com.android.internal.widget.remotecompose.core.operations.layout.DecoratorComponent, com.android.internal.widget.remotecompose.core.operations.layout.ClickHandler, com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent {
    private static final int OP_CODE = 59;
    public float[] locationInWindow;
    int mAnimateRippleDuration;
    long mAnimateRippleStart;
    float mAnimateRippleX;
    float mAnimateRippleY;
    float mHeight;
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mList;
    com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle mPaint;
    float mWidth;
    public ClickModifierOperation() { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void animateRipple(float p0, float p1, long p2) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> getList() { return null; }
    public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Mode getMode() { return null; }
    public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Role getRole() { return null; }
    public boolean isClickable() { return false; }
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, float p2, float p3) {}
    public boolean onClick(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) { return false; }
    public boolean onDoubleClick(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) { return false; }
    public boolean onLongPress(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) { return false; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
