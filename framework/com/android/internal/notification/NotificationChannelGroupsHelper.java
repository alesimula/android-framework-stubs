package com.android.internal.notification;

public class NotificationChannelGroupsHelper {
    public NotificationChannelGroupsHelper() {}
    public static android.app.NotificationChannelGroup getGroupWithChannels(java.lang.String p0, java.util.Collection<android.app.NotificationChannel> p1, java.util.Map<java.lang.String, android.app.NotificationChannelGroup> p2, boolean p3) { return null; }
    public static java.util.List<android.app.NotificationChannelGroup> getGroupsWithChannels(java.util.Collection<android.app.NotificationChannel> p0, java.util.Map<java.lang.String, android.app.NotificationChannelGroup> p1, com.android.internal.notification.NotificationChannelGroupsHelper.Params p2) { return null; }

    public static final class Params {
        private final java.util.Set<java.lang.String> channelFilter = null;
        private final boolean includeAllBlockedWithFilter = false;
        private final boolean includeDeleted = false;
        private final boolean includeEmpty = false;
        private final boolean includeNonGrouped = false;
        public Params(boolean p0, boolean p1, boolean p2, boolean p3, java.util.Set<java.lang.String> p4) {}
        public static com.android.internal.notification.NotificationChannelGroupsHelper.Params forAllChannels(boolean p0) { return null; }
        public static com.android.internal.notification.NotificationChannelGroupsHelper.Params forAllGroups() { return null; }
        public static com.android.internal.notification.NotificationChannelGroupsHelper.Params onlySpecifiedOrBlockedChannels(java.util.Set<java.lang.String> p0) { return null; }
        public java.util.Set<java.lang.String> channelFilter() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public boolean includeAllBlockedWithFilter() { return false; }
        public boolean includeDeleted() { return false; }
        public boolean includeEmpty() { return false; }
        public boolean includeNonGrouped() { return false; }
        public final java.lang.String toString() { return null; }
    }
}
