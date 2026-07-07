package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualRotaryEncoderScrollEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualRotaryEncoderScrollEvent> CREATOR = null;
    private final long mEventTimeNanos = 0L;
    private final float mScrollAmount = 0.0f;
    private VirtualRotaryEncoderScrollEvent(float p0, long p1) {}
    private VirtualRotaryEncoderScrollEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getEventTimeNanos() { return 0L; }
    public float getScrollAmount() { return 0.0f; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mEventTimeNanos;
        private float mScrollAmount;
        public Builder() {}
        public android.hardware.input.VirtualRotaryEncoderScrollEvent build() { return null; }
        public android.hardware.input.VirtualRotaryEncoderScrollEvent.Builder setEventTimeNanos(long p0) { return null; }
        public android.hardware.input.VirtualRotaryEncoderScrollEvent.Builder setScrollAmount(float p0) { return null; }
    }
}
