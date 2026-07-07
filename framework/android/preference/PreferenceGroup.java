package android.preference;

@java.lang.Deprecated
public abstract class PreferenceGroup extends android.preference.Preference implements android.preference.GenericInflater.Parent<android.preference.Preference> {
    private boolean mAttachedToActivity;
    private int mCurrentPreferenceOrder;
    private boolean mOrderingAsAdded;
    private java.util.List<android.preference.Preference> mPreferenceList;
    public PreferenceGroup(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public PreferenceGroup(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public PreferenceGroup(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private boolean removePreferenceInt(android.preference.Preference p0) { return false; }
    public void addItemFromInflater(android.preference.Preference p0) {}
    public boolean addPreference(android.preference.Preference p0) { return false; }
    protected void dispatchRestoreInstanceState(android.os.Bundle p0) {}
    protected void dispatchSaveInstanceState(android.os.Bundle p0) {}
    public android.preference.Preference findPreference(java.lang.CharSequence p0) { return null; }
    public android.preference.Preference getPreference(int p0) { return null; }
    public int getPreferenceCount() { return 0; }
    protected boolean isOnSameScreenAsChildren() { return false; }
    public boolean isOrderingAsAdded() { return false; }
    public void notifyDependencyChange(boolean p0) {}
    protected void onAttachedToActivity() {}
    protected boolean onPrepareAddPreference(android.preference.Preference p0) { return false; }
    protected void onPrepareForRemoval() {}
    public void removeAll() {}
    public boolean removePreference(android.preference.Preference p0) { return false; }
    public void setOrderingAsAdded(boolean p0) {}
    void sortPreferences() {}
}
