package android.view;

public abstract class ActionMode {
    public static final int DEFAULT_HIDE_DURATION = -1;
    public static final int TYPE_FLOATING = 1;
    public static final int TYPE_PRIMARY = 0;
    private java.lang.Object mTag;
    private boolean mTitleOptionalHint;
    private int mType;
    public ActionMode() {}
    public abstract void finish();
    public abstract android.view.View getCustomView();
    public abstract android.view.Menu getMenu();
    public abstract android.view.MenuInflater getMenuInflater();
    public abstract java.lang.CharSequence getSubtitle();
    public java.lang.Object getTag() { return null; }
    public abstract java.lang.CharSequence getTitle();
    public boolean getTitleOptionalHint() { return false; }
    public int getType() { return 0; }
    public void hide(long p0) {}
    public abstract void invalidate();
    public void invalidateContentRect() {}
    public boolean isTitleOptional() { return false; }
    public boolean isUiFocusable() { return false; }
    public void onWindowFocusChanged(boolean p0) {}
    public abstract void setCustomView(android.view.View p0);
    public abstract void setSubtitle(int p0);
    public abstract void setSubtitle(java.lang.CharSequence p0);
    public void setTag(java.lang.Object p0) {}
    public abstract void setTitle(int p0);
    public abstract void setTitle(java.lang.CharSequence p0);
    public void setTitleOptionalHint(boolean p0) {}
    public void setType(int p0) {}

    public static interface Callback {
        public boolean onActionItemClicked(android.view.ActionMode p0, android.view.MenuItem p1);
        public boolean onCreateActionMode(android.view.ActionMode p0, android.view.Menu p1);
        public void onDestroyActionMode(android.view.ActionMode p0);
        public boolean onPrepareActionMode(android.view.ActionMode p0, android.view.Menu p1);
    }

    public static abstract class Callback2 implements android.view.ActionMode.Callback {
        public Callback2() {}
        public void onGetContentRect(android.view.ActionMode p0, android.view.View p1, android.graphics.Rect p2) {}
    }
}
