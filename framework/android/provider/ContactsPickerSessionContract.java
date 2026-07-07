package android.provider;

public final class ContactsPickerSessionContract {
    public static final java.lang.String ACTION_PICK_CONTACTS = "android.provider.action.PICK_CONTACTS";
    public static final java.lang.String AUTHORITY = "com.android.contacts.picker.sessions";
    public static final android.net.Uri AUTHORITY_URI = null;
    public static final java.lang.String EXTRA_PICK_CONTACTS_MATCH_ALL_DATA_FIELDS = "android.provider.extra.PICK_CONTACTS_MATCH_ALL_DATA_FIELDS";
    public static final java.lang.String EXTRA_PICK_CONTACTS_REQUESTED_DATA_FIELDS = "android.provider.extra.PICK_CONTACTS_REQUESTED_DATA_FIELDS";
    public static final java.lang.String EXTRA_PICK_CONTACTS_SELECTION_LIMIT = "android.provider.extra.PICK_CONTACTS_SELECTION_LIMIT";
    private ContactsPickerSessionContract() {}

    public static final class Session implements android.provider.BaseColumns {
        public static final java.lang.String CONTACT_DATA_IDS = "data_ids";
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/data";
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String SESSION_REQUESTER_UID = "requester_uid";
        private Session() {}
    }
}
