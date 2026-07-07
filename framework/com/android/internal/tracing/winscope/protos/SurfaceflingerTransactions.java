package com.android.internal.tracing.winscope.protos;

public final class SurfaceflingerTransactions {
    public SurfaceflingerTransactions() {}

    public final class DisplayInfo {
        public static final long DISPLAY_ID = 1120986464258L;
        public static final long IS_PRIMARY = 1133871366153L;
        public static final long IS_SECURE = 1133871366152L;
        public static final long IS_VIRTUAL = 1133871366154L;
        public static final long LAYER_STACK = 1155346202625L;
        public static final long LOGICAL_HEIGHT = 1120986464260L;
        public static final long LOGICAL_WIDTH = 1120986464259L;
        public static final long RECEIVES_INPUT = 1133871366151L;
        public static final long ROTATION_FLAGS = 1120986464267L;
        public static final long TRANSFORM = 1146756268038L;
        public static final long TRANSFORM_HINT = 1120986464268L;
        public static final long TRANSFORM_INVERSE = 1146756268037L;
        public DisplayInfo(com.android.internal.tracing.winscope.protos.SurfaceflingerTransactions p0) {}
    }

    public final class DisplayState {
        public static final int E_CHANGES_NONE = 0;
        public static final int E_DISPLAY_PROJECTION_CHANGED = 4;
        public static final int E_DISPLAY_SIZE_CHANGED = 8;
        public static final int E_FLAGS_CHANGED = 16;
        public static final int E_LAYER_STACK_CHANGED = 2;
        public static final int E_SURFACE_CHANGED = 1;
        public static final long FLAGS = 1155346202627L;
        public static final long HEIGHT = 1155346202633L;
        public static final long ID = 1120986464257L;
        public static final long LAYER_STACK = 1155346202628L;
        public static final long LAYER_STACK_SPACE_RECT = 1146756268038L;
        public static final long ORIENTATION = 1155346202629L;
        public static final long ORIENTED_DISPLAY_SPACE_RECT = 1146756268039L;
        public static final long WHAT = 1155346202626L;
        public static final long WIDTH = 1155346202632L;
        public DisplayState(com.android.internal.tracing.winscope.protos.SurfaceflingerTransactions p0) {}
    }

    public final class LayerCreationArgs {
        public static final long ADD_TO_ROOT = 1133871366150L;
        public static final long FLAGS = 1155346202627L;
        public static final long LAYER_ID = 1155346202625L;
        public static final long LAYER_STACK_TO_MIRROR = 1155346202631L;
        public static final long MIRROR_FROM_ID = 1155346202629L;
        public static final long NAME = 1138166333442L;
        public static final long PARENT_ID = 1155346202628L;
        public LayerCreationArgs(com.android.internal.tracing.winscope.protos.SurfaceflingerTransactions p0) {}
    }

    public final class LayerState {
        public static final int ALL = 1;
        public static final long ALPHA = 1108101562384L;
        public static final long API = 1120986464279L;
        public static final long AUTO_REFRESH = 1133871366182L;
        public static final long BACKGROUND_BLUR_RADIUS = 1155346202637L;
        public static final long BACKGROUND_BLUR_SCALE = 1108101562412L;
        public static final long BG_COLOR_ALPHA = 1108101562396L;
        public static final long BG_COLOR_DATASPACE = 1120986464285L;
        public static final long BLUR_REGIONS = 2246267895834L;
        public static final long BORDER_SETTINGS = 1146756268081L;
        public static final long BOX_SHADOW_SETTINGS = 1146756268080L;
        public static final long BUFFER_CROP = 1146756268072L;
        public static final long BUFFER_DATA = 1146756268054L;
        public static final long CHANGE_FRAME_RATE_STRATEGY = 1120986464291L;
        public static final long CLIENT_DRAWN_CORNER_RADII = 1146756268078L;
        public static final long COLOR = 1146756268049L;
        public static final long COLOR_SPACE_AGNOSTIC = 1133871366174L;
        public static final long COLOR_TRANSFORM = 1146756268057L;
        public static final long CORNER_RADII = 1146756268077L;
        public static final long CORNER_RADIUS = 1108101562380L;
        public static final long CROP = 1146756268053L;
        public static final long DESTINATION_FRAME = 1146756268073L;
        public static final long DROP_INPUT_MODE = 1159641169962L;
        public static final int E_ACQUIRE_FENCE_CHANGED = 4194304;
        public static final int E_ALPHA_CHANGED = 8;
        public static final int E_API_CHANGED = 67108864;
        public static final int E_AUTO_REFRESH_CHANGED = 4096;
        public static final int E_BACKGROUND_BLUR_RADIUS_CHANGED = 128;
        public static final int E_BACKGROUND_COLOR_CHANGED = 4;
        public static final int E_BLUR_REGIONS_CHANGED = 2048;
        public static final int E_BORDER_SETTINGS_CHANGED = 524288;
        public static final int E_BOX_SHADOW_SETTINGS_CHANGED = 262144;
        public static final int E_BUFFER_CHANGED = 2097152;
        public static final int E_BUFFER_CROP_CHANGED = 8192;
        public static final int E_BUFFER_TRANSFORM_CHANGED = 262144;
        public static final int E_CACHED_BUFFER_CHANGED = 2;
        public static final int E_CHANGES_LSB_NONE = 0;
        public static final int E_CHANGES_MSB_NONE = 0;
        public static final int E_CLIENT_DRAWN_CORNER_RADIUS_CHANGED = 65536;
        public static final int E_COLOR_CHANGED = 65536;
        public static final int E_COLOR_SPACE_AGNOSTIC_CHANGED = 16;
        public static final int E_COLOR_TRANSFORM_CHANGED = 268435456;
        public static final int E_CORNER_RADIUS_CHANGED = -2147483648;
        public static final int E_CROP_CHANGED = 1048576;
        public static final int E_DATASPACE_CHANGED = 8388608;
        public static final int E_DESTINATION_FRAME_CHANGED = 1;
        public static final int E_DROP_INPUT_MODE_CHANGED = 32768;
        public static final int E_ENABLE_BACKPRESSURE = 256;
        public static final int E_FIXED_TRANSFORM_HINT_CHANGED = 512;
        public static final int E_FLAGS_CHANGED = 64;
        public static final int E_FLAGS_NONE = 0;
        public static final int E_FRAME_NUMBER_CHANGED = 1024;
        public static final int E_FRAME_RATE_CHANGED = 64;
        public static final int E_FRAME_RATE_SELECTION_PRIORITY = 32;
        public static final int E_HAS_LISTENER_CALLBACKS_CHANGED = 536870912;
        public static final int E_HDR_METADATA_CHANGED = 16777216;
        public static final int E_INPUT_INFO_CHANGED = 1073741824;
        public static final int E_LAYER_CHANGED = 2;
        public static final int E_LAYER_HIDDEN = 1;
        public static final int E_LAYER_IS_DISPLAY_DECORATION = 512;
        public static final int E_LAYER_OPAQUE = 2;
        public static final int E_LAYER_SECURE = 128;
        public static final int E_LAYER_SKIP_SCREENSHOT = 64;
        public static final int E_LAYER_STACK_CHANGED = 128;
        public static final int E_MATRIX_CHANGED = 16;
        public static final int E_METADATA_CHANGED = 8;
        public static final int E_POSITION_CHANGED = 1;
        public static final int E_PRODUCER_DISCONNECT = 256;
        public static final int E_RELATIVE_LAYER_CHANGED = 16384;
        public static final int E_RELEASE_BUFFER_LISTENER_CHANGED = 1024;
        public static final int E_REPARENT = 32768;
        public static final int E_SHADOW_RADIUS_CHANGED = 2048;
        public static final int E_SIDEBAND_STREAM_CHANGED = 134217728;
        public static final int E_STRETCH_CHANGED = 8192;
        public static final int E_SURFACE_DAMAGE_REGION_CHANGED = 33554432;
        public static final int E_SYSTEM_CONTENT_PRIORITY_CHANGED = 131072;
        public static final int E_TRANSFORM_TO_DISPLAY_INVERSE_CHANGED = 524288;
        public static final int E_TRANSPARENT_REGION_CHANGED = 32;
        public static final int E_TRUSTED_OVERLAY_CHANGED = 16384;
        public static final long FIXED_TRANSFORM_HINT = 1155346202660L;
        public static final long FLAGS = 1155346202633L;
        public static final long FRAME_NUMBER = 1116691496997L;
        public static final long FRAME_RATE = 1108101562401L;
        public static final long FRAME_RATE_COMPATIBILITY = 1120986464290L;
        public static final long FRAME_RATE_SELECTION_PRIORITY = 1120986464288L;
        public static final long H = 1155346202631L;
        public static final long HAS_SIDEBAND_STREAM = 1133871366168L;
        public static final long IS_TRUSTED_OVERLAY = 1133871366183L;
        public static final long LAYER_ID = 1155346202625L;
        public static final long LAYER_STACK = 1155346202632L;
        public static final long MASK = 1155346202634L;
        public static final long MATRIX = 1146756268043L;
        public static final int NONE = 0;
        public static final int OBSCURED = 2;
        public static final long PARENT_ID = 1155346202638L;
        public static final long RELATIVE_PARENT_ID = 1155346202639L;
        public static final long SHADOW_RADIUS = 1108101562399L;
        public static final long SYSTEM_CONTENT_PRIORITY = 1120986464303L;
        public static final long TRANSFORM = 1155346202643L;
        public static final long TRANSFORM_TO_DISPLAY_INVERSE = 1133871366164L;
        public static final long TRANSPARENT_REGION = 1146756268050L;
        public static final long TRUSTED_OVERLAY = 1159641169963L;
        public static final long W = 1155346202630L;
        public static final long WHAT = 1116691496962L;
        public static final long WINDOW_INFO_HANDLE = 1146756268059L;
        public static final long X = 1108101562371L;
        public static final long Y = 1108101562372L;
        public static final long Z = 1120986464261L;
        public LayerState(com.android.internal.tracing.winscope.protos.SurfaceflingerTransactions p0) {}

        public final class BufferData {
            public static final int BUFFER_DATA_CHANGE_NONE = 0;
            public static final long BUFFER_ID = 1116691496961L;
            public static final int CACHED_BUFFER_CHANGED = 4;
            public static final long CACHED_BUFFER_ID = 1116691496966L;
            public static final int FENCE_CHANGED = 1;
            public static final long FLAGS = 1155346202629L;
            public static final long FRAME_NUMBER = 1116691496964L;
            public static final int FRAME_NUMBER_CHANGED = 2;
            public static final long HEIGHT = 1155346202627L;
            public static final long PIXEL_FORMAT = 1159641169927L;
            public static final int PIXEL_FORMAT_BGRA_8888 = 5;
            public static final int PIXEL_FORMAT_CUSTOM = -4;
            public static final int PIXEL_FORMAT_OPAQUE = -1;
            public static final int PIXEL_FORMAT_RGBA_1010102 = 43;
            public static final int PIXEL_FORMAT_RGBA_4444 = 7;
            public static final int PIXEL_FORMAT_RGBA_5551 = 6;
            public static final int PIXEL_FORMAT_RGBA_8888 = 1;
            public static final int PIXEL_FORMAT_RGBA_FP16 = 22;
            public static final int PIXEL_FORMAT_RGBX_8888 = 2;
            public static final int PIXEL_FORMAT_RGB_565 = 4;
            public static final int PIXEL_FORMAT_RGB_888 = 3;
            public static final int PIXEL_FORMAT_R_8 = 56;
            public static final int PIXEL_FORMAT_TRANSLUCENT = -3;
            public static final int PIXEL_FORMAT_TRANSPARENT = -2;
            public static final int PIXEL_FORMAT_UNKNOWN = 0;
            public static final long USAGE = 1116691496968L;
            public static final long WIDTH = 1155346202626L;
            public BufferData(com.android.internal.tracing.winscope.protos.SurfaceflingerTransactions.LayerState p0) {}
        }

        public final class Color3 {
            public static final long B = 1108101562371L;
            public static final long G = 1108101562370L;
            public static final long R = 1108101562369L;
            public Color3(com.android.internal.tracing.winscope.protos.SurfaceflingerTransactions.LayerState p0) {}
        }

        public final class CornerRadii {
            public static final long BL = 1108101562371L;
            public static final long BR = 1108101562372L;
            public static final long TL = 1108101562369L;
            public static final long TR = 1108101562370L;
            public CornerRadii(com.android.internal.tracing.winscope.protos.SurfaceflingerTransactions.LayerState p0) {}
        }

        public final class Matrix22 {
            public static final long DSDX = 1108101562369L;
            public static final long DSDY = 1108101562372L;
            public static final long DTDX = 1108101562370L;
            public static final long DTDY = 1108101562371L;
            public Matrix22(com.android.internal.tracing.winscope.protos.SurfaceflingerTransactions.LayerState p0) {}
        }

        public final class WindowInfo {
            public static final long CROP_LAYER_ID = 1155346202632L;
            public static final long FOCUSABLE = 1133871366149L;
            public static final long GLOBAL_SCALE_FACTOR = 1108101562375L;
            public static final long HAS_WALLPAPER = 1133871366150L;
            public static final long INPUT_CONFIG = 1155346202636L;
            public static final long LAYOUT_PARAMS_FLAGS = 1155346202625L;
            public static final long LAYOUT_PARAMS_TYPE = 1120986464258L;
            public static final long REPLACE_TOUCHABLE_REGION_WITH_CROP = 1133871366153L;
            public static final long SURFACE_INSET = 1120986464260L;
            public static final long TOUCHABLE_REGION = 1146756268035L;
            public static final long TOUCHABLE_REGION_CROP = 1146756268042L;
            public static final long TRANSFORM = 1146756268043L;
            public WindowInfo(com.android.internal.tracing.winscope.protos.SurfaceflingerTransactions.LayerState p0) {}
        }
    }

    public final class TransactionBarrier {
        public static final long BARRIER_TOKEN = 1138166333441L;
        public static final long KIND = 1155346202626L;
        public TransactionBarrier(com.android.internal.tracing.winscope.protos.SurfaceflingerTransactions p0) {}
    }

    public final class TransactionState {
        public static final long APPLY_TOKEN = 1116691496970L;
        public static final long DISPLAY_CHANGES = 2246267895816L;
        public static final long INPUT_EVENT_ID = 1120986464260L;
        public static final long LAYER_CHANGES = 2246267895815L;
        public static final long MERGED_TRANSACTION_IDS = 2216203124745L;
        public static final long PID = 1120986464257L;
        public static final long POST_TIME = 1112396529669L;
        public static final long TRANSACTION_BARRIERS = 2246267895819L;
        public static final long TRANSACTION_ID = 1116691496966L;
        public static final long UID = 1120986464258L;
        public static final long VSYNC_ID = 1112396529667L;
        public TransactionState(com.android.internal.tracing.winscope.protos.SurfaceflingerTransactions p0) {}
    }

    public final class TransactionTraceEntry {
        public static final long ADDED_DISPLAYS = 2246267895814L;
        public static final long ADDED_LAYERS = 2246267895812L;
        public static final long DESTROYED_LAYERS = 2254857830405L;
        public static final long DESTROYED_LAYER_HANDLES = 2254857830408L;
        public static final long DISPLAYS = 2246267895818L;
        public static final long DISPLAYS_CHANGED = 1133871366153L;
        public static final long ELAPSED_REALTIME_NANOS = 1112396529665L;
        public static final long REMOVED_DISPLAYS = 2220498092039L;
        public static final long TRANSACTIONS = 2246267895811L;
        public static final long VSYNC_ID = 1112396529666L;
        public TransactionTraceEntry(com.android.internal.tracing.winscope.protos.SurfaceflingerTransactions p0) {}
    }

    public final class TransactionTraceFile {
        public static final long ENTRY = 2246267895810L;
        public static final int INVALID = 0;
        public static final long MAGIC_NUMBER = 1125281431553L;
        public static final int MAGIC_NUMBER_H = 1162035538;
        public static final int MAGIC_NUMBER_L = 1415073364;
        public static final long REAL_TO_ELAPSED_TIME_OFFSET_NANOS = 1125281431555L;
        public static final long VERSION = 1155346202628L;
        public TransactionTraceFile(com.android.internal.tracing.winscope.protos.SurfaceflingerTransactions p0) {}
    }

    public final class Transform {
        public static final long DSDX = 1108101562369L;
        public static final long DSDY = 1108101562372L;
        public static final long DTDX = 1108101562370L;
        public static final long DTDY = 1108101562371L;
        public static final long TX = 1108101562373L;
        public static final long TY = 1108101562374L;
        public Transform(com.android.internal.tracing.winscope.protos.SurfaceflingerTransactions p0) {}
    }
}
