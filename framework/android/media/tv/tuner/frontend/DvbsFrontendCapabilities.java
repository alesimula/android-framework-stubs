package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class DvbsFrontendCapabilities extends android.media.tv.tuner.frontend.FrontendCapabilities {
    private final long mInnerFecCap = 0L;
    private final int mModulationCap = 0;
    private final int mStandard = 0;
    private DvbsFrontendCapabilities(int p0, long p1, int p2) { super(); }
    public long getInnerFecCapability() { return 0L; }
    public int getModulationCapability() { return 0; }
    public int getStandardCapability() { return 0; }
}
