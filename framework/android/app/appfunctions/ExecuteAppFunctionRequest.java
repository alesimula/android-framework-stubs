package android.app.appfunctions;

public final class ExecuteAppFunctionRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.appfunctions.ExecuteAppFunctionRequest> CREATOR = null;
    private final android.app.appfunctions.AppFunctionActivityId mActivityId = null;
    private final android.app.AppInteractionAttribution mAttribution = null;
    private final android.os.Bundle mExtras = null;
    private final java.lang.String mFunctionIdentifier = null;
    private final android.app.appfunctions.GenericDocumentWrapper mParameters = null;
    private final java.lang.String mTargetPackageName = null;
    private ExecuteAppFunctionRequest(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.app.appfunctions.GenericDocumentWrapper p3, android.app.AppInteractionAttribution p4, android.app.appfunctions.AppFunctionActivityId p5) {}
    public android.app.appfunctions.ExecuteAppFunctionRequest copyWithoutAttribution() { return null; }
    public int describeContents() { return 0; }
    public android.app.appfunctions.AppFunctionActivityId getActivityId() { return null; }
    public android.app.AppInteractionAttribution getAttribution() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.String getFunctionIdentifier() { return null; }
    public android.app.appsearch.GenericDocument getParameters() { return null; }
    public int getRequestDataSize() { return 0; }
    public java.lang.String getTargetPackageName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.app.appfunctions.AppFunctionActivityId mActivityId;
        private android.app.AppInteractionAttribution mAttribution;
        private android.os.Bundle mExtras;
        private final java.lang.String mFunctionIdentifier = null;
        private final java.lang.String mTargetPackageName = null;
        public Builder(android.app.appfunctions.AppFunctionName p0) {}
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public android.app.appfunctions.ExecuteAppFunctionRequest build() { return null; }
        public android.app.appfunctions.ExecuteAppFunctionRequest.Builder setActivityId(android.app.appfunctions.AppFunctionActivityId p0) { return null; }
        public android.app.appfunctions.ExecuteAppFunctionRequest.Builder setAttribution(android.app.AppInteractionAttribution p0) { return null; }
        public android.app.appfunctions.ExecuteAppFunctionRequest.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.app.appfunctions.ExecuteAppFunctionRequest.Builder setParameters(android.app.appsearch.GenericDocument p0) { return null; }
    }
}
