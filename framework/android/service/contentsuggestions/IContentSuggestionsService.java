package android.service.contentsuggestions;

public interface IContentSuggestionsService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.contentsuggestions.IContentSuggestionsService";
    public void classifyContentSelections(android.app.contentsuggestions.ClassificationsRequest p0, android.app.contentsuggestions.IClassificationsCallback p1) throws android.os.RemoteException;
    public void notifyInteraction(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void provideContextImage(int p0, android.window.TaskSnapshot p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void suggestContentSelections(android.app.contentsuggestions.SelectionsRequest p0, android.app.contentsuggestions.ISelectionsCallback p1) throws android.os.RemoteException;

    public static class Default implements android.service.contentsuggestions.IContentSuggestionsService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void classifyContentSelections(android.app.contentsuggestions.ClassificationsRequest p0, android.app.contentsuggestions.IClassificationsCallback p1) throws android.os.RemoteException {}
        public void notifyInteraction(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void provideContextImage(int p0, android.window.TaskSnapshot p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void suggestContentSelections(android.app.contentsuggestions.SelectionsRequest p0, android.app.contentsuggestions.ISelectionsCallback p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.contentsuggestions.IContentSuggestionsService {
        static final int TRANSACTION_classifyContentSelections = 3;
        static final int TRANSACTION_notifyInteraction = 4;
        static final int TRANSACTION_provideContextImage = 1;
        static final int TRANSACTION_suggestContentSelections = 2;
        public Stub() { super(); }
        public static android.service.contentsuggestions.IContentSuggestionsService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.contentsuggestions.IContentSuggestionsService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void classifyContentSelections(android.app.contentsuggestions.ClassificationsRequest p0, android.app.contentsuggestions.IClassificationsCallback p1) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyInteraction(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void provideContextImage(int p0, android.window.TaskSnapshot p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void suggestContentSelections(android.app.contentsuggestions.SelectionsRequest p0, android.app.contentsuggestions.ISelectionsCallback p1) throws android.os.RemoteException {}
        }
    }
}
