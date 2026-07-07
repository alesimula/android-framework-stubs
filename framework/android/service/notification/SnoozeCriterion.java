package android.service.notification;

@android.annotation.SystemApi
public final class SnoozeCriterion implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.notification.SnoozeCriterion> CREATOR = null;
    private final java.lang.CharSequence mConfirmation = null;
    private final java.lang.CharSequence mExplanation = null;
    private final java.lang.String mId = null;
    protected SnoozeCriterion(android.os.Parcel p0) {}
    public SnoozeCriterion(java.lang.String p0, java.lang.CharSequence p1, java.lang.CharSequence p2) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.CharSequence getConfirmation() { return null; }
    public java.lang.CharSequence getExplanation() { return null; }
    public java.lang.String getId() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
