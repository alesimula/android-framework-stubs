package com.android.internal.app;

public class ChooserStackedAppDialogFragment extends com.android.internal.app.ChooserTargetActionsDialogFragment implements android.content.DialogInterface.OnClickListener {
    static final java.lang.String MULTI_DRI_KEY = "multi_dri_key";
    static final java.lang.String WHICH_KEY = "which_key";
    private com.android.internal.app.chooser.MultiDisplayResolveInfo mMultiDisplayResolveInfo;
    private int mParentWhich;
    public ChooserStackedAppDialogFragment() { super(); }
    protected android.graphics.drawable.Drawable getItemIcon(com.android.internal.app.chooser.DisplayResolveInfo p0) { return null; }
    protected java.lang.CharSequence getItemLabel(com.android.internal.app.chooser.DisplayResolveInfo p0) { return null; }
    public void onClick(android.content.DialogInterface p0, int p1) {}
    public void onSaveInstanceState(android.os.Bundle p0) {}
    void setStateFromBundle(android.os.Bundle p0) {}
}
