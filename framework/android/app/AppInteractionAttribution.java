package android.app;

public final class AppInteractionAttribution implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.AppInteractionAttribution> CREATOR = null;
    public static final int INTERACTION_TYPE_OTHER = 0;
    public static final int INTERACTION_TYPE_USER_QUERY = 1;
    public static final int INTERACTION_TYPE_USER_SCHEDULED = 2;
    private final java.lang.String mCustomInteractionType = null;
    private final int mInteractionType = 0;
    private final android.net.Uri mInteractionUri = null;
    private AppInteractionAttribution(int p0, java.lang.String p1, android.net.Uri p2) {}
    private AppInteractionAttribution(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getCustomInteractionType() { return null; }
    public int getInteractionType() { return 0; }
    public android.net.Uri getInteractionUri() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mCustomInteractionType;
        private final int mInteractionType = 0;
        private android.net.Uri mInteractionUri;
        public Builder(int p0) {}
        public android.app.AppInteractionAttribution build() { return null; }
        public android.app.AppInteractionAttribution.Builder setCustomInteractionType(java.lang.String p0) { return null; }
        public android.app.AppInteractionAttribution.Builder setInteractionUri(android.net.Uri p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InteractionType {
    }
}
