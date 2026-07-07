package android.widget;

class DatePickerSpinnerDelegate extends android.widget.DatePicker.AbstractDatePickerDelegate {
    private static final java.lang.String DATE_FORMAT = "MM/dd/yyyy";
    private static final boolean DEFAULT_CALENDAR_VIEW_SHOWN = true;
    private static final boolean DEFAULT_ENABLED_STATE = true;
    private static final int DEFAULT_END_YEAR = 2100;
    private static final boolean DEFAULT_SPINNERS_SHOWN = true;
    private static final int DEFAULT_START_YEAR = 1900;
    private final android.widget.CalendarView mCalendarView = null;
    private final java.text.DateFormat mDateFormat = null;
    private final android.widget.NumberPicker mDaySpinner = null;
    private final android.widget.EditText mDaySpinnerInput = null;
    private boolean mIsEnabled;
    private final android.widget.NumberPicker mMonthSpinner = null;
    private final android.widget.EditText mMonthSpinnerInput = null;
    private int mNumberOfMonths;
    private java.lang.String[] mShortMonths;
    private final android.widget.LinearLayout mSpinners = null;
    private final android.widget.NumberPicker mYearSpinner = null;
    private final android.widget.EditText mYearSpinnerInput = null;
    DatePickerSpinnerDelegate(android.widget.DatePicker p0, android.content.Context p1, android.util.AttributeSet p2, int p3, int p4) { super(null, null); }
    private android.icu.util.Calendar getCalendarForLocale(android.icu.util.Calendar p0, java.util.Locale p1) { return null; }
    private boolean isNewDate(int p0, int p1, int p2) { return false; }
    private void notifyDateChanged() {}
    private boolean parseDate(java.lang.String p0, android.icu.util.Calendar p1) { return false; }
    private void reorderSpinners() {}
    private void setContentDescriptions() {}
    private void setDate(int p0, int p1, int p2) {}
    private void setImeOptions(android.widget.NumberPicker p0, int p1, int p2) {}
    private void trySetContentDescription(android.view.View p0, int p1, int p2) {}
    private void updateCalendarView() {}
    private void updateInputState() {}
    private void updateSpinners() {}
    private boolean usingNumericMonths() { return false; }
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public android.widget.CalendarView getCalendarView() { return null; }
    public boolean getCalendarViewShown() { return false; }
    public int getDayOfMonth() { return 0; }
    public int getFirstDayOfWeek() { return 0; }
    public android.icu.util.Calendar getMaxDate() { return null; }
    public android.icu.util.Calendar getMinDate() { return null; }
    public int getMonth() { return 0; }
    public boolean getSpinnersShown() { return false; }
    public int getYear() { return 0; }
    public void init(int p0, int p1, int p2, android.widget.DatePicker.OnDateChangedListener p3) {}
    public boolean isEnabled() { return false; }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public android.os.Parcelable onSaveInstanceState(android.os.Parcelable p0) { return null; }
    public void setCalendarViewShown(boolean p0) {}
    protected void setCurrentLocale(java.util.Locale p0) {}
    public void setEnabled(boolean p0) {}
    public void setFirstDayOfWeek(int p0) {}
    public void setMaxDate(long p0) {}
    public void setMinDate(long p0) {}
    public void setSpinnersShown(boolean p0) {}
    public void updateDate(int p0, int p1, int p2) {}
}
