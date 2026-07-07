package android.view.inputmethod;

public class ExtractedText implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.ExtractedText> CREATOR = null;
    public static final int FLAG_SELECTING = 2;
    public static final int FLAG_SINGLE_LINE = 1;
    public int flags;
    public java.lang.CharSequence hint;
    public int partialEndOffset;
    public int partialStartOffset;
    public int selectionEnd;
    public int selectionStart;
    public int startOffset;
    public java.lang.CharSequence text;
    public ExtractedText() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
