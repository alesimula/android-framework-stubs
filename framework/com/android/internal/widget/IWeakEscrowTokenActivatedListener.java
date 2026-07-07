package com.android.internal.widget;

public interface IWeakEscrowTokenActivatedListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.widget.IWeakEscrowTokenActivatedListener";
    public void onWeakEscrowTokenActivated(long p0, int p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.widget.IWeakEscrowTokenActivatedListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onWeakEscrowTokenActivated(long p0, int p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.widget.IWeakEscrowTokenActivatedListener {
        static final int TRANSACTION_onWeakEscrowTokenActivated = 1;
        public Stub() { super(); }
        public static com.android.internal.widget.IWeakEscrowTokenActivatedListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.widget.IWeakEscrowTokenActivatedListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onWeakEscrowTokenActivated(long p0, int p1) throws android.os.RemoteException {}
        }
    }
}
