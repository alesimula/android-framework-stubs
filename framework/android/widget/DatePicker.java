package android.widget;

public class DatePicker extends android.widget.FrameLayout {
    private static final java.lang.String LOG_TAG = null;
    public static final int MODE_CALENDAR = 2;
    public static final int MODE_SPINNER = 1;
    private final android.widget.DatePicker.DatePickerDelegate mDelegate = null;
    private final int mMode = 0;
    public DatePicker(android.content.Context p0) { super((android.content.Context)null); }
    public DatePicker(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public DatePicker(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public DatePicker(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private android.widget.DatePicker.DatePickerDelegate createCalendarUIDelegate(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { return null; }
    private android.widget.DatePicker.DatePickerDelegate createSpinnerUIDelegate(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { return null; }
    public void autofill(android.view.autofill.AutofillValue p0) {}
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public void dispatchProvideAutofillStructure(android.view.ViewStructure p0, int p1) {}
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public int getAutofillType() { return 0; }
    public android.view.autofill.AutofillValue getAutofillValue() { return null; }
    @java.lang.Deprecated
    public android.widget.CalendarView getCalendarView() { return null; }
    @java.lang.Deprecated
    public boolean getCalendarViewShown() { return false; }
    public int getDayOfMonth() { return 0; }
    public int getFirstDayOfWeek() { return 0; }
    public long getMaxDate() { return 0L; }
    public long getMinDate() { return 0L; }
    public int getMode() { return 0; }
    public int getMonth() { return 0; }
    @java.lang.Deprecated
    public boolean getSpinnersShown() { return false; }
    public int getYear() { return 0; }
    public void init(int p0, int p1, int p2, android.widget.DatePicker.OnDateChangedListener p3) {}
    public boolean isEnabled() { return false; }
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    @java.lang.Deprecated
    public void setCalendarViewShown(boolean p0) {}
    public void setEnabled(boolean p0) {}
    public void setFirstDayOfWeek(int p0) {}
    public void setMaxDate(long p0) {}
    public void setMinDate(long p0) {}
    public void setOnDateChangedListener(android.widget.DatePicker.OnDateChangedListener p0) {}
    @java.lang.Deprecated
    public void setSpinnersShown(boolean p0) {}
    public void setValidationCallback(android.widget.DatePicker.ValidationCallback p0) {}
    public void updateDate(int p0, int p1, int p2) {}

    static abstract class AbstractDatePickerDelegate implements android.widget.DatePicker.DatePickerDelegate {
        protected android.widget.DatePicker.OnDateChangedListener mAutoFillChangeListener;
        private long mAutofilledValue;
        protected android.content.Context mContext;
        protected java.util.Locale mCurrentLocale;
        protected android.widget.DatePicker mDelegator;
        protected android.widget.DatePicker.OnDateChangedListener mOnDateChangedListener;
        protected android.widget.DatePicker.ValidationCallback mValidationCallback;
        public AbstractDatePickerDelegate(android.widget.DatePicker p0, android.content.Context p1) {}
        public final void autofill(android.view.autofill.AutofillValue p0) {}
        public final android.view.autofill.AutofillValue getAutofillValue() { return null; }
        protected java.lang.String getFormattedCurrentDate() { return null; }
        protected void onLocaleChanged(java.util.Locale p0) {}
        public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
        protected void onValidationChanged(boolean p0) {}
        protected void resetAutofilledValue() {}
        public void setAutoFillChangeListener(android.widget.DatePicker.OnDateChangedListener p0) {}
        protected void setCurrentLocale(java.util.Locale p0) {}
        public void setOnDateChangedListener(android.widget.DatePicker.OnDateChangedListener p0) {}
        public void setValidationCallback(android.widget.DatePicker.ValidationCallback p0) {}

        static class SavedState extends android.view.View.BaseSavedState {
            public static final android.os.Parcelable.Creator<android.widget.DatePicker.AbstractDatePickerDelegate.SavedState> CREATOR = null;
            private final int mCurrentView = 0;
            private final int mListPosition = 0;
            private final int mListPositionOffset = 0;
            private final long mMaxDate = 0L;
            private final long mMinDate = 0L;
            private final int mSelectedDay = 0;
            private final int mSelectedMonth = 0;
            private final int mSelectedYear = 0;
            private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
            public SavedState(android.os.Parcelable p0, int p1, int p2, int p3, long p4, long p5) { super((android.os.Parcel)null); }
            public SavedState(android.os.Parcelable p0, int p1, int p2, int p3, long p4, long p5, int p6, int p7, int p8) { super((android.os.Parcel)null); }
            public int getCurrentView() { return 0; }
            public int getListPosition() { return 0; }
            public int getListPositionOffset() { return 0; }
            public long getMaxDate() { return 0L; }
            public long getMinDate() { return 0L; }
            public int getSelectedDay() { return 0; }
            public int getSelectedMonth() { return 0; }
            public int getSelectedYear() { return 0; }
            public void writeToParcel(android.os.Parcel p0, int p1) {}
        }
    }

    static interface DatePickerDelegate {
        public void autofill(android.view.autofill.AutofillValue p0);
        public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
        public android.view.autofill.AutofillValue getAutofillValue();
        public android.widget.CalendarView getCalendarView();
        public boolean getCalendarViewShown();
        public int getDayOfMonth();
        public int getFirstDayOfWeek();
        public android.icu.util.Calendar getMaxDate();
        public android.icu.util.Calendar getMinDate();
        public int getMonth();
        public boolean getSpinnersShown();
        public int getYear();
        public void init(int p0, int p1, int p2, android.widget.DatePicker.OnDateChangedListener p3);
        public boolean isEnabled();
        public void onConfigurationChanged(android.content.res.Configuration p0);
        public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
        public void onRestoreInstanceState(android.os.Parcelable p0);
        public android.os.Parcelable onSaveInstanceState(android.os.Parcelable p0);
        public void setAutoFillChangeListener(android.widget.DatePicker.OnDateChangedListener p0);
        public void setCalendarViewShown(boolean p0);
        public void setEnabled(boolean p0);
        public void setFirstDayOfWeek(int p0);
        public void setMaxDate(long p0);
        public void setMinDate(long p0);
        public void setOnDateChangedListener(android.widget.DatePicker.OnDateChangedListener p0);
        public void setSpinnersShown(boolean p0);
        public void setValidationCallback(android.widget.DatePicker.ValidationCallback p0);
        public void updateDate(int p0, int p1, int p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DatePickerMode {
    }

    public static interface OnDateChangedListener {
        public void onDateChanged(android.widget.DatePicker p0, int p1, int p2, int p3);
    }

    public static interface ValidationCallback {
        public void onValidationChanged(boolean p0);
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.DatePicker> {
        private int mCalendarViewShownId;
        private int mDatePickerModeId;
        private int mDayOfMonthId;
        private int mFirstDayOfWeekId;
        private int mMaxDateId;
        private int mMinDateId;
        private int mMonthId;
        private boolean mPropertiesMapped;
        private int mSpinnersShownId;
        private int mYearId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.DatePicker p0, android.view.inspector.PropertyReader p1) {}
    }
}
