package android.app;

public class Notification implements android.os.Parcelable {
    public static final java.lang.String ACTION_BRIDGED_NOTIFICATION_PREFERENCES = "android.app.action.BRIDGED_NOTIFICATION_PREFERENCES";
    private static final java.lang.String ANNOTATION_SEMANTIC_STYLE_KEY = "android.app.notification.semanticStyle";
    public static final android.media.AudioAttributes AUDIO_ATTRIBUTES_DEFAULT = null;
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final java.lang.String CATEGORY_ALARM = "alarm";
    public static final java.lang.String CATEGORY_CALL = "call";
    @android.annotation.SystemApi
    public static final java.lang.String CATEGORY_CAR_EMERGENCY = "car_emergency";
    @android.annotation.SystemApi
    public static final java.lang.String CATEGORY_CAR_INFORMATION = "car_information";
    @android.annotation.SystemApi
    public static final java.lang.String CATEGORY_CAR_WARNING = "car_warning";
    public static final java.lang.String CATEGORY_EMAIL = "email";
    public static final java.lang.String CATEGORY_ERROR = "err";
    public static final java.lang.String CATEGORY_EVENT = "event";
    public static final java.lang.String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final java.lang.String CATEGORY_MESSAGE = "msg";
    public static final java.lang.String CATEGORY_MISSED_CALL = "missed_call";
    public static final java.lang.String CATEGORY_NAVIGATION = "navigation";
    public static final java.lang.String CATEGORY_PROGRESS = "progress";
    public static final java.lang.String CATEGORY_PROMO = "promo";
    public static final java.lang.String CATEGORY_RECOMMENDATION = "recommendation";
    public static final java.lang.String CATEGORY_REMINDER = "reminder";
    public static final java.lang.String CATEGORY_SERVICE = "service";
    public static final java.lang.String CATEGORY_SOCIAL = "social";
    public static final java.lang.String CATEGORY_STATUS = "status";
    public static final java.lang.String CATEGORY_STOPWATCH = "stopwatch";
    public static final java.lang.String CATEGORY_SYSTEM = "sys";
    public static final java.lang.String CATEGORY_TRANSPORT = "transport";
    public static final java.lang.String CATEGORY_VOICEMAIL = "voicemail";
    public static final java.lang.String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int COLOR_INVALID = 1;
    public static final android.os.Parcelable.Creator<android.app.Notification> CREATOR = null;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ALLOW_DURING_SETUP = "android.allowDuringSetup";
    public static final java.lang.String EXTRA_ANSWER_COLOR = "android.answerColor";
    public static final java.lang.String EXTRA_ANSWER_INTENT = "android.answerIntent";
    public static final java.lang.String EXTRA_APP_SUMMARIZATION = "android.app.extra.app_summarization";
    public static final java.lang.String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final java.lang.String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final java.lang.String EXTRA_BIG_TEXT = "android.bigText";
    public static final java.lang.String EXTRA_BUILDER_APPLICATION_INFO = "android.appInfo";
    public static final java.lang.String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    public static final java.lang.String EXTRA_CALL_PERSON = "android.callPerson";
    public static final java.lang.String EXTRA_CALL_TYPE = "android.callType";
    public static final java.lang.String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final java.lang.String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final java.lang.String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final java.lang.String EXTRA_COLORIZED = "android.colorized";
    public static final java.lang.String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    static final java.lang.String EXTRA_COMPACT_CONTENT = "android.compactContent";
    public static final java.lang.String EXTRA_CONTAINS_CUSTOM_VIEW = "android.contains.customView";
    public static final java.lang.String EXTRA_CONTAINS_SUMMARIZATION = "android.app.extra.contains_summarization";
    public static final java.lang.String EXTRA_CONVERSATION_ICON = "android.conversationIcon";
    public static final java.lang.String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final java.lang.String EXTRA_CONVERSATION_UNREAD_MESSAGE_COUNT = "android.conversationUnreadMessageCount";
    public static final java.lang.String EXTRA_DECLINE_COLOR = "android.declineColor";
    public static final java.lang.String EXTRA_DECLINE_INTENT = "android.declineIntent";
    public static final java.lang.String EXTRA_FOREGROUND_APPS = "android.foregroundApps";
    public static final java.lang.String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    public static final java.lang.String EXTRA_HIDE_SMART_REPLIES = "android.hideSmartReplies";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_HIDE_STATUS_BAR_NOTIFICATION = "android.hideStatusBarNotification";
    public static final java.lang.String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final java.lang.String EXTRA_INFO_TEXT = "android.infoText";
    public static final java.lang.String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final java.lang.String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final java.lang.String EXTRA_MEDIA_REMOTE_DEVICE = "android.mediaRemoteDevice";
    public static final java.lang.String EXTRA_MEDIA_REMOTE_ICON = "android.mediaRemoteIcon";
    public static final java.lang.String EXTRA_MEDIA_REMOTE_INTENT = "android.mediaRemoteIntent";
    public static final java.lang.String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final java.lang.String EXTRA_MESSAGES = "android.messages";
    public static final java.lang.String EXTRA_MESSAGING_PERSON = "android.messagingUser";
    static final java.lang.String EXTRA_METRICS = "android.metrics";
    static final java.lang.String EXTRA_METRICS_CRITICAL_INDEX = "android.metrics.criticalIndex";
    public static final java.lang.String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final java.lang.String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";
    public static final java.lang.String EXTRA_PEOPLE = "android.people";
    public static final java.lang.String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final java.lang.String EXTRA_PICTURE = "android.picture";
    public static final java.lang.String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final java.lang.String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final java.lang.String EXTRA_PREFER_SMALL_ICON = "android.app.preferSmallIcon";
    public static final java.lang.String EXTRA_PROGRESS = "android.progress";
    public static final java.lang.String EXTRA_PROGRESS_END_ICON = "android.progressEndIcon";
    public static final java.lang.String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final java.lang.String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final java.lang.String EXTRA_PROGRESS_POINTS = "android.progressPoints";
    public static final java.lang.String EXTRA_PROGRESS_SEGMENTS = "android.progressSegments";
    public static final java.lang.String EXTRA_PROGRESS_START_ICON = "android.progressStartIcon";
    public static final java.lang.String EXTRA_PROGRESS_TRACKER_ICON = "android.progressTrackerIcon";
    public static final java.lang.String EXTRA_REDUCED_IMAGES = "android.reduced.images";
    public static final java.lang.String EXTRA_REMOTE_INPUT_DRAFT = "android.remoteInputDraft";
    public static final java.lang.String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final java.lang.String EXTRA_REMOTE_INPUT_HISTORY_ITEMS = "android.remoteInputHistoryItems";
    public static final java.lang.String EXTRA_REQUEST_PROMOTED_ONGOING = "android.requestPromotedOngoing";
    public static final java.lang.String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final java.lang.String EXTRA_SHORT_CRITICAL_TEXT = "android.shortCriticalText";
    public static final java.lang.String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final java.lang.String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final java.lang.String EXTRA_SHOW_REMOTE_INPUT_SPINNER = "android.remoteInputSpinner";
    public static final java.lang.String EXTRA_SHOW_WHEN = "android.showWhen";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SMALL_ICON = "android.icon";
    public static final java.lang.String EXTRA_STYLED_BY_PROGRESS = "android.styledByProgress";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_SUBSTITUTE_APP_NAME = "android.substName";
    public static final java.lang.String EXTRA_SUB_TEXT = "android.subText";
    public static final java.lang.String EXTRA_SUMMARIZED_CONTENT = "android.summarization";
    public static final java.lang.String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final java.lang.String EXTRA_TEMPLATE = "android.template";
    public static final java.lang.String EXTRA_TEXT = "android.text";
    public static final java.lang.String EXTRA_TEXT_LINES = "android.textLines";
    public static final java.lang.String EXTRA_TITLE = "android.title";
    public static final java.lang.String EXTRA_TITLE_BIG = "android.title.big";
    public static final java.lang.String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    public static final java.lang.String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AGENT_TASK_INTERACTION_HIDE_STATUS_BAR_ICON = 1;
    public static final int FLAG_AGENT_TASK_INTERACTION_SILENT = 2;
    @android.annotation.SystemApi
    public static final int FLAG_AUTOGROUP_SUMMARY = 1024;
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_CAN_COLORIZE = 2048;
    public static final int FLAG_COMPUTER_CONTROL = 524288;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_FSI_REQUESTED_BUT_DENIED = 16384;
    public static final int FLAG_GROUP_SUMMARY = 512;
    @java.lang.Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LIFETIME_EXTENDED_BY_DIRECT_REPLY = 65536;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_NO_DISMISS = 8192;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_PROMOTED_ONGOING = 262144;
    @java.lang.Deprecated
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FLAG_SILENT = 131072;
    public static final int FLAG_USER_INITIATED_JOB = 32768;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    @java.lang.Deprecated
    public static final java.lang.String GROUP_KEY_SILENT = "silent";
    public static final java.lang.String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    private static final int MAX_CHARSEQUENCE_LENGTH = 1024;
    private static final float MAX_LARGE_ICON_ASPECT_RATIO = 1.7777777910232544f;
    private static final int MAX_REPLY_HISTORY = 5;
    private static final java.util.Set<java.lang.Class<? extends android.app.Notification.Style>> PLATFORM_STYLE_CLASSES = null;
    @java.lang.Deprecated
    public static final int PRIORITY_DEFAULT = 0;
    @java.lang.Deprecated
    public static final int PRIORITY_HIGH = 1;
    @java.lang.Deprecated
    public static final int PRIORITY_LOW = -1;
    @java.lang.Deprecated
    public static final int PRIORITY_MAX = 2;
    @java.lang.Deprecated
    public static final int PRIORITY_MIN = -2;
    public static final int PROGRESS_STATE_COMPLETE = 2;
    public static final int PROGRESS_STATE_NONE = 0;
    public static final int PROGRESS_STATE_ONGOING = 1;
    public static final int SEMANTIC_STYLE_CAUTION = 3;
    public static final int SEMANTIC_STYLE_DANGER = 4;
    public static final int SEMANTIC_STYLE_INFO = 1;
    public static final int SEMANTIC_STYLE_SAFE = 2;
    public static final int SEMANTIC_STYLE_UNSPECIFIED = 0;
    @java.lang.Deprecated
    public static final int STREAM_DEFAULT = -1;
    private static final java.lang.String TAG = "Notification";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;
    static final long WEARABLE_EXTENDER_BACKGROUND_BLOCKED = 270551184L;
    public static android.os.IBinder processAllowlistToken;
    public static java.util.function.LongSupplier sElapsedRealtimeClock;
    public static java.time.InstantSource sSystemClock;
    public android.app.Notification.Action[] actions;
    public android.util.ArraySet<android.app.PendingIntent> allPendingIntents;
    @java.lang.Deprecated
    public android.media.AudioAttributes audioAttributes;
    @java.lang.Deprecated
    public int audioStreamType;
    @java.lang.Deprecated
    public android.widget.RemoteViews bigContentView;
    public java.lang.String category;
    public int color;
    public android.app.PendingIntent contentIntent;
    @java.lang.Deprecated
    public android.widget.RemoteViews contentView;
    public long creationTime;
    @java.lang.Deprecated
    public int defaults;
    public android.app.PendingIntent deleteIntent;
    public android.os.Bundle extras;
    public int flags;
    public android.app.PendingIntent fullScreenIntent;
    @java.lang.Deprecated
    public android.widget.RemoteViews headsUpContentView;
    @java.lang.Deprecated
    public int icon;
    public int iconLevel;
    @java.lang.Deprecated
    public android.graphics.Bitmap largeIcon;
    @java.lang.Deprecated
    public int ledARGB;
    @java.lang.Deprecated
    public int ledOffMS;
    @java.lang.Deprecated
    public int ledOnMS;
    private int mAgentInteractionFlags;
    private boolean mAllowSystemGeneratedContextualActions;
    private android.os.IBinder mAllowlistToken;
    private int mBadgeIcon;
    private android.app.Notification.BridgedNotificationMetadata mBridgedNotificationMetadata;
    private android.app.Notification.BubbleMetadata mBubbleMetadata;
    private java.lang.String mChannelId;
    private int mFgsDeferBehavior;
    private int mGroupAlertBehavior;
    private java.lang.String mGroupKey;
    private android.graphics.drawable.Icon mLargeIcon;
    private android.content.LocusId mLocusId;
    private java.lang.CharSequence mSettingsText;
    private java.lang.String mShortcutId;
    private android.graphics.drawable.Icon mSmallIcon;
    private java.lang.String mSortKey;
    private long mTimeout;
    private boolean mUsesStandardHeader;
    public int number;
    @java.lang.Deprecated
    public int priority;
    public android.app.Notification publicVersion;
    @java.lang.Deprecated
    public android.net.Uri sound;
    public java.lang.CharSequence tickerText;
    @java.lang.Deprecated
    public android.widget.RemoteViews tickerView;
    @java.lang.Deprecated
    public long[] vibrate;
    public int visibility;
    public long when;
    public Notification() {}
    @java.lang.Deprecated
    public Notification(int p0, java.lang.CharSequence p1, long p2) {}
    public Notification(android.content.Context p0, int p1, java.lang.CharSequence p2, long p3, java.lang.CharSequence p4, java.lang.CharSequence p5, android.content.Intent p6) {}
    public Notification(android.os.Parcel p0) {}
    public static void addFieldsFromContext(android.content.Context p0, android.app.Notification p1) {}
    public static void addFieldsFromContext(android.content.pm.ApplicationInfo p0, android.app.Notification p1) {}
    public static boolean areActionsVisiblyDifferent(android.app.Notification p0, android.app.Notification p1) { return false; }
    public static boolean areIconsDifferent(android.app.Notification p0, android.app.Notification p1) { return false; }
    private static boolean areIconsMaybeDifferent(android.graphics.drawable.Icon p0, android.graphics.drawable.Icon p1) { return false; }
    public static boolean areRemoteViewsChanged(android.app.Notification.Builder p0, android.app.Notification.Builder p1) { return false; }
    private static boolean areRemoteViewsChanged(android.widget.RemoteViews p0, android.widget.RemoteViews p1) { return false; }
    public static boolean areStyledNotificationsVisiblyDifferent(android.app.Notification.Builder p0, android.app.Notification.Builder p1) { return false; }
    private static void buildCustomContentIntoTemplate(android.content.Context p0, android.widget.RemoteViews p1, android.widget.RemoteViews p2, android.app.Notification.StandardTemplateParams p3, android.app.Notification.TemplateBindResult p4) {}
    public static android.text.Annotation createSemanticStyleAnnotation(int p0) { return null; }
    public static java.lang.String defaultsToString(int p0) { return null; }
    private void fixDuplicateExtra(android.os.Parcelable p0, java.lang.String p1) {}
    private void fixDuplicateExtras() {}
    public static java.lang.String flagsToString(int p0) { return null; }
    private android.content.pm.ApplicationInfo getApplicationInfo(android.content.Context p0) { return null; }
    private android.app.Notification.BasicCompactContent getDefaultCompactContent(android.content.Context p0, android.app.Notification.Builder p1) { return null; }
    private static android.graphics.drawable.Drawable getDefaultProfileBadgeDrawable(android.content.Context p0) { return null; }
    private static java.util.function.LongSupplier getElapsedRealtimeClock() { return null; }
    public static java.lang.Class<? extends android.app.Notification.Style> getNotificationStyleClass(java.lang.String p0) { return null; }
    private static <T extends android.os.Parcelable> T[] getParcelableArrayFromBundle(android.os.Bundle p0, java.lang.String p1, java.lang.Class<T> p2) { return null; }
    public static android.graphics.Bitmap getProfileBadge(android.content.Context p0) { return null; }
    private static android.graphics.drawable.Drawable getProfileBadgeDrawable(android.content.Context p0) { return null; }
    private static java.time.InstantSource getSystemClock() { return null; }
    private static java.time.LocalDate getToday() { return null; }
    private static java.lang.String getUpdatableProfileBadgeId(android.content.Context p0) { return null; }
    private boolean hasLargeIcon() { return false; }
    private static boolean isPlatformStyle(android.app.Notification.Style p0) { return false; }
    private static boolean isStandardLayout(int p0) { return false; }
    private static java.lang.CharSequence normalizeBigText(java.lang.CharSequence p0) { return null; }
    public static java.lang.String priorityToString(int p0) { return null; }
    private void readFromParcelImpl(android.os.Parcel p0) {}
    private static java.lang.CharSequence removeTextSizeSpans(java.lang.CharSequence p0) { return null; }
    public static java.lang.CharSequence safeCharSequence(java.lang.CharSequence p0) { return null; }
    public static java.lang.String safeCharSequenceToString(java.lang.CharSequence p0) { return null; }
    public static java.lang.String safeString(java.lang.String p0) { return null; }
    private static java.lang.Integer semanticAnnotationToColor(android.text.Annotation p0, android.app.Notification.SemanticColors p1) { return null; }
    public static java.lang.Integer semanticStyleToColorRes(int p0) { return null; }
    private static java.lang.CharSequence stripNonStyleSpans(java.lang.CharSequence p0, boolean p1, android.app.Notification.SemanticColors p2) { return null; }
    private static java.lang.CharSequence stripStyling(java.lang.CharSequence p0) { return null; }
    public static java.lang.String visibilityToString(int p0) { return null; }
    private static void visitIconUri(java.util.function.Consumer<android.net.Uri> p0, android.graphics.drawable.Icon p1) {}
    private void writeToParcelImpl(android.os.Parcel p0, int p1) {}
    public android.app.Notification clone() { return null; }
    public void cloneInto(android.app.Notification p0, boolean p1) {}
    public boolean containsCustomViews() { return false; }
    public int describeContents() { return 0; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public android.util.Pair<android.app.RemoteInput, android.app.Notification.Action> findRemoteInputActionPair(boolean p0) { return null; }
    public void fixSilentGroup() {}
    public int getAgentInteractionFlags() { return 0; }
    public boolean getAllowSystemGeneratedContextualActions() { return false; }
    public android.os.IBinder getAllowlistToken() { return null; }
    public int getBadgeIconType() { return 0; }
    public android.app.Notification.BridgedNotificationMetadata getBridgedNotificationMetadata() { return null; }
    public android.app.Notification.BubbleMetadata getBubbleMetadata() { return null; }
    @java.lang.Deprecated
    public java.lang.String getChannel() { return null; }
    public java.lang.String getChannelId() { return null; }
    public java.util.List<android.app.Notification.Action> getContextualActions() { return null; }
    public java.lang.String getGroup() { return null; }
    public int getGroupAlertBehavior() { return 0; }
    public java.lang.String getHistoryText(android.content.Context p0) { return null; }
    public java.lang.String getHistoryTitle(android.content.Context p0) { return null; }
    public android.graphics.drawable.Icon getLargeIcon() { return null; }
    public android.content.LocusId getLocusId() { return null; }
    public java.lang.Class<? extends android.app.Notification.Style> getNotificationStyle() { return null; }
    public int getProgressState() { return 0; }
    public android.app.RemoteInputHistoryItem[] getRemoteInputHistoryItems() { return null; }
    public java.lang.CharSequence getSettingsText() { return null; }
    public java.lang.String getShortCriticalText() { return null; }
    public java.lang.String getShortcutId() { return null; }
    public android.graphics.drawable.Icon getSmallIcon() { return null; }
    public java.lang.String getSortKey() { return null; }
    public java.lang.CharSequence getSummarizedContent() { return null; }
    @java.lang.Deprecated
    public long getTimeout() { return 0L; }
    public long getTimeoutAfter() { return 0L; }
    public long getWhen() { return 0L; }
    public boolean hasAppProvidedWhen() { return false; }
    public boolean hasColorizedPermission() { return false; }
    public boolean hasFlag(int p0) { return false; }
    public boolean hasImage() { return false; }
    public boolean hasPromotableCharacteristics() { return false; }
    public boolean hasPromotableStyle() { return false; }
    public boolean hasSummarizedContent() { return false; }
    public boolean hasTitle() { return false; }
    public boolean isBridged() { return false; }
    public boolean isBubbleNotification() { return false; }
    public boolean isColorized() { return false; }
    public boolean isColorizedRequested() { return false; }
    public boolean isComputerControl() { return false; }
    public java.lang.Boolean isCustomNotification() { return null; }
    public boolean isFgsOrUij() { return false; }
    public boolean isForegroundDisplayForceDeferred() { return false; }
    public boolean isForegroundService() { return false; }
    public boolean isGroupChild() { return false; }
    public boolean isGroupSummary() { return false; }
    public boolean isMediaNotification() { return false; }
    public boolean isOngoingEvent() { return false; }
    public boolean isPromotedOngoing() { return false; }
    public boolean isRequestPromotedOngoing() { return false; }
    public boolean isSilent() { return false; }
    public boolean isStyle(java.lang.Class<? extends android.app.Notification.Style> p0) { return false; }
    public boolean isUserInitiatedJob() { return false; }
    public final void lightenPayload() {}
    public java.lang.String loadHeaderAppName(android.content.Context p0) { return null; }
    public void offloadRemoteViewBitmaps(java.util.function.Function<android.graphics.Bitmap, android.net.Uri> p0) {}
    public void overrideAllowlistToken(android.os.IBinder p0) {}
    public void reduceImageSizes(android.content.Context p0) {}
    public void removeBridgedNotificationMetadata() {}
    public android.app.Notification.ResolvedCompactContent resolveCompactContent(android.content.Context p0) { return null; }
    public void setBubbleMetadata(android.app.Notification.BubbleMetadata p0) {}
    public void setGroupAlertBehavior(int p0) {}
    @java.lang.Deprecated
    public void setLatestEventInfo(android.content.Context p0, java.lang.CharSequence p1, java.lang.CharSequence p2, android.app.PendingIntent p3) {}
    public void setSmallIcon(android.graphics.drawable.Icon p0) {}
    public void setTimeoutAfter(long p0) {}
    public boolean shouldShowForegroundImmediately() { return false; }
    public boolean showsChronometer() { return false; }
    public boolean showsTime() { return false; }
    public boolean supportsSummarization() { return false; }
    public boolean suppressAlertingDueToGrouping() { return false; }
    public java.lang.String toString() { return null; }
    public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Action implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.Notification.Action> CREATOR = null;
        public static final int EMPHASIS_AUTO = 0;
        public static final int EMPHASIS_PRIMARY = 1;
        public static final int EMPHASIS_SECONDARY = 2;
        public static final java.lang.String EXTRA_CONTENT_DESCRIPTION = "android.extra.CONTENT_DESCRIPTION";
        private static final java.lang.String EXTRA_DATA_ONLY_INPUTS = "android.extra.DATA_ONLY_INPUTS";
        @android.annotation.SystemApi
        public static final java.lang.String EXTRA_IS_ANIMATED = "android.extra.IS_ANIMATED";
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        @android.annotation.SystemApi
        public static final int SEMANTIC_ACTION_CONVERSATION_IS_PHISHING = 12;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        @android.annotation.SystemApi
        public static final int SEMANTIC_ACTION_MARK_CONVERSATION_AS_PRIORITY = 11;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_PAUSE = 14;
        public static final int SEMANTIC_ACTION_PLAY = 13;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_STOP = 15;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;
        public static final int STYLE_AUTO = 0;
        public static final int STYLE_ICON_AND_TEXT = 2;
        public static final int STYLE_ICON_ONLY = 3;
        public static final int STYLE_TEXT_ONLY = 1;
        public android.app.PendingIntent actionIntent;
        @java.lang.Deprecated
        public int icon;
        private boolean mAllowGeneratedReplies;
        private final boolean mAuthenticationRequired = false;
        private final int mEmphasisHint = 0;
        private final android.os.Bundle mExtras = null;
        private android.graphics.drawable.Icon mIcon;
        private final boolean mIsContextual = false;
        private final android.app.RemoteInput[] mRemoteInputs = null;
        private final int mSemanticAction = 0;
        private final int mStyleHint = 0;
        public java.lang.CharSequence title;
        @java.lang.Deprecated
        public Action(int p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
        private Action(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, android.app.PendingIntent p2, android.os.Bundle p3, android.app.RemoteInput[] p4, boolean p5, int p6, boolean p7, int p8, int p9, boolean p10) {}
        private Action(android.os.Parcel p0) {}
        private void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
        public android.app.Notification.Action clone() { return null; }
        public int describeContents() { return 0; }
        public boolean getAllowGeneratedReplies() { return false; }
        public android.app.RemoteInput[] getDataOnlyRemoteInputs() { return null; }
        public int getEmphasisHint() { return 0; }
        public android.os.Bundle getExtras() { return null; }
        public android.graphics.drawable.Icon getIcon() { return null; }
        public android.app.RemoteInput[] getRemoteInputs() { return null; }
        public int getSemanticAction() { return 0; }
        public int getStyleHint() { return 0; }
        public boolean isAuthenticationRequired() { return false; }
        public boolean isContextual() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private boolean mAllowGeneratedReplies;
            private boolean mAuthenticationRequired;
            private int mEmphasisHint;
            private final android.os.Bundle mExtras = null;
            private final android.graphics.drawable.Icon mIcon = null;
            private final android.app.PendingIntent mIntent = null;
            private boolean mIsContextual;
            private java.util.ArrayList<android.app.RemoteInput> mRemoteInputs;
            private int mSemanticAction;
            private int mStyleHint;
            private final java.lang.CharSequence mTitle = null;
            @java.lang.Deprecated
            public Builder(int p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
            public Builder(android.app.Notification.Action p0) {}
            public Builder(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
            private Builder(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, android.app.PendingIntent p2, android.os.Bundle p3, android.app.RemoteInput[] p4, boolean p5, int p6, boolean p7, int p8, int p9, boolean p10) {}
            private void checkContextualActionNullFields() {}
            public android.app.Notification.Action.Builder addExtras(android.os.Bundle p0) { return null; }
            public android.app.Notification.Action.Builder addRemoteInput(android.app.RemoteInput p0) { return null; }
            public android.app.Notification.Action build() { return null; }
            public android.app.Notification.Action.Builder extend(android.app.Notification.Action.Extender p0) { return null; }
            public android.os.Bundle getExtras() { return null; }
            public android.app.Notification.Action.Builder setAllowGeneratedReplies(boolean p0) { return null; }
            public android.app.Notification.Action.Builder setAuthenticationRequired(boolean p0) { return null; }
            public android.app.Notification.Action.Builder setContextual(boolean p0) { return null; }
            public android.app.Notification.Action.Builder setEmphasisHint(int p0) { return null; }
            public android.app.Notification.Action.Builder setSemanticAction(int p0) { return null; }
            public android.app.Notification.Action.Builder setStyleHint(int p0) { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Emphasis {
        }

        public static interface Extender {
            public android.app.Notification.Action.Builder extend(android.app.Notification.Action.Builder p0);
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SemanticAction {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Style {
        }

        public static final class WearableExtender implements android.app.Notification.Action.Extender {
            private static final int DEFAULT_FLAGS = 1;
            private static final java.lang.String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
            private static final int FLAG_AVAILABLE_OFFLINE = 1;
            private static final int FLAG_HINT_DISPLAY_INLINE = 4;
            private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
            private static final java.lang.String KEY_CANCEL_LABEL = "cancelLabel";
            private static final java.lang.String KEY_CONFIRM_LABEL = "confirmLabel";
            private static final java.lang.String KEY_FLAGS = "flags";
            private static final java.lang.String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
            private java.lang.CharSequence mCancelLabel;
            private java.lang.CharSequence mConfirmLabel;
            private int mFlags;
            private java.lang.CharSequence mInProgressLabel;
            public WearableExtender() {}
            public WearableExtender(android.app.Notification.Action p0) {}
            private void setFlag(int p0, boolean p1) {}
            public android.app.Notification.Action.WearableExtender clone() { return null; }
            public android.app.Notification.Action.Builder extend(android.app.Notification.Action.Builder p0) { return null; }
            @java.lang.Deprecated
            public java.lang.CharSequence getCancelLabel() { return null; }
            @java.lang.Deprecated
            public java.lang.CharSequence getConfirmLabel() { return null; }
            public boolean getHintDisplayActionInline() { return false; }
            public boolean getHintLaunchesActivity() { return false; }
            @java.lang.Deprecated
            public java.lang.CharSequence getInProgressLabel() { return null; }
            public boolean isAvailableOffline() { return false; }
            public android.app.Notification.Action.WearableExtender setAvailableOffline(boolean p0) { return null; }
            @java.lang.Deprecated
            public android.app.Notification.Action.WearableExtender setCancelLabel(java.lang.CharSequence p0) { return null; }
            @java.lang.Deprecated
            public android.app.Notification.Action.WearableExtender setConfirmLabel(java.lang.CharSequence p0) { return null; }
            public android.app.Notification.Action.WearableExtender setHintDisplayActionInline(boolean p0) { return null; }
            public android.app.Notification.Action.WearableExtender setHintLaunchesActivity(boolean p0) { return null; }
            @java.lang.Deprecated
            public android.app.Notification.Action.WearableExtender setInProgressLabel(java.lang.CharSequence p0) { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AgentTaskInteractionFlag {
    }

    public static final class BasicCompactContent extends android.app.Notification.CompactContent implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.Notification.BasicCompactContent> CREATOR = null;
        private final android.app.Notification.CompactIcon mIcon = null;
        private int mSemanticStyle;
        private final android.app.Notification.CompactText mText = null;
        public BasicCompactContent(android.app.Notification.CompactIcon p0, android.app.Notification.CompactText p1) { super(); }
        public BasicCompactContent(android.app.Notification.CompactText p0) { super(); }
        private android.app.Notification.CompactIcon getIcon() { return null; }
        private int getSemanticStyle() { return 0; }
        private android.app.Notification.CompactText getText() { return null; }
        public int describeContents() { return 0; }
        public android.app.Notification.BasicCompactContent setSemanticStyle(int p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class BigPictureStyle extends android.app.Notification.Style {
        public static final int MIN_ASHMEM_BITMAP_SIZE = 131072;
        private android.graphics.drawable.Icon mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private java.lang.CharSequence mPictureContentDescription;
        private android.graphics.drawable.Icon mPictureIcon;
        private boolean mShowBigPictureWhenCollapsed;
        public BigPictureStyle() { super(); }
        @java.lang.Deprecated
        public BigPictureStyle(android.app.Notification.Builder p0) { super(); }
        public static android.graphics.drawable.Icon getPictureIcon(android.os.Bundle p0) { return null; }
        public void addExtras(android.os.Bundle p0) {}
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        public android.app.Notification.BigPictureStyle bigLargeIcon(android.graphics.Bitmap p0) { return null; }
        public android.app.Notification.BigPictureStyle bigLargeIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.app.Notification.BigPictureStyle bigPicture(android.graphics.Bitmap p0) { return null; }
        public android.app.Notification.BigPictureStyle bigPicture(android.graphics.drawable.Icon p0) { return null; }
        public android.graphics.drawable.Icon getBigPicture() { return null; }
        public boolean hasSummaryInHeader() { return false; }
        public android.widget.RemoteViews makeContentView() { return null; }
        public android.widget.RemoteViews makeExpandedContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView() { return null; }
        public void reduceImageSizes(android.content.Context p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public android.app.Notification.BigPictureStyle setBigContentTitle(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.BigPictureStyle setContentDescription(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.BigPictureStyle setSummaryText(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.BigPictureStyle showBigPictureWhenCollapsed(boolean p0) { return null; }
    }

    public static class BigTextStyle extends android.app.Notification.Style {
        private java.lang.CharSequence mBigText;
        public BigTextStyle() { super(); }
        @java.lang.Deprecated
        public BigTextStyle(android.app.Notification.Builder p0) { super(); }
        public void addExtras(android.os.Bundle p0) {}
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        public android.app.Notification.BigTextStyle bigText(java.lang.CharSequence p0) { return null; }
        public java.lang.CharSequence getBigText() { return null; }
        public java.lang.CharSequence getHistoryText(android.content.Context p0) { return null; }
        public android.widget.RemoteViews makeExpandedContentView() { return null; }
        public void reduceImageSizes(android.content.Context p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public android.app.Notification.BigTextStyle setBigContentTitle(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.BigTextStyle setSummaryText(java.lang.CharSequence p0) { return null; }
    }

    public static final class BridgedNotificationMetadata implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.Notification.BridgedNotificationMetadata> CREATOR = null;
        private android.graphics.drawable.Icon mAppIcon;
        private java.lang.String mChannelId;
        private java.lang.String mOriginDeviceName;
        private java.lang.String mPackageName;
        private BridgedNotificationMetadata(android.os.Parcel p0) {}
        public BridgedNotificationMetadata(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.graphics.drawable.Icon p3) {}
        public int describeContents() { return 0; }
        public android.graphics.drawable.Icon getAppIcon() { return null; }
        public java.lang.String getChannelId() { return null; }
        public java.lang.String getOriginDeviceName() { return null; }
        public java.lang.String getPackageName() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class BubbleMetadata implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.Notification.BubbleMetadata> CREATOR = null;
        public static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
        public static final int FLAG_SUPPRESSABLE_BUBBLE = 4;
        public static final int FLAG_SUPPRESS_BUBBLE = 8;
        public static final int FLAG_SUPPRESS_NOTIFICATION = 2;
        private android.app.PendingIntent mDeleteIntent;
        private int mDesiredHeight;
        private int mDesiredHeightResId;
        private int mFlags;
        private android.graphics.drawable.Icon mIcon;
        private android.app.PendingIntent mPendingIntent;
        private java.lang.String mShortcutId;
        private BubbleMetadata(android.app.PendingIntent p0, android.app.PendingIntent p1, android.graphics.drawable.Icon p2, int p3, int p4, java.lang.String p5) {}
        private BubbleMetadata(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean getAutoExpandBubble() { return false; }
        public android.app.PendingIntent getDeleteIntent() { return null; }
        public int getDesiredHeight() { return 0; }
        public int getDesiredHeightResId() { return 0; }
        public int getFlags() { return 0; }
        public android.graphics.drawable.Icon getIcon() { return null; }
        public android.app.PendingIntent getIntent() { return null; }
        public java.lang.String getShortcutId() { return null; }
        public boolean isBubbleSuppressable() { return false; }
        public boolean isBubbleSuppressed() { return false; }
        public boolean isNotificationSuppressed() { return false; }
        public void setFlags(int p0) {}
        public void setSuppressBubble(boolean p0) {}
        public void setSuppressNotification(boolean p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private android.app.PendingIntent mDeleteIntent;
            private int mDesiredHeight;
            private int mDesiredHeightResId;
            private int mFlags;
            private android.graphics.drawable.Icon mIcon;
            private android.app.PendingIntent mPendingIntent;
            private java.lang.String mShortcutId;
            @java.lang.Deprecated
            public Builder() {}
            public Builder(android.app.PendingIntent p0, android.graphics.drawable.Icon p1) {}
            public Builder(java.lang.String p0) {}
            public android.app.Notification.BubbleMetadata build() { return null; }
            public android.app.Notification.BubbleMetadata.Builder setAutoExpandBubble(boolean p0) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setDeleteIntent(android.app.PendingIntent p0) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setDesiredHeight(int p0) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setDesiredHeightResId(int p0) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setFlag(int p0, boolean p1) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setIntent(android.app.PendingIntent p0) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setSuppressNotification(boolean p0) { return null; }
            public android.app.Notification.BubbleMetadata.Builder setSuppressableBubble(boolean p0) { return null; }
        }
    }

    public static class Builder {
        public static final java.lang.String EXTRA_REBUILD_BIG_CONTENT_VIEW_ACTION_COUNT = "android.rebuild.bigViewActionCount";
        public static final java.lang.String EXTRA_REBUILD_CONTENT_VIEW_ACTION_COUNT = "android.rebuild.contentViewActionCount";
        public static final java.lang.String EXTRA_REBUILD_HEADS_UP_CONTENT_VIEW_ACTION_COUNT = "android.rebuild.hudViewActionCount";
        private static final boolean USE_ONLY_TITLE_IN_LOW_PRIORITY_SUMMARY = Boolean.valueOf(false);
        private java.util.ArrayList<android.app.Notification.Action> mActions;
        private com.android.internal.util.ContrastColorUtil mColorUtil;
        android.app.Notification.Colors mColors;
        private android.content.Context mContext;
        private boolean mInNightMode;
        private boolean mIsLegacy;
        private boolean mIsLegacyInitialized;
        private android.app.Notification mN;
        android.app.Notification.StandardTemplateParams mParams;
        private java.util.ArrayList<android.app.Person> mPersonList;
        private android.app.Notification.Style mStyle;
        private boolean mTintActionButtons;
        private android.os.Bundle mUserExtras;
        private android.app.Notification.UserProfileBadgeProvider mUserProfileBadgeProvider;
        @java.lang.Deprecated
        public Builder(android.content.Context p0) {}
        public Builder(android.content.Context p0, android.app.Notification p1) {}
        public Builder(android.content.Context p0, java.lang.String p1) {}
        private void adjustExpandButtonPadding(android.widget.RemoteViews p0, boolean p1) {}
        private android.widget.RemoteViews applyStandardTemplate(int p0, android.app.Notification.StandardTemplateParams p1, android.app.Notification.TemplateBindResult p2) { return null; }
        private android.widget.RemoteViews applyStandardTemplateWithActions(int p0, android.app.Notification.StandardTemplateParams p1, android.app.Notification.TemplateBindResult p2) { return null; }
        private void bindAlertedIcon(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private void bindBridgedIcon(android.widget.RemoteViews p0) {}
        private void bindCloseButton(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private void bindExpandButton(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private boolean bindHeaderAppName(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1, boolean p2, boolean p3) { return false; }
        private void bindHeaderChronometerAndTime(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1, boolean p2) {}
        private void bindHeaderChronometerAndTimeLegacy(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1, boolean p2) {}
        private boolean bindHeaderText(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1, boolean p2) { return false; }
        private boolean bindHeaderTextSecondary(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1, boolean p2) { return false; }
        private void bindLargeIcon(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1, android.app.Notification.TemplateBindResult p2) {}
        private void bindLargeIconAndApplyMargin(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1, android.app.Notification.TemplateBindResult p2) {}
        private void bindNotificationHeader(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private void bindPhishingAlertIcon(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private void bindProfileBadge(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private void bindSmallIcon(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private boolean bindSnoozeAction(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) { return false; }
        private void calculateRightIconDimens(android.graphics.drawable.Icon p0, boolean p1, android.app.Notification.TemplateBindResult p2) {}
        private android.widget.RemoteViews createActionButtonView(android.app.Notification.Builder.ActionButton p0, boolean p1, boolean p2, android.app.Notification.StandardTemplateParams p3) { return null; }
        private android.widget.RemoteViews createExpandedContentView() { return null; }
        private java.lang.CharSequence createSummaryText() { return null; }
        private void displayRemoteInputHistory(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        public static int ensureButtonFillContrast(int p0, int p1) { return 0; }
        private boolean expandedContentViewRequired() { return false; }
        private boolean fullyCustomViewRequiresDecoration(boolean p0) { return false; }
        private int getActionButtonLayoutResource(boolean p0, boolean p1) { return 0; }
        private int getActionLayoutResource() { return 0; }
        private int getActionTombstoneLayoutResource() { return 0; }
        private int getBackgroundColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        private int getBigPictureLayoutResource() { return 0; }
        private int getBigTextLayoutResource() { return 0; }
        private int getCollapsedBaseLayoutResource() { return 0; }
        private int getCollapsedCallLayoutResource() { return 0; }
        private int getCollapsedConversationLayoutResource() { return 0; }
        private int getCollapsedMediaLayoutResource() { return 0; }
        private int getCollapsedMessagingLayoutResource() { return 0; }
        private int getCollapsedMetricLayoutResource() { return 0; }
        private com.android.internal.util.ContrastColorUtil getColorUtil() { return null; }
        private android.app.Notification.Colors getColors(android.app.Notification.StandardTemplateParams p0) { return null; }
        private int getCompactHeadsUpBaseLayoutResource() { return 0; }
        private int getCompactHeadsUpMetricLayoutResource() { return 0; }
        public static int getContentMarginTop(android.content.Context p0, int p1) { return 0; }
        private static int getDisabledActionColor(android.content.Context p0, int p1) { return 0; }
        private android.app.Notification.Builder.ActionButtons getEffectiveActions() { return null; }
        private int getEmphasizedActionLayoutResource() { return 0; }
        private int getEmphasizedTombstoneActionLayoutResource() { return 0; }
        private int getExpandedBaseLayoutResource() { return 0; }
        private int getExpandedCallLayoutResource() { return 0; }
        private int getExpandedConversationLayoutResource() { return 0; }
        private int getExpandedMediaLayoutResource() { return 0; }
        private int getExpandedMessagingLayoutResource() { return 0; }
        private int getExpandedMetricLayoutResource() { return 0; }
        private int getExpandedSingleMetricLayoutResource() { return 0; }
        public static java.lang.Integer getFullLengthSpanColor(java.lang.CharSequence p0, android.app.Notification.SemanticColors p1) { return null; }
        private int getHeaderLayoutResource() { return 0; }
        private int getHeadsUpBaseLayoutResource() { return 0; }
        private int getHeadsUpMetricLayoutResource() { return 0; }
        private int getInboxLayoutResource() { return 0; }
        private int getMessagingCompactHeadsUpLayoutResource() { return 0; }
        private int getPrimaryAccentColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        private int getProgressLayoutResource() { return 0; }
        private int getPromotedProgressLayoutResource() { return 0; }
        private int getPromotedSingleMetricLayoutResource() { return 0; }
        private int getSmallIconColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        private int getStandardActionColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        private boolean handleProgressBar(android.widget.RemoteViews p0, android.os.Bundle p1, android.app.Notification.StandardTemplateParams p2) { return false; }
        private boolean hasNormalProgress() { return false; }
        private boolean hasValidRemoteInput(android.app.Notification.Action p0) { return false; }
        private boolean isBackgroundColorized(android.app.Notification.StandardTemplateParams p0) { return false; }
        private boolean isCallActionColorCustomizable() { return false; }
        private boolean isLegacy() { return false; }
        private boolean isSnoozeSettingEnabled() { return false; }
        private boolean isTimeInTheFuture() { return false; }
        public static void makeHeaderExpanded(android.widget.RemoteViews p0) {}
        private android.widget.RemoteViews makeNotificationHeader(android.app.Notification.StandardTemplateParams p0) { return null; }
        public static android.app.Notification maybeCloneStrippedForDelivery(android.app.Notification p0) { return null; }
        private android.widget.RemoteViews minimallyDecoratedContentView(android.widget.RemoteViews p0) { return null; }
        private android.widget.RemoteViews minimallyDecoratedExpandedContentView(android.widget.RemoteViews p0) { return null; }
        private android.widget.RemoteViews minimallyDecoratedHeadsUpContentView(android.widget.RemoteViews p0) { return null; }
        private boolean populateActionsContainer(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1, android.app.Notification.Builder.ActionButtons p2) { return false; }
        private void processLargeLegacyIcon(android.graphics.drawable.Icon p0, android.widget.RemoteViews p1, android.app.Notification.StandardTemplateParams p2) {}
        private java.lang.CharSequence processLegacyText(java.lang.CharSequence p0) { return null; }
        private void processSmallIconColor(android.graphics.drawable.Icon p0, android.widget.RemoteViews p1, android.app.Notification.StandardTemplateParams p2) {}
        public static android.app.Notification.Builder recoverBuilder(android.content.Context p0, android.app.Notification p1) { return null; }
        public static android.app.Notification.Style recoverStyle(android.app.Notification p0) { return null; }
        private void resetNotificationHeader(android.widget.RemoteViews p0) {}
        private void resetStandardTemplate(android.widget.RemoteViews p0) {}
        private void resetStandardTemplateWithActions(android.widget.RemoteViews p0) {}
        private android.app.Notification.Builder.EmphasizedButtonColors resolveEmphasisColors(android.app.Notification.Action p0, android.app.Notification.StandardTemplateParams p1, boolean p2, boolean p3) { return null; }
        private void sanitizeColor() {}
        private static int setAlphaComponentByFloatDimen(android.content.Context p0, int p1, int p2) { return 0; }
        private void setTextColor(android.widget.RemoteViews p0, int p1, android.app.Notification.StandardTemplateParams p2) {}
        private boolean shouldCenterTopLine(android.app.Notification.StandardTemplateParams p0) { return false; }
        private boolean showsTimeOrChronometer(android.app.Notification.StandardTemplateParams p0) { return false; }
        private java.lang.CharSequence stripUnwantedSpans(java.lang.CharSequence p0, android.app.Notification.StandardTemplateParams p1) { return null; }
        private boolean styleDisplaysCustomViewInline() { return false; }
        private boolean textColorsNeedInversion() { return false; }
        private void updateBackgroundColor(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private static void updateExpanderAlignment(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1, boolean p2) {}
        private void updateHeaderBackgroundColor(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private void updateMarginsForActions(android.widget.RemoteViews p0, boolean p1) {}
        private void updateToplineCentering(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private boolean useExistingRemoteView(android.widget.RemoteViews p0) { return false; }
        @java.lang.Deprecated
        public android.app.Notification.Builder addAction(int p0, java.lang.CharSequence p1, android.app.PendingIntent p2) { return null; }
        public android.app.Notification.Builder addAction(android.app.Notification.Action p0) { return null; }
        public android.app.Notification.Builder addExtras(android.os.Bundle p0) { return null; }
        public android.app.Notification.Builder addPerson(android.app.Person p0) { return null; }
        public android.app.Notification.Builder addPerson(java.lang.String p0) { return null; }
        public android.app.Notification build() { return null; }
        public android.app.Notification buildInto(android.app.Notification p0) { return null; }
        public android.app.Notification buildUnstyled() { return null; }
        @java.lang.Deprecated
        public android.widget.RemoteViews createBigContentView() { return null; }
        public android.widget.RemoteViews createCompactHeadsUpContentView() { return null; }
        @java.lang.Deprecated
        public android.widget.RemoteViews createContentView() { return null; }
        @java.lang.Deprecated
        public android.widget.RemoteViews createHeadsUpContentView() { return null; }
        public android.app.Notification.Builder extend(android.app.Notification.Extender p0) { return null; }
        public int getBackgroundColor(boolean p0) { return 0; }
        public android.app.Notification.Colors getColors(boolean p0) { return null; }
        public android.os.Bundle getExtras() { return null; }
        public java.lang.CharSequence getHeadsUpStatusBarText(boolean p0) { return null; }
        int getLargeIconMarginEnd(android.app.Notification.StandardTemplateParams p0) { return 0; }
        @java.lang.Deprecated
        public android.app.Notification getNotification() { return null; }
        public android.graphics.Bitmap getProfileBadge() { return null; }
        public int getSmallIconColor(boolean p0) { return 0; }
        public android.app.Notification.Style getStyle() { return null; }
        public int getTextColor(android.app.Notification.StandardTemplateParams p0) { return 0; }
        final boolean hasHeaderText(android.app.Notification.StandardTemplateParams p0) { return false; }
        public java.lang.String loadHeaderAppName() { return null; }
        public android.widget.RemoteViews makeLowPriorityContentView(boolean p0) { return null; }
        public android.widget.RemoteViews makeNotificationGroupHeader() { return null; }
        public android.widget.RemoteViews makePublicContentView(boolean p0) { return null; }
        public android.app.Notification.Builder setActions(android.app.Notification.Action... p0) { return null; }
        public android.app.Notification.Builder setAgentInteractionFlags(int p0) { return null; }
        public android.app.Notification.Builder setAllowSystemGeneratedContextualActions(boolean p0) { return null; }
        public android.app.Notification.Builder setAutoCancel(boolean p0) { return null; }
        public android.app.Notification.Builder setBadgeIconType(int p0) { return null; }
        @android.annotation.SystemApi
        public android.app.Notification.Builder setBridgedNotificationMetadata(android.app.Notification.BridgedNotificationMetadata p0) { return null; }
        public android.app.Notification.Builder setBubbleMetadata(android.app.Notification.BubbleMetadata p0) { return null; }
        public android.app.Notification.Builder setCategory(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setChannel(java.lang.String p0) { return null; }
        public android.app.Notification.Builder setChannelId(java.lang.String p0) { return null; }
        public android.app.Notification.Builder setChronometerCountDown(boolean p0) { return null; }
        public android.app.Notification.Builder setColor(int p0) { return null; }
        public android.app.Notification.Builder setColorized(boolean p0) { return null; }
        public android.app.Notification.Builder setCompactContent(android.app.Notification.CompactContent p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setContent(android.widget.RemoteViews p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setContentInfo(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.Builder setContentIntent(android.app.PendingIntent p0) { return null; }
        public android.app.Notification.Builder setContentText(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.Builder setContentTitle(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.Builder setCustomBigContentView(android.widget.RemoteViews p0) { return null; }
        public android.app.Notification.Builder setCustomContentView(android.widget.RemoteViews p0) { return null; }
        public android.app.Notification.Builder setCustomHeadsUpContentView(android.widget.RemoteViews p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setDefaults(int p0) { return null; }
        public android.app.Notification.Builder setDeleteIntent(android.app.PendingIntent p0) { return null; }
        public android.app.Notification.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.app.Notification.Builder setFlag(int p0, boolean p1) { return null; }
        public android.app.Notification.Builder setForegroundServiceBehavior(int p0) { return null; }
        public android.app.Notification.Builder setFullScreenIntent(android.app.PendingIntent p0, boolean p1) { return null; }
        public android.app.Notification.Builder setGroup(java.lang.String p0) { return null; }
        public android.app.Notification.Builder setGroupAlertBehavior(int p0) { return null; }
        public android.app.Notification.Builder setGroupSummary(boolean p0) { return null; }
        public android.app.Notification.Builder setHasSummarizedContent(boolean p0) { return null; }
        public android.app.Notification.Builder setHideSmartReplies(boolean p0) { return null; }
        public android.app.Notification.Builder setLargeIcon(android.graphics.Bitmap p0) { return null; }
        public android.app.Notification.Builder setLargeIcon(android.graphics.drawable.Icon p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setLights(int p0, int p1, int p2) { return null; }
        public android.app.Notification.Builder setLocalOnly(boolean p0) { return null; }
        public android.app.Notification.Builder setLocusId(android.content.LocusId p0) { return null; }
        public android.app.Notification.Builder setNumber(int p0) { return null; }
        public android.app.Notification.Builder setOngoing(boolean p0) { return null; }
        public android.app.Notification.Builder setOnlyAlertOnce(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setPriority(int p0) { return null; }
        public android.app.Notification.Builder setProgress(int p0, int p1, boolean p2) { return null; }
        public android.app.Notification.Builder setPublicVersion(android.app.Notification p0) { return null; }
        public android.app.Notification.Builder setRemoteInputHistory(android.app.RemoteInputHistoryItem[] p0) { return null; }
        public android.app.Notification.Builder setRemoteInputHistory(java.lang.CharSequence[] p0) { return null; }
        public android.app.Notification.Builder setRequestPromotedOngoing(boolean p0) { return null; }
        public android.app.Notification.Builder setSettingsText(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.Builder setShortCriticalText(java.lang.String p0) { return null; }
        public android.app.Notification.Builder setShortcutId(java.lang.String p0) { return null; }
        public android.app.Notification.Builder setShowRemoteInputSpinner(boolean p0) { return null; }
        public android.app.Notification.Builder setShowWhen(boolean p0) { return null; }
        public android.app.Notification.Builder setSilent(boolean p0) { return null; }
        public android.app.Notification.Builder setSmallIcon(int p0) { return null; }
        public android.app.Notification.Builder setSmallIcon(int p0, int p1) { return null; }
        public android.app.Notification.Builder setSmallIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.app.Notification.Builder setSortKey(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setSound(android.net.Uri p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setSound(android.net.Uri p0, int p1) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setSound(android.net.Uri p0, android.media.AudioAttributes p1) { return null; }
        public android.app.Notification.Builder setStyle(android.app.Notification.Style p0) { return null; }
        public android.app.Notification.Builder setSubText(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.Builder setSummarizedContent(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.Builder setTicker(java.lang.CharSequence p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setTicker(java.lang.CharSequence p0, android.widget.RemoteViews p1) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setTimeout(long p0) { return null; }
        public android.app.Notification.Builder setTimeoutAfter(long p0) { return null; }
        public android.app.Notification.Builder setUserProfileBadgeProvider(android.app.Notification.UserProfileBadgeProvider p0) { return null; }
        public android.app.Notification.Builder setUsesChronometer(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.Builder setVibrate(long[] p0) { return null; }
        public android.app.Notification.Builder setVisibility(int p0) { return null; }
        public android.app.Notification.Builder setWhen(long p0) { return null; }
        public boolean usesStandardHeader() { return false; }
        public boolean usesTemplate() { return false; }

        private static final class ActionButton {
            private final android.app.Notification.Action action = null;
            private final int originalIndex = 0;
            private ActionButton(android.app.Notification.Action p0, int p1) {}
            public android.app.Notification.Action action() { return null; }
            public final boolean equals(java.lang.Object p0) { return false; }
            public final int hashCode() { return 0; }
            public int originalIndex() { return 0; }
            public final java.lang.String toString() { return null; }
        }

        private static final class ActionButtons {
            private static final android.app.Notification.Builder.ActionButtons EMPTY = null;
            private final java.util.List<android.app.Notification.Builder.ActionButton> actions = null;
            private final boolean edgeToEdge = false;
            private final boolean emphasized = false;
            private final boolean supportCustomColors = false;
            private ActionButtons(java.util.List<android.app.Notification.Builder.ActionButton> p0, boolean p1, boolean p2, boolean p3) {}
            public java.util.List<android.app.Notification.Builder.ActionButton> actions() { return null; }
            public boolean edgeToEdge() { return false; }
            public boolean emphasized() { return false; }
            public final boolean equals(java.lang.Object p0) { return false; }
            public final int hashCode() { return 0; }
            public boolean supportCustomColors() { return false; }
            public final java.lang.String toString() { return null; }
        }

        private static final class EmphasizedButtonColors {
            private final int background = 0;
            private final int outline = 0;
            private final int ripple = 0;
            private final int text = 0;
            private EmphasizedButtonColors(int p0, int p1, int p2, int p3) {}
            public int background() { return 0; }
            public final boolean equals(java.lang.Object p0) { return false; }
            public final int hashCode() { return 0; }
            public int outline() { return 0; }
            public int ripple() { return 0; }
            public int text() { return 0; }
            public final java.lang.String toString() { return null; }
        }
    }

    private static class BuilderRemoteViews extends android.widget.RemoteViews {
        public BuilderRemoteViews(android.content.pm.ApplicationInfo p0, int p1) { super((android.os.Parcel)null); }
        public BuilderRemoteViews(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public android.app.Notification.BuilderRemoteViews clone() { return null; }
        protected boolean shouldUseStaticFilter() { return false; }
    }

    public static class CallStyle extends android.app.Notification.Style {
        public static final int CALL_TYPE_INCOMING = 1;
        public static final int CALL_TYPE_ONGOING = 2;
        public static final int CALL_TYPE_SCREENING = 3;
        public static final int CALL_TYPE_UNKNOWN = 0;
        public static final boolean DEBUG_NEW_ACTION_LAYOUT = true;
        private static final java.lang.String KEY_ACTION_PRIORITY = "key_action_priority";
        private java.lang.Integer mAnswerButtonColor;
        private android.app.PendingIntent mAnswerIntent;
        private int mCallType;
        private java.lang.Integer mDeclineButtonColor;
        private android.app.PendingIntent mDeclineIntent;
        private android.app.PendingIntent mHangUpIntent;
        private boolean mIsVideo;
        private android.app.Person mPerson;
        private android.graphics.drawable.Icon mVerificationIcon;
        private java.lang.CharSequence mVerificationText;
        CallStyle() { super(); }
        private CallStyle(int p0, android.app.Person p1, android.app.PendingIntent p2, android.app.PendingIntent p3, android.app.PendingIntent p4) { super(); }
        private void bindCallerVerification(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1) {}
        private void fixTitleAndTextExtras(android.os.Bundle p0) {}
        public static android.app.Notification.CallStyle forIncomingCall(android.app.Person p0, android.app.PendingIntent p1, android.app.PendingIntent p2) { return null; }
        public static android.app.Notification.CallStyle forOngoingCall(android.app.Person p0, android.app.PendingIntent p1) { return null; }
        public static android.app.Notification.CallStyle forScreeningCall(android.app.Person p0, android.app.PendingIntent p1, android.app.PendingIntent p2) { return null; }
        private java.lang.String getDefaultText() { return null; }
        private boolean isActionAddedByCallStyle(android.app.Notification.Action p0) { return false; }
        private android.app.Notification.Action makeAction(int p0, int p1, java.lang.Integer p2, int p3, android.app.PendingIntent p4) { return null; }
        private android.app.Notification.Action makeAnswerAction() { return null; }
        private android.widget.RemoteViews makeCallLayout(int p0) { return null; }
        private android.app.Notification.Action makeNegativeAction() { return null; }
        public void addExtras(android.os.Bundle p0) {}
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        public android.app.Notification buildStyled(android.app.Notification p0) { return null; }
        public boolean displayCustomViewInline() { return false; }
        public java.util.ArrayList<android.app.Notification.Action> getActionsListWithSystemActions() { return null; }
        public boolean hasSummaryInHeader() { return false; }
        public android.widget.RemoteViews makeCompactHeadsUpContentView() { return null; }
        public android.widget.RemoteViews makeContentView() { return null; }
        public android.widget.RemoteViews makeExpandedContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView() { return null; }
        public void reduceImageSizes(android.content.Context p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public android.app.Notification.CallStyle setAnswerButtonColorHint(int p0) { return null; }
        public android.app.Notification.CallStyle setDeclineButtonColorHint(int p0) { return null; }
        public android.app.Notification.CallStyle setIsVideo(boolean p0) { return null; }
        public android.app.Notification.CallStyle setVerificationIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.app.Notification.CallStyle setVerificationText(java.lang.CharSequence p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CallType {
        }
    }

    public static final class CarExtender implements android.app.Notification.Extender {
        private static final java.lang.String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final java.lang.String EXTRA_COLOR = "app_color";
        private static final java.lang.String EXTRA_CONVERSATION = "car_conversation";
        private static final java.lang.String EXTRA_LARGE_ICON = "large_icon";
        private static final java.lang.String TAG = "CarExtender";
        private int mColor;
        private android.graphics.Bitmap mLargeIcon;
        private android.app.Notification.CarExtender.UnreadConversation mUnreadConversation;
        public CarExtender() {}
        public CarExtender(android.app.Notification p0) {}
        public android.app.Notification.Builder extend(android.app.Notification.Builder p0) { return null; }
        public int getColor() { return 0; }
        public android.graphics.Bitmap getLargeIcon() { return null; }
        public android.app.Notification.CarExtender.UnreadConversation getUnreadConversation() { return null; }
        public android.app.Notification.CarExtender setColor(int p0) { return null; }
        public android.app.Notification.CarExtender setLargeIcon(android.graphics.Bitmap p0) { return null; }
        public android.app.Notification.CarExtender setUnreadConversation(android.app.Notification.CarExtender.UnreadConversation p0) { return null; }

        public static class Builder {
            private long mLatestTimestamp;
            private final java.util.List<java.lang.String> mMessages = null;
            private final java.lang.String mParticipant = null;
            private android.app.PendingIntent mReadPendingIntent;
            private android.app.RemoteInput mRemoteInput;
            private android.app.PendingIntent mReplyPendingIntent;
            public Builder(java.lang.String p0) {}
            public android.app.Notification.CarExtender.Builder addMessage(java.lang.String p0) { return null; }
            public android.app.Notification.CarExtender.UnreadConversation build() { return null; }
            public android.app.Notification.CarExtender.Builder setLatestTimestamp(long p0) { return null; }
            public android.app.Notification.CarExtender.Builder setReadPendingIntent(android.app.PendingIntent p0) { return null; }
            public android.app.Notification.CarExtender.Builder setReplyAction(android.app.PendingIntent p0, android.app.RemoteInput p1) { return null; }
        }

        public static class UnreadConversation {
            private static final java.lang.String KEY_AUTHOR = "author";
            private static final java.lang.String KEY_MESSAGES = "messages";
            static final java.lang.String KEY_ON_READ = "on_read";
            static final java.lang.String KEY_ON_REPLY = "on_reply";
            private static final java.lang.String KEY_PARTICIPANTS = "participants";
            static final java.lang.String KEY_REMOTE_INPUT = "remote_input";
            private static final java.lang.String KEY_TEXT = "text";
            private static final java.lang.String KEY_TIMESTAMP = "timestamp";
            private final long mLatestTimestamp = 0L;
            private final java.lang.String[] mMessages = null;
            private final java.lang.String[] mParticipants = null;
            private final android.app.PendingIntent mReadPendingIntent = null;
            private final android.app.RemoteInput mRemoteInput = null;
            private final android.app.PendingIntent mReplyPendingIntent = null;
            UnreadConversation(java.lang.String[] p0, android.app.RemoteInput p1, android.app.PendingIntent p2, android.app.PendingIntent p3, java.lang.String[] p4, long p5) {}
            static android.app.Notification.CarExtender.UnreadConversation getUnreadConversationFromBundle(android.os.Bundle p0) { return null; }
            android.os.Bundle getBundleForUnreadConversation() { return null; }
            public long getLatestTimestamp() { return 0L; }
            public java.lang.String[] getMessages() { return null; }
            public java.lang.String getParticipant() { return null; }
            public java.lang.String[] getParticipants() { return null; }
            public android.app.PendingIntent getReadPendingIntent() { return null; }
            public android.app.RemoteInput getRemoteInput() { return null; }
            public android.app.PendingIntent getReplyPendingIntent() { return null; }
        }
    }

    public static class Colors implements android.app.Notification.SemanticColors {
        private static final double MINIMAL_CONTRAST = 1.3;
        private static final double TEXT_CONTRAST = 4.5;
        private static final double THIN_CONTRAST = 3.0;
        private int mBackgroundColor;
        private int mContrastColor;
        private int mErrorColor;
        private int mOnTertiaryAccentTextColor;
        private int mOnTertiaryFixedAccentTextColor;
        private boolean mPaletteIsForColorized;
        private boolean mPaletteIsForNightMode;
        private int mPaletteIsForRawColor;
        private int mPrimaryAccentColor;
        private int mPrimaryEmphasisBackground;
        private int mPrimaryEmphasisText;
        private int mProtectionColor;
        private int mRippleAlpha;
        private int mSecondaryAccentColor;
        private int mSecondaryEmphasisOutline;
        private int mSecondaryEmphasisText;
        private int mSemanticCaution;
        private int mSemanticDanger;
        private int mSemanticInfo;
        private int mSemanticRedContainerHighColor;
        private int mSemanticSafe;
        private int mTertiaryAccentColor;
        private int mTertiaryFixedDimAccentColor;
        private int mTextColor;
        public Colors() {}
        private static int calculateContrastColor(android.content.Context p0, int p1, int p2, int p3, boolean p4) { return 0; }
        private static int ensureMinimalContrast(int p0, int p1) { return 0; }
        private static int ensureTextContrast(int p0, int p1) { return 0; }
        private static int ensureThinContrast(int p0, int p1) { return 0; }
        private static int flattenAlpha(int p0, int p1) { return 0; }
        private static int getColor(android.content.res.TypedArray p0, int p1, int p2) { return 0; }
        private static android.content.res.TypedArray obtainDayNightAttributes(android.content.Context p0, int[] p1) { return null; }
        public int getBackgroundColor() { return 0; }
        public int getContrastColor() { return 0; }
        public int getErrorColor() { return 0; }
        public int getOnTertiaryAccentTextColor() { return 0; }
        public int getOnTertiaryFixedAccentTextColor() { return 0; }
        public int getPrimaryAccentColor() { return 0; }
        public int getPrimaryEmphasisBackground() { return 0; }
        int getPrimaryEmphasisText() { return 0; }
        public int getProtectionColor() { return 0; }
        public int getRippleAlpha() { return 0; }
        public int getSecondaryAccentColor() { return 0; }
        int getSecondaryEmphasisOutline() { return 0; }
        int getSecondaryEmphasisText() { return 0; }
        public int getSemanticColor(int p0) { return 0; }
        public int getSemanticRedContainerHighColor() { return 0; }
        public int getTertiaryAccentColor() { return 0; }
        public int getTertiaryFixedDimAccentColor() { return 0; }
        public int getTextColor() { return 0; }
        public void resolvePalette(android.content.Context p0, int p1, boolean p2, boolean p3) {}
    }

    public static abstract class CompactContent {
        private static final java.lang.String KEY_DATA = "bundle";
        private static final java.lang.String KEY_TYPE = "type";
        private static final int TYPE_BASIC = 1;
        private CompactContent() {}
        static final android.app.Notification.CompactContent fromExtras(android.os.Bundle p0) { return null; }
        static final void toExtras(android.app.Notification.CompactContent p0, android.os.Bundle p1) {}
    }

    private static class CompactContentResolver {
        private CompactContentResolver() {}
        private static android.app.Notification.ResolvedBasicCompactContent resolveBasicCompactContent(android.content.Context p0, android.app.Notification p1, android.app.Notification.Builder p2, android.app.Notification.BasicCompactContent p3) { return null; }
        private static android.app.Notification.ResolvedCompactContent resolveCompactContent(android.content.Context p0, android.app.Notification p1, android.app.Notification.Builder p2, android.app.Notification.CompactContent p3) { return null; }
        private static android.app.Notification.ResolvedCompactIcon resolveCompactIcon(android.content.Context p0, android.app.Notification p1, android.app.Notification.CompactIcon p2) { return null; }
        private static android.app.Notification.Metric.MetricValue resolveCompactText(android.app.Notification p0, android.app.Notification.Builder p1, android.app.Notification.CompactText p2) { return null; }
    }

    public static final class CompactIcon implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.Notification.CompactIcon> CREATOR = null;
        private static final int ICON_AUTO = 0;
        private static final int ICON_SMALL = 1;
        private final int mWhich = 0;
        private CompactIcon(int p0) {}
        public static android.app.Notification.CompactIcon auto() { return null; }
        public static android.app.Notification.CompactIcon useSmallIcon() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface IconSource {
        }
    }

    public static final class CompactText implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.Notification.CompactText> CREATOR = null;
        private static final int TEXT_CUSTOM_METRIC = 7;
        private static final int TEXT_NONE = 1;
        private static final int TEXT_SHORT_CRITICAL = 2;
        private static final int TEXT_STYLE_METRIC = 6;
        private static final int TEXT_WHEN_REMAINING_ADAPTIVE = 3;
        private static final int TEXT_WHEN_STOPWATCH = 4;
        private static final int TEXT_WHEN_TIMER = 5;
        private final android.app.Notification.Metric.MetricValue mCustomMetricValue = null;
        private final int mStyleMetricIndex = 0;
        private final int mWhich = 0;
        private CompactText(int p0, int p1, android.app.Notification.Metric.MetricValue p2) {}
        public static android.app.Notification.CompactText fromMetricValue(android.app.Notification.Metric.MetricValue p0) { return null; }
        public static android.app.Notification.CompactText none() { return null; }
        public static android.app.Notification.CompactText useShortCriticalText() { return null; }
        public static android.app.Notification.CompactText useStyleMetric(int p0) { return null; }
        public static android.app.Notification.CompactText useWhenAsChronometer(boolean p0) { return null; }
        public static android.app.Notification.CompactText useWhenAsTimeRemaining() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface TextSource {
        }
    }

    public static class DecoratedCustomViewStyle extends android.app.Notification.Style {
        public DecoratedCustomViewStyle() { super(); }
        private android.widget.RemoteViews makeDecoratedExpandedContentView() { return null; }
        private android.widget.RemoteViews makeDecoratedHeadsUpContentView() { return null; }
        private android.widget.RemoteViews makeStandardTemplateWithCustomContent(android.widget.RemoteViews p0) { return null; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        public boolean displayCustomViewInline() { return false; }
        public android.widget.RemoteViews makeContentView() { return null; }
        public android.widget.RemoteViews makeExpandedContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView() { return null; }
        public void reduceImageSizes(android.content.Context p0) {}
    }

    public static class DecoratedMediaCustomViewStyle extends android.app.Notification.MediaStyle {
        public DecoratedMediaCustomViewStyle() { super(); }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        public boolean displayCustomViewInline() { return false; }
        public android.widget.RemoteViews makeContentView() { return null; }
        public android.widget.RemoteViews makeExpandedContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView() { return null; }
        public void reduceImageSizes(android.content.Context p0) {}
    }

    public static interface Extender {
        public android.app.Notification.Builder extend(android.app.Notification.Builder p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GroupAlertBehavior {
    }

    public static class InboxStyle extends android.app.Notification.Style {
        private static final int NUMBER_OF_HISTORY_ALLOWED_UNTIL_REDUCTION = 1;
        private java.util.ArrayList<java.lang.CharSequence> mTexts;
        public InboxStyle() { super(); }
        @java.lang.Deprecated
        public InboxStyle(android.app.Notification.Builder p0) { super(); }
        public void addExtras(android.os.Bundle p0) {}
        public android.app.Notification.InboxStyle addLine(java.lang.CharSequence p0) { return null; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        public android.app.Notification.InboxStyle clearLines() { return null; }
        public java.util.ArrayList<java.lang.CharSequence> getLines() { return null; }
        public android.widget.RemoteViews makeExpandedContentView() { return null; }
        public void reduceImageSizes(android.content.Context p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public android.app.Notification.InboxStyle setBigContentTitle(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.InboxStyle setSummaryText(java.lang.CharSequence p0) { return null; }
    }

    public static class MediaStyle extends android.app.Notification.Style {
        static final int MAX_MEDIA_BUTTONS = 5;
        static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
        private static final int[] MEDIA_BUTTON_IDS = null;
        private int[] mActionsToShowInCompact;
        private int mDeviceIcon;
        private android.app.PendingIntent mDeviceIntent;
        private java.lang.CharSequence mDeviceName;
        private android.media.session.MediaSession.Token mToken;
        public MediaStyle() { super(); }
        @java.lang.Deprecated
        public MediaStyle(android.app.Notification.Builder p0) { super(); }
        private void bindMediaActionButton(android.widget.RemoteViews p0, int p1, android.app.Notification.Action p2, android.app.Notification.StandardTemplateParams p3) {}
        public void addExtras(android.os.Bundle p0) {}
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        public android.app.Notification buildStyled(android.app.Notification p0) { return null; }
        public android.widget.RemoteViews makeContentView() { return null; }
        public android.widget.RemoteViews makeExpandedContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView() { return null; }
        protected android.widget.RemoteViews makeMediaContentView(android.widget.RemoteViews p0) { return null; }
        protected android.widget.RemoteViews makeMediaExpandedContentView(android.widget.RemoteViews p0) { return null; }
        public void reduceImageSizes(android.content.Context p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public android.app.Notification.MediaStyle setMediaSession(android.media.session.MediaSession.Token p0) { return null; }
        public android.app.Notification.MediaStyle setRemotePlaybackInfo(java.lang.CharSequence p0, int p1, android.app.PendingIntent p2) { return null; }
        public android.app.Notification.MediaStyle setShowActionsInCompactView(int... p0) { return null; }
    }

    public static class MessagingStyle extends android.app.Notification.Style {
        public static final int CONVERSATION_TYPE_IMPORTANT = 2;
        public static final int CONVERSATION_TYPE_LEGACY = 0;
        public static final int CONVERSATION_TYPE_NORMAL = 1;
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        java.lang.CharSequence mConversationTitle;
        int mConversationType;
        java.util.List<android.app.Notification.MessagingStyle.Message> mHistoricMessages;
        boolean mIsGroupConversation;
        java.util.List<android.app.Notification.MessagingStyle.Message> mMessages;
        android.graphics.drawable.Icon mShortcutIcon;
        int mUnreadMessageCount;
        android.app.Person mUser;
        MessagingStyle() { super(); }
        public MessagingStyle(android.app.Person p0) { super(); }
        public MessagingStyle(java.lang.CharSequence p0) { super(); }
        private android.app.Notification.MessagingStyle.Message findLatestIncomingMessage() { return null; }
        public static android.app.Notification.MessagingStyle.Message findLatestIncomingMessage(java.util.List<android.app.Notification.MessagingStyle.Message> p0) { return null; }
        private void fixTitleAndTextExtras(android.os.Bundle p0) {}
        private void fixTitleAndTextForCompactMessaging(android.app.Notification.StandardTemplateParams p0) {}
        private static android.os.Bundle[] getBundleArrayForMessages(java.util.List<android.app.Notification.MessagingStyle.Message> p0, boolean p1) { return null; }
        private java.lang.CharSequence getKey(android.app.Person p0) { return null; }
        private int getMessagingLayoutResource(boolean p0, boolean p1) { return 0; }
        private java.lang.CharSequence getOtherPersonName() { return null; }
        private boolean hasOnlyWhiteSpaceSenders() { return false; }
        private boolean isWhiteSpace(java.lang.CharSequence p0) { return false; }
        private android.widget.RemoteViews makeMessagingView(int p0) { return null; }
        private static boolean reduceMessagesIconSizes(java.util.List<android.app.Notification.MessagingStyle.Message> p0, int p1) { return false; }
        private boolean showConversationTitle() { return false; }
        public void addExtras(android.os.Bundle p0) {}
        public void addExtras(android.os.Bundle p0, boolean p1) {}
        public android.app.Notification.MessagingStyle addHistoricMessage(android.app.Notification.MessagingStyle.Message p0) { return null; }
        public android.app.Notification.MessagingStyle addMessage(android.app.Notification.MessagingStyle.Message p0) { return null; }
        public android.app.Notification.MessagingStyle addMessage(java.lang.CharSequence p0, long p1, android.app.Person p2) { return null; }
        public android.app.Notification.MessagingStyle addMessage(java.lang.CharSequence p0, long p1, java.lang.CharSequence p2) { return null; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        public java.lang.CharSequence getConversationTitle() { return null; }
        public int getConversationType() { return 0; }
        public java.lang.CharSequence getHeadsUpStatusBarText() { return null; }
        public java.util.List<android.app.Notification.MessagingStyle.Message> getHistoricMessages() { return null; }
        public java.lang.CharSequence getHistoryText(android.content.Context p0) { return null; }
        public java.util.List<android.app.Notification.MessagingStyle.Message> getMessages() { return null; }
        public android.graphics.drawable.Icon getShortcutIcon() { return null; }
        public int getUnreadMessageCount() { return 0; }
        public android.app.Person getUser() { return null; }
        public java.lang.CharSequence getUserDisplayName() { return null; }
        public boolean isGroupConversation() { return false; }
        public android.widget.RemoteViews makeCompactHeadsUpContentView() { return null; }
        public android.widget.RemoteViews makeContentView() { return null; }
        public android.widget.RemoteViews makeExpandedContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView() { return null; }
        public void reduceImageSizes(android.content.Context p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public android.app.Notification.MessagingStyle setConversationTitle(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.MessagingStyle setConversationType(int p0) { return null; }
        public android.app.Notification.MessagingStyle setGroupConversation(boolean p0) { return null; }
        public android.app.Notification.MessagingStyle setShortcutIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.app.Notification.MessagingStyle setUnreadMessageCount(int p0) { return null; }
        public void validate(android.content.Context p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ConversationType {
        }

        public static final class Message {
            static final java.lang.String KEY_DATA_MIME_TYPE = "type";
            static final java.lang.String KEY_DATA_URI = "uri";
            static final java.lang.String KEY_EXTRAS_BUNDLE = "extras";
            static final java.lang.String KEY_REMOTE_INPUT_HISTORY = "remote_input_history";
            static final java.lang.String KEY_SENDER = "sender";
            static final java.lang.String KEY_SENDER_PERSON = "sender_person";
            public static final java.lang.String KEY_TEXT = "text";
            static final java.lang.String KEY_TIMESTAMP = "time";
            private java.lang.String mDataMimeType;
            private android.net.Uri mDataUri;
            private android.os.Bundle mExtras;
            private final boolean mRemoteInputHistory = false;
            private final android.app.Person mSender = null;
            private java.lang.CharSequence mText;
            private final long mTimestamp = 0L;
            public Message(java.lang.CharSequence p0, long p1, android.app.Person p2) {}
            public Message(java.lang.CharSequence p0, long p1, android.app.Person p2, boolean p3) {}
            public Message(java.lang.CharSequence p0, long p1, java.lang.CharSequence p2) {}
            public static android.app.Notification.MessagingStyle.Message getMessageFromBundle(android.os.Bundle p0) { return null; }
            public static java.util.List<android.app.Notification.MessagingStyle.Message> getMessagesFromBundleArray(android.os.Parcelable[] p0) { return null; }
            private void stripNonStyleSpans() {}
            public java.lang.String getDataMimeType() { return null; }
            public android.net.Uri getDataUri() { return null; }
            public android.os.Bundle getExtras() { return null; }
            public java.lang.CharSequence getSender() { return null; }
            public android.app.Person getSenderPerson() { return null; }
            public java.lang.CharSequence getText() { return null; }
            public long getTimestamp() { return 0L; }
            public boolean isRemoteInputHistory() { return false; }
            public android.app.Notification.MessagingStyle.Message setData(java.lang.String p0, android.net.Uri p1) { return null; }
            public android.os.Bundle toBundle() { return null; }
            public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
        }
    }

    public static final class Metric {
        private static final java.lang.String KEY_LABEL = "label";
        private static final java.lang.String KEY_SEMANTIC_STYLE = "semanticStyle";
        private static final java.lang.String KEY_VALUE = "value";
        private final java.lang.String mLabel = null;
        private final int mSemanticStyle = 0;
        private final android.app.Notification.Metric.MetricValue mValue = null;
        public Metric(android.app.Notification.Metric.MetricValue p0, java.lang.CharSequence p1) {}
        public Metric(android.app.Notification.Metric.MetricValue p0, java.lang.CharSequence p1, int p2) {}
        private static android.app.Notification.Metric fromBundle(android.os.Bundle p0) { return null; }
        private static android.os.Bundle toBundle(android.app.Notification.Metric p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.CharSequence getLabel() { return null; }
        public int getSemanticStyle() { return 0; }
        public android.app.Notification.Metric.MetricValue getValue() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        public static final class FixedDate extends android.app.Notification.Metric.MetricValue {
            private static final int CLOSE_DATE_MONTH_SPAN = 3;
            public static final int FORMAT_AUTOMATIC = 0;
            public static final int FORMAT_LONG_DATE = 1;
            public static final int FORMAT_SHORT_DATE = 2;
            private static final java.lang.String KEY_FORMAT = "format";
            private static final java.lang.String KEY_VALUE = "value";
            private final int mFormat = 0;
            private final java.time.LocalDate mValue = null;
            public FixedDate(java.time.LocalDate p0) { super(); }
            public FixedDate(java.time.LocalDate p0, int p1) { super(); }
            private static android.app.Notification.Metric.FixedDate fromBundle(android.os.Bundle p0) { return null; }
            private static int getAutomaticFormatFlags(java.time.LocalDate p0) { return 0; }
            private static int getFormatFlags(int p0, java.time.LocalDate p1) { return 0; }
            private static boolean isDateCloseToToday(java.time.LocalDate p0) { return false; }
            public boolean equals(java.lang.Object p0) { return false; }
            public int getFormat() { return 0; }
            public java.time.LocalDate getValue() { return null; }
            public int hashCode() { return 0; }
            protected void toBundle(android.os.Bundle p0) {}
            public java.lang.String toString() { return null; }
            public android.app.Notification.Metric.MetricValue.ValueString toValueString(android.content.Context p0) { return null; }

            @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
            public static @interface Format {
            }
        }

        public static final class FixedFloat extends android.app.Notification.Metric.MetricValue {
            public static final int DEFAULT_MAX_FRACTION_DIGITS = 2;
            public static final int DEFAULT_MIN_FRACTION_DIGITS = 0;
            private static final java.lang.String KEY_MAX_FRACTION_DIGITS = "maxDigits";
            private static final java.lang.String KEY_MIN_FRACTION_DIGITS = "minDigits";
            private static final java.lang.String KEY_UNIT = "unit";
            private static final java.lang.String KEY_VALUE = "value";
            private static final int LOWER_BOUND_FRACTION_DIGITS = 0;
            private static final int UPPER_BOUND_FRACTION_DIGITS = 6;
            private final int mMaxFractionDigits = 0;
            private final int mMinFractionDigits = 0;
            private final java.lang.String mUnit = null;
            private final float mValue = 0.0f;
            public FixedFloat(float p0) { super(); }
            public FixedFloat(float p0, java.lang.CharSequence p1) { super(); }
            public FixedFloat(float p0, java.lang.CharSequence p1, int p2, int p3) { super(); }
            private static android.app.Notification.Metric.FixedFloat fromBundle(android.os.Bundle p0) { return null; }
            public boolean equals(java.lang.Object p0) { return false; }
            public int getMaxFractionDigits() { return 0; }
            public int getMinFractionDigits() { return 0; }
            public java.lang.CharSequence getUnit() { return null; }
            public float getValue() { return 0.0f; }
            public int hashCode() { return 0; }
            protected void toBundle(android.os.Bundle p0) {}
            public java.lang.String toString() { return null; }
            public android.app.Notification.Metric.MetricValue.ValueString toValueString(android.content.Context p0) { return null; }
        }

        public static final class FixedInt extends android.app.Notification.Metric.MetricValue {
            private static final java.lang.String KEY_UNIT = "unit";
            private static final java.lang.String KEY_VALUE = "value";
            private final java.lang.String mUnit = null;
            private final int mValue = 0;
            public FixedInt(int p0) { super(); }
            public FixedInt(int p0, java.lang.CharSequence p1) { super(); }
            private static android.app.Notification.Metric.FixedInt fromBundle(android.os.Bundle p0) { return null; }
            public boolean equals(java.lang.Object p0) { return false; }
            public java.lang.CharSequence getUnit() { return null; }
            public int getValue() { return 0; }
            public int hashCode() { return 0; }
            protected void toBundle(android.os.Bundle p0) {}
            public java.lang.String toString() { return null; }
            public android.app.Notification.Metric.MetricValue.ValueString toValueString(android.content.Context p0) { return null; }
        }

        public static final class FixedText extends android.app.Notification.Metric.MetricValue {
            private static final java.lang.String KEY_UNIT = "unit";
            private static final java.lang.String KEY_VALUE = "value";
            private final java.lang.String mUnit = null;
            private final java.lang.String mValue = null;
            public FixedText(java.lang.CharSequence p0) { super(); }
            public FixedText(java.lang.CharSequence p0, java.lang.CharSequence p1) { super(); }
            private static android.app.Notification.Metric.FixedText fromBundle(android.os.Bundle p0) { return null; }
            public boolean equals(java.lang.Object p0) { return false; }
            public java.lang.CharSequence getUnit() { return null; }
            public java.lang.CharSequence getValue() { return null; }
            public int hashCode() { return 0; }
            protected void toBundle(android.os.Bundle p0) {}
            public java.lang.String toString() { return null; }
            public android.app.Notification.Metric.MetricValue.ValueString toValueString(android.content.Context p0) { return null; }
        }

        public static final class FixedTime extends android.app.Notification.Metric.MetricValue {
            private static final int ABBREV_FORMAT = 18945;
            private static final java.lang.String KEY_VALUE = "value";
            private static final int NORMAL_FORMAT = 2561;
            private final java.time.LocalTime mValue = null;
            public FixedTime(java.time.LocalTime p0) { super(); }
            private static android.app.Notification.Metric.FixedTime fromBundle(android.os.Bundle p0) { return null; }
            public boolean equals(java.lang.Object p0) { return false; }
            public java.time.LocalTime getValue() { return null; }
            public int hashCode() { return 0; }
            protected void toBundle(android.os.Bundle p0) {}
            public java.lang.String toString() { return null; }
            public android.app.Notification.Metric.MetricValue.ValueString toValueString(android.content.Context p0) { return null; }
        }

        public static abstract class MetricValue {
            private static final java.lang.String KEY_TYPE = "_type";
            private static final int TYPE_FIXED_DATE = 2;
            private static final int TYPE_FIXED_FLOAT = 5;
            private static final int TYPE_FIXED_INT = 4;
            private static final int TYPE_FIXED_TEXT = 6;
            private static final int TYPE_FIXED_TIME = 3;
            private static final int TYPE_TIME_DIFFERENCE = 1;
            private MetricValue() {}
            private static android.app.Notification.Metric.MetricValue fromBundle(android.os.Bundle p0) { return null; }
            private static android.os.Bundle toBundle(android.app.Notification.Metric.MetricValue p0) { return null; }
            protected abstract void toBundle(android.os.Bundle p0);
            public abstract android.app.Notification.Metric.MetricValue.ValueString toValueString(android.content.Context p0);

            public static final class ValueString {
                private static final android.app.Notification.Metric.MetricValue.ValueString EMPTY = null;
                private final java.lang.String subtext = null;
                private final java.util.List<java.lang.String> textVariants = null;
                public ValueString(java.lang.String p0) {}
                public ValueString(java.lang.String p0, java.lang.String p1) {}
                public ValueString(java.util.List<java.lang.String> p0, java.lang.String p1) {}
                public final boolean equals(java.lang.Object p0) { return false; }
                public final int hashCode() { return 0; }
                public java.lang.String subtext() { return null; }
                public java.util.List<java.lang.String> textVariants() { return null; }
                public final java.lang.String toString() { return null; }
            }
        }

        public static final class TimeDifference extends android.app.Notification.Metric.MetricValue {
            public static final int FORMAT_ADAPTIVE = 1;
            public static final int FORMAT_CHRONOMETER = 2;
            private static final java.lang.String KEY_COUNT_DOWN = "countDown";
            private static final java.lang.String KEY_FORMAT = "format";
            private static final java.lang.String KEY_PAUSED_DURATION = "pausedDuration";
            private static final java.lang.String KEY_ZERO_ELAPSED_REALTIME = "zeroElapsedRealtime";
            private static final java.lang.String KEY_ZERO_TIME = "zeroTime";
            private final boolean mCountDown = false;
            private final int mFormat = 0;
            private final java.time.Duration mPausedDuration = null;
            private final java.lang.Long mZeroElapsedRealtime = null;
            private final java.time.Instant mZeroTime = null;
            private TimeDifference(java.time.Instant p0, java.lang.Long p1, java.time.Duration p2, boolean p3, int p4) { super(); }
            public static android.app.Notification.Metric.TimeDifference forPausedStopwatch(java.time.Duration p0, int p1) { return null; }
            public static android.app.Notification.Metric.TimeDifference forPausedTimer(java.time.Duration p0, int p1) { return null; }
            public static android.app.Notification.Metric.TimeDifference forStopwatch(long p0, int p1) { return null; }
            public static android.app.Notification.Metric.TimeDifference forStopwatch(java.time.Instant p0, int p1) { return null; }
            public static android.app.Notification.Metric.TimeDifference forTimer(long p0, int p1) { return null; }
            public static android.app.Notification.Metric.TimeDifference forTimer(java.time.Instant p0, int p1) { return null; }
            private static android.app.Notification.Metric.TimeDifference fromBundle(android.os.Bundle p0) { return null; }
            public boolean equals(java.lang.Object p0) { return false; }
            public int getFormat() { return 0; }
            public java.time.Duration getPausedDuration() { return null; }
            public java.lang.Long getZeroElapsedRealtime() { return null; }
            public java.time.Instant getZeroTime() { return null; }
            public int hashCode() { return 0; }
            public boolean isStopwatch() { return false; }
            public boolean isTimer() { return false; }
            protected void toBundle(android.os.Bundle p0) {}
            public java.lang.String toString() { return null; }
            public android.app.Notification.Metric.MetricValue.ValueString toValueString(android.content.Context p0) { return null; }

            @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
            public static @interface Format {
            }
        }
    }

    public static final class MetricStyle extends android.app.Notification.Style {
        private static final int CRITICAL_METRIC_DEFAULT = 0;
        private static final int MAX_METRICS = 3;
        public static final int METRIC_INDEX_NONE = -1;
        private int mCriticalMetric;
        private final java.util.List<android.app.Notification.Metric> mMetrics = null;
        public MetricStyle() { super(); }
        private android.widget.RemoteViews bindMetricStyleMetrics(android.widget.RemoteViews p0, android.app.Notification.StandardTemplateParams p1, java.util.List<android.app.Notification.Metric> p2, boolean p3) { return null; }
        private android.widget.RemoteViews buildMetricView(int p0, android.app.Notification.StandardTemplateParams p1, boolean p2, java.util.List<android.app.Notification.Metric> p3) { return null; }
        private java.lang.CharSequence formatBidiMetricLabel(android.content.Context p0, java.lang.CharSequence p1, java.lang.CharSequence p2) { return null; }
        private java.util.List<android.app.Notification.Metric> getCompactHeadsUpMetrics() { return null; }
        private java.lang.CharSequence getMetricLabel(android.app.Notification.Metric p0, boolean p1) { return null; }
        private java.lang.CharSequence getMetricLabel(android.app.Notification.Metric p0, boolean p1, boolean p2) { return null; }
        public void addExtras(android.os.Bundle p0) {}
        public android.app.Notification.MetricStyle addMetric(android.app.Notification.Metric p0) { return null; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        public boolean displayCustomViewInline() { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.app.Notification.Metric getCriticalMetric() { return null; }
        public java.lang.CharSequence getHistoryText(android.content.Context p0) { return null; }
        public java.util.List<android.app.Notification.Metric> getMetrics() { return null; }
        public int hashCode() { return 0; }
        public android.widget.RemoteViews makeCompactHeadsUpContentView() { return null; }
        public android.widget.RemoteViews makeContentView() { return null; }
        public android.widget.RemoteViews makeExpandedContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView() { return null; }
        public void reduceImageSizes(android.content.Context p0) {}
        public void restoreFromExtras(android.os.Bundle p0) {}
        public android.app.Notification.MetricStyle setCriticalMetric(int p0) { return null; }
        public android.app.Notification.MetricStyle setMetrics(java.util.List<android.app.Notification.Metric> p0) { return null; }
        public java.lang.String toString() { return null; }
        public void validate(android.content.Context p0) {}

        private static final class MetricView {
            private static final java.util.List<android.app.Notification.MetricStyle.MetricView> VIEWS = null;
            private final int chronometerId = 0;
            private final int containerId = 0;
            private final int labelId = 0;
            private final int textValueId = 0;
            private MetricView(int p0, int p1, int p2, int p3) {}
            public int chronometerId() { return 0; }
            public int containerId() { return 0; }
            public final boolean equals(java.lang.Object p0) { return false; }
            public final int hashCode() { return 0; }
            public int labelId() { return 0; }
            public int textValueId() { return 0; }
            public final java.lang.String toString() { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NotificationFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NotificationVisibilityOverride {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Priority {
    }

    public static class ProgressStyle extends android.app.Notification.Style {
        private static final int DEFAULT_PROGRESS_MAX = 100;
        private static final java.lang.String KEY_ELEMENT_COLOR = "colorInt";
        private static final java.lang.String KEY_ELEMENT_ID = "id";
        private static final java.lang.String KEY_ELEMENT_SEMANTIC_STYLE = "semanticStyle";
        private static final java.lang.String KEY_POINT_POSITION = "position";
        private static final java.lang.String KEY_SEGMENT_LENGTH = "length";
        private static final int MAX_PROGRESS_POINT_LIMIT = 4;
        private static final int MAX_PROGRESS_SEGMENT_LIMIT = 10;
        private android.graphics.drawable.Icon mEndIcon;
        private boolean mIndeterminate;
        private boolean mIsStyledByProgress;
        private int mProgress;
        private java.util.List<android.app.Notification.ProgressStyle.Point> mProgressPoints;
        private java.util.List<android.app.Notification.ProgressStyle.Segment> mProgressSegments;
        private android.graphics.drawable.Icon mStartIcon;
        private android.graphics.drawable.Icon mTrackerIcon;
        public ProgressStyle() { super(); }
        private static android.app.Notification.ProgressStyle.Point fixPointColor(android.app.Notification.ProgressStyle.Point p0, int p1, int p2, android.app.Notification.SemanticColors p3) { return null; }
        private static android.app.Notification.ProgressStyle.Segment fixSegmentColor(android.app.Notification.ProgressStyle.Segment p0, int p1, int p2, android.app.Notification.SemanticColors p3) { return null; }
        public static java.util.ArrayList<android.os.Bundle> getProgressPointsAsBundleList(java.util.List<android.app.Notification.ProgressStyle.Point> p0) { return null; }
        public static java.util.List<android.app.Notification.ProgressStyle.Point> getProgressPointsFromBundleList(java.util.List<android.os.Bundle> p0) { return null; }
        public static java.util.ArrayList<android.os.Bundle> getProgressSegmentsAsBundleList(java.util.List<android.app.Notification.ProgressStyle.Segment> p0) { return null; }
        public static java.util.List<android.app.Notification.ProgressStyle.Segment> getProgressSegmentsFromBundleList(java.util.List<android.os.Bundle> p0) { return null; }
        private static <T extends java.lang.Object> int getUniqueOrDefault(java.util.List<T> p0, java.util.function.Function<T, java.lang.Integer> p1, int p2) { return 0; }
        public static int sanitizeProgressColor(int p0, int p1, int p2) { return 0; }
        public void addExtras(android.os.Bundle p0) {}
        public android.app.Notification.ProgressStyle addProgressPoint(android.app.Notification.ProgressStyle.Point p0) { return null; }
        public android.app.Notification.ProgressStyle addProgressSegment(android.app.Notification.ProgressStyle.Segment p0) { return null; }
        public boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0) { return false; }
        public com.android.internal.widget.NotificationProgressModel createProgressModel(int p0, int p1, android.app.Notification.SemanticColors p2) { return null; }
        public boolean displayCustomViewInline() { return false; }
        public int getProgress() { return 0; }
        public android.graphics.drawable.Icon getProgressEndIcon() { return null; }
        public int getProgressMax() { return 0; }
        public java.util.List<android.app.Notification.ProgressStyle.Point> getProgressPoints() { return null; }
        public java.util.List<android.app.Notification.ProgressStyle.Segment> getProgressSegments() { return null; }
        public android.graphics.drawable.Icon getProgressStartIcon() { return null; }
        public android.graphics.drawable.Icon getProgressTrackerIcon() { return null; }
        public boolean isProgressIndeterminate() { return false; }
        public boolean isStyledByProgress() { return false; }
        public android.widget.RemoteViews makeContentView() { return null; }
        public android.widget.RemoteViews makeExpandedContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView() { return null; }
        public void reduceImageSizes(android.content.Context p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public android.app.Notification.ProgressStyle setProgress(int p0) { return null; }
        public android.app.Notification.ProgressStyle setProgressEndIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.app.Notification.ProgressStyle setProgressIndeterminate(boolean p0) { return null; }
        public android.app.Notification.ProgressStyle setProgressPoints(java.util.List<android.app.Notification.ProgressStyle.Point> p0) { return null; }
        public android.app.Notification.ProgressStyle setProgressSegments(java.util.List<android.app.Notification.ProgressStyle.Segment> p0) { return null; }
        public android.app.Notification.ProgressStyle setProgressStartIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.app.Notification.ProgressStyle setProgressTrackerIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.app.Notification.ProgressStyle setStyledByProgress(boolean p0) { return null; }

        public static final class Point {
            private int mColor;
            private int mId;
            private final int mPosition = 0;
            private int mSemanticStyle;
            public Point(int p0) {}
            public boolean equals(java.lang.Object p0) { return false; }
            public int getColor() { return 0; }
            public int getId() { return 0; }
            public int getPosition() { return 0; }
            public int getSemanticStyle() { return 0; }
            public int hashCode() { return 0; }
            public android.app.Notification.ProgressStyle.Point setColor(int p0) { return null; }
            public android.app.Notification.ProgressStyle.Point setId(int p0) { return null; }
            public android.app.Notification.ProgressStyle.Point setSemanticStyle(int p0) { return null; }
        }

        public static final class Segment {
            private int mColor;
            private int mId;
            private final int mLength = 0;
            private int mSemanticStyle;
            public Segment(int p0) {}
            public boolean equals(java.lang.Object p0) { return false; }
            public int getColor() { return 0; }
            public int getId() { return 0; }
            public int getLength() { return 0; }
            public int getSemanticStyle() { return 0; }
            public int hashCode() { return 0; }
            public android.app.Notification.ProgressStyle.Segment setColor(int p0) { return null; }
            public android.app.Notification.ProgressStyle.Segment setId(int p0) { return null; }
            public android.app.Notification.ProgressStyle.Segment setSemanticStyle(int p0) { return null; }
        }
    }

    public static final class ProjectedExtender implements android.app.Notification.Extender {
        public static final java.lang.String EXTRA_PROJECTED_EXTENDER = "android.projected.EXTENSIONS";
        public static final java.lang.String KEY_CONTENT_INTENT = "content_intent";
        private android.app.PendingIntent mContentIntent;
        public ProjectedExtender() {}
        public ProjectedExtender(android.app.Notification p0) {}
        public android.app.Notification.Builder extend(android.app.Notification.Builder p0) { return null; }
        public android.app.PendingIntent getContentIntent() { return null; }
        public android.app.Notification.ProjectedExtender setContentIntent(android.app.PendingIntent p0) { return null; }
    }

    public static final class ResolvedBasicCompactContent extends android.app.Notification.ResolvedCompactContent {
        private final android.app.Notification.ResolvedCompactIcon mIcon = null;
        private final int mSemanticStyle = 0;
        private final android.app.Notification.Metric.MetricValue mText = null;
        public ResolvedBasicCompactContent(android.app.Notification.ResolvedCompactIcon p0, android.app.Notification.Metric.MetricValue p1, int p2) { super(); }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.app.Notification.ResolvedCompactIcon getIcon() { return null; }
        public int getSemanticStyle() { return 0; }
        public android.app.Notification.Metric.MetricValue getText() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static abstract class ResolvedCompactContent {
        private ResolvedCompactContent() {}
    }

    public static class ResolvedCompactIcon {
        public static final int SOURCE_PACKAGE_APP_ICON = 2;
        public static final int SOURCE_SMALL_ICON = 1;
        public static final int SOURCE_UNKNOWN = 0;
        private final android.graphics.drawable.Icon mIcon = null;
        private final int mSource = 0;
        public ResolvedCompactIcon(int p0, android.graphics.drawable.Icon p1) {}
        private static java.lang.String sourceToString(int p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.graphics.drawable.Icon getIcon() { return null; }
        public int getSource() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ResolvedCompactIconSource {
        }
    }

    @java.lang.FunctionalInterface
    public static interface SemanticColors {
        public int getSemanticColor(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SemanticStyle {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceNotificationPolicy {
    }

    private static class StandardTemplateParams {
        public static final int DECORATION_MINIMAL = 1;
        public static final int DECORATION_PARTIAL = 2;
        public static int VIEW_TYPE_EXPANDED;
        public static int VIEW_TYPE_GROUP_HEADER;
        public static int VIEW_TYPE_HEADS_UP;
        public static int VIEW_TYPE_MINIMIZED;
        public static int VIEW_TYPE_NORMAL;
        public static int VIEW_TYPE_PUBLIC;
        public static int VIEW_TYPE_UNSPECIFIED;
        boolean allowColorization;
        boolean mAllowTextWithProgress;
        boolean mCallStyleActions;
        java.lang.CharSequence mHeaderTextSecondary;
        boolean mHeaderless;
        boolean mHideActions;
        boolean mHideAppName;
        boolean mHideChronometer;
        boolean mHideLeftIcon;
        boolean mHideProfileBadge;
        boolean mHideProgress;
        boolean mHideRightIcon;
        boolean mHideSnoozeButton;
        boolean mHideSubText;
        boolean mHideTime;
        boolean mHideTitle;
        boolean mHighlightExpander;
        boolean mNeedsExtraTextMargin;
        android.graphics.drawable.Icon mPromotedPicture;
        java.lang.CharSequence mSubText;
        int mSubtextViewId;
        java.lang.CharSequence mSummarization;
        java.lang.CharSequence mText;
        int mTextViewId;
        java.lang.CharSequence mTitle;
        int mTitleViewId;
        int mViewType;
        int maxRemoteInputHistory;
        private StandardTemplateParams() {}
        final android.app.Notification.StandardTemplateParams allowTextWithProgress(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams callStyleActions(boolean p0) { return null; }
        public android.app.Notification.StandardTemplateParams decorationType(int p0) { return null; }
        final android.app.Notification.StandardTemplateParams disallowColorization() { return null; }
        final android.app.Notification.StandardTemplateParams fillTextsFrom(android.app.Notification.Builder p0) { return null; }
        final boolean hasTitle() { return false; }
        final android.app.Notification.StandardTemplateParams headerTextSecondary(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.StandardTemplateParams headerless(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams hideActions(boolean p0) { return null; }
        public android.app.Notification.StandardTemplateParams hideAppName(boolean p0) { return null; }
        public android.app.Notification.StandardTemplateParams hideChronometer(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams hideLeftIcon(boolean p0) { return null; }
        public android.app.Notification.StandardTemplateParams hideProfileBadge(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams hideProgress(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams hideRightIcon(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams hideSnoozeButton(boolean p0) { return null; }
        public android.app.Notification.StandardTemplateParams hideSubText(boolean p0) { return null; }
        public android.app.Notification.StandardTemplateParams hideTime(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams hideTitle(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams highlightExpander(boolean p0) { return null; }
        public android.app.Notification.StandardTemplateParams maybeUseMinimalHeader(android.app.Notification.Builder p0) { return null; }
        public android.app.Notification.StandardTemplateParams needsExtraTextMargin(boolean p0) { return null; }
        final android.app.Notification.StandardTemplateParams promotedPicture(android.graphics.drawable.Icon p0) { return null; }
        final android.app.Notification.StandardTemplateParams reset() { return null; }
        public android.app.Notification.StandardTemplateParams setMaxRemoteInputHistory(int p0) { return null; }
        public android.app.Notification.StandardTemplateParams subTextViewId(int p0) { return null; }
        final android.app.Notification.StandardTemplateParams summarization(java.lang.CharSequence p0) { return null; }
        final android.app.Notification.StandardTemplateParams summaryText(java.lang.CharSequence p0) { return null; }
        final android.app.Notification.StandardTemplateParams text(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.StandardTemplateParams textViewId(int p0) { return null; }
        final android.app.Notification.StandardTemplateParams title(java.lang.CharSequence p0) { return null; }
        public android.app.Notification.StandardTemplateParams titleViewId(int p0) { return null; }
        final android.app.Notification.StandardTemplateParams viewType(int p0) { return null; }
    }

    public static abstract class Style {
        static final int MAX_REMOTE_INPUT_HISTORY_LINES = 3;
        private java.lang.CharSequence mBigContentTitle;
        protected android.app.Notification.Builder mBuilder;
        protected java.lang.CharSequence mSummaryText;
        protected boolean mSummaryTextSet;
        @java.lang.Deprecated
        public Style() {}
        public void addExtras(android.os.Bundle p0) {}
        public abstract boolean areNotificationsVisiblyDifferent(android.app.Notification.Style p0);
        public android.app.Notification build() { return null; }
        public android.app.Notification buildStyled(android.app.Notification p0) { return null; }
        protected void checkBuilder() {}
        public boolean displayCustomViewInline() { return false; }
        public java.lang.CharSequence getHeadsUpStatusBarText() { return null; }
        public java.lang.CharSequence getHistoryText(android.content.Context p0) { return null; }
        protected android.widget.RemoteViews getStandardView(int p0) { return null; }
        protected android.widget.RemoteViews getStandardView(int p0, android.app.Notification.StandardTemplateParams p1, android.app.Notification.TemplateBindResult p2) { return null; }
        public boolean hasSummaryInHeader() { return false; }
        protected void internalSetBigContentTitle(java.lang.CharSequence p0) {}
        protected void internalSetSummaryText(java.lang.CharSequence p0) {}
        public android.widget.RemoteViews makeCompactHeadsUpContentView() { return null; }
        public android.widget.RemoteViews makeContentView() { return null; }
        public android.widget.RemoteViews makeExpandedContentView() { return null; }
        public android.widget.RemoteViews makeHeadsUpContentView() { return null; }
        protected void reduceImageSizes(android.content.Context p0) {}
        protected void restoreFromExtras(android.os.Bundle p0) {}
        public void setBuilder(android.app.Notification.Builder p0) {}
        public void validate(android.content.Context p0) {}
    }

    private static class TemplateBindResult {
        public final android.app.Notification.TemplateBindResult.MarginSet mHeadingExtraMarginSet = null;
        public final android.app.Notification.TemplateBindResult.MarginSet mHeadingFullMarginSet = null;
        float mRightIconHeightDp;
        boolean mRightIconVisible;
        float mRightIconWidthDp;
        public final android.app.Notification.TemplateBindResult.MarginSet mTitleMarginSet = null;
        private TemplateBindResult() {}
        public void calculateMargins(float p0, float p1, float p2) {}
        public void setRightIconState(boolean p0, float p1, float p2) {}

        private class MarginSet {
            private float mValueIfGone;
            private float mValueIfVisible;
            private MarginSet(android.app.Notification.TemplateBindResult p0) {}
            public void applyToView(android.widget.RemoteViews p0, int p1) {}
            public void applyToView(android.widget.RemoteViews p0, int p1, float p2) {}
            public float getDpValue() { return 0.0f; }
            public void setValues(float p0, float p1) {}
        }
    }

    public static final class TvExtender implements android.app.Notification.Extender {
        private static final java.lang.String EXTRA_CHANNEL_ID = "channel_id";
        static final java.lang.String EXTRA_CONTENT_INTENT = "content_intent";
        static final java.lang.String EXTRA_DELETE_INTENT = "delete_intent";
        private static final java.lang.String EXTRA_FLAGS = "flags";
        private static final java.lang.String EXTRA_SUPPRESS_SHOW_OVER_APPS = "suppressShowOverApps";
        private static final java.lang.String EXTRA_TV_EXTENDER = "android.tv.EXTENSIONS";
        private static final int FLAG_AVAILABLE_ON_TV = 1;
        private static final java.lang.String TAG = "TvExtender";
        private java.lang.String mChannelId;
        private android.app.PendingIntent mContentIntent;
        private android.app.PendingIntent mDeleteIntent;
        private int mFlags;
        private boolean mSuppressShowOverApps;
        public TvExtender() {}
        public TvExtender(android.app.Notification p0) {}
        public android.app.Notification.Builder extend(android.app.Notification.Builder p0) { return null; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public java.lang.String getChannel() { return null; }
        public java.lang.String getChannelId() { return null; }
        public android.app.PendingIntent getContentIntent() { return null; }
        public android.app.PendingIntent getDeleteIntent() { return null; }
        @android.annotation.SystemApi
        public boolean getSuppressShowOverApps() { return false; }
        public boolean isAvailableOnTv() { return false; }
        public boolean isSuppressShowOverApps() { return false; }
        @android.annotation.SystemApi
        public android.app.Notification.TvExtender setChannel(java.lang.String p0) { return null; }
        public android.app.Notification.TvExtender setChannelId(java.lang.String p0) { return null; }
        public android.app.Notification.TvExtender setContentIntent(android.app.PendingIntent p0) { return null; }
        public android.app.Notification.TvExtender setDeleteIntent(android.app.PendingIntent p0) { return null; }
        public android.app.Notification.TvExtender setSuppressShowOverApps(boolean p0) { return null; }
    }

    public static interface UserProfileBadgeProvider {
        public java.lang.String getProfileAccessibilityString(android.content.Context p0);
        public android.graphics.Bitmap getProfileBadge(android.content.Context p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Visibility {
    }

    public static final class WearableExtender implements android.app.Notification.Extender {
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_GRAVITY = 80;
        private static final java.lang.String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final java.lang.String KEY_ACTIONS = "actions";
        static final java.lang.String KEY_BACKGROUND = "background";
        private static final java.lang.String KEY_BRIDGE_TAG = "bridgeTag";
        private static final java.lang.String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final java.lang.String KEY_CONTENT_ICON = "contentIcon";
        private static final java.lang.String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final java.lang.String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final java.lang.String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final java.lang.String KEY_DISMISSAL_ID = "dismissalId";
        static final java.lang.String KEY_DISPLAY_INTENT = "displayIntent";
        private static final java.lang.String KEY_FLAGS = "flags";
        private static final java.lang.String KEY_GRAVITY = "gravity";
        private static final java.lang.String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final java.lang.String KEY_PAGES = "pages";
        @java.lang.Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;
        @java.lang.Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;
        @java.lang.Deprecated
        public static final int SIZE_DEFAULT = 0;
        @java.lang.Deprecated
        public static final int SIZE_FULL_SCREEN = 5;
        @java.lang.Deprecated
        public static final int SIZE_LARGE = 4;
        @java.lang.Deprecated
        public static final int SIZE_MEDIUM = 3;
        @java.lang.Deprecated
        public static final int SIZE_SMALL = 2;
        @java.lang.Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private java.util.ArrayList<android.app.Notification.Action> mActions;
        private android.graphics.Bitmap mBackground;
        private java.lang.String mBridgeTag;
        private int mContentActionIndex;
        private int mContentIcon;
        private int mContentIconGravity;
        private int mCustomContentHeight;
        private int mCustomSizePreset;
        private java.lang.String mDismissalId;
        private android.app.PendingIntent mDisplayIntent;
        private int mFlags;
        private int mGravity;
        private int mHintScreenTimeout;
        private java.util.ArrayList<android.app.Notification> mPages;
        public WearableExtender() {}
        public WearableExtender(android.app.Notification p0) {}
        private void setFlag(int p0, boolean p1) {}
        private void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
        public android.app.Notification.WearableExtender addAction(android.app.Notification.Action p0) { return null; }
        public android.app.Notification.WearableExtender addActions(java.util.List<android.app.Notification.Action> p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender addPage(android.app.Notification p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender addPages(java.util.List<android.app.Notification> p0) { return null; }
        public android.app.Notification.WearableExtender clearActions() { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender clearPages() { return null; }
        public android.app.Notification.WearableExtender clone() { return null; }
        public android.app.Notification.Builder extend(android.app.Notification.Builder p0) { return null; }
        public java.util.List<android.app.Notification.Action> getActions() { return null; }
        @java.lang.Deprecated
        public android.graphics.Bitmap getBackground() { return null; }
        public java.lang.String getBridgeTag() { return null; }
        public int getContentAction() { return 0; }
        @java.lang.Deprecated
        public int getContentIcon() { return 0; }
        @java.lang.Deprecated
        public int getContentIconGravity() { return 0; }
        public boolean getContentIntentAvailableOffline() { return false; }
        @java.lang.Deprecated
        public int getCustomContentHeight() { return 0; }
        @java.lang.Deprecated
        public int getCustomSizePreset() { return 0; }
        public java.lang.String getDismissalId() { return null; }
        @java.lang.Deprecated
        public android.app.PendingIntent getDisplayIntent() { return null; }
        @java.lang.Deprecated
        public int getGravity() { return 0; }
        @java.lang.Deprecated
        public boolean getHintAmbientBigPicture() { return false; }
        @java.lang.Deprecated
        public boolean getHintAvoidBackgroundClipping() { return false; }
        public boolean getHintContentIntentLaunchesActivity() { return false; }
        @java.lang.Deprecated
        public boolean getHintHideIcon() { return false; }
        @java.lang.Deprecated
        public int getHintScreenTimeout() { return 0; }
        @java.lang.Deprecated
        public boolean getHintShowBackgroundOnly() { return false; }
        @java.lang.Deprecated
        public java.util.List<android.app.Notification> getPages() { return null; }
        public boolean getStartScrollBottom() { return false; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setBackground(android.graphics.Bitmap p0) { return null; }
        public android.app.Notification.WearableExtender setBridgeTag(java.lang.String p0) { return null; }
        public android.app.Notification.WearableExtender setContentAction(int p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setContentIcon(int p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setContentIconGravity(int p0) { return null; }
        public android.app.Notification.WearableExtender setContentIntentAvailableOffline(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setCustomContentHeight(int p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setCustomSizePreset(int p0) { return null; }
        public android.app.Notification.WearableExtender setDismissalId(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setDisplayIntent(android.app.PendingIntent p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setGravity(int p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setHintAmbientBigPicture(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setHintAvoidBackgroundClipping(boolean p0) { return null; }
        public android.app.Notification.WearableExtender setHintContentIntentLaunchesActivity(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setHintHideIcon(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setHintScreenTimeout(int p0) { return null; }
        @java.lang.Deprecated
        public android.app.Notification.WearableExtender setHintShowBackgroundOnly(boolean p0) { return null; }
        public android.app.Notification.WearableExtender setStartScrollBottom(boolean p0) { return null; }
    }
}
