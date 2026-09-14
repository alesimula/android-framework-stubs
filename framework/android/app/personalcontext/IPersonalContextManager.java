package android.app.personalcontext;

public interface IPersonalContextManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.personalcontext.IPersonalContextManager";
    public java.util.List<android.content.ComponentName> getEnabledUnderstanders(android.app.personalcontext.PersonalContextManagerMetadata p0) throws android.os.RemoteException;
    public int getPersonalContextModeEnabledDefault(android.app.personalcontext.PersonalContextManagerMetadata p0) throws android.os.RemoteException;
    public boolean isEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0) throws android.os.RemoteException;
    public boolean isPersonalContextModeEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, java.lang.String p1) throws android.os.RemoteException;
    public android.app.personalcontext.Token mintToken() throws android.os.RemoteException;
    public void publishInsight(android.app.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.app.personalcontext.insight.ContextInsightWrapper> p1, android.os.ParcelUuid p2) throws android.os.RemoteException;
    public void publishInsightSurfaceHints(android.app.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2) throws android.os.RemoteException;
    public void publishRemoteAutofillHint(android.app.personalcontext.PersonalContextManagerMetadata p0, android.app.personalcontext.hint.ContextHintWrapper p1, android.view.autofill.AutofillId p2, android.os.IBinder p3, int p4) throws android.os.RemoteException;
    public void publishTriggeringHint(android.app.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p1, java.util.List<android.app.personalcontext.RenderToken> p2, java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p3) throws android.os.RemoteException;
    public void registerInsightSurfaceClient(android.app.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) throws android.os.RemoteException;
    public void reportEvent(android.app.personalcontext.PersonalContextManagerMetadata p0, android.app.personalcontext.insight.interaction.InsightEvent p1) throws android.os.RemoteException;
    public void requestUnderstanderEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException;
    public void setEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, boolean p1) throws android.os.RemoteException;
    public void setOperatingMode(android.app.personalcontext.PersonalContextManagerMetadata p0, int p1) throws android.os.RemoteException;
    public void setPersonalContextModeEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void setPersonalContextModeEnabledDefault(android.app.personalcontext.PersonalContextManagerMetadata p0, int p1) throws android.os.RemoteException;
    public void setUnderstanderEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, android.content.ComponentName p1, int p2, boolean p3) throws android.os.RemoteException;
    public void showAttribution(android.app.personalcontext.PersonalContextManagerMetadata p0, android.app.personalcontext.insight.ContextInsightWrapper p1) throws android.os.RemoteException;
    public android.app.personalcontext.hint.PublishedContextHintWrapper signHint(android.app.personalcontext.PersonalContextManagerMetadata p0, android.app.personalcontext.hint.ContextHintWrapper p1, java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p2) throws android.os.RemoteException;
    public void unregisterInsightSurfaceClient(android.app.personalcontext.PersonalContextManagerMetadata p0, android.os.ParcelUuid p1) throws android.os.RemoteException;
    public void updateEmbeddedClientInfo(android.app.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2) throws android.os.RemoteException;

    public static class Default implements android.app.personalcontext.IPersonalContextManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public java.util.List<android.content.ComponentName> getEnabledUnderstanders(android.app.personalcontext.PersonalContextManagerMetadata p0) throws android.os.RemoteException { return null; }
        public int getPersonalContextModeEnabledDefault(android.app.personalcontext.PersonalContextManagerMetadata p0) throws android.os.RemoteException { return 0; }
        public boolean isEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0) throws android.os.RemoteException { return false; }
        public boolean isPersonalContextModeEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public android.app.personalcontext.Token mintToken() throws android.os.RemoteException { return null; }
        public void publishInsight(android.app.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.app.personalcontext.insight.ContextInsightWrapper> p1, android.os.ParcelUuid p2) throws android.os.RemoteException {}
        public void publishInsightSurfaceHints(android.app.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2) throws android.os.RemoteException {}
        public void publishRemoteAutofillHint(android.app.personalcontext.PersonalContextManagerMetadata p0, android.app.personalcontext.hint.ContextHintWrapper p1, android.view.autofill.AutofillId p2, android.os.IBinder p3, int p4) throws android.os.RemoteException {}
        public void publishTriggeringHint(android.app.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p1, java.util.List<android.app.personalcontext.RenderToken> p2, java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p3) throws android.os.RemoteException {}
        public void registerInsightSurfaceClient(android.app.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) throws android.os.RemoteException {}
        public void reportEvent(android.app.personalcontext.PersonalContextManagerMetadata p0, android.app.personalcontext.insight.interaction.InsightEvent p1) throws android.os.RemoteException {}
        public void requestUnderstanderEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
        public void setEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, boolean p1) throws android.os.RemoteException {}
        public void setOperatingMode(android.app.personalcontext.PersonalContextManagerMetadata p0, int p1) throws android.os.RemoteException {}
        public void setPersonalContextModeEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void setPersonalContextModeEnabledDefault(android.app.personalcontext.PersonalContextManagerMetadata p0, int p1) throws android.os.RemoteException {}
        public void setUnderstanderEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, android.content.ComponentName p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void showAttribution(android.app.personalcontext.PersonalContextManagerMetadata p0, android.app.personalcontext.insight.ContextInsightWrapper p1) throws android.os.RemoteException {}
        public android.app.personalcontext.hint.PublishedContextHintWrapper signHint(android.app.personalcontext.PersonalContextManagerMetadata p0, android.app.personalcontext.hint.ContextHintWrapper p1, java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p2) throws android.os.RemoteException { return null; }
        public void unregisterInsightSurfaceClient(android.app.personalcontext.PersonalContextManagerMetadata p0, android.os.ParcelUuid p1) throws android.os.RemoteException {}
        public void updateEmbeddedClientInfo(android.app.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.personalcontext.IPersonalContextManager {
        static final int TRANSACTION_getEnabledUnderstanders = 21;
        static final int TRANSACTION_getPersonalContextModeEnabledDefault = 18;
        static final int TRANSACTION_isEnabled = 14;
        static final int TRANSACTION_isPersonalContextModeEnabled = 11;
        static final int TRANSACTION_mintToken = 7;
        static final int TRANSACTION_publishInsight = 3;
        static final int TRANSACTION_publishInsightSurfaceHints = 8;
        static final int TRANSACTION_publishRemoteAutofillHint = 2;
        static final int TRANSACTION_publishTriggeringHint = 1;
        static final int TRANSACTION_registerInsightSurfaceClient = 5;
        static final int TRANSACTION_reportEvent = 10;
        static final int TRANSACTION_requestUnderstanderEnabled = 20;
        static final int TRANSACTION_setEnabled = 13;
        static final int TRANSACTION_setOperatingMode = 16;
        static final int TRANSACTION_setPersonalContextModeEnabled = 12;
        static final int TRANSACTION_setPersonalContextModeEnabledDefault = 19;
        static final int TRANSACTION_setUnderstanderEnabled = 17;
        static final int TRANSACTION_showAttribution = 9;
        static final int TRANSACTION_signHint = 4;
        static final int TRANSACTION_unregisterInsightSurfaceClient = 6;
        static final int TRANSACTION_updateEmbeddedClientInfo = 15;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.app.personalcontext.IPersonalContextManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void publishInsightSurfaceHints_enforcePermission() throws java.lang.SecurityException {}
        protected void publishInsight_enforcePermission() throws java.lang.SecurityException {}
        protected void publishRemoteAutofillHint_enforcePermission() throws java.lang.SecurityException {}
        protected void publishTriggeringHint_enforcePermission() throws java.lang.SecurityException {}
        protected void registerInsightSurfaceClient_enforcePermission() throws java.lang.SecurityException {}
        protected void requestUnderstanderEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void setEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void setOperatingMode_enforcePermission() throws java.lang.SecurityException {}
        protected void setPersonalContextModeEnabledDefault_enforcePermission() throws java.lang.SecurityException {}
        protected void setPersonalContextModeEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void setUnderstanderEnabled_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.app.personalcontext.IPersonalContextManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.util.List<android.content.ComponentName> getEnabledUnderstanders(android.app.personalcontext.PersonalContextManagerMetadata p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getPersonalContextModeEnabledDefault(android.app.personalcontext.PersonalContextManagerMetadata p0) throws android.os.RemoteException { return 0; }
            public boolean isEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0) throws android.os.RemoteException { return false; }
            public boolean isPersonalContextModeEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public android.app.personalcontext.Token mintToken() throws android.os.RemoteException { return null; }
            public void publishInsight(android.app.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.app.personalcontext.insight.ContextInsightWrapper> p1, android.os.ParcelUuid p2) throws android.os.RemoteException {}
            public void publishInsightSurfaceHints(android.app.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2) throws android.os.RemoteException {}
            public void publishRemoteAutofillHint(android.app.personalcontext.PersonalContextManagerMetadata p0, android.app.personalcontext.hint.ContextHintWrapper p1, android.view.autofill.AutofillId p2, android.os.IBinder p3, int p4) throws android.os.RemoteException {}
            public void publishTriggeringHint(android.app.personalcontext.PersonalContextManagerMetadata p0, java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p1, java.util.List<android.app.personalcontext.RenderToken> p2, java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p3) throws android.os.RemoteException {}
            public void registerInsightSurfaceClient(android.app.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) throws android.os.RemoteException {}
            public void reportEvent(android.app.personalcontext.PersonalContextManagerMetadata p0, android.app.personalcontext.insight.interaction.InsightEvent p1) throws android.os.RemoteException {}
            public void requestUnderstanderEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
            public void setEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, boolean p1) throws android.os.RemoteException {}
            public void setOperatingMode(android.app.personalcontext.PersonalContextManagerMetadata p0, int p1) throws android.os.RemoteException {}
            public void setPersonalContextModeEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void setPersonalContextModeEnabledDefault(android.app.personalcontext.PersonalContextManagerMetadata p0, int p1) throws android.os.RemoteException {}
            public void setUnderstanderEnabled(android.app.personalcontext.PersonalContextManagerMetadata p0, android.content.ComponentName p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void showAttribution(android.app.personalcontext.PersonalContextManagerMetadata p0, android.app.personalcontext.insight.ContextInsightWrapper p1) throws android.os.RemoteException {}
            public android.app.personalcontext.hint.PublishedContextHintWrapper signHint(android.app.personalcontext.PersonalContextManagerMetadata p0, android.app.personalcontext.hint.ContextHintWrapper p1, java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p2) throws android.os.RemoteException { return null; }
            public void unregisterInsightSurfaceClient(android.app.personalcontext.PersonalContextManagerMetadata p0, android.os.ParcelUuid p1) throws android.os.RemoteException {}
            public void updateEmbeddedClientInfo(android.app.personalcontext.PersonalContextManagerMetadata p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2) throws android.os.RemoteException {}
        }
    }
}
