package android.internal.perfetto.protos;

public final class TestEventOuterClass {
    public TestEventOuterClass() {}

    public final class TestEvent {
        public static final long COUNTER = 1116691496963L;
        public static final long IS_LAST = 1133871366148L;
        public static final long PAYLOAD = 1146756268037L;
        public static final long PROTOVM_INCREMENTAL_STATE = 1146756268039L;
        public static final long PROTOVM_PATCH = 1146756268038L;
        public static final long SEQ_VALUE = 1155346202626L;
        public static final long STR = 1138166333441L;
        public TestEvent(android.internal.perfetto.protos.TestEventOuterClass p0) {}

        public final class ProtoVmIncrementalState {
            public static final long INT_MERGED = 1120986464258L;
            public static final long MESSAGES = 2246267895812L;
            public static final long SINGLE_MESSAGE = 1146756268035L;
            public static final long STRING_MERGED = 1138166333441L;
            public ProtoVmIncrementalState(android.internal.perfetto.protos.TestEventOuterClass.TestEvent p0) {}
        }

        public final class ProtoVmMessage {
            public static final long ID = 1155346202625L;
            public static final long SUBMESSAGE = 1146756268034L;
            public ProtoVmMessage(android.internal.perfetto.protos.TestEventOuterClass.TestEvent p0) {}

            public final class ProtoVmSubmessage {
                public static final long SINGLE_INT = 1155346202625L;
                public ProtoVmSubmessage(android.internal.perfetto.protos.TestEventOuterClass.TestEvent.ProtoVmMessage p0) {}
            }
        }

        public final class ProtoVmPatch {
            public static final long DELETE_MESSAGE_IDS = 2254857830405L;
            public static final long INT_TO_MERGE = 1120986464258L;
            public static final long MESSAGES = 2246267895812L;
            public static final long SINGLE_MESSAGE = 1146756268035L;
            public static final long STRING_TO_MERGE = 1138166333441L;
            public ProtoVmPatch(android.internal.perfetto.protos.TestEventOuterClass.TestEvent p0) {}
        }

        public final class TestPayload {
            public static final long DEBUG_ANNOTATIONS = 2246267895815L;
            public static final long NESTED = 2246267895810L;
            public static final long REMAINING_NESTING_DEPTH = 1155346202627L;
            public static final long REPEATED_INTS = 2220498092038L;
            public static final long SINGLE_INT = 1120986464261L;
            public static final long SINGLE_STRING = 1138166333444L;
            public static final long STR = 2237677961217L;
            public TestPayload(android.internal.perfetto.protos.TestEventOuterClass.TestEvent p0) {}
        }
    }
}
