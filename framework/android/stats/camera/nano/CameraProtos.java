package android.stats.camera.nano;

public interface CameraProtos {

    public static final class CameraStreamProto extends com.android.framework.protobuf.nano.MessageNano {
        public static final int CAPTURE_LATENCY = 1;
        public static final int UNKNOWN = 0;
        private static volatile android.stats.camera.nano.CameraProtos.CameraStreamProto[] _emptyArray;
        public int colorSpace;
        public int currentSurfaceId;
        public int dataSpace;
        public long dynamicRangeProfile;
        public long errorCount;
        public int firstCaptureLatencyMillis;
        public int format;
        public int height;
        public float[] histogramBins;
        public long[] histogramCounts;
        public int histogramType;
        public int maxAppBuffers;
        public int maxHalBuffers;
        public long requestCount;
        public long streamUseCase;
        public long usage;
        public int width;
        public CameraStreamProto() { super(); }
        public static android.stats.camera.nano.CameraProtos.CameraStreamProto[] emptyArray() { return null; }
        public static android.stats.camera.nano.CameraProtos.CameraStreamProto parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.stats.camera.nano.CameraProtos.CameraStreamProto parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public android.stats.camera.nano.CameraProtos.CameraStreamProto clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public android.stats.camera.nano.CameraProtos.CameraStreamProto mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }
}
