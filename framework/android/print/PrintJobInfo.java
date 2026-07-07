package android.print;

public final class PrintJobInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.print.PrintJobInfo> CREATOR = null;
    public static final int STATE_ANY = -1;
    public static final int STATE_ANY_ACTIVE = -3;
    public static final int STATE_ANY_SCHEDULED = -4;
    public static final int STATE_ANY_VISIBLE_TO_CLIENTS = -2;
    public static final int STATE_BLOCKED = 4;
    public static final int STATE_CANCELED = 7;
    public static final int STATE_COMPLETED = 5;
    public static final int STATE_CREATED = 1;
    public static final int STATE_FAILED = 6;
    public static final int STATE_QUEUED = 2;
    public static final int STATE_STARTED = 3;
    private android.os.Bundle mAdvancedOptions;
    private int mAppId;
    private android.print.PrintAttributes mAttributes;
    private boolean mCanceling;
    private int mCopies;
    private long mCreationTime;
    private android.print.PrintDocumentInfo mDocumentInfo;
    private android.print.PrintJobId mId;
    private java.lang.String mLabel;
    private android.print.PageRange[] mPageRanges;
    private android.print.PrinterId mPrinterId;
    private java.lang.String mPrinterName;
    private float mProgress;
    private int mState;
    private java.lang.CharSequence mStatus;
    private int mStatusRes;
    private java.lang.CharSequence mStatusResAppPackageName;
    private java.lang.String mTag;
    public PrintJobInfo() {}
    private PrintJobInfo(android.os.Parcel p0) {}
    public PrintJobInfo(android.print.PrintJobInfo p0) {}
    public static java.lang.String stateToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public int getAdvancedIntOption(java.lang.String p0) { return 0; }
    public android.os.Bundle getAdvancedOptions() { return null; }
    public java.lang.String getAdvancedStringOption(java.lang.String p0) { return null; }
    public int getAppId() { return 0; }
    public android.print.PrintAttributes getAttributes() { return null; }
    public int getCopies() { return 0; }
    public long getCreationTime() { return 0L; }
    public android.print.PrintDocumentInfo getDocumentInfo() { return null; }
    public android.print.PrintJobId getId() { return null; }
    public java.lang.String getLabel() { return null; }
    public android.print.PageRange[] getPages() { return null; }
    public android.print.PrinterId getPrinterId() { return null; }
    public java.lang.String getPrinterName() { return null; }
    public float getProgress() { return 0.0f; }
    public int getState() { return 0; }
    public java.lang.CharSequence getStatus(android.content.pm.PackageManager p0) { return null; }
    public java.lang.String getTag() { return null; }
    public boolean hasAdvancedOption(java.lang.String p0) { return false; }
    public boolean isCancelling() { return false; }
    public void setAdvancedOptions(android.os.Bundle p0) {}
    public void setAppId(int p0) {}
    public void setAttributes(android.print.PrintAttributes p0) {}
    public void setCancelling(boolean p0) {}
    public void setCopies(int p0) {}
    public void setCreationTime(long p0) {}
    public void setDocumentInfo(android.print.PrintDocumentInfo p0) {}
    public void setId(android.print.PrintJobId p0) {}
    public void setLabel(java.lang.String p0) {}
    public void setPages(android.print.PageRange[] p0) {}
    public void setPrinterId(android.print.PrinterId p0) {}
    public void setPrinterName(java.lang.String p0) {}
    public void setProgress(float p0) {}
    public void setState(int p0) {}
    public void setStatus(int p0, java.lang.CharSequence p1) {}
    public void setStatus(java.lang.CharSequence p0) {}
    public void setTag(java.lang.String p0) {}
    public boolean shouldStayAwake() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.print.PrintJobInfo mPrototype = null;
        public Builder(android.print.PrintJobInfo p0) {}
        public android.print.PrintJobInfo build() { return null; }
        public void putAdvancedOption(java.lang.String p0, int p1) {}
        public void putAdvancedOption(java.lang.String p0, java.lang.String p1) {}
        public void setAttributes(android.print.PrintAttributes p0) {}
        public void setCopies(int p0) {}
        public void setPages(android.print.PageRange[] p0) {}
        public void setProgress(float p0) {}
        public void setStatus(java.lang.CharSequence p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
