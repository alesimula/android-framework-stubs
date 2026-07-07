package android.app.contentsuggestions;

@android.annotation.SystemApi
public final class ClassificationsRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.contentsuggestions.ClassificationsRequest> CREATOR = null;
    private final android.os.Bundle mExtras = null;
    private final java.util.List<android.app.contentsuggestions.ContentSelection> mSelections = null;
    private ClassificationsRequest(java.util.List<android.app.contentsuggestions.ContentSelection> p0, android.os.Bundle p1) {}
    public int describeContents() { return 0; }
    public android.os.Bundle getExtras() { return null; }
    public java.util.List<android.app.contentsuggestions.ContentSelection> getSelections() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private android.os.Bundle mExtras;
        private final java.util.List<android.app.contentsuggestions.ContentSelection> mSelections = null;
        public Builder(java.util.List<android.app.contentsuggestions.ContentSelection> p0) {}
        public android.app.contentsuggestions.ClassificationsRequest build() { return null; }
        public android.app.contentsuggestions.ClassificationsRequest.Builder setExtras(android.os.Bundle p0) { return null; }
    }
}
