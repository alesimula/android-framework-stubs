package android.service.notification;

@android.annotation.SystemApi
public final class Adjustment implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.notification.Adjustment> CREATOR = null;
    public static final java.lang.String KEY_BREAKTHROUGH_ALL_MODES = "breakthrough_all_modes";
    public static final java.lang.String KEY_CONTEXTUAL_ACTIONS = "key_contextual_actions";
    public static final java.lang.String KEY_DYNAMIC_BUNDLE = "dynamic_bundle";
    public static final java.lang.String KEY_GROUP_KEY = "key_group_key";
    public static final java.lang.String KEY_HIGHLIGHT = "highlight";
    public static final java.lang.String KEY_IMPORTANCE = "key_importance";
    public static final java.lang.String KEY_IMPORTANCE_PROPOSAL = "key_importance_proposal";
    public static final java.lang.String KEY_LIGHT = "light";
    public static final java.lang.String KEY_MODE_BREAKTHROUGH_LIST = "mode_breakthrough";
    public static final java.lang.String KEY_NOTIFICATION_RULES = "notification_rules";
    @android.annotation.SystemApi
    public static final java.lang.String KEY_NOT_CONVERSATION = "key_not_conversation";
    @android.annotation.SystemApi
    public static final java.lang.String KEY_PEOPLE = "key_people";
    public static final java.lang.String KEY_RANKING_SCORE = "key_ranking_score";
    public static final java.lang.String KEY_SENSITIVE_CONTENT = "key_sensitive_content";
    public static final java.lang.String KEY_SNOOZE_CRITERIA = "key_snooze_criteria";
    public static final java.lang.String KEY_SOUND = "sound";
    public static final java.lang.String KEY_SUMMARIZATION = "key_summarization";
    public static final java.lang.String KEY_TEXT_REPLIES = "key_text_replies";
    public static final java.lang.String KEY_TYPE = "key_type";
    public static final java.lang.String KEY_UNCLASSIFY = "key_unclassify";
    public static final java.lang.String KEY_USER_SENTIMENT = "key_user_sentiment";
    public static final int TYPE_CONTENT_RECOMMENDATION = 4;
    public static final int TYPE_NEWS = 3;
    public static final int TYPE_OTHER = 0;
    public static final int TYPE_PROMOTION = 1;
    public static final int TYPE_SOCIAL_MEDIA = 2;
    private final java.lang.CharSequence mExplanation = null;
    private java.lang.String mIssuer;
    private final java.lang.String mKey = null;
    private final java.lang.String mPackage = null;
    private int mRuleId;
    private int mRuleOrder;
    private final android.os.Bundle mSignals = null;
    private final int mUser = 0;
    @android.annotation.SystemApi
    protected Adjustment(android.os.Parcel p0) {}
    public Adjustment(android.service.notification.Adjustment p0) {}
    @android.annotation.SystemApi
    public Adjustment(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, java.lang.CharSequence p3, int p4) {}
    public Adjustment(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, java.lang.CharSequence p3, android.os.UserHandle p4) {}
    public int describeContents() { return 0; }
    public java.lang.CharSequence getExplanation() { return null; }
    public java.lang.String getIssuer() { return null; }
    public java.lang.String getKey() { return null; }
    public int getOriginatingRuleId() { return 0; }
    public int getOriginatingRuleOrder() { return 0; }
    public java.lang.String getPackage() { return null; }
    public android.os.Bundle getSignals() { return null; }
    @android.annotation.SystemApi
    public int getUser() { return 0; }
    public android.os.UserHandle getUserHandle() { return null; }
    public void setIssuer(java.lang.String p0) {}
    public void setOriginatingRuleId(int p0) {}
    public void setOriginatingRuleOrder(int p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Keys {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Types {
    }
}
