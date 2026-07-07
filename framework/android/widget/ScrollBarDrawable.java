package android.widget;

public class ScrollBarDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    private int mAlpha;
    private boolean mAlwaysDrawHorizontalTrack;
    private boolean mAlwaysDrawVerticalTrack;
    private boolean mBoundsChanged;
    private android.graphics.ColorFilter mColorFilter;
    private int mExtent;
    private boolean mHasSetAlpha;
    private boolean mHasSetColorFilter;
    private android.graphics.drawable.Drawable mHorizontalThumb;
    private android.graphics.drawable.Drawable mHorizontalTrack;
    private boolean mMutated;
    private int mOffset;
    private int mRange;
    private boolean mRangeChanged;
    private boolean mVertical;
    private android.graphics.drawable.Drawable mVerticalThumb;
    private android.graphics.drawable.Drawable mVerticalTrack;
    public ScrollBarDrawable() { super(); }
    private void drawThumb(android.graphics.Canvas p0, android.graphics.Rect p1, int p2, int p3, boolean p4) {}
    private void drawTrack(android.graphics.Canvas p0, android.graphics.Rect p1, boolean p2) {}
    private void propagateCurrentState(android.graphics.drawable.Drawable p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public int getAlpha() { return 0; }
    public boolean getAlwaysDrawHorizontalTrack() { return false; }
    public boolean getAlwaysDrawVerticalTrack() { return false; }
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public android.graphics.drawable.Drawable getHorizontalThumbDrawable() { return null; }
    public android.graphics.drawable.Drawable getHorizontalTrackDrawable() { return null; }
    public int getOpacity() { return 0; }
    public int getSize(boolean p0) { return 0; }
    public android.graphics.drawable.Drawable getVerticalThumbDrawable() { return null; }
    public android.graphics.drawable.Drawable getVerticalTrackDrawable() { return null; }
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    public boolean isStateful() { return false; }
    public android.widget.ScrollBarDrawable mutate() { return null; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    protected boolean onStateChange(int[] p0) { return false; }
    public void scheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2) {}
    public void setAlpha(int p0) {}
    public void setAlwaysDrawHorizontalTrack(boolean p0) {}
    public void setAlwaysDrawVerticalTrack(boolean p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setHorizontalThumbDrawable(android.graphics.drawable.Drawable p0) {}
    public void setHorizontalTrackDrawable(android.graphics.drawable.Drawable p0) {}
    public void setParameters(int p0, int p1, int p2, boolean p3) {}
    public void setVerticalThumbDrawable(android.graphics.drawable.Drawable p0) {}
    public void setVerticalTrackDrawable(android.graphics.drawable.Drawable p0) {}
    public java.lang.String toString() { return null; }
    public void unscheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1) {}
}
