package android.companion.virtual.computercontrol;

public final class LifecycleStateTracker implements android.companion.virtual.computercontrol.ComputerControlSession.LifecycleCallback {
    private static final android.companion.virtual.computercontrol.LifecycleState INITIAL_STATE = null;
    private final java.util.List<android.companion.virtual.computercontrol.LifecycleStateTracker.CallbackRecord> mCallbacks = null;
    private final java.util.concurrent.atomic.AtomicBoolean mIsNotifyingCallbacks = null;
    private android.companion.virtual.computercontrol.LifecycleState mState;
    public LifecycleStateTracker() {}
    private void addStateConsumerInternal(java.util.concurrent.Executor p0, java.util.function.Consumer<android.companion.virtual.computercontrol.LifecycleState> p1, java.lang.Object p2) {}
    private static <T extends java.lang.Object> boolean containsIf(java.util.List<T> p0, java.util.function.Predicate<T> p1) { return false; }
    private void notifyAllCallbacks() {}
    private static void notifyCallback(android.companion.virtual.computercontrol.LifecycleState p0, android.companion.virtual.computercontrol.ComputerControlSession.LifecycleCallback p1) {}
    private void transitionTo(android.companion.virtual.computercontrol.LifecycleState p0) {}
    public void addCallback(java.util.concurrent.Executor p0, android.companion.virtual.computercontrol.ComputerControlSession.LifecycleCallback p1) {}
    public void addStateConsumer(java.util.concurrent.Executor p0, java.util.function.Consumer<android.companion.virtual.computercontrol.LifecycleState> p1) {}
    public android.companion.virtual.computercontrol.LifecycleState getCurrentState() { return null; }
    public void onActive() {}
    public void onBlocked(int p0, java.lang.String p1) {}
    public void onClosed(int p0) {}
    public void removeCallback(android.companion.virtual.computercontrol.ComputerControlSession.LifecycleCallback p0) {}

    private static final class CallbackRecord {
        private final java.lang.Object callbackToken = null;
        private final java.util.function.Consumer<android.companion.virtual.computercontrol.LifecycleState> stateConsumer = null;
        private CallbackRecord(java.util.function.Consumer<android.companion.virtual.computercontrol.LifecycleState> p0, java.lang.Object p1) {}
        public java.lang.Object callbackToken() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public java.util.function.Consumer<android.companion.virtual.computercontrol.LifecycleState> stateConsumer() { return null; }
        public final java.lang.String toString() { return null; }
    }
}
