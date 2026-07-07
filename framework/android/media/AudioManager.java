package android.media;

public class AudioManager {
    public static final java.lang.String ACTION_AUDIO_BECOMING_NOISY = "android.media.AUDIO_BECOMING_NOISY";
    public static final java.lang.String ACTION_HDMI_AUDIO_PLUG = "android.media.action.HDMI_AUDIO_PLUG";
    public static final java.lang.String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
    public static final java.lang.String ACTION_MICROPHONE_MUTE_CHANGED = "android.media.action.MICROPHONE_MUTE_CHANGED";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_SCO_AUDIO_STATE_CHANGED = "android.media.SCO_AUDIO_STATE_CHANGED";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_SCO_AUDIO_STATE_UPDATED = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_SPEAKERPHONE_STATE_CHANGED = "android.media.action.SPEAKERPHONE_STATE_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_VOLUME_CHANGED = "android.media.VOLUME_CHANGED_ACTION";
    public static final int ADJUST_LOWER = -1;
    public static final int ADJUST_MUTE = -100;
    public static final int ADJUST_RAISE = 1;
    public static final int ADJUST_SAME = 0;
    public static final int ADJUST_TOGGLE_MUTE = 101;
    public static final int ADJUST_UNMUTE = 100;
    public static final int AUDIOFOCUS_FLAGS_APPS = 3;
    public static final int AUDIOFOCUS_FLAGS_SYSTEM = 7;
    @android.annotation.SystemApi
    public static final int AUDIOFOCUS_FLAG_DELAY_OK = 1;
    @android.annotation.SystemApi
    public static final int AUDIOFOCUS_FLAG_LOCK = 4;
    @android.annotation.SystemApi
    public static final int AUDIOFOCUS_FLAG_PAUSES_ON_DUCKABLE_LOSS = 2;
    public static final int AUDIOFOCUS_FLAG_TEST = 8;
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    public static final int AUDIOFOCUS_LOSS = -1;
    public static final int AUDIOFOCUS_LOSS_TRANSIENT = -2;
    public static final int AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = -3;
    public static final int AUDIOFOCUS_NONE = 0;
    public static final int AUDIOFOCUS_REQUEST_DELAYED = 2;
    public static final int AUDIOFOCUS_REQUEST_FAILED = 0;
    public static final int AUDIOFOCUS_REQUEST_GRANTED = 1;
    public static final int AUDIOFOCUS_REQUEST_WAITING_FOR_EXT_POLICY = 100;
    private static final int AUDIOPORT_GENERATION_INIT = 0;
    public static final int AUDIO_DEVICE_CATEGORY_CARKIT = 4;
    public static final int AUDIO_DEVICE_CATEGORY_HEADPHONES = 3;
    public static final int AUDIO_DEVICE_CATEGORY_HEARING_AID = 6;
    public static final int AUDIO_DEVICE_CATEGORY_OTHER = 1;
    public static final int AUDIO_DEVICE_CATEGORY_RECEIVER = 7;
    public static final int AUDIO_DEVICE_CATEGORY_SPEAKER = 2;
    public static final int AUDIO_DEVICE_CATEGORY_UNKNOWN = 0;
    public static final int AUDIO_DEVICE_CATEGORY_WATCH = 5;
    public static final int AUDIO_SESSION_ID_GENERATE = 0;
    public static final long CALL_REDIRECTION_AUDIO_MODES = 189472651L;
    public static final int CALL_REDIRECT_NONE = 0;
    public static final int CALL_REDIRECT_PSTN = 1;
    public static final int CALL_REDIRECT_VOIP = 2;
    public static final int CSD_WARNING_ACCUMULATION_START = 4;
    public static final int CSD_WARNING_DOSE_REACHED_1X = 1;
    public static final int CSD_WARNING_DOSE_REPEATED_5X = 2;
    public static final int CSD_WARNING_MOMENTARY_EXPOSURE = 3;
    private static final boolean DEBUG = false;
    @android.annotation.SystemApi
    public static final int DEVICE_CONNECTION_STATE_CONNECTED = 1;
    @android.annotation.SystemApi
    public static final int DEVICE_CONNECTION_STATE_DISCONNECTED = 0;
    public static final int DEVICE_IN_ANLG_DOCK_HEADSET = -2147483136;
    public static final int DEVICE_IN_BACK_MIC = -2147483520;
    public static final int DEVICE_IN_BLE_CENTRAL = -1610612734;
    public static final int DEVICE_IN_BLE_CENTRAL_BROADCAST = -1610612732;
    public static final int DEVICE_IN_BLE_HEADSET = -1610612736;
    public static final int DEVICE_IN_BLE_HEARING_AID = -1610612735;
    public static final int DEVICE_IN_BLUETOOTH_SCO_HEADSET = -2147483640;
    public static final int DEVICE_IN_BUILTIN_MIC = -2147483644;
    public static final int DEVICE_IN_DGTL_DOCK_HEADSET = -2147482624;
    public static final int DEVICE_IN_ECHO_REFERENCE = -1879048192;
    public static final int DEVICE_IN_FM_TUNER = -2147475456;
    public static final int DEVICE_IN_HDMI = -2147483616;
    public static final int DEVICE_IN_HDMI_ARC = -2013265920;
    public static final int DEVICE_IN_HDMI_EARC = -2013265919;
    public static final int DEVICE_IN_LINE = -2147450880;
    public static final int DEVICE_IN_LOOPBACK = -2147221504;
    public static final int DEVICE_IN_SPDIF = -2147418112;
    public static final int DEVICE_IN_TELEPHONY_RX = -2147483584;
    public static final int DEVICE_IN_TV_TUNER = -2147467264;
    public static final int DEVICE_IN_USB_ACCESSORY = -2147481600;
    public static final int DEVICE_IN_USB_DEVICE = -2147479552;
    public static final int DEVICE_IN_WIRED_HEADSET = -2147483632;
    public static final int DEVICE_NONE = 0;
    public static final int DEVICE_OUT_ANLG_DOCK_HEADSET = 2048;
    public static final int DEVICE_OUT_AUX_DIGITAL = 1024;
    public static final int DEVICE_OUT_BLE_BROADCAST = 536870914;
    public static final int DEVICE_OUT_BLE_CENTRAL = 536870920;
    public static final int DEVICE_OUT_BLE_HEADSET = 536870912;
    public static final int DEVICE_OUT_BLE_HEARING_AID = 536870916;
    public static final int DEVICE_OUT_BLE_SPEAKER = 536870913;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP = 128;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP_HEADPHONES = 256;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER = 512;
    public static final int DEVICE_OUT_BLUETOOTH_SCO = 16;
    public static final int DEVICE_OUT_BLUETOOTH_SCO_CARKIT = 64;
    public static final int DEVICE_OUT_BLUETOOTH_SCO_HEADSET = 32;
    public static final int DEVICE_OUT_DEFAULT = 1073741824;
    public static final int DEVICE_OUT_DGTL_DOCK_HEADSET = 4096;
    public static final int DEVICE_OUT_EARPIECE = 1;
    public static final int DEVICE_OUT_ECHO_CANCELLER = 268435456;
    public static final int DEVICE_OUT_FM = 1048576;
    public static final int DEVICE_OUT_HDMI = 1024;
    public static final int DEVICE_OUT_HDMI_ARC = 262144;
    public static final int DEVICE_OUT_HDMI_EARC = 262145;
    public static final int DEVICE_OUT_LINE = 131072;
    public static final int DEVICE_OUT_MULTICHANNEL_GROUP = 8388609;
    public static final int DEVICE_OUT_REMOTE_SUBMIX = 32768;
    public static final int DEVICE_OUT_SPDIF = 524288;
    public static final int DEVICE_OUT_SPEAKER = 2;
    public static final int DEVICE_OUT_TELEPHONY_TX = 65536;
    public static final int DEVICE_OUT_USB_ACCESSORY = 8192;
    public static final int DEVICE_OUT_USB_DEVICE = 16384;
    public static final int DEVICE_OUT_USB_HEADSET = 67108864;
    public static final int DEVICE_OUT_WIRED_HEADPHONE = 8;
    public static final int DEVICE_OUT_WIRED_HEADSET = 4;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_ABSOLUTE = 3;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_ABSOLUTE_ADJUST_ONLY = 5;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_ABSOLUTE_MULTI_MODE = 4;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_FIXED = 2;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_FULL = 1;
    public static final int DEVICE_VOLUME_BEHAVIOR_UNSET = -1;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_VARIABLE = 0;
    public static final int DIRECT_PLAYBACK_BITSTREAM_SUPPORTED = 4;
    public static final int DIRECT_PLAYBACK_NOT_SUPPORTED = 0;
    public static final int DIRECT_PLAYBACK_OFFLOAD_GAPLESS_SUPPORTED = 3;
    public static final int DIRECT_PLAYBACK_OFFLOAD_SUPPORTED = 1;
    public static final int ENCODED_SURROUND_OUTPUT_ALWAYS = 2;
    public static final int ENCODED_SURROUND_OUTPUT_AUTO = 0;
    public static final int ENCODED_SURROUND_OUTPUT_MANUAL = 3;
    public static final int ENCODED_SURROUND_OUTPUT_NEVER = 1;
    public static final int ENCODED_SURROUND_OUTPUT_UNKNOWN = -1;
    public static final int ERROR = -1;
    public static final int ERROR_BAD_VALUE = -2;
    public static final int ERROR_DEAD_OBJECT = -6;
    public static final int ERROR_INVALID_OPERATION = -3;
    public static final int ERROR_NO_INIT = -5;
    public static final int ERROR_PERMISSION_DENIED = -4;
    public static final java.lang.String EXTRA_AUDIO_PLUG_STATE = "android.media.extra.AUDIO_PLUG_STATE";
    public static final java.lang.String EXTRA_ENCODINGS = "android.media.extra.ENCODINGS";
    public static final java.lang.String EXTRA_MASTER_VOLUME_MUTED = "android.media.EXTRA_MASTER_VOLUME_MUTED";
    public static final java.lang.String EXTRA_MAX_CHANNEL_COUNT = "android.media.extra.MAX_CHANNEL_COUNT";
    public static final java.lang.String EXTRA_PREV_VOLUME_STREAM_DEVICES = "android.media.EXTRA_PREV_VOLUME_STREAM_DEVICES";
    public static final java.lang.String EXTRA_PREV_VOLUME_STREAM_VALUE = "android.media.EXTRA_PREV_VOLUME_STREAM_VALUE";
    public static final java.lang.String EXTRA_RINGER_MODE = "android.media.EXTRA_RINGER_MODE";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SCO_AUDIO_PREVIOUS_STATE = "android.media.extra.SCO_AUDIO_PREVIOUS_STATE";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SCO_AUDIO_STATE = "android.media.extra.SCO_AUDIO_STATE";
    public static final java.lang.String EXTRA_STREAM_VOLUME_MUTED = "android.media.EXTRA_STREAM_VOLUME_MUTED";
    public static final java.lang.String EXTRA_VIBRATE_SETTING = "android.media.EXTRA_VIBRATE_SETTING";
    public static final java.lang.String EXTRA_VIBRATE_TYPE = "android.media.EXTRA_VIBRATE_TYPE";
    public static final java.lang.String EXTRA_VOLUME_STREAM_DEVICES = "android.media.EXTRA_VOLUME_STREAM_DEVICES";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    public static final java.lang.String EXTRA_VOLUME_STREAM_TYPE_ALIAS = "android.media.EXTRA_VOLUME_STREAM_TYPE_ALIAS";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
    private static final int EXT_FOCUS_POLICY_TIMEOUT_MS = 250;
    public static final int FLAG_ABSOLUTE_VOLUME = 8192;
    public static final int FLAG_ACTIVE_MEDIA_ONLY = 512;
    public static final int FLAG_ALLOW_RINGER_MODES = 2;
    @android.annotation.SystemApi
    public static final int FLAG_BLUETOOTH_ABS_VOLUME = 64;
    public static final int FLAG_FIXED_VOLUME = 32;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int FLAG_FROM_KEY = 4096;
    public static final int FLAG_HDMI_SYSTEM_AUDIO_VOLUME = 256;
    private static final java.util.TreeMap<java.lang.Integer, java.lang.String> FLAG_NAMES = null;
    public static final int FLAG_PLAY_SOUND = 4;
    public static final int FLAG_REMOVE_SOUND_AND_VIBRATE = 8;
    public static final int FLAG_SHOW_SILENT_HINT = 128;
    public static final int FLAG_SHOW_UI = 1;
    public static final int FLAG_SHOW_UI_WARNINGS = 1024;
    public static final int FLAG_SHOW_VIBRATE_HINT = 2048;
    public static final int FLAG_VIBRATE = 16;
    private static final java.lang.String FOCUS_CLIENT_ID_STRING = "android_audio_focus_client_id";
    public static final int FOCUS_ISOLATION_EXIT_LOSE_FOCUS = 2;
    public static final int FOCUS_ISOLATION_EXIT_RETAIN_FOCUS = 1;
    public static final int FX_BACK = 10;
    public static final int FX_FOCUS_NAVIGATION_DOWN = 2;
    public static final int FX_FOCUS_NAVIGATION_LEFT = 3;
    public static final int FX_FOCUS_NAVIGATION_REPEAT_1 = 12;
    public static final int FX_FOCUS_NAVIGATION_REPEAT_2 = 13;
    public static final int FX_FOCUS_NAVIGATION_REPEAT_3 = 14;
    public static final int FX_FOCUS_NAVIGATION_REPEAT_4 = 15;
    public static final int FX_FOCUS_NAVIGATION_RIGHT = 4;
    public static final int FX_FOCUS_NAVIGATION_UP = 1;
    public static final int FX_HOME = 11;
    public static final int FX_KEYPRESS_DELETE = 7;
    public static final int FX_KEYPRESS_INVALID = 9;
    public static final int FX_KEYPRESS_RETURN = 8;
    public static final int FX_KEYPRESS_SPACEBAR = 6;
    public static final int FX_KEYPRESS_STANDARD = 5;
    public static final int FX_KEY_CLICK = 0;
    public static final int GET_DEVICES_ALL = 3;
    public static final int GET_DEVICES_INPUTS = 1;
    public static final int GET_DEVICES_OUTPUTS = 2;
    public static final int HARDENING_DEFAULT = 0;
    public static final int HARDENING_DISABLE = 1;
    public static final int HARDENING_ENABLE = 2;
    public static final int HARDENING_THROW = 3;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int HFP_AUDIO_DISCONNECT_CODEC_NEGOTIATION_FAILED = 2;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int HFP_AUDIO_DISCONNECT_INTERNAL_ERROR = 4;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int HFP_AUDIO_DISCONNECT_PRECONDITION_FAILED = 3;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int HFP_AUDIO_DISCONNECT_REMOTE_INITIATED = 1;
    public static final java.lang.String INTERNAL_RINGER_MODE_CHANGED_ACTION = "android.media.INTERNAL_RINGER_MODE_CHANGED_ACTION";
    public static final java.lang.String MASTER_MUTE_CHANGED_ACTION = "android.media.MASTER_MUTE_CHANGED_ACTION";
    public static final int MODE_ASSISTANT_CONVERSATION = 7;
    public static final int MODE_CALL_REDIRECT = 5;
    public static final int MODE_CALL_SCREENING = 4;
    public static final int MODE_COMMUNICATION_REDIRECT = 6;
    public static final int MODE_CURRENT = -1;
    public static final int MODE_INVALID = -2;
    public static final int MODE_IN_CALL = 2;
    public static final int MODE_IN_COMMUNICATION = 3;
    public static final int MODE_NORMAL = 0;
    public static final int MODE_RINGTONE = 1;
    private static final int MSG_DEVICES_CALLBACK_REGISTERED = 0;
    private static final int MSG_DEVICES_DEVICES_ADDED = 1;
    private static final int MSG_DEVICES_DEVICES_REMOVED = 2;
    private static final int MSSG_FOCUS_CHANGE = 0;
    private static final int MSSG_PLAYBACK_CONFIG_CHANGE = 2;
    private static final int MSSG_RECORDING_CONFIG_CHANGE = 1;
    public static final int NUM_NAVIGATION_REPEAT_SOUND_EFFECTS = 4;
    public static final int NUM_SOUND_EFFECTS = 16;
    @java.lang.Deprecated
    public static final int NUM_STREAMS = 5;
    public static final int PLAYBACK_OFFLOAD_GAPLESS_SUPPORTED = 2;
    public static final int PLAYBACK_OFFLOAD_NOT_SUPPORTED = 0;
    public static final int PLAYBACK_OFFLOAD_SUPPORTED = 1;
    public static final java.lang.String PROPERTY_OUTPUT_FRAMES_PER_BUFFER = "android.media.property.OUTPUT_FRAMES_PER_BUFFER";
    public static final java.lang.String PROPERTY_OUTPUT_SAMPLE_RATE = "android.media.property.OUTPUT_SAMPLE_RATE";
    public static final java.lang.String PROPERTY_SUPPORT_AUDIO_SOURCE_UNPROCESSED = "android.media.property.SUPPORT_AUDIO_SOURCE_UNPROCESSED";
    public static final java.lang.String PROPERTY_SUPPORT_MIC_NEAR_ULTRASOUND = "android.media.property.SUPPORT_MIC_NEAR_ULTRASOUND";
    public static final java.lang.String PROPERTY_SUPPORT_SPEAKER_NEAR_ULTRASOUND = "android.media.property.SUPPORT_SPEAKER_NEAR_ULTRASOUND";
    private static final int[] PUBLIC_STREAM_TYPES = null;
    private static final int[] PUBLIC_STREAM_TYPES_WITH_ASSISTANT = null;
    private static final int QUERY_VOL = 3;
    private static final int QUERY_VOL_MAX = 2;
    private static final int QUERY_VOL_MIN = 1;
    public static final int RECORDER_STATE_STARTED = 0;
    public static final int RECORDER_STATE_STOPPED = 1;
    public static final int RECORD_CONFIG_EVENT_NONE = -1;
    public static final int RECORD_CONFIG_EVENT_RELEASE = 3;
    public static final int RECORD_CONFIG_EVENT_START = 0;
    public static final int RECORD_CONFIG_EVENT_STOP = 1;
    public static final int RECORD_CONFIG_EVENT_UPDATE = 2;
    public static final int RECORD_RIID_INVALID = -1;
    public static final long RETURN_DEVICE_VOLUME_BEHAVIOR_ABSOLUTE_ADJUST_ONLY = 240663182L;
    public static final java.lang.String RINGER_MODE_CHANGED_ACTION = "android.media.RINGER_MODE_CHANGED";
    public static final int RINGER_MODE_MAX = 2;
    public static final int RINGER_MODE_NORMAL = 2;
    public static final int RINGER_MODE_SILENT = 0;
    public static final int RINGER_MODE_VIBRATE = 1;
    @java.lang.Deprecated
    public static final int ROUTE_ALL = -1;
    @java.lang.Deprecated
    public static final int ROUTE_BLUETOOTH = 4;
    @java.lang.Deprecated
    public static final int ROUTE_BLUETOOTH_A2DP = 16;
    @java.lang.Deprecated
    public static final int ROUTE_BLUETOOTH_SCO = 4;
    @java.lang.Deprecated
    public static final int ROUTE_EARPIECE = 1;
    @java.lang.Deprecated
    public static final int ROUTE_HEADSET = 8;
    @java.lang.Deprecated
    public static final int ROUTE_SPEAKER = 2;
    @java.lang.Deprecated
    public static final int SCO_AUDIO_STATE_CONNECTED = 1;
    @java.lang.Deprecated
    public static final int SCO_AUDIO_STATE_CONNECTING = 2;
    @java.lang.Deprecated
    public static final int SCO_AUDIO_STATE_DISCONNECTED = 0;
    @java.lang.Deprecated
    public static final int SCO_AUDIO_STATE_ERROR = -1;
    public static final int STREAM_ACCESSIBILITY = 10;
    public static final int STREAM_ALARM = 4;
    public static final int STREAM_ASSISTANT = 11;
    @android.annotation.SystemApi
    public static final int STREAM_BLUETOOTH_SCO = 6;
    public static final java.lang.String STREAM_DEVICES_CHANGED_ACTION = "android.media.STREAM_DEVICES_CHANGED_ACTION";
    public static final int STREAM_DTMF = 8;
    public static final int STREAM_MUSIC = 3;
    public static final java.lang.String STREAM_MUTE_CHANGED_ACTION = "android.media.STREAM_MUTE_CHANGED_ACTION";
    public static final int STREAM_NOTIFICATION = 5;
    public static final int STREAM_RING = 2;
    public static final int STREAM_SYSTEM = 1;
    public static final int STREAM_SYSTEM_ENFORCED = 7;
    public static final int STREAM_TTS = 9;
    public static final int STREAM_VOICE_CALL = 0;
    @android.annotation.SystemApi
    public static final int SUCCESS = 0;
    private static final java.lang.String TAG = "AudioManager";
    public static final int USE_DEFAULT_STREAM_TYPE = -2147483648;
    public static final java.lang.String VIBRATE_SETTING_CHANGED_ACTION = "android.media.VIBRATE_SETTING_CHANGED";
    public static final int VIBRATE_SETTING_OFF = 0;
    public static final int VIBRATE_SETTING_ON = 1;
    public static final int VIBRATE_SETTING_ONLY_SILENT = 2;
    public static final int VIBRATE_TYPE_NOTIFICATION = 1;
    public static final int VIBRATE_TYPE_RINGER = 0;
    public static final java.lang.String VOLUME_CACHING_API = "getStreamVolume";
    private static final int VOLUME_CACHING_SIZE = 16;
    public static final java.lang.String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    public static final java.lang.String VOLUME_MAX_CACHING_API = "getStreamMaxVolume";
    public static final java.lang.String VOLUME_MIN_CACHING_API = "getStreamMinVolume";
    private static final float VOLUME_MIN_DB = -758.0f;
    private static int sAudioDevicePortGeneration;
    private static java.util.ArrayList<android.media.AudioPort> sAudioDevicePortsCached;
    private static int sAudioMixPortGeneration;
    private static java.util.ArrayList<android.media.AudioPort> sAudioMixPortsCached;
    private static int sAudioPatchPortGeneration;
    private static java.util.ArrayList<android.media.AudioPatch> sAudioPatchesCached;
    private static final android.media.AudioPortEventHandler sAudioPortEventHandler = null;
    private static java.lang.Object sAudioPortGenerationLock;
    private static java.lang.ref.WeakReference<android.content.Context> sContext;
    private static final android.os.IBinder sLegacyRouteToken = null;
    private static java.util.ArrayList<android.media.AudioPort> sPreviousAudioDevicePortsCached;
    private static java.util.ArrayList<android.media.AudioPort> sPreviousAudioMixPortsCached;
    private static android.media.IAudioService sService;
    private android.content.Context mApplicationContext;
    private final android.media.IAudioFocusDispatcher mAudioFocusDispatcher = null;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, android.media.AudioManager.FocusRequestInfo> mAudioFocusIdListenerMap = null;
    private android.media.AudioManager.AudioServerStateCallback mAudioServerStateCb;
    private final java.lang.Object mAudioServerStateCbLock = null;
    private final android.media.IAudioServerStateDispatcher mAudioServerStateDispatcher = null;
    private java.util.concurrent.Executor mAudioServerStateExec;
    private java.util.ArrayList<android.media.AudioManager.CallIRedirectionClientInfo> mCallIRedirectionClients;
    private java.lang.Object mCallRedirectionLock;
    private android.media.AudioManager.CallInjectionModeChangedListener mCallRedirectionModeListener;
    private final android.media.CallbackUtil.LazyListenerManager<android.media.AudioManager.OnCommunicationDeviceChangedListener> mCommDeviceChangedListenerMgr = null;
    private final java.util.Map<java.lang.Integer, java.lang.Object> mDevRoleForCapturePresetListeners = null;
    private final java.lang.Object mDevRoleForCapturePresetListenersLock = null;
    private final android.util.ArrayMap<android.media.AudioDeviceCallback, android.media.AudioManager.NativeEventHandlerDelegate> mDeviceCallbacks = null;
    private int mDeviceRoleListenersStatus;
    private final java.util.concurrent.ConcurrentHashMap<android.media.AudioManager.OnDevicesForAttributesChangedListener, android.media.AudioManager.IDevicesForAttributesCallbackStub> mDevicesForAttributesListenerToStub = null;
    private android.media.AudioManager.CapturePresetDevicesRoleDispatcherStub mDevicesRoleForCapturePresetDispatcherStub;
    private java.util.HashMap<java.lang.String, android.media.AudioManager.BlockingFocusResultReceiver> mFocusRequestsAwaitingResult;
    private final java.lang.Object mFocusRequestsLock = null;
    private final android.os.IBinder mICallBack = null;
    private boolean mIsAutomotive;
    private final android.media.CallbackUtil.LazyListenerManager<android.media.AudioManager.OnModeChangedListener> mModeChangedListenerMgr = null;
    private android.media.AudioManager.MuteAwaitConnectionDispatcherStub mMuteAwaitConnDispatcherStub;
    private final java.lang.Object mMuteAwaitConnectionListenerLock = null;
    private java.util.ArrayList<android.media.CallbackUtil.ListenerInfo<android.media.AudioManager.MuteAwaitConnectionCallback>> mMuteAwaitConnectionListeners;
    private final android.media.CallbackUtil.LazyListenerManager<android.media.AudioManager.OnNonDefaultDevicesForStrategyChangedListener> mNonDefDevListenerMgr = null;
    private android.content.Context mOriginalContext;
    private int mOriginalContextDeviceId;
    private final android.media.IPlaybackConfigDispatcher mPlayCb = null;
    private java.util.List<android.media.AudioManager.AudioPlaybackCallbackInfo> mPlaybackCallbackList;
    private final java.lang.Object mPlaybackCallbackLock = null;
    private android.media.AudioManager.OnAmPortUpdateListener mPortListener;
    private final android.media.CallbackUtil.LazyListenerManager<android.media.AudioManager.OnPreferredDevicesForStrategyChangedListener> mPrefDevListenerMgr = null;
    private final android.media.CallbackUtil.LazyListenerManager<android.media.AudioManager.OnPreferredMixerAttributesChangedListener> mPrefMixerAttributesListenerMgr = null;
    private java.util.ArrayList<android.media.AudioDevicePort> mPreviousPorts;
    private final android.media.IRecordingConfigDispatcher mRecCb = null;
    private java.util.List<android.media.AudioManager.AudioRecordingCallbackInfo> mRecordCallbackList;
    private final java.lang.Object mRecordCallbackLock = null;
    private final android.media.AudioManager.ServiceEventHandlerDelegate mServiceEventHandlerDelegate = null;
    private final android.media.CallbackUtil.LazyListenerManager<java.lang.Runnable> mStreamAliasingListenerMgr = null;
    private android.companion.virtual.VirtualDeviceManager mVirtualDeviceManager;
    private final android.os.IpcDataCache<android.media.AudioManager.VolumeCacheQuery, java.lang.Integer> mVolCache = null;
    private final android.os.IpcDataCache<android.media.AudioManager.VolumeCacheQuery, java.lang.Integer> mVolMaxCache = null;
    private final android.os.IpcDataCache<android.media.AudioManager.VolumeCacheQuery, java.lang.Integer> mVolMinCache = null;
    private final android.os.IpcDataCache.QueryHandler<android.media.AudioManager.VolumeCacheQuery, java.lang.Integer> mVolQuery = null;
    private final android.media.CallbackUtil.LazyListenerManager<android.media.AudioManager.VolumeGroupCallback> mVolumeChangedListenerMgr = null;
    public AudioManager() {}
    public AudioManager(android.content.Context p0) {}
    private android.media.AudioManager.BlockingFocusResultReceiver addClientIdToFocusReceiverLocked(java.lang.String p0) { return null; }
    private void addMicrophonesFromAudioDeviceInfo(java.util.ArrayList<android.media.MicrophoneInfo> p0, java.util.HashSet<java.lang.Integer> p1) {}
    private <T extends java.lang.Object> int addOnDevRoleForCapturePresetChangedListener(java.util.concurrent.Executor p0, T p1, int p2) { return 0; }
    public static final java.lang.String adjustToString(int p0) { return null; }
    private boolean applyAutoHardening() { return false; }
    public static java.lang.String audioDeviceCategoryToString(int p0) { return null; }
    public static java.lang.String audioFocusToString(int p0) { return null; }
    private void broadcastDeviceListChange_sync(android.os.Handler p0) {}
    private static android.media.AudioDeviceInfo[] calcListDeltas(java.util.ArrayList<android.media.AudioDevicePort> p0, java.util.ArrayList<android.media.AudioDevicePort> p1, int p2) { return null; }
    private void checkCallRedirectionFormat(android.media.AudioFormat p0, boolean p1) {}
    private static boolean checkFlags(android.media.AudioDevicePort p0, int p1) { return false; }
    private static boolean checkTypes(android.media.AudioDevicePort p0) { return false; }
    public static void clearVolumeCache(java.lang.String p0) {}
    public static int createAudioPatch(android.media.AudioPatch[] p0, android.media.AudioPortConfig[] p1, android.media.AudioPortConfig[] p2) { return 0; }
    private boolean delegateSoundEffectToVdm(int p0) { return false; }
    private android.media.AudioManager.FocusRequestInfo findFocusRequestInfo(java.lang.String p0) { return null; }
    public static java.lang.String flagsToString(int p0) { return null; }
    private android.content.AttributionSource getAttributionSource() { return null; }
    @android.annotation.SystemApi
    public static java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() { return null; }
    @android.annotation.SystemApi
    public static java.util.List<android.media.audiopolicy.AudioVolumeGroup> getAudioVolumeGroups() { return null; }
    private int getCallRedirectMode() { return 0; }
    private android.content.Context getContext() { return null; }
    private android.os.IBinder getDeviceFocusEnvironmentToken() { return null; }
    public static android.media.AudioDeviceInfo getDeviceForPortId(int p0, int p1) { return null; }
    public static android.media.AudioDeviceInfo getDeviceInfoFromType(int p0) { return null; }
    public static android.media.AudioDeviceInfo getDeviceInfoFromTypeAndAddress(int p0, java.lang.String p1) { return null; }
    public static android.media.AudioDeviceInfo[] getDevicesStatic(int p0) { return null; }
    public static int getDirectPlaybackSupport(android.media.AudioFormat p0, android.media.AudioAttributes p1) { return 0; }
    public static android.media.AudioHalVersionInfo getHalVersion() { return null; }
    private java.util.List<android.bluetooth.BluetoothLeAudioCodecConfig> getHwOffloadFormatsSupportedForLeAudio(int p0) { return null; }
    private java.lang.String getIdForAudioFocusListener(android.media.AudioManager.OnAudioFocusChangeListener p0) { return null; }
    public static int getNthNavigationRepeatSoundEffect(int p0) { return 0; }
    @java.lang.Deprecated
    public static int getPlaybackOffloadSupport(android.media.AudioFormat p0, android.media.AudioAttributes p1) { return 0; }
    public static final int[] getPublicStreamTypes() { return null; }
    static android.media.IAudioService getService() { return null; }
    private android.companion.virtual.VirtualDeviceManager getVirtualDeviceManager() { return null; }
    private int handleExternalAudioPolicyWaitIfNeeded(java.lang.String p0, android.media.AudioManager.BlockingFocusResultReceiver p1, android.media.AudioFocusRequest p2) { return 0; }
    private boolean hasCustomPolicyVirtualDeviceContext() { return false; }
    public static boolean hasHapticChannels(android.content.Context p0, android.net.Uri p1) { return false; }
    public static boolean hasHapticChannelsImpl(android.content.Context p0, android.net.Uri p1) { return false; }
    private boolean hasPlaybackCallback_sync(android.media.AudioManager.AudioPlaybackCallback p0) { return false; }
    private boolean hasRecordCallback_sync(android.media.AudioManager.AudioRecordingCallback p0) { return false; }
    private static android.media.AudioDeviceInfo[] infoListFromPortList(java.util.ArrayList<android.media.AudioDevicePort> p0, int p1) { return null; }
    private void initPlatform() {}
    public static boolean isHapticPlaybackSupported() { return false; }
    public static boolean isInputDevice(int p0) { return false; }
    public static boolean isOffloadedPlaybackSupported(android.media.AudioFormat p0, android.media.AudioAttributes p1) { return false; }
    public static boolean isOutputDevice(int p0) { return false; }
    public static boolean isPublicStreamType(int p0) { return false; }
    public static boolean isValidRingerMode(int p0) { return false; }
    public static boolean isVolumeControlStreamType(int p0) { return false; }
    public static int listAudioDevicePorts(java.util.ArrayList<android.media.AudioDevicePort> p0) { return 0; }
    public static int listAudioPatches(java.util.ArrayList<android.media.AudioPatch> p0) { return 0; }
    public static int listAudioPorts(java.util.ArrayList<android.media.AudioPort> p0) { return 0; }
    public static int listPreviousAudioDevicePorts(java.util.ArrayList<android.media.AudioDevicePort> p0) { return 0; }
    public static int listPreviousAudioPorts(java.util.ArrayList<android.media.AudioPort> p0) { return 0; }
    public static android.media.MicrophoneInfo microphoneInfoFromAudioDeviceInfo(android.media.AudioDeviceInfo p0) { return null; }
    static int registerAudioPolicyStatic(android.media.audiopolicy.AudioPolicy p0) { return 0; }
    public static int releaseAudioPatch(android.media.AudioPatch p0) { return 0; }
    private <T extends java.lang.Object> int removeOnDevRoleForCapturePresetChangedListener(T p0, int p1) { return 0; }
    private boolean removePlaybackCallback_sync(android.media.AudioManager.AudioPlaybackCallback p0) { return false; }
    private boolean removeRecordCallback_sync(android.media.AudioManager.AudioRecordingCallback p0) { return false; }
    static int resetAudioDevicePortGeneration() { return 0; }
    static int resetAudioMixPortGeneration() { return 0; }
    static int resetAudioPatchPortGeneration() { return 0; }
    static int resetAudioPortGeneration() { return 0; }
    public static int setAudioPortGain(android.media.AudioPort p0, android.media.AudioGainConfig p1) { return 0; }
    private void setContext(android.content.Context p0) {}
    public static void setPortIdForMicrophones(java.util.ArrayList<android.media.MicrophoneInfo> p0) {}
    private boolean setPreferredDevicesForCapturePreset(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) { return false; }
    @android.annotation.SystemApi
    public static void setRttEnabled(boolean p0) {}
    static void unregisterAudioPolicyAsyncStatic(android.media.audiopolicy.AudioPolicy p0) {}
    static int updateAudioPatchCache(java.util.ArrayList<android.media.AudioPatch> p0) { return 0; }
    static int updateAudioPortCache(java.util.ArrayList<android.media.AudioPort> p0, java.util.ArrayList<android.media.AudioPort> p1, int p2) { return 0; }
    static android.media.AudioPortConfig updatePortConfig(android.media.AudioPortConfig p0, java.util.ArrayList<android.media.AudioPort> p1) { return null; }
    public int abandonAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener p0) { return 0; }
    @android.annotation.SystemApi
    public int abandonAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener p0, android.media.AudioAttributes p1) { return 0; }
    public void abandonAudioFocusForCall() {}
    public int abandonAudioFocusForTest(android.media.AudioFocusRequest p0, java.lang.String p1) { return 0; }
    public int abandonAudioFocusRequest(android.media.AudioFocusRequest p0) { return 0; }
    @android.annotation.SystemApi
    public void addAssistantServicesUids(int[] p0) {}
    public void addOnCommunicationDeviceChangedListener(java.util.concurrent.Executor p0, android.media.AudioManager.OnCommunicationDeviceChangedListener p1) {}
    @android.annotation.SystemApi
    public void addOnDevicesForAttributesChangedListener(android.media.AudioAttributes p0, java.util.concurrent.Executor p1, android.media.AudioManager.OnDevicesForAttributesChangedListener p2) {}
    public void addOnModeChangedListener(java.util.concurrent.Executor p0, android.media.AudioManager.OnModeChangedListener p1) {}
    @android.annotation.SystemApi
    public void addOnNonDefaultDevicesForStrategyChangedListener(java.util.concurrent.Executor p0, android.media.AudioManager.OnNonDefaultDevicesForStrategyChangedListener p1) throws java.lang.SecurityException {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void addOnPreferredDeviceForStrategyChangedListener(java.util.concurrent.Executor p0, android.media.AudioManager.OnPreferredDeviceForStrategyChangedListener p1) throws java.lang.SecurityException {}
    @android.annotation.SystemApi
    public void addOnPreferredDevicesForCapturePresetChangedListener(java.util.concurrent.Executor p0, android.media.AudioManager.OnPreferredDevicesForCapturePresetChangedListener p1) throws java.lang.SecurityException {}
    @android.annotation.SystemApi
    public void addOnPreferredDevicesForStrategyChangedListener(java.util.concurrent.Executor p0, android.media.AudioManager.OnPreferredDevicesForStrategyChangedListener p1) throws java.lang.SecurityException {}
    public void addOnPreferredMixerAttributesChangedListener(java.util.concurrent.Executor p0, android.media.AudioManager.OnPreferredMixerAttributesChangedListener p1) {}
    @android.annotation.SystemApi
    public void addOnStreamAliasingChangedListener(java.util.concurrent.Executor p0, java.lang.Runnable p1) {}
    public void adjustStreamVolume(int p0, int p1, int p2) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void adjustStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, int p6) {}
    public void adjustSuggestedStreamVolume(int p0, int p1, int p2) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void adjustSuggestedStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, int p6) {}
    public void adjustVolume(int p0, int p1) {}
    public void adjustVolumeGroupVolume(int p0, int p1, int p2) {}
    public boolean areNavigationRepeatSoundEffectsEnabled() { return false; }
    @android.annotation.SystemApi
    public void cancelMuteAwaitConnection(android.media.AudioDeviceAttributes p0) throws java.lang.IllegalStateException {}
    @android.annotation.SystemApi
    public void clearAudioServerStateCallback() {}
    public void clearCommunicationDevice() {}
    @android.annotation.SystemApi
    public boolean clearPreferredDevicesForCapturePreset(int p0) { return false; }
    public boolean clearPreferredMixerAttributes(android.media.AudioAttributes p0, android.media.AudioDeviceInfo p1) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public android.media.AudioModeSession createAudioModeSession(android.media.AudioModeSession.Request p0, java.util.concurrent.Executor p1, android.media.AudioModeSession.Callback p2) { return null; }
    public boolean createFocusEnvironment(android.os.IBinder p0) { return false; }
    public boolean destroyFocusEnvironment(android.os.IBinder p0) { return false; }
    public void disableSafeMediaVolume() {}
    @android.annotation.SystemApi
    public int dispatchAudioFocusChange(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.AudioPolicy p2) { return 0; }
    @android.annotation.SystemApi
    public int dispatchAudioFocusChangeWithFade(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.AudioPolicy p2, java.util.List<android.media.AudioFocusInfo> p3, android.media.FadeManagerConfiguration p4) { return 0; }
    public void dispatchMediaKeyEvent(android.view.KeyEvent p0) {}
    public boolean enterAudioFocusFreezeForTest(java.util.List<java.lang.Integer> p0) { return false; }
    public android.media.AudioManager.FocusIsolationToken enterFocusIsolation(int p0) { return null; }
    public boolean exitAudioFocusFreezeForTest() { return false; }
    public boolean exitFocusIsolation(android.media.AudioManager.FocusIsolationToken p0, int p1) { return false; }
    public void forceComputeCsdOnAllDevices(boolean p0) {}
    public void forceUseFrameworkMel(boolean p0) {}
    public void forceVolumeControlStream(int p0) {}
    public int generateAudioSessionId() { return 0; }
    @android.annotation.SystemApi
    public int[] getActiveAssistantServicesUids() { return null; }
    public java.util.List<android.media.AudioPlaybackConfiguration> getActivePlaybackConfigurations() { return null; }
    public java.util.List<android.media.AudioRecordingConfiguration> getActiveRecordingConfigurations() { return null; }
    @android.annotation.SystemApi
    public long getAdditionalOutputDeviceDelay(android.media.AudioDeviceInfo p0) { return 0L; }
    public int getAllowedCapturePolicy() { return 0; }
    @android.annotation.SystemApi
    public int[] getAssistantServicesUids() { return null; }
    public java.util.List<android.media.AudioDeviceInfo> getAudioDevicesForAttributes(android.media.AudioAttributes p0) { return null; }
    public int getAudioHwSyncForSession(int p0) { return 0; }
    public java.util.List<android.media.AudioDeviceInfo> getAvailableCommunicationDevices() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public int getBluetoothAudioDeviceCategory(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    public android.media.AudioRecord getCallDownlinkExtractionAudioRecord(android.media.AudioFormat p0) { return null; }
    @android.annotation.SystemApi
    public android.media.AudioTrack getCallUplinkInjectionAudioTrack(android.media.AudioFormat p0) { return null; }
    public android.media.AudioDeviceInfo getCommunicationDevice() { return null; }
    public float getCsd() { return 0.0f; }
    @android.annotation.SystemApi
    public int getDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0) { return 0; }
    public android.media.AudioDeviceInfo[] getDevices(int p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributes(android.media.AudioAttributes p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.media.AudioDeviceInfo> getDevicesForAttributesAndUid(android.media.AudioAttributes p0, int p1) { return null; }
    @java.lang.Deprecated
    public int getDevicesForStream(int p0) { return 0; }
    public java.util.List<android.media.AudioProfile> getDirectProfilesForAttributes(android.media.AudioAttributes p0) { return null; }
    public java.util.List<android.media.AudioProfile> getDirectProfilesForAttributes(android.media.AudioAttributes p0, int p1) { return null; }
    public int getEncodedSurroundMode() { return 0; }
    public long getFadeOutDurationOnFocusLossMillis(android.media.AudioAttributes p0) { return 0L; }
    public java.util.List<java.lang.Integer> getFocusDuckedUidsForTest() { return null; }
    public long getFocusFadeOutDurationForTest() { return 0L; }
    public int getFocusRampTimeMs(int p0, android.media.AudioAttributes p1) { return 0; }
    public long getFocusUnmuteDelayAfterFadeOutForTest() { return 0L; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public java.util.List<android.bluetooth.BluetoothCodecConfig> getHwOffloadFormatsSupportedForA2dp() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public java.util.List<android.bluetooth.BluetoothLeAudioCodecConfig> getHwOffloadFormatsSupportedForLeAudio() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public java.util.List<android.bluetooth.BluetoothLeAudioCodecConfig> getHwOffloadFormatsSupportedForLeBroadcast() { return null; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.Integer> getIndependentStreamTypes() { return null; }
    @android.annotation.SystemApi
    public int getLastAudibleStreamVolume(int p0) { return 0; }
    @android.annotation.SystemApi
    public int getLastAudibleVolumeForVolumeGroup(int p0) { return 0; }
    @android.annotation.SystemApi
    public long getMaxAdditionalOutputDeviceDelay(android.media.AudioDeviceInfo p0) { return 0L; }
    @android.annotation.SystemApi
    public int getMaxVolumeIndexForAttributes(android.media.AudioAttributes p0) { return 0; }
    public java.util.List<android.media.MicrophoneInfo> getMicrophones() throws java.io.IOException { return null; }
    @android.annotation.SystemApi
    public int getMinVolumeIndexForAttributes(android.media.AudioAttributes p0) { return 0; }
    public int getMode() { return 0; }
    @android.annotation.SystemApi
    public android.media.AudioDeviceAttributes getMutingExpectedDevice() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.media.AudioDeviceAttributes> getNonDefaultDevicesForStrategy(android.media.audiopolicy.AudioProductStrategy p0) { return null; }
    public int getOutputLatency(int p0) { return 0; }
    public java.lang.String getParameters(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public android.media.AudioDeviceAttributes getPreferredDeviceForStrategy(android.media.audiopolicy.AudioProductStrategy p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.media.AudioDeviceAttributes> getPreferredDevicesForCapturePreset(int p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.media.AudioDeviceAttributes> getPreferredDevicesForStrategy(android.media.audiopolicy.AudioProductStrategy p0) { return null; }
    public android.media.AudioMixerAttributes getPreferredMixerAttributes(android.media.AudioAttributes p0, android.media.AudioDeviceInfo p1) { return null; }
    public java.lang.String getProperty(java.lang.String p0) { return null; }
    public java.util.List<android.media.audiopolicy.AudioMix> getRegisteredPolicyMixes() { return null; }
    public java.util.List<java.lang.Integer> getReportedSurroundFormats() { return null; }
    public int getRingerMode() { return 0; }
    public int getRingerModeInternal() { return 0; }
    public android.media.IRingtonePlayer getRingtonePlayer() { return null; }
    @java.lang.Deprecated
    public int getRouting(int p0) { return 0; }
    public float getRs2Value() { return 0.0f; }
    public android.media.Spatializer getSpatializer() { return null; }
    public int getStreamMaxVolume(int p0) { return 0; }
    public int getStreamMinVolume(int p0) { return 0; }
    public int getStreamMinVolumeInt(int p0) { return 0; }
    @android.annotation.SystemApi
    public int getStreamTypeAlias(int p0) { return 0; }
    public int getStreamVolume(int p0) { return 0; }
    public float getStreamVolumeDb(int p0, int p1, int p2) { return 0.0f; }
    public java.util.Set<java.lang.Integer> getSupportedDeviceTypes(int p0) { return null; }
    public java.util.List<android.media.AudioMixerAttributes> getSupportedMixerAttributes(android.media.AudioDeviceInfo p0) { return null; }
    @android.annotation.SystemApi
    public int[] getSupportedSystemUsages() { return null; }
    public java.util.Map<java.lang.Integer, java.lang.Boolean> getSurroundFormats() { return null; }
    public int getUiSoundsStreamType() { return 0; }
    @android.annotation.SystemApi
    public android.os.UserHandle getUserHandleForZoneId(int p0) { return null; }
    public int getVibrateSetting(int p0) { return 0; }
    public android.media.IVolumeController getVolumeController() { return null; }
    public int getVolumeGroupIdForAttributes(android.media.AudioAttributes p0) { return 0; }
    @android.annotation.SystemApi
    public int getVolumeGroupIdForAttributes(android.media.AudioAttributes p0, int p1) { return 0; }
    @android.annotation.SystemApi
    public int getVolumeGroupMaxVolumeIndex(int p0) { return 0; }
    @android.annotation.SystemApi
    public int getVolumeGroupMinVolumeIndex(int p0) { return 0; }
    @android.annotation.SystemApi
    public int getVolumeGroupVolumeIndex(int p0) { return 0; }
    @android.annotation.SystemApi
    public int getVolumeIndexForAttributes(android.media.AudioAttributes p0) { return 0; }
    public android.media.VolumePolicy getVolumePolicy() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void handleBluetoothActiveDeviceChanged(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothDevice p1, android.media.BluetoothProfileConnectionInfo p2) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void handleBluetoothHfpAudioDisconnected(android.bluetooth.BluetoothDevice p0, int p1) {}
    public boolean hasAudioFocus(java.lang.String p0) { return false; }
    public boolean hasRegisteredDynamicPolicy() { return false; }
    public boolean isAudioFocusExclusive() { return false; }
    @android.annotation.SystemApi
    public boolean isAudioServerRunning() { return false; }
    public boolean isBluetoothA2dpOn() { return false; }
    public boolean isBluetoothAudioDeviceCategoryFixed(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    public boolean isBluetoothScoAvailableOffCall() { return false; }
    @java.lang.Deprecated
    public boolean isBluetoothScoOn() { return false; }
    @android.annotation.SystemApi
    public boolean isBluetoothVariableLatencyEnabled() { return false; }
    public boolean isCallScreeningModeSupported() { return false; }
    public boolean isCsdAsAFeatureAvailable() { return false; }
    public boolean isCsdAsAFeatureEnabled() { return false; }
    public boolean isCsdEnabled() { return false; }
    @android.annotation.SystemApi
    public boolean isHdmiSystemAudioSupported() { return false; }
    public boolean isHomeSoundEffectEnabled() { return false; }
    @android.annotation.SystemApi
    public boolean isHotwordStreamSupported(boolean p0) { return false; }
    public boolean isMasterMute() { return false; }
    public boolean isMicrophoneMute() { return false; }
    public boolean isMultiAudioFocusEnabled() { return false; }
    public boolean isMusicActive() { return false; }
    public boolean isMusicActiveRemotely() { return false; }
    @android.annotation.SystemApi
    public boolean isPstnCallAudioInterceptable() { return false; }
    public boolean isRampingRingerEnabled() { return false; }
    @android.annotation.SystemApi
    public boolean isScoManagedByAudio() { return false; }
    public boolean isSilentMode() { return false; }
    @java.lang.Deprecated
    public boolean isSpeakerphoneOn() { return false; }
    public boolean isStreamAffectedByMute(int p0) { return false; }
    public boolean isStreamAffectedByRingerMode(int p0) { return false; }
    public boolean isStreamMutableByUi(int p0) { return false; }
    public boolean isStreamMute(int p0) { return false; }
    public boolean isSurroundFormatEnabled(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean isUltrasoundSupported() { return false; }
    public boolean isVolumeControlUsingVolumeGroups() { return false; }
    public boolean isVolumeFixed() { return false; }
    public boolean isVolumeGroupMuted(int p0) { return false; }
    public boolean isWiredHeadsetOn() { return false; }
    public void loadSoundEffects() {}
    public void lowerVolumeToRs1() {}
    @android.annotation.SystemApi
    public void muteAwaitConnection(int[] p0, android.media.AudioDeviceAttributes p1, long p2, java.util.concurrent.TimeUnit p3) throws java.lang.IllegalStateException {}
    public void notifyVolumeControllerVisible(android.media.IVolumeController p0, boolean p1) {}
    public void permissionUpdateBarrier() {}
    public void playSoundEffect(int p0) {}
    public void playSoundEffect(int p0, float p1) {}
    public void playSoundEffect(int p0, int p1) {}
    public void preDispatchKeyEvent(android.view.KeyEvent p0, int p1) {}
    public void registerAudioDeviceCallback(android.media.AudioDeviceCallback p0, android.os.Handler p1) {}
    public void registerAudioFocusRequest(android.media.AudioFocusRequest p0) {}
    public void registerAudioPlaybackCallback(android.media.AudioManager.AudioPlaybackCallback p0, android.os.Handler p1) {}
    @android.annotation.SystemApi
    public int registerAudioPolicy(android.media.audiopolicy.AudioPolicy p0) { return 0; }
    public void registerAudioPortUpdateListener(android.media.AudioManager.OnAudioPortUpdateListener p0) {}
    public void registerAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback p0, android.os.Handler p1) {}
    @java.lang.Deprecated
    public void registerMediaButtonEventReceiver(android.app.PendingIntent p0) {}
    @java.lang.Deprecated
    public void registerMediaButtonEventReceiver(android.content.ComponentName p0) {}
    public void registerMediaButtonIntent(android.app.PendingIntent p0, android.content.ComponentName p1) {}
    @android.annotation.SystemApi
    public void registerMuteAwaitConnectionCallback(java.util.concurrent.Executor p0, android.media.AudioManager.MuteAwaitConnectionCallback p1) {}
    @java.lang.Deprecated
    public void registerRemoteControlClient(android.media.RemoteControlClient p0) {}
    @java.lang.Deprecated
    public boolean registerRemoteController(android.media.RemoteController p0) { return false; }
    @android.annotation.SystemApi
    public void registerVolumeGroupCallback(java.util.concurrent.Executor p0, android.media.AudioManager.VolumeGroupCallback p1) {}
    public void reloadAudioSettings() {}
    @android.annotation.SystemApi
    public void removeAssistantServicesUids(int[] p0) {}
    @android.annotation.SystemApi
    public boolean removeDeviceAsNonDefaultForStrategy(android.media.audiopolicy.AudioProductStrategy p0, android.media.AudioDeviceAttributes p1) { return false; }
    public void removeOnCommunicationDeviceChangedListener(android.media.AudioManager.OnCommunicationDeviceChangedListener p0) {}
    @android.annotation.SystemApi
    public void removeOnDevicesForAttributesChangedListener(android.media.AudioManager.OnDevicesForAttributesChangedListener p0) {}
    public void removeOnModeChangedListener(android.media.AudioManager.OnModeChangedListener p0) {}
    @android.annotation.SystemApi
    public void removeOnNonDefaultDevicesForStrategyChangedListener(android.media.AudioManager.OnNonDefaultDevicesForStrategyChangedListener p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void removeOnPreferredDeviceForStrategyChangedListener(android.media.AudioManager.OnPreferredDeviceForStrategyChangedListener p0) {}
    @android.annotation.SystemApi
    public void removeOnPreferredDevicesForCapturePresetChangedListener(android.media.AudioManager.OnPreferredDevicesForCapturePresetChangedListener p0) {}
    @android.annotation.SystemApi
    public void removeOnPreferredDevicesForStrategyChangedListener(android.media.AudioManager.OnPreferredDevicesForStrategyChangedListener p0) {}
    public void removeOnPreferredMixerAttributesChangedListener(android.media.AudioManager.OnPreferredMixerAttributesChangedListener p0) {}
    @android.annotation.SystemApi
    public void removeOnStreamAliasingChangedListener(java.lang.Runnable p0) {}
    @android.annotation.SystemApi
    public boolean removePreferredDeviceForStrategy(android.media.audiopolicy.AudioProductStrategy p0) { return false; }
    public int requestAudioFocus(android.media.AudioFocusRequest p0) { return 0; }
    @android.annotation.SystemApi
    public int requestAudioFocus(android.media.AudioFocusRequest p0, android.media.audiopolicy.AudioPolicy p1) { return 0; }
    public int requestAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener p0, int p1, int p2) { return 0; }
    @android.annotation.SystemApi
    public int requestAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener p0, android.media.AudioAttributes p1, int p2, int p3) throws java.lang.IllegalArgumentException { return 0; }
    @android.annotation.SystemApi
    public int requestAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener p0, android.media.AudioAttributes p1, int p2, int p3, android.media.audiopolicy.AudioPolicy p4) throws java.lang.IllegalArgumentException { return 0; }
    public void requestAudioFocusForCall(int p0, int p1) {}
    public int requestAudioFocusForTest(android.media.AudioFocusRequest p0, java.lang.String p1, int p2, int p3) { return 0; }
    @android.annotation.SystemApi
    public boolean resetProductStrategiesZoneIdForUser(android.os.UserHandle p0) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void setA2dpSuspended(boolean p0) {}
    @android.annotation.SystemApi
    public void setActiveAssistantServiceUids(int[] p0) {}
    @android.annotation.SystemApi
    public boolean setAdditionalOutputDeviceDelay(android.media.AudioDeviceInfo p0, long p1) { return false; }
    public void setAllowedCapturePolicy(int p0) {}
    @android.annotation.SystemApi
    public void setAudioServerStateCallback(java.util.concurrent.Executor p0, android.media.AudioManager.AudioServerStateCallback p1) {}
    @java.lang.Deprecated
    public void setBluetoothA2dpOn(boolean p0) {}
    public boolean setBluetoothAudioDeviceCategory(java.lang.String p0, int p1) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void setBluetoothHeadsetProperties(java.lang.String p0, boolean p1, boolean p2) {}
    @java.lang.Deprecated
    public void setBluetoothScoOn(boolean p0) {}
    @android.annotation.SystemApi
    public void setBluetoothVariableLatencyEnabled(boolean p0) {}
    public boolean setCommunicationDevice(android.media.AudioDeviceInfo p0) { return false; }
    public void setCsd(float p0) {}
    public void setCsdAsAFeatureEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public boolean setDeviceAsNonDefaultForStrategy(android.media.audiopolicy.AudioProductStrategy p0, android.media.AudioDeviceAttributes p1) { return false; }
    @android.annotation.SystemApi
    public void setDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0, int p1) {}
    public boolean setEncodedSurroundMode(int p0) { return false; }
    @android.annotation.SystemApi
    public void setFocusRequestResult(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.AudioPolicy p2) {}
    public void setHardeningOverride(int p0) {}
    public int setHdmiSystemAudioSupported(boolean p0) { return 0; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void setHfpEnabled(boolean p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void setHfpSamplingRate(int p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void setHfpVolume(int p0) {}
    public void setHomeSoundEffectEnabled(boolean p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void setLeAudioSuspended(boolean p0) {}
    public void setMasterMute(boolean p0, int p1) {}
    public void setMicrophoneMute(boolean p0) {}
    public void setMicrophoneMuteFromSwitch(boolean p0) {}
    public void setMode(int p0) {}
    public void setMultiAudioFocusEnabled(boolean p0) {}
    public void setNavigationRepeatSoundEffectsEnabled(boolean p0) {}
    public void setNotifAliasRingForTest(boolean p0) {}
    @java.lang.Deprecated
    public void setParameter(java.lang.String p0, java.lang.String p1) {}
    public void setParameters(java.lang.String p0) {}
    @android.annotation.SystemApi
    public boolean setPreferredDeviceForCapturePreset(int p0, android.media.AudioDeviceAttributes p1) { return false; }
    @android.annotation.SystemApi
    public boolean setPreferredDeviceForStrategy(android.media.audiopolicy.AudioProductStrategy p0, android.media.AudioDeviceAttributes p1) { return false; }
    @android.annotation.SystemApi
    public boolean setPreferredDevicesForStrategy(android.media.audiopolicy.AudioProductStrategy p0, java.util.List<android.media.AudioDeviceAttributes> p1) { return false; }
    public boolean setPreferredMixerAttributes(android.media.AudioAttributes p0, android.media.AudioDeviceInfo p1, android.media.AudioMixerAttributes p2) { return false; }
    @android.annotation.SystemApi
    public boolean setProductStrategiesZoneIdForUser(android.os.UserHandle p0, int p1) { return false; }
    public void setRampingRingerEnabled(boolean p0) {}
    public void setRingerMode(int p0) {}
    public void setRingerModeInternal(int p0) {}
    @java.lang.Deprecated
    public void setRouting(int p0, int p1, int p2) {}
    public void setRs2Value(float p0) {}
    @java.lang.Deprecated
    public void setSpeakerphoneOn(boolean p0) {}
    @java.lang.Deprecated
    public void setStreamMute(int p0, boolean p1) {}
    @java.lang.Deprecated
    public void setStreamSolo(int p0, boolean p1) {}
    public void setStreamVolume(int p0, int p1, int p2) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void setStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, int p6) {}
    @android.annotation.SystemApi
    public void setSupportedSystemUsages(int[] p0) {}
    public boolean setSurroundFormatEnabled(int p0, boolean p1) { return false; }
    public void setTestDeviceConnectionState(android.media.AudioDeviceAttributes p0, boolean p1) {}
    public void setVibrateSetting(int p0, int p1) {}
    public void setVolumeController(android.media.IVolumeController p0) {}
    public void setVolumeControllerLongPressTimeoutEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public void setVolumeGroupVolumeIndex(int p0, int p1, int p2) {}
    @android.annotation.SystemApi
    public void setVolumeIndexForAttributes(android.media.AudioAttributes p0, int p1, int p2) {}
    public void setVolumePolicy(android.media.VolumePolicy p0) {}
    public void setWiredDeviceConnectionState(int p0, int p1, java.lang.String p2, java.lang.String p3) {}
    @android.annotation.SystemApi
    public void setWiredDeviceConnectionState(android.media.AudioDeviceAttributes p0, int p1) {}
    @java.lang.Deprecated
    public void setWiredHeadsetOn(boolean p0) {}
    public boolean shouldNotificationSoundPlay(android.media.AudioAttributes p0) { return false; }
    public boolean shouldVibrate(int p0) { return false; }
    @java.lang.Deprecated
    public void startBluetoothSco() {}
    @java.lang.Deprecated
    public void startBluetoothScoVirtualCall() {}
    @java.lang.Deprecated
    public void stopBluetoothSco() {}
    @android.annotation.SystemApi
    public boolean supportsBluetoothVariableLatency() { return false; }
    public void unloadSoundEffects() {}
    public void unregisterAudioDeviceCallback(android.media.AudioDeviceCallback p0) {}
    public void unregisterAudioFocusRequest(android.media.AudioManager.OnAudioFocusChangeListener p0) {}
    public void unregisterAudioPlaybackCallback(android.media.AudioManager.AudioPlaybackCallback p0) {}
    @android.annotation.SystemApi
    public void unregisterAudioPolicy(android.media.audiopolicy.AudioPolicy p0) {}
    @android.annotation.SystemApi
    public void unregisterAudioPolicyAsync(android.media.audiopolicy.AudioPolicy p0) {}
    public void unregisterAudioPortUpdateListener(android.media.AudioManager.OnAudioPortUpdateListener p0) {}
    public void unregisterAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback p0) {}
    @java.lang.Deprecated
    public void unregisterMediaButtonEventReceiver(android.app.PendingIntent p0) {}
    @java.lang.Deprecated
    public void unregisterMediaButtonEventReceiver(android.content.ComponentName p0) {}
    public void unregisterMediaButtonIntent(android.app.PendingIntent p0) {}
    @android.annotation.SystemApi
    public void unregisterMuteAwaitConnectionCallback(android.media.AudioManager.MuteAwaitConnectionCallback p0) {}
    @java.lang.Deprecated
    public void unregisterRemoteControlClient(android.media.RemoteControlClient p0) {}
    @java.lang.Deprecated
    public void unregisterRemoteController(android.media.RemoteController p0) {}
    @android.annotation.SystemApi
    public void unregisterVolumeGroupCallback(android.media.AudioManager.VolumeGroupCallback p0) {}
    public void waitForAudioHandlerBarrier() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioDeviceCategory {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioDeviceRole {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioDirectPlaybackMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioOffloadMode {
    }

    public static abstract class AudioPlaybackCallback {
        public AudioPlaybackCallback() {}
        public void onPlaybackConfigChanged(java.util.List<android.media.AudioPlaybackConfiguration> p0) {}
    }

    private static class AudioPlaybackCallbackInfo {
        final android.media.AudioManager.AudioPlaybackCallback mCb = null;
        final android.os.Handler mHandler = null;
        AudioPlaybackCallbackInfo(android.media.AudioManager.AudioPlaybackCallback p0, android.os.Handler p1) {}
    }

    public static abstract class AudioRecordingCallback {
        public AudioRecordingCallback() {}
        public void onRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> p0) {}
    }

    private static class AudioRecordingCallbackInfo {
        final android.media.AudioManager.AudioRecordingCallback mCb = null;
        final android.os.Handler mHandler = null;
        AudioRecordingCallbackInfo(android.media.AudioManager.AudioRecordingCallback p0, android.os.Handler p1) {}
    }

    @android.annotation.SystemApi
    public static abstract class AudioServerStateCallback {
        public AudioServerStateCallback() {}
        public void onAudioServerDown() {}
        public void onAudioServerUp() {}
    }

    final class AudioVolumeChangeDispatcherStub extends android.media.audiopolicy.IAudioVolumeChangeDispatcher.Stub implements android.media.CallbackUtil.DispatcherStub {
        AudioVolumeChangeDispatcherStub(android.media.AudioManager p0) { super(); }
        public void onAudioVolumeGroupChanged(int p0, int p1) {}
        public void register(boolean p0) {}
    }

    private static final class BlockingFocusResultReceiver {
        private final java.lang.String mFocusClientId = null;
        private int mFocusRequestResult;
        private final android.media.AudioManager.SafeWaitObject mLock = null;
        private boolean mResultReceived;
        BlockingFocusResultReceiver(java.lang.String p0) {}
        void notifyResult(int p0) {}
        boolean receivedResult() { return false; }
        int requestResult() { return 0; }
        public void waitForResult(long p0) {}
    }

    class CallInjectionModeChangedListener implements android.media.AudioManager.OnModeChangedListener {
        CallInjectionModeChangedListener(android.media.AudioManager p0) {}
        public void onModeChanged(int p0) {}
    }

    class CallIRedirectionClientInfo {
        public int redirectMode;
        public java.lang.ref.WeakReference trackOrRecord;
        CallIRedirectionClientInfo(android.media.AudioManager p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallRedirectionMode {
    }

    private final class CapturePresetDevicesRoleDispatcherStub extends android.media.ICapturePresetDevicesRoleDispatcher.Stub {
        private CapturePresetDevicesRoleDispatcherStub(android.media.AudioManager p0) { super(); }
        public void dispatchDevicesRoleChanged(int p0, int p1, java.util.List<android.media.AudioDeviceAttributes> p2) {}
    }

    private final class CommunicationDeviceDispatcherStub extends android.media.ICommunicationDeviceDispatcher.Stub implements android.media.CallbackUtil.DispatcherStub {
        private CommunicationDeviceDispatcherStub(android.media.AudioManager p0) { super(); }
        public void dispatchCommunicationDeviceChanged(int p0) {}
        public void register(boolean p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CsdWarning {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceConnectionState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceVolumeBehavior {
    }

    private class DevRoleListenerInfo<T extends java.lang.Object> {
        final java.util.concurrent.Executor mExecutor = null;
        final T mListener = null;
        DevRoleListenerInfo(java.util.concurrent.Executor p0, T p1) {}
    }

    private class DevRoleListeners<T extends java.lang.Object> {
        private final java.lang.Object mDevRoleListenersLock = null;
        private java.util.ArrayList<android.media.AudioManager.DevRoleListenerInfo<T>> mListenerInfos;
        private DevRoleListeners(android.media.AudioManager p0) {}
        private android.media.AudioManager.DevRoleListenerInfo<T> getDevRoleListenerInfo(T p0) { return null; }
        private boolean hasDevRoleListener(T p0) { return false; }
        private boolean removeDevRoleListener(T p0) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EncodedSurroundOutputMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FocusIsolationExitMode {
    }

    public static class FocusIsolationToken {
        private final android.os.IBinder mIBinder = null;
        private FocusIsolationToken(android.os.IBinder p0) {}
    }

    private static class FocusRequestInfo {
        final android.os.Handler mHandler = null;
        final android.media.AudioFocusRequest mRequest = null;
        FocusRequestInfo(android.media.AudioFocusRequest p0, android.os.Handler p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FocusRequestResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HardeningMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HfpAudioDisconnectReason {
    }

    private static final class IDevicesForAttributesCallbackStub extends android.media.IDevicesForAttributesCallback.Stub {
        android.media.CallbackUtil.ListenerInfo<android.media.AudioManager.OnDevicesForAttributesChangedListener> mInfo;
        IDevicesForAttributesCallbackStub(android.media.AudioManager.OnDevicesForAttributesChangedListener p0, java.util.concurrent.Executor p1) { super(); }
        public void onDevicesForAttributesChanged(android.media.AudioAttributes p0, boolean p1, java.util.List<android.media.AudioDeviceAttributes> p2) {}
        public void register(boolean p0, android.media.AudioAttributes p1) {}
    }

    final class ModeDispatcherStub extends android.media.IAudioModeDispatcher.Stub implements android.media.CallbackUtil.DispatcherStub {
        ModeDispatcherStub(android.media.AudioManager p0) { super(); }
        public void dispatchAudioModeChanged(int p0) {}
        public void register(boolean p0) {}
    }

    @android.annotation.SystemApi
    public static abstract class MuteAwaitConnectionCallback {
        public static final int EVENT_CANCEL = 3;
        public static final int EVENT_CONNECTION = 1;
        public static final int EVENT_TIMEOUT = 2;
        public MuteAwaitConnectionCallback() {}
        public void onMutedUntilConnection(android.media.AudioDeviceAttributes p0, int[] p1) {}
        public void onUnmutedEvent(int p0, android.media.AudioDeviceAttributes p1, int[] p2) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface UnmuteEvent {
        }
    }

    private final class MuteAwaitConnectionDispatcherStub extends android.media.IMuteAwaitConnectionCallback.Stub {
        private MuteAwaitConnectionDispatcherStub(android.media.AudioManager p0) { super(); }
        public void dispatchOnMutedUntilConnection(android.media.AudioDeviceAttributes p0, int[] p1) {}
        public void dispatchOnUnmutedEvent(int p0, android.media.AudioDeviceAttributes p1, int[] p2) {}
        public void register(boolean p0) {}
    }

    private class NativeEventHandlerDelegate {
        private final android.os.Handler mHandler = null;
        NativeEventHandlerDelegate(android.media.AudioManager p0, android.media.AudioDeviceCallback p1, android.os.Handler p2) {}
        android.os.Handler getHandler() { return null; }
    }

    private class OnAmPortUpdateListener implements android.media.AudioManager.OnAudioPortUpdateListener {
        static final java.lang.String TAG = "OnAmPortUpdateListener";
        private OnAmPortUpdateListener(android.media.AudioManager p0) {}
        public void onAudioPatchListUpdate(android.media.AudioPatch[] p0) {}
        public void onAudioPortListUpdate(android.media.AudioPort[] p0) {}
        public void onServiceDied() {}
    }

    public static interface OnAudioFocusChangeListener {
        public void onAudioFocusChange(int p0);
    }

    public static interface OnAudioPortUpdateListener {
        public void onAudioPatchListUpdate(android.media.AudioPatch[] p0);
        public void onAudioPortListUpdate(android.media.AudioPort[] p0);
        public void onServiceDied();
    }

    public static interface OnCommunicationDeviceChangedListener {
        public void onCommunicationDeviceChanged(android.media.AudioDeviceInfo p0);
    }

    @android.annotation.SystemApi
    public static interface OnDevicesForAttributesChangedListener {
        public void onDevicesForAttributesChanged(android.media.AudioAttributes p0, java.util.List<android.media.AudioDeviceAttributes> p1);
    }

    public static interface OnModeChangedListener {
        public void onModeChanged(int p0);
    }

    @android.annotation.SystemApi
    public static interface OnNonDefaultDevicesForStrategyChangedListener {
        public void onNonDefaultDevicesForStrategyChanged(android.media.audiopolicy.AudioProductStrategy p0, java.util.List<android.media.AudioDeviceAttributes> p1);
    }

    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static interface OnPreferredDeviceForStrategyChangedListener {
        public void onPreferredDeviceForStrategyChanged(android.media.audiopolicy.AudioProductStrategy p0, android.media.AudioDeviceAttributes p1);
    }

    @android.annotation.SystemApi
    public static interface OnPreferredDevicesForCapturePresetChangedListener {
        public void onPreferredDevicesForCapturePresetChanged(int p0, java.util.List<android.media.AudioDeviceAttributes> p1);
    }

    @android.annotation.SystemApi
    public static interface OnPreferredDevicesForStrategyChangedListener {
        public void onPreferredDevicesForStrategyChanged(android.media.audiopolicy.AudioProductStrategy p0, java.util.List<android.media.AudioDeviceAttributes> p1);
    }

    public static interface OnPreferredMixerAttributesChangedListener {
        public void onPreferredMixerAttributesChanged(android.media.AudioAttributes p0, android.media.AudioDeviceInfo p1, android.media.AudioMixerAttributes p2);
    }

    private static final class PlaybackConfigChangeCallbackData {
        final android.media.AudioManager.AudioPlaybackCallback mCb = null;
        final java.util.List<android.media.AudioPlaybackConfiguration> mConfigs = null;
        PlaybackConfigChangeCallbackData(android.media.AudioManager.AudioPlaybackCallback p0, java.util.List<android.media.AudioPlaybackConfiguration> p1) {}
    }

    private final class PreferredMixerAttributesDispatcherStub extends android.media.IPreferredMixerAttributesDispatcher.Stub implements android.media.CallbackUtil.DispatcherStub {
        private PreferredMixerAttributesDispatcherStub(android.media.AudioManager p0) { super(); }
        public void dispatchPrefMixerAttributesChanged(android.media.AudioAttributes p0, int p1, android.media.AudioMixerAttributes p2) {}
        public void register(boolean p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PublicStreamTypes {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PublicStreamTypesWithDefault {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PublicVolumeFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface QueryVolCommand {
    }

    private static final class RecordConfigChangeCallbackData {
        final android.media.AudioManager.AudioRecordingCallback mCb = null;
        final java.util.List<android.media.AudioRecordingConfiguration> mConfigs = null;
        RecordConfigChangeCallbackData(android.media.AudioManager.AudioRecordingCallback p0, java.util.List<android.media.AudioRecordingConfiguration> p1) {}
    }

    private static final class SafeWaitObject {
        private boolean mQuit;
        private SafeWaitObject() {}
        public void safeNotify() {}
        public void safeWait(long p0) throws java.lang.InterruptedException {}
    }

    private class ServiceEventHandlerDelegate {
        private final android.os.Handler mHandler = null;
        ServiceEventHandlerDelegate(android.media.AudioManager p0, android.os.Handler p1) {}
        android.os.Handler getHandler() { return null; }
    }

    private final class StrategyNonDefaultDevicesDispatcherStub extends android.media.IStrategyNonDefaultDevicesDispatcher.Stub implements android.media.CallbackUtil.DispatcherStub {
        private StrategyNonDefaultDevicesDispatcherStub(android.media.AudioManager p0) { super(); }
        public void dispatchNonDefDevicesChanged(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) {}
        public void register(boolean p0) {}
    }

    private final class StrategyPreferredDevicesDispatcherStub extends android.media.IStrategyPreferredDevicesDispatcher.Stub implements android.media.CallbackUtil.DispatcherStub {
        private StrategyPreferredDevicesDispatcherStub(android.media.AudioManager p0) { super(); }
        public void dispatchPrefDevicesChanged(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) {}
        public void register(boolean p0) {}
    }

    final class StreamAliasingDispatcherStub extends android.media.IStreamAliasingDispatcher.Stub implements android.media.CallbackUtil.DispatcherStub {
        StreamAliasingDispatcherStub(android.media.AudioManager p0) { super(); }
        public void dispatchStreamAliasingChanged() {}
        public void register(boolean p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SystemSoundEffect {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SystemVolumeFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VolumeAdjustment {
    }

    private static final class VolumeCacheQuery {
        private final int queryCommand = 0;
        private final int stream = 0;
        private VolumeCacheQuery(int p0, int p1) {}
        private java.lang.String queryVolCommandToString() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public int queryCommand() { return 0; }
        public int stream() { return 0; }
        public java.lang.String toString() { return null; }
    }

    @android.annotation.SystemApi
    public static abstract class VolumeGroupCallback {
        public VolumeGroupCallback() {}
        public void onAudioVolumeGroupChanged(int p0, int p1) {}
    }
}
