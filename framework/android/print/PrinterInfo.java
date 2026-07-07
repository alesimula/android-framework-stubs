package android.print;

public final class PrinterInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.print.PrinterInfo> CREATOR = null;
    public static final int STATUS_BUSY = 2;
    public static final int STATUS_IDLE = 1;
    public static final int STATUS_UNAVAILABLE = 3;
    private final android.print.PrinterCapabilitiesInfo mCapabilities = null;
    private final int mCustomPrinterIconGen = 0;
    private final java.lang.String mDescription = null;
    private final boolean mHasCustomPrinterIcon = false;
    private final int mIconResourceId = 0;
    private final android.print.PrinterId mId = null;
    private final android.app.PendingIntent mInfoIntent = null;
    private final java.lang.String mName = null;
    private final android.app.PendingIntent mSetupIntent = null;
    private final int mStatus = 0;
    private PrinterInfo(android.os.Parcel p0) {}
    private PrinterInfo(android.print.PrinterId p0, java.lang.String p1, int p2, int p3, boolean p4, java.lang.String p5, android.app.PendingIntent p6, android.app.PendingIntent p7, android.print.PrinterCapabilitiesInfo p8, int p9) {}
    private static java.lang.String checkName(java.lang.String p0) { return null; }
    private static android.print.PrinterId checkPrinterId(android.print.PrinterId p0) { return null; }
    private static int checkStatus(int p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean equalsIgnoringStatus(android.print.PrinterInfo p0) { return false; }
    public android.print.PrinterCapabilitiesInfo getCapabilities() { return null; }
    public java.lang.String getDescription() { return null; }
    public boolean getHasCustomPrinterIcon() { return false; }
    public android.print.PrinterId getId() { return null; }
    public android.app.PendingIntent getInfoIntent() { return null; }
    public java.lang.String getName() { return null; }
    public android.app.PendingIntent getSetupIntent() { return null; }
    public int getStatus() { return 0; }
    public int hashCode() { return 0; }
    public android.graphics.drawable.Drawable loadIcon(android.content.Context p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.print.PrinterCapabilitiesInfo mCapabilities;
        private int mCustomPrinterIconGen;
        private java.lang.String mDescription;
        private boolean mHasCustomPrinterIcon;
        private int mIconResourceId;
        private android.app.PendingIntent mInfoIntent;
        private java.lang.String mName;
        private android.print.PrinterId mPrinterId;
        private android.app.PendingIntent mSetupIntent;
        private int mStatus;
        public Builder(android.print.PrinterId p0, java.lang.String p1, int p2) {}
        public Builder(android.print.PrinterInfo p0) {}
        public android.print.PrinterInfo build() { return null; }
        public android.print.PrinterInfo.Builder incCustomPrinterIconGen() { return null; }
        public android.print.PrinterInfo.Builder setCapabilities(android.print.PrinterCapabilitiesInfo p0) { return null; }
        public android.print.PrinterInfo.Builder setDescription(java.lang.String p0) { return null; }
        public android.print.PrinterInfo.Builder setHasCustomPrinterIcon(boolean p0) { return null; }
        public android.print.PrinterInfo.Builder setIconResourceId(int p0) { return null; }
        public android.print.PrinterInfo.Builder setInfoIntent(android.app.PendingIntent p0) { return null; }
        public android.print.PrinterInfo.Builder setName(java.lang.String p0) { return null; }
        public android.print.PrinterInfo.Builder setSetupIntent(android.app.PendingIntent p0) { return null; }
        public android.print.PrinterInfo.Builder setStatus(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
