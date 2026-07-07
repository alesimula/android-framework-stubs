package android.graphics;

public abstract class ColorSpace {
    private static final android.graphics.ColorSpace.Rgb.TransferParameters BT2020_HLG_TRANSFER_PARAMETERS = null;
    private static final android.graphics.ColorSpace.Rgb.TransferParameters BT2020_PQ_TRANSFER_PARAMETERS = null;
    private static final float[] BT2020_PRIMARIES = null;
    private static final float[] DCI_P3_PRIMARIES = null;
    private static final float[] GRAY_PRIMARIES = null;
    public static final float[] ILLUMINANT_A = null;
    public static final float[] ILLUMINANT_B = null;
    public static final float[] ILLUMINANT_C = null;
    public static final float[] ILLUMINANT_D50 = null;
    private static final float[] ILLUMINANT_D50_XYZ = null;
    public static final float[] ILLUMINANT_D55 = null;
    public static final float[] ILLUMINANT_D60 = null;
    public static final float[] ILLUMINANT_D65 = null;
    public static final float[] ILLUMINANT_D75 = null;
    public static final float[] ILLUMINANT_E = null;
    public static final int MAX_ID = 63;
    public static final int MIN_ID = -1;
    private static final float[] NTSC_1953_PRIMARIES = null;
    private static final android.graphics.ColorSpace.Rgb.TransferParameters SMPTE_170M_TRANSFER_PARAMETERS = null;
    private static final float[] SRGB_PRIMARIES = null;
    private static final android.graphics.ColorSpace.Rgb.TransferParameters SRGB_TRANSFER_PARAMETERS = null;
    private static final android.util.SparseIntArray sDataToColorSpaces = null;
    private static final java.util.HashMap<java.lang.Integer, android.graphics.ColorSpace> sNamedColorSpaceMap = null;
    private final int mId = 0;
    private final android.graphics.ColorSpace.Model mModel = null;
    private final java.lang.String mName = null;
    ColorSpace(java.lang.String p0, android.graphics.ColorSpace.Model p1, int p2) {}
    private static double absRcpResponse(double p0, double p1, double p2, double p3, double p4, double p5) { return 0.0; }
    private static double absResponse(double p0, double p1, double p2, double p3, double p4, double p5) { return 0.0; }
    public static android.graphics.ColorSpace adapt(android.graphics.ColorSpace p0, float[] p1) { return null; }
    public static android.graphics.ColorSpace adapt(android.graphics.ColorSpace p0, float[] p1, android.graphics.ColorSpace.Adaptation p2) { return null; }
    private static float[] adaptToIlluminantD50(float[] p0, float[] p1) { return null; }
    public static float[] cctToXyz(int p0) { return null; }
    public static float[] chromaticAdaptation(android.graphics.ColorSpace.Adaptation p0, float[] p1, float[] p2) { return null; }
    private static float[] chromaticAdaptation(float[] p0, float[] p1, float[] p2) { return null; }
    private static float clamp(float p0, float p1, float p2) { return 0.0f; }
    private static boolean compare(android.graphics.ColorSpace.Rgb.TransferParameters p0, android.graphics.ColorSpace.Rgb.TransferParameters p1) { return false; }
    private static boolean compare(float[] p0, float[] p1) { return false; }
    public static android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace p0) { return null; }
    public static android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace p0, android.graphics.ColorSpace.RenderIntent p1) { return null; }
    public static android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace p0, android.graphics.ColorSpace p1) { return null; }
    public static android.graphics.ColorSpace.Connector connect(android.graphics.ColorSpace p0, android.graphics.ColorSpace p1, android.graphics.ColorSpace.RenderIntent p2) { return null; }
    static android.graphics.ColorSpace get(int p0) { return null; }
    public static android.graphics.ColorSpace get(android.graphics.ColorSpace.Named p0) { return null; }
    public static android.graphics.ColorSpace getFromDataSpace(int p0) { return null; }
    private static float[] inverse3x3(float[] p0) { return null; }
    public static android.graphics.ColorSpace match(float[] p0, android.graphics.ColorSpace.Rgb.TransferParameters p1) { return null; }
    private static float[] mul3x3(float[] p0, float[] p1) { return null; }
    private static float[] mul3x3Diag(float[] p0, float[] p1) { return null; }
    private static float[] mul3x3Float3(float[] p0, float[] p1) { return null; }
    private static double rcpResponse(double p0, double p1, double p2, double p3, double p4, double p5) { return 0.0; }
    private static double rcpResponse(double p0, double p1, double p2, double p3, double p4, double p5, double p6, double p7) { return 0.0; }
    private static double response(double p0, double p1, double p2, double p3, double p4, double p5) { return 0.0; }
    private static double response(double p0, double p1, double p2, double p3, double p4, double p5, double p6, double p7) { return 0.0; }
    private static double transferHLGEOTF(android.graphics.ColorSpace.Rgb.TransferParameters p0, double p1) { return 0.0; }
    private static double transferHLGOETF(android.graphics.ColorSpace.Rgb.TransferParameters p0, double p1) { return 0.0; }
    private static double transferST2048EOTF(android.graphics.ColorSpace.Rgb.TransferParameters p0, double p1) { return 0.0; }
    private static double transferST2048OETF(android.graphics.ColorSpace.Rgb.TransferParameters p0, double p1) { return 0.0; }
    private static float[] xyYToXyz(float[] p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public float[] fromXyz(float p0, float p1, float p2) { return null; }
    public abstract float[] fromXyz(float[] p0);
    public int getComponentCount() { return 0; }
    public int getDataSpace() { return 0; }
    public int getId() { return 0; }
    public abstract float getMaxValue(int p0);
    public abstract float getMinValue(int p0);
    public android.graphics.ColorSpace.Model getModel() { return null; }
    public java.lang.String getName() { return null; }
    long getNativeInstance() { return 0L; }
    public int hashCode() { return 0; }
    public boolean isSrgb() { return false; }
    public abstract boolean isWideGamut();
    public java.lang.String toString() { return null; }
    public float[] toXyz(float p0, float p1, float p2) { return null; }
    public abstract float[] toXyz(float[] p0);

    public static enum Adaptation {
        BRADFORD,
        CIECAT02,
        VON_KRIES;
        private static final android.graphics.ColorSpace.Adaptation[] $VALUES = null;
        final float[] mTransform = null;
        private Adaptation() {}
    }

    public static class Connector {
        private final android.graphics.ColorSpace mDestination = null;
        private final android.graphics.ColorSpace.RenderIntent mIntent = null;
        private final android.graphics.ColorSpace mSource = null;
        private final float[] mTransform = null;
        private final android.graphics.ColorSpace mTransformDestination = null;
        private final android.graphics.ColorSpace mTransformSource = null;
        Connector(android.graphics.ColorSpace p0, android.graphics.ColorSpace p1, android.graphics.ColorSpace.RenderIntent p2) {}
        private Connector(android.graphics.ColorSpace p0, android.graphics.ColorSpace p1, android.graphics.ColorSpace p2, android.graphics.ColorSpace p3, android.graphics.ColorSpace.RenderIntent p4, float[] p5) {}
        private static float[] computeTransform(android.graphics.ColorSpace p0, android.graphics.ColorSpace p1, android.graphics.ColorSpace.RenderIntent p2) { return null; }
        static android.graphics.ColorSpace.Connector identity(android.graphics.ColorSpace p0) { return null; }
        public android.graphics.ColorSpace getDestination() { return null; }
        public android.graphics.ColorSpace.RenderIntent getRenderIntent() { return null; }
        public android.graphics.ColorSpace getSource() { return null; }
        public float[] transform(float p0, float p1, float p2) { return null; }
        public float[] transform(float[] p0) { return null; }

        private static class Rgb extends android.graphics.ColorSpace.Connector {
            private final android.graphics.ColorSpace.Rgb mDestination = null;
            private final android.graphics.ColorSpace.Rgb mSource = null;
            private final float[] mTransform = null;
            Rgb(android.graphics.ColorSpace.Rgb p0, android.graphics.ColorSpace.Rgb p1, android.graphics.ColorSpace.RenderIntent p2) { super((android.graphics.ColorSpace)null, (android.graphics.ColorSpace)null, (android.graphics.ColorSpace.RenderIntent)null); }
            private static float[] computeTransform(android.graphics.ColorSpace.Rgb p0, android.graphics.ColorSpace.Rgb p1, android.graphics.ColorSpace.RenderIntent p2) { return null; }
            public float[] transform(float[] p0) { return null; }
        }
    }

    private static final class Lab extends android.graphics.ColorSpace {
        private static final float A = 0.008856452070176601f;
        private static final float B = 7.787036895751953f;
        private static final float C = 0.13793103396892548f;
        private static final float D = 0.2068965584039688f;
        private Lab(java.lang.String p0, int p1) { super(null, null, 0); }
        public float[] fromXyz(float[] p0) { return null; }
        public float getMaxValue(int p0) { return 0.0f; }
        public float getMinValue(int p0) { return 0.0f; }
        public boolean isWideGamut() { return false; }
        public float[] toXyz(float[] p0) { return null; }
    }

    public static enum Model {
        CMYK,
        LAB,
        RGB,
        XYZ;
        private static final android.graphics.ColorSpace.Model[] $VALUES = null;
        private final int mComponentCount = 0;
        private Model() {}
        public int getComponentCount() { return 0; }
    }

    public static enum Named {
        ACES,
        ACESCG,
        ADOBE_RGB,
        BT2020,
        BT2020_HLG,
        BT2020_PQ,
        BT709,
        CIE_LAB,
        CIE_XYZ,
        DCI_P3,
        DISPLAY_BT2020,
        DISPLAY_P3,
        EXTENDED_SRGB,
        LINEAR_EXTENDED_SRGB,
        LINEAR_SRGB,
        NTSC_1953,
        OK_LAB,
        PRO_PHOTO_RGB,
        SMPTE_C,
        SRGB;
        private static final android.graphics.ColorSpace.Named[] $VALUES = null;
        private Named() {}
    }

    private static final class OkLab extends android.graphics.ColorSpace {
        private static final float[] INVERSE_M1 = null;
        private static final float[] INVERSE_M2 = null;
        private static final float[] M1 = null;
        private static final float[] M1TMP = null;
        private static final float[] M2 = null;
        private OkLab(java.lang.String p0, int p1) { super(null, null, 0); }
        public float[] fromXyz(float[] p0) { return null; }
        public float getMaxValue(int p0) { return 0.0f; }
        public float getMinValue(int p0) { return 0.0f; }
        public boolean isWideGamut() { return false; }
        public float[] toXyz(float[] p0) { return null; }
    }

    public static enum RenderIntent {
        ABSOLUTE,
        PERCEPTUAL,
        RELATIVE,
        SATURATION;
        private static final android.graphics.ColorSpace.RenderIntent[] $VALUES = null;
        private RenderIntent() {}
    }

    public static class Rgb extends android.graphics.ColorSpace {
        private final java.util.function.DoubleUnaryOperator mClampedEotf = null;
        private final java.util.function.DoubleUnaryOperator mClampedOetf = null;
        private final java.util.function.DoubleUnaryOperator mEotf = null;
        private final float[] mInverseTransform = null;
        private final boolean mIsSrgb = false;
        private final boolean mIsWideGamut = false;
        private final float mMax = 0.0f;
        private final float mMin = 0.0f;
        private final long mNativePtr = 0L;
        private final java.util.function.DoubleUnaryOperator mOetf = null;
        private final float[] mPrimaries = null;
        private final android.graphics.ColorSpace.Rgb.TransferParameters mTransferParameters = null;
        private final float[] mTransform = null;
        private final float[] mWhitePoint = null;
        private Rgb(android.graphics.ColorSpace.Rgb p0, float[] p1, float[] p2) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, double p2) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, android.graphics.ColorSpace.Rgb.TransferParameters p2) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, java.util.function.DoubleUnaryOperator p2, java.util.function.DoubleUnaryOperator p3) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, float[] p2, double p3) { super(null, null, 0); }
        private Rgb(java.lang.String p0, float[] p1, float[] p2, double p3, float p4, float p5, int p6) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, float[] p2, android.graphics.ColorSpace.Rgb.TransferParameters p3) { super(null, null, 0); }
        public Rgb(java.lang.String p0, float[] p1, float[] p2, java.util.function.DoubleUnaryOperator p3, java.util.function.DoubleUnaryOperator p4, float p5, float p6) { super(null, null, 0); }
        private Rgb(java.lang.String p0, float[] p1, float[] p2, float[] p3, android.graphics.ColorSpace.Rgb.TransferParameters p4, int p5) { super(null, null, 0); }
        private Rgb(java.lang.String p0, float[] p1, float[] p2, float[] p3, java.util.function.DoubleUnaryOperator p4, java.util.function.DoubleUnaryOperator p5, float p6, float p7, android.graphics.ColorSpace.Rgb.TransferParameters p8, int p9) { super(null, null, 0); }
        private static float area(float[] p0) { return 0.0f; }
        private double clamp(double p0) { return 0.0; }
        private static boolean compare(double p0, java.util.function.DoubleUnaryOperator p1, java.util.function.DoubleUnaryOperator p2) { return false; }
        private static float[] computePrimaries(float[] p0) { return null; }
        private static float[] computeWhitePoint(float[] p0) { return null; }
        private static float[] computeXYZMatrix(float[] p0, float[] p1) { return null; }
        private static boolean contains(float[] p0, float[] p1) { return false; }
        private static float cross(float p0, float p1, float p2, float p3) { return 0.0f; }
        private static java.util.function.DoubleUnaryOperator generateEOTF(android.graphics.ColorSpace.Rgb.TransferParameters p0) { return null; }
        private static java.util.function.DoubleUnaryOperator generateOETF(android.graphics.ColorSpace.Rgb.TransferParameters p0) { return null; }
        private static boolean isGray(float[] p0) { return false; }
        private static boolean isSrgb(float[] p0, float[] p1, java.util.function.DoubleUnaryOperator p2, java.util.function.DoubleUnaryOperator p3, float p4, float p5, int p6) { return false; }
        private static boolean isWideGamut(float[] p0, float p1, float p2) { return false; }
        private static float[] xyPrimaries(float[] p0) { return null; }
        private static float[] xyWhitePoint(float[] p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public float[] fromLinear(float p0, float p1, float p2) { return null; }
        public float[] fromLinear(float[] p0) { return null; }
        public float[] fromXyz(float[] p0) { return null; }
        public java.util.function.DoubleUnaryOperator getEotf() { return null; }
        public float[] getInverseTransform() { return null; }
        public float[] getInverseTransform(float[] p0) { return null; }
        public float getMaxValue(int p0) { return 0.0f; }
        public float getMinValue(int p0) { return 0.0f; }
        long getNativeInstance() { return 0L; }
        public java.util.function.DoubleUnaryOperator getOetf() { return null; }
        public float[] getPrimaries() { return null; }
        public float[] getPrimaries(float[] p0) { return null; }
        public android.graphics.ColorSpace.Rgb.TransferParameters getTransferParameters() { return null; }
        public float[] getTransform() { return null; }
        public float[] getTransform(float[] p0) { return null; }
        public float[] getWhitePoint() { return null; }
        public float[] getWhitePoint(float[] p0) { return null; }
        public int hashCode() { return 0; }
        public boolean isSrgb() { return false; }
        public boolean isWideGamut() { return false; }
        public float[] toLinear(float p0, float p1, float p2) { return null; }
        public float[] toLinear(float[] p0) { return null; }
        public float[] toXyz(float[] p0) { return null; }

        static class Native {
            Native() {}
            static native long nativeCreate(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float[] p7);
            static native long nativeGetNativeFinalizer();
        }

        private static class NoImagePreloadHolder {
            private NoImagePreloadHolder() {}
        }

        public static class TransferParameters {
            private static final double TYPE_HLGish = -3.0;
            private static final double TYPE_PQish = -2.0;
            public final double a = 0.0;
            public final double b = 0.0;
            public final double c = 0.0;
            public final double d = 0.0;
            public final double e = 0.0;
            public final double f = 0.0;
            public final double g = 0.0;
            public TransferParameters(double p0, double p1, double p2, double p3, double p4) {}
            public TransferParameters(double p0, double p1, double p2, double p3, double p4, double p5, double p6) {}
            private boolean isHLGish() { return false; }
            private boolean isPQish() { return false; }
            private static boolean isSpecialG(double p0) { return false; }
            public boolean equals(java.lang.Object p0) { return false; }
            public int hashCode() { return 0; }
        }
    }

    private static final class Xyz extends android.graphics.ColorSpace {
        private Xyz(java.lang.String p0, int p1) { super(null, null, 0); }
        private static float clamp(float p0) { return 0.0f; }
        public float[] fromXyz(float[] p0) { return null; }
        public float getMaxValue(int p0) { return 0.0f; }
        public float getMinValue(int p0) { return 0.0f; }
        public boolean isWideGamut() { return false; }
        public float[] toXyz(float[] p0) { return null; }
    }
}
