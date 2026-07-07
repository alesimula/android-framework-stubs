package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualStylusButtonEvent implements android.os.Parcelable {
    public static final int ACTION_BUTTON_PRESS = 11;
    public static final int ACTION_BUTTON_RELEASE = 12;
    public static final int ACTION_UNKNOWN = -1;
    public static final int BUTTON_PRIMARY = 32;
    public static final int BUTTON_SECONDARY = 64;
    public static final int BUTTON_UNKNOWN = -1;
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualStylusButtonEvent> CREATOR = null;
    private final int mAction = 0;
    private final int mButtonCode = 0;
    private final long mEventTimeNanos = 0L;
    private VirtualStylusButtonEvent(int p0, int p1, long p2) {}
    private VirtualStylusButtonEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getAction() { return 0; }
    public int getButtonCode() { return 0; }
    public long getEventTimeNanos() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Action {
    }

    public static final class Builder {
        private int mAction;
        private int mButtonCode;
        private long mEventTimeNanos;
        public Builder() {}
        public android.hardware.input.VirtualStylusButtonEvent build() { return null; }
        public android.hardware.input.VirtualStylusButtonEvent.Builder setAction(int p0) { return null; }
        public android.hardware.input.VirtualStylusButtonEvent.Builder setButtonCode(int p0) { return null; }
        public android.hardware.input.VirtualStylusButtonEvent.Builder setEventTimeNanos(long p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Button {
    }
}
