package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class DownloadSettings extends android.media.tv.tuner.filter.Settings {
    private final int mDownloadId = 0;
    private final boolean mUseDownloadId = false;
    private DownloadSettings(int p0, boolean p1, int p2) { super(0); }
    public static android.media.tv.tuner.filter.DownloadSettings.Builder builder(int p0) { return null; }
    public int getDownloadId() { return 0; }
    public boolean useDownloadId() { return false; }

    public static class Builder {
        private int mDownloadId;
        private final int mMainType = 0;
        private boolean mUseDownloadId;
        private Builder(int p0) {}
        public android.media.tv.tuner.filter.DownloadSettings build() { return null; }
        public android.media.tv.tuner.filter.DownloadSettings.Builder setDownloadId(int p0) { return null; }
        public android.media.tv.tuner.filter.DownloadSettings.Builder setUseDownloadId(boolean p0) { return null; }
    }
}
