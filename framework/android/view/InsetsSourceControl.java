package android.view;

public class InsetsSourceControl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.InsetsSourceControl> CREATOR = null;
    private final int mId = 0;
    private android.view.inputmethod.ImeTracker.Token mImeStatsToken;
    private final boolean mInitiallyVisible = false;
    private android.graphics.Insets mInsetsHint;
    private final android.view.SurfaceControl mLeash = null;
    private int mParcelableFlags;
    private boolean mSkipAnimationOnce;
    private final android.graphics.Point mSurfacePosition = null;
    private final int mType = 0;
    public InsetsSourceControl(int p0, int p1, android.view.SurfaceControl p2, boolean p3, android.graphics.Point p4, android.graphics.Insets p5) {}
    public InsetsSourceControl(android.os.Parcel p0) {}
    public InsetsSourceControl(android.view.InsetsSourceControl p0) {}
    public int describeContents() { return 0; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean getAndClearSkipAnimationOnce() { return false; }
    public int getId() { return 0; }
    public android.view.inputmethod.ImeTracker.Token getImeStatsToken() { return null; }
    public android.graphics.Insets getInsetsHint() { return null; }
    public android.view.SurfaceControl getLeash() { return null; }
    public android.graphics.Point getSurfacePosition() { return null; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public boolean isFake() { return false; }
    public boolean isInitiallyVisible() { return false; }
    public void release(java.util.function.Consumer<android.view.SurfaceControl> p0) {}
    public void setImeStatsToken(android.view.inputmethod.ImeTracker.Token p0) {}
    public void setInsetsHint(int p0, int p1, int p2, int p3) {}
    public void setInsetsHint(android.graphics.Insets p0) {}
    public void setParcelableFlags(int p0) {}
    public void setSkipAnimationOnce(boolean p0) {}
    public boolean setSurfacePosition(int p0, int p1) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Array implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.InsetsSourceControl.Array> CREATOR = null;
        private android.view.InsetsSourceControl[] mControls;
        private int mSeq;
        public Array() {}
        public Array(android.os.Parcel p0) {}
        public Array(android.view.InsetsSourceControl.Array p0, boolean p1) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.view.InsetsSourceControl[] get() { return null; }
        public int getSeq() { return 0; }
        public int hashCode() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void release() {}
        public void set(android.view.InsetsSourceControl[] p0, boolean p1) {}
        public void setParcelableFlags(int p0) {}
        public void setSeq(int p0) {}
        public void setTo(android.view.InsetsSourceControl.Array p0, boolean p1) {}
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
