package android.app.time;

@android.annotation.SystemApi
public final class ExternalTimeSuggestion implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.time.ExternalTimeSuggestion> CREATOR = null;
    private final android.app.timedetector.TimeSuggestionHelper mTimeSuggestionHelper = null;
    public ExternalTimeSuggestion(long p0, long p1) {}
    private ExternalTimeSuggestion(android.app.timedetector.TimeSuggestionHelper p0) {}
    public static android.app.time.ExternalTimeSuggestion parseCommandLineArg(android.os.ShellCommand p0) throws java.lang.IllegalArgumentException { return null; }
    public static void printCommandLineOpts(java.io.PrintWriter p0) {}
    public void addDebugInfo(java.lang.String... p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<java.lang.String> getDebugInfo() { return null; }
    public android.app.time.UnixEpochTime getUnixEpochTime() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
