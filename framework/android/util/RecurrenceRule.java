package android.util;

public class RecurrenceRule implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.util.RecurrenceRule> CREATOR = null;
    private static final boolean LOGD = Boolean.valueOf(false);
    private static final java.lang.String TAG = "RecurrenceRule";
    private static final int VERSION_INIT = 0;
    public static java.time.Clock sClock;
    public final java.time.ZonedDateTime end = null;
    public final java.time.Period period = null;
    public final java.time.ZonedDateTime start = null;
    private RecurrenceRule(android.os.Parcel p0) {}
    public RecurrenceRule(java.io.DataInputStream p0) throws java.io.IOException {}
    public RecurrenceRule(java.time.ZonedDateTime p0, java.time.ZonedDateTime p1, java.time.Period p2) {}
    @java.lang.Deprecated
    public static android.util.RecurrenceRule buildNever() { return null; }
    @java.lang.Deprecated
    public static android.util.RecurrenceRule buildRecurringMonthly(int p0, java.time.ZoneId p1) { return null; }
    public static java.lang.String convertPeriod(java.time.Period p0) { return null; }
    public static java.time.Period convertPeriod(java.lang.String p0) { return null; }
    public static java.lang.String convertZonedDateTime(java.time.ZonedDateTime p0) { return null; }
    public static java.time.ZonedDateTime convertZonedDateTime(java.lang.String p0) { return null; }
    public java.util.Iterator<android.util.Range<java.time.ZonedDateTime>> cycleIterator() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @java.lang.Deprecated
    public boolean isMonthly() { return false; }
    public boolean isRecurring() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToStream(java.io.DataOutputStream p0) throws java.io.IOException {}

    private class NonrecurringIterator implements java.util.Iterator<android.util.Range<java.time.ZonedDateTime>> {
        boolean hasNext;
        public NonrecurringIterator(android.util.RecurrenceRule p0) {}
        public boolean hasNext() { return false; }
        public android.util.Range<java.time.ZonedDateTime> next() { return null; }
    }

    private class RecurringIterator implements java.util.Iterator<android.util.Range<java.time.ZonedDateTime>> {
        java.time.ZonedDateTime cycleEnd;
        java.time.ZonedDateTime cycleStart;
        int i;
        public RecurringIterator(android.util.RecurrenceRule p0) {}
        private java.time.ZonedDateTime roundBoundaryTime(java.time.ZonedDateTime p0) { return null; }
        private void updateCycle() {}
        public boolean hasNext() { return false; }
        public android.util.Range<java.time.ZonedDateTime> next() { return null; }
    }
}
