package android.filterpacks.imageproc;

public class DrawRectFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="colorBlue")
    private float mColorBlue;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="colorGreen")
    private float mColorGreen;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="colorRed")
    private float mColorRed;
    private final java.lang.String mFixedColorFragmentShader = null;
    private android.filterfw.core.ShaderProgram mProgram;
    private final java.lang.String mVertexShader = null;
    public DrawRectFilter(java.lang.String p0) { super(null); }
    private void renderBox(android.filterfw.geometry.Quad p0) {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
