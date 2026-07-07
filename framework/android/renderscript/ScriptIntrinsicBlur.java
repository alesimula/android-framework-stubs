package android.renderscript;

@java.lang.Deprecated
public final class ScriptIntrinsicBlur extends android.renderscript.ScriptIntrinsic {
    private android.renderscript.Allocation mInput;
    private final float[] mValues = null;
    private ScriptIntrinsicBlur(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public static android.renderscript.ScriptIntrinsicBlur create(android.renderscript.RenderScript p0, android.renderscript.Element p1) { return null; }
    public void forEach(android.renderscript.Allocation p0) {}
    public void forEach(android.renderscript.Allocation p0, android.renderscript.Script.LaunchOptions p1) {}
    public android.renderscript.Script.FieldID getFieldID_Input() { return null; }
    public android.renderscript.Script.KernelID getKernelID() { return null; }
    public void setInput(android.renderscript.Allocation p0) {}
    public void setRadius(float p0) {}
}
