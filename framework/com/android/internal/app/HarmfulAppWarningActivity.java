package com.android.internal.app;

public class HarmfulAppWarningActivity extends com.android.internal.app.AlertActivity implements android.content.DialogInterface.OnClickListener {
    private static final java.lang.String EXTRA_HARMFUL_APP_WARNING = "harmful_app_warning";
    private static final java.lang.String TAG = null;
    private java.lang.String mHarmfulAppWarning;
    private java.lang.String mPackageName;
    private android.content.IntentSender mTarget;
    public HarmfulAppWarningActivity() { super(); }
    public static android.content.Intent createHarmfulAppWarningIntent(android.content.Context p0, java.lang.String p1, android.content.IntentSender p2, java.lang.CharSequence p3) { return null; }
    private android.view.View createView(android.content.pm.ApplicationInfo p0) { return null; }
    public void onClick(android.content.DialogInterface p0, int p1) {}
    protected void onCreate(android.os.Bundle p0) {}
}
