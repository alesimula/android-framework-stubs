package android.service.personalcontext.builtin;

public final class InlineAutofillData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.builtin.InlineAutofillData> CREATOR = null;
    private final android.view.autofill.AutofillId mFocusedId = null;
    private final android.view.inputmethod.InlineSuggestionsRequest mInlineSuggestionsRequest = null;
    private final int mSessionId = 0;
    private InlineAutofillData(android.os.Parcel p0) {}
    public InlineAutofillData(android.view.inputmethod.InlineSuggestionsRequest p0, int p1, android.view.autofill.AutofillId p2) {}
    public int describeContents() { return 0; }
    public android.view.autofill.AutofillId getFocusedId() { return null; }
    public android.view.inputmethod.InlineSuggestionsRequest getInlineSuggestionsRequest() { return null; }
    public int getSessionId() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
