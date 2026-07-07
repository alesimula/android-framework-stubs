package android.os;

@android.annotation.SystemApi
public final class ParcelableHolder implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.ParcelableHolder> CREATOR = null;
    private android.os.Parcel mParcel;
    private android.os.Parcelable mParcelable;
    private int mStability;
    private ParcelableHolder() {}
    public ParcelableHolder(int p0) {}
    public int describeContents() { return 0; }
    public <T extends android.os.Parcelable> T getParcelable(java.lang.Class<T> p0) { return null; }
    public int getStability() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setParcelable(android.os.Parcelable p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
