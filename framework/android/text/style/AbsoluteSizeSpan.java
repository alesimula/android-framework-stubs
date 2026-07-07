package android.text.style;

public class AbsoluteSizeSpan extends android.text.style.MetricAffectingSpan implements android.text.ParcelableSpan {
    private final boolean mDip = false;
    private final int mSize = 0;
    public AbsoluteSizeSpan(int p0) { super(); }
    public AbsoluteSizeSpan(int p0, boolean p1) { super(); }
    public AbsoluteSizeSpan(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    public boolean getDip() { return false; }
    public int getSize() { return 0; }
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
    public java.lang.String toString() { return null; }
    public void updateDrawState(android.text.TextPaint p0) {}
    public void updateMeasureState(android.text.TextPaint p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
}
