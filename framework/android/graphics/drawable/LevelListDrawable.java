package android.graphics.drawable;

public class LevelListDrawable extends android.graphics.drawable.DrawableContainer {
    private android.graphics.drawable.LevelListDrawable.LevelListState mLevelListState;
    private boolean mMutated;
    public LevelListDrawable() { super(); }
    private LevelListDrawable(android.graphics.drawable.LevelListDrawable.LevelListState p0, android.content.res.Resources p1) { super(); }
    private void inflateChildElements(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void addLevel(int p0, int p1, android.graphics.drawable.Drawable p2) {}
    public void clearMutated() {}
    android.graphics.drawable.LevelListDrawable.LevelListState cloneConstantState() { return null; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public android.graphics.drawable.Drawable mutate() { return null; }
    protected boolean onLevelChange(int p0) { return false; }
    protected void setConstantState(android.graphics.drawable.DrawableContainer.DrawableContainerState p0) {}

    private static final class LevelListState extends android.graphics.drawable.DrawableContainer.DrawableContainerState {
        private int[] mHighs;
        private int[] mLows;
        LevelListState(android.graphics.drawable.LevelListDrawable.LevelListState p0, android.graphics.drawable.LevelListDrawable p1, android.content.res.Resources p2) { super(null, null, null); }
        private void mutate() {}
        public void addLevel(int p0, int p1, android.graphics.drawable.Drawable p2) {}
        public void growArray(int p0, int p1) {}
        public int indexOfLevel(int p0) { return 0; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
    }
}
