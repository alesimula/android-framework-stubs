package com.android.internal.statusbar;

public class NotificationVisibility implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.statusbar.NotificationVisibility> CREATOR = null;
    private static final java.lang.String TAG = "NoViz";
    private static int sNexrId;
    public int count;
    int id;
    public java.lang.String key;
    public com.android.internal.statusbar.NotificationVisibility.NotificationLocation location;
    public int rank;
    public boolean visible;
    private NotificationVisibility() {}
    private static com.android.internal.statusbar.NotificationVisibility obtain() { return null; }
    private static com.android.internal.statusbar.NotificationVisibility obtain(android.os.Parcel p0) { return null; }
    public static com.android.internal.statusbar.NotificationVisibility obtain(java.lang.String p0, int p1, int p2, boolean p3) { return null; }
    public static com.android.internal.statusbar.NotificationVisibility obtain(java.lang.String p0, int p1, int p2, boolean p3, com.android.internal.statusbar.NotificationVisibility.NotificationLocation p4) { return null; }
    private void readFromParcel(android.os.Parcel p0) {}
    public com.android.internal.statusbar.NotificationVisibility clone() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void recycle() {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static enum NotificationLocation {
        LOCATION_BOTTOM_STACK_HIDDEN,
        LOCATION_BOTTOM_STACK_PEEKING,
        LOCATION_FIRST_HEADS_UP,
        LOCATION_GONE,
        LOCATION_HIDDEN_TOP,
        LOCATION_MAIN_AREA,
        LOCATION_UNKNOWN;
        private static final com.android.internal.statusbar.NotificationVisibility.NotificationLocation[] $VALUES = null;
        private final int mMetricsEventNotificationLocation = 0;
        private NotificationLocation() {}
        public int toMetricsEventEnum() { return 0; }
    }
}
