package android.hardware.radio.sim;

public class PhonebookCapacity implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.PhonebookCapacity> CREATOR = null;
    public int maxAdditionalNumberLen;
    public int maxAdditionalNumberRecords;
    public int maxAdnRecords;
    public int maxEmailLen;
    public int maxEmailRecords;
    public int maxNameLen;
    public int maxNumberLen;
    public int usedAdditionalNumberRecords;
    public int usedAdnRecords;
    public int usedEmailRecords;
    public PhonebookCapacity() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
