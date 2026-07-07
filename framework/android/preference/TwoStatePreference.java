package android.preference;

@java.lang.Deprecated
public abstract class TwoStatePreference extends android.preference.Preference {
    boolean mChecked;
    private boolean mCheckedSet;
    private boolean mDisableDependentsState;
    private java.lang.CharSequence mSummaryOff;
    private java.lang.CharSequence mSummaryOn;
    public TwoStatePreference(android.content.Context p0) { super((android.content.Context)null); }
    public TwoStatePreference(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TwoStatePreference(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TwoStatePreference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public boolean getDisableDependentsState() { return false; }
    public java.lang.CharSequence getSummaryOff() { return null; }
    public java.lang.CharSequence getSummaryOn() { return null; }
    public boolean isChecked() { return false; }
    protected void onClick() {}
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray p0, int p1) { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onSetInitialValue(boolean p0, java.lang.Object p1) {}
    public void setChecked(boolean p0) {}
    public void setDisableDependentsState(boolean p0) {}
    public void setSummaryOff(int p0) {}
    public void setSummaryOff(java.lang.CharSequence p0) {}
    public void setSummaryOn(int p0) {}
    public void setSummaryOn(java.lang.CharSequence p0) {}
    public boolean shouldDisableDependents() { return false; }
    void syncSummaryView(android.view.View p0) {}

    static class SavedState extends android.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<android.preference.TwoStatePreference.SavedState> CREATOR = null;
        boolean checked;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
