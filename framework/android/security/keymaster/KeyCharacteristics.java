package android.security.keymaster;

public class KeyCharacteristics implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.keymaster.KeyCharacteristics> CREATOR = null;
    public android.security.keymaster.KeymasterArguments hwEnforced;
    public android.security.keymaster.KeymasterArguments swEnforced;
    public KeyCharacteristics() {}
    protected KeyCharacteristics(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean getBoolean(int p0) { return false; }
    public java.util.Date getDate(int p0) { return null; }
    public java.lang.Integer getEnum(int p0) { return null; }
    public java.util.List<java.lang.Integer> getEnums(int p0) { return null; }
    public long getUnsignedInt(int p0, long p1) { return 0L; }
    public java.util.List<java.math.BigInteger> getUnsignedLongs(int p0) { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void shallowCopyFrom(android.security.keymaster.KeyCharacteristics p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
