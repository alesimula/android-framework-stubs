package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class AtscFrontendSettings extends android.media.tv.tuner.frontend.FrontendSettings {
    public static final int MODULATION_AUTO = 1;
    public static final int MODULATION_MOD_16VSB = 8;
    public static final int MODULATION_MOD_8VSB = 4;
    public static final int MODULATION_UNDEFINED = 0;
    private final int mModulation = 0;
    private AtscFrontendSettings(long p0, int p1) { super(0L); }
    public static android.media.tv.tuner.frontend.AtscFrontendSettings.Builder builder() { return null; }
    public int getModulation() { return 0; }
    public int getType() { return 0; }

    public static class Builder {
        private long mFrequency;
        private int mModulation;
        private Builder() {}
        public android.media.tv.tuner.frontend.AtscFrontendSettings build() { return null; }
        @java.lang.Deprecated
        public android.media.tv.tuner.frontend.AtscFrontendSettings.Builder setFrequency(int p0) { return null; }
        public android.media.tv.tuner.frontend.AtscFrontendSettings.Builder setFrequencyLong(long p0) { return null; }
        public android.media.tv.tuner.frontend.AtscFrontendSettings.Builder setModulation(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Modulation {
    }
}
