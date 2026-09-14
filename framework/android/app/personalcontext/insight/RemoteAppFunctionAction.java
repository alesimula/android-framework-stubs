package android.app.personalcontext.insight;

public final class RemoteAppFunctionAction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.personalcontext.insight.RemoteAppFunctionAction> CREATOR = null;
    private final android.app.appfunctions.ExecuteAppFunctionRequest mRequest = null;
    private RemoteAppFunctionAction(android.app.appfunctions.ExecuteAppFunctionRequest p0) {}
    private RemoteAppFunctionAction(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.appfunctions.ExecuteAppFunctionRequest getRequest() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.app.appfunctions.ExecuteAppFunctionRequest mRequest;
        public Builder(android.app.appfunctions.ExecuteAppFunctionRequest p0) {}
        public android.app.personalcontext.insight.RemoteAppFunctionAction build() { return null; }
    }
}
