package android.telephony;

public final class ClientRequestStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ClientRequestStats> CREATOR = null;
    private static final int REQUEST_HISTOGRAM_BUCKET_COUNT = 5;
    private java.lang.String mCallingPackage;
    private long mCompletedRequestsCount;
    private long mCompletedRequestsWakelockTime;
    private long mPendingRequestsCount;
    private long mPendingRequestsWakelockTime;
    private android.util.SparseArray<android.telephony.TelephonyHistogram> mRequestHistograms;
    public ClientRequestStats() {}
    public ClientRequestStats(android.os.Parcel p0) {}
    public ClientRequestStats(android.telephony.ClientRequestStats p0) {}
    public void addCompletedWakelockTime(long p0) {}
    public int describeContents() { return 0; }
    public java.lang.String getCallingPackage() { return null; }
    public long getCompletedRequestsCount() { return 0L; }
    public long getCompletedRequestsWakelockTime() { return 0L; }
    public long getPendingRequestsCount() { return 0L; }
    public long getPendingRequestsWakelockTime() { return 0L; }
    public java.util.List<android.telephony.TelephonyHistogram> getRequestHistograms() { return null; }
    public void incrementCompletedRequestsCount() {}
    public void readFromParcel(android.os.Parcel p0) {}
    public void setCallingPackage(java.lang.String p0) {}
    public void setPendingRequestsCount(long p0) {}
    public void setPendingRequestsWakelockTime(long p0) {}
    public java.lang.String toString() { return null; }
    public void updateRequestHistograms(int p0, int p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
