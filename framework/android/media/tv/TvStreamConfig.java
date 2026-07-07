package android.media.tv;

@android.annotation.SystemApi
public class TvStreamConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.TvStreamConfig> CREATOR = null;
    public static final int STREAM_TYPE_BUFFER_PRODUCER = 2;
    public static final int STREAM_TYPE_INDEPENDENT_VIDEO_SOURCE = 1;
    static final java.lang.String TAG = null;
    private int mGeneration;
    private int mMaxHeight;
    private int mMaxWidth;
    private int mStreamId;
    private int mType;
    private TvStreamConfig() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getGeneration() { return 0; }
    public int getMaxHeight() { return 0; }
    public int getMaxWidth() { return 0; }
    public int getStreamId() { return 0; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.Integer mGeneration;
        private java.lang.Integer mMaxHeight;
        private java.lang.Integer mMaxWidth;
        private java.lang.Integer mStreamId;
        private java.lang.Integer mType;
        public Builder() {}
        public android.media.tv.TvStreamConfig build() { return null; }
        public android.media.tv.TvStreamConfig.Builder generation(int p0) { return null; }
        public android.media.tv.TvStreamConfig.Builder maxHeight(int p0) { return null; }
        public android.media.tv.TvStreamConfig.Builder maxWidth(int p0) { return null; }
        public android.media.tv.TvStreamConfig.Builder streamId(int p0) { return null; }
        public android.media.tv.TvStreamConfig.Builder type(int p0) { return null; }
    }
}
