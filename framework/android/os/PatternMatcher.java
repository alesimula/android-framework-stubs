package android.os;

public class PatternMatcher implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.PatternMatcher> CREATOR = null;
    private static final int MAX_PATTERN_STORAGE = 2048;
    private static final int NO_MATCH = -1;
    private static final int PARSED_MODIFIER_ONE_OR_MORE = -8;
    private static final int PARSED_MODIFIER_RANGE_START = -5;
    private static final int PARSED_MODIFIER_RANGE_STOP = -6;
    private static final int PARSED_MODIFIER_ZERO_OR_MORE = -7;
    private static final int PARSED_TOKEN_CHAR_ANY = -4;
    private static final int PARSED_TOKEN_CHAR_SET_INVERSE_START = -2;
    private static final int PARSED_TOKEN_CHAR_SET_START = -1;
    private static final int PARSED_TOKEN_CHAR_SET_STOP = -3;
    public static final int PATTERN_ADVANCED_GLOB = 3;
    public static final int PATTERN_LITERAL = 0;
    public static final int PATTERN_PREFIX = 1;
    public static final int PATTERN_SIMPLE_GLOB = 2;
    public static final int PATTERN_SUFFIX = 4;
    private static final java.lang.String TAG = "PatternMatcher";
    private static final int TOKEN_TYPE_ANY = 1;
    private static final int TOKEN_TYPE_INVERSE_SET = 3;
    private static final int TOKEN_TYPE_LITERAL = 0;
    private static final int TOKEN_TYPE_SET = 2;
    private static final int[] sParsedPatternScratch = null;
    private final int[] mParsedPattern = null;
    private final java.lang.String mPattern = null;
    private final int mType = 0;
    public PatternMatcher(android.os.Parcel p0) {}
    public PatternMatcher(java.lang.String p0, int p1) {}
    private static boolean isParsedModifier(int p0) { return false; }
    static boolean matchAdvancedPattern(int[] p0, java.lang.String p1) { return false; }
    private static boolean matchChar(java.lang.String p0, int p1, int p2, int p3, int[] p4, int p5, int p6) { return false; }
    private static int matchChars(java.lang.String p0, int p1, int p2, int p3, int p4, int p5, int[] p6, int p7, int p8) { return 0; }
    static boolean matchGlobPattern(java.lang.String p0, java.lang.String p1) { return false; }
    static boolean matchPattern(java.lang.String p0, java.lang.String p1, int[] p2, int p3) { return false; }
    static int[] parseAndVerifyAdvancedPattern(java.lang.String p0) { return null; }
    public boolean check() { return false; }
    public int describeContents() { return 0; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public final java.lang.String getPath() { return null; }
    public final int getType() { return 0; }
    public boolean match(java.lang.String p0) { return false; }
    public java.lang.String toPrettyString() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PatternType {
    }
}
