package android.widget;

public class TextInputTimePickerView extends android.widget.RelativeLayout {
    private static final int AM = 0;
    public static final int AMPM = 2;
    public static final int HOURS = 0;
    public static final int MINUTES = 1;
    private static final int PM = 1;
    private final android.widget.Spinner mAmPmSpinner = null;
    private final android.widget.TextView mErrorLabel = null;
    private boolean mErrorShowing;
    private final android.widget.EditText mHourEditText = null;
    private boolean mHourFormatStartsAtZero;
    private final android.widget.TextView mHourLabel = null;
    private final android.widget.TextView mInputSeparatorView = null;
    private boolean mIs24Hour;
    private android.widget.TextInputTimePickerView.OnValueTypedListener mListener;
    private final android.widget.EditText mMinuteEditText = null;
    private final android.widget.TextView mMinuteLabel = null;
    private boolean mTimeSet;
    public TextInputTimePickerView(android.content.Context p0) { super((android.content.Context)null); }
    public TextInputTimePickerView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TextInputTimePickerView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TextInputTimePickerView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private int getHourOfDayFromLocalizedHour(int p0) { return 0; }
    private boolean isTimeSet() { return false; }
    private boolean isValidLocalizedHour(int p0) { return false; }
    private boolean parseAndSetHourInternal(java.lang.String p0) { return false; }
    private boolean parseAndSetMinuteInternal(java.lang.String p0) { return false; }
    private void setError(boolean p0) {}
    private void setTimeSet(boolean p0) {}
    void setHourFormat(int p0) {}
    void setListener(android.widget.TextInputTimePickerView.OnValueTypedListener p0) {}
    void updateSeparator(java.lang.String p0) {}
    void updateTextInputValues(int p0, int p1, int p2, boolean p3, boolean p4) {}
    boolean validateInput() { return false; }

    static interface OnValueTypedListener {
        public void onValueChanged(int p0, int p1);
    }
}
