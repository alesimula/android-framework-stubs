package android.app.people;

public final class ConversationStatus implements android.os.Parcelable {
    public static final int ACTIVITY_ANNIVERSARY = 2;
    public static final int ACTIVITY_AUDIO = 4;
    public static final int ACTIVITY_BIRTHDAY = 1;
    public static final int ACTIVITY_GAME = 6;
    public static final int ACTIVITY_LOCATION = 7;
    public static final int ACTIVITY_NEW_STORY = 3;
    public static final int ACTIVITY_OTHER = 0;
    public static final int ACTIVITY_UPCOMING_BIRTHDAY = 8;
    public static final int ACTIVITY_VIDEO = 5;
    public static final int AVAILABILITY_AVAILABLE = 0;
    public static final int AVAILABILITY_BUSY = 1;
    public static final int AVAILABILITY_OFFLINE = 2;
    public static final int AVAILABILITY_UNKNOWN = -1;
    public static final android.os.Parcelable.Creator<android.app.people.ConversationStatus> CREATOR = null;
    private static final java.lang.String TAG = "ConversationStatus";
    private final int mActivity = 0;
    private int mAvailability;
    private java.lang.CharSequence mDescription;
    private long mEndTimeMs;
    private android.graphics.drawable.Icon mIcon;
    private final java.lang.String mId = null;
    private long mStartTimeMs;
    private ConversationStatus(android.app.people.ConversationStatus.Builder p0) {}
    private ConversationStatus(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getActivity() { return 0; }
    public int getAvailability() { return 0; }
    public java.lang.CharSequence getDescription() { return null; }
    public long getEndTimeMillis() { return 0L; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public java.lang.String getId() { return null; }
    public long getStartTimeMillis() { return 0L; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActivityType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Availability {
    }

    public static final class Builder {
        final int mActivity = 0;
        int mAvailability;
        java.lang.CharSequence mDescription;
        long mEndTimeMs;
        android.graphics.drawable.Icon mIcon;
        final java.lang.String mId = null;
        long mStartTimeMs;
        public Builder(java.lang.String p0, int p1) {}
        public android.app.people.ConversationStatus build() { return null; }
        public android.app.people.ConversationStatus.Builder setAvailability(int p0) { return null; }
        public android.app.people.ConversationStatus.Builder setDescription(java.lang.CharSequence p0) { return null; }
        public android.app.people.ConversationStatus.Builder setEndTimeMillis(long p0) { return null; }
        public android.app.people.ConversationStatus.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.app.people.ConversationStatus.Builder setStartTimeMillis(long p0) { return null; }
    }
}
