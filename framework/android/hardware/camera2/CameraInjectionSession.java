package android.hardware.camera2;

public abstract class CameraInjectionSession implements java.lang.AutoCloseable {
    public CameraInjectionSession() {}
    public abstract void close();

    public static abstract class InjectionStatusCallback {
        public static final int ERROR_INJECTION_SERVICE = 1;
        public static final int ERROR_INJECTION_SESSION = 0;
        public static final int ERROR_INJECTION_UNSUPPORTED = 2;
        public InjectionStatusCallback() {}
        public abstract void onInjectionError(int p0);
        public abstract void onInjectionSucceeded(android.hardware.camera2.CameraInjectionSession p0);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ErrorCode {
        }
    }
}
