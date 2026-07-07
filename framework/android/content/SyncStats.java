package android.content;

public class SyncStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.SyncStats> CREATOR = null;
    public long numAuthExceptions;
    public long numConflictDetectedExceptions;
    public long numDeletes;
    public long numEntries;
    public long numInserts;
    public long numIoExceptions;
    public long numParseExceptions;
    public long numSkippedEntries;
    public long numUpdates;
    public SyncStats() {}
    public SyncStats(android.os.Parcel p0) {}
    public void clear() {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
