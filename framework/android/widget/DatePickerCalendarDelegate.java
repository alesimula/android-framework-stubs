package android.widget;

class DatePickerCalendarDelegate extends android.widget.DatePicker.AbstractDatePickerDelegate {
    private static final int ANIMATION_DURATION = 300;
    private static final int[] ATTRS_DISABLED_ALPHA = null;
    private static final int[] ATTRS_TEXT_COLOR = null;
    private static final int DEFAULT_END_YEAR = 2100;
    private static final int DEFAULT_START_YEAR = 1900;
    private static final int UNINITIALIZED = -1;
    private static final int USE_LOCALE = 0;
    private static final int VIEW_MONTH_DAY = 0;
    private static final int VIEW_YEAR = 1;
    private android.widget.ViewAnimator mAnimator;
    private android.view.ViewGroup mContainer;
    private int mCurrentView;
    private android.widget.DayPickerView mDayPickerView;
    private int mFirstDayOfWeek;
    private android.widget.TextView mHeaderMonthDay;
    private android.widget.TextView mHeaderYear;
    private final android.widget.DayPickerView.OnDaySelectedListener mOnDaySelectedListener = null;
    private final android.view.View.OnClickListener mOnHeaderClickListener = null;
    private final android.widget.YearPickerView.OnYearSelectedListener mOnYearSelectedListener = null;
    private android.widget.YearPickerView mYearPickerView;
    public DatePickerCalendarDelegate(android.widget.DatePicker p0, android.content.Context p1, android.util.AttributeSet p2, int p3, int p4) { super(null, null); }
    private android.content.res.ColorStateList applyLegacyColorFixes(android.content.res.ColorStateList p0) { return null; }
    private static int getDaysInMonth(int p0, int p1) { return 0; }
    private int multiplyAlphaComponent(int p0, float p1) { return 0; }
    private void onCurrentDateChanged() {}
    private void onDateChanged(boolean p0, boolean p1) {}
    private void setCurrentView(int p0) {}
    private void setDate(int p0, int p1, int p2) {}
    private void tryVibrate() {}
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
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
    protected void onLocaleChanged(java.util.Locale p0) {}
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public android.os.Parcelable onSaveInstanceState(android.os.Parcelable p0) { return null; }
    public void setCalendarViewShown(boolean p0) {}
    public void setEnabled(boolean p0) {}
    public void setFirstDayOfWeek(int p0) {}
    public void setMaxDate(long p0) {}
    public void setMinDate(long p0) {}
    public void setSpinnersShown(boolean p0) {}
    public void updateDate(int p0, int p1, int p2) {}

    private static class ClickActionDelegate extends android.view.View.AccessibilityDelegate {
        private final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction mClickAction = null;
        ClickActionDelegate(android.content.Context p0, int p1) { super(); }
        public void onInitializeAccessibilityNodeInfo(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
    }
}
