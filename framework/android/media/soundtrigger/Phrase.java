package android.media.soundtrigger;

public class Phrase implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.soundtrigger.Phrase> CREATOR = null;
    public int id;
    public java.lang.String locale;
    public int recognitionModes;
    public java.lang.String text;
    public int[] users;
    public Phrase() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
