package android.os.binder;

public class DroppedBinderStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.binder.DroppedBinderStats> CREATOR = null;
    public int bufferFullCount;
    public int delayedStatCount;
    public int integerOverflowCount;
    public int jvmErrorCount;
    public int queueFullCount;
    public int reportingFailedCount;
    public int serviceNotFoundCount;
    public int totalSeenCount;
    public DroppedBinderStats() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
