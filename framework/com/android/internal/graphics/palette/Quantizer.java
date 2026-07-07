package com.android.internal.graphics.palette;

public interface Quantizer {
    public java.util.List<com.android.internal.graphics.palette.Palette.Swatch> getQuantizedColors();
    public void quantize(int[] p0, int p1);
}
