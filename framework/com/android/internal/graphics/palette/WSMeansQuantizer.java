package com.android.internal.graphics.palette;

public final class WSMeansQuantizer implements com.android.internal.graphics.palette.Quantizer {
    static final boolean $assertionsDisabled = false;
    private static final boolean DEBUG = false;
    private static final int MAX_ITERATIONS = 10;
    private static final float MIN_MOVEMENT_DISTANCE = 3.0f;
    private static final java.lang.String TAG = "QuantizerWsmeans";
    private int[] mClusterIndices;
    private int[] mClusterPopulations;
    private float[][] mClusters;
    private float[][] mDistanceMatrix;
    private int[][] mIndexMatrix;
    private java.util.Map<java.lang.Integer, java.lang.Integer> mInputPixelToCount;
    private com.android.internal.graphics.palette.Palette mPalette;
    private int[] mPixels;
    private final com.android.internal.graphics.palette.PointProvider mPointProvider = null;
    private float[][] mPoints;
    public WSMeansQuantizer(int[] p0, com.android.internal.graphics.palette.PointProvider p1, java.util.Map<java.lang.Integer, java.lang.Integer> p2) {}
    private void initializeClusters(int p0) {}
    void calculateClusterDistances(int p0) {}
    public java.util.List<com.android.internal.graphics.palette.Palette.Swatch> getQuantizedColors() { return null; }
    public void quantize(int[] p0, int p1) {}
    boolean reassignPoints(int p0) { return false; }
    void recalculateClusterCenters(int p0) {}

    private static class Distance {
        private final float mDistance = 0.0f;
        private final int mIndex = 0;
        Distance(int p0, float p1) {}
        float getDistance() { return 0.0f; }
        int getIndex() { return 0; }
    }
}
