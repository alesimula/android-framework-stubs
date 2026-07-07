package android.app.timedetector;

public class TimeDetectorHelper {
    private static final java.time.Instant AUTO_SUGGESTION_LOWER_BOUND_DEFAULT = null;
    public static final android.app.timedetector.TimeDetectorHelper INSTANCE = null;
    private static final java.time.Instant MANUAL_SUGGESTION_LOWER_BOUND = null;
    private static final int MANUAL_SUGGESTION_YEAR_MAX_WITHOUT_Y2038_ISSUE = 2100;
    private static final int MANUAL_SUGGESTION_YEAR_MAX_WITH_Y2038_ISSUE = 2037;
    private static final int MANUAL_SUGGESTION_YEAR_MIN = 2015;
    private static final java.time.Instant SUGGESTION_UPPER_BOUND_WIITHOUT_Y2038_ISSUE = null;
    private static final java.time.Instant SUGGESTION_UPPER_BOUND_WITH_Y2038_ISSUE = null;
    protected TimeDetectorHelper() {}
    private boolean getDeviceHasY2038Issue() { return false; }
    public java.time.Instant getAutoSuggestionLowerBoundDefault() { return null; }
    public int getManualDateSelectionYearMax() { return 0; }
    public int getManualDateSelectionYearMin() { return 0; }
    public java.time.Instant getManualSuggestionLowerBound() { return null; }
    public java.time.Instant getSuggestionUpperBound() { return null; }
}
