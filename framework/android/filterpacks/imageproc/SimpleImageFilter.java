package android.filterpacks.imageproc;

public abstract class SimpleImageFilter extends android.filterfw.core.Filter {
    protected int mCurrentTarget;
    protected java.lang.String mParameterName;
    protected android.filterfw.core.Program mProgram;
    public SimpleImageFilter(java.lang.String p0, java.lang.String p1) { super(null); }
    protected abstract android.filterfw.core.Program getNativeProgram(android.filterfw.core.FilterContext p0);
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    protected abstract android.filterfw.core.Program getShaderProgram(android.filterfw.core.FilterContext p0);
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
    protected void updateProgramWithTarget(int p0, android.filterfw.core.FilterContext p1) {}
}
