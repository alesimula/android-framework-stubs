package android.media.tv.interactive;

public interface ITvInteractiveAppSessionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.interactive.ITvInteractiveAppSessionCallback";
    public void onAdBufferReady(android.media.tv.AdBuffer p0) throws android.os.RemoteException;
    public void onAdRequest(android.media.tv.AdRequest p0) throws android.os.RemoteException;
    public void onBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException;
    public void onBroadcastInfoRequest(android.media.tv.BroadcastInfoRequest p0) throws android.os.RemoteException;
    public void onCancelParentalControlApproval() throws android.os.RemoteException;
    public void onCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onInteractiveAppInfoChanged(android.media.tv.interactive.TvInteractiveAppInfo p0) throws android.os.RemoteException;
    public void onInteractiveAppStreamingTrackSelected(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onInteractiveAppStreamingTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException;
    public void onKeySetChanged(int p0, int[] p1) throws android.os.RemoteException;
    public void onLayoutSurface(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onOperatorAppStateChanged(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1) throws android.os.RemoteException;
    public void onOperatorAppStatusChanged(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void onOperatorAppSupportedStatus(boolean p0) throws android.os.RemoteException;
    public void onOperatorAppUpdateRequest(android.media.tv.interactive.OperatorAppServiceInfo p0, boolean p1) throws android.os.RemoteException;
    public void onRemoveBroadcastInfo(int p0) throws android.os.RemoteException;
    public void onReplaceUiElements(int[] p0) throws android.os.RemoteException;
    public void onRequestAvailableSpeeds() throws android.os.RemoteException;
    public void onRequestCertificate(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onRequestCurrentChannelLcn() throws android.os.RemoteException;
    public void onRequestCurrentChannelUri() throws android.os.RemoteException;
    public void onRequestCurrentTvInputId() throws android.os.RemoteException;
    public void onRequestCurrentVideoBounds() throws android.os.RemoteException;
    public void onRequestCurrentVideoBoundsWithTarget(int p0) throws android.os.RemoteException;
    public void onRequestParentalControlApproval(int p0, boolean p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void onRequestParentalControlPinLength() throws android.os.RemoteException;
    public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.net.Uri p3, android.os.Bundle p4) throws android.os.RemoteException;
    public void onRequestScheduleRecording2(java.lang.String p0, java.lang.String p1, android.net.Uri p2, long p3, long p4, int p5, android.os.Bundle p6) throws android.os.RemoteException;
    public void onRequestSelectedTrackInfo() throws android.os.RemoteException;
    public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) throws android.os.RemoteException;
    public void onRequestSigning2(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, byte[] p4) throws android.os.RemoteException;
    public void onRequestStartRecording(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException;
    public void onRequestStopRecording(java.lang.String p0) throws android.os.RemoteException;
    public void onRequestStreamVolume() throws android.os.RemoteException;
    public void onRequestTimeShiftMode() throws android.os.RemoteException;
    public void onRequestTrackInfoList() throws android.os.RemoteException;
    public void onRequestTvRecordingInfo(java.lang.String p0) throws android.os.RemoteException;
    public void onRequestTvRecordingInfoList(int p0) throws android.os.RemoteException;
    public void onRequestVerifyParentalControlPin(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onSendWebServiceClientList(java.util.List<android.media.tv.interactive.WebServiceClientInfo> p0) throws android.os.RemoteException;
    public void onSessionCreated(android.media.tv.interactive.ITvInteractiveAppSession p0) throws android.os.RemoteException;
    public void onSessionStateChanged(int p0, int p1) throws android.os.RemoteException;
    public void onSetParentalControlPin(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void onSetTvRecordingInfo(java.lang.String p0, android.media.tv.TvRecordingInfo p1) throws android.os.RemoteException;
    public void onSetVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException;
    public void onSetVideoBoundsSourceDisplay(android.graphics.Rect p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public void onStreamingPlaybackStatusChanged(int p0) throws android.os.RemoteException;
    public void onTeletextAppStateChanged(int p0) throws android.os.RemoteException;
    public void onTimeShiftCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.media.tv.interactive.ITvInteractiveAppSessionCallback {
        static final int TRANSACTION_onAdBufferReady = 9;
        static final int TRANSACTION_onAdRequest = 34;
        static final int TRANSACTION_onBiInteractiveAppCreated = 7;
        static final int TRANSACTION_onBroadcastInfoRequest = 3;
        static final int TRANSACTION_onCancelParentalControlApproval = 42;
        static final int TRANSACTION_onCommandRequest = 10;
        static final int TRANSACTION_onInteractiveAppInfoChanged = 6;
        static final int TRANSACTION_onInteractiveAppStreamingTrackSelected = 37;
        static final int TRANSACTION_onInteractiveAppStreamingTracksChanged = 36;
        static final int TRANSACTION_onKeySetChanged = 39;
        static final int TRANSACTION_onLayoutSurface = 2;
        static final int TRANSACTION_onOperatorAppStateChanged = 49;
        static final int TRANSACTION_onOperatorAppStatusChanged = 48;
        static final int TRANSACTION_onOperatorAppSupportedStatus = 46;
        static final int TRANSACTION_onOperatorAppUpdateRequest = 47;
        static final int TRANSACTION_onRemoveBroadcastInfo = 4;
        static final int TRANSACTION_onReplaceUiElements = 40;
        static final int TRANSACTION_onRequestAvailableSpeeds = 22;
        static final int TRANSACTION_onRequestCertificate = 33;
        static final int TRANSACTION_onRequestCurrentChannelLcn = 17;
        static final int TRANSACTION_onRequestCurrentChannelUri = 16;
        static final int TRANSACTION_onRequestCurrentTvInputId = 20;
        static final int TRANSACTION_onRequestCurrentVideoBounds = 14;
        static final int TRANSACTION_onRequestCurrentVideoBoundsWithTarget = 15;
        static final int TRANSACTION_onRequestParentalControlApproval = 41;
        static final int TRANSACTION_onRequestParentalControlPinLength = 44;
        static final int TRANSACTION_onRequestScheduleRecording = 26;
        static final int TRANSACTION_onRequestScheduleRecording2 = 27;
        static final int TRANSACTION_onRequestSelectedTrackInfo = 23;
        static final int TRANSACTION_onRequestSigning = 31;
        static final int TRANSACTION_onRequestSigning2 = 32;
        static final int TRANSACTION_onRequestStartRecording = 24;
        static final int TRANSACTION_onRequestStopRecording = 25;
        static final int TRANSACTION_onRequestStreamVolume = 18;
        static final int TRANSACTION_onRequestTimeShiftMode = 21;
        static final int TRANSACTION_onRequestTrackInfoList = 19;
        static final int TRANSACTION_onRequestTvRecordingInfo = 29;
        static final int TRANSACTION_onRequestTvRecordingInfoList = 30;
        static final int TRANSACTION_onRequestVerifyParentalControlPin = 43;
        static final int TRANSACTION_onSendWebServiceClientList = 35;
        static final int TRANSACTION_onSessionCreated = 1;
        static final int TRANSACTION_onSessionStateChanged = 5;
        static final int TRANSACTION_onSetParentalControlPin = 45;
        static final int TRANSACTION_onSetTvRecordingInfo = 28;
        static final int TRANSACTION_onSetVideoBounds = 12;
        static final int TRANSACTION_onSetVideoBoundsSourceDisplay = 13;
        static final int TRANSACTION_onStreamingPlaybackStatusChanged = 38;
        static final int TRANSACTION_onTeletextAppStateChanged = 8;
        static final int TRANSACTION_onTimeShiftCommandRequest = 11;
        public Stub() { super(); }
        public static android.media.tv.interactive.ITvInteractiveAppSessionCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.interactive.ITvInteractiveAppSessionCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onAdBufferReady(android.media.tv.AdBuffer p0) throws android.os.RemoteException {}
            public void onAdRequest(android.media.tv.AdRequest p0) throws android.os.RemoteException {}
            public void onBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onBroadcastInfoRequest(android.media.tv.BroadcastInfoRequest p0) throws android.os.RemoteException {}
            public void onCancelParentalControlApproval() throws android.os.RemoteException {}
            public void onCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void onInteractiveAppInfoChanged(android.media.tv.interactive.TvInteractiveAppInfo p0) throws android.os.RemoteException {}
            public void onInteractiveAppStreamingTrackSelected(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onInteractiveAppStreamingTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
            public void onKeySetChanged(int p0, int[] p1) throws android.os.RemoteException {}
            public void onLayoutSurface(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onOperatorAppStateChanged(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1) throws android.os.RemoteException {}
            public void onOperatorAppStatusChanged(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void onOperatorAppSupportedStatus(boolean p0) throws android.os.RemoteException {}
            public void onOperatorAppUpdateRequest(android.media.tv.interactive.OperatorAppServiceInfo p0, boolean p1) throws android.os.RemoteException {}
            public void onRemoveBroadcastInfo(int p0) throws android.os.RemoteException {}
            public void onReplaceUiElements(int[] p0) throws android.os.RemoteException {}
            public void onRequestAvailableSpeeds() throws android.os.RemoteException {}
            public void onRequestCertificate(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onRequestCurrentChannelLcn() throws android.os.RemoteException {}
            public void onRequestCurrentChannelUri() throws android.os.RemoteException {}
            public void onRequestCurrentTvInputId() throws android.os.RemoteException {}
            public void onRequestCurrentVideoBounds() throws android.os.RemoteException {}
            public void onRequestCurrentVideoBoundsWithTarget(int p0) throws android.os.RemoteException {}
            public void onRequestParentalControlApproval(int p0, boolean p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void onRequestParentalControlPinLength() throws android.os.RemoteException {}
            public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.net.Uri p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void onRequestScheduleRecording2(java.lang.String p0, java.lang.String p1, android.net.Uri p2, long p3, long p4, int p5, android.os.Bundle p6) throws android.os.RemoteException {}
            public void onRequestSelectedTrackInfo() throws android.os.RemoteException {}
            public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) throws android.os.RemoteException {}
            public void onRequestSigning2(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, byte[] p4) throws android.os.RemoteException {}
            public void onRequestStartRecording(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException {}
            public void onRequestStopRecording(java.lang.String p0) throws android.os.RemoteException {}
            public void onRequestStreamVolume() throws android.os.RemoteException {}
            public void onRequestTimeShiftMode() throws android.os.RemoteException {}
            public void onRequestTrackInfoList() throws android.os.RemoteException {}
            public void onRequestTvRecordingInfo(java.lang.String p0) throws android.os.RemoteException {}
            public void onRequestTvRecordingInfoList(int p0) throws android.os.RemoteException {}
            public void onRequestVerifyParentalControlPin(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onSendWebServiceClientList(java.util.List<android.media.tv.interactive.WebServiceClientInfo> p0) throws android.os.RemoteException {}
            public void onSessionCreated(android.media.tv.interactive.ITvInteractiveAppSession p0) throws android.os.RemoteException {}
            public void onSessionStateChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onSetParentalControlPin(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onSetTvRecordingInfo(java.lang.String p0, android.media.tv.TvRecordingInfo p1) throws android.os.RemoteException {}
            public void onSetVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void onSetVideoBoundsSourceDisplay(android.graphics.Rect p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void onStreamingPlaybackStatusChanged(int p0) throws android.os.RemoteException {}
            public void onTeletextAppStateChanged(int p0) throws android.os.RemoteException {}
            public void onTimeShiftCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.media.tv.interactive.ITvInteractiveAppSessionCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onAdBufferReady(android.media.tv.AdBuffer p0) throws android.os.RemoteException {}
        public void onAdRequest(android.media.tv.AdRequest p0) throws android.os.RemoteException {}
        public void onBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onBroadcastInfoRequest(android.media.tv.BroadcastInfoRequest p0) throws android.os.RemoteException {}
        public void onCancelParentalControlApproval() throws android.os.RemoteException {}
        public void onCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void onInteractiveAppInfoChanged(android.media.tv.interactive.TvInteractiveAppInfo p0) throws android.os.RemoteException {}
        public void onInteractiveAppStreamingTrackSelected(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onInteractiveAppStreamingTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
        public void onKeySetChanged(int p0, int[] p1) throws android.os.RemoteException {}
        public void onLayoutSurface(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onOperatorAppStateChanged(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1) throws android.os.RemoteException {}
        public void onOperatorAppStatusChanged(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void onOperatorAppSupportedStatus(boolean p0) throws android.os.RemoteException {}
        public void onOperatorAppUpdateRequest(android.media.tv.interactive.OperatorAppServiceInfo p0, boolean p1) throws android.os.RemoteException {}
        public void onRemoveBroadcastInfo(int p0) throws android.os.RemoteException {}
        public void onReplaceUiElements(int[] p0) throws android.os.RemoteException {}
        public void onRequestAvailableSpeeds() throws android.os.RemoteException {}
        public void onRequestCertificate(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onRequestCurrentChannelLcn() throws android.os.RemoteException {}
        public void onRequestCurrentChannelUri() throws android.os.RemoteException {}
        public void onRequestCurrentTvInputId() throws android.os.RemoteException {}
        public void onRequestCurrentVideoBounds() throws android.os.RemoteException {}
        public void onRequestCurrentVideoBoundsWithTarget(int p0) throws android.os.RemoteException {}
        public void onRequestParentalControlApproval(int p0, boolean p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void onRequestParentalControlPinLength() throws android.os.RemoteException {}
        public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.net.Uri p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void onRequestScheduleRecording2(java.lang.String p0, java.lang.String p1, android.net.Uri p2, long p3, long p4, int p5, android.os.Bundle p6) throws android.os.RemoteException {}
        public void onRequestSelectedTrackInfo() throws android.os.RemoteException {}
        public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) throws android.os.RemoteException {}
        public void onRequestSigning2(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, byte[] p4) throws android.os.RemoteException {}
        public void onRequestStartRecording(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException {}
        public void onRequestStopRecording(java.lang.String p0) throws android.os.RemoteException {}
        public void onRequestStreamVolume() throws android.os.RemoteException {}
        public void onRequestTimeShiftMode() throws android.os.RemoteException {}
        public void onRequestTrackInfoList() throws android.os.RemoteException {}
        public void onRequestTvRecordingInfo(java.lang.String p0) throws android.os.RemoteException {}
        public void onRequestTvRecordingInfoList(int p0) throws android.os.RemoteException {}
        public void onRequestVerifyParentalControlPin(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onSendWebServiceClientList(java.util.List<android.media.tv.interactive.WebServiceClientInfo> p0) throws android.os.RemoteException {}
        public void onSessionCreated(android.media.tv.interactive.ITvInteractiveAppSession p0) throws android.os.RemoteException {}
        public void onSessionStateChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onSetParentalControlPin(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onSetTvRecordingInfo(java.lang.String p0, android.media.tv.TvRecordingInfo p1) throws android.os.RemoteException {}
        public void onSetVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void onSetVideoBoundsSourceDisplay(android.graphics.Rect p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void onStreamingPlaybackStatusChanged(int p0) throws android.os.RemoteException {}
        public void onTeletextAppStateChanged(int p0) throws android.os.RemoteException {}
        public void onTimeShiftCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
    }
}
