package android.app.timedetector;

public final class TelephonyTimeSuggestion implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.timedetector.TelephonyTimeSuggestion> CREATOR = null;
    private java.util.ArrayList<java.lang.String> mDebugInfo;
    private final int mSlotIndex = 0;
    private final android.app.time.UnixEpochTime mUnixEpochTime = null;
    private TelephonyTimeSuggestion(android.app.timedetector.TelephonyTimeSuggestion.Builder p0) {}
    private static android.app.timedetector.TelephonyTimeSuggestion createFromParcel(android.os.Parcel p0) { return null; }
    public static android.app.timedetector.TelephonyTimeSuggestion parseCommandLineArg(android.os.ShellCommand p0) throws java.lang.IllegalArgumentException { return null; }
    public static void printCommandLineOpts(java.io.PrintWriter p0) {}
    public void addDebugInfo(java.lang.String p0) {}
    public void addDebugInfo(java.util.List<java.lang.String> p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<java.lang.String> getDebugInfo() { return null; }
    public int getSlotIndex() { return 0; }
    public android.app.time.UnixEpochTime getUnixEpochTime() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.List<java.lang.String> mDebugInfo;
        private final int mSlotIndex = 0;
        private android.app.time.UnixEpochTime mUnixEpochTime;
        public Builder(int p0) {}
        public android.app.timedetector.TelephonyTimeSuggestion.Builder addDebugInfo(java.lang.String p0) { return null; }
        public android.app.timedetector.TelephonyTimeSuggestion build() { return null; }
        public android.app.timedetector.TelephonyTimeSuggestion.Builder setUnixEpochTime(android.app.time.UnixEpochTime p0) { return null; }
    }
}
