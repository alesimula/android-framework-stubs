package android.app.time;

public final class LocationTimeZoneAlgorithmStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.time.LocationTimeZoneAlgorithmStatus> CREATOR = null;
    public static final android.app.time.LocationTimeZoneAlgorithmStatus NOT_RUNNING = null;
    public static final android.app.time.LocationTimeZoneAlgorithmStatus NOT_SUPPORTED = null;
    private static final java.util.regex.Pattern PARSE_COMMAND_LINE_ARG_PATTERN = null;
    private static final java.lang.String PRIMARY_PROVIDER_REPORTED_STATUS_REGEX = "(?:, mPrimaryProviderReportedStatus=(null|TimeZoneProviderStatus\\{[^}]+\\}))?";
    public static final int PROVIDER_STATUS_IS_CERTAIN = 3;
    public static final int PROVIDER_STATUS_IS_UNCERTAIN = 4;
    public static final int PROVIDER_STATUS_NOT_PRESENT = 1;
    public static final int PROVIDER_STATUS_NOT_READY = 2;
    public static final android.app.time.LocationTimeZoneAlgorithmStatus RUNNING_NOT_REPORTED = null;
    private static final java.lang.String SECONDARY_PROVIDER_REPORTED_STATUS_REGEX = "(?:, mSecondaryProviderReportedStatus=(null|TimeZoneProviderStatus\\{[^}]+\\}))?";
    private final android.service.timezone.TimeZoneProviderStatus mPrimaryProviderReportedStatus = null;
    private final int mPrimaryProviderStatus = 0;
    private final android.service.timezone.TimeZoneProviderStatus mSecondaryProviderReportedStatus = null;
    private final int mSecondaryProviderStatus = 0;
    private final int mStatus = 0;
    public LocationTimeZoneAlgorithmStatus(int p0, int p1, android.service.timezone.TimeZoneProviderStatus p2, int p3, android.service.timezone.TimeZoneProviderStatus p4) {}
    private static boolean hasProviderReported(int p0) { return false; }
    public static android.app.time.LocationTimeZoneAlgorithmStatus parseCommandlineArg(java.lang.String p0) { return null; }
    private static android.service.timezone.TimeZoneProviderStatus parseTimeZoneProviderStatusOrNull(java.lang.String p0) { return null; }
    public static int providerStatusFromString(java.lang.String p0) { return 0; }
    public static java.lang.String providerStatusToString(int p0) { return null; }
    public static int requireValidProviderStatus(int p0) { return 0; }
    public boolean couldEnableTelephonyFallback() { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.service.timezone.TimeZoneProviderStatus getPrimaryProviderReportedStatus() { return null; }
    public int getPrimaryProviderStatus() { return 0; }
    public android.service.timezone.TimeZoneProviderStatus getSecondaryProviderReportedStatus() { return null; }
    public int getSecondaryProviderStatus() { return 0; }
    public int getStatus() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface ProviderStatus {
    }
}
