package com.android.internal.graphics.palette;

final class ColorCutQuantizer implements com.android.internal.graphics.palette.Quantizer {
    static final int COMPONENT_BLUE = -1;
    static final int COMPONENT_GREEN = -2;
    static final int COMPONENT_RED = -3;
    private static final java.lang.String LOG_TAG = "ColorCutQuantizer";
    private static final boolean LOG_TIMINGS = false;
    private static final int QUANTIZE_WORD_MASK = 31;
    private static final int QUANTIZE_WORD_WIDTH = 5;
    private static final java.util.Comparator<com.android.internal.graphics.palette.ColorCutQuantizer.Vbox> VBOX_COMPARATOR_VOLUME = null;
    int[] mColors;
    int[] mHistogram;
    java.util.List<com.android.internal.graphics.palette.Palette.Swatch> mQuantizedColors;
    private final float[] mTempHsl = null;
    android.util.TimingLogger mTimingLogger;
    ColorCutQuantizer() {}
    private static int approximateToRgb888(int p0) { return 0; }
    static int approximateToRgb888(int p0, int p1, int p2) { return 0; }
    private java.util.List<com.android.internal.graphics.palette.Palette.Swatch> generateAverageColors(java.util.Collection<com.android.internal.graphics.palette.ColorCutQuantizer.Vbox> p0) { return null; }
    static void modifySignificantOctet(int[] p0, int p1, int p2, int p3) {}
    private static int modifyWordWidth(int p0, int p1, int p2) { return 0; }
    private static int quantizeFromRgb888(int p0) { return 0; }
    private java.util.List<com.android.internal.graphics.palette.Palette.Swatch> quantizePixels(int p0) { return null; }
    static int quantizedBlue(int p0) { return 0; }
    static int quantizedGreen(int p0) { return 0; }
    static int quantizedRed(int p0) { return 0; }
    private void splitBoxes(java.util.PriorityQueue<com.android.internal.graphics.palette.ColorCutQuantizer.Vbox> p0, int p1) {}
    public java.util.List<com.android.internal.graphics.palette.Palette.Swatch> getQuantizedColors() { return null; }
    public void quantize(int[] p0, int p1) {}

    private class Vbox {
        private final int mLowerIndex = 0;
        private int mMaxBlue;
        private int mMaxGreen;
        private int mMaxRed;
        private int mMinBlue;
        private int mMinGreen;
        private int mMinRed;
        private int mPopulation;
        private int mUpperIndex;
        Vbox(com.android.internal.graphics.palette.ColorCutQuantizer p0, int p1, int p2) {}
        final boolean canSplit() { return false; }
        final int findSplitPoint() { return 0; }
        final void fitBox() {}
        final com.android.internal.graphics.palette.Palette.Swatch getAverageColor() { return null; }
        final int getColorCount() { return 0; }
        final int getLongestColorDimension() { return 0; }
        final int getVolume() { return 0; }
        final com.android.internal.graphics.palette.ColorCutQuantizer.Vbox splitBox() { return null; }
    }
}
