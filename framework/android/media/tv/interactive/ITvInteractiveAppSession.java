package android.media.tv.interactive;

public interface ITvInteractiveAppSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.interactive.ITvInteractiveAppSession";
    public void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public void destroyBiInteractiveApp(java.lang.String p0) throws android.os.RemoteException;
    public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException;
    public void notifyAdBufferConsumed(android.media.tv.AdBuffer p0) throws android.os.RemoteException;
    public void notifyAdResponse(android.media.tv.AdResponse p0) throws android.os.RemoteException;
    public void notifyBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) throws android.os.RemoteException;
    public void notifyContentAllowed() throws android.os.RemoteException;
    public void notifyContentBlocked(java.lang.String p0) throws android.os.RemoteException;
    public void notifyError(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void notifyInteractiveAppFocusChanged(boolean p0) throws android.os.RemoteException;
    public void notifyRecordingConnectionFailed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void notifyRecordingDisconnected(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void notifyRecordingError(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void notifyRecordingScheduled(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void notifyRecordingStarted(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void notifyRecordingStopped(java.lang.String p0) throws android.os.RemoteException;
    public void notifyRecordingTuned(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException;
    public void notifySignalStrength(int p0) throws android.os.RemoteException;
    public void notifyTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) throws android.os.RemoteException;
    public void notifyTimeShiftPlaybackParams(android.media.PlaybackParams p0) throws android.os.RemoteException;
    public void notifyTimeShiftStartPositionChanged(java.lang.String p0, long p1) throws android.os.RemoteException;
    public void notifyTimeShiftStatusChanged(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void notifyTrackSelected(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException;
    public void notifyTuned(android.net.Uri p0) throws android.os.RemoteException;
    public void notifyTvMessage(int p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void notifyVideoAvailable() throws android.os.RemoteException;
    public void notifyVideoFreezeUpdated(boolean p0) throws android.os.RemoteException;
    public void notifyVideoUnavailable(int p0) throws android.os.RemoteException;
    public void relayoutMediaView(android.graphics.Rect p0) throws android.os.RemoteException;
    public void release() throws android.os.RemoteException;
    public void removeMediaView() throws android.os.RemoteException;
    public void removeWebServiceClient(int p0) throws android.os.RemoteException;
    public void requestOperatorAppSupportedStatus() throws android.os.RemoteException;
    public void requestWebServiceClients() throws android.os.RemoteException;
    public void resetInteractiveApp() throws android.os.RemoteException;
    public void selectInteractiveAppStreamingTrack(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void sendAvailableSpeeds(float[] p0) throws android.os.RemoteException;
    public void sendCertificate(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void sendCurrentChannelLcn(int p0) throws android.os.RemoteException;
    public void sendCurrentChannelUri(android.net.Uri p0) throws android.os.RemoteException;
    public void sendCurrentTvInputId(java.lang.String p0) throws android.os.RemoteException;
    public void sendCurrentVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException;
    public void sendParentalControlApprovalResult(int p0, boolean p1) throws android.os.RemoteException;
    public void sendParentalControlPinLength(int p0) throws android.os.RemoteException;
    public void sendSelectedTrackInfo(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException;
    public void sendSetParentalControlPinResult(int p0) throws android.os.RemoteException;
    public void sendSigningResult(java.lang.String p0, byte[] p1) throws android.os.RemoteException;
    public void sendStreamVolume(float p0) throws android.os.RemoteException;
    public void sendTimeShiftMode(int p0) throws android.os.RemoteException;
    public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException;
    public void sendTvRecordingInfo(android.media.tv.TvRecordingInfo p0) throws android.os.RemoteException;
    public void sendTvRecordingInfoList(java.util.List<android.media.tv.TvRecordingInfo> p0) throws android.os.RemoteException;
    public void sendVerifyParentalControlPinResult(int p0, int p1) throws android.os.RemoteException;
    public void setSurface(android.view.Surface p0) throws android.os.RemoteException;
    public void setTeletextAppEnabled(boolean p0) throws android.os.RemoteException;
    public void startInteractiveApp() throws android.os.RemoteException;
    public void startInteractiveAppWithHandle(int p0) throws android.os.RemoteException;
    public void startOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void stopInteractiveApp() throws android.os.RemoteException;
    public void stopInteractiveAppWithHandle(int p0) throws android.os.RemoteException;
    public void stopOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0) throws android.os.RemoteException;
    public void switchOperatorAppState(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1) throws android.os.RemoteException;
    public void updateWebServiceClientState(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.interactive.ITvInteractiveAppSession {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void destroyBiInteractiveApp(java.lang.String p0) throws android.os.RemoteException {}
        public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void notifyAdBufferConsumed(android.media.tv.AdBuffer p0) throws android.os.RemoteException {}
        public void notifyAdResponse(android.media.tv.AdResponse p0) throws android.os.RemoteException {}
        public void notifyBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) throws android.os.RemoteException {}
        public void notifyContentAllowed() throws android.os.RemoteException {}
        public void notifyContentBlocked(java.lang.String p0) throws android.os.RemoteException {}
        public void notifyError(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void notifyInteractiveAppFocusChanged(boolean p0) throws android.os.RemoteException {}
        public void notifyRecordingConnectionFailed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void notifyRecordingDisconnected(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void notifyRecordingError(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void notifyRecordingScheduled(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void notifyRecordingStarted(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void notifyRecordingStopped(java.lang.String p0) throws android.os.RemoteException {}
        public void notifyRecordingTuned(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException {}
        public void notifySignalStrength(int p0) throws android.os.RemoteException {}
        public void notifyTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public void notifyTimeShiftPlaybackParams(android.media.PlaybackParams p0) throws android.os.RemoteException {}
        public void notifyTimeShiftStartPositionChanged(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public void notifyTimeShiftStatusChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void notifyTrackSelected(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
        public void notifyTuned(android.net.Uri p0) throws android.os.RemoteException {}
        public void notifyTvMessage(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void notifyVideoAvailable() throws android.os.RemoteException {}
        public void notifyVideoFreezeUpdated(boolean p0) throws android.os.RemoteException {}
        public void notifyVideoUnavailable(int p0) throws android.os.RemoteException {}
        public void relayoutMediaView(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void release() throws android.os.RemoteException {}
        public void removeMediaView() throws android.os.RemoteException {}
        public void removeWebServiceClient(int p0) throws android.os.RemoteException {}
        public void requestOperatorAppSupportedStatus() throws android.os.RemoteException {}
        public void requestWebServiceClients() throws android.os.RemoteException {}
        public void resetInteractiveApp() throws android.os.RemoteException {}
        public void selectInteractiveAppStreamingTrack(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void sendAvailableSpeeds(float[] p0) throws android.os.RemoteException {}
        public void sendCertificate(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void sendCurrentChannelLcn(int p0) throws android.os.RemoteException {}
        public void sendCurrentChannelUri(android.net.Uri p0) throws android.os.RemoteException {}
        public void sendCurrentTvInputId(java.lang.String p0) throws android.os.RemoteException {}
        public void sendCurrentVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void sendParentalControlApprovalResult(int p0, boolean p1) throws android.os.RemoteException {}
        public void sendParentalControlPinLength(int p0) throws android.os.RemoteException {}
        public void sendSelectedTrackInfo(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
        public void sendSetParentalControlPinResult(int p0) throws android.os.RemoteException {}
        public void sendSigningResult(java.lang.String p0, byte[] p1) throws android.os.RemoteException {}
        public void sendStreamVolume(float p0) throws android.os.RemoteException {}
        public void sendTimeShiftMode(int p0) throws android.os.RemoteException {}
        public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
        public void sendTvRecordingInfo(android.media.tv.TvRecordingInfo p0) throws android.os.RemoteException {}
        public void sendTvRecordingInfoList(java.util.List<android.media.tv.TvRecordingInfo> p0) throws android.os.RemoteException {}
        public void sendVerifyParentalControlPinResult(int p0, int p1) throws android.os.RemoteException {}
        public void setSurface(android.view.Surface p0) throws android.os.RemoteException {}
        public void setTeletextAppEnabled(boolean p0) throws android.os.RemoteException {}
        public void startInteractiveApp() throws android.os.RemoteException {}
        public void startInteractiveAppWithHandle(int p0) throws android.os.RemoteException {}
        public void startOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void stopInteractiveApp() throws android.os.RemoteException {}
        public void stopInteractiveAppWithHandle(int p0) throws android.os.RemoteException {}
        public void stopOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0) throws android.os.RemoteException {}
        public void switchOperatorAppState(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1) throws android.os.RemoteException {}
        public void updateWebServiceClientState(int p0, int p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.interactive.ITvInteractiveAppSession {
        static final int TRANSACTION_createBiInteractiveApp = 6;
        static final int TRANSACTION_createMediaView = 55;
        static final int TRANSACTION_destroyBiInteractiveApp = 7;
        static final int TRANSACTION_dispatchSurfaceChanged = 46;
        static final int TRANSACTION_notifyAdBufferConsumed = 49;
        static final int TRANSACTION_notifyAdResponse = 48;
        static final int TRANSACTION_notifyBroadcastInfoResponse = 47;
        static final int TRANSACTION_notifyContentAllowed = 38;
        static final int TRANSACTION_notifyContentBlocked = 39;
        static final int TRANSACTION_notifyError = 21;
        static final int TRANSACTION_notifyInteractiveAppFocusChanged = 43;
        static final int TRANSACTION_notifyRecordingConnectionFailed = 26;
        static final int TRANSACTION_notifyRecordingDisconnected = 27;
        static final int TRANSACTION_notifyRecordingError = 29;
        static final int TRANSACTION_notifyRecordingScheduled = 30;
        static final int TRANSACTION_notifyRecordingStarted = 41;
        static final int TRANSACTION_notifyRecordingStopped = 42;
        static final int TRANSACTION_notifyRecordingTuned = 28;
        static final int TRANSACTION_notifySignalStrength = 40;
        static final int TRANSACTION_notifyTimeShiftCurrentPositionChanged = 25;
        static final int TRANSACTION_notifyTimeShiftPlaybackParams = 22;
        static final int TRANSACTION_notifyTimeShiftStartPositionChanged = 24;
        static final int TRANSACTION_notifyTimeShiftStatusChanged = 23;
        static final int TRANSACTION_notifyTrackSelected = 33;
        static final int TRANSACTION_notifyTracksChanged = 34;
        static final int TRANSACTION_notifyTuned = 32;
        static final int TRANSACTION_notifyTvMessage = 44;
        static final int TRANSACTION_notifyVideoAvailable = 35;
        static final int TRANSACTION_notifyVideoFreezeUpdated = 37;
        static final int TRANSACTION_notifyVideoUnavailable = 36;
        static final int TRANSACTION_relayoutMediaView = 56;
        static final int TRANSACTION_release = 31;
        static final int TRANSACTION_removeMediaView = 57;
        static final int TRANSACTION_removeWebServiceClient = 65;
        static final int TRANSACTION_requestOperatorAppSupportedStatus = 62;
        static final int TRANSACTION_requestWebServiceClients = 63;
        static final int TRANSACTION_resetInteractiveApp = 3;
        static final int TRANSACTION_selectInteractiveAppStreamingTrack = 58;
        static final int TRANSACTION_sendAvailableSpeeds = 16;
        static final int TRANSACTION_sendCertificate = 18;
        static final int TRANSACTION_sendCurrentChannelLcn = 11;
        static final int TRANSACTION_sendCurrentChannelUri = 10;
        static final int TRANSACTION_sendCurrentTvInputId = 14;
        static final int TRANSACTION_sendCurrentVideoBounds = 9;
        static final int TRANSACTION_sendParentalControlApprovalResult = 51;
        static final int TRANSACTION_sendParentalControlPinLength = 53;
        static final int TRANSACTION_sendSelectedTrackInfo = 50;
        static final int TRANSACTION_sendSetParentalControlPinResult = 54;
        static final int TRANSACTION_sendSigningResult = 17;
        static final int TRANSACTION_sendStreamVolume = 12;
        static final int TRANSACTION_sendTimeShiftMode = 15;
        static final int TRANSACTION_sendTrackInfoList = 13;
        static final int TRANSACTION_sendTvRecordingInfo = 19;
        static final int TRANSACTION_sendTvRecordingInfoList = 20;
        static final int TRANSACTION_sendVerifyParentalControlPinResult = 52;
        static final int TRANSACTION_setSurface = 45;
        static final int TRANSACTION_setTeletextAppEnabled = 8;
        static final int TRANSACTION_startInteractiveApp = 1;
        static final int TRANSACTION_startInteractiveAppWithHandle = 4;
        static final int TRANSACTION_startOperatorApp = 59;
        static final int TRANSACTION_stopInteractiveApp = 2;
        static final int TRANSACTION_stopInteractiveAppWithHandle = 5;
        static final int TRANSACTION_stopOperatorApp = 60;
        static final int TRANSACTION_switchOperatorAppState = 61;
        static final int TRANSACTION_updateWebServiceClientState = 64;
        public Stub() { super(); }
        public static android.media.tv.interactive.ITvInteractiveAppSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.interactive.ITvInteractiveAppSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void destroyBiInteractiveApp(java.lang.String p0) throws android.os.RemoteException {}
            public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyAdBufferConsumed(android.media.tv.AdBuffer p0) throws android.os.RemoteException {}
            public void notifyAdResponse(android.media.tv.AdResponse p0) throws android.os.RemoteException {}
            public void notifyBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) throws android.os.RemoteException {}
            public void notifyContentAllowed() throws android.os.RemoteException {}
            public void notifyContentBlocked(java.lang.String p0) throws android.os.RemoteException {}
            public void notifyError(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void notifyInteractiveAppFocusChanged(boolean p0) throws android.os.RemoteException {}
            public void notifyRecordingConnectionFailed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void notifyRecordingDisconnected(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void notifyRecordingError(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void notifyRecordingScheduled(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void notifyRecordingStarted(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void notifyRecordingStopped(java.lang.String p0) throws android.os.RemoteException {}
            public void notifyRecordingTuned(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException {}
            public void notifySignalStrength(int p0) throws android.os.RemoteException {}
            public void notifyTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) throws android.os.RemoteException {}
            public void notifyTimeShiftPlaybackParams(android.media.PlaybackParams p0) throws android.os.RemoteException {}
            public void notifyTimeShiftStartPositionChanged(java.lang.String p0, long p1) throws android.os.RemoteException {}
            public void notifyTimeShiftStatusChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void notifyTrackSelected(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
            public void notifyTuned(android.net.Uri p0) throws android.os.RemoteException {}
            public void notifyTvMessage(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void notifyVideoAvailable() throws android.os.RemoteException {}
            public void notifyVideoFreezeUpdated(boolean p0) throws android.os.RemoteException {}
            public void notifyVideoUnavailable(int p0) throws android.os.RemoteException {}
            public void relayoutMediaView(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void release() throws android.os.RemoteException {}
            public void removeMediaView() throws android.os.RemoteException {}
            public void removeWebServiceClient(int p0) throws android.os.RemoteException {}
            public void requestOperatorAppSupportedStatus() throws android.os.RemoteException {}
            public void requestWebServiceClients() throws android.os.RemoteException {}
            public void resetInteractiveApp() throws android.os.RemoteException {}
            public void selectInteractiveAppStreamingTrack(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void sendAvailableSpeeds(float[] p0) throws android.os.RemoteException {}
            public void sendCertificate(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void sendCurrentChannelLcn(int p0) throws android.os.RemoteException {}
            public void sendCurrentChannelUri(android.net.Uri p0) throws android.os.RemoteException {}
            public void sendCurrentTvInputId(java.lang.String p0) throws android.os.RemoteException {}
            public void sendCurrentVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void sendParentalControlApprovalResult(int p0, boolean p1) throws android.os.RemoteException {}
            public void sendParentalControlPinLength(int p0) throws android.os.RemoteException {}
            public void sendSelectedTrackInfo(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
            public void sendSetParentalControlPinResult(int p0) throws android.os.RemoteException {}
            public void sendSigningResult(java.lang.String p0, byte[] p1) throws android.os.RemoteException {}
            public void sendStreamVolume(float p0) throws android.os.RemoteException {}
            public void sendTimeShiftMode(int p0) throws android.os.RemoteException {}
            public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
            public void sendTvRecordingInfo(android.media.tv.TvRecordingInfo p0) throws android.os.RemoteException {}
            public void sendTvRecordingInfoList(java.util.List<android.media.tv.TvRecordingInfo> p0) throws android.os.RemoteException {}
            public void sendVerifyParentalControlPinResult(int p0, int p1) throws android.os.RemoteException {}
            public void setSurface(android.view.Surface p0) throws android.os.RemoteException {}
            public void setTeletextAppEnabled(boolean p0) throws android.os.RemoteException {}
            public void startInteractiveApp() throws android.os.RemoteException {}
            public void startInteractiveAppWithHandle(int p0) throws android.os.RemoteException {}
            public void startOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void stopInteractiveApp() throws android.os.RemoteException {}
            public void stopInteractiveAppWithHandle(int p0) throws android.os.RemoteException {}
            public void stopOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0) throws android.os.RemoteException {}
            public void switchOperatorAppState(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1) throws android.os.RemoteException {}
            public void updateWebServiceClientState(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
