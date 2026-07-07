package android.security.advancedprotection;

public interface IAdvancedProtectionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.advancedprotection.IAdvancedProtectionService";
    public java.util.List<android.security.advancedprotection.AdvancedProtectionFeature> getAdvancedProtectionFeatures(int[] p0) throws android.os.RemoteException;
    public boolean isAdvancedProtectionEnabled() throws android.os.RemoteException;
    public void logDialogShown(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void registerAdvancedProtectionCallback(android.security.advancedprotection.IAdvancedProtectionCallback p0) throws android.os.RemoteException;
    public void registerAdvancedProtectionFeatureCallback(int[] p0, android.security.advancedprotection.IAdvancedProtectionFeatureCallback p1) throws android.os.RemoteException;
    public void setAdvancedProtectionEnabled(boolean p0) throws android.os.RemoteException;
    public void unregisterAdvancedProtectionCallback(android.security.advancedprotection.IAdvancedProtectionCallback p0) throws android.os.RemoteException;
    public void unregisterAdvancedProtectionFeatureCallback(android.security.advancedprotection.IAdvancedProtectionFeatureCallback p0) throws android.os.RemoteException;
    public java.util.List<android.security.advancedprotection.AdvancedProtectionFeature> updateAdvancedProtectionFeaturesProvisioning(int[] p0, int[] p1) throws android.os.RemoteException;

    public static class Default implements android.security.advancedprotection.IAdvancedProtectionService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public java.util.List<android.security.advancedprotection.AdvancedProtectionFeature> getAdvancedProtectionFeatures(int[] p0) throws android.os.RemoteException { return null; }
        public boolean isAdvancedProtectionEnabled() throws android.os.RemoteException { return false; }
        public void logDialogShown(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void registerAdvancedProtectionCallback(android.security.advancedprotection.IAdvancedProtectionCallback p0) throws android.os.RemoteException {}
        public void registerAdvancedProtectionFeatureCallback(int[] p0, android.security.advancedprotection.IAdvancedProtectionFeatureCallback p1) throws android.os.RemoteException {}
        public void setAdvancedProtectionEnabled(boolean p0) throws android.os.RemoteException {}
        public void unregisterAdvancedProtectionCallback(android.security.advancedprotection.IAdvancedProtectionCallback p0) throws android.os.RemoteException {}
        public void unregisterAdvancedProtectionFeatureCallback(android.security.advancedprotection.IAdvancedProtectionFeatureCallback p0) throws android.os.RemoteException {}
        public java.util.List<android.security.advancedprotection.AdvancedProtectionFeature> updateAdvancedProtectionFeaturesProvisioning(int[] p0, int[] p1) throws android.os.RemoteException { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.advancedprotection.IAdvancedProtectionService {
        static final int TRANSACTION_getAdvancedProtectionFeatures = 5;
        static final int TRANSACTION_isAdvancedProtectionEnabled = 1;
        static final int TRANSACTION_logDialogShown = 9;
        static final int TRANSACTION_registerAdvancedProtectionCallback = 2;
        static final int TRANSACTION_registerAdvancedProtectionFeatureCallback = 7;
        static final int TRANSACTION_setAdvancedProtectionEnabled = 4;
        static final int TRANSACTION_unregisterAdvancedProtectionCallback = 3;
        static final int TRANSACTION_unregisterAdvancedProtectionFeatureCallback = 8;
        static final int TRANSACTION_updateAdvancedProtectionFeaturesProvisioning = 6;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.security.advancedprotection.IAdvancedProtectionService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void getAdvancedProtectionFeatures_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void isAdvancedProtectionEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void logDialogShown_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void registerAdvancedProtectionCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void registerAdvancedProtectionFeatureCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void setAdvancedProtectionEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterAdvancedProtectionCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterAdvancedProtectionFeatureCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void updateAdvancedProtectionFeaturesProvisioning_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.security.advancedprotection.IAdvancedProtectionService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.util.List<android.security.advancedprotection.AdvancedProtectionFeature> getAdvancedProtectionFeatures(int[] p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isAdvancedProtectionEnabled() throws android.os.RemoteException { return false; }
            public void logDialogShown(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void registerAdvancedProtectionCallback(android.security.advancedprotection.IAdvancedProtectionCallback p0) throws android.os.RemoteException {}
            public void registerAdvancedProtectionFeatureCallback(int[] p0, android.security.advancedprotection.IAdvancedProtectionFeatureCallback p1) throws android.os.RemoteException {}
            public void setAdvancedProtectionEnabled(boolean p0) throws android.os.RemoteException {}
            public void unregisterAdvancedProtectionCallback(android.security.advancedprotection.IAdvancedProtectionCallback p0) throws android.os.RemoteException {}
            public void unregisterAdvancedProtectionFeatureCallback(android.security.advancedprotection.IAdvancedProtectionFeatureCallback p0) throws android.os.RemoteException {}
            public java.util.List<android.security.advancedprotection.AdvancedProtectionFeature> updateAdvancedProtectionFeaturesProvisioning(int[] p0, int[] p1) throws android.os.RemoteException { return null; }
        }
    }
}
