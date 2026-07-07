package com.android.internal.textservice;

public interface ITextServicesManager extends android.os.IInterface {
    public void finishSpellCheckerService(int p0, com.android.internal.textservice.ISpellCheckerSessionListener p1) throws android.os.RemoteException;
    public android.view.textservice.SpellCheckerInfo getCurrentSpellChecker(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.view.textservice.SpellCheckerSubtype getCurrentSpellCheckerSubtype(int p0, boolean p1) throws android.os.RemoteException;
    public android.view.textservice.SpellCheckerInfo[] getEnabledSpellCheckers(int p0) throws android.os.RemoteException;
    public void getSpellCheckerService(int p0, java.lang.String p1, java.lang.String p2, com.android.internal.textservice.ITextServicesSessionListener p3, com.android.internal.textservice.ISpellCheckerSessionListener p4, android.os.Bundle p5, int p6) throws android.os.RemoteException;
    public boolean isSpellCheckerEnabled(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.textservice.ITextServicesManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void finishSpellCheckerService(int p0, com.android.internal.textservice.ISpellCheckerSessionListener p1) throws android.os.RemoteException {}
        public android.view.textservice.SpellCheckerInfo getCurrentSpellChecker(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.view.textservice.SpellCheckerSubtype getCurrentSpellCheckerSubtype(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public android.view.textservice.SpellCheckerInfo[] getEnabledSpellCheckers(int p0) throws android.os.RemoteException { return null; }
        public void getSpellCheckerService(int p0, java.lang.String p1, java.lang.String p2, com.android.internal.textservice.ITextServicesSessionListener p3, com.android.internal.textservice.ISpellCheckerSessionListener p4, android.os.Bundle p5, int p6) throws android.os.RemoteException {}
        public boolean isSpellCheckerEnabled(int p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.textservice.ITextServicesManager {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.textservice.ITextServicesManager";
        static final int TRANSACTION_finishSpellCheckerService = 4;
        static final int TRANSACTION_getCurrentSpellChecker = 1;
        static final int TRANSACTION_getCurrentSpellCheckerSubtype = 2;
        static final int TRANSACTION_getEnabledSpellCheckers = 6;
        static final int TRANSACTION_getSpellCheckerService = 3;
        static final int TRANSACTION_isSpellCheckerEnabled = 5;
        public Stub() { super(); }
        public static com.android.internal.textservice.ITextServicesManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.textservice.ITextServicesManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void finishSpellCheckerService(int p0, com.android.internal.textservice.ISpellCheckerSessionListener p1) throws android.os.RemoteException {}
            public android.view.textservice.SpellCheckerInfo getCurrentSpellChecker(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.view.textservice.SpellCheckerSubtype getCurrentSpellCheckerSubtype(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public android.view.textservice.SpellCheckerInfo[] getEnabledSpellCheckers(int p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void getSpellCheckerService(int p0, java.lang.String p1, java.lang.String p2, com.android.internal.textservice.ITextServicesSessionListener p3, com.android.internal.textservice.ISpellCheckerSessionListener p4, android.os.Bundle p5, int p6) throws android.os.RemoteException {}
            public boolean isSpellCheckerEnabled(int p0) throws android.os.RemoteException { return false; }
        }
    }
}
