package android.service.personalcontext;

public interface IPersonalContextManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.personalcontext.IPersonalContextManager";
    public boolean isEnabled(android.service.personalcontext.PersonalContextManagerMetadata p0) throws android.os.RemoteException;
    public boolean isPersonalContextModeEnabled(android.service.personalcontext.PersonalContextManagerMetadata p0, java.lang.String p1) throws android.os.RemoteException;
    public android.service.personalcontext.Token mintToken() throws android.os.RemoteException;
    public void publishInsight(android.service.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.service.personalcontext.insight.ContextInsightWrapper> p1, android.os.ParcelUuid p2) throws android.os.RemoteException;
    public void publishInsightSurfaceHints(android.service.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2) throws android.os.RemoteException;
    public void publishTriggeringHint(android.service.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p1, java.util.List<android.service.personalcontext.RenderToken> p2, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p3) throws android.os.RemoteException;
    public void registerInsightSurfaceClient(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) throws android.os.RemoteException;
    public void reportEvent(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.insight.interaction.InsightEvent p1) throws android.os.RemoteException;
    public void setEnabled(android.service.personalcontext.PersonalContextManagerMetadata p0, boolean p1) throws android.os.RemoteException;
    public void setOperatingMode(android.service.personalcontext.PersonalContextManagerMetadata p0, int p1) throws android.os.RemoteException;
    public void setPersonalContextModeEnabled(android.service.personalcontext.PersonalContextManagerMetadata p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void showAttribution(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.insight.ContextInsightWrapper p1) throws android.os.RemoteException;
    public android.service.personalcontext.hint.PublishedContextHintWrapper signHint(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.hint.ContextHintWrapper p1, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p2) throws android.os.RemoteException;
    public void unregisterInsightSurfaceClient(android.service.personalcontext.PersonalContextManagerMetadata p0, android.os.ParcelUuid p1) throws android.os.RemoteException;
    public void updateEmbeddedClientInfo(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2) throws android.os.RemoteException;

    public static class Default implements android.service.personalcontext.IPersonalContextManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public boolean isEnabled(android.service.personalcontext.PersonalContextManagerMetadata p0) throws android.os.RemoteException { return false; }
        public boolean isPersonalContextModeEnabled(android.service.personalcontext.PersonalContextManagerMetadata p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public android.service.personalcontext.Token mintToken() throws android.os.RemoteException { return null; }
        public void publishInsight(android.service.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.service.personalcontext.insight.ContextInsightWrapper> p1, android.os.ParcelUuid p2) throws android.os.RemoteException {}
        public void publishInsightSurfaceHints(android.service.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2) throws android.os.RemoteException {}
        public void publishTriggeringHint(android.service.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p1, java.util.List<android.service.personalcontext.RenderToken> p2, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p3) throws android.os.RemoteException {}
        public void registerInsightSurfaceClient(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) throws android.os.RemoteException {}
        public void reportEvent(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.insight.interaction.InsightEvent p1) throws android.os.RemoteException {}
        public void setEnabled(android.service.personalcontext.PersonalContextManagerMetadata p0, boolean p1) throws android.os.RemoteException {}
        public void setOperatingMode(android.service.personalcontext.PersonalContextManagerMetadata p0, int p1) throws android.os.RemoteException {}
        public void setPersonalContextModeEnabled(android.service.personalcontext.PersonalContextManagerMetadata p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void showAttribution(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.insight.ContextInsightWrapper p1) throws android.os.RemoteException {}
        public android.service.personalcontext.hint.PublishedContextHintWrapper signHint(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.hint.ContextHintWrapper p1, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p2) throws android.os.RemoteException { return null; }
        public void unregisterInsightSurfaceClient(android.service.personalcontext.PersonalContextManagerMetadata p0, android.os.ParcelUuid p1) throws android.os.RemoteException {}
        public void updateEmbeddedClientInfo(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.personalcontext.IPersonalContextManager {
        static final int TRANSACTION_isEnabled = 13;
        static final int TRANSACTION_isPersonalContextModeEnabled = 10;
        static final int TRANSACTION_mintToken = 6;
        static final int TRANSACTION_publishInsight = 2;
        static final int TRANSACTION_publishInsightSurfaceHints = 7;
        static final int TRANSACTION_publishTriggeringHint = 1;
        static final int TRANSACTION_registerInsightSurfaceClient = 4;
        static final int TRANSACTION_reportEvent = 9;
        static final int TRANSACTION_setEnabled = 12;
        static final int TRANSACTION_setOperatingMode = 15;
        static final int TRANSACTION_setPersonalContextModeEnabled = 11;
        static final int TRANSACTION_showAttribution = 8;
        static final int TRANSACTION_signHint = 3;
        static final int TRANSACTION_unregisterInsightSurfaceClient = 5;
        static final int TRANSACTION_updateEmbeddedClientInfo = 14;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.service.personalcontext.IPersonalContextManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void publishInsightSurfaceHints_enforcePermission() throws java.lang.SecurityException {}
        protected void publishInsight_enforcePermission() throws java.lang.SecurityException {}
        protected void publishTriggeringHint_enforcePermission() throws java.lang.SecurityException {}
        protected void registerInsightSurfaceClient_enforcePermission() throws java.lang.SecurityException {}
        protected void setEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void setOperatingMode_enforcePermission() throws java.lang.SecurityException {}
        protected void setPersonalContextModeEnabled_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.service.personalcontext.IPersonalContextManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isEnabled(android.service.personalcontext.PersonalContextManagerMetadata p0) throws android.os.RemoteException { return false; }
            public boolean isPersonalContextModeEnabled(android.service.personalcontext.PersonalContextManagerMetadata p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public android.service.personalcontext.Token mintToken() throws android.os.RemoteException { return null; }
            public void publishInsight(android.service.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.service.personalcontext.insight.ContextInsightWrapper> p1, android.os.ParcelUuid p2) throws android.os.RemoteException {}
            public void publishInsightSurfaceHints(android.service.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2) throws android.os.RemoteException {}
            public void publishTriggeringHint(android.service.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p1, java.util.List<android.service.personalcontext.RenderToken> p2, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p3) throws android.os.RemoteException {}
            public void registerInsightSurfaceClient(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) throws android.os.RemoteException {}
            public void reportEvent(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.insight.interaction.InsightEvent p1) throws android.os.RemoteException {}
            public void setEnabled(android.service.personalcontext.PersonalContextManagerMetadata p0, boolean p1) throws android.os.RemoteException {}
            public void setOperatingMode(android.service.personalcontext.PersonalContextManagerMetadata p0, int p1) throws android.os.RemoteException {}
            public void setPersonalContextModeEnabled(android.service.personalcontext.PersonalContextManagerMetadata p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void showAttribution(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.insight.ContextInsightWrapper p1) throws android.os.RemoteException {}
            public android.service.personalcontext.hint.PublishedContextHintWrapper signHint(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.hint.ContextHintWrapper p1, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p2) throws android.os.RemoteException { return null; }
            public void unregisterInsightSurfaceClient(android.service.personalcontext.PersonalContextManagerMetadata p0, android.os.ParcelUuid p1) throws android.os.RemoteException {}
            public void updateEmbeddedClientInfo(android.service.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2) throws android.os.RemoteException {}
        }
    }
}
