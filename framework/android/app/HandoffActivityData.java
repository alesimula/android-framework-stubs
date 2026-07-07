package android.app;

public final class HandoffActivityData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.HandoffActivityData> CREATOR = null;
    private final android.content.ComponentName mComponentName = null;
    private final android.os.PersistableBundle mExtras = null;
    private final android.net.Uri mFallbackUri = null;
    private HandoffActivityData(android.app.HandoffActivityData.Builder p0) {}
    private HandoffActivityData(android.net.Uri p0) {}
    private HandoffActivityData(android.os.Parcel p0) {}
    public static android.app.HandoffActivityData createWebHandoff(android.net.Uri p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.content.ComponentName getComponentName() { return null; }
    public android.os.PersistableBundle getExtras() { return null; }
    public android.net.Uri getFallbackUri() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.content.ComponentName mComponentName;
        private android.os.PersistableBundle mExtras;
        private android.net.Uri mFallbackUri;
        public Builder(android.content.ComponentName p0) {}
        public android.app.HandoffActivityData build() { return null; }
        public android.app.HandoffActivityData.Builder setExtras(android.os.PersistableBundle p0) { return null; }
        public android.app.HandoffActivityData.Builder setFallbackUri(android.net.Uri p0) { return null; }
    }
}
