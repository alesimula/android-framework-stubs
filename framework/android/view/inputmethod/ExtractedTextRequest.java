package android.view.inputmethod;

public class ExtractedTextRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.ExtractedTextRequest> CREATOR = null;
    public int flags;
    public int hintMaxChars;
    public int hintMaxLines;
    public int token;
    public ExtractedTextRequest() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
