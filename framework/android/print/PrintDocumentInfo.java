package android.print;

public final class PrintDocumentInfo implements android.os.Parcelable {
    public static final int CONTENT_TYPE_DOCUMENT = 0;
    public static final int CONTENT_TYPE_PHOTO = 1;
    public static final int CONTENT_TYPE_UNKNOWN = -1;
    public static final android.os.Parcelable.Creator<android.print.PrintDocumentInfo> CREATOR = null;
    public static final int PAGE_COUNT_UNKNOWN = -1;
    private int mContentType;
    private long mDataSize;
    private java.lang.String mName;
    private int mPageCount;
    private PrintDocumentInfo() {}
    private PrintDocumentInfo(android.os.Parcel p0) {}
    private PrintDocumentInfo(android.print.PrintDocumentInfo p0) {}
    private java.lang.String contentTypeToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getContentType() { return 0; }
    public long getDataSize() { return 0L; }
    public java.lang.String getName() { return null; }
    public int getPageCount() { return 0; }
    public int hashCode() { return 0; }
    public void setDataSize(long p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.print.PrintDocumentInfo mPrototype = null;
        public Builder(java.lang.String p0) {}
        public android.print.PrintDocumentInfo build() { return null; }
        public android.print.PrintDocumentInfo.Builder setContentType(int p0) { return null; }
        public android.print.PrintDocumentInfo.Builder setPageCount(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentType {
    }
}
