package android.app.privatecompute;

public final class AssistantQueryRequest extends android.app.privatecompute.EgressRequest<android.app.privatecompute.AssistantQueryResponse> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.privatecompute.AssistantQueryRequest> CREATOR = null;
    private final android.app.privatecompute.AssistantQueryRequest.Query mQuery = null;
    private AssistantQueryRequest(android.app.privatecompute.AssistantQueryRequest.Builder p0) { super(0); }
    AssistantQueryRequest(android.os.Parcel p0) { super(0); }
    public int describeContents() { return 0; }
    public android.app.privatecompute.AssistantQueryRequest.Query getQuery() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.app.privatecompute.AssistantQueryRequest.Query mQuery = null;
        public Builder(android.app.privatecompute.AssistantQueryRequest.Query p0) {}
        public android.app.privatecompute.AssistantQueryRequest build() { return null; }
    }

    public static final class Query implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.privatecompute.AssistantQueryRequest.Query> CREATOR = null;
        private final java.lang.String mQueryId = null;
        private final java.lang.String mQueryString = null;
        private final java.lang.String mSessionId = null;
        private Query(android.app.privatecompute.AssistantQueryRequest.Query.Builder p0) {}
        private Query(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public java.lang.String getQueryId() { return null; }
        public java.lang.String getQueryString() { return null; }
        public java.lang.String getSessionId() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private java.lang.String mQueryId;
            private final java.lang.String mQueryString = null;
            private final java.lang.String mSessionId = null;
            public Builder(java.lang.String p0, java.lang.String p1) {}
            public android.app.privatecompute.AssistantQueryRequest.Query build() { return null; }
            public android.app.privatecompute.AssistantQueryRequest.Query.Builder setQueryId(java.lang.String p0) { return null; }
        }
    }
}
