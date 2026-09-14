package com.android.internal.widget;

public final class PreviousLockscreenCredentialStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.widget.PreviousLockscreenCredentialStatus> CREATOR = null;
    private static final java.util.function.Supplier<java.time.Instant> DEFAULT_CURRENT_TIME_SUPPLIER = null;
    private static final java.util.function.Supplier<java.time.Duration> DEFAULT_ELAPSED_REALTIME_SUPPLIER = null;
    public static final int STATUS_ACTIVE = 1;
    public static final int STATUS_EXPIRED_TIME = 2;
    public static final int STATUS_EXPIRED_WRONG_GUESSES = 3;
    public static final int STATUS_UNKNOWN = 0;
    public final android.os.ParcelDuration currentTimeEnd = null;
    public final android.os.ParcelDuration elapsedRealtimeEnd = null;
    public final int status = 0;
    public final int type = 0;
    public final int userId = 0;
    public PreviousLockscreenCredentialStatus(int p0, int p1, int p2, java.time.Instant p3, java.time.Duration p4) {}
    private PreviousLockscreenCredentialStatus(android.os.Parcel p0) {}
    private java.time.Instant getCurrentTimeEnd() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public java.time.Duration validityRemaining() { return null; }
    public java.time.Duration validityRemaining(java.util.function.Supplier<java.time.Instant> p0, java.util.function.Supplier<java.time.Duration> p1) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
