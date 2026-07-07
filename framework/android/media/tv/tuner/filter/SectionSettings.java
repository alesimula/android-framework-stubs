package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public abstract class SectionSettings extends android.media.tv.tuner.filter.Settings {
    final int mBitWidthOfLengthField = 0;
    final boolean mCrcEnabled = false;
    final boolean mIsRaw = false;
    final boolean mIsRepeat = false;
    SectionSettings(int p0, boolean p1, boolean p2, boolean p3, int p4) { super(0); }
    public int getLengthFieldBitWidth() { return 0; }
    public boolean isCrcEnabled() { return false; }
    public boolean isRaw() { return false; }
    public boolean isRepeat() { return false; }

    public static abstract class Builder<T extends android.media.tv.tuner.filter.SectionSettings.Builder<T>> {
        int mBitWidthOfLengthField;
        boolean mCrcEnabled;
        boolean mIsRaw;
        boolean mIsRepeat;
        final int mMainType = 0;
        Builder(int p0) {}
        abstract T self();
        public T setBitWidthOfLengthField(int p0) { return null; }
        public T setCrcEnabled(boolean p0) { return null; }
        public T setRaw(boolean p0) { return null; }
        public T setRepeat(boolean p0) { return null; }
    }
}
