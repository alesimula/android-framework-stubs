package com.android.internal.globalactions;

public abstract class ToggleAction implements com.android.internal.globalactions.Action {
    private static final java.lang.String TAG = "ToggleAction";
    protected int mDisabledIconResid;
    protected int mDisabledStatusMessageResId;
    protected int mEnabledIconResId;
    protected int mEnabledStatusMessageResId;
    protected int mMessageResId;
    protected com.android.internal.globalactions.ToggleAction.State mState;
    public ToggleAction(int p0, int p1, int p2, int p3, int p4) {}
    protected void changeStateFromPress(boolean p0) {}
    public android.view.View create(android.content.Context p0, android.view.View p1, android.view.ViewGroup p2, android.view.LayoutInflater p3) { return null; }
    public java.lang.CharSequence getLabelForAccessibility(android.content.Context p0) { return null; }
    public boolean isEnabled() { return false; }
    public final void onPress() {}
    public abstract void onToggle(boolean p0);
    public void updateState(com.android.internal.globalactions.ToggleAction.State p0) {}
    void willCreate() {}

    public static enum State {
        Off,
        On,
        TurningOff,
        TurningOn;
        private static final com.android.internal.globalactions.ToggleAction.State[] $VALUES = null;
        private final boolean inTransition = false;
        private State() {}
        public boolean inTransition() { return false; }
    }
}
