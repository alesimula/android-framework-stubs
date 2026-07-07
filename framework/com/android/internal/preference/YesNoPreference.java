package com.android.internal.preference;

public class YesNoPreference extends android.preference.DialogPreference {
    private boolean mWasPositiveResult;
    public YesNoPreference(android.content.Context p0) { super((android.content.Context)null); }
    public YesNoPreference(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public YesNoPreference(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public YesNoPreference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public boolean getValue() { return false; }
    protected void onDialogClosed(boolean p0) {}
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray p0, int p1) { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onSetInitialValue(boolean p0, java.lang.Object p1) {}
    public void setValue(boolean p0) {}
    public boolean shouldDisableDependents() { return false; }

    private static class SavedState extends android.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.android.internal.preference.YesNoPreference.SavedState> CREATOR = null;
        boolean wasPositiveResult;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
