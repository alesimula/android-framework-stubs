package android.app.privatecompute;

public abstract class EgressRequest<R extends android.app.privatecompute.EgressResponse> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.privatecompute.EgressRequest<?>> CREATOR = null;
    static final int USE_CASE_QUERY_ASSISTANT = 1;
    private final int mUseCase = 0;
    EgressRequest(int p0) {}
    public int describeContents() { return 0; }
    int getUseCase() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
