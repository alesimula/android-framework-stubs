package android.service.carrier;

public abstract class CarrierMessagingService extends android.app.Service {
    public static final int DOWNLOAD_STATUS_ERROR = 2;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_CONFIGURATION_ERROR = 606;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_DATA_DISABLED = 610;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_HTTP_FAILURE = 603;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_INACTIVE_SUBSCRIPTION = 609;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_INVALID_APN = 601;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_INVALID_SUBSCRIPTION_ID = 608;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_IO_ERROR = 604;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_MMS_DISABLED_BY_CARRIER = 611;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_NO_DATA_NETWORK = 607;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_RETRY = 605;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_UNABLE_CONNECT_MMS = 602;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_UNSPECIFIED = 600;
    public static final int DOWNLOAD_STATUS_OK = 0;
    public static final int DOWNLOAD_STATUS_RETRY_ON_CARRIER_NETWORK = 1;
    public static final int RECEIVE_OPTIONS_DEFAULT = 0;
    public static final int RECEIVE_OPTIONS_DROP = 1;
    public static final int RECEIVE_OPTIONS_SKIP_NOTIFY_WHEN_CREDENTIAL_PROTECTED_STORAGE_UNAVAILABLE = 2;
    public static final int SEND_FLAG_REQUEST_DELIVERY_STATUS = 1;
    public static final int SEND_STATUS_ERROR = 2;
    public static final int SEND_STATUS_MMS_ERROR_CONFIGURATION_ERROR = 406;
    public static final int SEND_STATUS_MMS_ERROR_DATA_DISABLED = 410;
    public static final int SEND_STATUS_MMS_ERROR_HTTP_FAILURE = 403;
    public static final int SEND_STATUS_MMS_ERROR_INACTIVE_SUBSCRIPTION = 409;
    public static final int SEND_STATUS_MMS_ERROR_INVALID_APN = 401;
    public static final int SEND_STATUS_MMS_ERROR_INVALID_SUBSCRIPTION_ID = 408;
    public static final int SEND_STATUS_MMS_ERROR_IO_ERROR = 404;
    public static final int SEND_STATUS_MMS_ERROR_MMS_DISABLED_BY_CARRIER = 411;
    public static final int SEND_STATUS_MMS_ERROR_NO_DATA_NETWORK = 407;
    public static final int SEND_STATUS_MMS_ERROR_RETRY = 405;
    public static final int SEND_STATUS_MMS_ERROR_UNABLE_CONNECT_MMS = 402;
    public static final int SEND_STATUS_MMS_ERROR_UNSPECIFIED = 400;
    public static final int SEND_STATUS_OK = 0;
    public static final int SEND_STATUS_RESULT_CANCELLED = 215;
    public static final int SEND_STATUS_RESULT_ENCODING_ERROR = 212;
    public static final int SEND_STATUS_RESULT_ERROR_FDN_CHECK_FAILURE = 204;
    public static final int SEND_STATUS_RESULT_ERROR_GENERIC_FAILURE = 200;
    public static final int SEND_STATUS_RESULT_ERROR_LIMIT_EXCEEDED = 203;
    public static final int SEND_STATUS_RESULT_ERROR_NO_SERVICE = 202;
    public static final int SEND_STATUS_RESULT_ERROR_NULL_PDU = 201;
    public static final int SEND_STATUS_RESULT_ERROR_SHORT_CODE_NEVER_ALLOWED = 206;
    public static final int SEND_STATUS_RESULT_ERROR_SHORT_CODE_NOT_ALLOWED = 205;
    public static final int SEND_STATUS_RESULT_INVALID_ARGUMENTS = 208;
    public static final int SEND_STATUS_RESULT_INVALID_SMSC_ADDRESS = 213;
    public static final int SEND_STATUS_RESULT_INVALID_SMS_FORMAT = 210;
    public static final int SEND_STATUS_RESULT_INVALID_STATE = 209;
    public static final int SEND_STATUS_RESULT_NETWORK_ERROR = 211;
    public static final int SEND_STATUS_RESULT_NETWORK_REJECT = 207;
    public static final int SEND_STATUS_RESULT_OPERATION_NOT_ALLOWED = 214;
    public static final int SEND_STATUS_RESULT_REQUEST_NOT_SUPPORTED = 216;
    public static final int SEND_STATUS_RESULT_SMS_BLOCKED_DURING_EMERGENCY = 217;
    public static final int SEND_STATUS_RESULT_SMS_SEND_RETRY_FAILED = 218;
    public static final int SEND_STATUS_RETRY_ON_CARRIER_NETWORK = 1;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.carrier.CarrierMessagingService";
    private final android.service.carrier.CarrierMessagingService.ICarrierMessagingWrapper mWrapper = null;
    public CarrierMessagingService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onDownloadMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.CarrierMessagingService.ResultCallback<java.lang.Integer> p3) {}
    @java.lang.Deprecated
    public void onFilterSms(android.service.carrier.MessagePdu p0, java.lang.String p1, int p2, int p3, android.service.carrier.CarrierMessagingService.ResultCallback<java.lang.Boolean> p4) {}
    public void onReceiveTextSms(android.service.carrier.MessagePdu p0, java.lang.String p1, int p2, int p3, android.service.carrier.CarrierMessagingService.ResultCallback<java.lang.Integer> p4) {}
    public void onSendDataSms(byte[] p0, int p1, java.lang.String p2, int p3, int p4, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendSmsResult> p5) {}
    @java.lang.Deprecated
    public void onSendDataSms(byte[] p0, int p1, java.lang.String p2, int p3, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendSmsResult> p4) {}
    public void onSendMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendMmsResult> p3) {}
    public void onSendMultipartTextSms(java.util.List<java.lang.String> p0, int p1, java.lang.String p2, int p3, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendMultipartSmsResult> p4) {}
    @java.lang.Deprecated
    public void onSendMultipartTextSms(java.util.List<java.lang.String> p0, int p1, java.lang.String p2, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendMultipartSmsResult> p3) {}
    public void onSendTextSms(java.lang.String p0, int p1, java.lang.String p2, int p3, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendSmsResult> p4) {}
    @java.lang.Deprecated
    public void onSendTextSms(java.lang.String p0, int p1, java.lang.String p2, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendSmsResult> p3) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DownloadResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FilterCompleteResult {
    }

    private class ICarrierMessagingWrapper extends android.service.carrier.ICarrierMessagingService.Stub {
        private ICarrierMessagingWrapper(android.service.carrier.CarrierMessagingService p0) { super(); }
        public void downloadMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.ICarrierMessagingCallback p3) {}
        public void filterSms(android.service.carrier.MessagePdu p0, java.lang.String p1, int p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) {}
        public void sendDataSms(byte[] p0, int p1, java.lang.String p2, int p3, int p4, android.service.carrier.ICarrierMessagingCallback p5) {}
        public void sendMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.ICarrierMessagingCallback p3) {}
        public void sendMultipartTextSms(java.util.List<java.lang.String> p0, int p1, java.lang.String p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) {}
        public void sendTextSms(java.lang.String p0, int p1, java.lang.String p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) {}
    }

    public static interface ResultCallback<T extends java.lang.Object> {
        public void onReceiveResult(T p0) throws android.os.RemoteException;
    }

    public static final class SendMmsResult {
        private byte[] mSendConfPdu;
        private int mSendStatus;
        public SendMmsResult(int p0, byte[] p1) {}
        public byte[] getSendConfPdu() { return null; }
        public int getSendStatus() { return 0; }
    }

    public static final class SendMultipartSmsResult {
        private final int[] mMessageRefs = null;
        private final int mSendStatus = 0;
        public SendMultipartSmsResult(int p0, int[] p1) {}
        public int[] getMessageRefs() { return null; }
        public int getSendStatus() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SendRequest {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SendResult {
    }

    public static final class SendSmsResult {
        private final int mMessageRef = 0;
        private final int mSendStatus = 0;
        public SendSmsResult(int p0, int p1) {}
        public int getMessageRef() { return 0; }
        public int getSendStatus() { return 0; }
    }
}
