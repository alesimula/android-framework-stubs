package android.app;

class ConfigurationChangedListenerController {
    private final java.util.List<android.app.ConfigurationChangedListenerController.ListenerContainer> mListenerContainers = null;
    private final java.lang.Object mLock = null;
    ConfigurationChangedListenerController() {}
    private int indexOf(java.util.function.Consumer<android.os.IBinder> p0) { return 0; }
    void addListener(java.util.concurrent.Executor p0, java.util.function.Consumer<android.os.IBinder> p1) {}
    void dispatchOnConfigurationChanged(android.os.IBinder p0) {}
    void removeListener(java.util.function.Consumer<android.os.IBinder> p0) {}

    private static final class ListenerContainer {
        private final java.util.function.Consumer<android.os.IBinder> mConsumer = null;
        private final java.util.concurrent.Executor mExecutor = null;
        ListenerContainer(java.util.concurrent.Executor p0, java.util.function.Consumer<android.os.IBinder> p1) {}
        public void accept(android.os.IBinder p0) {}
        public boolean isMatch(java.util.function.Consumer<android.os.IBinder> p0) { return false; }
    }
}
