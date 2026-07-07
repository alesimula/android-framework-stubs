package android.security.keymaster;

abstract class KeymasterArgument implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.keymaster.KeymasterArgument> CREATOR = null;
    public final int tag = 0;
    protected KeymasterArgument(int p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public abstract void writeValue(android.os.Parcel p0);
}
