package android.media.tv;

public final class CommandRequest extends android.media.tv.BroadcastInfoRequest implements android.os.Parcelable {
    public static final java.lang.String ARGUMENT_TYPE_JSON = "json";
    public static final java.lang.String ARGUMENT_TYPE_XML = "xml";
    public static final android.os.Parcelable.Creator<android.media.tv.CommandRequest> CREATOR = null;
    private static final int REQUEST_TYPE = 7;
    private final java.lang.String mArgumentType = null;
    private final java.lang.String mArguments = null;
    private final java.lang.String mName = null;
    private final java.lang.String mNamespace = null;
    public CommandRequest(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) { super(0, (android.os.Parcel)null); }
    CommandRequest(android.os.Parcel p0) { super(0, (android.os.Parcel)null); }
    static android.media.tv.CommandRequest createFromParcelBody(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public java.lang.String getArgumentType() { return null; }
    public java.lang.String getArguments() { return null; }
    public java.lang.String getName() { return null; }
    public java.lang.String getNamespace() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
