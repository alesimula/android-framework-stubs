package android.media;

public class FaceDetector {
    private static boolean sInitialized;
    private byte[] mBWBuffer;
    private long mDCR;
    private long mFD;
    private int mHeight;
    private int mMaxFaces;
    private long mSDK;
    private int mWidth;
    public FaceDetector(int p0, int p1, int p2) {}
    private native void fft_destroy();
    private native int fft_detect(android.graphics.Bitmap p0);
    private native void fft_get_face(android.media.FaceDetector.Face p0, int p1);
    private native int fft_initialize(int p0, int p1, int p2);
    private static native void nativeClassInit();
    protected void finalize() throws java.lang.Throwable {}
    public int findFaces(android.graphics.Bitmap p0, android.media.FaceDetector.Face[] p1) { return 0; }

    public class Face {
        public static final float CONFIDENCE_THRESHOLD = 0.4000000059604645f;
        public static final int EULER_X = 0;
        public static final int EULER_Y = 1;
        public static final int EULER_Z = 2;
        private float mConfidence;
        private float mEyesDist;
        private float mMidPointX;
        private float mMidPointY;
        private float mPoseEulerX;
        private float mPoseEulerY;
        private float mPoseEulerZ;
        private Face(android.media.FaceDetector p0) {}
        public float confidence() { return 0.0f; }
        public float eyesDistance() { return 0.0f; }
        public void getMidPoint(android.graphics.PointF p0) {}
        public float pose(int p0) { return 0.0f; }
    }
}
