package android.service.contentcapture.conversation;

public final class NodeExtraMetadataSpec implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.contentcapture.conversation.NodeExtraMetadataSpec> CREATOR = null;
    private final java.lang.String mExitLocusId = null;
    private final java.lang.String mResourceIdExtrasKey = null;
    private NodeExtraMetadataSpec(android.os.Parcel p0) {}
    private NodeExtraMetadataSpec(android.service.contentcapture.conversation.NodeExtraMetadataSpec.Builder p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getExitLocusId() { return null; }
    public java.lang.String getResourceIdExtrasKey() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mExitLocusId;
        private java.lang.String mResourceIdExtrasKey;
        public Builder() {}
        public Builder(android.service.contentcapture.conversation.NodeExtraMetadataSpec p0) {}
        public android.service.contentcapture.conversation.NodeExtraMetadataSpec build() { return null; }
        public android.service.contentcapture.conversation.NodeExtraMetadataSpec.Builder setExitLocusId(java.lang.String p0) { return null; }
        public android.service.contentcapture.conversation.NodeExtraMetadataSpec.Builder setResourceIdExtrasKey(java.lang.String p0) { return null; }
    }
}
