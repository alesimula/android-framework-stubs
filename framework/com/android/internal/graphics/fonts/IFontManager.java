package com.android.internal.graphics.fonts;

public interface IFontManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.graphics.fonts.IFontManager";
    public android.text.FontConfig getFontConfig() throws android.os.RemoteException;
    public int updateFontFallbacks(java.util.List<android.graphics.fonts.FontUpdateRequest> p0) throws android.os.RemoteException;
    public int updateFontFamily(java.util.List<android.graphics.fonts.FontUpdateRequest> p0, int p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.graphics.fonts.IFontManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.text.FontConfig getFontConfig() throws android.os.RemoteException { return null; }
        public int updateFontFallbacks(java.util.List<android.graphics.fonts.FontUpdateRequest> p0) throws android.os.RemoteException { return 0; }
        public int updateFontFamily(java.util.List<android.graphics.fonts.FontUpdateRequest> p0, int p1) throws android.os.RemoteException { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.graphics.fonts.IFontManager {
        static final int TRANSACTION_getFontConfig = 1;
        static final int TRANSACTION_updateFontFallbacks = 3;
        static final int TRANSACTION_updateFontFamily = 2;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static com.android.internal.graphics.fonts.IFontManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void getFontConfig_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.graphics.fonts.IFontManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public android.text.FontConfig getFontConfig() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int updateFontFallbacks(java.util.List<android.graphics.fonts.FontUpdateRequest> p0) throws android.os.RemoteException { return 0; }
            public int updateFontFamily(java.util.List<android.graphics.fonts.FontUpdateRequest> p0, int p1) throws android.os.RemoteException { return 0; }
        }
    }
}
