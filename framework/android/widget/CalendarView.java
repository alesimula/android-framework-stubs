package android.widget;

public class CalendarView extends android.widget.FrameLayout {
    private static final java.lang.String DATE_FORMAT = "MM/dd/yyyy";
    private static final java.text.DateFormat DATE_FORMATTER = null;
    private static final java.lang.String LOG_TAG = "CalendarView";
    private static final int MODE_HOLO = 0;
    private static final int MODE_MATERIAL = 1;
    private final android.widget.CalendarView.CalendarViewDelegate mDelegate = null;
    public CalendarView(android.content.Context p0) { super((android.content.Context)null); }
    public CalendarView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public CalendarView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public CalendarView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public static boolean parseDate(java.lang.String p0, android.icu.util.Calendar p1) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public boolean getBoundsForDate(long p0, android.graphics.Rect p1) { return false; }
    public long getDate() { return 0L; }
    public int getDateTextAppearance() { return 0; }
    public int getFirstDayOfWeek() { return 0; }
    @java.lang.Deprecated
    public int getFocusedMonthDateColor() { return 0; }
    public long getMaxDate() { return 0L; }
    public long getMinDate() { return 0L; }
    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getSelectedDateVerticalBar() { return null; }
    @java.lang.Deprecated
    public int getSelectedWeekBackgroundColor() { return 0; }
    @java.lang.Deprecated
    public boolean getShowWeekNumber() { return false; }
    @java.lang.Deprecated
    public int getShownWeekCount() { return 0; }
    @java.lang.Deprecated
    public int getUnfocusedMonthDateColor() { return 0; }
    public int getWeekDayTextAppearance() { return 0; }
    @java.lang.Deprecated
    public int getWeekNumberColor() { return 0; }
    @java.lang.Deprecated
    public int getWeekSeparatorLineColor() { return 0; }
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void setDate(long p0) {}
    public void setDate(long p0, boolean p1, boolean p2) {}
    public void setDateTextAppearance(int p0) {}
    public void setFirstDayOfWeek(int p0) {}
    @java.lang.Deprecated
    public void setFocusedMonthDateColor(int p0) {}
    public void setMaxDate(long p0) {}
    public void setMinDate(long p0) {}
    public void setOnDateChangeListener(android.widget.CalendarView.OnDateChangeListener p0) {}
    @java.lang.Deprecated
    public void setSelectedDateVerticalBar(int p0) {}
    @java.lang.Deprecated
    public void setSelectedDateVerticalBar(android.graphics.drawable.Drawable p0) {}
    @java.lang.Deprecated
    public void setSelectedWeekBackgroundColor(int p0) {}
    @java.lang.Deprecated
    public void setShowWeekNumber(boolean p0) {}
    @java.lang.Deprecated
    public void setShownWeekCount(int p0) {}
    @java.lang.Deprecated
    public void setUnfocusedMonthDateColor(int p0) {}
    public void setWeekDayTextAppearance(int p0) {}
    @java.lang.Deprecated
    public void setWeekNumberColor(int p0) {}
    @java.lang.Deprecated
    public void setWeekSeparatorLineColor(int p0) {}

    static abstract class AbstractCalendarViewDelegate implements android.widget.CalendarView.CalendarViewDelegate {
        protected static final java.lang.String DEFAULT_MAX_DATE = "01/01/2100";
        protected static final java.lang.String DEFAULT_MIN_DATE = "01/01/1900";
        protected android.content.Context mContext;
        protected java.util.Locale mCurrentLocale;
        protected android.widget.CalendarView mDelegator;
        AbstractCalendarViewDelegate(android.widget.CalendarView p0, android.content.Context p1) {}
        public int getFocusedMonthDateColor() { return 0; }
        public android.graphics.drawable.Drawable getSelectedDateVerticalBar() { return null; }
        public int getSelectedWeekBackgroundColor() { return 0; }
        public boolean getShowWeekNumber() { return false; }
        public int getShownWeekCount() { return 0; }
        public int getUnfocusedMonthDateColor() { return 0; }
        public int getWeekNumberColor() { return 0; }
        public int getWeekSeparatorLineColor() { return 0; }
        public void onConfigurationChanged(android.content.res.Configuration p0) {}
        protected void setCurrentLocale(java.util.Locale p0) {}
        public void setFocusedMonthDateColor(int p0) {}
        public void setSelectedDateVerticalBar(int p0) {}
        public void setSelectedDateVerticalBar(android.graphics.drawable.Drawable p0) {}
        public void setSelectedWeekBackgroundColor(int p0) {}
        public void setShowWeekNumber(boolean p0) {}
        public void setShownWeekCount(int p0) {}
        public void setUnfocusedMonthDateColor(int p0) {}
        public void setWeekNumberColor(int p0) {}
        public void setWeekSeparatorLineColor(int p0) {}
    }

    private static interface CalendarViewDelegate {
        public boolean getBoundsForDate(long p0, android.graphics.Rect p1);
        public long getDate();
        public int getDateTextAppearance();
        public int getFirstDayOfWeek();
        public int getFocusedMonthDateColor();
        public long getMaxDate();
        public long getMinDate();
        public android.graphics.drawable.Drawable getSelectedDateVerticalBar();
        public int getSelectedWeekBackgroundColor();
        public boolean getShowWeekNumber();
        public int getShownWeekCount();
        public int getUnfocusedMonthDateColor();
        public int getWeekDayTextAppearance();
        public int getWeekNumberColor();
        public int getWeekSeparatorLineColor();
        public void onConfigurationChanged(android.content.res.Configuration p0);
        public void setDate(long p0);
        public void setDate(long p0, boolean p1, boolean p2);
        public void setDateTextAppearance(int p0);
        public void setFirstDayOfWeek(int p0);
        public void setFocusedMonthDateColor(int p0);
        public void setMaxDate(long p0);
        public void setMinDate(long p0);
        public void setOnDateChangeListener(android.widget.CalendarView.OnDateChangeListener p0);
        public void setSelectedDateVerticalBar(int p0);
        public void setSelectedDateVerticalBar(android.graphics.drawable.Drawable p0);
        public void setSelectedWeekBackgroundColor(int p0);
        public void setShowWeekNumber(boolean p0);
        public void setShownWeekCount(int p0);
        public void setUnfocusedMonthDateColor(int p0);
        public void setWeekDayTextAppearance(int p0);
        public void setWeekNumberColor(int p0);
        public void setWeekSeparatorLineColor(int p0);
    }

    public static interface OnDateChangeListener {
        public void onSelectedDayChange(android.widget.CalendarView p0, int p1, int p2, int p3);
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.CalendarView> {
        private int mDateTextAppearanceId;
        private int mFirstDayOfWeekId;
        private int mFocusedMonthDateColorId;
        private int mMaxDateId;
        private int mMinDateId;
        private boolean mPropertiesMapped;
        private int mSelectedDateVerticalBarId;
        private int mSelectedWeekBackgroundColorId;
        private int mShowWeekNumberId;
        private int mShownWeekCountId;
        private int mUnfocusedMonthDateColorId;
        private int mWeekDayTextAppearanceId;
        private int mWeekNumberColorId;
        private int mWeekSeparatorLineColorId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.CalendarView p0, android.view.inspector.PropertyReader p1) {}
    }
}
