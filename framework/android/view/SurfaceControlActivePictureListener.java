package android.view;

public abstract class SurfaceControlActivePictureListener {
    private java.lang.Runnable mDestructor;
    public SurfaceControlActivePictureListener() {}
    private static native long nativeGetDestructor();
    private native long nativeMakeAndStartListening();
    public abstract void onActivePicturesChanged(android.view.SurfaceControlActivePicture[] p0);
    public void startListening() {}
    public void stopListening() {}
}
