package android.media;

public final class MediaCodec {
    public static final int BUFFER_FLAG_CODEC_CONFIG = 2;
    public static final int BUFFER_FLAG_DECODE_ONLY = 32;
    public static final int BUFFER_FLAG_END_OF_STREAM = 4;
    public static final int BUFFER_FLAG_KEY_FRAME = 1;
    public static final int BUFFER_FLAG_MUXER_DATA = 16;
    public static final int BUFFER_FLAG_PARTIAL_FRAME = 8;
    public static final int BUFFER_FLAG_SYNC_FRAME = 1;
    private static final int BUFFER_MODE_BLOCK = 1;
    private static final int BUFFER_MODE_INVALID = -1;
    private static final int BUFFER_MODE_LEGACY = 0;
    private static final int CB_CRYPTO_ERROR = 6;
    private static final int CB_ERROR = 3;
    private static final int CB_INPUT_AVAILABLE = 1;
    private static final int CB_LARGE_FRAME_OUTPUT_AVAILABLE = 7;
    private static final int CB_METRICS_FLUSHED = 8;
    private static final int CB_OUTPUT_AVAILABLE = 2;
    private static final int CB_OUTPUT_FORMAT_CHANGE = 4;
    private static final int CB_REQUIRED_RESOURCES_CHANGE = 9;
    public static final int CONFIGURE_FLAG_DETACHED_SURFACE = 8;
    public static final int CONFIGURE_FLAG_ENCODE = 1;
    public static final int CONFIGURE_FLAG_USE_BLOCK_MODEL = 2;
    public static final int CONFIGURE_FLAG_USE_CRYPTO_ASYNC = 4;
    public static final int CRYPTO_MODE_AES_CBC = 2;
    public static final int CRYPTO_MODE_AES_CTR = 1;
    public static final int CRYPTO_MODE_UNENCRYPTED = 0;
    private static final java.lang.String EOS_AND_DECODE_ONLY_ERROR_MESSAGE = "An input buffer cannot have both BUFFER_FLAG_END_OF_STREAM and BUFFER_FLAG_DECODE_ONLY flags";
    private static final int EVENT_CALLBACK = 1;
    private static final int EVENT_FIRST_TUNNEL_FRAME_READY = 4;
    private static final int EVENT_FRAME_RENDERED = 3;
    private static final int EVENT_SET_CALLBACK = 2;
    public static final int INFO_OUTPUT_BUFFERS_CHANGED = -3;
    public static final int INFO_OUTPUT_FORMAT_CHANGED = -2;
    public static final int INFO_TRY_AGAIN_LATER = -1;
    public static final java.lang.String PARAMETER_KEY_HDR10_PLUS_INFO = "hdr10-plus-info";
    public static final java.lang.String PARAMETER_KEY_LOW_LATENCY = "low-latency";
    public static final java.lang.String PARAMETER_KEY_OFFSET_TIME = "time-offset-us";
    private static final java.lang.String PARAMETER_KEY_PICTURE_PROFILE_HANDLE = "picture-profile-handle";
    public static final java.lang.String PARAMETER_KEY_QP_OFFSET_MAP = "qp-offset-map";
    public static final java.lang.String PARAMETER_KEY_QP_OFFSET_RECTS = "qp-offset-rects";
    public static final java.lang.String PARAMETER_KEY_REQUEST_SYNC_FRAME = "request-sync";
    public static final java.lang.String PARAMETER_KEY_SUSPEND = "drop-input-frames";
    public static final java.lang.String PARAMETER_KEY_SUSPEND_TIME = "drop-start-time-us";
    public static final java.lang.String PARAMETER_KEY_TUNNEL_PEEK = "tunnel-peek";
    public static final java.lang.String PARAMETER_KEY_VIDEO_BITRATE = "video-bitrate";
    private static final java.lang.String TAG = "MediaCodec";
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
    private final java.lang.Object mBufferLock = null;
    private int mBufferMode;
    private java.nio.ByteBuffer[] mCachedInputBuffers;
    private java.nio.ByteBuffer[] mCachedOutputBuffers;
    private android.media.MediaCodec.Callback mCallback;
    private android.media.MediaCodec.EventHandler mCallbackHandler;
    private android.media.MediaCodecInfo mCodecInfo;
    private final java.lang.Object mCodecInfoLock = null;
    private android.media.MediaCrypto mCrypto;
    private final android.media.MediaCodec.BufferMap mDequeuedInputBuffers = null;
    private final android.media.MediaCodec.BufferMap mDequeuedOutputBuffers = null;
    private final java.util.Map<java.lang.Integer, android.media.MediaCodec.BufferInfo> mDequeuedOutputInfos = null;
    private android.media.MediaCodec.EventHandler mEventHandler;
    private boolean mHasSurface;
    private final java.lang.Object mListenerLock = null;
    private java.lang.String mNameAtCreation;
    private long mNativeContext;
    private final java.util.concurrent.locks.Lock mNativeContextLock = null;
    private android.media.MediaCodec.EventHandler mOnFirstTunnelFrameReadyHandler;
    private android.media.MediaCodec.OnFirstTunnelFrameReadyListener mOnFirstTunnelFrameReadyListener;
    private android.media.MediaCodec.EventHandler mOnFrameRenderedHandler;
    private android.media.MediaCodec.OnFrameRenderedListener mOnFrameRenderedListener;
    private final java.util.ArrayList<android.media.MediaCodec.OutputFrame> mOutputFrames = null;
    private final java.util.ArrayList<android.media.MediaCodec.QueueRequest> mQueueRequests = null;
    private java.util.BitSet mValidInputIndices;
    private java.util.BitSet mValidOutputIndices;
    private MediaCodec(java.lang.String p0, boolean p1, boolean p2) {}
    private MediaCodec(java.lang.String p0, boolean p1, boolean p2, int p3, int p4) {}
    static boolean GetFlag(java.util.function.Supplier<java.lang.Boolean> p0) { return false; }
    static boolean GetFlag(java.util.function.Supplier<java.lang.Boolean> p0, boolean p1) { return false; }
    private void cacheBuffersLocked(boolean p0) {}
    private void configure(android.media.MediaFormat p0, android.view.Surface p1, android.media.MediaCrypto p2, android.os.IHwBinder p3, int p4) {}
    public static android.media.MediaCodec createByCodecName(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.SystemApi
    public static android.media.MediaCodec createByCodecNameForClient(java.lang.String p0, int p1, int p2) throws java.io.IOException { return null; }
    public static android.media.MediaCodec createDecoderByType(java.lang.String p0) throws java.io.IOException { return null; }
    public static android.media.MediaCodec createEncoderByType(java.lang.String p0) throws java.io.IOException { return null; }
    public static android.view.Surface createPersistentInputSurface() { return null; }
    private void freeAllTrackedBuffers() {}
    private void freeByteBufferLocked(java.nio.ByteBuffer p0) {}
    private void freeByteBuffersLocked(java.nio.ByteBuffer[] p0) {}
    private final native java.nio.ByteBuffer getBuffer(boolean p0, int p1);
    private final native java.nio.ByteBuffer[] getBuffers(boolean p0);
    private android.media.MediaCodec.EventHandler getEventHandlerOn(android.os.Handler p0, android.media.MediaCodec.EventHandler p1) { return null; }
    private final native java.util.Map<java.lang.String, java.lang.Object> getFormatNative(boolean p0);
    public static java.util.List<android.media.MediaCodec.GlobalResourceInfo> getGloballyAvailableResources() { return null; }
    private final native android.media.Image getImage(boolean p0, int p1);
    private final native java.util.Map<java.lang.String, java.lang.Object> getOutputFormatNative(int p0);
    private final native android.media.MediaCodecInfo getOwnCodecInfo();
    private void invalidateByteBufferLocked(java.nio.ByteBuffer[] p0, int p1, boolean p2) {}
    private void invalidateByteBuffersLocked(java.nio.ByteBuffer[] p0) {}
    private final long lockAndGetContext() { return 0L; }
    private void logAndRun(java.lang.String p0, java.lang.Runnable p1) {}
    private boolean mapFormatEntryToNative(java.lang.String[] p0, java.lang.Object[] p1, int p2, java.lang.String p3, java.lang.Object p4) { return false; }
    public static android.media.Image mapHardwareBuffer(android.hardware.HardwareBuffer p0) { return null; }
    private static native void native_closeMediaImage(long p0);
    private final native void native_configure(java.lang.String[] p0, java.lang.Object[] p1, android.view.Surface p2, android.media.MediaCrypto p3, android.os.IHwBinder p4, int p5);
    private static final native android.media.MediaCodec.PersistentSurface native_createPersistentInputSurface();
    private final native int native_dequeueInputBuffer(long p0);
    private final native int native_dequeueOutputBuffer(android.media.MediaCodec.BufferInfo p0, long p1);
    private native void native_detachOutputSurface();
    private native void native_enableOnFirstTunnelFrameReadyListener(boolean p0);
    private native void native_enableOnFrameRenderedListener(boolean p0);
    private final native void native_finalize();
    private final native void native_flush();
    private static native java.util.List<android.media.MediaCodec.GlobalResourceInfo> native_getGloballyAvailableResources();
    private native android.os.PersistableBundle native_getMetrics();
    private native void native_getOutputFrame(android.media.MediaCodec.OutputFrame p0, int p1);
    private native android.media.MediaCodec.ParameterDescriptor native_getParameterDescriptor(java.lang.String p0);
    private native java.util.List<android.media.MediaCodec.InstanceResourceInfo> native_getRequiredResources();
    private native java.util.List<java.lang.String> native_getSupportedVendorParameters();
    private static final native void native_init();
    private static native android.media.Image native_mapHardwareBuffer(android.hardware.HardwareBuffer p0);
    private native void native_queueHardwareBuffer(int p0, android.hardware.HardwareBuffer p1, long p2, int p3, java.util.ArrayList<java.lang.String> p4, java.util.ArrayList<java.lang.Object> p5);
    private final native void native_queueInputBuffer(int p0, int p1, int p2, long p3, int p4) throws android.media.MediaCodec.CryptoException;
    private final native void native_queueInputBuffers(int p0, java.lang.Object[] p1) throws android.media.MediaCodec.CryptoException, android.media.MediaCodec.CodecException;
    private native void native_queueLinearBlock(int p0, android.media.MediaCodec.LinearBlock p1, java.lang.Object[] p2, java.lang.Object[] p3, java.util.ArrayList<java.lang.String> p4, java.util.ArrayList<java.lang.Object> p5);
    private final native void native_queueSecureInputBuffer(int p0, int p1, android.media.MediaCodec.CryptoInfo p2, long p3, int p4) throws android.media.MediaCodec.CryptoException;
    private final native void native_queueSecureInputBuffers(int p0, java.lang.Object[] p1, java.lang.Object[] p2) throws android.media.MediaCodec.CryptoException, android.media.MediaCodec.CodecException;
    private final native void native_release();
    private static final native void native_releasePersistentInputSurface(android.view.Surface p0);
    private final native void native_reset();
    private native void native_setAudioPresentation(int p0, int p1);
    private final native void native_setCallback(android.media.MediaCodec.Callback p0);
    private final native void native_setInputSurface(android.view.Surface p0);
    private native void native_setSurface(android.view.Surface p0);
    private final native void native_setup(java.lang.String p0, boolean p1, boolean p2, int p3, int p4);
    private final native void native_start();
    private final native void native_stop();
    private native void native_subscribeToVendorParameters(java.util.List<java.lang.String> p0);
    private native void native_unsubscribeFromVendorParameters(java.util.List<java.lang.String> p0);
    private void postEventFromNative(int p0, int p1, int p2, java.lang.Object p3) {}
    private final native void releaseOutputBuffer(int p0, boolean p1, boolean p2, long p3);
    private void releaseOutputBufferInternal(int p0, boolean p1, boolean p2, long p3) {}
    private void revalidateByteBuffer(java.nio.ByteBuffer[] p0, int p1, boolean p2) {}
    private final void setAndUnlockContext(long p0) {}
    private final native void setParameters(java.lang.String[] p0, java.lang.Object[] p1);
    private void validateInputByteBufferLocked(java.nio.ByteBuffer[] p0, int p1) {}
    private void validateOutputByteBufferLocked(java.nio.ByteBuffer[] p0, int p1, android.media.MediaCodec.BufferInfo p2) {}
    private void validateOutputByteBuffersLocked(java.nio.ByteBuffer[] p0, int p1, java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> p2) {}
    public void configure(android.media.MediaFormat p0, android.view.Surface p1, int p2, android.media.MediaDescrambler p3) {}
    public void configure(android.media.MediaFormat p0, android.view.Surface p1, android.media.MediaCrypto p2, int p3) {}
    public final native android.view.Surface createInputSurface();
    public final int dequeueInputBuffer(long p0) { return 0; }
    public final int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo p0, long p1) { return 0; }
    public void detachOutputSurface() {}
    protected void finalize() {}
    public final void flush() {}
    public final native java.lang.String getCanonicalName();
    public android.media.MediaCodecInfo getCodecInfo() { return null; }
    public java.nio.ByteBuffer getInputBuffer(int p0) { return null; }
    public java.nio.ByteBuffer[] getInputBuffers() { return null; }
    public final android.media.MediaFormat getInputFormat() { return null; }
    public android.media.Image getInputImage(int p0) { return null; }
    public android.os.PersistableBundle getMetrics() { return null; }
    public final java.lang.String getName() { return null; }
    public java.nio.ByteBuffer getOutputBuffer(int p0) { return null; }
    public java.nio.ByteBuffer[] getOutputBuffers() { return null; }
    public final android.media.MediaFormat getOutputFormat() { return null; }
    public final android.media.MediaFormat getOutputFormat(int p0) { return null; }
    public android.media.MediaCodec.OutputFrame getOutputFrame(int p0) { return null; }
    public android.media.Image getOutputImage(int p0) { return null; }
    public android.media.MediaCodec.ParameterDescriptor getParameterDescriptor(java.lang.String p0) { return null; }
    public android.media.MediaCodec.QueueRequest getQueueRequest(int p0) { return null; }
    public java.util.List<android.media.MediaCodec.InstanceResourceInfo> getRequiredResources() { return null; }
    public java.util.List<java.lang.String> getSupportedVendorParameters() { return null; }
    public final void queueInputBuffer(int p0, int p1, int p2, long p3, int p4) throws android.media.MediaCodec.CryptoException {}
    public final void queueInputBuffers(int p0, java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> p1) {}
    public final void queueSecureInputBuffer(int p0, int p1, android.media.MediaCodec.CryptoInfo p2, long p3, int p4) throws android.media.MediaCodec.CryptoException {}
    public final void queueSecureInputBuffers(int p0, java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> p1, java.util.ArrayDeque<android.media.MediaCodec.CryptoInfo> p2) {}
    public final void release() {}
    public final void releaseOutputBuffer(int p0, long p1) {}
    public final void releaseOutputBuffer(int p0, boolean p1) {}
    public final void reset() {}
    public void setAudioPresentation(android.media.AudioPresentation p0) {}
    public void setCallback(android.media.MediaCodec.Callback p0) {}
    public void setCallback(android.media.MediaCodec.Callback p0, android.os.Handler p1) {}
    public void setInputSurface(android.view.Surface p0) {}
    public void setOnFirstTunnelFrameReadyListener(android.os.Handler p0, android.media.MediaCodec.OnFirstTunnelFrameReadyListener p1) {}
    public void setOnFrameRenderedListener(android.media.MediaCodec.OnFrameRenderedListener p0, android.os.Handler p1) {}
    public void setOutputSurface(android.view.Surface p0) {}
    public final void setParameters(android.os.Bundle p0) {}
    public final native void setVideoScalingMode(int p0);
    public final native void signalEndOfInputStream();
    public final void start() {}
    public final void stop() {}
    public void subscribeToVendorParameters(java.util.List<java.lang.String> p0) {}
    public void unsubscribeFromVendorParameters(java.util.List<java.lang.String> p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BufferFlag {
    }

    public static final class BufferInfo {
        public int flags;
        public int offset;
        public long presentationTimeUs;
        public int size;
        public BufferInfo() {}
        public android.media.MediaCodec.BufferInfo dup() { return null; }
        public void set(int p0, int p1, long p2, int p3) {}
    }

    private static class BufferMap {
        private final java.util.Map<java.lang.Integer, android.media.MediaCodec.BufferMap.CodecBuffer> mMap = null;
        private BufferMap() {}
        public void clear() {}
        public void put(int p0, android.media.Image p1) {}
        public void put(int p0, java.nio.ByteBuffer p1) {}
        public void remove(int p0) {}

        private static class CodecBuffer {
            private java.nio.ByteBuffer mByteBuffer;
            private android.media.Image mImage;
            private CodecBuffer() {}
            public void free() {}
            public void setByteBuffer(java.nio.ByteBuffer p0) {}
            public void setImage(android.media.Image p0) {}
        }
    }

    public static abstract class Callback {
        public Callback() {}
        public void onCryptoError(android.media.MediaCodec p0, android.media.MediaCodec.CryptoException p1) {}
        public abstract void onError(android.media.MediaCodec p0, android.media.MediaCodec.CodecException p1);
        public abstract void onInputBufferAvailable(android.media.MediaCodec p0, int p1);
        public void onMetricsFlushed(android.media.MediaCodec p0, android.os.PersistableBundle p1) {}
        public abstract void onOutputBufferAvailable(android.media.MediaCodec p0, int p1, android.media.MediaCodec.BufferInfo p2);
        public void onOutputBuffersAvailable(android.media.MediaCodec p0, int p1, java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> p2) {}
        public abstract void onOutputFormatChanged(android.media.MediaCodec p0, android.media.MediaFormat p1);
        public void onRequiredResourcesChanged(android.media.MediaCodec p0) {}
    }

    public static final class CodecException extends java.lang.IllegalStateException {
        private static final int ACTION_RECOVERABLE = 2;
        private static final int ACTION_TRANSIENT = 1;
        public static final int ERROR_INSUFFICIENT_RESOURCE = 1100;
        public static final int ERROR_RECLAIMED = 1101;
        private final int mActionCode = 0;
        private final java.lang.String mDiagnosticInfo = null;
        private final int mErrorCode = 0;
        CodecException(int p0, int p1, java.lang.String p2) { super(); }
        public java.lang.String getDiagnosticInfo() { return null; }
        public int getErrorCode() { return 0; }
        public boolean isRecoverable() { return false; }
        public boolean isTransient() { return false; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ReasonCode {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConfigureFlag {
    }

    public static final class CryptoException extends java.lang.RuntimeException implements android.media.MediaDrmThrowable {
        public static final int ERROR_FRAME_TOO_LARGE = 8;
        public static final int ERROR_INSUFFICIENT_OUTPUT_PROTECTION = 4;
        public static final int ERROR_INSUFFICIENT_SECURITY = 7;
        public static final int ERROR_KEY_EXPIRED = 2;
        public static final int ERROR_LOST_STATE = 9;
        public static final int ERROR_NO_KEY = 1;
        public static final int ERROR_RESOURCE_BUSY = 3;
        public static final int ERROR_SESSION_NOT_OPENED = 5;
        public static final int ERROR_UNSUPPORTED_OPERATION = 6;
        private android.media.MediaCodec.CryptoInfo mCryptoInfo;
        private final int mErrorCode = 0;
        private final int mErrorContext = 0;
        private final int mOemError = 0;
        private final int mVendorError = 0;
        public CryptoException(int p0, java.lang.String p1) { super(); }
        public CryptoException(java.lang.String p0, int p1, int p2, int p3, int p4, android.media.MediaCodec.CryptoInfo p5) { super(); }
        public android.media.MediaCodec.CryptoInfo getCryptoInfo() { return null; }
        public int getErrorCode() { return 0; }
        public int getErrorContext() { return 0; }
        public int getOemError() { return 0; }
        public int getVendorError() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CryptoErrorCode {
        }
    }

    public static final class CryptoInfo {
        private static final android.media.MediaCodec.CryptoInfo.Pattern ZERO_PATTERN = null;
        public byte[] iv;
        public byte[] key;
        private android.media.MediaCodec.CryptoInfo.Pattern mPattern;
        public int mode;
        public int[] numBytesOfClearData;
        public int[] numBytesOfEncryptedData;
        public int numSubSamples;
        public CryptoInfo() {}
        private void setPattern(int p0, int p1) {}
        public android.media.MediaCodec.CryptoInfo.Pattern getPattern() { return null; }
        public void set(int p0, int[] p1, int[] p2, byte[] p3, byte[] p4, int p5) {}
        public void setPattern(android.media.MediaCodec.CryptoInfo.Pattern p0) {}
        public java.lang.String toString() { return null; }

        public static final class Pattern {
            private int mEncryptBlocks;
            private int mSkipBlocks;
            public Pattern(int p0, int p1) {}
            public int getEncryptBlocks() { return 0; }
            public int getSkipBlocks() { return 0; }
            public void set(int p0, int p1) {}
        }
    }

    private class EventHandler extends android.os.Handler {
        private android.media.MediaCodec mCodec;
        public EventHandler(android.media.MediaCodec p0, android.media.MediaCodec p1, android.os.Looper p2) { super(); }
        private void handleCallback(android.os.Message p0) {}
        public void handleMessage(android.os.Message p0) {}
    }

    public static final class GlobalResourceInfo {
        long mAvailable;
        long mCapacity;
        java.lang.String mName;
        public GlobalResourceInfo() {}
        public long getAvailable() { return 0L; }
        public long getCapacity() { return 0L; }
        public java.lang.String getName() { return null; }
    }

    public class IncompatibleWithBlockModelException extends java.lang.RuntimeException {
        IncompatibleWithBlockModelException(android.media.MediaCodec p0) { super(); }
        IncompatibleWithBlockModelException(android.media.MediaCodec p0, java.lang.String p1) { super(); }
        IncompatibleWithBlockModelException(android.media.MediaCodec p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
        IncompatibleWithBlockModelException(android.media.MediaCodec p0, java.lang.Throwable p1) { super(); }
    }

    public static final class InstanceResourceInfo {
        java.lang.String mName;
        long mPerFrameCount;
        long mStaticCount;
        public InstanceResourceInfo() {}
        public java.lang.String getName() { return null; }
        public long getPerFrameCount() { return 0L; }
        public long getStaticCount() { return 0L; }
    }

    public class InvalidBufferFlagsException extends java.lang.RuntimeException {
        InvalidBufferFlagsException(android.media.MediaCodec p0, java.lang.String p1) { super(); }
    }

    public static final class LinearBlock {
        private static final java.util.concurrent.BlockingQueue<android.media.MediaCodec.LinearBlock> sPool = null;
        private boolean mInternal;
        private final java.lang.Object mLock = null;
        private boolean mMappable;
        private java.nio.ByteBuffer mMapped;
        private long mNativeContext;
        private boolean mValid;
        private LinearBlock() {}
        public static boolean isCodecCopyFreeCompatible(java.lang.String[] p0) { return false; }
        private static native boolean native_checkCompatible(java.lang.String[] p0);
        private native java.nio.ByteBuffer native_map();
        private native void native_obtain(int p0, java.lang.String[] p1);
        private native void native_recycle();
        public static android.media.MediaCodec.LinearBlock obtain(int p0, java.lang.String[] p1) { return null; }
        private void setInternalStateLocked(long p0, boolean p1) {}
        protected void finalize() {}
        public boolean isMappable() { return false; }
        public java.nio.ByteBuffer map() { return null; }
        public void recycle() {}
    }

    public static class MediaImage extends android.media.Image {
        private static final int TYPE_YUV = 1;
        private final java.nio.ByteBuffer mBuffer = null;
        private final long mBufferContext = 0L;
        private final int mFormat = 0;
        private final int mHeight = 0;
        private final java.nio.ByteBuffer mInfo = null;
        private final boolean mIsReadOnly = false;
        private final android.media.Image.Plane[] mPlanes = null;
        private final int mScalingMode = 0;
        private long mTimestamp;
        private final int mTransform = 0;
        private final int mWidth = 0;
        private final int mXOffset = 0;
        private final int mYOffset = 0;
        public MediaImage(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1, boolean p2, long p3, int p4, int p5, android.graphics.Rect p6) { super(); }
        public MediaImage(java.nio.ByteBuffer[] p0, int[] p1, int[] p2, int p3, int p4, int p5, boolean p6, long p7, int p8, int p9, android.graphics.Rect p10, long p11) { super(); }
        public void close() {}
        public int getFormat() { return 0; }
        public int getHeight() { return 0; }
        public android.media.Image.Plane[] getPlanes() { return null; }
        public int getScalingMode() { return 0; }
        public long getTimestamp() { return 0L; }
        public int getTransform() { return 0; }
        public int getWidth() { return 0; }
        public void setCropRect(android.graphics.Rect p0) {}

        private class MediaPlane extends android.media.Image.Plane {
            private final int mColInc = 0;
            private final java.nio.ByteBuffer mData = null;
            private final int mRowInc = 0;
            public MediaPlane(android.media.MediaCodec.MediaImage p0, java.nio.ByteBuffer p1, int p2, int p3) { super(); }
            public java.nio.ByteBuffer getBuffer() { return null; }
            public int getPixelStride() { return 0; }
            public int getRowStride() { return 0; }
        }
    }

    public static final class MetricsConstants {
        public static final java.lang.String CODEC = "android.media.mediacodec.codec";
        public static final java.lang.String ENCODER = "android.media.mediacodec.encoder";
        public static final java.lang.String HEIGHT = "android.media.mediacodec.height";
        public static final java.lang.String MIME_TYPE = "android.media.mediacodec.mime";
        public static final java.lang.String MODE = "android.media.mediacodec.mode";
        public static final java.lang.String MODE_AUDIO = "audio";
        public static final java.lang.String MODE_VIDEO = "video";
        public static final java.lang.String ROTATION = "android.media.mediacodec.rotation";
        public static final java.lang.String SECURE = "android.media.mediacodec.secure";
        public static final java.lang.String WIDTH = "android.media.mediacodec.width";
        private MetricsConstants() {}
    }

    public static interface OnFirstTunnelFrameReadyListener {
        public void onFirstTunnelFrameReady(android.media.MediaCodec p0);
    }

    public static interface OnFrameRenderedListener {
        public void onFrameRendered(android.media.MediaCodec p0, long p1, long p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OutputBufferInfo {
    }

    public static final class OutputFrame {
        private boolean mAccessible;
        private final java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> mBufferInfos = null;
        private final java.util.ArrayList<java.lang.String> mChangedKeys = null;
        private int mFlags;
        private android.media.MediaFormat mFormat;
        private android.hardware.HardwareBuffer mHardwareBuffer;
        private final int mIndex = 0;
        private final java.util.Set<java.lang.String> mKeySet = null;
        private android.media.MediaCodec.LinearBlock mLinearBlock;
        private boolean mLoaded;
        private long mPresentationTimeUs;
        OutputFrame(int p0) {}
        void clear() {}
        public java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> getBufferInfos() { return null; }
        public java.util.Set<java.lang.String> getChangedKeys() { return null; }
        public int getFlags() { return 0; }
        public android.media.MediaFormat getFormat() { return null; }
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
        public android.media.MediaCodec.LinearBlock getLinearBlock() { return null; }
        public long getPresentationTimeUs() { return 0L; }
        boolean isAccessible() { return false; }
        boolean isLoaded() { return false; }
        void setAccessible(boolean p0) {}
        void setBufferInfo(android.media.MediaCodec.BufferInfo p0) {}
        void setBufferInfos(java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> p0) {}
        void setLoaded(boolean p0) {}
    }

    public static class ParameterDescriptor {
        private java.lang.String mName;
        private int mType;
        private ParameterDescriptor() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getName() { return null; }
        public int getType() { return 0; }
        public int hashCode() { return 0; }
    }

    static class PersistentSurface extends android.view.Surface {
        private long mPersistentObject;
        PersistentSurface() { super(); }
        public void release() {}
    }

    public final class QueueRequest {
        private boolean mAccessible;
        private final java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> mBufferInfos = null;
        private final android.media.MediaCodec mCodec = null;
        private final java.util.ArrayDeque<android.media.MediaCodec.CryptoInfo> mCryptoInfos = null;
        private int mFlags;
        private android.hardware.HardwareBuffer mHardwareBuffer;
        private final int mIndex = 0;
        private android.media.MediaCodec.LinearBlock mLinearBlock;
        private int mOffset;
        private long mPresentationTimeUs;
        private int mSize;
        private final java.util.ArrayList<java.lang.String> mTuningKeys = null;
        private final java.util.ArrayList<java.lang.Object> mTuningValues = null;
        private QueueRequest(android.media.MediaCodec p0, android.media.MediaCodec p1, int p2) {}
        android.media.MediaCodec.QueueRequest clear() { return null; }
        boolean isAccessible() { return false; }
        public void queue() {}
        android.media.MediaCodec.QueueRequest setAccessible(boolean p0) { return null; }
        public android.media.MediaCodec.QueueRequest setByteBufferParameter(java.lang.String p0, java.nio.ByteBuffer p1) { return null; }
        public android.media.MediaCodec.QueueRequest setEncryptedLinearBlock(android.media.MediaCodec.LinearBlock p0, int p1, int p2, android.media.MediaCodec.CryptoInfo p3) { return null; }
        public android.media.MediaCodec.QueueRequest setFlags(int p0) { return null; }
        public android.media.MediaCodec.QueueRequest setFloatParameter(java.lang.String p0, float p1) { return null; }
        public android.media.MediaCodec.QueueRequest setHardwareBuffer(android.hardware.HardwareBuffer p0) { return null; }
        public android.media.MediaCodec.QueueRequest setIntegerParameter(java.lang.String p0, int p1) { return null; }
        public android.media.MediaCodec.QueueRequest setLinearBlock(android.media.MediaCodec.LinearBlock p0, int p1, int p2) { return null; }
        public android.media.MediaCodec.QueueRequest setLongParameter(java.lang.String p0, long p1) { return null; }
        public android.media.MediaCodec.QueueRequest setMultiFrameEncryptedLinearBlock(android.media.MediaCodec.LinearBlock p0, java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> p1, java.util.ArrayDeque<android.media.MediaCodec.CryptoInfo> p2) { return null; }
        public android.media.MediaCodec.QueueRequest setMultiFrameLinearBlock(android.media.MediaCodec.LinearBlock p0, java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> p1) { return null; }
        public android.media.MediaCodec.QueueRequest setPresentationTimeUs(long p0) { return null; }
        public android.media.MediaCodec.QueueRequest setStringParameter(java.lang.String p0, java.lang.String p1) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VideoScalingMode {
    }
}
