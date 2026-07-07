package android.service.autofill;

public final class LuhnChecksumValidator extends android.service.autofill.InternalValidator implements android.service.autofill.Validator, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.autofill.LuhnChecksumValidator> CREATOR = null;
    private static final java.lang.String TAG = "LuhnChecksumValidator";
    private final android.view.autofill.AutofillId[] mIds = null;
    public LuhnChecksumValidator(android.view.autofill.AutofillId... p0) { super(); }
    private static boolean isLuhnChecksumValid(java.lang.String p0) { return false; }
    public int describeContents() { return 0; }
    public boolean isValid(android.service.autofill.ValueFinder p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
