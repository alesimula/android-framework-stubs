package android.media.tv;

public final class SignalingDataResponse extends android.media.tv.BroadcastInfoResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.SignalingDataResponse> CREATOR = null;
    private static final int RESPONSE_TYPE = 9;
    private final java.util.List<android.media.tv.SignalingDataInfo> mSignalingDataInfoList = null;
    private final java.util.List<java.lang.String> mSignalingDataTypes = null;
    public SignalingDataResponse(int p0, int p1, int p2, java.util.List<java.lang.String> p3, java.util.List<android.media.tv.SignalingDataInfo> p4) { super(0, (android.os.Parcel)null); }
    SignalingDataResponse(android.os.Parcel p0) { super(0, (android.os.Parcel)null); }
    static android.media.tv.SignalingDataResponse createFromParcelBody(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public java.util.List<android.media.tv.SignalingDataInfo> getSignalingDataInfoList() { return null; }
    public java.util.List<java.lang.String> getSignalingDataTypes() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
