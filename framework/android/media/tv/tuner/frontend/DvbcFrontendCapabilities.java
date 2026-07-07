package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class DvbcFrontendCapabilities extends android.media.tv.tuner.frontend.FrontendCapabilities {
    private final int mAnnexCap = 0;
    private final long mFecCap = 0L;
    private final int mModulationCap = 0;
    private DvbcFrontendCapabilities(int p0, long p1, int p2) { super(); }
    public int getAnnexCapability() { return 0; }
    public long getCodeRateCapability() { return 0L; }
    @java.lang.Deprecated
    public int getFecCapability() { return 0; }
    public int getModulationCapability() { return 0; }
}
