package android.tracing;

public class TraceReportParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.tracing.TraceReportParams> CREATOR = null;
    public android.os.ParcelFileDescriptor fd;
    public java.lang.String reporterClassName;
    public java.lang.String reporterPackageName;
    public boolean usePipeForTesting;
    public long uuidLsb;
    public long uuidMsb;
    public TraceReportParams() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
