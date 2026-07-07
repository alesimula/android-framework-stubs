package android.hardware.tv.tuner;

public final class DvrSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DvrSettings> CREATOR = null;
    public static final int playback = 1;
    public static final int record = 0;
    private int _tag;
    private java.lang.Object _value;
    public DvrSettings() {}
    private DvrSettings(int p0, java.lang.Object p1) {}
    private DvrSettings(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.tv.tuner.DvrSettings playback(android.hardware.tv.tuner.PlaybackSettings p0) { return null; }
    public static android.hardware.tv.tuner.DvrSettings record(android.hardware.tv.tuner.RecordSettings p0) { return null; }
    public int describeContents() { return 0; }
    public android.hardware.tv.tuner.PlaybackSettings getPlayback() { return null; }
    public android.hardware.tv.tuner.RecordSettings getRecord() { return null; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setPlayback(android.hardware.tv.tuner.PlaybackSettings p0) {}
    public void setRecord(android.hardware.tv.tuner.RecordSettings p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int playback = 1;
        public static final int record = 0;
    }
}
