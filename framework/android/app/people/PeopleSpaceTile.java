package android.app.people;

public class PeopleSpaceTile implements android.os.Parcelable {
    public static final int BLOCK_CONVERSATIONS = 2;
    public static final android.os.Parcelable.Creator<android.app.people.PeopleSpaceTile> CREATOR = null;
    public static final int SHOW_CONTACTS = 16;
    public static final int SHOW_CONVERSATIONS = 1;
    public static final int SHOW_IMPORTANT_CONVERSATIONS = 4;
    public static final int SHOW_STARRED_CONTACTS = 8;
    private java.lang.String mBirthdayText;
    private boolean mCanBypassDnd;
    private float mContactAffinity;
    private android.net.Uri mContactUri;
    private java.lang.String mId;
    private android.content.Intent mIntent;
    private boolean mIsImportantConversation;
    private boolean mIsPackageSuspended;
    private boolean mIsUserQuieted;
    private long mLastInteractionTimestamp;
    private int mMessagesCount;
    private java.lang.String mNotificationCategory;
    private java.lang.CharSequence mNotificationContent;
    private android.net.Uri mNotificationDataUri;
    private java.lang.String mNotificationKey;
    private int mNotificationPolicyState;
    private java.lang.CharSequence mNotificationSender;
    private long mNotificationTimestamp;
    private java.lang.String mPackageName;
    private java.util.List<android.app.people.ConversationStatus> mStatuses;
    private android.os.UserHandle mUserHandle;
    private android.graphics.drawable.Icon mUserIcon;
    private java.lang.CharSequence mUserName;
    private PeopleSpaceTile(android.app.people.PeopleSpaceTile.Builder p0) {}
    public PeopleSpaceTile(android.os.Parcel p0) {}
    public static android.graphics.drawable.Icon convertDrawableToIcon(android.graphics.drawable.Drawable p0) { return null; }
    public boolean canBypassDnd() { return false; }
    public int describeContents() { return 0; }
    public java.lang.String getBirthdayText() { return null; }
    public float getContactAffinity() { return 0.0f; }
    public android.net.Uri getContactUri() { return null; }
    public java.lang.String getId() { return null; }
    public android.content.Intent getIntent() { return null; }
    public long getLastInteractionTimestamp() { return 0L; }
    public int getMessagesCount() { return 0; }
    public java.lang.String getNotificationCategory() { return null; }
    public java.lang.CharSequence getNotificationContent() { return null; }
    public android.net.Uri getNotificationDataUri() { return null; }
    public java.lang.String getNotificationKey() { return null; }
    public int getNotificationPolicyState() { return 0; }
    public java.lang.CharSequence getNotificationSender() { return null; }
    public long getNotificationTimestamp() { return 0L; }
    public java.lang.String getPackageName() { return null; }
    public java.util.List<android.app.people.ConversationStatus> getStatuses() { return null; }
    public android.os.UserHandle getUserHandle() { return null; }
    public android.graphics.drawable.Icon getUserIcon() { return null; }
    public java.lang.CharSequence getUserName() { return null; }
    public boolean isImportantConversation() { return false; }
    public boolean isPackageSuspended() { return false; }
    public boolean isUserQuieted() { return false; }
    public android.app.people.PeopleSpaceTile.Builder toBuilder() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private java.lang.String mBirthdayText;
        private boolean mCanBypassDnd;
        private float mContactAffinity;
        private android.net.Uri mContactUri;
        private java.lang.String mId;
        private android.content.Intent mIntent;
        private boolean mIsImportantConversation;
        private boolean mIsPackageSuspended;
        private boolean mIsUserQuieted;
        private long mLastInteractionTimestamp;
        private int mMessagesCount;
        private java.lang.String mNotificationCategory;
        private java.lang.CharSequence mNotificationContent;
        private android.net.Uri mNotificationDataUri;
        private java.lang.String mNotificationKey;
        private int mNotificationPolicyState;
        private java.lang.CharSequence mNotificationSender;
        private long mNotificationTimestamp;
        private java.lang.String mPackageName;
        private java.util.List<android.app.people.ConversationStatus> mStatuses;
        private android.os.UserHandle mUserHandle;
        private android.graphics.drawable.Icon mUserIcon;
        private java.lang.CharSequence mUserName;
        public Builder(android.app.people.ConversationChannel p0, android.content.pm.LauncherApps p1) {}
        public Builder(android.content.pm.ShortcutInfo p0, android.content.pm.LauncherApps p1) {}
        public Builder(java.lang.String p0, java.lang.CharSequence p1, android.graphics.drawable.Icon p2, android.content.Intent p3) {}
        public android.app.people.PeopleSpaceTile build() { return null; }
        public android.net.Uri getContactUri(android.content.pm.ShortcutInfo p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setBirthdayText(java.lang.String p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setCanBypassDnd(boolean p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setContactAffinity(float p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setContactUri(android.net.Uri p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setId(java.lang.String p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setIntent(android.content.Intent p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setIsImportantConversation(boolean p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setIsPackageSuspended(boolean p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setIsUserQuieted(boolean p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setLastInteractionTimestamp(long p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setMessagesCount(int p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setNotificationCategory(java.lang.String p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setNotificationContent(java.lang.CharSequence p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setNotificationDataUri(android.net.Uri p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setNotificationKey(java.lang.String p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setNotificationPolicyState(int p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setNotificationSender(java.lang.CharSequence p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setNotificationTimestamp(long p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setPackageName(java.lang.String p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setStatuses(java.util.List<android.app.people.ConversationStatus> p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setUserHandle(android.os.UserHandle p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setUserIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.app.people.PeopleSpaceTile.Builder setUserName(java.lang.CharSequence p0) { return null; }
    }
}
