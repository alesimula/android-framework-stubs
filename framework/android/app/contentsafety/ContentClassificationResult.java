package android.app.contentsafety;

public final class ContentClassificationResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.contentsafety.ContentClassificationResult> CREATOR = null;
    public static final int TYPE_ALLOWED = 1;
    public static final int TYPE_BLOCKED = 2;
    public static final int TYPE_UNCLASSIFIED = 0;
    public static final int TYPE_WARNING = 3;
    private final android.content.LocusId mLocusId = null;
    private final int mType = 0;
    public ContentClassificationResult(android.content.LocusId p0, int p1) {}
    private ContentClassificationResult(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.content.LocusId getLocusId() { return null; }
    public int getType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ClassificationType {
    }
}
