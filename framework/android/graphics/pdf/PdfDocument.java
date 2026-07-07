package android.graphics.pdf;

public class PdfDocument {
    private final byte[] mChunk = null;
    private android.graphics.pdf.PdfDocument.Page mCurrentPage;
    private long mNativeDocument;
    private final java.util.List<android.graphics.pdf.PdfDocument.PageInfo> mPages = null;
    public PdfDocument() {}
    private void dispose() {}
    private native void nativeClose(long p0);
    private native long nativeCreateDocument();
    private native void nativeFinishPage(long p0);
    private static native long nativeStartPage(long p0, int p1, int p2, int p3, int p4, int p5, int p6);
    private native void nativeWriteTo(long p0, java.io.OutputStream p1, byte[] p2);
    private void throwIfClosed() {}
    private void throwIfCurrentPageNotFinished() {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public void finishPage(android.graphics.pdf.PdfDocument.Page p0) {}
    public java.util.List<android.graphics.pdf.PdfDocument.PageInfo> getPages() { return null; }
    public android.graphics.pdf.PdfDocument.Page startPage(android.graphics.pdf.PdfDocument.PageInfo p0) { return null; }
    public void writeTo(java.io.OutputStream p0) throws java.io.IOException {}

    public static final class Page {
        private android.graphics.Canvas mCanvas;
        private final android.graphics.pdf.PdfDocument.PageInfo mPageInfo = null;
        private Page(android.graphics.Canvas p0, android.graphics.pdf.PdfDocument.PageInfo p1) {}
        private void finish() {}
        public android.graphics.Canvas getCanvas() { return null; }
        public android.graphics.pdf.PdfDocument.PageInfo getInfo() { return null; }
        boolean isFinished() { return false; }
    }

    public static final class PageInfo {
        private android.graphics.Rect mContentRect;
        private int mPageHeight;
        private int mPageNumber;
        private int mPageWidth;
        private PageInfo() {}
        public android.graphics.Rect getContentRect() { return null; }
        public int getPageHeight() { return 0; }
        public int getPageNumber() { return 0; }
        public int getPageWidth() { return 0; }

        public static final class Builder {
            private final android.graphics.pdf.PdfDocument.PageInfo mPageInfo = null;
            public Builder(int p0, int p1, int p2) {}
            public android.graphics.pdf.PdfDocument.PageInfo create() { return null; }
            public android.graphics.pdf.PdfDocument.PageInfo.Builder setContentRect(android.graphics.Rect p0) { return null; }
        }
    }

    private final class PdfCanvas extends android.graphics.Canvas {
        public PdfCanvas(android.graphics.pdf.PdfDocument p0, long p1) { super(); }
        public void setBitmap(android.graphics.Bitmap p0) {}
    }
}
