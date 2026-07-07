package android.hardware.tv.tuner;

public class AudioPreselection implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.AudioPreselection> CREATOR = null;
    public boolean hasAudioDescription;
    public boolean hasDialogueEnhancement;
    public boolean hasSpokenSubtitles;
    public android.hardware.tv.tuner.AudioPreselectionLabel[] labels;
    public java.lang.String language;
    public int preselectionId;
    public int renderingIndication;
    public AudioPreselection() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
