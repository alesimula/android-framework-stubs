package android.os;

@android.annotation.SystemApi
public class IncidentManager {
    public static final int FLAG_ALLOW_CONSENTLESS_BUGREPORT = 2;
    public static final int FLAG_CONFIRMATION_DIALOG = 1;
    public static final int PRIVACY_POLICY_AUTO = 200;
    public static final int PRIVACY_POLICY_EXPLICIT = 100;
    public static final int PRIVACY_POLICY_LOCAL = 0;
    private static final java.lang.String TAG = "IncidentManager";
    public static final java.lang.String URI_AUTHORITY = "android.os.IncidentManager";
    public static final java.lang.String URI_PARAM_CALLING_PACKAGE = "pkg";
    public static final java.lang.String URI_PARAM_FLAGS = "flags";
    public static final java.lang.String URI_PARAM_ID = "id";
    public static final java.lang.String URI_PARAM_RECEIVER_CLASS = "receiver";
    public static final java.lang.String URI_PARAM_REPORT_ID = "r";
    public static final java.lang.String URI_PARAM_TIMESTAMP = "t";
    public static final java.lang.String URI_PATH = "/pending";
    public static final java.lang.String URI_SCHEME = "content";
    private android.os.IIncidentCompanion mCompanionService;
    private final android.content.Context mContext = null;
    private android.os.IIncidentManager mIncidentService;
    private java.lang.Object mLock;
    public IncidentManager(android.content.Context p0) {}
    private android.os.IIncidentCompanion getCompanionServiceLocked() throws android.os.RemoteException { return null; }
    private android.os.IIncidentManager getIIncidentManagerLocked() throws android.os.RemoteException { return null; }
    private void reportIncidentInternal(android.os.IncidentReportArgs p0) {}
    public void approveReport(android.net.Uri p0) {}
    public void cancelAuthorization(android.os.IncidentManager.AuthListener p0) {}
    public void deleteIncidentReports(android.net.Uri p0) {}
    public void denyReport(android.net.Uri p0) {}
    public android.os.IncidentManager.IncidentReport getIncidentReport(android.net.Uri p0) { return null; }
    public java.util.List<android.net.Uri> getIncidentReportList(java.lang.String p0) { return null; }
    public java.util.List<android.os.IncidentManager.PendingReport> getPendingReports() { return null; }
    public void registerSection(int p0, java.lang.String p1, java.util.concurrent.Executor p2, android.os.IncidentManager.DumpCallback p3) {}
    public void reportIncident(android.os.IncidentReportArgs p0) {}
    public void requestAuthorization(int p0, java.lang.String p1, int p2, android.os.IncidentManager.AuthListener p3) {}
    public void requestAuthorization(int p0, java.lang.String p1, int p2, java.util.concurrent.Executor p3, android.os.IncidentManager.AuthListener p4) {}
    public void unregisterSection(int p0) {}

    public static class AuthListener {
        android.os.IIncidentAuthListener.Stub mBinder;
        java.util.concurrent.Executor mExecutor;
        public AuthListener() {}
        public void onReportApproved() {}
        public void onReportDenied() {}
    }

    public static class DumpCallback {
        android.os.IIncidentDumpCallback.Stub mBinder;
        private java.util.concurrent.Executor mExecutor;
        private int mId;
        public DumpCallback() {}
        public void onDumpSection(int p0, java.io.OutputStream p1) {}
    }

    @android.annotation.SystemApi
    public static class IncidentReport implements android.os.Parcelable, java.io.Closeable {
        public static final android.os.Parcelable.Creator<android.os.IncidentManager.IncidentReport> CREATOR = null;
        private android.os.ParcelFileDescriptor mFileDescriptor;
        private final int mPrivacyPolicy = 0;
        private final long mTimestampNs = 0L;
        public IncidentReport(android.os.Parcel p0) {}
        public void close() {}
        public int describeContents() { return 0; }
        public java.io.InputStream getInputStream() throws java.io.IOException { return null; }
        public long getPrivacyPolicy() { return 0L; }
        public long getTimestamp() { return 0L; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @android.annotation.SystemApi
    public static class PendingReport {
        private final int mFlags = 0;
        private final java.lang.String mRequestingPackage = null;
        private final long mTimestamp = 0L;
        private final android.net.Uri mUri = null;
        public PendingReport(android.net.Uri p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int getFlags() { return 0; }
        public java.lang.String getRequestingPackage() { return null; }
        public long getTimestamp() { return 0L; }
        public android.net.Uri getUri() { return null; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PendingReportFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PrivacyPolicy {
    }
}
