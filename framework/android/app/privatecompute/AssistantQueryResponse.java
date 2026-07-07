package android.app.privatecompute;

public final class AssistantQueryResponse extends android.app.privatecompute.EgressResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.privatecompute.AssistantQueryResponse> CREATOR = null;
    private final java.lang.String mQueryId = null;
    private final java.lang.String mQueryResponse = null;
    private AssistantQueryResponse(android.app.privatecompute.AssistantQueryResponse.Builder p0) { super(0); }
    AssistantQueryResponse(android.os.Parcel p0) { super(0); }
    public int describeContents() { return 0; }
    public java.lang.String getQueryId() { return null; }
    public java.lang.String getQueryResponse() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final java.lang.String mQueryId = null;
        private java.lang.String mQueryResponse;
        public Builder(java.lang.String p0) {}
        public android.app.privatecompute.AssistantQueryResponse build() { return null; }
        public android.app.privatecompute.AssistantQueryResponse.Builder setQueryResponse(java.lang.String p0) { return null; }
    }
}
