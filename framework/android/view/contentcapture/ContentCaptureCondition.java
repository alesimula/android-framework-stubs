package android.view.contentcapture;

public final class ContentCaptureCondition implements android.os.Parcelable {
    public static final android.view.contentcapture.ContentCaptureCondition CONDITION_ENABLE_EXPORTING_VIRTUAL_CHILDREN = null;
    public static final android.os.Parcelable.Creator<android.view.contentcapture.ContentCaptureCondition> CREATOR = null;
    private static final int FLAG_ENABLE_EXPORTING_VIRTUAL_CHILDREN = 4;
    public static final int FLAG_IS_REGEX = 2;
    private static final android.content.LocusId LOCUS_ID_NOT_EXIST = null;
    private final int mFlags = 0;
    private final android.content.LocusId mLocusId = null;
    public ContentCaptureCondition(android.content.LocusId p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getFlags() { return 0; }
    public android.content.LocusId getLocusId() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Flags {
    }
}
