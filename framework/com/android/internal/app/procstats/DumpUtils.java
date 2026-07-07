package com.android.internal.app.procstats;

public final class DumpUtils {
    public static final java.lang.String[] ADJ_MEM_NAMES_CSV = null;
    static final int[] ADJ_MEM_PROTO_ENUMS = null;
    static final java.lang.String[] ADJ_MEM_TAGS = null;
    public static final java.lang.String[] ADJ_SCREEN_NAMES_CSV = null;
    static final int[] ADJ_SCREEN_PROTO_ENUMS = null;
    static final java.lang.String[] ADJ_SCREEN_TAGS = null;
    static final java.lang.String CSV_SEP = "\t";
    private static final int[] PROCESS_STATS_STATE_TO_AGGREGATED_STATE = null;
    public static final java.lang.String[] STATE_LABELS = null;
    public static final java.lang.String STATE_LABEL_CACHED = null;
    public static final java.lang.String STATE_LABEL_TOTAL = null;
    public static final java.lang.String[] STATE_NAMES = null;
    public static final java.lang.String[] STATE_NAMES_CSV = null;
    static final int[] STATE_PROTO_ENUMS = null;
    static final java.lang.String[] STATE_TAGS = null;
    private static final java.lang.String TRACK_BACKUP = "proc_state: Backup";
    private static final java.lang.String TRACK_BOUND_FGS = "proc_state: BFgs";
    private static final java.lang.String TRACK_BOUND_TOP = "proc_state: BTop";
    private static final java.lang.String TRACK_CACHED = "proc_state: Cached";
    private static final java.lang.String TRACK_FGS = "proc_state: Fgs";
    private static final java.lang.String TRACK_FROZEN = "proc_state: Frozen";
    private static final java.lang.String TRACK_HEAVY_WEIGHT = "proc_state: HeavyWt";
    private static final java.lang.String TRACK_HOME = "proc_state: Home";
    private static final java.lang.String TRACK_IMPORTANT_BACKGROUND = "proc_state: ImpBg";
    private static final java.lang.String TRACK_IMPORTANT_FOREGROUND = "proc_state: ImpFg";
    private static final java.lang.String TRACK_LAST_ACTIVITY = "proc_state: LastAct";
    private static final java.lang.String TRACK_PERSISTENT = "proc_state: Persist";
    private static final java.lang.String TRACK_RECEIVER = "proc_state: Receivr";
    private static final java.lang.String TRACK_SERVICE = "proc_state: Service";
    private static final java.lang.String TRACK_SERVICE_RESTARTING = "proc_state: ServRst";
    private static final java.lang.String TRACK_TOP = "proc_state: Top";
    private static final java.lang.String TRACK_UNKNOWN = "proc_state: Unknown";
    private DumpUtils() {}
    public static int aggregateCurrentProcessState(int p0) { return 0; }
    public static java.lang.String collapseString(java.lang.String p0, java.lang.String p1) { return null; }
    public static void dumpAdjTimesCheckin(java.io.PrintWriter p0, java.lang.String p1, long[] p2, int p3, long p4, long p5) {}
    public static void dumpProcessListCsv(java.io.PrintWriter p0, java.util.ArrayList<com.android.internal.app.procstats.ProcessState> p1, boolean p2, int[] p3, boolean p4, int[] p5, boolean p6, int[] p7, long p8) {}
    public static void dumpProcessSummaryLocked(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, java.util.ArrayList<com.android.internal.app.procstats.ProcessState> p3, int[] p4, int[] p5, int[] p6, long p7, long p8) {}
    public static long dumpSingleTime(java.io.PrintWriter p0, java.lang.String p1, long[] p2, int p3, long p4, long p5) { return 0L; }
    private static void dumpStateHeadersCsv(java.io.PrintWriter p0, java.lang.String p1, int[] p2, int[] p3, int[] p4) {}
    public static void printAdjTag(java.io.PrintWriter p0, int p1) {}
    public static void printAdjTagAndValue(java.io.PrintWriter p0, int p1, long p2) {}
    public static void printAggregatedProcStateTagProto(android.util.proto.ProtoOutputStream p0, long p1, long p2, int p3) {}
    public static int printArrayEntry(java.io.PrintWriter p0, java.lang.String[] p1, int p2, int p3) { return 0; }
    public static void printMemLabel(java.io.PrintWriter p0, int p1, char p2) {}
    public static void printMemLabelCsv(java.io.PrintWriter p0, int p1) {}
    public static void printPercent(java.io.PrintWriter p0, double p1) {}
    public static void printProcStateAdjTagProto(android.util.proto.ProtoOutputStream p0, long p1, long p2, int p3) {}
    public static void printProcStateDurationProto(android.util.proto.ProtoOutputStream p0, long p1, int p2, long p3) {}
    public static void printProcStateTag(java.io.PrintWriter p0, int p1) {}
    public static void printProcStateTagAndValue(java.io.PrintWriter p0, int p1, long p2) {}
    public static void printProcStateTagProto(android.util.proto.ProtoOutputStream p0, long p1, long p2, long p3, int p4) {}
    public static int printProto(android.util.proto.ProtoOutputStream p0, long p1, int[] p2, int p3, int p4) { return 0; }
    public static void printScreenLabel(java.io.PrintWriter p0, int p1) {}
    public static void printScreenLabelCsv(java.io.PrintWriter p0, int p1) {}
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder setTrackForProcessState(com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder p0, int p1) { return null; }
}
