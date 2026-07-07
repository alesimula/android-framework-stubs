package android.media;

public final class RoutingChangeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.RoutingChangeInfo> CREATOR = null;
    public static final int ENTRY_POINT_LOCAL_ROUTER_UNSPECIFIED = 3;
    public static final int ENTRY_POINT_PROXY_ROUTER_UNSPECIFIED = 4;
    public static final int ENTRY_POINT_SYSTEM_MEDIA_CONTROLS = 2;
    public static final int ENTRY_POINT_SYSTEM_OUTPUT_SWITCHER = 1;
    public static final int ENTRY_POINT_TV_OUTPUT_SWITCHER = 5;
    public static final int SUGGESTION_PROVIDER_DEVICE_SUGGESTION_APP = 2;
    public static final int SUGGESTION_PROVIDER_DEVICE_SUGGESTION_OTHER = 4;
    public static final int SUGGESTION_PROVIDER_RLP = 1;
    private final int mEntryPoint = 0;
    private final boolean mIsSuggested = false;
    private final int mSuggestionProviderFlags = 0;
    public RoutingChangeInfo(int p0, boolean p1) {}
    public RoutingChangeInfo(int p0, boolean p1, int p2) {}
    private RoutingChangeInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getEntryPoint() { return 0; }
    public int getSuggestionProviderFlags() { return 0; }
    public int hashCode() { return 0; }
    public boolean isSuggested() { return false; }
    public boolean isSuggestedByAnotherApp() { return false; }
    public boolean isSuggestedByMediaApp() { return false; }
    public boolean isSuggestedByRlp() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EntryPoint {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SuggestionProviderFlags {
    }
}
