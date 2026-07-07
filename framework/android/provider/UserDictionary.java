package android.provider;

public class UserDictionary {
    public static final java.lang.String AUTHORITY = "user_dictionary";
    public static final android.net.Uri CONTENT_URI = null;
    private static final int FREQUENCY_MAX = 255;
    private static final int FREQUENCY_MIN = 0;
    public UserDictionary() {}

    public static class Words implements android.provider.BaseColumns {
        public static final java.lang.String APP_ID = "appid";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.userword";
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.userword";
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String DEFAULT_SORT_ORDER = "frequency DESC";
        public static final java.lang.String FREQUENCY = "frequency";
        public static final java.lang.String LOCALE = "locale";
        @java.lang.Deprecated
        public static final int LOCALE_TYPE_ALL = 0;
        @java.lang.Deprecated
        public static final int LOCALE_TYPE_CURRENT = 1;
        public static final java.lang.String SHORTCUT = "shortcut";
        public static final java.lang.String WORD = "word";
        public static final java.lang.String _ID = "_id";
        public Words() {}
        @java.lang.Deprecated
        public static void addWord(android.content.Context p0, java.lang.String p1, int p2, int p3) {}
        public static void addWord(android.content.Context p0, java.lang.String p1, int p2, java.lang.String p3, java.util.Locale p4) {}
    }
}
