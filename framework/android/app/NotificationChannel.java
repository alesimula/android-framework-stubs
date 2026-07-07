package android.app;

public final class NotificationChannel implements android.os.Parcelable {
    public static final int ALLOW_BUBBLE_OFF = 0;
    public static final int ALLOW_BUBBLE_ON = 1;
    private static final java.lang.String ATT_ALLOW_BUBBLE = "allow_bubbles";
    private static final java.lang.String ATT_BLOCKABLE_SYSTEM = "blockable_system";
    private static final java.lang.String ATT_BUNDLE = "is_bundle";
    private static final java.lang.String ATT_CONTENT_TYPE = "content_type";
    private static final java.lang.String ATT_CONVERSATION_ID = "conv_id";
    private static final java.lang.String ATT_DELETED = "deleted";
    private static final java.lang.String ATT_DELETED_TIME_MS = "del_time";
    private static final java.lang.String ATT_DEMOTE = "dem";
    private static final java.lang.String ATT_DESC = "desc";
    private static final java.lang.String ATT_EMOJI = "emoji";
    private static final java.lang.String ATT_FG_SERVICE_SHOWN = "fgservice";
    private static final java.lang.String ATT_FLAGS = "flags";
    private static final java.lang.String ATT_GROUP = "group";
    private static final java.lang.String ATT_ID = "id";
    private static final java.lang.String ATT_IMPORTANCE = "importance";
    private static final java.lang.String ATT_IMP_CONVERSATION = "imp_conv";
    private static final java.lang.String ATT_LIGHTS = "lights";
    private static final java.lang.String ATT_LIGHT_COLOR = "light_color";
    private static final java.lang.String ATT_NAME = "name";
    private static final java.lang.String ATT_ORIG_IMP = "orig_imp";
    private static final java.lang.String ATT_PARENT_CHANNEL = "parent";
    private static final java.lang.String ATT_PRIORITY = "priority";
    private static final java.lang.String ATT_SHOW_BADGE = "show_badge";
    private static final java.lang.String ATT_SOUND = "sound";
    private static final java.lang.String ATT_USAGE = "usage";
    private static final java.lang.String ATT_USER_LOCKED = "locked";
    private static final java.lang.String ATT_VIBRATION = "vibration";
    private static final java.lang.String ATT_VIBRATION_EFFECT = "vibration_effect";
    private static final java.lang.String ATT_VIBRATION_ENABLED = "vibration_enabled";
    private static final java.lang.String ATT_VISIBILITY = "visibility";
    public static final android.os.Parcelable.Creator<android.app.NotificationChannel> CREATOR = null;
    public static final int DEFAULT_ALLOW_BUBBLE = -1;
    public static final java.lang.String DEFAULT_CHANNEL_ID = "miscellaneous";
    private static final boolean DEFAULT_DELETED = false;
    private static final long DEFAULT_DELETION_TIME_MS = -1L;
    private static final int DEFAULT_IMPORTANCE = -1000;
    private static final int DEFAULT_LIGHT_COLOR = 0;
    private static final boolean DEFAULT_SHOW_BADGE = true;
    private static final int DEFAULT_VISIBILITY = -1000;
    private static final java.lang.String DELIMITER = ",";
    public static final java.lang.String DYNAMIC_BUNDLE_PREFIX = "android.app.dynamic.";
    public static final java.lang.String EDIT_CONVERSATION = "conversation";
    public static final java.lang.String EDIT_IMPORTANCE = "importance";
    public static final java.lang.String EDIT_LAUNCHER = "launcher";
    public static final java.lang.String EDIT_LOCKED_DEVICE = "locked";
    public static final java.lang.String EDIT_SOUND = "sound";
    public static final java.lang.String EDIT_VIBRATION = "vibration";
    public static final java.lang.String EDIT_ZEN = "zen";
    public static final int[] LOCKABLE_FIELDS = null;
    public static final int MAX_SERIALIZED_VIBRATION_LENGTH = 32768;
    public static final int MAX_TEXT_LENGTH = 1000;
    public static final int MAX_VIBRATION_LENGTH = 500;
    public static final java.lang.String NEWS_ID = "android.app.news";
    public static final java.lang.String PLACEHOLDER_CONVERSATION_ID = ":placeholder_id";
    public static final java.lang.String PROMOTIONS_ID = "android.app.promotions";
    public static final java.lang.String RECS_ID = "android.app.recs";
    public static final java.lang.String SOCIAL_MEDIA_ID = "android.app.social";
    public static final java.util.ArrayList<java.lang.String> SYSTEM_RESERVED_IDS = null;
    private static final java.lang.String TAG = "NotificationChannel";
    private static final java.lang.String TAG_CHANNEL = "channel";
    public static final int USER_LOCKED_ALLOW_BUBBLE = 256;
    public static final int USER_LOCKED_IMPORTANCE = 4;
    public static final int USER_LOCKED_LIGHTS = 8;
    public static final int USER_LOCKED_PRIORITY = 1;
    public static final int USER_LOCKED_SHOW_BADGE = 128;
    @android.annotation.SystemApi
    public static final int USER_LOCKED_SOUND = 32;
    public static final int USER_LOCKED_VIBRATION = 16;
    public static final int USER_LOCKED_VISIBILITY = 2;
    private int mAllowBubbles;
    private android.media.AudioAttributes mAudioAttributes;
    private boolean mBlockableSystem;
    private boolean mBypassDnd;
    private java.lang.String mConversationId;
    private boolean mDeleted;
    private long mDeletedTime;
    private boolean mDemoted;
    private java.lang.String mDesc;
    private java.lang.String mEmoji;
    private java.lang.String mGroup;
    private java.lang.String mId;
    private int mImportance;
    private boolean mImportanceLockedDefaultApp;
    private boolean mImportantConvo;
    private boolean mIsBundleChannel;
    private long mLastNotificationUpdateTimeMs;
    private int mLightColor;
    private boolean mLights;
    private int mLockscreenVisibility;
    private java.lang.String mName;
    private int mOriginalImportance;
    private java.lang.String mParentId;
    private boolean mShowBadge;
    private android.net.Uri mSound;
    private boolean mSoundRestored;
    private int mUserLockedFields;
    private boolean mUserVisibleTaskShown;
    private android.os.VibrationEffect mVibrationEffect;
    private boolean mVibrationEnabled;
    private long[] mVibrationPattern;
    protected NotificationChannel(android.os.Parcel p0) {}
    public NotificationChannel(java.lang.String p0, java.lang.CharSequence p1, int p2) {}
    public static java.lang.String getChannelIdForBundleType(int p0) { return null; }
    private java.lang.String getFieldsString() { return null; }
    private java.lang.String getTrimmedString(java.lang.String p0) { return null; }
    private android.os.VibrationEffect getTrimmedVibrationEffect(android.os.VibrationEffect p0) { return null; }
    private static java.lang.String longArrayToString(long[] p0) { return null; }
    private void populateFromXml(com.android.modules.utils.TypedXmlPullParser p0, boolean p1, boolean p2, android.content.Context p3) {}
    private static android.media.AudioAttributes safeAudioAttributes(com.android.modules.utils.TypedXmlPullParser p0) { return null; }
    private static boolean safeBool(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1, boolean p2) { return false; }
    private static int safeInt(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1, int p2) { return 0; }
    private static long[] safeLongArray(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1, long[] p2) { return null; }
    private static android.net.Uri safeUri(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1) { return null; }
    private static android.os.VibrationEffect safeVibrationEffect(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1) { return null; }
    private static java.lang.String vibrationToString(android.os.VibrationEffect p0) { return null; }
    private void writeXml(com.android.modules.utils.TypedXmlSerializer p0, boolean p1, android.content.Context p2) throws java.io.IOException {}
    public boolean canBubble() { return false; }
    public boolean canBypassDnd() { return false; }
    public boolean canShowBadge() { return false; }
    public android.app.NotificationChannel copy() { return null; }
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1, boolean p2) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void enableLights(boolean p0) {}
    public void enableVibration(boolean p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAllowBubbles() { return 0; }
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public java.lang.String getConversationId() { return null; }
    public long getDeletedTimeMs() { return 0L; }
    public java.lang.String getDescription() { return null; }
    public java.lang.String getEmoji() { return null; }
    public java.lang.String getGroup() { return null; }
    public java.lang.String getId() { return null; }
    public int getImportance() { return 0; }
    public long getLastNotificationUpdateTimeMs() { return 0L; }
    public int getLightColor() { return 0; }
    public int getLockscreenVisibility() { return 0; }
    public java.lang.CharSequence getName() { return null; }
    public int getOriginalImportance() { return 0; }
    public java.lang.String getParentChannelId() { return null; }
    public android.net.Uri getSound() { return null; }
    @android.annotation.SystemApi
    public int getUserLockedFields() { return 0; }
    public android.os.VibrationEffect getVibrationEffect() { return null; }
    public long[] getVibrationPattern() { return null; }
    public boolean hasUserSetImportance() { return false; }
    public boolean hasUserSetSound() { return false; }
    public int hashCode() { return 0; }
    public boolean isBlockable() { return false; }
    public boolean isBundleChannel() { return false; }
    public boolean isConversation() { return false; }
    @android.annotation.SystemApi
    public boolean isDeleted() { return false; }
    public boolean isDemoted() { return false; }
    public boolean isImportanceLockedByCriticalDeviceFunction() { return false; }
    public boolean isImportantConversation() { return false; }
    public boolean isSoundRestored() { return false; }
    public boolean isUserVisibleTaskShown() { return false; }
    public void lockFields(int p0) {}
    @android.annotation.SystemApi
    public void populateFromXml(org.xmlpull.v1.XmlPullParser p0) {}
    public void populateFromXmlForRestore(org.xmlpull.v1.XmlPullParser p0, boolean p1, android.content.Context p2) {}
    public void setAllowBubbles(int p0) {}
    public void setAllowBubbles(boolean p0) {}
    public void setBlockable(boolean p0) {}
    public void setBypassDnd(boolean p0) {}
    public void setConversationId(java.lang.String p0, java.lang.String p1) {}
    public void setDeleted(boolean p0) {}
    public void setDeletedTimeMs(long p0) {}
    public void setDemoted(boolean p0) {}
    public void setDescription(java.lang.String p0) {}
    public void setEmoji(java.lang.String p0) {}
    public void setGroup(java.lang.String p0) {}
    public void setId(java.lang.String p0) {}
    public void setImportance(int p0) {}
    public void setImportanceLockedByCriticalDeviceFunction(boolean p0) {}
    @android.annotation.SystemApi
    public void setImportantConversation(boolean p0) {}
    public void setIsBundleChannel(boolean p0) {}
    public void setLastNotificationUpdateTimeMs(long p0) {}
    public void setLightColor(int p0) {}
    public void setLockscreenVisibility(int p0) {}
    public void setName(java.lang.CharSequence p0) {}
    public void setOriginalImportance(int p0) {}
    public void setShowBadge(boolean p0) {}
    public void setSound(android.net.Uri p0, android.media.AudioAttributes p1) {}
    public void setSoundRestored(boolean p0) {}
    public void setUserVisibleTaskShown(boolean p0) {}
    public void setVibrationEffect(android.os.VibrationEffect p0) {}
    public void setVibrationPattern(long[] p0) {}
    public boolean shouldShowLights() { return false; }
    public boolean shouldVibrate() { return false; }
    @android.annotation.SystemApi
    public org.json.JSONObject toJson() throws org.json.JSONException { return null; }
    public java.lang.String toString() { return null; }
    public void unlockFields(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.SystemApi
    public void writeXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    public void writeXmlForBackup(org.xmlpull.v1.XmlSerializer p0, android.content.Context p1) throws java.io.IOException {}
}
