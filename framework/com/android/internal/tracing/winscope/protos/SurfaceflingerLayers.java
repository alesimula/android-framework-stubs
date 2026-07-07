package com.android.internal.tracing.winscope.protos;

public final class SurfaceflingerLayers {
    public static final int HWC_TYPE_CLIENT = 1;
    public static final int HWC_TYPE_CURSOR = 4;
    public static final int HWC_TYPE_DEVICE = 2;
    public static final int HWC_TYPE_DISPLAY_DECORATION = 6;
    public static final int HWC_TYPE_SIDEBAND = 5;
    public static final int HWC_TYPE_SOLID_COLOR = 3;
    public static final int HWC_TYPE_UNSPECIFIED = 0;
    public SurfaceflingerLayers() {}

    public final class ActiveBufferProto {
        public static final long FORMAT = 1120986464260L;
        public static final long HEIGHT = 1155346202626L;
        public static final long STRIDE = 1155346202627L;
        public static final long USAGE = 1116691496965L;
        public static final long WIDTH = 1155346202625L;
        public ActiveBufferProto(com.android.internal.tracing.winscope.protos.SurfaceflingerLayers p0) {}
    }

    public final class BarrierLayerProto {
        public static final long FRAME_NUMBER = 1116691496962L;
        public static final long ID = 1120986464257L;
        public BarrierLayerProto(com.android.internal.tracing.winscope.protos.SurfaceflingerLayers p0) {}
    }

    public final class DisplayProto {
        public static final long DPI_X = 1103806595080L;
        public static final long DPI_Y = 1103806595081L;
        public static final long ID = 1116691496961L;
        public static final long IS_VIRTUAL = 1133871366151L;
        public static final long LAYER_STACK = 1155346202627L;
        public static final long LAYER_STACK_SPACE_RECT = 1146756268037L;
        public static final long NAME = 1138166333442L;
        public static final long SIZE = 1146756268036L;
        public static final long TRANSFORM = 1146756268038L;
        public DisplayProto(com.android.internal.tracing.winscope.protos.SurfaceflingerLayers p0) {}
    }

    public final class FloatRectProto {
        public static final long BOTTOM = 1108101562372L;
        public static final long LEFT = 1108101562369L;
        public static final long RIGHT = 1108101562371L;
        public static final long TOP = 1108101562370L;
        public FloatRectProto(com.android.internal.tracing.winscope.protos.SurfaceflingerLayers p0) {}
    }

    public final class LayerProto {
        public static final long ACTIVE_BUFFER = 1146756268059L;
        public static final long APP_ID = 1120986464290L;
        public static final long BACKGROUND_BLUR_RADIUS = 1120986464308L;
        public static final long BACKGROUND_BLUR_SCALE = 1108101562428L;
        public static final long BARRIER_LAYER = 2246267895846L;
        public static final long BLUR_REGIONS = 2246267895862L;
        public static final long BORDER_SETTINGS = 1146756268098L;
        public static final long BOUNDS = 1146756268077L;
        public static final long BOX_SHADOW_SETTINGS = 1146756268097L;
        public static final long BUFFER_TRANSFORM = 1146756268071L;
        public static final long CHILDREN = 5519032975363L;
        public static final long CLIENT_DRAWN_CORNER_RADII = 1146756268095L;
        public static final long COLOR = 1146756268052L;
        public static final long COLOR_TRANSFORM = 1146756268082L;
        public static final long CORNER_RADII = 1146756268093L;
        public static final long CORNER_RADIUS = 1108101562409L;
        public static final long CORNER_RADIUS_CROP = 1146756268080L;
        public static final long CROP = 1146756268046L;
        public static final long CURR_FRAME = 1116691496997L;
        public static final long DAMAGE_REGION = 1146756268040L;
        public static final long DATASPACE = 1138166333458L;
        public static final long DESTINATION_FRAME = 1146756268089L;
        public static final long DISABLE_CLIENT_DRAWN_RADII = 1133871366213L;
        public static final long EFFECTIVE_RADII = 1146756268099L;
        public static final long EFFECTIVE_SCALING_MODE = 1120986464296L;
        public static final long EFFECTIVE_TRANSFORM = 1146756268075L;
        public static final long FINAL_CROP = 1146756268047L;
        public static final long FLAGS = 1155346202646L;
        public static final long HWC_COMPOSITION_TYPE = 1159641169955L;
        public static final long HWC_CROP = 1146756268063L;
        public static final long HWC_FRAME = 1146756268062L;
        public static final long HWC_TRANSFORM = 1120986464288L;
        public static final long ID = 1120986464257L;
        public static final long INPUT_WINDOW_INFO = 1146756268079L;
        public static final long INVALIDATE = 1133871366161L;
        public static final long IS_OPAQUE = 1133871366160L;
        public static final long IS_PROTECTED = 1133871366180L;
        public static final long IS_RELATIVE_OF = 1133871366195L;
        public static final long IS_TRUSTED_OVERLAY = 1133871366199L;
        public static final long LAYER_STACK = 1155346202633L;
        public static final long METADATA = 2246267895850L;
        public static final long NAME = 1138166333442L;
        public static final long ORIGINAL_ID = 1155346202682L;
        public static final long OWNER_UID = 1155346202677L;
        public static final long PARENT = 1120986464281L;
        public static final long PIXEL_FORMAT = 1138166333459L;
        public static final long POSITION = 1146756268043L;
        public static final long QUEUED_FRAMES = 1120986464284L;
        public static final long REFRESH_PENDING = 1133871366173L;
        public static final long RELATIVES = 5519032975364L;
        public static final long REPORTED_RADII = 1146756268100L;
        public static final long REQUESTED_COLOR = 1146756268053L;
        public static final long REQUESTED_CORNER_RADII = 1146756268094L;
        public static final long REQUESTED_CORNER_RADIUS = 1108101562424L;
        public static final long REQUESTED_POSITION = 1146756268044L;
        public static final long REQUESTED_TRANSFORM = 1146756268056L;
        public static final long SCREEN_BOUNDS = 1146756268078L;
        public static final long SHADOW_RADIUS = 1108101562417L;
        public static final long SIZE = 1146756268045L;
        public static final long SOURCE_BOUNDS = 1146756268076L;
        public static final long SYSTEM_CONTENT_PRIORITY = 1120986464320L;
        public static final long TRANSFORM = 1146756268055L;
        public static final long TRANSPARENT_REGION = 1146756268038L;
        public static final long TRUSTED_OVERLAY = 1159641169979L;
        public static final long TYPE = 1138166333445L;
        public static final long VISIBLE_REGION = 1146756268039L;
        public static final long WINDOW_TYPE = 1120986464289L;
        public static final long Z = 1120986464266L;
        public static final long Z_ORDER_RELATIVE_OF = 1120986464282L;
        public LayerProto(com.android.internal.tracing.winscope.protos.SurfaceflingerLayers p0) {}

        public final class MetadataEntry {
            public static final long KEY = 1120986464257L;
            public static final long VALUE = 1151051235330L;
            public MetadataEntry(com.android.internal.tracing.winscope.protos.SurfaceflingerLayers.LayerProto p0) {}
        }
    }

    public final class LayersPatchProto {
        public static final long DELETED_DISPLAY_IDS = 2216203124740L;
        public static final long DELETED_LAYER_IDS = 2220498092035L;
        public static final long DISPLAYS = 2246267895810L;
        public static final long ELAPSED_REALTIME_NANOS = 1168231104517L;
        public static final long EXCLUDES_COMPOSITION_STATE = 1133871366152L;
        public static final long HWC_BLOB = 1138166333447L;
        public static final long LAYERS = 2246267895809L;
        public static final long MISSED_ENTRIES = 1155346202633L;
        public static final long VSYNC_ID = 1112396529674L;
        public static final long WHERE = 1138166333446L;
        public LayersPatchProto(com.android.internal.tracing.winscope.protos.SurfaceflingerLayers p0) {}
    }

    public final class LayersProto {
        public static final long LAYERS = 2246267895809L;
        public LayersProto(com.android.internal.tracing.winscope.protos.SurfaceflingerLayers p0) {}
    }

    public final class LayersSnapshotProto {
        public static final long DISPLAYS = 2246267895815L;
        public static final long ELAPSED_REALTIME_NANOS = 1168231104513L;
        public static final long EXCLUDES_COMPOSITION_STATE = 1133871366149L;
        public static final long HWC_BLOB = 1138166333444L;
        public static final long LAYERS = 1146756268035L;
        public static final long MISSED_ENTRIES = 1155346202630L;
        public static final long VSYNC_ID = 1112396529672L;
        public static final long WHERE = 1138166333442L;
        public LayersSnapshotProto(com.android.internal.tracing.winscope.protos.SurfaceflingerLayers p0) {}
    }

    public final class LayersTraceFileProto {
        public static final long ENTRY = 2246267895810L;
        public static final int INVALID = 0;
        public static final long MAGIC_NUMBER = 1125281431553L;
        public static final int MAGIC_NUMBER_H = 1162035538;
        public static final int MAGIC_NUMBER_L = 1414682956;
        public static final long REAL_TO_ELAPSED_TIME_OFFSET_NANOS = 1125281431555L;
        public LayersTraceFileProto(com.android.internal.tracing.winscope.protos.SurfaceflingerLayers p0) {}
    }

    public final class PositionProto {
        public static final long X = 1108101562369L;
        public static final long Y = 1108101562370L;
        public PositionProto(com.android.internal.tracing.winscope.protos.SurfaceflingerLayers p0) {}
    }
}
