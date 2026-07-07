package com.android.internal;

public final class FrameworksBaseTrackEventOuterClass {
    public static final int APP_EXIT_REASON_ANR = 6;
    public static final int APP_EXIT_REASON_CRASH = 4;
    public static final int APP_EXIT_REASON_CRASH_NATIVE = 5;
    public static final int APP_EXIT_REASON_DEPENDENCY_DIED = 12;
    public static final int APP_EXIT_REASON_EXCESSIVE_RESOURCE_USAGE = 9;
    public static final int APP_EXIT_REASON_EXIT_SELF = 1;
    public static final int APP_EXIT_REASON_FREEZER = 14;
    public static final int APP_EXIT_REASON_INITIALIZATION_FAILURE = 7;
    public static final int APP_EXIT_REASON_LOW_MEMORY = 3;
    public static final int APP_EXIT_REASON_MEMORY_LIMITER = 17;
    public static final int APP_EXIT_REASON_OTHER = 13;
    public static final int APP_EXIT_REASON_PACKAGE_STATE_CHANGE = 15;
    public static final int APP_EXIT_REASON_PACKAGE_UPDATED = 16;
    public static final int APP_EXIT_REASON_PERMISSION_CHANGE = 8;
    public static final int APP_EXIT_REASON_SIGNALED = 2;
    public static final int APP_EXIT_REASON_UNKNOWN = 0;
    public static final int APP_EXIT_REASON_USER_REQUESTED = 10;
    public static final int APP_EXIT_REASON_USER_STOPPED = 11;
    public static final int APP_EXIT_SUBREASON_ACTIVITY_LAUNCH_FAILURE = 57;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_APP_TRIGGERED = 33;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_BIND_APPLICATION = 34;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_BROADCAST_OF_INTENT = 35;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_CONTENT_PROVIDER_NOT_RESPONDING = 36;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_EXECUTING_SERVICE = 37;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_FOREGROUND_SERVICE_TIMEOUT = 38;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_FOREGROUND_SHORT_SERVICE_TIMEOUT = 39;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_GPU_HANG = 40;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_INPUT_DISPATCHING_TIMEOUT = 41;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_INPUT_DISPATCHING_TIMEOUT_NO_FOCUSED_WINDOW = 42;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_JOB_SERVICE_BIND = 43;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_JOB_SERVICE_NOTIFICATION_NOT_PROVIDED = 44;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_JOB_SERVICE_START = 45;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_JOB_SERVICE_STOP = 46;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_START_FOREGROUND_SERVICE = 47;
    public static final int APP_EXIT_SUBREASON_ANR_TYPE_SYSTEM_SERVER_WATCHDOG_TIMEOUT = 48;
    public static final int APP_EXIT_SUBREASON_APP_DATA_CLEARED = 55;
    public static final int APP_EXIT_SUBREASON_CACHED_IDLE_FORCED_APP_STANDBY = 18;
    public static final int APP_EXIT_SUBREASON_CONFIG_RESET_RESTART = 60;
    public static final int APP_EXIT_SUBREASON_EXCESSIVE_BINDER_OBJECTS = 29;
    public static final int APP_EXIT_SUBREASON_EXCESSIVE_CPU = 7;
    public static final int APP_EXIT_SUBREASON_EXCESSIVE_ENQUEUED_BROADCASTS_COUNT = 49;
    public static final int APP_EXIT_SUBREASON_EXCESSIVE_OUTGOING_BROADCASTS_WHILE_CACHED = 32;
    public static final int APP_EXIT_SUBREASON_FORCE_STOP = 21;
    public static final int APP_EXIT_SUBREASON_FREEZER_BINDER_ASYNC_FULL = 31;
    public static final int APP_EXIT_SUBREASON_FREEZER_BINDER_IOCTL = 19;
    public static final int APP_EXIT_SUBREASON_FREEZER_BINDER_TRANSACTION = 20;
    public static final int APP_EXIT_SUBREASON_IMPERCEPTIBLE = 15;
    public static final int APP_EXIT_SUBREASON_INVALID_START = 13;
    public static final int APP_EXIT_SUBREASON_INVALID_STATE = 14;
    public static final int APP_EXIT_SUBREASON_ISOLATED_NOT_NEEDED = 17;
    public static final int APP_EXIT_SUBREASON_KILL_ALL_BG_EXCEPT = 10;
    public static final int APP_EXIT_SUBREASON_KILL_ALL_FG = 9;
    public static final int APP_EXIT_SUBREASON_KILL_BACKGROUND = 24;
    public static final int APP_EXIT_SUBREASON_KILL_PID = 12;
    public static final int APP_EXIT_SUBREASON_KILL_UID = 11;
    public static final int APP_EXIT_SUBREASON_LARGE_CACHED = 5;
    public static final int APP_EXIT_SUBREASON_MEMORY_PRESSURE = 6;
    public static final int APP_EXIT_SUBREASON_OOM_KILL = 30;
    public static final int APP_EXIT_SUBREASON_PACKAGE_DELETED = 53;
    public static final int APP_EXIT_SUBREASON_PACKAGE_HIDDEN = 52;
    public static final int APP_EXIT_SUBREASON_PACKAGE_MOVED = 54;
    public static final int APP_EXIT_SUBREASON_PACKAGE_UPDATE = 25;
    public static final int APP_EXIT_SUBREASON_PROVIDER_CLIENT_REPORTED_DEATH = 61;
    public static final int APP_EXIT_SUBREASON_RAPID_ACTIVITY_LAUNCH = 59;
    public static final int APP_EXIT_SUBREASON_REMOVE_LRU = 16;
    public static final int APP_EXIT_SUBREASON_REMOVE_TASK = 22;
    public static final int APP_EXIT_SUBREASON_RESTART_ACTIVITY_PROCESS_TIMEOUT = 58;
    public static final int APP_EXIT_SUBREASON_SDK_SANDBOX_DIED = 27;
    public static final int APP_EXIT_SUBREASON_SDK_SANDBOX_NOT_NEEDED = 28;
    public static final int APP_EXIT_SUBREASON_STOP_APP = 23;
    public static final int APP_EXIT_SUBREASON_STORAGE_SESSION_RESET = 56;
    public static final int APP_EXIT_SUBREASON_SYSTEM_UPDATE_DONE = 8;
    public static final int APP_EXIT_SUBREASON_TOO_MANY_CACHED = 2;
    public static final int APP_EXIT_SUBREASON_TOO_MANY_EMPTY = 3;
    public static final int APP_EXIT_SUBREASON_TRIM_EMPTY = 4;
    public static final int APP_EXIT_SUBREASON_UNDELIVERED_BROADCAST = 26;
    public static final int APP_EXIT_SUBREASON_UNKNOWN = 0;
    public static final int APP_EXIT_SUBREASON_VOLUME_MOUNT = 50;
    public static final int APP_EXIT_SUBREASON_VOLUME_UNMOUNT = 51;
    public static final int APP_EXIT_SUBREASON_WAIT_FOR_DEBUGGER = 1;
    public static final int BROADCAST_DELIVERY_GROUP_POLICY_ALL = 0;
    public static final int BROADCAST_DELIVERY_GROUP_POLICY_MERGED = 2;
    public static final int BROADCAST_DELIVERY_GROUP_POLICY_MOST_RECENT = 1;
    public static final int BROADCAST_TYPE_ALARM = 4;
    public static final int BROADCAST_TYPE_BACKGROUND = 1;
    public static final int BROADCAST_TYPE_DEFERRABLE_UNTIL_ACTIVE = 128;
    public static final int BROADCAST_TYPE_FOREGROUND = 2;
    public static final int BROADCAST_TYPE_INITIAL_STICKY = 2048;
    public static final int BROADCAST_TYPE_INTERACTIVE = 8;
    public static final int BROADCAST_TYPE_NONE = 0;
    public static final int BROADCAST_TYPE_ORDERED = 16;
    public static final int BROADCAST_TYPE_PRIORITIZED = 32;
    public static final int BROADCAST_TYPE_PUSH_MESSAGE = 256;
    public static final int BROADCAST_TYPE_PUSH_MESSAGE_OVER_QUOTA = 512;
    public static final int BROADCAST_TYPE_RESULT_TO = 64;
    public static final int BROADCAST_TYPE_STICKY = 1024;
    public static final int HOSTING_TYPE_ACTIVITY = 1;
    public static final int HOSTING_TYPE_ADDED_APPLICATION = 2;
    public static final int HOSTING_TYPE_BACKUP = 3;
    public static final int HOSTING_TYPE_BROADCAST = 4;
    public static final int HOSTING_TYPE_CONTENT_PROVIDER = 5;
    public static final int HOSTING_TYPE_EMPTY = 14;
    public static final int HOSTING_TYPE_LINK_FAIL = 6;
    public static final int HOSTING_TYPE_NEXT_ACTIVITY = 8;
    public static final int HOSTING_TYPE_NEXT_TOP_ACTIVITY = 9;
    public static final int HOSTING_TYPE_ON_HOLD = 7;
    public static final int HOSTING_TYPE_RESTART = 10;
    public static final int HOSTING_TYPE_SERVICE = 11;
    public static final int HOSTING_TYPE_SYSTEM = 12;
    public static final int HOSTING_TYPE_TOP_ACTIVITY = 13;
    public static final int HOSTING_TYPE_UNKNOWN = 0;
    public static final int IMPORTANCE_BACKGROUND = 400;
    public static final int IMPORTANCE_CACHED = 400;
    public static final int IMPORTANCE_CANT_SAVE_STATE = 350;
    public static final int IMPORTANCE_CANT_SAVE_STATE_PRE_26 = 170;
    public static final int IMPORTANCE_EMPTY = 500;
    public static final int IMPORTANCE_FOREGROUND = 100;
    public static final int IMPORTANCE_FOREGROUND_SERVICE = 125;
    public static final int IMPORTANCE_GONE = 1000;
    public static final int IMPORTANCE_PERCEPTIBLE = 230;
    public static final int IMPORTANCE_PERCEPTIBLE_PRE_26 = 130;
    public static final int IMPORTANCE_SERVICE = 300;
    public static final int IMPORTANCE_TOP_SLEEPING = 325;
    public static final int IMPORTANCE_TOP_SLEEPING_PRE_28 = 150;
    public static final int IMPORTANCE_UNKNOWN = 0;
    public static final int IMPORTANCE_VISIBLE = 200;
    public static final int OOM_ADJ_REASON_ACTIVITY = 1;
    public static final int OOM_ADJ_REASON_ALLOWLIST = 10;
    public static final int OOM_ADJ_REASON_BACKUP = 15;
    public static final int OOM_ADJ_REASON_BATCH_UPDATE_REQUEST = 26;
    public static final int OOM_ADJ_REASON_BIND_SERVICE = 4;
    public static final int OOM_ADJ_REASON_COMPONENT_DISABLED = 22;
    public static final int OOM_ADJ_REASON_EXECUTING_SERVICE = 20;
    public static final int OOM_ADJ_REASON_FINISH_RECEIVER = 2;
    public static final int OOM_ADJ_REASON_FOLLOW_UP = 23;
    public static final int OOM_ADJ_REASON_GET_PROVIDER = 7;
    public static final int OOM_ADJ_REASON_NONE = 0;
    public static final int OOM_ADJ_REASON_PROCESS_BEGIN = 11;
    public static final int OOM_ADJ_REASON_PROCESS_END = 12;
    public static final int OOM_ADJ_REASON_RECONFIGURATION = 24;
    public static final int OOM_ADJ_REASON_REMOVE_PROVIDER = 8;
    public static final int OOM_ADJ_REASON_REMOVE_TASK = 17;
    public static final int OOM_ADJ_REASON_RESTRICTION_CHANGE = 21;
    public static final int OOM_ADJ_REASON_SERVICE_BINDER_CALL = 25;
    public static final int OOM_ADJ_REASON_SHELL = 16;
    public static final int OOM_ADJ_REASON_SHORT_FGS_TIMEOUT = 13;
    public static final int OOM_ADJ_REASON_START_RECEIVER = 3;
    public static final int OOM_ADJ_REASON_START_SERVICE = 6;
    public static final int OOM_ADJ_REASON_STOP_SERVICE = 19;
    public static final int OOM_ADJ_REASON_SYSTEM_INIT = 14;
    public static final int OOM_ADJ_REASON_UID_IDLE = 18;
    public static final int OOM_ADJ_REASON_UI_VISIBILITY = 9;
    public static final int OOM_ADJ_REASON_UNBIND_SERVICE = 5;
    public static final int PACKAGE_STATE_NORMAL = 1;
    public static final int PACKAGE_STATE_STOPPED = 2;
    public static final int PACKAGE_STATE_UNKNOWN = 0;
    public static final int PROCESS_CAPABILITY_BFSL = 5;
    public static final int PROCESS_CAPABILITY_CPU_TIME = 8;
    public static final int PROCESS_CAPABILITY_FOREGROUND_AUDIO_CONTROL = 7;
    public static final int PROCESS_CAPABILITY_FOREGROUND_CAMERA = 2;
    public static final int PROCESS_CAPABILITY_FOREGROUND_LOCATION = 1;
    public static final int PROCESS_CAPABILITY_FOREGROUND_MICROPHONE = 3;
    public static final int PROCESS_CAPABILITY_IMPLICIT_CPU_TIME = 9;
    public static final int PROCESS_CAPABILITY_POWER_RESTRICTED_NETWORK = 4;
    public static final int PROCESS_CAPABILITY_UNKNOWN = 0;
    public static final int PROCESS_CAPABILITY_USER_RESTRICTED_NETWORK = 6;
    public static final int PROCESS_START_TYPE_COLD = 3;
    public static final int PROCESS_START_TYPE_HOT = 2;
    public static final int PROCESS_START_TYPE_UNKNOWN = 0;
    public static final int PROCESS_START_TYPE_WARM = 1;
    public static final int PROCESS_STATE_BACKUP = 1008;
    public static final int PROCESS_STATE_BOUND_FOREGROUND_SERVICE = 1004;
    public static final int PROCESS_STATE_BOUND_TOP = 1020;
    public static final int PROCESS_STATE_CACHED_ACTIVITY = 1015;
    public static final int PROCESS_STATE_CACHED_ACTIVITY_CLIENT = 1016;
    public static final int PROCESS_STATE_CACHED_EMPTY = 1018;
    public static final int PROCESS_STATE_CACHED_RECENT = 1017;
    public static final int PROCESS_STATE_FOREGROUND_SERVICE = 1003;
    public static final int PROCESS_STATE_HEAVY_WEIGHT = 1012;
    public static final int PROCESS_STATE_HOME = 1013;
    public static final int PROCESS_STATE_IMPORTANT_BACKGROUND = 1006;
    public static final int PROCESS_STATE_IMPORTANT_FOREGROUND = 1005;
    public static final int PROCESS_STATE_LAST_ACTIVITY = 1014;
    public static final int PROCESS_STATE_NONEXISTENT = 1019;
    public static final int PROCESS_STATE_PERSISTENT = 1000;
    public static final int PROCESS_STATE_PERSISTENT_UI = 1001;
    public static final int PROCESS_STATE_RECEIVER = 1010;
    public static final int PROCESS_STATE_SERVICE = 1009;
    public static final int PROCESS_STATE_TOP = 1002;
    public static final int PROCESS_STATE_TOP_SLEEPING = 1011;
    public static final int PROCESS_STATE_TRANSIENT_BACKGROUND = 1007;
    public static final int PROCESS_STATE_UNKNOWN = 999;
    public static final int PROCESS_STATE_UNKNOWN_TO_PROTO = 998;
    public static final int PROCESS_STATE_UNSPECIFIED = 0;
    public static final int RECEIVER_TYPE_MANIFEST = 2;
    public static final int RECEIVER_TYPE_RUNTIME = 1;
    public static final int RECEIVER_TYPE_UNKNOWN = 0;
    public static final int SERVICE_RESTART_REASON_CONNECTION = 2;
    public static final int SERVICE_RESTART_REASON_FORCED = 3;
    public static final int SERVICE_RESTART_REASON_PERSISTENT = 4;
    public static final int SERVICE_RESTART_REASON_START_REQUESTED = 1;
    public static final int SERVICE_RESTART_REASON_UNKNOWN = 0;
    public static final int TRIGGER_TYPE_ALARM = 1;
    public static final int TRIGGER_TYPE_JOB = 4;
    public static final int TRIGGER_TYPE_PUSH_MESSAGE = 2;
    public static final int TRIGGER_TYPE_PUSH_MESSAGE_OVER_QUOTA = 3;
    public static final int TRIGGER_TYPE_UNKNOWN = 0;
    public static final int UFR_ACTIVITY = 1;
    public static final int UFR_ALLOWLIST = 10;
    public static final int UFR_BACKUP = 22;
    public static final int UFR_BINDER_TXNS = 18;
    public static final int UFR_BIND_SERVICE = 4;
    public static final int UFR_COMPONENT_DISABLED = 29;
    public static final int UFR_EXECUTING_SERVICE = 27;
    public static final int UFR_FEATURE_FLAGS = 19;
    public static final int UFR_FILE_LOCKS = 16;
    public static final int UFR_FILE_LOCK_CHECK_FAILURE = 17;
    public static final int UFR_FINISH_RECEIVER = 2;
    public static final int UFR_GET_PROVIDER = 7;
    public static final int UFR_NONE = 0;
    public static final int UFR_OOM_ADJ_FOLLOW_UP = 30;
    public static final int UFR_OOM_ADJ_REASON_BATCH_UPDATE_REQUEST = 33;
    public static final int UFR_OOM_ADJ_REASON_SERVICE_BINDER_CALL = 32;
    public static final int UFR_OOM_ADJ_RECONFIGURATION = 31;
    public static final int UFR_PING = 15;
    public static final int UFR_PROCESS_BEGIN = 11;
    public static final int UFR_PROCESS_END = 12;
    public static final int UFR_REMOVE_PROVIDER = 8;
    public static final int UFR_REMOVE_TASK = 24;
    public static final int UFR_RESTRICTION_CHANGE = 28;
    public static final int UFR_SHELL = 23;
    public static final int UFR_SHORT_FGS_TIMEOUT = 20;
    public static final int UFR_START_RECEIVER = 3;
    public static final int UFR_START_SERVICE = 6;
    public static final int UFR_STOP_SERVICE = 26;
    public static final int UFR_SYSTEM_INIT = 21;
    public static final int UFR_TRIM_MEMORY = 13;
    public static final int UFR_UID_IDLE = 25;
    public static final int UFR_UI_VISIBILITY = 9;
    public static final int UFR_UNBIND_SERVICE = 5;
    public FrameworksBaseTrackEventOuterClass() {}

    public final class AndroidBinderDiedEvent {
        public static final long PID = 1120986464258L;
        public static final long PROCESS_NAME = 1138166333443L;
        public static final long UID = 1120986464257L;
        public AndroidBinderDiedEvent(com.android.internal.FrameworksBaseTrackEventOuterClass p0) {}
    }

    public final class AndroidBitmap {
        public static final long CONFIG = 1120986464261L;
        public static final long DENSITY = 1120986464260L;
        public static final long HEIGHT = 1120986464259L;
        public static final long ID = 1112396529672L;
        public static final long MUTABLE_PIXELS = 1120986464262L;
        public static final long PIXEL_STORAGE_TYPE = 1120986464263L;
        public static final long SIZE = 1112396529665L;
        public static final long WIDTH = 1120986464258L;
        public AndroidBitmap(com.android.internal.FrameworksBaseTrackEventOuterClass p0) {}
    }

    public final class AndroidBroadcastEvent {
        public static final long ACTION_NAME = 1138166333445L;
        public static final long BROADCAST_TYPE = 1120986464268L;
        public static final long DELIVERY_GROUP_POLICY = 1159641169933L;
        public static final long DISPATCH_DELAY_MS = 1112396529672L;
        public static final long FILTER_PRIORITY = 1120986464271L;
        public static final long FINISH_DELAY_MS = 1112396529674L;
        public static final long FIRST_LAUNCH = 1155346202642L;
        public static final long INTENT_FLAGS = 1120986464270L;
        public static final long PACKAGE_STOPPED_STATE = 1159641169931L;
        public static final long PROC_START_TYPE = 1159641169927L;
        public static final long RECEIVER_PID = 1120986464258L;
        public static final long RECEIVER_PROCESS_STATE = 1159641169937L;
        public static final long RECEIVER_TYPE = 1159641169926L;
        public static final long RECEIVER_UID = 1120986464257L;
        public static final long RECEIVE_DELAY_MS = 1112396529673L;
        public static final long SENDER_PID = 1120986464260L;
        public static final long SENDER_PROCESS_STATE = 1159641169936L;
        public static final long SENDER_UID = 1120986464259L;
        public AndroidBroadcastEvent(com.android.internal.FrameworksBaseTrackEventOuterClass p0) {}
    }

    public final class AndroidFreezerEvent {
        public static final long FROZEN_DUR_MS = 1112396529668L;
        public static final long PID = 1120986464258L;
        public static final long UID = 1120986464257L;
        public static final long UNFREEZE_REASON = 1159641169925L;
        public static final long UNFROZEN_DUR_MS = 1112396529667L;
        public AndroidFreezerEvent(com.android.internal.FrameworksBaseTrackEventOuterClass p0) {}
    }

    public final class AndroidJobSchedulerJob {
        public static final long BACK_OFF_POLICY_TYPE = 1120986464273L;
        public static final long DEADLINE_MS = 1112396529673L;
        public static final long DELAY_MS = 1112396529674L;
        public static final long EFFECTIVE_PRIORITY = 1120986464263L;
        public static final long INTERNAL_STOP_REASON = 1120986464274L;
        public static final long JOB_ID = 1120986464257L;
        public static final long JOB_NAME_IID = 1116691496981L;
        public static final long JOB_START_LATENCY_MS = 1112396529675L;
        public static final long JOB_STATE_FLAGS = 1112396529684L;
        public static final long NUM_PREVIOUS_ATTEMPTS = 1120986464264L;
        public static final long NUM_RESCHEDULES_DUE_TO_ABANDONMENT = 1120986464272L;
        public static final long NUM_UNCOMPLETED_WORK_ITEMS = 1120986464268L;
        public static final long PERIODIC_JOB_FLEX_INTERVAL_MS = 1112396529679L;
        public static final long PERIODIC_JOB_INTERVAL_MS = 1112396529678L;
        public static final long PROC_STATE = 1120986464269L;
        public static final long PROXY_UID = 1120986464259L;
        public static final long PUBLIC_STOP_REASON = 1120986464275L;
        public static final long REQUESTED_PRIORITY = 1120986464262L;
        public static final long SOURCE_UID = 1120986464258L;
        public static final long STANDBY_BUCKET = 1120986464261L;
        public static final long STATE = 1120986464260L;
        public AndroidJobSchedulerJob(com.android.internal.FrameworksBaseTrackEventOuterClass p0) {}
    }

    public final class AndroidMessageQueue {
        public static final long MESSAGE_CODE = 1120986464259L;
        public static final long MESSAGE_DELAY_MS = 1116691496964L;
        public static final long RECEIVING_THREAD_NAME = 1138166333442L;
        public static final long SENDING_THREAD_NAME = 1138166333441L;
        public AndroidMessageQueue(com.android.internal.FrameworksBaseTrackEventOuterClass p0) {}
    }

    public final class AndroidProcessDiedEvent {
        public static final long HAS_FOREGROUND_SERVICES = 1120986464264L;
        public static final long IMPORTANCE = 1159641169926L;
        public static final long PID = 1120986464258L;
        public static final long PROCESS_NAME = 1138166333443L;
        public static final long REASON = 1159641169924L;
        public static final long RSS_KB = 1120986464263L;
        public static final long SUB_REASON = 1159641169925L;
        public static final long UID = 1120986464257L;
        public AndroidProcessDiedEvent(com.android.internal.FrameworksBaseTrackEventOuterClass p0) {}
    }

    public final class AndroidProcessStartEvent {
        public static final long BIND_APPLICATION_DELAY_MS = 1112396529668L;
        public static final long HOSTING_NAME = 1138166333446L;
        public static final long HOSTING_TYPE = 1159641169927L;
        public static final long PID = 1120986464258L;
        public static final long PROCESS_NAME = 1138166333443L;
        public static final long PROCESS_START_DELAY_MS = 1112396529669L;
        public static final long TRIGGER_TYPE = 1159641169928L;
        public static final long UID = 1120986464257L;
        public AndroidProcessStartEvent(com.android.internal.FrameworksBaseTrackEventOuterClass p0) {}
    }

    public final class AndroidProcessStateChangedEvent {
        public static final long CPU_TIME_REASONS = 1120986464267L;
        public static final long CUR_CAPABILITY_FLAGS = 1120986464262L;
        public static final long CUR_OOM_SCORE = 1120986464264L;
        public static final long CUR_PROC_STATE = 1159641169924L;
        public static final long FREEZE_POLICY_FLAGS = 1120986464269L;
        public static final long IMPLICIT_CPU_TIME_REASONS = 1120986464268L;
        public static final long PID = 1120986464258L;
        public static final long PREV_CAPABILITY_FLAGS = 1120986464261L;
        public static final long PREV_OOM_SCORE = 1120986464263L;
        public static final long PREV_PROC_STATE = 1159641169923L;
        public static final long REASON = 1159641169929L;
        public static final long SEQ_ID = 1112396529674L;
        public static final long UID = 1120986464257L;
        public AndroidProcessStateChangedEvent(com.android.internal.FrameworksBaseTrackEventOuterClass p0) {}
    }

    public final class AndroidProviderStateChangedEvent {
        public static final long AUTHORITY = 1138166333443L;
        public static final long CALLER_PID = 1120986464261L;
        public static final long CALLER_UID = 1120986464260L;
        public static final long IS_STABLE = 1120986464262L;
        public static final long PID = 1120986464258L;
        public static final long UID = 1120986464257L;
        public AndroidProviderStateChangedEvent(com.android.internal.FrameworksBaseTrackEventOuterClass p0) {}
    }

    public final class AndroidServiceStateChangedEvent {
        public static final long BIND_ID = 1120986464261L;
        public static final long CALLER_PID = 1120986464264L;
        public static final long CALLER_UID = 1120986464263L;
        public static final long COMPONENT_NAME = 1138166333443L;
        public static final long FOREGROUND_SERVICE_TYPE = 1120986464262L;
        public static final long INTENT_ACTION = 1138166333444L;
        public static final long PID = 1120986464258L;
        public static final long REASON_ENUM = 1159641169929L;
        public static final long UID = 1120986464257L;
        public AndroidServiceStateChangedEvent(com.android.internal.FrameworksBaseTrackEventOuterClass p0) {}
    }

    public final class FrameworksBaseTrackEvent {
        public static final long BINDER_DIED_EVENT = 1146756270045L;
        public static final long BITMAP = 1146756270037L;
        public static final long BROADCAST_EVENT = 1146756270040L;
        public static final long FG_SERVICE_STATE_CHANGED_EVENT = 1146756270048L;
        public static final long FREEZER_EVENT = 1146756270041L;
        public static final long JOB_SCHEDULER_JOB = 1146756270038L;
        public static final long MESSAGE_QUEUE = 1146756270036L;
        public static final long PROCESS_DIED_EVENT = 1146756270043L;
        public static final long PROCESS_START_EVENT = 1146756270042L;
        public static final long PROCESS_STATE_CHANGED_EVENT = 1146756270044L;
        public static final long PROVIDER_STATE_CHANGED_EVENT = 1146756270047L;
        public static final long SERVICE_STATE_CHANGED_EVENT = 1146756270046L;
        public FrameworksBaseTrackEvent(com.android.internal.FrameworksBaseTrackEventOuterClass p0) {}
    }
}
