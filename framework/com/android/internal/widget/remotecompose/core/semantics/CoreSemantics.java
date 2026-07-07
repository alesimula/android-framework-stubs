package com.android.internal.widget.remotecompose.core.semantics;

public final class CoreSemantics extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.semantics.AccessibilityModifier {
    public boolean mClickable;
    public int mContentDescriptionId;
    public boolean mEnabled;
    public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Mode mMode;
    public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Role mRole;
    public int mStateDescriptionId;
    public int mTextId;
    public CoreSemantics() { super(); }
    public CoreSemantics(int p0, byte p1, int p2, int p3, int p4, boolean p5, boolean p6) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, byte p2, int p3, int p4, int p5, boolean p6, boolean p7) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private void read(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public java.lang.Integer getContentDescriptionId() { return null; }
    public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Mode getMode() { return null; }
    public int getOpCode() { return 0; }
    public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Role getRole() { return null; }
    public java.lang.Integer getStateDescriptionId() { return null; }
    public java.lang.Integer getTextId() { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
