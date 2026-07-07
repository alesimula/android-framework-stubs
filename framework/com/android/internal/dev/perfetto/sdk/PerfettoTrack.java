package com.android.internal.dev.perfetto.sdk;

public final class PerfettoTrack {
    public static final int CHILD_ORDERING_CHRONOLOGICAL = 2;
    public static final int CHILD_ORDERING_EXPLICIT = 3;
    public static final int CHILD_ORDERING_LEXICOGRAPHIC = 1;
    public static final int CHILD_ORDERING_UNKNOWN = 0;
    private static final long DEFAULT_ID = 0L;
    static final int ROOT_GLOBAL = 0;
    static final int ROOT_PROCESS = 1;
    static final int ROOT_THREAD = 2;
    public static final int SIBLING_MERGE_BEHAVIOR_BY_SIBLING_MERGE_KEY = 3;
    public static final int SIBLING_MERGE_BEHAVIOR_BY_TRACK_NAME = 1;
    public static final int SIBLING_MERGE_BEHAVIOR_NONE = 2;
    public static final int SIBLING_MERGE_BEHAVIOR_UNSPECIFIED = 0;
    private static final com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner sCleaner = null;
    final int[] mChildOrderings = null;
    final long[] mIds = null;
    final java.lang.String[] mNames = null;
    private volatile com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.NestedTracks mNested;
    final int mRootType = 0;
    final int[] mSiblingMergeBehaviors = null;
    final long[] mSiblingMergeKeyInts = null;
    final java.lang.String[] mSiblingMergeKeyStrs = null;
    final int[] mSiblingOrderRanks = null;
    private PerfettoTrack(int p0, java.lang.String[] p1, long[] p2, int[] p3, int[] p4, int[] p5, java.lang.String[] p6, long[] p7) {}
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrack global(java.lang.String p0) { return null; }
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrack process(java.lang.String p0) { return null; }
    private static com.android.internal.dev.perfetto.sdk.PerfettoTrack root(int p0, java.lang.String p1) { return null; }
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrack thread(java.lang.String p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrack child(long p0, java.lang.String p1) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrack child(java.lang.String p0) { return null; }
    com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.NestedTracks nestedTracks() { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrack setChildOrdering(int p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrack setSiblingMergeBehavior(int p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrack setSiblingMergeKey(long p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrack setSiblingMergeKey(java.lang.String p0) { return null; }
    public com.android.internal.dev.perfetto.sdk.PerfettoTrack setSiblingOrderRank(int p0) { return null; }
}
