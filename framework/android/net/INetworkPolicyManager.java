package android.net;

public interface INetworkPolicyManager extends android.os.IInterface {
    public void addUidPolicy(int p0, int p1) throws android.os.RemoteException;
    public void factoryReset(java.lang.String p0) throws android.os.RemoteException;
    public int getMultipathPreference(android.net.Network p0) throws android.os.RemoteException;
    public android.net.NetworkPolicy[] getNetworkPolicies(java.lang.String p0) throws android.os.RemoteException;
    public boolean getRestrictBackground() throws android.os.RemoteException;
    public int getRestrictBackgroundByCaller() throws android.os.RemoteException;
    public int getRestrictBackgroundStatus(int p0) throws android.os.RemoteException;
    public android.telephony.SubscriptionPlan getSubscriptionPlan(android.net.NetworkTemplate p0) throws android.os.RemoteException;
    public android.telephony.SubscriptionPlan[] getSubscriptionPlans(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getSubscriptionPlansOwner(int p0) throws android.os.RemoteException;
    public int getUidPolicy(int p0) throws android.os.RemoteException;
    public int[] getUidsWithPolicy(int p0) throws android.os.RemoteException;
    public boolean isUidNetworkingBlocked(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isUidRestrictedOnMeteredNetworks(int p0) throws android.os.RemoteException;
    public void notifyStatsProviderWarningOrLimitReached() throws android.os.RemoteException;
    public void registerListener(android.net.INetworkPolicyListener p0) throws android.os.RemoteException;
    public void removeUidPolicy(int p0, int p1) throws android.os.RemoteException;
    public void setDeviceIdleMode(boolean p0) throws android.os.RemoteException;
    public void setNetworkPolicies(android.net.NetworkPolicy[] p0) throws android.os.RemoteException;
    public void setRestrictBackground(boolean p0) throws android.os.RemoteException;
    public void setSubscriptionOverride(int p0, int p1, int p2, int[] p3, long p4, java.lang.String p5) throws android.os.RemoteException;
    public void setSubscriptionPlans(int p0, android.telephony.SubscriptionPlan[] p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public void setUidPolicy(int p0, int p1) throws android.os.RemoteException;
    public void setWifiMeteredOverride(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void snoozeLimit(android.net.NetworkTemplate p0) throws android.os.RemoteException;
    public void unregisterListener(android.net.INetworkPolicyListener p0) throws android.os.RemoteException;

    public static class Default implements android.net.INetworkPolicyManager {
        public Default() {}
        public void addUidPolicy(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void factoryReset(java.lang.String p0) throws android.os.RemoteException {}
        public int getMultipathPreference(android.net.Network p0) throws android.os.RemoteException { return 0; }
        public android.net.NetworkPolicy[] getNetworkPolicies(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean getRestrictBackground() throws android.os.RemoteException { return false; }
        public int getRestrictBackgroundByCaller() throws android.os.RemoteException { return 0; }
        public int getRestrictBackgroundStatus(int p0) throws android.os.RemoteException { return 0; }
        public android.telephony.SubscriptionPlan getSubscriptionPlan(android.net.NetworkTemplate p0) throws android.os.RemoteException { return null; }
        public android.telephony.SubscriptionPlan[] getSubscriptionPlans(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getSubscriptionPlansOwner(int p0) throws android.os.RemoteException { return null; }
        public int getUidPolicy(int p0) throws android.os.RemoteException { return 0; }
        public int[] getUidsWithPolicy(int p0) throws android.os.RemoteException { return null; }
        public boolean isUidNetworkingBlocked(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean isUidRestrictedOnMeteredNetworks(int p0) throws android.os.RemoteException { return false; }
        public void notifyStatsProviderWarningOrLimitReached() throws android.os.RemoteException {}
        public void registerListener(android.net.INetworkPolicyListener p0) throws android.os.RemoteException {}
        public void removeUidPolicy(int p0, int p1) throws android.os.RemoteException {}
        public void setDeviceIdleMode(boolean p0) throws android.os.RemoteException {}
        public void setNetworkPolicies(android.net.NetworkPolicy[] p0) throws android.os.RemoteException {}
        public void setRestrictBackground(boolean p0) throws android.os.RemoteException {}
        public void setSubscriptionOverride(int p0, int p1, int p2, int[] p3, long p4, java.lang.String p5) throws android.os.RemoteException {}
        public void setSubscriptionPlans(int p0, android.telephony.SubscriptionPlan[] p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setUidPolicy(int p0, int p1) throws android.os.RemoteException {}
        public void setWifiMeteredOverride(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void snoozeLimit(android.net.NetworkTemplate p0) throws android.os.RemoteException {}
        public void unregisterListener(android.net.INetworkPolicyListener p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.net.INetworkPolicyManager {
        public static final java.lang.String DESCRIPTOR = "android.net.INetworkPolicyManager";
        static final int TRANSACTION_addUidPolicy = 2;
        static final int TRANSACTION_factoryReset = 24;
        static final int TRANSACTION_getMultipathPreference = 17;
        static final int TRANSACTION_getNetworkPolicies = 9;
        static final int TRANSACTION_getRestrictBackground = 12;
        static final int TRANSACTION_getRestrictBackgroundByCaller = 13;
        static final int TRANSACTION_getRestrictBackgroundStatus = 14;
        static final int TRANSACTION_getSubscriptionPlan = 18;
        static final int TRANSACTION_getSubscriptionPlans = 20;
        static final int TRANSACTION_getSubscriptionPlansOwner = 22;
        static final int TRANSACTION_getUidPolicy = 4;
        static final int TRANSACTION_getUidsWithPolicy = 5;
        static final int TRANSACTION_isUidNetworkingBlocked = 25;
        static final int TRANSACTION_isUidRestrictedOnMeteredNetworks = 26;
        static final int TRANSACTION_notifyStatsProviderWarningOrLimitReached = 19;
        static final int TRANSACTION_registerListener = 6;
        static final int TRANSACTION_removeUidPolicy = 3;
        static final int TRANSACTION_setDeviceIdleMode = 15;
        static final int TRANSACTION_setNetworkPolicies = 8;
        static final int TRANSACTION_setRestrictBackground = 11;
        static final int TRANSACTION_setSubscriptionOverride = 23;
        static final int TRANSACTION_setSubscriptionPlans = 21;
        static final int TRANSACTION_setUidPolicy = 1;
        static final int TRANSACTION_setWifiMeteredOverride = 16;
        static final int TRANSACTION_snoozeLimit = 10;
        static final int TRANSACTION_unregisterListener = 7;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.net.INetworkPolicyManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void addUidPolicy_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        protected void factoryReset_enforcePermission() throws java.lang.SecurityException {}
        protected void getNetworkPolicies_enforcePermission() throws java.lang.SecurityException {}
        protected void getRestrictBackgroundByCaller_enforcePermission() throws java.lang.SecurityException {}
        protected void getRestrictBackground_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void getUidPolicy_enforcePermission() throws java.lang.SecurityException {}
        protected void getUidsWithPolicy_enforcePermission() throws java.lang.SecurityException {}
        protected void isUidRestrictedOnMeteredNetworks_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void removeUidPolicy_enforcePermission() throws java.lang.SecurityException {}
        protected void setDeviceIdleMode_enforcePermission() throws java.lang.SecurityException {}
        protected void setNetworkPolicies_enforcePermission() throws java.lang.SecurityException {}
        protected void setUidPolicy_enforcePermission() throws java.lang.SecurityException {}
        protected void setWifiMeteredOverride_enforcePermission() throws java.lang.SecurityException {}
        protected void snoozeLimit_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.net.INetworkPolicyManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addUidPolicy(int p0, int p1) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void factoryReset(java.lang.String p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getMultipathPreference(android.net.Network p0) throws android.os.RemoteException { return 0; }
            public android.net.NetworkPolicy[] getNetworkPolicies(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean getRestrictBackground() throws android.os.RemoteException { return false; }
            public int getRestrictBackgroundByCaller() throws android.os.RemoteException { return 0; }
            public int getRestrictBackgroundStatus(int p0) throws android.os.RemoteException { return 0; }
            public android.telephony.SubscriptionPlan getSubscriptionPlan(android.net.NetworkTemplate p0) throws android.os.RemoteException { return null; }
            public android.telephony.SubscriptionPlan[] getSubscriptionPlans(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getSubscriptionPlansOwner(int p0) throws android.os.RemoteException { return null; }
            public int getUidPolicy(int p0) throws android.os.RemoteException { return 0; }
            public int[] getUidsWithPolicy(int p0) throws android.os.RemoteException { return null; }
            public boolean isUidNetworkingBlocked(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean isUidRestrictedOnMeteredNetworks(int p0) throws android.os.RemoteException { return false; }
            public void notifyStatsProviderWarningOrLimitReached() throws android.os.RemoteException {}
            public void registerListener(android.net.INetworkPolicyListener p0) throws android.os.RemoteException {}
            public void removeUidPolicy(int p0, int p1) throws android.os.RemoteException {}
            public void setDeviceIdleMode(boolean p0) throws android.os.RemoteException {}
            public void setNetworkPolicies(android.net.NetworkPolicy[] p0) throws android.os.RemoteException {}
            public void setRestrictBackground(boolean p0) throws android.os.RemoteException {}
            public void setSubscriptionOverride(int p0, int p1, int p2, int[] p3, long p4, java.lang.String p5) throws android.os.RemoteException {}
            public void setSubscriptionPlans(int p0, android.telephony.SubscriptionPlan[] p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
            public void setUidPolicy(int p0, int p1) throws android.os.RemoteException {}
            public void setWifiMeteredOverride(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void snoozeLimit(android.net.NetworkTemplate p0) throws android.os.RemoteException {}
            public void unregisterListener(android.net.INetworkPolicyListener p0) throws android.os.RemoteException {}
        }
    }
}
