package android.hardware.input;

public final class KeyboardLayoutSelectionResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.KeyboardLayoutSelectionResult> CREATOR = null;
    public static final android.hardware.input.KeyboardLayoutSelectionResult FAILED = null;
    public static final int LAYOUT_SELECTION_CRITERIA_DEFAULT = 4;
    public static final int LAYOUT_SELECTION_CRITERIA_DEVICE = 2;
    public static final int LAYOUT_SELECTION_CRITERIA_UNSPECIFIED = 0;
    public static final int LAYOUT_SELECTION_CRITERIA_USER = 1;
    public static final int LAYOUT_SELECTION_CRITERIA_VIRTUAL_KEYBOARD = 3;
    private final java.lang.String mLayoutDescriptor = null;
    private final int mSelectionCriteria = 0;
    KeyboardLayoutSelectionResult(android.os.Parcel p0) {}
    public KeyboardLayoutSelectionResult(java.lang.String p0, int p1) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public static java.lang.String layoutSelectionCriteriaToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getLayoutDescriptor() { return null; }
    public int getSelectionCriteria() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LayoutSelectionCriteria {
    }
}
