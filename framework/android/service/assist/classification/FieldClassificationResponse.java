package android.service.assist.classification;

@android.annotation.SystemApi
public final class FieldClassificationResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.assist.classification.FieldClassificationResponse> CREATOR = null;
    private final java.util.Set<android.service.assist.classification.FieldClassification> mClassifications = null;
    FieldClassificationResponse(android.os.Parcel p0) {}
    public FieldClassificationResponse(java.util.Set<android.service.assist.classification.FieldClassification> p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    static java.util.Set<android.service.assist.classification.FieldClassification> unparcelClassifications(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public java.util.Set<android.service.assist.classification.FieldClassification> getClassifications() { return null; }
    void parcelClassifications(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
