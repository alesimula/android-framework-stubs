package android.app.contentsafety;

public final class ClassifiableContent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.contentsafety.ClassifiableContent> CREATOR = null;
    private final android.os.ParcelFileDescriptor mData = null;
    private final android.content.LocusId mLocusId = null;
    private final java.lang.String mMimeType = null;
    private java.lang.String mOriginatingPackageName;
    private final android.net.Uri mUri = null;
    private ClassifiableContent(android.content.LocusId p0, java.lang.String p1, android.net.Uri p2, android.os.ParcelFileDescriptor p3) {}
    private ClassifiableContent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.os.ParcelFileDescriptor getData() { return null; }
    public android.content.LocusId getId() { return null; }
    public java.lang.String getMimeType() { return null; }
    public java.lang.String getOriginatingPackageName() { return null; }
    public android.net.Uri getUri() { return null; }
    public void setOriginatingPackageName(java.lang.String p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.os.ParcelFileDescriptor mData;
        private android.content.LocusId mLocusId;
        private java.lang.String mMimeType;
        private android.net.Uri mUri;
        public Builder(android.content.LocusId p0, java.lang.String p1) {}
        public android.app.contentsafety.ClassifiableContent build() { return null; }
        public android.app.contentsafety.ClassifiableContent.Builder setData(android.os.ParcelFileDescriptor p0) { return null; }
        public android.app.contentsafety.ClassifiableContent.Builder setUri(android.net.Uri p0) { return null; }
    }
}
