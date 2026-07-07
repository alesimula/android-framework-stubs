package android.media.audiopolicy;

public class AudioAttributesMatchHelper {
    private static final int AUDIO_FLAGS_AFFECT_STRATEGY_SELECTION = 13;
    public static final int MATCH_ATTRIBUTES_EQUALS = 15;
    public static final int MATCH_MAX_SCORE_BIT_DEPTH = 4;
    public static final int MATCH_ON_CONTENT_TYPE_SCORE = 1;
    public static final int MATCH_ON_DEFAULT_SCORE = 0;
    public static final int MATCH_ON_FLAGS_SCORE = 4;
    public static final int MATCH_ON_TAGS_SCORE = 8;
    public static final int MATCH_ON_USAGE_SCORE = 2;
    public static final int NO_MATCH = -1;
    public AudioAttributesMatchHelper() {}
    public static int attributesMatchesScore(android.media.AudioAttributes p0, android.media.AudioAttributes p1) { return 0; }
}
