package android.app.usage;

public final class EventStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.usage.EventStats> CREATOR = null;
    public long mBeginTimeStamp;
    public int mCount;
    public long mEndTimeStamp;
    public int mEventType;
    public long mLastEventTime;
    public long mTotalTime;
    public EventStats() {}
    public EventStats(android.app.usage.EventStats p0) {}
    public void add(android.app.usage.EventStats p0) {}
    public int describeContents() { return 0; }
    public int getCount() { return 0; }
    public int getEventType() { return 0; }
    public long getFirstTimeStamp() { return 0L; }
    public long getLastEventTime() { return 0L; }
    public long getLastTimeStamp() { return 0L; }
    public long getTotalTime() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
