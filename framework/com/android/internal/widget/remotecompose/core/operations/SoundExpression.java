package com.android.internal.widget.remotecompose.core.operations;

public class SoundExpression extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable, com.android.internal.widget.remotecompose.core.operations.ComponentData, com.android.internal.widget.remotecompose.core.VariableProvider {
    private static final java.lang.String CLASS_NAME = "SoundExpression";
    private static final int MAX_PARAMS = 64;
    private static final int OP_CODE = 206;
    public static final int TYPE_TONE = 10;
    public static final float TYPE_TONE_NAN = Float.valueOf(0.0f);
    public static final float WAVEFORM_SAWTOOTH = 2.0f;
    public static final float WAVEFORM_SINE = 0.0f;
    public static final float WAVEFORM_SQUARE = 1.0f;
    public static final float WAVEFORM_TRIANGLE = 3.0f;
    int mId;
    float mLeftVolume;
    float[] mOutputParams;
    float[] mParams;
    float mRate;
    float mRightVolume;
    public SoundExpression(int p0, float p1, float p2, float p3, float[] p4) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3, float p4, float[] p5) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    private static float[] resolveVariables(float[] p0, com.android.internal.widget.remotecompose.core.RemoteContext p1) { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public int getId() { return 0; }
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void setId(int p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
