package com.android.internal;

public final class FrameworksBaseTracePacketOuterClass {
    public FrameworksBaseTracePacketOuterClass() {}

    public final class VideoFrame {
        public static final long AU_DATA = 1151051235333L;
        public static final long CODEC = 1159641169923L;
        public static final long CODEC_CONFIG = 1151051235332L;
        public static final int CODEC_H264 = 1;
        public static final int CODEC_HEVC = 2;
        public static final long CODEC_STRING = 1138166333449L;
        public static final int CODEC_UNSPECIFIED = 0;
        public static final long DISPLAY_ID = 1155346202625L;
        public static final long DISPLAY_NAME = 1138166333448L;
        public static final long FRAME_NUMBER = 1116691496962L;
        public static final long IS_KEY_FRAME = 1133871366150L;
        public static final long PTS_US = 1116691496967L;
        public VideoFrame(com.android.internal.FrameworksBaseTracePacketOuterClass p0) {}
    }

    public final class AppWakelockBundle {
        public static final long ACQUIRED = 1133871366148L;
        public static final long ENCODED_TS = 5514738008066L;
        public static final long INFO = 1146756268035L;
        public static final long INTERN_ID = 5553392713729L;
        public AppWakelockBundle(com.android.internal.FrameworksBaseTracePacketOuterClass p0) {}
    }

    public final class VideoFrameError {
        public static final int CODEC_ERROR = 2;
        public static final int DISPLAY_GONE = 3;
        public static final long DISPLAY_ID = 1155346202625L;
        public static final int DISPLAY_NOT_FOUND = 5;
        public static final int ENCODER_SETUP_FAILED = 6;
        public static final int NO_ENCODER = 4;
        public static final long REASON = 1159641169922L;
        public static final int REASON_UNKNOWN = 0;
        public static final int SIZE_CAP_HIT = 1;
        public static final int VIRTUAL_DISPLAY_FAILED = 7;
        public VideoFrameError(com.android.internal.FrameworksBaseTracePacketOuterClass p0) {}
    }

    public final class AndroidProcessStateSnapshot {
        public static final long RECORD = 2246267895809L;
        public AndroidProcessStateSnapshot(com.android.internal.FrameworksBaseTracePacketOuterClass p0) {}

        public final class Record {
            public static final long CAPABILITY_FLAGS = 1120986464261L;
            public static final long OOM_SCORE = 1120986464260L;
            public static final long PID = 1120986464257L;
            public static final long PROC_STATE = 1120986464259L;
            public static final long UID = 1120986464258L;
            public Record(com.android.internal.FrameworksBaseTracePacketOuterClass.AndroidProcessStateSnapshot p0) {}
        }
    }

    public final class AndroidFreezerStateSnapshot {
        public static final long RECORD = 2246267895809L;
        public AndroidFreezerStateSnapshot(com.android.internal.FrameworksBaseTracePacketOuterClass p0) {}

        public final class Record {
            public static final long FROZEN_DUR_MS = 1112396529668L;
            public static final long PID = 1120986464258L;
            public static final long UID = 1120986464257L;
            public static final long UNFREEZE_REASON = 1159641169925L;
            public static final long UNFROZEN_DUR_MS = 1112396529667L;
            public Record(com.android.internal.FrameworksBaseTracePacketOuterClass.AndroidFreezerStateSnapshot p0) {}
        }
    }

    public final class FrameworksBaseTracePacket {
        public static final long ANDROID_FREEZER_STATE = 1146756269035L;
        public static final long ANDROID_PROCESS_STATE = 1146756269034L;
        public static final long APP_WAKELOCK_BUNDLE = 1146756268148L;
        public static final long VIDEO_FRAME = 1146756269032L;
        public static final long VIDEO_FRAME_ERROR = 1146756269033L;
        public FrameworksBaseTracePacket(com.android.internal.FrameworksBaseTracePacketOuterClass p0) {}
    }
}
