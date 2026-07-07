package android.uilatencystats;

public interface EventType {
    public static final int EVENT_BOOT_COMPLETED = 3;
    public static final int EVENT_LAUNCHER_SHOWN = 1;
    public static final int EVENT_LOCK_SCREEN_UNLOCK_START = 2;
    public static final int EVENT_USER_SWITCH = 0;
    public int getId();
    public java.lang.String getName();

    public static final class BootCompleted implements android.uilatencystats.EventType {
        public BootCompleted() {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public int getId() { return 0; }
        public java.lang.String getName() { return null; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Id {
    }

    public static final class LauncherShown implements android.uilatencystats.EventType {
        public LauncherShown() {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public int getId() { return 0; }
        public java.lang.String getName() { return null; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
    }

    public static final class LockScreenUnlockStart implements android.uilatencystats.EventType {
        public LockScreenUnlockStart() {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public int getId() { return 0; }
        public java.lang.String getName() { return null; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
    }

    public static final class UserSwitch implements android.uilatencystats.EventType {
        private final int toUserId = 0;
        public UserSwitch(int p0) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public int getId() { return 0; }
        public java.lang.String getName() { return null; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
        public int toUserId() { return 0; }
    }
}
