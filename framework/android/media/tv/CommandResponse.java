package android.media.tv;

public final class CommandResponse extends android.media.tv.BroadcastInfoResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.CommandResponse> CREATOR = null;
    private static final int RESPONSE_TYPE = 7;
    public static final java.lang.String RESPONSE_TYPE_JSON = "json";
    public static final java.lang.String RESPONSE_TYPE_XML = "xml";
    private final java.lang.String mResponse = null;
    private final java.lang.String mResponseType = null;
    public CommandResponse(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) { super(0, (android.os.Parcel)null); }
    CommandResponse(android.os.Parcel p0) { super(0, (android.os.Parcel)null); }
    static android.media.tv.CommandResponse createFromParcelBody(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public java.lang.String getResponse() { return null; }
    public java.lang.String getResponseType() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
