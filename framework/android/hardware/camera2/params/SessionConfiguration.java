package android.hardware.camera2.params;

public final class SessionConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.params.SessionConfiguration> CREATOR = null;
    public static final int SESSION_HIGH_SPEED = 1;
    public static final int SESSION_REGULAR = 0;
    @android.annotation.SystemApi
    public static final int SESSION_SHARED = 2;
    public static final int SESSION_VENDOR_START = 32768;
    private static final java.lang.String TAG = "SessionConfiguration";
    private int mColorSpace;
    private java.util.concurrent.Executor mExecutor;
    private android.hardware.camera2.params.InputConfiguration mInputConfig;
    private final java.util.List<android.hardware.camera2.params.OutputConfiguration> mOutputConfigurations = null;
    private android.hardware.camera2.CaptureRequest mSessionParameters;
    private int mSessionType;
    private android.hardware.camera2.CameraCaptureSession.StateCallback mStateCallback;
    public SessionConfiguration(int p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1) {}
    public SessionConfiguration(int p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraCaptureSession.StateCallback p3) {}
    private SessionConfiguration(android.os.Parcel p0) {}
    public void clearColorSpace() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.ColorSpace getColorSpace() { return null; }
    public java.util.concurrent.Executor getExecutor() { return null; }
    public android.hardware.camera2.params.InputConfiguration getInputConfiguration() { return null; }
    public java.util.List<android.hardware.camera2.params.OutputConfiguration> getOutputConfigurations() { return null; }
    public android.hardware.camera2.CaptureRequest getSessionParameters() { return null; }
    public int getSessionType() { return 0; }
    public android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback() { return null; }
    public int hashCode() { return 0; }
    public void setColorSpace(android.graphics.ColorSpace.Named p0) {}
    public void setInputConfiguration(android.hardware.camera2.params.InputConfiguration p0) {}
    public void setSessionParameters(android.hardware.camera2.CaptureRequest p0) {}
    public void setStateCallback(java.util.concurrent.Executor p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SessionMode {
    }
}
