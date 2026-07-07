package android.telephony;

public final class RadioAccessSpecifier implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.RadioAccessSpecifier> CREATOR = null;
    private int[] mBands;
    private int[] mChannels;
    private int mRadioAccessNetwork;
    public RadioAccessSpecifier(int p0, int[] p1, int[] p2) {}
    private RadioAccessSpecifier(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int[] getBands() { return null; }
    public int[] getChannels() { return null; }
    public int getRadioAccessNetwork() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
