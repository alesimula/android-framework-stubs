package com.android.internal.os;

public interface IBinaryTransparencyService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.os.IBinaryTransparencyService";
    public java.util.List<com.android.internal.os.IBinaryTransparencyService.ApexInfo> collectAllApexInfo(boolean p0) throws android.os.RemoteException;
    public java.util.List<com.android.internal.os.IBinaryTransparencyService.AppInfo> collectAllSilentInstalledMbaInfo(android.os.Bundle p0) throws android.os.RemoteException;
    public java.util.List<com.android.internal.os.IBinaryTransparencyService.AppInfo> collectAllUpdatedPreloadInfo(android.os.Bundle p0) throws android.os.RemoteException;
    public java.lang.String getSignedImageInfo() throws android.os.RemoteException;
    public void recordMeasurementsForAllPackages() throws android.os.RemoteException;

    public static class ApexInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.android.internal.os.IBinaryTransparencyService.ApexInfo> CREATOR = null;
        public byte[] digest;
        public int digestAlgorithm;
        public long longVersion;
        public java.lang.String moduleName;
        public java.lang.String packageName;
        public java.lang.String[] signerDigests;
        public ApexInfo() {}
        public int describeContents() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class AppInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.android.internal.os.IBinaryTransparencyService.AppInfo> CREATOR = null;
        public byte[] digest;
        public int digestAlgorithm;
        public java.lang.String initiator;
        public java.lang.String[] initiatorSignerDigests;
        public java.lang.String installer;
        public long longVersion;
        public int mbaStatus;
        public java.lang.String originator;
        public java.lang.String packageName;
        public java.lang.String[] signerDigests;
        public java.lang.String splitName;
        public AppInfo() {}
        public int describeContents() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class Default implements com.android.internal.os.IBinaryTransparencyService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public java.util.List<com.android.internal.os.IBinaryTransparencyService.ApexInfo> collectAllApexInfo(boolean p0) throws android.os.RemoteException { return null; }
        public java.util.List<com.android.internal.os.IBinaryTransparencyService.AppInfo> collectAllSilentInstalledMbaInfo(android.os.Bundle p0) throws android.os.RemoteException { return null; }
        public java.util.List<com.android.internal.os.IBinaryTransparencyService.AppInfo> collectAllUpdatedPreloadInfo(android.os.Bundle p0) throws android.os.RemoteException { return null; }
        public java.lang.String getSignedImageInfo() throws android.os.RemoteException { return null; }
        public void recordMeasurementsForAllPackages() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.os.IBinaryTransparencyService {
        static final int TRANSACTION_collectAllApexInfo = 3;
        static final int TRANSACTION_collectAllSilentInstalledMbaInfo = 5;
        static final int TRANSACTION_collectAllUpdatedPreloadInfo = 4;
        static final int TRANSACTION_getSignedImageInfo = 1;
        static final int TRANSACTION_recordMeasurementsForAllPackages = 2;
        public Stub() { super(); }
        public static com.android.internal.os.IBinaryTransparencyService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.os.IBinaryTransparencyService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.util.List<com.android.internal.os.IBinaryTransparencyService.ApexInfo> collectAllApexInfo(boolean p0) throws android.os.RemoteException { return null; }
            public java.util.List<com.android.internal.os.IBinaryTransparencyService.AppInfo> collectAllSilentInstalledMbaInfo(android.os.Bundle p0) throws android.os.RemoteException { return null; }
            public java.util.List<com.android.internal.os.IBinaryTransparencyService.AppInfo> collectAllUpdatedPreloadInfo(android.os.Bundle p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getSignedImageInfo() throws android.os.RemoteException { return null; }
            public void recordMeasurementsForAllPackages() throws android.os.RemoteException {}
        }
    }
}
