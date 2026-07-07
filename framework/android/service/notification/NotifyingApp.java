package android.service.notification;

public final class NotifyingApp implements android.os.Parcelable, java.lang.Comparable<android.service.notification.NotifyingApp> {
    public static final android.os.Parcelable.Creator<android.service.notification.NotifyingApp> CREATOR = null;
    private long mLastNotified;
    private java.lang.String mPkg;
    private int mUserId;
    public NotifyingApp() {}
    protected NotifyingApp(android.os.Parcel p0) {}
    public int compareTo(android.service.notification.NotifyingApp p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getLastNotified() { return 0L; }
    public java.lang.String getPackage() { return null; }
    public int getUserId() { return 0; }
    public int hashCode() { return 0; }
    public android.service.notification.NotifyingApp setLastNotified(long p0) { return null; }
    public android.service.notification.NotifyingApp setPackage(java.lang.String p0) { return null; }
    public android.service.notification.NotifyingApp setUserId(int p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
