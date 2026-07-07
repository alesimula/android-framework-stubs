package android.filterpacks.videosrc;

public class CameraSource extends android.filterfw.core.Filter {
    private static final int NEWFRAME_TIMEOUT = 100;
    private static final int NEWFRAME_TIMEOUT_REPEAT = 10;
    private static final java.lang.String TAG = "CameraSource";
    private static final java.lang.String mFrameShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n";
    private static final float[] mSourceCoords = null;
    private android.hardware.Camera mCamera;
    private android.filterfw.core.GLFrame mCameraFrame;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="id")
    private int mCameraId;
    private android.hardware.Camera.Parameters mCameraParameters;
    private float[] mCameraTransform;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="framerate")
    private int mFps;
    private android.filterfw.core.ShaderProgram mFrameExtractor;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="height")
    private int mHeight;
    private final boolean mLogVerbose = false;
    private float[] mMappedCoords;
    private boolean mNewFrameAvailable;
    private android.filterfw.core.MutableFrameFormat mOutputFormat;
    private android.graphics.SurfaceTexture mSurfaceTexture;
    @android.filterfw.core.GenerateFinalPort(hasDefault=true, name="waitForNewFrame")
    private boolean mWaitForNewFrame;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="width")
    private int mWidth;
    private android.graphics.SurfaceTexture.OnFrameAvailableListener onCameraFrameAvailableListener;
    public CameraSource(java.lang.String p0) { super(null); }
    private void createFormats() {}
    private int[] findClosestFpsRange(int p0, android.hardware.Camera.Parameters p1) { return null; }
    private int[] findClosestSize(int p0, int p1, android.hardware.Camera.Parameters p2) { return null; }
    public void close(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public android.hardware.Camera.Parameters getCameraParameters() { return null; }
    public void open(android.filterfw.core.FilterContext p0) {}
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setCameraParameters(android.hardware.Camera.Parameters p0) {}
    public void setupPorts() {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
}
