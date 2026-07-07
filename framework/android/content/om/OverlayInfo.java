package android.content.om;

public final class OverlayInfo implements android.content.om.CriticalOverlayInfo, android.os.Parcelable {
    public static final java.lang.String CATEGORY_THEME = "android.theme";
    public static final android.os.Parcelable.Creator<android.content.om.OverlayInfo> CREATOR = null;
    public static final int STATE_DISABLED = 2;
    public static final int STATE_ENABLED = 3;
    @java.lang.Deprecated
    public static final int STATE_ENABLED_IMMUTABLE = 6;
    public static final int STATE_MISSING_TARGET = 0;
    public static final int STATE_NO_IDMAP = 1;
    public static final int STATE_OVERLAY_IS_BEING_REPLACED = 5;
    public static final int STATE_SYSTEM_UPDATE_UNINSTALL = 7;
    @java.lang.Deprecated
    public static final int STATE_TARGET_IS_BEING_REPLACED = 4;
    public static final int STATE_UNKNOWN = -1;
    public final java.lang.String baseCodePath = null;
    public final java.lang.String category = null;
    public final java.util.List<android.content.om.OverlayConstraint> constraints = null;
    public final boolean isFabricated = false;
    public final boolean isMutable = false;
    private android.content.om.OverlayIdentifier mIdentifierCached;
    public final java.lang.String overlayName = null;
    public final java.lang.String packageName = null;
    public final int priority = 0;
    public final int state = 0;
    public final java.lang.String targetOverlayableName = null;
    public final java.lang.String targetPackageName = null;
    public final int userId = 0;
    public OverlayInfo(android.content.om.OverlayInfo p0, int p1) {}
    public OverlayInfo(android.os.Parcel p0) {}
    public OverlayInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, int p6, int p7, boolean p8) {}
    public OverlayInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, int p6, int p7, int p8, boolean p9, boolean p10) {}
    public OverlayInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, int p6, int p7, int p8, boolean p9, boolean p10, java.util.List<android.content.om.OverlayConstraint> p11) {}
    private void ensureValidState() {}
    public static java.lang.String stateToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getBaseCodePath() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getCategory() { return null; }
    public java.util.List<android.content.om.OverlayConstraint> getConstraints() { return null; }
    public android.content.om.OverlayIdentifier getOverlayIdentifier() { return null; }
    public java.lang.String getOverlayName() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getTargetOverlayableName() { return null; }
    public java.lang.String getTargetPackageName() { return null; }
    @android.annotation.SystemApi
    public int getUserId() { return 0; }
    public int hashCode() { return 0; }
    @android.annotation.SystemApi
    public boolean isEnabled() { return false; }
    public boolean isFabricated() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
