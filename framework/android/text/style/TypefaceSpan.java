package android.text.style;

public class TypefaceSpan extends android.text.style.MetricAffectingSpan implements android.text.ParcelableSpan {
    private final java.lang.String mFamily = null;
    private final android.graphics.Typeface mTypeface = null;
    public TypefaceSpan(android.graphics.Typeface p0) { super(); }
    public TypefaceSpan(android.os.Parcel p0) { super(); }
    public TypefaceSpan(java.lang.String p0) { super(); }
    private TypefaceSpan(java.lang.String p0, android.graphics.Typeface p1) { super(); }
    private void applyFontFamily(android.graphics.Paint p0, java.lang.String p1) {}
    private void updateTypeface(android.graphics.Paint p0) {}
    public int describeContents() { return 0; }
    public java.lang.String getFamily() { return null; }
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
    public android.graphics.Typeface getTypeface() { return null; }
    public java.lang.String toString() { return null; }
    public void updateDrawState(android.text.TextPaint p0) {}
    public void updateMeasureState(android.text.TextPaint p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
}
