package com.android.internal.app;

public class MediaRouteChooserDialog extends android.app.AlertDialog implements com.android.internal.app.MediaRouteChooserContentManager.Delegate {
    private final com.android.internal.app.MediaRouteChooserContentManager mContentManager = null;
    private android.widget.Button mExtendedSettingsButton;
    private android.view.View.OnClickListener mExtendedSettingsClickListener;
    private final boolean mShowProgressBarWhenEmpty = false;
    public MediaRouteChooserDialog(android.content.Context p0, int p1) { super((android.content.Context)null); }
    public MediaRouteChooserDialog(android.content.Context p0, int p1, boolean p2) { super((android.content.Context)null); }
    static boolean isLightTheme(android.content.Context p0) { return false; }
    private void updateExtendedSettingsButton() {}
    public void dismissView() {}
    public void onAttachedToWindow() {}
    protected void onCreate(android.os.Bundle p0) {}
    public void onDetachedFromWindow() {}
    public void setExtendedSettingsClickListener(android.view.View.OnClickListener p0) {}
    public void setRouteTypes(int p0) {}
    public boolean showProgressBarWhenEmpty() { return false; }
}
