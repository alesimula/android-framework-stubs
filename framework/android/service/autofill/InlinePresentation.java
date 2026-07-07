package android.service.autofill;

public final class InlinePresentation implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.autofill.InlinePresentation> CREATOR = null;
    private final android.widget.inline.InlinePresentationSpec mInlinePresentationSpec = null;
    private final boolean mPinned = false;
    private final android.app.slice.Slice mSlice = null;
    public InlinePresentation(android.app.slice.Slice p0, android.widget.inline.InlinePresentationSpec p1, boolean p2) {}
    InlinePresentation(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public static android.service.autofill.InlinePresentation createTooltipPresentation(android.app.slice.Slice p0, android.widget.inline.InlinePresentationSpec p1) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String[] getAutofillHints() { return null; }
    public android.widget.inline.InlinePresentationSpec getInlinePresentationSpec() { return null; }
    public android.app.slice.Slice getSlice() { return null; }
    public int hashCode() { return 0; }
    public boolean isPinned() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
