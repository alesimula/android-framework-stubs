package com.android.internal.dev.perfetto.sdk;

public final class PerfettoTrackEventBuilder {
    private static final int DEFAULT_EXTRA_CACHE_SIZE = 16;
    private static final int DEFAULT_PENDING_POINTERS_LIST_SIZE = 16;
    private static final com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder NO_OP_BUILDER = null;
    private static final com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner.AllocationStats sNativeAllocationStats = null;
    public static final java.lang.ThreadLocal<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder> sThreadLocalBuilder = null;
    private final java.util.function.Supplier<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.FieldNested> fieldNestedSupplier = null;
    private final java.util.function.Supplier<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.Field> fieldSupplier = null;
    private final java.util.function.Supplier<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.Flow> flowSupplier = null;
    private com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category mCategory;
    private com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder.Pool<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder> mChildBuildersCache;
    private com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.FieldContainer mCurrentContainer;
    private java.lang.String mEventName;
    private com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra mExtra;
    private boolean mIsBuilt;
    private final boolean mIsCategoryEnabled = false;
    private boolean mIsDebug;
    private com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder.LazyInitObjects mLazyInitObjects;
    private com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner mNativeMemoryCleaner;
    private com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder.ObjectsCache mObjectsCache;
    private com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder.ObjectsPool mObjectsPool;
    private com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder mParent;
    private java.util.ArrayList<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer> mPendingPointers;
    private int mTraceType;
    private final java.util.function.Supplier<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder> perfettoTrackEventBuilderSupplier = null;
    private final java.util.function.Supplier<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.Proto> protoSupplier = null;
    private PerfettoTrackEventBuilder(boolean p0, com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder p1) {}
    private void addFieldToContainer(com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer p0) {}
    private void addPerfettoPointerToExtra(com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer p0) {}
    private void checkBuildingProto() {}
    private void checkMatchingBeginNested() {}
    private void checkMatchingBeginProto() {}
    private void checkNotBuildingProto() {}
    private void checkState() {}
    public static com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner.AllocationStats getNativeAllocationStats() { return null; }
    private com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder initChildBuilderForProto(com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder p0, com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.FieldContainer p1) { return null; }
    private com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder initNewEvent(int p0, com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category p1, boolean p2) { return null; }
    private boolean isBuildingNestedProto() { return false; }
    private boolean isBuildingProto() { return false; }
    private boolean isBuildingProtoOrNestedProto() { return false; }
    private boolean isBuildingTopLevelExtra() { return false; }
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder newEvent(int p0, com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category p1, boolean p2) { return null; }
    private void readAllCacheFieldsFromParent(com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder p0) {}
    private static void throwBuildingProtoError() {}
    private static void throwMatchingBeginNestedError() {}
    private static void throwMatchingBeginProtoError() {}
    private static void throwNotBuildingProtoError() {}
    private static void throwStateError() {}
    private void updateNativeMemoryCleanerForDebug(boolean p0) {}
    private com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingCounterTrack(long p0, java.lang.String p1, boolean p2) { return null; }
    private com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingNamedTrack(long p0, java.lang.String p1, long p2, boolean p3) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder addArg(java.lang.String p0, double p1) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder addArg(java.lang.String p0, long p1) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder addArg(java.lang.String p0, java.lang.String p1) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder addArg(java.lang.String p0, boolean p1) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder addField(long p0, double p1) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder addField(long p0, long p1) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder addField(long p0, java.lang.String p1) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder addFieldWithInterning(long p0, java.lang.String p1, long p2) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder addFlow(long p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder addTerminatingFlow(long p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder beginNested(long p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder beginProto() { return null; }
    public void emit() {}
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder endNested() { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder endProto() { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder setCounter(double p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder setCounter(long p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder setEventName(java.lang.String p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder setFlow(long p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder setTerminatingFlow(long p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingCounterTrack(long p0, java.lang.String p1) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingCounterTrackWithDynamicName(long p0, java.lang.String p1) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingNamedTrack(long p0, java.lang.String p1, long p2) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingNamedTrackWithDynamicName(long p0, java.lang.String p1, long p2) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingProcessCounterTrack(java.lang.String p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingProcessCounterTrackWithDynamicName(java.lang.String p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingProcessNamedTrack(long p0, java.lang.String p1) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingProcessNamedTrackWithDynamicName(long p0, java.lang.String p1) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingThreadCounterTrack(long p0, java.lang.String p1) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingThreadCounterTrackWithDynamicName(long p0, java.lang.String p1) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingThreadNamedTrack(long p0, java.lang.String p1, long p2) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingThreadNamedTrackWithDynamicName(long p0, java.lang.String p1, long p2) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder usingTrack(com.android.internal.dev.perfetto.sdk.PerfettoTrack p0) { return null; }

    private static final class LazyInitObjects {
        private com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.Counter mCounter;
        private final com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner mNativeMemoryCleaner = null;
        private LazyInitObjects(com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner p0) {}
        public com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.Counter getCounter() { return null; }
    }

    private static final class ObjectsCache {
        public final com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder.RingBuffer<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.Arg> mArgCache = null;
        public final com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder.RingBuffer<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.CounterTrack> mCounterTrackCache = null;
        public final com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder.RingBuffer<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.NamedTrack> mNamedTrackCache = null;
        public ObjectsCache(int p0) {}
    }

    private static final class ObjectsPool {
        public final com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder.Pool<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.FieldNested> mFieldNestedPool = null;
        public final com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder.Pool<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.Field> mFieldPool = null;
        public final com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder.Pool<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.Flow> mFlowPool = null;
        public final com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder.Pool<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.Proto> mProtoPool = null;
        public final com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder.Pool<com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.Flow> mTerminatingFlowPool = null;
        public ObjectsPool(int p0) {}
        public void reset() {}
    }

    private static final class Pool<T extends java.lang.Object> {
        private final int mCapacity = 0;
        private int mIdx;
        private final T[] mValueArray = null;
        Pool(int p0) {}
        public T get(java.util.function.Supplier<T> p0) { return null; }
        public void reset() {}
    }

    private static final class RingBuffer<T extends java.lang.Object> {
        private final int mCapacity = 0;
        private final int[] mKeyArray = null;
        private final T[] mValueArray = null;
        private int mWriteEnd;
        RingBuffer(int p0) {}
        public T get(int p0) { return null; }
        public void put(int p0, T p1) {}
    }
}
