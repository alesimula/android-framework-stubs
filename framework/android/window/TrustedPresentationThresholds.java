package android.window;

public final class TrustedPresentationThresholds implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TrustedPresentationThresholds> CREATOR = null;
    public static final int SIGNAL_MODE_STRICT_OCCLUSION = 1;
    public static final int SIGNAL_MODE_TRUSTED_PRESENTATION = 0;
    private final float mMinAlpha = 0.0f;
    private final float mMinFractionRendered = 0.0f;
    private final int mSignalMode = 0;
    private final int mStabilityRequirementMs = 0;
    public TrustedPresentationThresholds(float p0, float p1, int p2) {}
    public TrustedPresentationThresholds(float p0, float p1, int p2, int p3) {}
    TrustedPresentationThresholds(android.os.Parcel p0) {}
    private void checkValid() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public float getMinAlpha() { return 0.0f; }
    public float getMinFractionRendered() { return 0.0f; }
    public int getSignalMode() { return 0; }
    public int getStabilityRequirementMillis() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SignalMode {
    }
}
