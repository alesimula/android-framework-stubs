package com.android.internal.policy;

public class DecorContext extends android.view.ContextThemeWrapper {
    private android.view.contentcapture.ContentCaptureManager mContentCaptureManager;
    private java.lang.ref.WeakReference<android.content.Context> mContext;
    private com.android.internal.policy.PhoneWindow mPhoneWindow;
    private android.content.res.Resources mResources;
    public DecorContext(android.content.Context p0, com.android.internal.policy.PhoneWindow p1) { super(); }
    public android.content.res.AssetManager getAssets() { return null; }
    public android.content.AutofillOptions getAutofillOptions() { return null; }
    public android.content.ContentCaptureOptions getContentCaptureOptions() { return null; }
    public android.content.res.Resources getResources() { return null; }
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    public boolean isConfigurationContext() { return false; }
    public boolean isUiContext() { return false; }
    void setPhoneWindow(com.android.internal.policy.PhoneWindow p0) {}
}
