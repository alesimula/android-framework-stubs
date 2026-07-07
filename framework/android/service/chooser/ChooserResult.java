package android.service.chooser;

public final class ChooserResult implements android.os.Parcelable {
    public static final int CHOOSER_RESULT_COPY = 1;
    public static final int CHOOSER_RESULT_EDIT = 2;
    public static final int CHOOSER_RESULT_SELECTED_COMPONENT = 0;
    public static final int CHOOSER_RESULT_UNKNOWN = -1;
    public static final android.os.Parcelable.Creator<android.service.chooser.ChooserResult> CREATOR = null;
    public static final long SEND_CHOOSER_RESULT = 263474465L;
    private final boolean mIsShortcut = false;
    private final android.content.ComponentName mSelectedComponent = null;
    private final int mType = 0;
    public ChooserResult(int p0, android.content.ComponentName p1, boolean p2) {}
    private ChooserResult(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.content.ComponentName getSelectedComponent() { return null; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public boolean isShortcut() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultType {
    }
}
