package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualMouseRelativeEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualMouseRelativeEvent> CREATOR = null;
    private final long mEventTimeNanos = 0L;
    private final float mRelativeX = 0.0f;
    private final float mRelativeY = 0.0f;
    private VirtualMouseRelativeEvent(float p0, float p1, long p2) {}
    private VirtualMouseRelativeEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getEventTimeNanos() { return 0L; }
    public float getRelativeX() { return 0.0f; }
    public float getRelativeY() { return 0.0f; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mEventTimeNanos;
        private float mRelativeX;
        private float mRelativeY;
        public Builder() {}
        public android.hardware.input.VirtualMouseRelativeEvent build() { return null; }
        public android.hardware.input.VirtualMouseRelativeEvent.Builder setEventTimeNanos(long p0) { return null; }
        public android.hardware.input.VirtualMouseRelativeEvent.Builder setRelativeX(float p0) { return null; }
        public android.hardware.input.VirtualMouseRelativeEvent.Builder setRelativeY(float p0) { return null; }
    }
}
