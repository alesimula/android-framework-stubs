package android.preference;

@java.lang.Deprecated
public abstract class DialogPreference extends android.preference.Preference implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.preference.PreferenceManager.OnActivityDestroyListener {
    private android.app.AlertDialog.Builder mBuilder;
    private android.app.Dialog mDialog;
    private android.graphics.drawable.Drawable mDialogIcon;
    private int mDialogLayoutResId;
    private java.lang.CharSequence mDialogMessage;
    private java.lang.CharSequence mDialogTitle;
    private final java.lang.Runnable mDismissRunnable = null;
    private java.lang.CharSequence mNegativeButtonText;
    private java.lang.CharSequence mPositiveButtonText;
    private int mWhichButtonClicked;
    public DialogPreference(android.content.Context p0) { super((android.content.Context)null); }
    public DialogPreference(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public DialogPreference(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public DialogPreference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private android.view.View getDecorView() { return null; }
    private void removeDismissCallbacks() {}
    public android.app.Dialog getDialog() { return null; }
    public android.graphics.drawable.Drawable getDialogIcon() { return null; }
    public int getDialogLayoutResource() { return 0; }
    public java.lang.CharSequence getDialogMessage() { return null; }
    public java.lang.CharSequence getDialogTitle() { return null; }
    public java.lang.CharSequence getNegativeButtonText() { return null; }
    public java.lang.CharSequence getPositiveButtonText() { return null; }
    public void onActivityDestroy() {}
    protected void onBindDialogView(android.view.View p0) {}
    protected void onClick() {}
    public void onClick(android.content.DialogInterface p0, int p1) {}
    protected android.view.View onCreateDialogView() { return null; }
    protected void onDialogClosed(boolean p0) {}
    public void onDismiss(android.content.DialogInterface p0) {}
    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder p0) {}
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    void postDismiss() {}
    public void setDialogIcon(int p0) {}
    public void setDialogIcon(android.graphics.drawable.Drawable p0) {}
    public void setDialogLayoutResource(int p0) {}
    public void setDialogMessage(int p0) {}
    public void setDialogMessage(java.lang.CharSequence p0) {}
    public void setDialogTitle(int p0) {}
    public void setDialogTitle(java.lang.CharSequence p0) {}
    public void setNegativeButtonText(int p0) {}
    public void setNegativeButtonText(java.lang.CharSequence p0) {}
    public void setPositiveButtonText(int p0) {}
    public void setPositiveButtonText(java.lang.CharSequence p0) {}
    protected void showDialog(android.os.Bundle p0) {}

    private static class SavedState extends android.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<android.preference.DialogPreference.SavedState> CREATOR = null;
        android.os.Bundle dialogBundle;
        boolean isDialogShowing;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
