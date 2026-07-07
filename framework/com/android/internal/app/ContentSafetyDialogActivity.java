package com.android.internal.app;

public class ContentSafetyDialogActivity extends com.android.internal.app.AlertActivity implements android.content.DialogInterface.OnClickListener {
    private static final java.lang.String TAG = "ContentSafetyDialogActivity";
    private java.lang.String mBlockingPackage;
    private android.content.LocusId mLocusId;
    private int mUserId;
    public ContentSafetyDialogActivity() { super(); }
    public static android.content.Intent createIntent(java.lang.String p0, android.content.LocusId p1) { return null; }
    private java.lang.CharSequence getAppLabel(int p0, java.lang.String p1) { return null; }
    private void openCustomDetailsPage() {}
    private java.lang.String resolveSecureBlockingPackage(android.content.Intent p0) { return null; }
    public void onClick(android.content.DialogInterface p0, int p1) {}
    protected void onCreate(android.os.Bundle p0) {}
    protected void onStart() {}
    protected void onStop() {}
}
