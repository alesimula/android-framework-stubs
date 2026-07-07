package com.android.internal.protolog;

public interface IProtoLogConfigurationService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.protolog.IProtoLogConfigurationService";
    public void registerClient(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterClientArgs p1) throws android.os.RemoteException;
    public void registerGroups(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterGroupsArgs p1) throws android.os.RemoteException;
    public void unregisterClient(com.android.internal.protolog.IProtoLogClient p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.protolog.IProtoLogConfigurationService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void registerClient(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterClientArgs p1) throws android.os.RemoteException {}
        public void registerGroups(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterGroupsArgs p1) throws android.os.RemoteException {}
        public void unregisterClient(com.android.internal.protolog.IProtoLogClient p0) throws android.os.RemoteException {}
    }

    public static class RegisterClientArgs implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.android.internal.protolog.IProtoLogConfigurationService.RegisterClientArgs> CREATOR = null;
        public java.lang.String[] groups;
        public boolean[] groupsDefaultLogcatStatus;
        public java.lang.String viewerConfigFile;
        public RegisterClientArgs() {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public java.lang.String toString() { return null; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class RegisterGroupsArgs implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.android.internal.protolog.IProtoLogConfigurationService.RegisterGroupsArgs> CREATOR = null;
        public java.lang.String[] groups;
        public boolean[] groupsDefaultLogcatStatus;
        public RegisterGroupsArgs() {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public java.lang.String toString() { return null; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.protolog.IProtoLogConfigurationService {
        static final int TRANSACTION_registerClient = 1;
        static final int TRANSACTION_registerGroups = 2;
        static final int TRANSACTION_unregisterClient = 3;
        public Stub() { super(); }
        public static com.android.internal.protolog.IProtoLogConfigurationService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.protolog.IProtoLogConfigurationService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void registerClient(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterClientArgs p1) throws android.os.RemoteException {}
            public void registerGroups(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterGroupsArgs p1) throws android.os.RemoteException {}
            public void unregisterClient(com.android.internal.protolog.IProtoLogClient p0) throws android.os.RemoteException {}
        }
    }
}
