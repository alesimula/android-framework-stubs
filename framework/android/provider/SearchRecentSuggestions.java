package android.provider;

public class SearchRecentSuggestions {
    private static final java.lang.String LOG_TAG = "SearchSuggestions";
    private static final int MAX_HISTORY_COUNT = 250;
    public static final java.lang.String[] QUERIES_PROJECTION_1LINE = null;
    public static final java.lang.String[] QUERIES_PROJECTION_2LINE = null;
    public static final int QUERIES_PROJECTION_DATE_INDEX = 1;
    public static final int QUERIES_PROJECTION_DISPLAY1_INDEX = 3;
    public static final int QUERIES_PROJECTION_DISPLAY2_INDEX = 4;
    public static final int QUERIES_PROJECTION_QUERY_INDEX = 2;
    private static final java.util.concurrent.Semaphore sWritesInProgress = null;
    private final java.lang.String mAuthority = null;
    private final android.content.Context mContext = null;
    private final android.net.Uri mSuggestionsUri = null;
    private final boolean mTwoLineDisplay = false;
    public SearchRecentSuggestions(android.content.Context p0, java.lang.String p1, int p2) {}
    private void saveRecentQueryBlocking(java.lang.String p0, java.lang.String p1) {}
    public void clearHistory() {}
    public void saveRecentQuery(java.lang.String p0, java.lang.String p1) {}
    protected void truncateHistory(android.content.ContentResolver p0, int p1) {}
    void waitForSave() {}

    private static class SuggestionColumns implements android.provider.BaseColumns {
        public static final java.lang.String DATE = "date";
        public static final java.lang.String DISPLAY1 = "display1";
        public static final java.lang.String DISPLAY2 = "display2";
        public static final java.lang.String QUERY = "query";
        private SuggestionColumns() {}
    }
}
