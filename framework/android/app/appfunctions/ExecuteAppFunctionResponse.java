package android.app.appfunctions;

public final class ExecuteAppFunctionResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.appfunctions.ExecuteAppFunctionResponse> CREATOR = null;
    public static final java.lang.String PROPERTY_RETURN_VALUE = "androidAppfunctionsReturnValue";
    private final android.os.Bundle mExtras = null;
    private final android.app.appfunctions.GenericDocumentWrapper mResultDocumentWrapper = null;
    private final java.util.List<android.app.appfunctions.AppFunctionUriGrant> mUriGrants = null;
    public ExecuteAppFunctionResponse(android.app.appsearch.GenericDocument p0) {}
    public ExecuteAppFunctionResponse(android.app.appsearch.GenericDocument p0, android.os.Bundle p1) {}
    public ExecuteAppFunctionResponse(android.app.appsearch.GenericDocument p0, android.os.Bundle p1, java.util.List<android.app.appfunctions.AppFunctionUriGrant> p2) {}
    public int describeContents() { return 0; }
    public android.os.Bundle getExtras() { return null; }
    public int getResponseDataSize() { return 0; }
    public android.app.appsearch.GenericDocument getResultDocument() { return null; }
    public java.util.List<android.app.appfunctions.AppFunctionUriGrant> getUriGrants() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
