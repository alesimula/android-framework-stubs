package android.widget;

public class TimePicker extends android.widget.FrameLayout {
    private static final java.lang.String LOG_TAG = null;
    public static final int MODE_CLOCK = 2;
    public static final int MODE_SPINNER = 1;
    private final android.widget.TimePicker.TimePickerDelegate mDelegate = null;
    private final int mMode = 0;
    public TimePicker(android.content.Context p0) { super((android.content.Context)null); }
    public TimePicker(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TimePicker(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TimePicker(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    static java.lang.String[] getAmPmStrings(android.content.Context p0) { return null; }
    public void autofill(android.view.autofill.AutofillValue p0) {}
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public void dispatchProvideAutofillStructure(android.view.ViewStructure p0, int p1) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public android.view.View getAmView() { return null; }
    public int getAutofillType() { return 0; }
    public android.view.autofill.AutofillValue getAutofillValue() { return null; }
    public int getBaseline() { return 0; }
    @java.lang.Deprecated
    public java.lang.Integer getCurrentHour() { return null; }
    @java.lang.Deprecated
    public java.lang.Integer getCurrentMinute() { return null; }
    public int getHour() { return 0; }
    public android.view.View getHourView() { return null; }
    public int getMinute() { return 0; }
    public android.view.View getMinuteView() { return null; }
    public int getMode() { return 0; }
    public android.view.View getPmView() { return null; }
    public boolean is24HourView() { return false; }
    public boolean isEnabled() { return false; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    @java.lang.Deprecated
    public void setCurrentHour(java.lang.Integer p0) {}
    @java.lang.Deprecated
    public void setCurrentMinute(java.lang.Integer p0) {}
    public void setEnabled(boolean p0) {}
    public void setHour(int p0) {}
    public void setIs24HourView(java.lang.Boolean p0) {}
    public void setMinute(int p0) {}
    public void setOnTimeChangedListener(android.widget.TimePicker.OnTimeChangedListener p0) {}
    public boolean validateInput() { return false; }

    static abstract class AbstractTimePickerDelegate implements android.widget.TimePicker.TimePickerDelegate {
        protected android.widget.TimePicker.OnTimeChangedListener mAutoFillChangeListener;
        private long mAutofilledValue;
        protected final android.content.Context mContext = null;
        protected final android.widget.TimePicker mDelegator = null;
        protected final java.util.Locale mLocale = null;
        protected android.widget.TimePicker.OnTimeChangedListener mOnTimeChangedListener;
        public AbstractTimePickerDelegate(android.widget.TimePicker p0, android.content.Context p1) {}
        public final void autofill(android.view.autofill.AutofillValue p0) {}
        public final android.view.autofill.AutofillValue getAutofillValue() { return null; }
        protected void resetAutofilledValue() {}
        public void setAutoFillChangeListener(android.widget.TimePicker.OnTimeChangedListener p0) {}
        public void setOnTimeChangedListener(android.widget.TimePicker.OnTimeChangedListener p0) {}

        protected static class SavedState extends android.view.View.BaseSavedState {
            public static final android.os.Parcelable.Creator<android.widget.TimePicker.AbstractTimePickerDelegate.SavedState> CREATOR = null;
            private final int mCurrentItemShowing = 0;
            private final int mHour = 0;
            private final boolean mIs24HourMode = false;
            private final int mMinute = 0;
            private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
            public SavedState(android.os.Parcelable p0, int p1, int p2, boolean p3) { super((android.os.Parcel)null); }
            public SavedState(android.os.Parcelable p0, int p1, int p2, boolean p3, int p4) { super((android.os.Parcel)null); }
            public int getCurrentItemShowing() { return 0; }
            public int getHour() { return 0; }
            public int getMinute() { return 0; }
            public boolean is24HourMode() { return false; }
            public void writeToParcel(android.os.Parcel p0, int p1) {}
        }
    }

    public static interface OnTimeChangedListener {
        public void onTimeChanged(android.widget.TimePicker p0, int p1, int p2);
    }

    static interface TimePickerDelegate {
        public void autofill(android.view.autofill.AutofillValue p0);
        public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
        public android.view.View getAmView();
        public android.view.autofill.AutofillValue getAutofillValue();
        public int getBaseline();
        public int getHour();
        public android.view.View getHourView();
        public int getMinute();
        public android.view.View getMinuteView();
        public android.view.View getPmView();
        public boolean is24Hour();
        public boolean isEnabled();
        public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
        public void onRestoreInstanceState(android.os.Parcelable p0);
        public android.os.Parcelable onSaveInstanceState(android.os.Parcelable p0);
        public void setAutoFillChangeListener(android.widget.TimePicker.OnTimeChangedListener p0);
        public void setDate(int p0, int p1);
        public void setEnabled(boolean p0);
        public void setHour(int p0);
        public void setIs24Hour(boolean p0);
        public void setMinute(int p0);
        public void setOnTimeChangedListener(android.widget.TimePicker.OnTimeChangedListener p0);
        public boolean validateInput();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TimePickerMode {
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.TimePicker> {
        private int m24HourId;
        private int mHourId;
        private int mMinuteId;
        private boolean mPropertiesMapped;
        private int mTimePickerModeId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.TimePicker p0, android.view.inspector.PropertyReader p1) {}
    }
}
