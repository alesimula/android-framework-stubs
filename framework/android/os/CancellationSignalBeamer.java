package android.os;

public class CancellationSignalBeamer {
    static final java.lang.ref.Cleaner sCleaner = null;
    public CancellationSignalBeamer() {}

    public static class Receiver implements android.os.IBinder.DeathRecipient {
        private final boolean mCancelOnSenderDeath = false;
        private final java.util.HashMap<android.os.IBinder, android.os.CancellationSignal> mTokenMap = null;
        public Receiver(boolean p0) {}
        private void dead(android.os.IBinder p0) {}
        public void binderDied() {}
        public void binderDied(android.os.IBinder p0) {}
        public void cancel(android.os.IBinder p0) {}
        public void forget(android.os.IBinder p0) {}
        public android.os.CancellationSignal unbeam(android.os.IBinder p0) { return null; }
    }

    public static abstract class Sender {
        private static final java.lang.ThreadLocal<android.util.Pair<android.os.CancellationSignalBeamer.Sender, java.util.ArrayList<android.os.CancellationSignalBeamer.Sender.CloseableToken>>> sScope = null;
        public Sender() {}
        public static android.os.IBinder beamFromScope(android.os.CancellationSignal p0) { return null; }
        public android.os.CancellationSignalBeamer.Sender.CloseableToken beam(android.os.CancellationSignal p0) { return null; }
        public android.os.CancellationSignalBeamer.Sender.MustClose beamScopeIfNeeded(android.view.inputmethod.HandwritingGesture p0) { return null; }
        public abstract void onCancel(android.os.IBinder p0);
        public abstract void onForget(android.os.IBinder p0);

        public static interface CloseableToken extends android.os.IBinder, android.os.CancellationSignalBeamer.Sender.MustClose {
            public void close();
        }

        public static interface MustClose extends java.lang.AutoCloseable {
            public void close();
        }

        private static class Token extends android.os.Binder implements android.os.CancellationSignalBeamer.Sender.CloseableToken, java.lang.Runnable {
            private android.os.CancellationSignalBeamer.Sender.Token.Preparer mPreparer;
            private final android.os.CancellationSignalBeamer.Sender mSender = null;
            private Token(android.os.CancellationSignalBeamer.Sender p0, android.os.CancellationSignal p1) { super(); }
            public void close() {}
            public void run() {}

            private static class Preparer implements android.os.CancellationSignal.OnCancelListener {
                private final android.os.CancellationSignalBeamer.Sender mSender = null;
                private final android.os.CancellationSignal mSignal = null;
                private final android.os.CancellationSignalBeamer.Sender.Token mToken = null;
                private Preparer(android.os.CancellationSignalBeamer.Sender p0, android.os.CancellationSignal p1, android.os.CancellationSignalBeamer.Sender.Token p2) {}
                public void onCancel() {}
                void setup() {}
            }
        }
    }
}
