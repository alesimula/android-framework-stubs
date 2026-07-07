package com.android.internal.app;

public abstract class MediaRouteDialogPresenter {
    private static final java.lang.String CHOOSER_FRAGMENT_TAG = "android.app.MediaRouteButton:MediaRouteChooserDialogFragment";
    private static final java.lang.String CONTROLLER_FRAGMENT_TAG = "android.app.MediaRouteButton:MediaRouteControllerDialogFragment";
    private static final java.lang.String TAG = "MediaRouter";
    public MediaRouteDialogPresenter() {}
    public static android.app.Dialog createDialog(android.content.Context p0, int p1, android.view.View.OnClickListener p2) { return null; }
    public static android.app.Dialog createDialog(android.content.Context p0, int p1, android.view.View.OnClickListener p2, int p3) { return null; }
    public static android.app.Dialog createDialog(android.content.Context p0, int p1, android.view.View.OnClickListener p2, int p3, boolean p4) { return null; }
    public static boolean shouldShowChooserDialog(android.content.Context p0, int p1) { return false; }
    public static android.app.DialogFragment showDialogFragment(android.app.Activity p0, int p1, android.view.View.OnClickListener p2) { return null; }
}
