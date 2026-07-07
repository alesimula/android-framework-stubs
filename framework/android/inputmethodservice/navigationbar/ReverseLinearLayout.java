package android.inputmethodservice.navigationbar;

class ReverseLinearLayout extends android.widget.LinearLayout {
    private boolean mIsAlternativeOrder;
    private boolean mIsLayoutReverse;
    ReverseLinearLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private static void reverseGroup(android.view.ViewGroup p0, boolean p1) {}
    private static void reverseParams(android.view.ViewGroup.LayoutParams p0, android.view.View p1, boolean p2) {}
    private void updateOrder() {}
    public void addView(android.view.View p0) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    protected void onFinishInflate() {}
    public void onRtlPropertiesChanged(int p0) {}
    public void setAlternativeOrder(boolean p0) {}

    public static class ReverseRelativeLayout extends android.widget.RelativeLayout implements android.inputmethodservice.navigationbar.ReverseLinearLayout.Reversible {
        private int mDefaultGravity;
        ReverseRelativeLayout(android.content.Context p0) { super((android.content.Context)null); }
        public void reverse(boolean p0) {}
        public void setDefaultGravity(int p0) {}
        public void updateGravity(boolean p0) {}
    }

    static interface Reversible {
        public void reverse(boolean p0);
    }
}
