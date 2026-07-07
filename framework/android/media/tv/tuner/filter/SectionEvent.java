package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class SectionEvent extends android.media.tv.tuner.filter.FilterEvent {
    private final long mDataLength = 0L;
    private final int mSectionNum = 0;
    private final int mTableId = 0;
    private final int mVersion = 0;
    private SectionEvent(int p0, int p1, int p2, long p3) { super(); }
    @java.lang.Deprecated
    public int getDataLength() { return 0; }
    public long getDataLengthLong() { return 0L; }
    public int getSectionNumber() { return 0; }
    public int getTableId() { return 0; }
    public int getVersion() { return 0; }
}
