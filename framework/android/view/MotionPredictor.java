package android.view;

public final class MotionPredictor {
    private final boolean mIsPredictionEnabled = false;
    private final long mPtr = 0L;
    public MotionPredictor(android.content.Context p0) {}
    public MotionPredictor(boolean p0, int p1) {}
    private static native long nativeGetNativeMotionPredictorFinalizer();
    private static native long nativeInitialize(int p0);
    private static native boolean nativeIsPredictionAvailable(long p0, int p1, int p2);
    private static native android.view.MotionEvent nativePredict(long p0, long p1);
    private static native void nativeRecord(long p0, android.view.MotionEvent p1);
    public boolean isPredictionAvailable(int p0, int p1) { return false; }
    public android.view.MotionEvent predict(long p0) { return null; }
    public void record(android.view.MotionEvent p0) {}

    private static class RegistryHolder {
        private RegistryHolder() {}
    }
}
