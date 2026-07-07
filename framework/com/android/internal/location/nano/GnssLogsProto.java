package com.android.internal.location.nano;

public interface GnssLogsProto {

    public static final class GnssLog extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.internal.location.nano.GnssLogsProto.GnssLog[] _emptyArray;
        public java.lang.String hardwareRevision;
        public double meanL5TopFourAverageCn0DbHz;
        public int meanPositionAccuracyMeters;
        public int meanTimeToFirstFixSecs;
        public double meanTopFourAverageCn0DbHz;
        public int numL5SvStatusProcessed;
        public int numL5SvStatusUsedInFix;
        public int numL5TopFourAverageCn0Processed;
        public int numLocationReportProcessed;
        public int numPositionAccuracyProcessed;
        public int numSvStatusProcessed;
        public int numSvStatusUsedInFix;
        public int numTimeToFirstFixProcessed;
        public int numTopFourAverageCn0Processed;
        public int percentageLocationFailure;
        public com.android.internal.location.nano.GnssLogsProto.PowerMetrics powerMetrics;
        public double standardDeviationL5TopFourAverageCn0DbHz;
        public int standardDeviationPositionAccuracyMeters;
        public int standardDeviationTimeToFirstFixSecs;
        public double standardDeviationTopFourAverageCn0DbHz;
        public GnssLog() { super(); }
        public static com.android.internal.location.nano.GnssLogsProto.GnssLog[] emptyArray() { return null; }
        public static com.android.internal.location.nano.GnssLogsProto.GnssLog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.location.nano.GnssLogsProto.GnssLog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.internal.location.nano.GnssLogsProto.GnssLog clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.location.nano.GnssLogsProto.GnssLog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class PowerMetrics extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.internal.location.nano.GnssLogsProto.PowerMetrics[] _emptyArray;
        public double energyConsumedMah;
        public long loggingDurationMs;
        public long[] timeInSignalQualityLevelMs;
        public PowerMetrics() { super(); }
        public static com.android.internal.location.nano.GnssLogsProto.PowerMetrics[] emptyArray() { return null; }
        public static com.android.internal.location.nano.GnssLogsProto.PowerMetrics parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.location.nano.GnssLogsProto.PowerMetrics parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.internal.location.nano.GnssLogsProto.PowerMetrics clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.location.nano.GnssLogsProto.PowerMetrics mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }
}
