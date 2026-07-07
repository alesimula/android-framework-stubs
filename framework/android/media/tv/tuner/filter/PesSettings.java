package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class PesSettings extends android.media.tv.tuner.filter.Settings {
    private final boolean mIsRaw = false;
    private final int mStreamId = 0;
    private PesSettings(int p0, int p1, boolean p2) { super(0); }
    public static android.media.tv.tuner.filter.PesSettings.Builder builder(int p0) { return null; }
    public int getStreamId() { return 0; }
    public boolean isRaw() { return false; }

    public static class Builder {
        private boolean mIsRaw;
        private final int mMainType = 0;
        private int mStreamId;
        private Builder(int p0) {}
        public android.media.tv.tuner.filter.PesSettings build() { return null; }
        public android.media.tv.tuner.filter.PesSettings.Builder setRaw(boolean p0) { return null; }
        public android.media.tv.tuner.filter.PesSettings.Builder setStreamId(int p0) { return null; }
    }
}
