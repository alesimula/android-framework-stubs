package android.app;

@java.lang.Deprecated
public class ProgressDialog extends android.app.AlertDialog {
    public static final int STYLE_HORIZONTAL = 1;
    public static final int STYLE_SPINNER = 0;
    private boolean mHasStarted;
    private int mIncrementBy;
    private int mIncrementSecondaryBy;
    private boolean mIndeterminate;
    private android.graphics.drawable.Drawable mIndeterminateDrawable;
    private int mMax;
    private java.lang.CharSequence mMessage;
    private android.widget.TextView mMessageView;
    private android.widget.ProgressBar mProgress;
    private android.graphics.drawable.Drawable mProgressDrawable;
    private android.widget.TextView mProgressNumber;
    private java.lang.String mProgressNumberFormat;
    private android.widget.TextView mProgressPercent;
    private java.text.NumberFormat mProgressPercentFormat;
    private int mProgressStyle;
    private int mProgressVal;
    private int mSecondaryProgressVal;
    private android.os.Handler mViewUpdateHandler;
    public ProgressDialog(android.content.Context p0) { super((android.content.Context)null); }
    public ProgressDialog(android.content.Context p0, int p1) { super((android.content.Context)null); }
    private void initFormats() {}
    private void onProgressChanged() {}
    public static android.app.ProgressDialog show(android.content.Context p0, java.lang.CharSequence p1, java.lang.CharSequence p2) { return null; }
    public static android.app.ProgressDialog show(android.content.Context p0, java.lang.CharSequence p1, java.lang.CharSequence p2, boolean p3) { return null; }
    public static android.app.ProgressDialog show(android.content.Context p0, java.lang.CharSequence p1, java.lang.CharSequence p2, boolean p3, boolean p4) { return null; }
    public static android.app.ProgressDialog show(android.content.Context p0, java.lang.CharSequence p1, java.lang.CharSequence p2, boolean p3, boolean p4, android.content.DialogInterface.OnCancelListener p5) { return null; }
    public int getMax() { return 0; }
    public int getProgress() { return 0; }
    public int getSecondaryProgress() { return 0; }
    public void incrementProgressBy(int p0) {}
    public void incrementSecondaryProgressBy(int p0) {}
    public boolean isIndeterminate() { return false; }
    protected void onCreate(android.os.Bundle p0) {}
    public void onStart() {}
    protected void onStop() {}
    public void setIndeterminate(boolean p0) {}
    public void setIndeterminateDrawable(android.graphics.drawable.Drawable p0) {}
    public void setMax(int p0) {}
    public void setMessage(java.lang.CharSequence p0) {}
    public void setProgress(int p0) {}
    public void setProgressDrawable(android.graphics.drawable.Drawable p0) {}
    public void setProgressNumberFormat(java.lang.String p0) {}
    public void setProgressPercentFormat(java.text.NumberFormat p0) {}
    public void setProgressStyle(int p0) {}
    public void setSecondaryProgress(int p0) {}
}
