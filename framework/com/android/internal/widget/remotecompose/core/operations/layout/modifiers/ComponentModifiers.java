package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class ComponentModifiers extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.operations.layout.DecoratorComponent, com.android.internal.widget.remotecompose.core.operations.layout.ClickHandler, com.android.internal.widget.remotecompose.core.operations.layout.TouchHandler, com.android.internal.widget.remotecompose.core.SerializableToString, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation> mList;
    public ComponentModifiers() { super(); }
    public void add(com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation p0) {}
    public void addAll(java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation> p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public float getHorizontalScrollDimension() { return 0.0f; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation> getList() { return null; }
    public float getVerticalScrollDimension() { return 0.0f; }
    public boolean hasHorizontalScroll() { return false; }
    public boolean hasVerticalScroll() { return false; }
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, float p2, float p3) {}
    public boolean onClick(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) { return false; }
    public boolean onDoubleClick(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) { return false; }
    public boolean onLongPress(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) { return false; }
    public boolean onTouchCancel(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) { return false; }
    public boolean onTouchDown(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) { return false; }
    public boolean onTouchDrag(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) { return false; }
    public boolean onTouchUp(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4, float p5, float p6) { return false; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void setHorizontalScrollDimension(float p0, float p1) {}
    public void setVerticalScrollDimension(float p0, float p1) {}
    public int size() { return 0; }
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
