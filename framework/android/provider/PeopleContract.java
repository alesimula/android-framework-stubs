package android.provider;

public final class PeopleContract {
    public static final java.lang.String AUTHORITY = "com.android.people";
    public static final android.net.Uri AUTHORITY_URI = null;
    public static final android.net.Uri CONTENT_NOTIFICATION_URI = null;
    public static final java.lang.String EXTRA_NOTIFICATION_URI = "android.provider.extra.NOTIFICATION_URI";
    public static final java.lang.String QUERY_ARG_DEPENDENCY_URI = "android:query-arg-dependency-uri";
    public static final java.lang.String QUERY_ARG_PACKAGE = "android:query-arg-package";
    public static final java.lang.String QUERY_ARG_QUERIES = "android:query-arg-queries";
    public static final java.lang.String QUERY_ARG_SELECTION_TYPE = "android:query-arg-selection-type";
    public static final java.lang.String QUERY_ARG_SELECTION_VALUE = "android:query-arg-selection-value";
    private PeopleContract() {}
    public static android.app.PendingIntent createPeopleInteractionRequest(android.content.ContentResolver p0, java.lang.String p1, android.os.Bundle p2) { return null; }

    public static final class Capability {
        public static final int TEXT_REACHABILITY = 4;
        public static final int VIDEO_REACHABILITY = 2;
        public static final int VOICE_REACHABILITY = 1;
        private Capability() {}
    }

    public static final class Directory {
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/people_directory";
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/people_directories";
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String DIRECTORY_AUTHORITY = "authority";
        public static final java.lang.String DIRECTORY_METADATA = "android.content.PeopleDirectory";
        public static final java.lang.String PACKAGE_NAME = "package_name";
        private Directory() {}
        public static boolean notifyChange(android.content.Context p0, android.net.Uri p1, android.os.Bundle p2, android.os.CancellationSignal p3) { return false; }
        public static boolean requestRefresh(android.content.Context p0, android.os.CancellationSignal p1) { return false; }
    }

    public static final class Groups {
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/people_group";
        public static final android.net.Uri CONTENT_LOOKUP_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/people_groups";
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String DISPLAY_NAME = "display_name";
        public static final java.lang.String LOOKUP_KEY = "lookup_key";
        private Groups() {}

        public static final class Query {
            public static final java.lang.String SELECTION_TYPE_LOOKUP_KEY = "selection-type-lookup-key";
            private Query() {}

            public static final class Builder {
                private final java.util.ArrayList<android.os.Bundle> mRequests = null;
                public Builder() {}
                public android.provider.PeopleContract.Groups.Query.Builder addLookupQuery(java.lang.String p0, java.util.List<java.lang.String> p1) { return null; }
                public android.os.Bundle build() { return null; }
            }
        }
    }

    public static final class Intents {
        public static final java.lang.String ACTION_START_PEOPLE_INTERACTION = "android.provider.action.START_PEOPLE_INTERACTION";
        public static final java.lang.String EXTRA_PEOPLE_INTERACTION_PENDING_INTENT = "android.provider.extra.PEOPLE_INTERACTION_PENDING_INTENT";
        public static final java.lang.String EXTRA_PEOPLE_INTERACTION_TYPE = "android.provider.extra.PEOPLE_INTERACTION_TYPE";
        public static final java.lang.String EXTRA_PEOPLE_QUERY_ARGS = "android.provider.extra.PEOPLE_QUERY_ARGS";
        public static final java.lang.String METHOD_CREATE_INTERACTION_INTENT = "create_interaction_intent";
        public static final java.lang.String PEOPLE_INTERACTION_TYPE_MESSAGE = "com.android.people.PEOPLE_INTERACTION_TYPE_MESSAGE";
        public static final java.lang.String PEOPLE_INTERACTION_TYPE_VIDEO = "com.android.people.PEOPLE_INTERACTION_TYPE_VIDEO";
        public static final java.lang.String PEOPLE_INTERACTION_TYPE_VOICE = "com.android.people.PEOPLE_INTERACTION_TYPE_VOICE";
        private Intents() {}
    }

    public static final class Persons {
        public static final java.lang.String CAPABILITY = "capability";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/people_person";
        public static final android.net.Uri CONTENT_LOOKUP_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/people_persons";
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String DISPLAY_NAME = "display_name";
        public static final java.lang.String LOOKUP_KEY = "lookup_key";
        public static final java.lang.String PHOTO_URI = "photo_uri";
        private Persons() {}

        public static final class Query {
            public static final java.lang.String SELECTION_TYPE_EMAIL = "selection-type-email";
            public static final java.lang.String SELECTION_TYPE_GROUP_LOOKUP_KEY = "selection-type-group-lookup-key";
            public static final java.lang.String SELECTION_TYPE_LOOKUP_KEY = "selection-type-lookup-key";
            public static final java.lang.String SELECTION_TYPE_PHONE = "selection-type-phone";
            private Query() {}

            public static final class Builder {
                private final java.util.ArrayList<android.os.Bundle> mRequests = null;
                public Builder() {}
                public android.provider.PeopleContract.Persons.Query.Builder addEmailQuery(java.lang.String p0, java.util.List<java.lang.String> p1) { return null; }
                public android.provider.PeopleContract.Persons.Query.Builder addGroupQuery(java.lang.String p0, java.util.List<java.lang.String> p1) { return null; }
                public android.provider.PeopleContract.Persons.Query.Builder addLookupQuery(java.lang.String p0, java.util.List<java.lang.String> p1) { return null; }
                public android.provider.PeopleContract.Persons.Query.Builder addPhoneQuery(java.lang.String p0, java.util.List<java.lang.String> p1) { return null; }
                public android.os.Bundle build() { return null; }
            }
        }
    }
}
