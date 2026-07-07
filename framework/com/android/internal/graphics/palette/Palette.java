package com.android.internal.graphics.palette;

public final class Palette {
    static final int DEFAULT_CALCULATE_NUMBER_COLORS = 16;
    static final com.android.internal.graphics.palette.Palette.Filter DEFAULT_FILTER = null;
    static final int DEFAULT_RESIZE_BITMAP_AREA = 12544;
    static final java.lang.String LOG_TAG = "Palette";
    private final com.android.internal.graphics.palette.Palette.Swatch mDominantSwatch = null;
    private final java.util.List<com.android.internal.graphics.palette.Palette.Swatch> mSwatches = null;
    Palette(java.util.List<com.android.internal.graphics.palette.Palette.Swatch> p0) {}
    private com.android.internal.graphics.palette.Palette.Swatch findDominantSwatch() { return null; }
    public static com.android.internal.graphics.palette.Palette.Builder from(android.graphics.Bitmap p0, com.android.internal.graphics.palette.Quantizer p1) { return null; }
    public static com.android.internal.graphics.palette.Palette from(java.util.List<com.android.internal.graphics.palette.Palette.Swatch> p0) { return null; }
    public com.android.internal.graphics.palette.Palette.Swatch getDominantSwatch() { return null; }
    public java.util.List<com.android.internal.graphics.palette.Palette.Swatch> getSwatches() { return null; }

    public static class Builder {
        static final boolean $assertionsDisabled = false;
        private final android.graphics.Bitmap mBitmap = null;
        private int mMaxColors;
        private com.android.internal.graphics.palette.Quantizer mQuantizer;
        private android.graphics.Rect mRegion;
        private int mResizeArea;
        private int mResizeMaxDimension;
        private final java.util.List<com.android.internal.graphics.palette.Palette.Swatch> mSwatches = null;
        public Builder(android.graphics.Bitmap p0, com.android.internal.graphics.palette.Quantizer p1) {}
        public Builder(java.util.List<com.android.internal.graphics.palette.Palette.Swatch> p0) {}
        private int[] getPixelsFromBitmap(android.graphics.Bitmap p0) { return null; }
        private android.graphics.Bitmap scaleBitmapDown(android.graphics.Bitmap p0) { return null; }
        public com.android.internal.graphics.palette.Palette.Builder clearRegion() { return null; }
        @java.lang.Deprecated
        public android.os.AsyncTask<android.graphics.Bitmap, java.lang.Void, com.android.internal.graphics.palette.Palette> generate(com.android.internal.graphics.palette.Palette.PaletteAsyncListener p0) { return null; }
        public com.android.internal.graphics.palette.Palette generate() { return null; }
        public com.android.internal.graphics.palette.Palette.Builder maximumColorCount(int p0) { return null; }
        public com.android.internal.graphics.palette.Palette.Builder resizeBitmapArea(int p0) { return null; }
        @java.lang.Deprecated
        public com.android.internal.graphics.palette.Palette.Builder resizeBitmapSize(int p0) { return null; }
        public com.android.internal.graphics.palette.Palette.Builder setRegion(int p0, int p1, int p2, int p3) { return null; }
    }

    public static interface Filter {
        public boolean isAllowed(int p0, float[] p1);
    }

    public static interface PaletteAsyncListener {
        public void onGenerated(com.android.internal.graphics.palette.Palette p0);
    }

    public static class Swatch {
        private final android.graphics.Color mColor = null;
        private final int mPopulation = 0;
        public Swatch(int p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int getInt() { return 0; }
        public int getPopulation() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
