package android.service.resolver;

@android.annotation.SystemApi
public final class ResolverTarget implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.resolver.ResolverTarget> CREATOR = null;
    private static final java.lang.String TAG = "ResolverTarget";
    private float mChooserScore;
    private float mLaunchScore;
    private float mRecencyScore;
    private float mSelectProbability;
    private float mTimeSpentScore;
    public ResolverTarget() {}
    ResolverTarget(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public float getChooserScore() { return 0.0f; }
    public float getLaunchScore() { return 0.0f; }
    public float getRecencyScore() { return 0.0f; }
    public float getSelectProbability() { return 0.0f; }
    public float getTimeSpentScore() { return 0.0f; }
    public void setChooserScore(float p0) {}
    public void setLaunchScore(float p0) {}
    public void setRecencyScore(float p0) {}
    public void setSelectProbability(float p0) {}
    public void setTimeSpentScore(float p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
