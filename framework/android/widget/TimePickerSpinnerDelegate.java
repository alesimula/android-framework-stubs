package android.widget;

class TimePickerSpinnerDelegate extends android.widget.TimePicker.AbstractTimePickerDelegate {
    private static final boolean DEFAULT_ENABLED_STATE = true;
    private static final int HOURS_IN_HALF_DAY = 12;
    private final android.widget.Button mAmPmButton = null;
    private final android.widget.NumberPicker mAmPmSpinner = null;
    private final android.widget.EditText mAmPmSpinnerInput = null;
    private final java.lang.String[] mAmPmStrings = null;
    private final android.widget.TextView mDivider = null;
    private char mHourFormat;
    private final android.widget.NumberPicker mHourSpinner = null;
    private final android.widget.EditText mHourSpinnerInput = null;
    private boolean mHourWithTwoDigit;
    private boolean mIs24HourView;
    private boolean mIsAm;
    private boolean mIsEnabled;
    private final android.widget.NumberPicker mMinuteSpinner = null;
    private final android.widget.EditText mMinuteSpinnerInput = null;
    private final java.util.Calendar mTempCalendar = null;
    public TimePickerSpinnerDelegate(android.widget.TimePicker p0, android.content.Context p1, android.util.AttributeSet p2, int p3, int p4) { super(null, null); }
    private void getHourFormatData() {}
    private boolean isAmPmAtStart() { return false; }
    private void onTimeChanged() {}
    private void setContentDescriptions() {}
    private void setCurrentHour(int p0, boolean p1) {}
    private void setCurrentMinute(int p0, boolean p1) {}
    private void setDividerText() {}
    private void trySetContentDescription(android.view.View p0, int p1, int p2) {}
    private void updateAmPmControl() {}
    private void updateHourControl() {}
    private void updateInputState() {}
    private void updateMinuteControl() {}
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public android.view.View getAmView() { return null; }
    public int getBaseline() { return 0; }
    public int getHour() { return 0; }
    public android.view.View getHourView() { return null; }
    public int getMinute() { return 0; }
    public android.view.View getMinuteView() { return null; }
    public android.view.View getPmView() { return null; }
    public boolean is24Hour() { return false; }
    public boolean isEnabled() { return false; }
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public android.os.Parcelable onSaveInstanceState(android.os.Parcelable p0) { return null; }
    public void setDate(int p0, int p1) {}
    public void setEnabled(boolean p0) {}
    public void setHour(int p0) {}
    public void setIs24Hour(boolean p0) {}
    public void setMinute(int p0) {}
    public boolean validateInput() { return false; }
}
