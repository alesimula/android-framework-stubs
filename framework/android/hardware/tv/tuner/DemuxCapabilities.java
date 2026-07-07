package android.hardware.tv.tuner;

public class DemuxCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxCapabilities> CREATOR = null;
    public boolean bTimeFilter;
    public int filterCaps;
    public int[] linkCaps;
    public int numAudioFilter;
    public long numBytesInSectionFilter;
    public int numDemux;
    public int numPcrFilter;
    public int numPesFilter;
    public int numPlayback;
    public int numRecord;
    public int numSectionFilter;
    public int numTsFilter;
    public int numVideoFilter;
    public DemuxCapabilities() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
