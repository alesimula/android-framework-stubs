package android.media;

public class AudioMixUpdate implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioMixUpdate> CREATOR = null;
    public android.media.AudioMix audioMix;
    public android.media.AudioMixMatchCriterion[] newCriteria;
    public AudioMixUpdate() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
