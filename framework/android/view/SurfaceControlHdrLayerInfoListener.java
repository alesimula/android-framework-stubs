package android.view;

public abstract class SurfaceControlHdrLayerInfoListener {
    private android.util.ArrayMap<android.os.IBinder, java.lang.Runnable> mRegisteredListeners;
    public SurfaceControlHdrLayerInfoListener() {}
    private static native long nGetDestructor();
    private native long nRegister(android.os.IBinder p0);
    public abstract void onHdrInfoChanged(android.os.IBinder p0, int p1, int p2, int p3, int p4, float p5);
    public void register(android.os.IBinder p0) {}
    public void unregister(android.os.IBinder p0) {}
    public void unregisterAll() {}
}
