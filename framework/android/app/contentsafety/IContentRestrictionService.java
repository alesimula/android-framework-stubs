package android.app.contentsafety;

public interface IContentRestrictionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.contentsafety.IContentRestrictionService";
    public android.content.Intent createContentRestrictedIntent(android.content.LocusId p0) throws android.os.RemoteException;
    public java.lang.String getClassifyingPackage(int p0, java.lang.String p1, android.content.LocusId p2) throws android.os.RemoteException;
    public boolean isContentRestrictionEnabledForUser(int p0) throws android.os.RemoteException;
    public void requestClassification(int p0, android.app.contentsafety.ClassifiableContent p1, android.app.contentsafety.IContentSafetyCallback p2) throws android.os.RemoteException;
    public void setShouldAllowBypassingContentSafetyRoleQualification(boolean p0) throws android.os.RemoteException;
    public void setShouldAllowBypassingContentSafetySandboxingForUser(int p0, boolean p1) throws android.os.RemoteException;
    public boolean shouldAllowBypassingContentSafetyRoleQualification() throws android.os.RemoteException;
    public boolean shouldAllowBypassingContentSafetySandboxingForUser(int p0) throws android.os.RemoteException;

    public static class Default implements android.app.contentsafety.IContentRestrictionService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.content.Intent createContentRestrictedIntent(android.content.LocusId p0) throws android.os.RemoteException { return null; }
        public java.lang.String getClassifyingPackage(int p0, java.lang.String p1, android.content.LocusId p2) throws android.os.RemoteException { return null; }
        public boolean isContentRestrictionEnabledForUser(int p0) throws android.os.RemoteException { return false; }
        public void requestClassification(int p0, android.app.contentsafety.ClassifiableContent p1, android.app.contentsafety.IContentSafetyCallback p2) throws android.os.RemoteException {}
        public void setShouldAllowBypassingContentSafetyRoleQualification(boolean p0) throws android.os.RemoteException {}
        public void setShouldAllowBypassingContentSafetySandboxingForUser(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean shouldAllowBypassingContentSafetyRoleQualification() throws android.os.RemoteException { return false; }
        public boolean shouldAllowBypassingContentSafetySandboxingForUser(int p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.contentsafety.IContentRestrictionService {
        static final int TRANSACTION_createContentRestrictedIntent = 7;
        static final int TRANSACTION_getClassifyingPackage = 8;
        static final int TRANSACTION_isContentRestrictionEnabledForUser = 2;
        static final int TRANSACTION_requestClassification = 1;
        static final int TRANSACTION_setShouldAllowBypassingContentSafetyRoleQualification = 4;
        static final int TRANSACTION_setShouldAllowBypassingContentSafetySandboxingForUser = 6;
        static final int TRANSACTION_shouldAllowBypassingContentSafetyRoleQualification = 3;
        static final int TRANSACTION_shouldAllowBypassingContentSafetySandboxingForUser = 5;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.app.contentsafety.IContentRestrictionService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setShouldAllowBypassingContentSafetyRoleQualification_enforcePermission() throws java.lang.SecurityException {}
        protected void shouldAllowBypassingContentSafetyRoleQualification_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.app.contentsafety.IContentRestrictionService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public android.content.Intent createContentRestrictedIntent(android.content.LocusId p0) throws android.os.RemoteException { return null; }
            public java.lang.String getClassifyingPackage(int p0, java.lang.String p1, android.content.LocusId p2) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isContentRestrictionEnabledForUser(int p0) throws android.os.RemoteException { return false; }
            public void requestClassification(int p0, android.app.contentsafety.ClassifiableContent p1, android.app.contentsafety.IContentSafetyCallback p2) throws android.os.RemoteException {}
            public void setShouldAllowBypassingContentSafetyRoleQualification(boolean p0) throws android.os.RemoteException {}
            public void setShouldAllowBypassingContentSafetySandboxingForUser(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean shouldAllowBypassingContentSafetyRoleQualification() throws android.os.RemoteException { return false; }
            public boolean shouldAllowBypassingContentSafetySandboxingForUser(int p0) throws android.os.RemoteException { return false; }
        }
    }
}
