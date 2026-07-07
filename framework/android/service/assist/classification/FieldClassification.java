package android.service.assist.classification;

public final class FieldClassification implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.assist.classification.FieldClassification> CREATOR = null;
    private final android.view.autofill.AutofillId mAutofillId = null;
    private final java.util.Set<java.lang.String> mGroupHints = null;
    private final java.util.Set<java.lang.String> mHints = null;
    FieldClassification(android.os.Parcel p0) {}
    public FieldClassification(android.view.autofill.AutofillId p0, java.util.Set<java.lang.String> p1) {}
    @android.annotation.SystemApi
    public FieldClassification(android.view.autofill.AutofillId p0, java.util.Set<java.lang.String> p1, java.util.Set<java.lang.String> p2) {}
    @java.lang.Deprecated
    private void __metadata() {}
    static java.util.Set<java.lang.String> unparcelGroupHints(android.os.Parcel p0) { return null; }
    static java.util.Set<java.lang.String> unparcelHints(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public android.view.autofill.AutofillId getAutofillId() { return null; }
    @android.annotation.SystemApi
    public java.util.Set<java.lang.String> getGroupHints() { return null; }
    public java.util.Set<java.lang.String> getHints() { return null; }
    void parcelGroupHints(android.os.Parcel p0, int p1) {}
    void parcelHints(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
