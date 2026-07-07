package android.view.contentcapture;

public final class DataRemovalRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.contentcapture.DataRemovalRequest> CREATOR = null;
    public static final int FLAG_IS_PREFIX = 1;
    private final boolean mForEverything = false;
    private java.util.ArrayList<android.view.contentcapture.DataRemovalRequest.LocusIdRequest> mLocusIdRequests;
    private final java.lang.String mPackageName = null;
    private DataRemovalRequest(android.os.Parcel p0) {}
    private DataRemovalRequest(android.view.contentcapture.DataRemovalRequest.Builder p0) {}
    public int describeContents() { return 0; }
    public java.util.List<android.view.contentcapture.DataRemovalRequest.LocusIdRequest> getLocusIdRequests() { return null; }
    public java.lang.String getPackageName() { return null; }
    public boolean isForEverything() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mDestroyed;
        private android.util.IntArray mFlags;
        private boolean mForEverything;
        private java.util.ArrayList<android.content.LocusId> mLocusIds;
        public Builder() {}
        private void throwIfDestroyed() {}
        public android.view.contentcapture.DataRemovalRequest.Builder addLocusId(android.content.LocusId p0, int p1) { return null; }
        public android.view.contentcapture.DataRemovalRequest build() { return null; }
        public android.view.contentcapture.DataRemovalRequest.Builder forEverything() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Flags {
    }

    public final class LocusIdRequest {
        private final int mFlags = 0;
        private final android.content.LocusId mLocusId = null;
        private LocusIdRequest(android.view.contentcapture.DataRemovalRequest p0, android.content.LocusId p1, int p2) {}
        public int getFlags() { return 0; }
        public android.content.LocusId getLocusId() { return null; }
    }
}
