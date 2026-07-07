package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class MediaEvent extends android.media.tv.tuner.filter.FilterEvent {
    private final java.util.List<android.media.AudioPresentation> mAudioPresentations = null;
    private final int mDataGroupId = 0;
    private final long mDataId = 0L;
    private final long mDataLength = 0L;
    private final long mDts = 0L;
    private final android.media.tv.tuner.filter.AudioDescriptor mExtraMetaData = null;
    private final int mIndexInDataGroup = 0;
    private final boolean mIsDtsPresent = false;
    private final boolean mIsPrivateData = false;
    private final boolean mIsPtsPresent = false;
    private final boolean mIsSecureMemory = false;
    private android.media.MediaCodec.LinearBlock mLinearBlock;
    private final java.lang.Object mLock = null;
    private final int mMpuSequenceNumber = 0;
    private long mNativeContext;
    private final int mNumDataPieces = 0;
    private final long mOffset = 0L;
    private final long mPts = 0L;
    private boolean mReleased;
    private final int mScIndexMask = 0;
    private final int mStreamId = 0;
    private MediaEvent(int p0, boolean p1, long p2, boolean p3, long p4, long p5, long p6, android.media.MediaCodec.LinearBlock p7, boolean p8, long p9, int p10, boolean p11, int p12, android.media.tv.tuner.filter.AudioDescriptor p13, java.util.List<android.media.AudioPresentation> p14, int p15, int p16, int p17) { super(); }
    private native void nativeFinalize();
    private native java.lang.Long nativeGetAudioHandle();
    private native android.media.MediaCodec.LinearBlock nativeGetLinearBlock();
    protected void finalize() {}
    public long getAudioHandle() { return 0L; }
    public java.util.List<android.media.AudioPresentation> getAudioPresentations() { return null; }
    public long getAvDataId() { return 0L; }
    public int getDataGroupId() { return 0; }
    public long getDataLength() { return 0L; }
    public long getDts() { return 0L; }
    public android.media.tv.tuner.filter.AudioDescriptor getExtraMetaData() { return null; }
    public int getIndexInDataGroup() { return 0; }
    public android.media.MediaCodec.LinearBlock getLinearBlock() { return null; }
    public int getMpuSequenceNumber() { return 0; }
    public int getNumDataPieces() { return 0; }
    public long getOffset() { return 0L; }
    public long getPts() { return 0L; }
    public int getScIndexMask() { return 0; }
    public int getStreamId() { return 0; }
    public boolean isDtsPresent() { return false; }
    public boolean isPrivateData() { return false; }
    public boolean isPtsPresent() { return false; }
    public boolean isSecureMemory() { return false; }
    public void release() {}
}
