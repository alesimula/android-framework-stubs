package android.os.multisensory;

public final class MultisensoryContinuousEffectModifier implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.multisensory.MultisensoryContinuousEffectModifier> CREATOR = null;
    public static final int TARGET_PARAMETER_INTENSITY = 0;
    public static final int TARGET_PARAMETER_SHARPNESS = 1;
    private float mModifierValue;
    private long mRampDurationMillis;
    private final int mTargetParameter = 0;
    public MultisensoryContinuousEffectModifier(int p0) {}
    private MultisensoryContinuousEffectModifier(android.os.Parcel p0) {}
    public static java.lang.String targetParameterToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public float getModifierValue() { return 0.0f; }
    public long getRampDurationMillis() { return 0L; }
    public int getTargetParameter() { return 0; }
    public void setModifierValue(float p0) {}
    public void setRampDuration(long p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TargetParameter {
    }
}
