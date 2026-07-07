package android.app.slice;

@java.lang.Deprecated
public final class SliceItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.slice.SliceItem> CREATOR = null;
    public static final java.lang.String FORMAT_ACTION = "action";
    public static final java.lang.String FORMAT_BUNDLE = "bundle";
    public static final java.lang.String FORMAT_IMAGE = "image";
    public static final java.lang.String FORMAT_INT = "int";
    public static final java.lang.String FORMAT_LONG = "long";
    public static final java.lang.String FORMAT_REMOTE_INPUT = "input";
    public static final java.lang.String FORMAT_SLICE = "slice";
    public static final java.lang.String FORMAT_TEXT = "text";
    private static final java.lang.String TAG = "SliceItem";
    private final java.lang.String mFormat = null;
    protected java.lang.String[] mHints;
    private final java.lang.Object mObj = null;
    private final java.lang.String mSubType = null;
    public SliceItem(android.app.PendingIntent p0, android.app.slice.Slice p1, java.lang.String p2, java.lang.String p3, java.lang.String[] p4) {}
    public SliceItem(android.os.Parcel p0) {}
    public SliceItem(java.lang.Object p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3) {}
    public SliceItem(java.lang.Object p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3) {}
    private static java.lang.String getBaseType(java.lang.String p0) { return null; }
    private static java.lang.Object readObj(java.lang.String p0, android.os.Parcel p1) { return null; }
    private static void writeObj(android.os.Parcel p0, int p1, java.lang.Object p2, java.lang.String p3) {}
    public int describeContents() { return 0; }
    public android.app.PendingIntent getAction() { return null; }
    public android.os.Bundle getBundle() { return null; }
    public java.lang.String getFormat() { return null; }
    public java.util.List<java.lang.String> getHints() { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public int getInt() { return 0; }
    public long getLong() { return 0L; }
    public android.app.RemoteInput getRemoteInput() { return null; }
    public android.widget.RemoteViews getRemoteView() { return null; }
    public android.app.slice.Slice getSlice() { return null; }
    public java.lang.String getSubType() { return null; }
    public java.lang.CharSequence getText() { return null; }
    public boolean hasAnyHints(java.lang.String[] p0) { return false; }
    public boolean hasHint(java.lang.String p0) { return false; }
    public boolean hasHints(java.lang.String[] p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SliceType {
    }
}
