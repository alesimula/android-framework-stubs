package android.app.permissionui;

public interface ILocationButtonSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.permissionui.ILocationButtonSession";
    public void changeConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public void resize(int p0, int p1) throws android.os.RemoteException;
    public void setBackgroundColor(int p0) throws android.os.RemoteException;
    public void setCornerRadius(float p0) throws android.os.RemoteException;
    public void setIconTint(int p0) throws android.os.RemoteException;
    public void setPadding(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void setPressedCornerRadius(float p0) throws android.os.RemoteException;
    public void setStrokeColor(int p0) throws android.os.RemoteException;
    public void setStrokeWidth(int p0) throws android.os.RemoteException;
    public void setTextColor(int p0) throws android.os.RemoteException;
    public void setTextType(int p0) throws android.os.RemoteException;

    public static class Default implements android.app.permissionui.ILocationButtonSession {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void changeConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public void resize(int p0, int p1) throws android.os.RemoteException {}
        public void setBackgroundColor(int p0) throws android.os.RemoteException {}
        public void setCornerRadius(float p0) throws android.os.RemoteException {}
        public void setIconTint(int p0) throws android.os.RemoteException {}
        public void setPadding(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void setPressedCornerRadius(float p0) throws android.os.RemoteException {}
        public void setStrokeColor(int p0) throws android.os.RemoteException {}
        public void setStrokeWidth(int p0) throws android.os.RemoteException {}
        public void setTextColor(int p0) throws android.os.RemoteException {}
        public void setTextType(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.permissionui.ILocationButtonSession {
        static final int TRANSACTION_changeConfiguration = 9;
        static final int TRANSACTION_close = 10;
        static final int TRANSACTION_resize = 7;
        static final int TRANSACTION_setBackgroundColor = 3;
        static final int TRANSACTION_setCornerRadius = 1;
        static final int TRANSACTION_setIconTint = 4;
        static final int TRANSACTION_setPadding = 8;
        static final int TRANSACTION_setPressedCornerRadius = 2;
        static final int TRANSACTION_setStrokeColor = 11;
        static final int TRANSACTION_setStrokeWidth = 12;
        static final int TRANSACTION_setTextColor = 6;
        static final int TRANSACTION_setTextType = 5;
        public Stub() { super(); }
        public static android.app.permissionui.ILocationButtonSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.permissionui.ILocationButtonSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void changeConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void resize(int p0, int p1) throws android.os.RemoteException {}
            public void setBackgroundColor(int p0) throws android.os.RemoteException {}
            public void setCornerRadius(float p0) throws android.os.RemoteException {}
            public void setIconTint(int p0) throws android.os.RemoteException {}
            public void setPadding(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void setPressedCornerRadius(float p0) throws android.os.RemoteException {}
            public void setStrokeColor(int p0) throws android.os.RemoteException {}
            public void setStrokeWidth(int p0) throws android.os.RemoteException {}
            public void setTextColor(int p0) throws android.os.RemoteException {}
            public void setTextType(int p0) throws android.os.RemoteException {}
        }
    }
}
