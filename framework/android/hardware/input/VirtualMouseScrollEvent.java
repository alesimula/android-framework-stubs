package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualMouseScrollEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualMouseScrollEvent> CREATOR = null;
    private final long mEventTimeNanos = 0L;
    private final float mXAxisMovement = 0.0f;
    private final float mYAxisMovement = 0.0f;
    private VirtualMouseScrollEvent(float p0, float p1, long p2) {}
    private VirtualMouseScrollEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getEventTimeNanos() { return 0L; }
    public float getXAxisMovement() { return 0.0f; }
    public float getYAxisMovement() { return 0.0f; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mEventTimeNanos;
        private float mXAxisMovement;
        private float mYAxisMovement;
        public Builder() {}
        public android.hardware.input.VirtualMouseScrollEvent build() { return null; }
        public android.hardware.input.VirtualMouseScrollEvent.Builder setEventTimeNanos(long p0) { return null; }
        public android.hardware.input.VirtualMouseScrollEvent.Builder setXAxisMovement(float p0) { return null; }
        public android.hardware.input.VirtualMouseScrollEvent.Builder setYAxisMovement(float p0) { return null; }
    }
}
