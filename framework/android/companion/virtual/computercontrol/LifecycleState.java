package android.companion.virtual.computercontrol;

public interface LifecycleState {
    public static final android.companion.virtual.computercontrol.LifecycleState ACTIVE = null;
    default public boolean isSuspended() { return false; }

    public static final class Active implements android.companion.virtual.computercontrol.LifecycleState {
        private Active() {}
        public java.lang.String toString() { return null; }
    }

    public static final class Blocked implements android.companion.virtual.computercontrol.LifecycleState {
        public final java.lang.String blockingPackage = null;
        public final int reason = 0;
        public Blocked(int p0, java.lang.String p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static final class Closed implements android.companion.virtual.computercontrol.LifecycleState {
        public final int reason = 0;
        public Closed(int p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
