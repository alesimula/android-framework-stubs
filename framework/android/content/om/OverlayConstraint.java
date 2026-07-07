package android.content.om;

public final class OverlayConstraint implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.om.OverlayConstraint> CREATOR = null;
    public static final int TYPE_DEVICE_ID = 1;
    public static final int TYPE_DISPLAY_ID = 0;
    private final int mType = 0;
    private final int mValue = 0;
    public OverlayConstraint(int p0, int p1) {}
    private OverlayConstraint(android.os.Parcel p0) {}
    public static java.lang.String constraintsToString(java.util.List<android.content.om.OverlayConstraint> p0) { return null; }
    private static java.lang.String typeToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getType() { return 0; }
    public int getValue() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ConstraintType {
    }
}
