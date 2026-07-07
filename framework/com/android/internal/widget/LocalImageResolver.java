package com.android.internal.widget;

public class LocalImageResolver {
    private static final int DEFAULT_DECODE_HARD_LIMIT_PX = 4096;
    static final int DEFAULT_MAX_SAFE_ICON_SIZE_PX = 480;
    public static final int NO_MAX_SIZE = -1;
    private static final java.lang.String TAG = "LocalImageResolver";
    public LocalImageResolver() {}
    private static void checkHeader(android.graphics.ImageDecoder.ImageInfo p0) throws java.lang.RuntimeException {}
    private static int getPowerOfTwoForSampleRatio(double p0) { return 0; }
    private static android.net.Uri getResolvableUri(android.graphics.drawable.Icon p0) { return null; }
    private static void onHeaderDecoded(android.graphics.ImageDecoder p0, android.graphics.ImageDecoder.ImageInfo p1, int p2, int p3) throws java.lang.RuntimeException {}
    private static android.graphics.drawable.Drawable resolveBitmapImage(android.graphics.drawable.Icon p0, android.content.Context p1, int p2, int p3) { return null; }
    public static android.graphics.drawable.Drawable resolveImage(int p0, android.content.Context p1, int p2, int p3) { return null; }
    private static android.graphics.drawable.Drawable resolveImage(android.content.res.Resources p0, int p1, int p2, int p3) { return null; }
    private static android.graphics.drawable.Drawable resolveImage(android.graphics.ImageDecoder.Source p0, int p1, int p2) { return null; }
    public static android.graphics.drawable.Drawable resolveImage(android.graphics.drawable.Icon p0, android.content.Context p1) throws java.io.IOException { return null; }
    public static android.graphics.drawable.Drawable resolveImage(android.graphics.drawable.Icon p0, android.content.Context p1, int p2, int p3) { return null; }
    public static android.graphics.drawable.Drawable resolveImage(android.net.Uri p0, android.content.Context p1) throws java.io.IOException { return null; }
    public static android.graphics.drawable.Drawable resolveImage(android.net.Uri p0, android.content.Context p1, int p2, int p3) { return null; }
    public static android.content.res.Resources resolveResourcesForIcon(android.content.Context p0, android.graphics.drawable.Icon p1) { return null; }
    private static android.graphics.drawable.Drawable tintDrawable(android.graphics.drawable.Icon p0, android.graphics.drawable.Drawable p1) { return null; }
}
