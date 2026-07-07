package android.app.modes;

public final class ContextualMode implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.modes.ContextualMode> CREATOR = null;
    public static final int STATE_ACTIVE = 2;
    public static final int STATE_INACTIVE = 1;
    public static final int STATE_UNKNOWN = 0;
    public static final int TYPE_BEDTIME = 3;
    public static final int TYPE_DRIVING = 4;
    public static final int TYPE_IMMERSIVE = 5;
    public static final int TYPE_MANAGED = 7;
    public static final int TYPE_MANUAL_DO_NOT_DISTURB = 999;
    public static final int TYPE_OTHER = 0;
    public static final int TYPE_SCHEDULE_CALENDAR = 2;
    public static final int TYPE_SCHEDULE_TIME = 1;
    public static final int TYPE_THEATER = 6;
    public static final int TYPE_TRANSIT = 8;
    public static final int TYPE_UNKNOWN = -1;
    private final java.lang.String mId = null;
    private final int mState = 0;
    private final int mType = 0;
    private ContextualMode(android.os.Parcel p0) {}
    private ContextualMode(java.lang.String p0, int p1, int p2) {}
    public static java.lang.String modeStateToString(int p0) { return null; }
    public static java.lang.String modeTypeToString(int p0) { return null; }
    private int validateModeState(int p0) { return 0; }
    private int validateModeType(int p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getId() { return null; }
    public int getState() { return 0; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mId;
        private int mState;
        private int mType;
        public Builder(android.app.modes.ContextualMode p0) {}
        public Builder(java.lang.String p0) {}
        public android.app.modes.ContextualMode build() { return null; }
        public android.app.modes.ContextualMode.Builder setState(int p0) { return null; }
        public android.app.modes.ContextualMode.Builder setType(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModeState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModeType {
    }
}
