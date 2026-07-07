package android.preference;

@java.lang.Deprecated
public class PreferenceManager {
    public static final java.lang.String KEY_HAS_SET_DEFAULT_VALUES = "_has_set_default_values";
    public static final java.lang.String METADATA_KEY_PREFERENCES = "android.preference";
    private static final int STORAGE_CREDENTIAL_PROTECTED = 2;
    private static final int STORAGE_DEFAULT = 0;
    private static final int STORAGE_DEVICE_PROTECTED = 1;
    private static final java.lang.String TAG = "PreferenceManager";
    private android.app.Activity mActivity;
    private java.util.List<android.preference.PreferenceManager.OnActivityDestroyListener> mActivityDestroyListeners;
    private java.util.List<android.preference.PreferenceManager.OnActivityResultListener> mActivityResultListeners;
    private java.util.List<android.preference.PreferenceManager.OnActivityStopListener> mActivityStopListeners;
    private android.content.Context mContext;
    private android.content.SharedPreferences.Editor mEditor;
    private android.preference.PreferenceFragment mFragment;
    private long mNextId;
    private int mNextRequestCode;
    private boolean mNoCommit;
    private android.preference.PreferenceManager.OnPreferenceTreeClickListener mOnPreferenceTreeClickListener;
    private android.preference.PreferenceDataStore mPreferenceDataStore;
    private android.preference.PreferenceScreen mPreferenceScreen;
    private java.util.List<android.content.DialogInterface> mPreferencesScreens;
    private android.content.SharedPreferences mSharedPreferences;
    private int mSharedPreferencesMode;
    private java.lang.String mSharedPreferencesName;
    private int mStorage;
    public PreferenceManager(android.app.Activity p0, int p1) {}
    PreferenceManager(android.content.Context p0) {}
    private void dismissAllScreens() {}
    public static android.content.SharedPreferences getDefaultSharedPreferences(android.content.Context p0) { return null; }
    private static int getDefaultSharedPreferencesMode() { return 0; }
    public static java.lang.String getDefaultSharedPreferencesName(android.content.Context p0) { return null; }
    private void init(android.content.Context p0) {}
    private java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent p0) { return null; }
    public static void setDefaultValues(android.content.Context p0, int p1, boolean p2) {}
    public static void setDefaultValues(android.content.Context p0, java.lang.String p1, int p2, int p3, boolean p4) {}
    private void setNoCommit(boolean p0) {}
    void addPreferencesScreen(android.content.DialogInterface p0) {}
    public android.preference.PreferenceScreen createPreferenceScreen(android.content.Context p0) { return null; }
    void dispatchActivityDestroy() {}
    void dispatchActivityResult(int p0, int p1, android.content.Intent p2) {}
    void dispatchActivityStop() {}
    void dispatchNewIntent(android.content.Intent p0) {}
    public android.preference.Preference findPreference(java.lang.CharSequence p0) { return null; }
    android.app.Activity getActivity() { return null; }
    android.content.Context getContext() { return null; }
    android.content.SharedPreferences.Editor getEditor() { return null; }
    android.preference.PreferenceFragment getFragment() { return null; }
    long getNextId() { return 0L; }
    int getNextRequestCode() { return 0; }
    android.preference.PreferenceManager.OnPreferenceTreeClickListener getOnPreferenceTreeClickListener() { return null; }
    public android.preference.PreferenceDataStore getPreferenceDataStore() { return null; }
    android.preference.PreferenceScreen getPreferenceScreen() { return null; }
    public android.content.SharedPreferences getSharedPreferences() { return null; }
    public int getSharedPreferencesMode() { return 0; }
    public java.lang.String getSharedPreferencesName() { return null; }
    android.preference.PreferenceScreen inflateFromIntent(android.content.Intent p0, android.preference.PreferenceScreen p1) { return null; }
    public android.preference.PreferenceScreen inflateFromResource(android.content.Context p0, int p1, android.preference.PreferenceScreen p2) { return null; }
    @android.annotation.SystemApi
    public boolean isStorageCredentialProtected() { return false; }
    public boolean isStorageDefault() { return false; }
    public boolean isStorageDeviceProtected() { return false; }
    void registerOnActivityDestroyListener(android.preference.PreferenceManager.OnActivityDestroyListener p0) {}
    void registerOnActivityResultListener(android.preference.PreferenceManager.OnActivityResultListener p0) {}
    public void registerOnActivityStopListener(android.preference.PreferenceManager.OnActivityStopListener p0) {}
    void removePreferencesScreen(android.content.DialogInterface p0) {}
    void setFragment(android.preference.PreferenceFragment p0) {}
    void setOnPreferenceTreeClickListener(android.preference.PreferenceManager.OnPreferenceTreeClickListener p0) {}
    public void setPreferenceDataStore(android.preference.PreferenceDataStore p0) {}
    boolean setPreferences(android.preference.PreferenceScreen p0) { return false; }
    public void setSharedPreferencesMode(int p0) {}
    public void setSharedPreferencesName(java.lang.String p0) {}
    @android.annotation.SystemApi
    public void setStorageCredentialProtected() {}
    public void setStorageDefault() {}
    public void setStorageDeviceProtected() {}
    boolean shouldCommit() { return false; }
    void unregisterOnActivityDestroyListener(android.preference.PreferenceManager.OnActivityDestroyListener p0) {}
    void unregisterOnActivityResultListener(android.preference.PreferenceManager.OnActivityResultListener p0) {}
    public void unregisterOnActivityStopListener(android.preference.PreferenceManager.OnActivityStopListener p0) {}

    @java.lang.Deprecated
    public static interface OnActivityDestroyListener {
        public void onActivityDestroy();
    }

    @java.lang.Deprecated
    public static interface OnActivityResultListener {
        public boolean onActivityResult(int p0, int p1, android.content.Intent p2);
    }

    @java.lang.Deprecated
    public static interface OnActivityStopListener {
        public void onActivityStop();
    }

    @java.lang.Deprecated
    public static interface OnPreferenceTreeClickListener {
        public boolean onPreferenceTreeClick(android.preference.PreferenceScreen p0, android.preference.Preference p1);
    }
}
