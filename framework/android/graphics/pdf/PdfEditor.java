package android.graphics.pdf;

public final class PdfEditor {
    private static final java.lang.Object sPdfiumLock = null;
    private android.os.ParcelFileDescriptor mInput;
    private long mNativeDocument;
    private int mPageCount;
    public PdfEditor(android.os.ParcelFileDescriptor p0) throws java.io.IOException {}
    private void doClose() {}
    private static native void nativeClose(long p0);
    private static native int nativeGetPageCount(long p0);
    private static native boolean nativeGetPageCropBox(long p0, int p1, android.graphics.Rect p2);
    private static native boolean nativeGetPageMediaBox(long p0, int p1, android.graphics.Rect p2);
    private static native void nativeGetPageSize(long p0, int p1, android.graphics.Point p2);
    private static native long nativeOpen(int p0, long p1);
    private static native int nativeRemovePage(long p0, int p1);
    private static native boolean nativeScaleForPrinting(long p0);
    private static native void nativeSetPageCropBox(long p0, int p1, android.graphics.Rect p2);
    private static native void nativeSetPageMediaBox(long p0, int p1, android.graphics.Rect p2);
    private static native void nativeSetTransformAndClip(long p0, int p1, long p2, int p3, int p4, int p5, int p6);
    private static native void nativeWrite(long p0, int p1);
    private void throwIfClosed() {}
    private void throwIfCropBoxNull(android.graphics.Rect p0) {}
    private void throwIfMediaBoxNull(android.graphics.Rect p0) {}
    private void throwIfNotNullAndNotAfine(android.graphics.Matrix p0) {}
    private void throwIfOutCropBoxNull(android.graphics.Rect p0) {}
    private void throwIfOutMediaBoxNull(android.graphics.Rect p0) {}
    private void throwIfOutSizeNull(android.graphics.Point p0) {}
    private void throwIfPageNotInDocument(int p0) {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public int getPageCount() { return 0; }
    public boolean getPageCropBox(int p0, android.graphics.Rect p1) { return false; }
    public boolean getPageMediaBox(int p0, android.graphics.Rect p1) { return false; }
    public void getPageSize(int p0, android.graphics.Point p1) {}
    public void removePage(int p0) {}
    public void setPageCropBox(int p0, android.graphics.Rect p1) {}
    public void setPageMediaBox(int p0, android.graphics.Rect p1) {}
    public void setTransformAndClip(int p0, android.graphics.Matrix p1, android.graphics.Rect p2) {}
    public boolean shouldScaleForPrinting() { return false; }
    public void write(android.os.ParcelFileDescriptor p0) throws java.io.IOException {}
}
