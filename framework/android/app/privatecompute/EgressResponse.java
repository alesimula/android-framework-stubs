package android.app.privatecompute;

public abstract class EgressResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.privatecompute.EgressResponse> CREATOR = null;
    static final int TYPE_ASSISTANT_QUERY = 1;
    private final int mType = 0;
    EgressResponse(int p0) {}
    public int describeContents() { return 0; }
    int getType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
