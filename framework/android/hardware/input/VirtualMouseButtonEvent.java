package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualMouseButtonEvent implements android.os.Parcelable {
    public static final int ACTION_BUTTON_PRESS = 11;
    public static final int ACTION_BUTTON_RELEASE = 12;
    public static final int ACTION_UNKNOWN = -1;
    public static final int BUTTON_BACK = 8;
    public static final int BUTTON_FORWARD = 16;
    public static final int BUTTON_PRIMARY = 1;
    public static final int BUTTON_SECONDARY = 2;
    public static final int BUTTON_TERTIARY = 4;
    public static final int BUTTON_UNKNOWN = -1;
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualMouseButtonEvent> CREATOR = null;
    private final int mAction = 0;
    private final int mButtonCode = 0;
    private final long mEventTimeNanos = 0L;
    private VirtualMouseButtonEvent(int p0, int p1, long p2) {}
    private VirtualMouseButtonEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getAction() { return 0; }
    public int getButtonCode() { return 0; }
    public long getEventTimeNanos() { return 0L; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Action {
    }

    public static final class Builder {
        private int mAction;
        private int mButtonCode;
        private long mEventTimeNanos;
        public Builder() {}
        public android.hardware.input.VirtualMouseButtonEvent build() { return null; }
        public android.hardware.input.VirtualMouseButtonEvent.Builder setAction(int p0) { return null; }
        public android.hardware.input.VirtualMouseButtonEvent.Builder setButtonCode(int p0) { return null; }
        public android.hardware.input.VirtualMouseButtonEvent.Builder setEventTimeNanos(long p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Button {
    }
}
