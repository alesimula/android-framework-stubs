package android.media.tv.interactive;

public interface ITvInteractiveAppClient extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.interactive.ITvInteractiveAppClient";
    public void onAdBufferReady(android.media.tv.AdBuffer p0, int p1) throws android.os.RemoteException;
    public void onAdRequest(android.media.tv.AdRequest p0, int p1) throws android.os.RemoteException;
    public void onBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void onBroadcastInfoRequest(android.media.tv.BroadcastInfoRequest p0, int p1) throws android.os.RemoteException;
    public void onCancelParentalControlApproval(int p0) throws android.os.RemoteException;
    public void onCommandRequest(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public void onInteractiveAppInfoChanged(android.media.tv.interactive.TvInteractiveAppInfo p0, int p1) throws android.os.RemoteException;
    public void onInteractiveAppStreamingTrackSelected(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void onInteractiveAppStreamingTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0, int p1) throws android.os.RemoteException;
    public void onKeySetChanged(int p0, int[] p1, int p2) throws android.os.RemoteException;
    public void onLayoutSurface(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void onOperatorAppStateChanged(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, int p2) throws android.os.RemoteException;
    public void onOperatorAppStatusChanged(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;
    public void onOperatorAppSupportedStatus(boolean p0, int p1) throws android.os.RemoteException;
    public void onOperatorAppUpdateRequest(android.media.tv.interactive.OperatorAppServiceInfo p0, boolean p1, int p2) throws android.os.RemoteException;
    public void onRemoveBroadcastInfo(int p0, int p1) throws android.os.RemoteException;
    public void onReplaceUiElements(int[] p0, int p1) throws android.os.RemoteException;
    public void onRequestAvailableSpeeds(int p0) throws android.os.RemoteException;
    public void onRequestCertificate(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onRequestCurrentChannelLcn(int p0) throws android.os.RemoteException;
    public void onRequestCurrentChannelUri(int p0) throws android.os.RemoteException;
    public void onRequestCurrentTvInputId(int p0) throws android.os.RemoteException;
    public void onRequestCurrentVideoBounds(int p0) throws android.os.RemoteException;
    public void onRequestParentalControlApproval(int p0, boolean p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;
    public void onRequestParentalControlPinLength(int p0) throws android.os.RemoteException;
    public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.net.Uri p3, android.os.Bundle p4, int p5) throws android.os.RemoteException;
    public void onRequestScheduleRecording2(java.lang.String p0, java.lang.String p1, android.net.Uri p2, long p3, long p4, int p5, android.os.Bundle p6, int p7) throws android.os.RemoteException;
    public void onRequestSelectedTrackInfo(int p0) throws android.os.RemoteException;
    public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException;
    public void onRequestSigning2(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, byte[] p4, int p5) throws android.os.RemoteException;
    public void onRequestStartRecording(java.lang.String p0, android.net.Uri p1, int p2) throws android.os.RemoteException;
    public void onRequestStopRecording(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onRequestStreamVolume(int p0) throws android.os.RemoteException;
    public void onRequestTimeShiftMode(int p0) throws android.os.RemoteException;
    public void onRequestTrackInfoList(int p0) throws android.os.RemoteException;
    public void onRequestTvRecordingInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onRequestTvRecordingInfoList(int p0, int p1) throws android.os.RemoteException;
    public void onRequestVerifyParentalControlPin(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void onSendWebServiceClientList(java.util.List<android.media.tv.interactive.WebServiceClientInfo> p0, int p1) throws android.os.RemoteException;
    public void onSessionCreated(java.lang.String p0, android.os.IBinder p1, android.view.InputChannel p2, int p3) throws android.os.RemoteException;
    public void onSessionReleased(int p0) throws android.os.RemoteException;
    public void onSessionStateChanged(int p0, int p1, int p2) throws android.os.RemoteException;
    public void onSetParentalControlPin(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void onSetTvRecordingInfo(java.lang.String p0, android.media.tv.TvRecordingInfo p1, int p2) throws android.os.RemoteException;
    public void onSetVideoBounds(android.graphics.Rect p0, int p1) throws android.os.RemoteException;
    public void onStreamingPlaybackStatusChanged(int p0, int p1) throws android.os.RemoteException;
    public void onTeletextAppStateChanged(int p0, int p1) throws android.os.RemoteException;
    public void onTimeShiftCommandRequest(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.media.tv.interactive.ITvInteractiveAppClient {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onAdBufferReady(android.media.tv.AdBuffer p0, int p1) throws android.os.RemoteException {}
        public void onAdRequest(android.media.tv.AdRequest p0, int p1) throws android.os.RemoteException {}
        public void onBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void onBroadcastInfoRequest(android.media.tv.BroadcastInfoRequest p0, int p1) throws android.os.RemoteException {}
        public void onCancelParentalControlApproval(int p0) throws android.os.RemoteException {}
        public void onCommandRequest(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public void onInteractiveAppInfoChanged(android.media.tv.interactive.TvInteractiveAppInfo p0, int p1) throws android.os.RemoteException {}
        public void onInteractiveAppStreamingTrackSelected(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void onInteractiveAppStreamingTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0, int p1) throws android.os.RemoteException {}
        public void onKeySetChanged(int p0, int[] p1, int p2) throws android.os.RemoteException {}
        public void onLayoutSurface(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void onOperatorAppStateChanged(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, int p2) throws android.os.RemoteException {}
        public void onOperatorAppStatusChanged(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public void onOperatorAppSupportedStatus(boolean p0, int p1) throws android.os.RemoteException {}
        public void onOperatorAppUpdateRequest(android.media.tv.interactive.OperatorAppServiceInfo p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void onRemoveBroadcastInfo(int p0, int p1) throws android.os.RemoteException {}
        public void onReplaceUiElements(int[] p0, int p1) throws android.os.RemoteException {}
        public void onRequestAvailableSpeeds(int p0) throws android.os.RemoteException {}
        public void onRequestCertificate(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onRequestCurrentChannelLcn(int p0) throws android.os.RemoteException {}
        public void onRequestCurrentChannelUri(int p0) throws android.os.RemoteException {}
        public void onRequestCurrentTvInputId(int p0) throws android.os.RemoteException {}
        public void onRequestCurrentVideoBounds(int p0) throws android.os.RemoteException {}
        public void onRequestParentalControlApproval(int p0, boolean p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public void onRequestParentalControlPinLength(int p0) throws android.os.RemoteException {}
        public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.net.Uri p3, android.os.Bundle p4, int p5) throws android.os.RemoteException {}
        public void onRequestScheduleRecording2(java.lang.String p0, java.lang.String p1, android.net.Uri p2, long p3, long p4, int p5, android.os.Bundle p6, int p7) throws android.os.RemoteException {}
        public void onRequestSelectedTrackInfo(int p0) throws android.os.RemoteException {}
        public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException {}
        public void onRequestSigning2(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, byte[] p4, int p5) throws android.os.RemoteException {}
        public void onRequestStartRecording(java.lang.String p0, android.net.Uri p1, int p2) throws android.os.RemoteException {}
        public void onRequestStopRecording(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onRequestStreamVolume(int p0) throws android.os.RemoteException {}
        public void onRequestTimeShiftMode(int p0) throws android.os.RemoteException {}
        public void onRequestTrackInfoList(int p0) throws android.os.RemoteException {}
        public void onRequestTvRecordingInfo(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onRequestTvRecordingInfoList(int p0, int p1) throws android.os.RemoteException {}
        public void onRequestVerifyParentalControlPin(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void onSendWebServiceClientList(java.util.List<android.media.tv.interactive.WebServiceClientInfo> p0, int p1) throws android.os.RemoteException {}
        public void onSessionCreated(java.lang.String p0, android.os.IBinder p1, android.view.InputChannel p2, int p3) throws android.os.RemoteException {}
        public void onSessionReleased(int p0) throws android.os.RemoteException {}
        public void onSessionStateChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onSetParentalControlPin(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void onSetTvRecordingInfo(java.lang.String p0, android.media.tv.TvRecordingInfo p1, int p2) throws android.os.RemoteException {}
        public void onSetVideoBounds(android.graphics.Rect p0, int p1) throws android.os.RemoteException {}
        public void onStreamingPlaybackStatusChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onTeletextAppStateChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onTimeShiftCommandRequest(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.interactive.ITvInteractiveAppClient {
        static final int TRANSACTION_onAdBufferReady = 10;
        static final int TRANSACTION_onAdRequest = 33;
        static final int TRANSACTION_onBiInteractiveAppCreated = 8;
        static final int TRANSACTION_onBroadcastInfoRequest = 4;
        static final int TRANSACTION_onCancelParentalControlApproval = 41;
        static final int TRANSACTION_onCommandRequest = 11;
        static final int TRANSACTION_onInteractiveAppInfoChanged = 7;
        static final int TRANSACTION_onInteractiveAppStreamingTrackSelected = 36;
        static final int TRANSACTION_onInteractiveAppStreamingTracksChanged = 35;
        static final int TRANSACTION_onKeySetChanged = 38;
        static final int TRANSACTION_onLayoutSurface = 3;
        static final int TRANSACTION_onOperatorAppStateChanged = 48;
        static final int TRANSACTION_onOperatorAppStatusChanged = 47;
        static final int TRANSACTION_onOperatorAppSupportedStatus = 45;
        static final int TRANSACTION_onOperatorAppUpdateRequest = 46;
        static final int TRANSACTION_onRemoveBroadcastInfo = 5;
        static final int TRANSACTION_onReplaceUiElements = 39;
        static final int TRANSACTION_onRequestAvailableSpeeds = 22;
        static final int TRANSACTION_onRequestCertificate = 32;
        static final int TRANSACTION_onRequestCurrentChannelLcn = 16;
        static final int TRANSACTION_onRequestCurrentChannelUri = 15;
        static final int TRANSACTION_onRequestCurrentTvInputId = 20;
        static final int TRANSACTION_onRequestCurrentVideoBounds = 14;
        static final int TRANSACTION_onRequestParentalControlApproval = 40;
        static final int TRANSACTION_onRequestParentalControlPinLength = 43;
        static final int TRANSACTION_onRequestScheduleRecording = 25;
        static final int TRANSACTION_onRequestScheduleRecording2 = 26;
        static final int TRANSACTION_onRequestSelectedTrackInfo = 19;
        static final int TRANSACTION_onRequestSigning = 30;
        static final int TRANSACTION_onRequestSigning2 = 31;
        static final int TRANSACTION_onRequestStartRecording = 23;
        static final int TRANSACTION_onRequestStopRecording = 24;
        static final int TRANSACTION_onRequestStreamVolume = 17;
        static final int TRANSACTION_onRequestTimeShiftMode = 21;
        static final int TRANSACTION_onRequestTrackInfoList = 18;
        static final int TRANSACTION_onRequestTvRecordingInfo = 28;
        static final int TRANSACTION_onRequestTvRecordingInfoList = 29;
        static final int TRANSACTION_onRequestVerifyParentalControlPin = 42;
        static final int TRANSACTION_onSendWebServiceClientList = 34;
        static final int TRANSACTION_onSessionCreated = 1;
        static final int TRANSACTION_onSessionReleased = 2;
        static final int TRANSACTION_onSessionStateChanged = 6;
        static final int TRANSACTION_onSetParentalControlPin = 44;
        static final int TRANSACTION_onSetTvRecordingInfo = 27;
        static final int TRANSACTION_onSetVideoBounds = 13;
        static final int TRANSACTION_onStreamingPlaybackStatusChanged = 37;
        static final int TRANSACTION_onTeletextAppStateChanged = 9;
        static final int TRANSACTION_onTimeShiftCommandRequest = 12;
        public Stub() { super(); }
        public static android.media.tv.interactive.ITvInteractiveAppClient asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.interactive.ITvInteractiveAppClient {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onAdBufferReady(android.media.tv.AdBuffer p0, int p1) throws android.os.RemoteException {}
            public void onAdRequest(android.media.tv.AdRequest p0, int p1) throws android.os.RemoteException {}
            public void onBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void onBroadcastInfoRequest(android.media.tv.BroadcastInfoRequest p0, int p1) throws android.os.RemoteException {}
            public void onCancelParentalControlApproval(int p0) throws android.os.RemoteException {}
            public void onCommandRequest(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
            public void onInteractiveAppInfoChanged(android.media.tv.interactive.TvInteractiveAppInfo p0, int p1) throws android.os.RemoteException {}
            public void onInteractiveAppStreamingTrackSelected(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void onInteractiveAppStreamingTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0, int p1) throws android.os.RemoteException {}
            public void onKeySetChanged(int p0, int[] p1, int p2) throws android.os.RemoteException {}
            public void onLayoutSurface(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void onOperatorAppStateChanged(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, int p2) throws android.os.RemoteException {}
            public void onOperatorAppStatusChanged(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
            public void onOperatorAppSupportedStatus(boolean p0, int p1) throws android.os.RemoteException {}
            public void onOperatorAppUpdateRequest(android.media.tv.interactive.OperatorAppServiceInfo p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void onRemoveBroadcastInfo(int p0, int p1) throws android.os.RemoteException {}
            public void onReplaceUiElements(int[] p0, int p1) throws android.os.RemoteException {}
            public void onRequestAvailableSpeeds(int p0) throws android.os.RemoteException {}
            public void onRequestCertificate(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onRequestCurrentChannelLcn(int p0) throws android.os.RemoteException {}
            public void onRequestCurrentChannelUri(int p0) throws android.os.RemoteException {}
            public void onRequestCurrentTvInputId(int p0) throws android.os.RemoteException {}
            public void onRequestCurrentVideoBounds(int p0) throws android.os.RemoteException {}
            public void onRequestParentalControlApproval(int p0, boolean p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
            public void onRequestParentalControlPinLength(int p0) throws android.os.RemoteException {}
            public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.net.Uri p3, android.os.Bundle p4, int p5) throws android.os.RemoteException {}
            public void onRequestScheduleRecording2(java.lang.String p0, java.lang.String p1, android.net.Uri p2, long p3, long p4, int p5, android.os.Bundle p6, int p7) throws android.os.RemoteException {}
            public void onRequestSelectedTrackInfo(int p0) throws android.os.RemoteException {}
            public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException {}
            public void onRequestSigning2(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, byte[] p4, int p5) throws android.os.RemoteException {}
            public void onRequestStartRecording(java.lang.String p0, android.net.Uri p1, int p2) throws android.os.RemoteException {}
            public void onRequestStopRecording(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onRequestStreamVolume(int p0) throws android.os.RemoteException {}
            public void onRequestTimeShiftMode(int p0) throws android.os.RemoteException {}
            public void onRequestTrackInfoList(int p0) throws android.os.RemoteException {}
            public void onRequestTvRecordingInfo(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onRequestTvRecordingInfoList(int p0, int p1) throws android.os.RemoteException {}
            public void onRequestVerifyParentalControlPin(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void onSendWebServiceClientList(java.util.List<android.media.tv.interactive.WebServiceClientInfo> p0, int p1) throws android.os.RemoteException {}
            public void onSessionCreated(java.lang.String p0, android.os.IBinder p1, android.view.InputChannel p2, int p3) throws android.os.RemoteException {}
            public void onSessionReleased(int p0) throws android.os.RemoteException {}
            public void onSessionStateChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void onSetParentalControlPin(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void onSetTvRecordingInfo(java.lang.String p0, android.media.tv.TvRecordingInfo p1, int p2) throws android.os.RemoteException {}
            public void onSetVideoBounds(android.graphics.Rect p0, int p1) throws android.os.RemoteException {}
            public void onStreamingPlaybackStatusChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onTeletextAppStateChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onTimeShiftCommandRequest(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        }
    }
}
