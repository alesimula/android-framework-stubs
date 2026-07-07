package android.hardware.camera2.params;

public final class ExtensionSessionConfiguration {
    private static final java.lang.String TAG = "ExtensionSessionConfiguration";
    private android.hardware.camera2.CameraExtensionSession.StateCallback mCallback;
    private int mColorSpace;
    private java.util.concurrent.Executor mExecutor;
    private int mExtensionType;
    private java.util.List<android.hardware.camera2.params.OutputConfiguration> mOutputs;
    private android.hardware.camera2.params.OutputConfiguration mPostviewOutput;
    private android.hardware.camera2.CaptureRequest mSessionParameters;
    public ExtensionSessionConfiguration(int p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraExtensionSession.StateCallback p3) {}
    public void clearColorSpace() {}
    public android.graphics.ColorSpace getColorSpace() { return null; }
    public java.util.concurrent.Executor getExecutor() { return null; }
    public int getExtension() { return 0; }
    public java.util.List<android.hardware.camera2.params.OutputConfiguration> getOutputConfigurations() { return null; }
    public android.hardware.camera2.params.OutputConfiguration getPostviewOutputConfiguration() { return null; }
    public android.hardware.camera2.CaptureRequest getSessionWideParams() { return null; }
    public android.hardware.camera2.CameraExtensionSession.StateCallback getStateCallback() { return null; }
    public void setColorSpace(android.graphics.ColorSpace.Named p0) {}
    public void setPostviewOutputConfiguration(android.hardware.camera2.params.OutputConfiguration p0) {}
    public void setSessionWideParams(android.hardware.camera2.CaptureRequest p0) {}
}
