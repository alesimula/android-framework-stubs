package android.filterpacks.imageproc;

public class FixedRotationFilter extends android.filterfw.core.Filter {
    private android.filterfw.core.ShaderProgram mProgram;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="rotation")
    private int mRotation;
    public FixedRotationFilter(java.lang.String p0) { super(null); }
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
