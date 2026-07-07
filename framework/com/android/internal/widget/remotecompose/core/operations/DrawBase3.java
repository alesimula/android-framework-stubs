package com.android.internal.widget.remotecompose.core.operations;

public abstract class DrawBase3 extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    protected java.lang.String mName;
    float mV1;
    float mV2;
    float mV3;
    float mValue1;
    float mValue2;
    float mValue3;
    public DrawBase3(float p0, float p1, float p2) { super(); }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1, com.android.internal.widget.remotecompose.core.operations.DrawBase3.Maker p2) {}
    public com.android.internal.widget.remotecompose.core.Operation construct(float p0, float p1, float p2) { return null; }
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    protected com.android.internal.widget.remotecompose.core.serialize.MapSerializer serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return null; }
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    protected abstract void write(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, float p2, float p3);

    public static interface Maker {
        public com.android.internal.widget.remotecompose.core.operations.DrawBase3 create(float p0, float p1, float p2);
    }
}
