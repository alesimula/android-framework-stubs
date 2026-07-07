package android.hardware.camera2.params;

public final class Face {
    public static final int ID_UNSUPPORTED = -1;
    public static final int SCORE_MAX = 100;
    public static final int SCORE_MIN = 1;
    private android.graphics.Rect mBounds;
    private int mId;
    private android.graphics.Point mLeftEye;
    private android.graphics.Point mMouth;
    private android.graphics.Point mRightEye;
    private int mScore;
    public Face(android.graphics.Rect p0, int p1) {}
    public Face(android.graphics.Rect p0, int p1, int p2, android.graphics.Point p3, android.graphics.Point p4, android.graphics.Point p5) {}
    private static void checkFace(android.graphics.Point p0, android.graphics.Point p1, android.graphics.Point p2) {}
    private static void checkId(int p0) {}
    private static void checkNotNull(java.lang.String p0, java.lang.Object p1) {}
    private static void checkNull(java.lang.String p0, java.lang.Object p1) {}
    private static void checkScore(int p0) {}
    private void init(android.graphics.Rect p0, int p1, int p2, android.graphics.Point p3, android.graphics.Point p4, android.graphics.Point p5) {}
    public android.graphics.Rect getBounds() { return null; }
    public int getId() { return 0; }
    public android.graphics.Point getLeftEyePosition() { return null; }
    public android.graphics.Point getMouthPosition() { return null; }
    public android.graphics.Point getRightEyePosition() { return null; }
    public int getScore() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private static final long FIELD_BOUNDS = 2L;
        private static final long FIELD_BUILT = 1L;
        private static final long FIELD_ID = 8L;
        private static final long FIELD_LEFT_EYE = 16L;
        private static final long FIELD_MOUTH = 64L;
        private static final java.lang.String FIELD_NAME_BOUNDS = "bounds";
        private static final java.lang.String FIELD_NAME_LEFT_EYE = "left eye";
        private static final java.lang.String FIELD_NAME_MOUTH = "mouth";
        private static final java.lang.String FIELD_NAME_RIGHT_EYE = "right eye";
        private static final java.lang.String FIELD_NAME_SCORE = "score";
        private static final long FIELD_RIGHT_EYE = 32L;
        private static final long FIELD_SCORE = 4L;
        private android.graphics.Rect mBounds;
        private long mBuilderFieldsSet;
        private int mId;
        private android.graphics.Point mLeftEye;
        private android.graphics.Point mMouth;
        private android.graphics.Point mRightEye;
        private int mScore;
        public Builder() {}
        public Builder(android.hardware.camera2.params.Face p0) {}
        private void checkFieldSet(long p0, java.lang.String p1) {}
        private void checkIdUnsupportedThenNull(java.lang.Object p0, java.lang.String p1) {}
        private void checkNotUsed() {}
        public android.hardware.camera2.params.Face build() { return null; }
        public android.hardware.camera2.params.Face.Builder setBounds(android.graphics.Rect p0) { return null; }
        public android.hardware.camera2.params.Face.Builder setId(int p0) { return null; }
        public android.hardware.camera2.params.Face.Builder setLeftEyePosition(android.graphics.Point p0) { return null; }
        public android.hardware.camera2.params.Face.Builder setMouthPosition(android.graphics.Point p0) { return null; }
        public android.hardware.camera2.params.Face.Builder setRightEyePosition(android.graphics.Point p0) { return null; }
        public android.hardware.camera2.params.Face.Builder setScore(int p0) { return null; }
    }
}
