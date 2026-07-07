package android.media;

public class RingtoneManager {
    public static final java.lang.String ACTION_RINGTONE_PICKER = "android.intent.action.RINGTONE_PICKER";
    private static final java.lang.String EMERGENCY_PHONE_ACCOUNT_HANDLE_ID = "E";
    public static final java.lang.String EXTRA_RINGTONE_AUDIO_ATTRIBUTES_FLAGS = "android.intent.extra.ringtone.AUDIO_ATTRIBUTES_FLAGS";
    public static final java.lang.String EXTRA_RINGTONE_DEFAULT_URI = "android.intent.extra.ringtone.DEFAULT_URI";
    public static final java.lang.String EXTRA_RINGTONE_EXISTING_URI = "android.intent.extra.ringtone.EXISTING_URI";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_RINGTONE_INCLUDE_DRM = "android.intent.extra.ringtone.INCLUDE_DRM";
    public static final java.lang.String EXTRA_RINGTONE_PICKED_URI = "android.intent.extra.ringtone.PICKED_URI";
    public static final java.lang.String EXTRA_RINGTONE_SHOW_DEFAULT = "android.intent.extra.ringtone.SHOW_DEFAULT";
    public static final java.lang.String EXTRA_RINGTONE_SHOW_SILENT = "android.intent.extra.ringtone.SHOW_SILENT";
    public static final java.lang.String EXTRA_RINGTONE_TITLE = "android.intent.extra.ringtone.TITLE";
    public static final java.lang.String EXTRA_RINGTONE_TYPE = "android.intent.extra.ringtone.TYPE";
    public static final int ID_COLUMN_INDEX = 0;
    private static final java.lang.String[] INTERNAL_COLUMNS = null;
    private static final java.lang.String[] MEDIA_COLUMNS = null;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final java.lang.String PHONE_ACCOUNT_HANDLE_COMPONENT_NAME = "phone_account_component";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final java.lang.String PHONE_ACCOUNT_HANDLE_ID = "phone_account_id";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final java.lang.String PHONE_ACCOUNT_HANDLE_USER_HANDLE = "phone_account_user_handle";
    public static final java.lang.String RINGTONE_DELIMITER_FOR_PHONE_ACCOUNT_HANDLE = "_id_";
    private static final java.lang.String TAG = "RingtoneManager";
    public static final int TITLE_COLUMN_INDEX = 1;
    public static final int TYPE_ALARM = 4;
    public static final int TYPE_ALL = 7;
    public static final int TYPE_NOTIFICATION = 2;
    public static final int TYPE_RINGTONE = 1;
    public static final int URI_COLUMN_INDEX = 2;
    private final android.app.Activity mActivity = null;
    private final android.content.Context mContext = null;
    private android.database.Cursor mCursor;
    private final java.util.List<java.lang.String> mFilterColumns = null;
    private boolean mIncludeParentRingtones;
    private android.media.Ringtone mPreviousRingtone;
    private boolean mStopPreviousRingtone;
    private int mType;
    public RingtoneManager(android.app.Activity p0) {}
    public RingtoneManager(android.app.Activity p0, boolean p1) {}
    public RingtoneManager(android.content.Context p0) {}
    public RingtoneManager(android.content.Context p0, boolean p1) {}
    private static android.net.Uri computeDefaultRingtoneUri(android.content.Context p0, int p1) { return null; }
    private static java.lang.String constructBooleanTrueWhereClause(java.util.List<java.lang.String> p0) { return null; }
    private static android.content.Context createPackageContextAsUser(android.content.Context p0, int p1) { return null; }
    private static android.telecom.PhoneAccountHandle createPhoneAccountHandleFromUri(android.net.Uri p0) { return null; }
    @android.annotation.SystemApi
    public static void ensureDefaultRingtones(android.content.Context p0) {}
    public static android.net.Uri getActualDefaultRingtoneUri(android.content.Context p0, int p1) { return null; }
    static android.net.Uri getActualUriFromSettingsUri(android.content.Context p0, android.net.Uri p1) { return null; }
    public static android.net.Uri getCacheForType(int p0) { return null; }
    public static android.net.Uri getCacheForType(int p0, int p1) { return null; }
    static android.net.Uri getCacheUriFromSettingsUri(android.content.Context p0, android.net.Uri p1) { return null; }
    private static java.lang.String getDefaultRingtoneFilename(int p0) { return null; }
    private static java.lang.String getDefaultRingtoneSetting(int p0) { return null; }
    public static int getDefaultType(android.net.Uri p0) { return 0; }
    public static android.net.Uri getDefaultUri(int p0) { return null; }
    private static final java.lang.String getExternalDirectoryForType(int p0) { return null; }
    private android.database.Cursor getInternalRingtones() { return null; }
    private android.database.Cursor getMediaRingtones() { return null; }
    private android.database.Cursor getMediaRingtones(android.content.Context p0) { return null; }
    private android.database.Cursor getParentProfileRingtones() { return null; }
    private static java.lang.String getQueryStringForType(int p0) { return null; }
    public static android.media.Ringtone getRingtone(android.content.Context p0, android.net.Uri p1) { return null; }
    private static android.media.Ringtone getRingtone(android.content.Context p0, android.net.Uri p1, int p2, android.media.VolumeShaper.Configuration p3, boolean p4) { return null; }
    private static android.media.Ringtone getRingtone(android.content.Context p0, android.net.Uri p1, int p2, boolean p3) { return null; }
    public static android.media.Ringtone getRingtone(android.content.Context p0, android.net.Uri p1, android.media.VolumeShaper.Configuration p2) { return null; }
    @android.annotation.SystemApi
    public static android.media.Ringtone getRingtone(android.content.Context p0, android.net.Uri p1, android.media.VolumeShaper.Configuration p2, android.media.AudioAttributes p3) { return null; }
    public static android.media.Ringtone getRingtone(android.content.Context p0, android.net.Uri p1, android.media.VolumeShaper.Configuration p2, boolean p3) { return null; }
    private static android.net.Uri getRingtoneCacheForPhoneAccountHandle(int p0, android.telecom.PhoneAccountHandle p1) { return null; }
    private static java.lang.String getRingtoneSettingForPhoneAccountHandle(android.telecom.PhoneAccountHandle p0) { return null; }
    public static android.net.Uri getRingtoneUriForPhoneAccountHandle(android.content.Context p0, android.telecom.PhoneAccountHandle p1) { return null; }
    public static android.net.Uri getRingtoneUriForRestore(android.content.ContentResolver p0, java.lang.String p1, int p2) throws java.io.FileNotFoundException, java.lang.IllegalArgumentException { return null; }
    private static android.net.Uri getRingtoneUriForSetting(android.content.Context p0, java.lang.String p1) { return null; }
    private static java.lang.String getSettingForType(int p0) { return null; }
    private static android.net.Uri getUriFromCursor(android.content.Context p0, android.database.Cursor p1) { return null; }
    public static android.net.Uri getValidRingtoneUri(android.content.Context p0) { return null; }
    private static android.net.Uri getValidRingtoneUriFromCursorAndClose(android.content.Context p0, android.database.Cursor p1) { return null; }
    public static boolean hasHapticChannels(android.content.Context p0, android.net.Uri p1) { return false; }
    public static boolean hasHapticChannels(android.net.Uri p0) { return false; }
    public static boolean isDefault(android.net.Uri p0) { return false; }
    private static boolean isExternalRingtoneUri(android.net.Uri p0) { return false; }
    private static boolean isInternalRingtoneUri(android.net.Uri p0) { return false; }
    private static boolean isRingtoneUriInStorage(android.net.Uri p0, android.net.Uri p1) { return false; }
    private static void logRestoreResult(int p0, int p1, int p2) {}
    private static boolean muteHapticChannelForVibration(android.content.Context p0, android.net.Uri p1) { return false; }
    public static android.content.res.AssetFileDescriptor openDefaultRingtoneUri(android.content.Context p0, android.net.Uri p1) throws java.io.FileNotFoundException { return null; }
    private android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) { return null; }
    private android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, android.content.Context p5) { return null; }
    public static void setActualDefaultRingtoneUri(android.content.Context p0, int p1, android.net.Uri p2) {}
    private void setFilterColumnsList(int p0) {}
    public static void setRingtoneUri(android.content.Context p0, android.net.Uri p1, android.telecom.PhoneAccountHandle p2) {}
    private static void setRingtoneUriForSetting(android.content.Context p0, java.lang.String p1, android.net.Uri p2) {}
    public android.net.Uri addCustomExternalRingtone(android.net.Uri p0, int p1) throws java.io.FileNotFoundException, java.lang.IllegalArgumentException, java.io.IOException { return null; }
    public android.database.Cursor getCursor() { return null; }
    @java.lang.Deprecated
    public boolean getIncludeDrm() { return false; }
    public android.media.Ringtone getRingtone(int p0) { return null; }
    public int getRingtonePosition(android.net.Uri p0) { return 0; }
    public android.net.Uri getRingtoneUri(int p0) { return null; }
    public boolean getStopPreviousRingtone() { return false; }
    public boolean hasHapticChannels(int p0) { return false; }
    public int inferStreamType() { return 0; }
    @java.lang.Deprecated
    public void setIncludeDrm(boolean p0) {}
    public void setStopPreviousRingtone(boolean p0) {}
    public void setType(int p0) {}
    public void stopPreviousRingtone() {}
}
