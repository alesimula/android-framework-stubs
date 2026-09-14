package android.app.admin.dataleakprevention.reporting;

public final class DataLeakPreventionEventCodec {
    private static final int DESTINATION_TYPE_APP = 1;
    private static final int DESTINATION_TYPE_STORAGE = 2;
    private static final int ITEM_TYPE_FILE = 2;
    private static final int ITEM_TYPE_PLAIN_TEXT = 1;
    private static final java.lang.String KEY_APP = "app";
    private static final java.lang.String KEY_DATA = "data";
    private static final java.lang.String KEY_DATA_TRANSFER_PAYLOAD = "dt";
    private static final java.lang.String KEY_DESTINATION = "destination";
    private static final java.lang.String KEY_ENFORCEMENT = "enforcement";
    private static final java.lang.String KEY_EVENT = "event";
    private static final java.lang.String KEY_IS_REDACTED = "red";
    private static final java.lang.String KEY_IS_SENSITIVE = "sens";
    private static final java.lang.String KEY_ITEM_PREFIX = "item_";
    private static final java.lang.String KEY_MIME = "mime";
    private static final java.lang.String KEY_PACKAGE_NAME = "pkg";
    private static final java.lang.String KEY_PAYLOAD = "payload";
    private static final java.lang.String KEY_PRODUCT_ID = "pid";
    private static final java.lang.String KEY_RULE_ID = "ruleId";
    private static final java.lang.String KEY_SCREEN_CAPTURE_PAYLOAD = "sc";
    private static final java.lang.String KEY_SESSION_ID = "id";
    private static final java.lang.String KEY_SHA256_HASH = "sha256_hash";
    private static final java.lang.String KEY_SIZE = "size";
    private static final java.lang.String KEY_SOURCE = "source";
    private static final java.lang.String KEY_STORAGE = "storage";
    private static final java.lang.String KEY_TIMESTAMP_MILLIS = "timestampMillis";
    private static final java.lang.String KEY_TRANSFER_ACTION = "transferAction";
    private static final java.lang.String KEY_TYPE = "type";
    private static final java.lang.String KEY_URI = "uri";
    private static final java.lang.String KEY_USER_AFFILIATED_STATE = "uas";
    private static final java.lang.String KEY_USER_ID = "userId";
    private static final java.lang.String KEY_VENDOR_ID = "vid";
    private static final java.lang.String KEY_VERDICT = "vrd";
    private static final int PAYLOAD_TYPE_DATA_TRANSFER = 1;
    private static final int PAYLOAD_TYPE_SCREEN_CAPTURE_IMAGE = 2;
    private static final int PAYLOAD_TYPE_SCREEN_CAPTURE_VIDEO = 3;
    private static final int SOURCE_TYPE_APP = 1;
    public DataLeakPreventionEventCodec() {}
    private static android.app.admin.dataleakprevention.reporting.AppEntity appFromBundle(android.os.PersistableBundle p0) { return null; }
    private static android.os.PersistableBundle appToBundle(android.app.admin.dataleakprevention.reporting.AppEntity p0) { return null; }
    private static android.app.admin.dataleakprevention.reporting.DataTransferPayload dataTransferFromBundle(android.os.PersistableBundle p0) { return null; }
    private static android.os.PersistableBundle dataTransferToBundle(android.app.admin.dataleakprevention.reporting.DataTransferPayload p0) { return null; }
    public static android.app.admin.dataleakprevention.reporting.DataLeakPreventionEvent decode(java.lang.String p0) { return null; }
    private static android.app.admin.dataleakprevention.reporting.Destination destFromBundle(android.os.PersistableBundle p0) { return null; }
    private static android.os.PersistableBundle destToBundle(android.app.admin.dataleakprevention.reporting.Destination p0) { return null; }
    public static java.lang.String encode(android.app.admin.dataleakprevention.reporting.DataLeakPreventionEvent p0) { return null; }
    private static android.app.admin.dataleakprevention.reporting.Enforcement enforcementFromBundle(android.os.PersistableBundle p0) { return null; }
    private static android.os.PersistableBundle enforcementToBundle(android.app.admin.dataleakprevention.reporting.Enforcement p0) { return null; }
    private static android.app.admin.dataleakprevention.reporting.DataLeakPreventionEvent fromBundle(android.os.PersistableBundle p0) { return null; }
    private static android.app.admin.dataleakprevention.reporting.Payload payloadFromBundle(android.os.PersistableBundle p0) { return null; }
    private static android.os.PersistableBundle payloadToBundle(android.app.admin.dataleakprevention.reporting.Payload p0) { return null; }
    private static android.app.admin.dataleakprevention.reporting.ScreenCaptureImagePayload screenCaptureImageFromBundle(android.os.PersistableBundle p0) { return null; }
    private static android.os.PersistableBundle screenCaptureImageToBundle(android.app.admin.dataleakprevention.reporting.ScreenCaptureImagePayload p0) { return null; }
    private static android.app.admin.dataleakprevention.reporting.ScreenCaptureVideoPayload screenCaptureVideoFromBundle(android.os.PersistableBundle p0) { return null; }
    private static android.os.PersistableBundle screenCaptureVideoToBundle(android.app.admin.dataleakprevention.reporting.ScreenCaptureVideoPayload p0) { return null; }
    private static android.app.admin.dataleakprevention.reporting.Source sourceFromBundle(android.os.PersistableBundle p0) { return null; }
    private static android.os.PersistableBundle sourceToBundle(android.app.admin.dataleakprevention.reporting.Source p0) { return null; }
    private static android.app.admin.dataleakprevention.reporting.StorageEntity storageFromBundle(android.os.PersistableBundle p0) { return null; }
    private static android.os.PersistableBundle storageToBundle(android.app.admin.dataleakprevention.reporting.StorageEntity p0) { return null; }
    private static android.os.PersistableBundle toBundle(android.app.admin.dataleakprevention.reporting.DataLeakPreventionEvent p0) { return null; }
}
