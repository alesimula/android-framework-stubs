package android.app.usage;

public final class ParcelableUsageEventList implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.usage.ParcelableUsageEventList> CREATOR = null;
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_ALL = false;
    private static final int MAX_IPC_SIZE = Integer.valueOf(0);
    private static final java.lang.String TAG = "ParcelableUsageEventList";
    private java.util.List<android.app.usage.UsageEvents.Event> mList;
    private ParcelableUsageEventList(android.os.Parcel p0) {}
    public ParcelableUsageEventList(java.util.List<android.app.usage.UsageEvents.Event> p0) {}
    private android.app.usage.UsageEvents.Event readEventFromParcel(android.os.Parcel p0) { return null; }
    private void writeEventToParcel(android.app.usage.UsageEvents.Event p0, android.os.Parcel p1, int p2) {}
    public int describeContents() { return 0; }
    public java.util.List<android.app.usage.UsageEvents.Event> getList() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
