package android.app.usage;

public final class ExternalStorageStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.usage.ExternalStorageStats> CREATOR = null;
    public long appBytes;
    public long audioBytes;
    public long imageBytes;
    public long obbBytes;
    public long totalBytes;
    public long videoBytes;
    public ExternalStorageStats() {}
    public ExternalStorageStats(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getAppBytes() { return 0L; }
    public long getAudioBytes() { return 0L; }
    public long getImageBytes() { return 0L; }
    public long getObbBytes() { return 0L; }
    public long getTotalBytes() { return 0L; }
    public long getVideoBytes() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
