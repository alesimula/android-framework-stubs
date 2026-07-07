package android.view;

public class InsetsFrameProvider implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.InsetsFrameProvider> CREATOR = null;
    public static final int SOURCE_ARBITRARY_RECTANGLE = 3;
    public static final int SOURCE_ATTACHED_CONTAINER_BOUNDS = 4;
    public static final int SOURCE_CONTAINER_BOUNDS = 1;
    public static final int SOURCE_DISPLAY = 0;
    public static final int SOURCE_FRAME = 2;
    private android.graphics.Rect mArbitraryRectangle;
    private android.graphics.Rect[] mBoundingRects;
    private int mFlags;
    private final int mId = 0;
    private android.view.InsetsBoundingRect[] mInsetsBoundingRects;
    private android.graphics.Insets mInsetsSize;
    private android.view.InsetsFrameProvider.InsetsSizeOverride[] mInsetsSizeOverrides;
    private android.graphics.Insets mMinimalInsetsSizeInDisplayCutoutSafe;
    private int mSource;
    public InsetsFrameProvider(android.os.Parcel p0) {}
    public InsetsFrameProvider(java.lang.Object p0, int p1, int p2) {}
    private static java.lang.String sourceToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.Rect getArbitraryRectangle() { return null; }
    @java.lang.Deprecated
    public android.graphics.Rect[] getBoundingRects() { return null; }
    public int getFlags() { return 0; }
    public int getId() { return 0; }
    public int getIndex() { return 0; }
    public android.view.InsetsBoundingRect[] getInsetsBoundingRects() { return null; }
    public android.graphics.Insets getInsetsSize() { return null; }
    public android.view.InsetsFrameProvider.InsetsSizeOverride[] getInsetsSizeOverrides() { return null; }
    public android.graphics.Insets getMinimalInsetsSizeInDisplayCutoutSafe() { return null; }
    public int getSource() { return 0; }
    public int getType() { return 0; }
    public boolean hasFlags(int p0) { return false; }
    public int hashCode() { return 0; }
    public boolean idEquals(android.view.InsetsFrameProvider p0) { return false; }
    public android.view.InsetsFrameProvider setArbitraryRectangle(android.graphics.Rect p0) { return null; }
    public android.view.InsetsFrameProvider setBoundingRects(android.graphics.Rect[] p0) { return null; }
    public android.view.InsetsFrameProvider setBoundingRects(android.view.InsetsBoundingRect[] p0) { return null; }
    public android.view.InsetsFrameProvider setFlags(int p0) { return null; }
    public android.view.InsetsFrameProvider setFlags(int p0, int p1) { return null; }
    public android.view.InsetsFrameProvider setInsetsSize(android.graphics.Insets p0) { return null; }
    public android.view.InsetsFrameProvider setInsetsSizeOverrides(android.view.InsetsFrameProvider.InsetsSizeOverride[] p0) { return null; }
    public android.view.InsetsFrameProvider setMinimalInsetsSizeInDisplayCutoutSafe(android.graphics.Insets p0) { return null; }
    public android.view.InsetsFrameProvider setSource(int p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class InsetsSizeOverride implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.InsetsFrameProvider.InsetsSizeOverride> CREATOR = null;
        private final android.graphics.Insets mInsetsSize = null;
        private final int mWindowType = 0;
        public InsetsSizeOverride(int p0, android.graphics.Insets p1) {}
        protected InsetsSizeOverride(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
        public android.graphics.Insets getInsetsSize() { return null; }
        public int getWindowType() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
