package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public final class IptvFrontendSettingsFec {
    public static final int FEC_TYPE_COLUMN = 1;
    public static final int FEC_TYPE_COLUMN_ROW = 4;
    public static final int FEC_TYPE_ROW = 2;
    public static final int FEC_TYPE_UNDEFINED = 0;
    private final int mFecColNum = 0;
    private final int mFecRowNum = 0;
    private final int mFecType = 0;
    private IptvFrontendSettingsFec(int p0, int p1, int p2) {}
    public int getFecColNum() { return 0; }
    public int getFecRowNum() { return 0; }
    public int getFecType() { return 0; }

    public static final class Builder {
        private int mFecColNum;
        private int mFecRowNum;
        private int mFecType;
        public Builder() {}
        public android.media.tv.tuner.frontend.IptvFrontendSettingsFec build() { return null; }
        public android.media.tv.tuner.frontend.IptvFrontendSettingsFec.Builder setFecColNum(int p0) { return null; }
        public android.media.tv.tuner.frontend.IptvFrontendSettingsFec.Builder setFecRowNum(int p0) { return null; }
        public android.media.tv.tuner.frontend.IptvFrontendSettingsFec.Builder setFecType(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FecType {
    }
}
