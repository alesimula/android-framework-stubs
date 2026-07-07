package android.graphics;

public final class Gainmap implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.graphics.Gainmap> CREATOR = null;
    public static final int GAINMAP_DIRECTION_HDR_TO_SDR = 1;
    public static final int GAINMAP_DIRECTION_SDR_TO_HDR = 0;
    private android.graphics.Bitmap mGainmapContents;
    final long mNativePtr = 0L;
    public Gainmap(android.graphics.Bitmap p0) {}
    private Gainmap(android.graphics.Bitmap p0, long p1) {}
    public Gainmap(android.graphics.Gainmap p0, android.graphics.Bitmap p1) {}
    private static native long nCreateCopy(long p0);
    private static native long nCreateEmpty();
    private static native android.graphics.ColorSpace nGetAlternativeColorSpace(long p0);
    private static native int nGetDirection(long p0);
    private static native float nGetDisplayRatioHdr(long p0);
    private static native float nGetDisplayRatioSdr(long p0);
    private static native void nGetEpsilonHdr(long p0, float[] p1);
    private static native void nGetEpsilonSdr(long p0, float[] p1);
    private static native long nGetFinalizer();
    private static native void nGetGamma(long p0, float[] p1);
    private static native void nGetRatioMax(long p0, float[] p1);
    private static native void nGetRatioMin(long p0, float[] p1);
    private static native void nReadGainmapFromParcel(long p0, android.os.Parcel p1);
    private static native void nSetAlternativeColorSpace(long p0, long p1);
    private static native void nSetBitmap(long p0, android.graphics.Bitmap p1);
    private static native void nSetDirection(long p0, int p1);
    private static native void nSetDisplayRatioHdr(long p0, float p1);
    private static native void nSetDisplayRatioSdr(long p0, float p1);
    private static native void nSetEpsilonHdr(long p0, float p1, float p2, float p3);
    private static native void nSetEpsilonSdr(long p0, float p1, float p2, float p3);
    private static native void nSetGamma(long p0, float p1, float p2, float p3);
    private static native void nSetRatioMax(long p0, float p1, float p2, float p3);
    private static native void nSetRatioMin(long p0, float p1, float p2, float p3);
    private static native void nWriteGainmapToParcel(long p0, android.os.Parcel p1);
    public android.graphics.Gainmap asShared() { return null; }
    public int describeContents() { return 0; }
    public android.graphics.ColorSpace getAlternativeImagePrimaries() { return null; }
    public float getDisplayRatioForFullHdr() { return 0.0f; }
    public float[] getEpsilonHdr() { return null; }
    public float[] getEpsilonSdr() { return null; }
    public android.graphics.Bitmap getGainmapContents() { return null; }
    public int getGainmapDirection() { return 0; }
    public float[] getGamma() { return null; }
    public float getMinDisplayRatioForHdrTransition() { return 0.0f; }
    public float[] getRatioMax() { return null; }
    public float[] getRatioMin() { return null; }
    public void setAlternativeImagePrimaries(android.graphics.ColorSpace p0) {}
    public void setDisplayRatioForFullHdr(float p0) {}
    public void setEpsilonHdr(float p0, float p1, float p2) {}
    public void setEpsilonSdr(float p0, float p1, float p2) {}
    public void setGainmapContents(android.graphics.Bitmap p0) {}
    public void setGainmapDirection(int p0) {}
    public void setGamma(float p0, float p1, float p2) {}
    public void setMinDisplayRatioForHdrTransition(float p0) {}
    public void setRatioMax(float p0, float p1, float p2) {}
    public void setRatioMin(float p0, float p1, float p2) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GainmapDirection {
    }

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }
}
