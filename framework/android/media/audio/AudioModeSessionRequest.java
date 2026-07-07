package android.media.audio;

public class AudioModeSessionRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.AudioModeSessionRequest> CREATOR = null;
    public android.content.AttributionSourceState attributionSource;
    public android.content.AttributionSourceState clientAttribution;
    public boolean isDisplayActiveUseCase;
    public int mode;
    public int[] noFocusModes;
    public AudioModeSessionRequest() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
