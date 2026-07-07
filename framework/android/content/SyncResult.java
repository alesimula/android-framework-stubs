package android.content;

public final class SyncResult implements android.os.Parcelable {
    public static final android.content.SyncResult ALREADY_IN_PROGRESS = null;
    public static final android.os.Parcelable.Creator<android.content.SyncResult> CREATOR = null;
    public boolean databaseError;
    public long delayUntil;
    public boolean fullSyncRequested;
    public boolean moreRecordsToGet;
    public boolean partialSyncUnavailable;
    public final android.content.SyncStats stats = null;
    public final boolean syncAlreadyInProgress = false;
    public boolean tooManyDeletions;
    public boolean tooManyRetries;
    public SyncResult() {}
    private SyncResult(android.os.Parcel p0) {}
    private SyncResult(boolean p0) {}
    public void clear() {}
    public int describeContents() { return 0; }
    public boolean hasError() { return false; }
    public boolean hasHardError() { return false; }
    public boolean hasSoftError() { return false; }
    public boolean madeSomeProgress() { return false; }
    public java.lang.String toDebugString() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
