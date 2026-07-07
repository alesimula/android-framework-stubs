package android.window.sharedsurface;

abstract class AnimationDescription implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.sharedsurface.AnimationDescription> CREATOR = null;
    static final int DESCRIPTION_SPRING = 0;
    static final int DESCRIPTION_TIME = 1;
    protected final int mDescriptionType = 0;
    AnimationDescription(int p0) {}
    abstract android.window.sharedsurface.CommonAnimator createAnimator();
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
