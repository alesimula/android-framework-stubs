package android.preference;

@java.lang.Deprecated
public class Preference implements java.lang.Comparable<android.preference.Preference> {
    public static final int DEFAULT_ORDER = 2147483647;
    private boolean mBaseMethodCalled;
    private android.content.Context mContext;
    private java.lang.Object mDefaultValue;
    private java.lang.String mDependencyKey;
    private boolean mDependencyMet;
    private java.util.List<android.preference.Preference> mDependents;
    private boolean mEnabled;
    private android.os.Bundle mExtras;
    private java.lang.String mFragment;
    private boolean mHasSingleLineTitleAttr;
    private android.graphics.drawable.Drawable mIcon;
    private int mIconResId;
    private boolean mIconSpaceReserved;
    private long mId;
    private android.content.Intent mIntent;
    private java.lang.String mKey;
    private int mLayoutResId;
    private android.preference.Preference.OnPreferenceChangeInternalListener mListener;
    private android.preference.Preference.OnPreferenceChangeListener mOnChangeListener;
    private android.preference.Preference.OnPreferenceClickListener mOnClickListener;
    private int mOrder;
    private boolean mParentDependencyMet;
    private android.preference.PreferenceGroup mParentGroup;
    private boolean mPersistent;
    private android.preference.PreferenceDataStore mPreferenceDataStore;
    private android.preference.PreferenceManager mPreferenceManager;
    private boolean mRecycleEnabled;
    private boolean mRequiresKey;
    private boolean mSelectable;
    private boolean mShouldDisableView;
    private boolean mSingleLineTitle;
    private java.lang.CharSequence mSummary;
    private java.lang.CharSequence mTitle;
    private int mTitleRes;
    private int mWidgetLayoutResId;
    public Preference(android.content.Context p0) {}
    public Preference(android.content.Context p0, android.util.AttributeSet p1) {}
    public Preference(android.content.Context p0, android.util.AttributeSet p1, int p2) {}
    public Preference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) {}
    private void dispatchSetInitialValue() {}
    private void registerDependency() {}
    private void registerDependent(android.preference.Preference p0) {}
    private void setEnabledStateOnViews(android.view.View p0, boolean p1) {}
    private void tryCommit(android.content.SharedPreferences.Editor p0) {}
    private void unregisterDependency() {}
    private void unregisterDependent(android.preference.Preference p0) {}
    void assignParent(android.preference.PreferenceGroup p0) {}
    protected boolean callChangeListener(java.lang.Object p0) { return false; }
    public int compareTo(android.preference.Preference p0) { return 0; }
    void dispatchRestoreInstanceState(android.os.Bundle p0) {}
    void dispatchSaveInstanceState(android.os.Bundle p0) {}
    protected android.preference.Preference findPreferenceInHierarchy(java.lang.String p0) { return null; }
    public android.content.Context getContext() { return null; }
    public java.lang.String getDependency() { return null; }
    public android.content.SharedPreferences.Editor getEditor() { return null; }
    public android.os.Bundle getExtras() { return null; }
    java.lang.StringBuilder getFilterableStringBuilder() { return null; }
    public java.lang.String getFragment() { return null; }
    public android.graphics.drawable.Drawable getIcon() { return null; }
    long getId() { return 0L; }
    public android.content.Intent getIntent() { return null; }
    public java.lang.String getKey() { return null; }
    public int getLayoutResource() { return 0; }
    public android.preference.Preference.OnPreferenceChangeListener getOnPreferenceChangeListener() { return null; }
    public android.preference.Preference.OnPreferenceClickListener getOnPreferenceClickListener() { return null; }
    public int getOrder() { return 0; }
    public android.preference.PreferenceGroup getParent() { return null; }
    protected boolean getPersistedBoolean(boolean p0) { return false; }
    protected float getPersistedFloat(float p0) { return 0.0f; }
    protected int getPersistedInt(int p0) { return 0; }
    protected long getPersistedLong(long p0) { return 0L; }
    protected java.lang.String getPersistedString(java.lang.String p0) { return null; }
    public java.util.Set<java.lang.String> getPersistedStringSet(java.util.Set<java.lang.String> p0) { return null; }
    public android.preference.PreferenceDataStore getPreferenceDataStore() { return null; }
    public android.preference.PreferenceManager getPreferenceManager() { return null; }
    public android.content.SharedPreferences getSharedPreferences() { return null; }
    public boolean getShouldDisableView() { return false; }
    public java.lang.CharSequence getSummary() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public int getTitleRes() { return 0; }
    public android.view.View getView(android.view.View p0, android.view.ViewGroup p1) { return null; }
    public int getWidgetLayoutResource() { return 0; }
    public boolean hasKey() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isIconSpaceReserved() { return false; }
    public boolean isPersistent() { return false; }
    public boolean isRecycleEnabled() { return false; }
    public boolean isSelectable() { return false; }
    public boolean isSingleLineTitle() { return false; }
    protected void notifyChanged() {}
    public void notifyDependencyChange(boolean p0) {}
    protected void notifyHierarchyChanged() {}
    protected void onAttachedToActivity() {}
    protected void onAttachedToHierarchy(android.preference.PreferenceManager p0) {}
    protected void onBindView(android.view.View p0) {}
    protected void onClick() {}
    protected android.view.View onCreateView(android.view.ViewGroup p0) { return null; }
    public void onDependencyChanged(android.preference.Preference p0, boolean p1) {}
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray p0, int p1) { return null; }
    public boolean onKey(android.view.View p0, int p1, android.view.KeyEvent p2) { return false; }
    public void onParentChanged(android.preference.Preference p0, boolean p1) {}
    protected void onPrepareForRemoval() {}
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onSetInitialValue(boolean p0, java.lang.Object p1) {}
    public android.os.Bundle peekExtras() { return null; }
    public void performClick(android.preference.PreferenceScreen p0) {}
    protected boolean persistBoolean(boolean p0) { return false; }
    protected boolean persistFloat(float p0) { return false; }
    protected boolean persistInt(int p0) { return false; }
    protected boolean persistLong(long p0) { return false; }
    protected boolean persistString(java.lang.String p0) { return false; }
    public boolean persistStringSet(java.util.Set<java.lang.String> p0) { return false; }
    void requireKey() {}
    public void restoreHierarchyState(android.os.Bundle p0) {}
    public void saveHierarchyState(android.os.Bundle p0) {}
    public void setDefaultValue(java.lang.Object p0) {}
    public void setDependency(java.lang.String p0) {}
    public void setEnabled(boolean p0) {}
    public void setFragment(java.lang.String p0) {}
    public void setIcon(int p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public void setIconSpaceReserved(boolean p0) {}
    public void setIntent(android.content.Intent p0) {}
    public void setKey(java.lang.String p0) {}
    public void setLayoutResource(int p0) {}
    final void setOnPreferenceChangeInternalListener(android.preference.Preference.OnPreferenceChangeInternalListener p0) {}
    public void setOnPreferenceChangeListener(android.preference.Preference.OnPreferenceChangeListener p0) {}
    public void setOnPreferenceClickListener(android.preference.Preference.OnPreferenceClickListener p0) {}
    public void setOrder(int p0) {}
    public void setPersistent(boolean p0) {}
    public void setPreferenceDataStore(android.preference.PreferenceDataStore p0) {}
    public void setRecycleEnabled(boolean p0) {}
    public void setSelectable(boolean p0) {}
    public void setShouldDisableView(boolean p0) {}
    public void setSingleLineTitle(boolean p0) {}
    public void setSummary(int p0) {}
    public void setSummary(java.lang.CharSequence p0) {}
    public void setTitle(int p0) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public void setWidgetLayoutResource(int p0) {}
    public boolean shouldCommit() { return false; }
    public boolean shouldDisableDependents() { return false; }
    protected boolean shouldPersist() { return false; }
    public java.lang.String toString() { return null; }

    @java.lang.Deprecated
    public static class BaseSavedState extends android.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<android.preference.Preference.BaseSavedState> CREATOR = null;
        public BaseSavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public BaseSavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
    }

    static interface OnPreferenceChangeInternalListener {
        public void onPreferenceChange(android.preference.Preference p0);
        public void onPreferenceHierarchyChange(android.preference.Preference p0);
    }

    @java.lang.Deprecated
    public static interface OnPreferenceChangeListener {
        public boolean onPreferenceChange(android.preference.Preference p0, java.lang.Object p1);
    }

    @java.lang.Deprecated
    public static interface OnPreferenceClickListener {
        public boolean onPreferenceClick(android.preference.Preference p0);
    }
}
