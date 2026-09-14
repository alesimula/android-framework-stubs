package android.service.personalcontext;

@android.annotation.SystemApi
public class UnderstanderSettings {
    private static final java.lang.String TAG = "UnderstanderSettings";
    private final android.content.Context mContext = null;
    public UnderstanderSettings(android.content.Context p0) {}
    private void addToPreviouslyEnabledUnderstanders(android.content.ComponentName p0, int p1) {}
    private static java.util.List<android.service.personalcontext.UnderstanderSettings.EnabledUnderstander> deserializeUnderstanders(java.lang.String p0) { return null; }
    private static java.util.List<android.service.personalcontext.UnderstanderSettings.EnabledUnderstander> getUnderstandersFromSetting(java.lang.String p0) { return null; }
    private java.util.List<android.service.personalcontext.UnderstanderSettings.EnabledUnderstander> getUnderstandersFromSettings(java.lang.String p0) { return null; }
    private static java.lang.String serializeUnderstanders(java.util.List<android.service.personalcontext.UnderstanderSettings.EnabledUnderstander> p0) { return null; }
    public boolean clearEnabledUnderstanders() { return false; }
    public boolean clearPreviouslyEnabledUnderstanders() { return false; }
    public java.util.List<android.content.ComponentName> getEnabledUnderstanderComponentNames() { return null; }
    public java.util.List<android.service.personalcontext.UnderstanderSettings.EnabledUnderstander> getEnabledUnderstanders() { return null; }
    public java.util.List<android.service.personalcontext.UnderstanderSettings.EnabledUnderstander> getPreviouslyEnabledUnderstanders() { return null; }
    @android.annotation.SystemApi
    public android.content.ComponentName getUnderstanderFromPackage(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public boolean isUnderstanderEnabled(android.content.ComponentName p0) { return false; }
    public boolean isUnderstanderPreviouslyEnabled(android.content.ComponentName p0) { return false; }
    public boolean setUnderstanderEnabled(android.content.ComponentName p0, int p1, boolean p2) { return false; }

    public static final class EnabledUnderstander {
        private final android.content.ComponentName mComponentName = null;
        private final int mType = 0;
        public EnabledUnderstander(android.content.ComponentName p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public android.content.ComponentName getComponentName() { return null; }
        public int getType() { return 0; }
        public int hashCode() { return 0; }
    }
}
