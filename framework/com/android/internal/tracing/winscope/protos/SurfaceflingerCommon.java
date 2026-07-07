package com.android.internal.tracing.winscope.protos;

public final class SurfaceflingerCommon {
    public static final int DISABLED = 1;
    public static final int ENABLED = 2;
    public static final int UNSET = 0;
    public SurfaceflingerCommon() {}

    public final class BlurRegion {
        public static final long ALPHA = 1108101562374L;
        public static final long BLUR_RADIUS = 1155346202625L;
        public static final long BOTTOM = 1120986464266L;
        public static final long CORNER_RADIUS_BL = 1155346202628L;
        public static final long CORNER_RADIUS_BLX = 1108101562383L;
        public static final long CORNER_RADIUS_BLY = 1108101562384L;
        public static final long CORNER_RADIUS_BR = 1108101562373L;
        public static final long CORNER_RADIUS_BRX = 1108101562385L;
        public static final long CORNER_RADIUS_BRY = 1108101562386L;
        public static final long CORNER_RADIUS_TL = 1155346202626L;
        public static final long CORNER_RADIUS_TLX = 1108101562379L;
        public static final long CORNER_RADIUS_TLY = 1108101562380L;
        public static final long CORNER_RADIUS_TR = 1155346202627L;
        public static final long CORNER_RADIUS_TRX = 1108101562381L;
        public static final long CORNER_RADIUS_TRY = 1108101562382L;
        public static final long LEFT = 1120986464263L;
        public static final long RIGHT = 1120986464265L;
        public static final long TOP = 1120986464264L;
        public BlurRegion(com.android.internal.tracing.winscope.protos.SurfaceflingerCommon p0) {}
    }

    public final class BorderSettings {
        public static final long COLOR = 1120986464258L;
        public static final long STROKE_WIDTH = 1108101562369L;
        public BorderSettings(com.android.internal.tracing.winscope.protos.SurfaceflingerCommon p0) {}
    }

    public final class BoxShadowSettings {
        public static final long BOX_SHADOWS = 2246267895809L;
        public BoxShadowSettings(com.android.internal.tracing.winscope.protos.SurfaceflingerCommon p0) {}

        public final class BoxShadowParams {
            public static final long BLUR_RADIUS = 1108101562369L;
            public static final long COLOR = 1120986464259L;
            public static final long OFFSET_X = 1108101562372L;
            public static final long OFFSET_Y = 1108101562373L;
            public static final long SPREAD_RADIUS = 1108101562370L;
            public BoxShadowParams(com.android.internal.tracing.winscope.protos.SurfaceflingerCommon.BoxShadowSettings p0) {}
        }
    }

    public final class ColorProto {
        public static final long A = 1108101562372L;
        public static final long B = 1108101562371L;
        public static final long G = 1108101562370L;
        public static final long R = 1108101562369L;
        public ColorProto(com.android.internal.tracing.winscope.protos.SurfaceflingerCommon p0) {}
    }

    public final class ColorTransformProto {
        public static final long VAL = 5506148073473L;
        public ColorTransformProto(com.android.internal.tracing.winscope.protos.SurfaceflingerCommon p0) {}
    }

    public final class InputWindowInfoProto {
        public static final long CAN_RECEIVE_KEYS = 1133871366151L;
        public static final long CROP_LAYER_ID = 1120986464269L;
        public static final long FOCUSABLE = 1133871366152L;
        public static final long FRAME = 1146756268035L;
        public static final long GLOBAL_SCALE_FACTOR = 1108101562378L;
        public static final long HAS_WALLPAPER = 1133871366153L;
        public static final long INPUT_CONFIG = 1155346202641L;
        public static final long LAYOUT_PARAMS_FLAGS = 1155346202625L;
        public static final long LAYOUT_PARAMS_TYPE = 1120986464258L;
        public static final long REPLACE_TOUCHABLE_REGION_WITH_CROP = 1133871366158L;
        public static final long SURFACE_INSET = 1120986464261L;
        public static final long TOUCHABLE_REGION = 1146756268036L;
        public static final long TOUCHABLE_REGION_CROP = 1146756268047L;
        public static final long TRANSFORM = 1146756268048L;
        public static final long VISIBLE = 1133871366150L;
        public static final long WINDOW_X_SCALE = 1108101562379L;
        public static final long WINDOW_Y_SCALE = 1108101562380L;
        public InputWindowInfoProto(com.android.internal.tracing.winscope.protos.SurfaceflingerCommon p0) {}
    }

    public final class RegionProto {
        public static final long RECT = 2246267895810L;
        public RegionProto(com.android.internal.tracing.winscope.protos.SurfaceflingerCommon p0) {}
    }

    public final class SizeProto {
        public static final long H = 1120986464258L;
        public static final long W = 1120986464257L;
        public SizeProto(com.android.internal.tracing.winscope.protos.SurfaceflingerCommon p0) {}
    }

    public final class TransformProto {
        public static final long DSDX = 1108101562369L;
        public static final long DSDY = 1108101562371L;
        public static final long DTDX = 1108101562370L;
        public static final long DTDY = 1108101562372L;
        public static final long TYPE = 1120986464261L;
        public TransformProto(com.android.internal.tracing.winscope.protos.SurfaceflingerCommon p0) {}
    }
}
