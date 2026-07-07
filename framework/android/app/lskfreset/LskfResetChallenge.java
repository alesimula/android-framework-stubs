package android.app.lskfreset;

public class LskfResetChallenge implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.lskfreset.LskfResetChallenge> CREATOR = null;
    public byte[] challengeData;
    public byte[] challengeMetadata;
    public int challengeType;
    public int version;
    public LskfResetChallenge() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
