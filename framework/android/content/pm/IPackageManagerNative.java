package android.content.pm;

public interface IPackageManagerNative extends android.os.IInterface {
    public static final int LOCATION_PRODUCT = 4;
    public static final int LOCATION_SYSTEM = 1;
    public static final int LOCATION_VENDOR = 2;
    public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.lang.String getInstallerForPackage(java.lang.String p0) throws android.os.RemoteException;
    public int getLocationFlags(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getModuleMetadataPackageName() throws android.os.RemoteException;
    public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException;
    public android.content.pm.PackageInfoNative getPackageInfoWithSigningInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.PackageInfoNative[] getPackageInfoWithSigningInfoForUid(int p0) throws android.os.RemoteException;
    public int getPackageUid(java.lang.String p0, long p1, int p2) throws android.os.RemoteException;
    public android.content.pm.StagedApexInfo[] getStagedApexInfos() throws android.os.RemoteException;
    public int getTargetSdkVersionForPackage(java.lang.String p0) throws android.os.RemoteException;
    public long getVersionCodeForPackage(java.lang.String p0) throws android.os.RemoteException;
    public boolean hasSha256SigningCertificate(java.lang.String p0, byte[] p1) throws android.os.RemoteException;
    public boolean hasSystemFeature(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean[] isAudioPlaybackCaptureAllowed(java.lang.String[] p0) throws android.os.RemoteException;
    public boolean isPackageDebuggable(java.lang.String p0) throws android.os.RemoteException;
    public void registerStagedApexObserver(android.content.pm.IStagedApexObserver p0) throws android.os.RemoteException;
    public void unregisterStagedApexObserver(android.content.pm.IStagedApexObserver p0) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IPackageManagerNative {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public java.lang.String getInstallerForPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getLocationFlags(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getModuleMetadataPackageName() throws android.os.RemoteException { return null; }
        public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException { return null; }
        public android.content.pm.PackageInfoNative getPackageInfoWithSigningInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.PackageInfoNative[] getPackageInfoWithSigningInfoForUid(int p0) throws android.os.RemoteException { return null; }
        public int getPackageUid(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return 0; }
        public android.content.pm.StagedApexInfo[] getStagedApexInfos() throws android.os.RemoteException { return null; }
        public int getTargetSdkVersionForPackage(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public long getVersionCodeForPackage(java.lang.String p0) throws android.os.RemoteException { return 0L; }
        public boolean hasSha256SigningCertificate(java.lang.String p0, byte[] p1) throws android.os.RemoteException { return false; }
        public boolean hasSystemFeature(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean[] isAudioPlaybackCaptureAllowed(java.lang.String[] p0) throws android.os.RemoteException { return null; }
        public boolean isPackageDebuggable(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void registerStagedApexObserver(android.content.pm.IStagedApexObserver p0) throws android.os.RemoteException {}
        public void unregisterStagedApexObserver(android.content.pm.IStagedApexObserver p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageManagerNative {
        public static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageManagerNative";
        static final int TRANSACTION_checkPermission = 5;
        static final int TRANSACTION_getInstallerForPackage = 6;
        static final int TRANSACTION_getLocationFlags = 9;
        static final int TRANSACTION_getModuleMetadataPackageName = 11;
        static final int TRANSACTION_getNamesForUids = 1;
        static final int TRANSACTION_getPackageInfoWithSigningInfo = 2;
        static final int TRANSACTION_getPackageInfoWithSigningInfoForUid = 3;
        static final int TRANSACTION_getPackageUid = 4;
        static final int TRANSACTION_getStagedApexInfos = 17;
        static final int TRANSACTION_getTargetSdkVersionForPackage = 10;
        static final int TRANSACTION_getVersionCodeForPackage = 7;
        static final int TRANSACTION_hasSha256SigningCertificate = 12;
        static final int TRANSACTION_hasSystemFeature = 14;
        static final int TRANSACTION_isAudioPlaybackCaptureAllowed = 8;
        static final int TRANSACTION_isPackageDebuggable = 13;
        static final int TRANSACTION_registerStagedApexObserver = 15;
        static final int TRANSACTION_unregisterStagedApexObserver = 16;
        public Stub() { super(); }
        public static android.content.pm.IPackageManagerNative asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.content.pm.IPackageManagerNative {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public int checkPermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public java.lang.String getInstallerForPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getLocationFlags(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getModuleMetadataPackageName() throws android.os.RemoteException { return null; }
            public java.lang.String[] getNamesForUids(int[] p0) throws android.os.RemoteException { return null; }
            public android.content.pm.PackageInfoNative getPackageInfoWithSigningInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.PackageInfoNative[] getPackageInfoWithSigningInfoForUid(int p0) throws android.os.RemoteException { return null; }
            public int getPackageUid(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return 0; }
            public android.content.pm.StagedApexInfo[] getStagedApexInfos() throws android.os.RemoteException { return null; }
            public int getTargetSdkVersionForPackage(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public long getVersionCodeForPackage(java.lang.String p0) throws android.os.RemoteException { return 0L; }
            public boolean hasSha256SigningCertificate(java.lang.String p0, byte[] p1) throws android.os.RemoteException { return false; }
            public boolean hasSystemFeature(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean[] isAudioPlaybackCaptureAllowed(java.lang.String[] p0) throws android.os.RemoteException { return null; }
            public boolean isPackageDebuggable(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void registerStagedApexObserver(android.content.pm.IStagedApexObserver p0) throws android.os.RemoteException {}
            public void unregisterStagedApexObserver(android.content.pm.IStagedApexObserver p0) throws android.os.RemoteException {}
        }
    }
}
