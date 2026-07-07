package android.hardware.lights;

public final class LightState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.lights.LightState> CREATOR = null;
    private final int mColor = 0;
    private final int mPlayerId = 0;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public LightState(int p0) {}
    public LightState(int p0, int p1) {}
    private LightState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getColor() { return 0; }
    public int getPlayerId() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mIsForPlayerId;
        private int mValue;
        public Builder() {}
        public android.hardware.lights.LightState build() { return null; }
        public android.hardware.lights.LightState.Builder setColor(int p0) { return null; }
        public android.hardware.lights.LightState.Builder setPlayerId(int p0) { return null; }
    }
}
