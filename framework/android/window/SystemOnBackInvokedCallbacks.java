package android.window;

public final class SystemOnBackInvokedCallbacks {
    private static final android.window.SystemOnBackInvokedCallbacks.OverrideCallbackFactory<android.app.Activity> sFinishAndRemoveTaskFactory = null;
    private static final android.window.SystemOnBackInvokedCallbacks.OverrideCallbackFactory<android.app.Activity> sMoveTaskToBackFactory = null;
    private SystemOnBackInvokedCallbacks() {}
    public static android.window.OnBackInvokedCallback finishAndRemoveTaskCallback(android.app.Activity p0) { return null; }
    public static android.window.OnBackInvokedCallback moveTaskToBackCallback(android.app.Activity p0) { return null; }

    private static class FinishAndRemoveTaskCallbackFactory extends android.window.SystemOnBackInvokedCallbacks.OverrideCallbackFactory<android.app.Activity> {
        private FinishAndRemoveTaskCallbackFactory() { super(); }
        protected android.window.SystemOverrideOnBackInvokedCallback createCallback(android.app.Activity p0) { return null; }
    }

    private static class MoveTaskToBackCallbackFactory extends android.window.SystemOnBackInvokedCallbacks.OverrideCallbackFactory<android.app.Activity> {
        private MoveTaskToBackCallbackFactory() { super(); }
        protected android.window.SystemOverrideOnBackInvokedCallback createCallback(android.app.Activity p0) { return null; }
    }

    private static abstract class OverrideCallbackFactory<TYPE extends java.lang.Object> {
        private final android.util.ArrayMap<java.lang.ref.WeakReference<TYPE>, java.lang.ref.WeakReference<android.window.SystemOverrideOnBackInvokedCallback>> mObjectMap = null;
        private OverrideCallbackFactory() {}
        protected abstract android.window.SystemOverrideOnBackInvokedCallback createCallback(TYPE p0);
        android.window.SystemOverrideOnBackInvokedCallback getOverrideCallback(TYPE p0) { return null; }
    }
}
