package com.android.internal.widget.remotecompose.core.operations;

public abstract class DrawBase4 extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    protected java.lang.String mName;
    protected float mX1;
    float mX1Value;
    protected float mX2;
    float mX2Value;
    protected float mY1;
    float mY1Value;
    protected float mY2;
    float mY2Value;
    public DrawBase4(float p0, float p1, float p2, float p3) { super(); }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1, com.android.internal.widget.remotecompose.core.operations.DrawBase4.Maker p2) {}
    protected static void write(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3, float p4, float p5) {}
    public com.android.internal.widget.remotecompose.core.Operation construct(float p0, float p1, float p2, float p3) { return null; }
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    protected com.android.internal.widget.remotecompose.core.serialize.MapSerializer serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return null; }
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    protected abstract void write(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, float p2, float p3, float p4);

    protected static interface Maker {
        public com.android.internal.widget.remotecompose.core.operations.DrawBase4 create(float p0, float p1, float p2, float p3);
    }
}
