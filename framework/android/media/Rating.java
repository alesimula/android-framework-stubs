package android.media;

public final class Rating implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.Rating> CREATOR = null;
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final java.lang.String TAG = "Rating";
    private final int mRatingStyle = 0;
    private final float mRatingValue = 0.0f;
    private Rating(int p0, float p1) {}
    public static android.media.Rating newHeartRating(boolean p0) { return null; }
    public static android.media.Rating newPercentageRating(float p0) { return null; }
    public static android.media.Rating newStarRating(int p0, float p1) { return null; }
    public static android.media.Rating newThumbRating(boolean p0) { return null; }
    public static android.media.Rating newUnratedRating(int p0) { return null; }
    public int describeContents() { return 0; }
    public float getPercentRating() { return 0.0f; }
    public int getRatingStyle() { return 0; }
    public float getStarRating() { return 0.0f; }
    public boolean hasHeart() { return false; }
    public boolean isRated() { return false; }
    public boolean isThumbUp() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StarStyle {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Style {
    }
}
