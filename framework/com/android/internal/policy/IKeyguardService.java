package com.android.internal.policy;

public interface IKeyguardService extends android.os.IInterface {
    public static final int SCREEN_TURNING_ON_REASON_DISPLAY_SWITCH = 1;
    public static final int SCREEN_TURNING_ON_REASON_UNKNOWN = 0;
    public void addStateMonitorCallback(com.android.internal.policy.IKeyguardStateCallback p0) throws android.os.RemoteException;
    public void dismiss(com.android.internal.policy.IKeyguardDismissCallback p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public void dismissKeyguardToLaunch(android.content.Intent p0) throws android.os.RemoteException;
    public void doKeyguardTimeout(android.os.Bundle p0) throws android.os.RemoteException;
    public void onBootCompleted() throws android.os.RemoteException;
    public void onDreamingStarted() throws android.os.RemoteException;
    public void onDreamingStopped() throws android.os.RemoteException;
    public void onFinishedGoingToSleep(int p0, boolean p1) throws android.os.RemoteException;
    public void onFinishedWakingUp() throws android.os.RemoteException;
    public void onScreenTurnedOff() throws android.os.RemoteException;
    public void onScreenTurnedOn() throws android.os.RemoteException;
    public void onScreenTurningOff() throws android.os.RemoteException;
    public void onScreenTurningOn(int p0, com.android.internal.policy.IKeyguardDrawnCallback p1) throws android.os.RemoteException;
    public void onShortPowerPressedGoHome() throws android.os.RemoteException;
    public void onStartedGoingToSleep(int p0) throws android.os.RemoteException;
    public void onStartedWakingUp(int p0, boolean p1) throws android.os.RemoteException;
    public void onSystemKeyPressed(int p0) throws android.os.RemoteException;
    public void onSystemReady() throws android.os.RemoteException;
    public void restoreKeyguardState(com.android.internal.policy.KeyguardState p0, com.android.internal.policy.IKeyguardStateCallback p1, com.android.internal.policy.IKeyguardDrawnCallback p2, boolean p3, android.os.Bundle p4) throws android.os.RemoteException;
    public void setCurrentUser(int p0) throws android.os.RemoteException;
    public void setKeyguardEnabled(boolean p0) throws android.os.RemoteException;
    public void setOccluded(boolean p0) throws android.os.RemoteException;
    public void showDismissibleKeyguard() throws android.os.RemoteException;
    public void startKeyguardExitAnimation(long p0, long p1) throws android.os.RemoteException;
    public void verifyUnlock(com.android.internal.policy.IKeyguardExitCallback p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.policy.IKeyguardService {
        public Default() {}
        public void addStateMonitorCallback(com.android.internal.policy.IKeyguardStateCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void dismiss(com.android.internal.policy.IKeyguardDismissCallback p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public void dismissKeyguardToLaunch(android.content.Intent p0) throws android.os.RemoteException {}
        public void doKeyguardTimeout(android.os.Bundle p0) throws android.os.RemoteException {}
        public void onBootCompleted() throws android.os.RemoteException {}
        public void onDreamingStarted() throws android.os.RemoteException {}
        public void onDreamingStopped() throws android.os.RemoteException {}
        public void onFinishedGoingToSleep(int p0, boolean p1) throws android.os.RemoteException {}
        public void onFinishedWakingUp() throws android.os.RemoteException {}
        public void onScreenTurnedOff() throws android.os.RemoteException {}
        public void onScreenTurnedOn() throws android.os.RemoteException {}
        public void onScreenTurningOff() throws android.os.RemoteException {}
        public void onScreenTurningOn(int p0, com.android.internal.policy.IKeyguardDrawnCallback p1) throws android.os.RemoteException {}
        public void onShortPowerPressedGoHome() throws android.os.RemoteException {}
        public void onStartedGoingToSleep(int p0) throws android.os.RemoteException {}
        public void onStartedWakingUp(int p0, boolean p1) throws android.os.RemoteException {}
        public void onSystemKeyPressed(int p0) throws android.os.RemoteException {}
        public void onSystemReady() throws android.os.RemoteException {}
        public void restoreKeyguardState(com.android.internal.policy.KeyguardState p0, com.android.internal.policy.IKeyguardStateCallback p1, com.android.internal.policy.IKeyguardDrawnCallback p2, boolean p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void setCurrentUser(int p0) throws android.os.RemoteException {}
        public void setKeyguardEnabled(boolean p0) throws android.os.RemoteException {}
        public void setOccluded(boolean p0) throws android.os.RemoteException {}
        public void showDismissibleKeyguard() throws android.os.RemoteException {}
        public void startKeyguardExitAnimation(long p0, long p1) throws android.os.RemoteException {}
        public void verifyUnlock(com.android.internal.policy.IKeyguardExitCallback p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.policy.IKeyguardService {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.policy.IKeyguardService";
        static final int TRANSACTION_addStateMonitorCallback = 2;
        static final int TRANSACTION_dismiss = 4;
        static final int TRANSACTION_dismissKeyguardToLaunch = 22;
        static final int TRANSACTION_doKeyguardTimeout = 17;
        static final int TRANSACTION_onBootCompleted = 19;
        static final int TRANSACTION_onDreamingStarted = 5;
        static final int TRANSACTION_onDreamingStopped = 6;
        static final int TRANSACTION_onFinishedGoingToSleep = 8;
        static final int TRANSACTION_onFinishedWakingUp = 10;
        static final int TRANSACTION_onScreenTurnedOff = 14;
        static final int TRANSACTION_onScreenTurnedOn = 12;
        static final int TRANSACTION_onScreenTurningOff = 13;
        static final int TRANSACTION_onScreenTurningOn = 11;
        static final int TRANSACTION_onShortPowerPressedGoHome = 21;
        static final int TRANSACTION_onStartedGoingToSleep = 7;
        static final int TRANSACTION_onStartedWakingUp = 9;
        static final int TRANSACTION_onSystemKeyPressed = 23;
        static final int TRANSACTION_onSystemReady = 16;
        static final int TRANSACTION_restoreKeyguardState = 25;
        static final int TRANSACTION_setCurrentUser = 18;
        static final int TRANSACTION_setKeyguardEnabled = 15;
        static final int TRANSACTION_setOccluded = 1;
        static final int TRANSACTION_showDismissibleKeyguard = 24;
        static final int TRANSACTION_startKeyguardExitAnimation = 20;
        static final int TRANSACTION_verifyUnlock = 3;
        public Stub() { super(); }
        public static com.android.internal.policy.IKeyguardService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.policy.IKeyguardService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addStateMonitorCallback(com.android.internal.policy.IKeyguardStateCallback p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void dismiss(com.android.internal.policy.IKeyguardDismissCallback p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public void dismissKeyguardToLaunch(android.content.Intent p0) throws android.os.RemoteException {}
            public void doKeyguardTimeout(android.os.Bundle p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onBootCompleted() throws android.os.RemoteException {}
            public void onDreamingStarted() throws android.os.RemoteException {}
            public void onDreamingStopped() throws android.os.RemoteException {}
            public void onFinishedGoingToSleep(int p0, boolean p1) throws android.os.RemoteException {}
            public void onFinishedWakingUp() throws android.os.RemoteException {}
            public void onScreenTurnedOff() throws android.os.RemoteException {}
            public void onScreenTurnedOn() throws android.os.RemoteException {}
            public void onScreenTurningOff() throws android.os.RemoteException {}
            public void onScreenTurningOn(int p0, com.android.internal.policy.IKeyguardDrawnCallback p1) throws android.os.RemoteException {}
            public void onShortPowerPressedGoHome() throws android.os.RemoteException {}
            public void onStartedGoingToSleep(int p0) throws android.os.RemoteException {}
            public void onStartedWakingUp(int p0, boolean p1) throws android.os.RemoteException {}
            public void onSystemKeyPressed(int p0) throws android.os.RemoteException {}
            public void onSystemReady() throws android.os.RemoteException {}
            public void restoreKeyguardState(com.android.internal.policy.KeyguardState p0, com.android.internal.policy.IKeyguardStateCallback p1, com.android.internal.policy.IKeyguardDrawnCallback p2, boolean p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void setCurrentUser(int p0) throws android.os.RemoteException {}
            public void setKeyguardEnabled(boolean p0) throws android.os.RemoteException {}
            public void setOccluded(boolean p0) throws android.os.RemoteException {}
            public void showDismissibleKeyguard() throws android.os.RemoteException {}
            public void startKeyguardExitAnimation(long p0, long p1) throws android.os.RemoteException {}
            public void verifyUnlock(com.android.internal.policy.IKeyguardExitCallback p0) throws android.os.RemoteException {}
        }
    }
}
