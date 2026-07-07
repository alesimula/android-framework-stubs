package com.android.internal.tracing.winscope.protos;

public final class AndroidInputEventOuterClass {
    public AndroidInputEventOuterClass() {}

    public final class AndroidInputEvent {
        public static final long DISPATCHER_KEY_EVENT = 1146756268035L;
        public static final long DISPATCHER_KEY_EVENT_REDACTED = 1146756268036L;
        public static final long DISPATCHER_MOTION_EVENT = 1146756268033L;
        public static final long DISPATCHER_MOTION_EVENT_REDACTED = 1146756268034L;
        public static final long DISPATCHER_WINDOW_DISPATCH_EVENT = 1146756268037L;
        public static final long DISPATCHER_WINDOW_DISPATCH_EVENT_REDACTED = 1146756268038L;
        public AndroidInputEvent(com.android.internal.tracing.winscope.protos.AndroidInputEventOuterClass p0) {}
    }

    public final class AndroidKeyEvent {
        public static final long ACTION = 1120986464261L;
        public static final long DEVICE_ID = 1120986464262L;
        public static final long DISPLAY_ID = 1172526071815L;
        public static final long DOWN_TIME_NANOS = 1112396529667L;
        public static final long EVENT_ID = 1129576398849L;
        public static final long EVENT_TIME_NANOS = 1112396529666L;
        public static final long FLAGS = 1155346202636L;
        public static final long KEY_CODE = 1120986464264L;
        public static final long META_STATE = 1155346202634L;
        public static final long POLICY_FLAGS = 1155346202637L;
        public static final long REPEAT_COUNT = 1120986464267L;
        public static final long SCAN_CODE = 1155346202633L;
        public static final long SOURCE = 1155346202628L;
        public AndroidKeyEvent(com.android.internal.tracing.winscope.protos.AndroidInputEventOuterClass p0) {}
    }

    public final class AndroidMotionEvent {
        public static final long ACTION = 1120986464260L;
        public static final long ACTION_BUTTON = 1120986464276L;
        public static final long BUTTON_STATE = 1155346202645L;
        public static final long CLASSIFICATION = 1120986464263L;
        public static final long CURSOR_POSITION_X = 1108101562386L;
        public static final long CURSOR_POSITION_Y = 1108101562387L;
        public static final long DEVICE_ID = 1120986464261L;
        public static final long DISPLAY_ID = 1172526071814L;
        public static final long DOWN_TIME_NANOS = 1112396529681L;
        public static final long EVENT_ID = 1129576398849L;
        public static final long EVENT_TIME_NANOS = 1112396529666L;
        public static final long FLAGS = 1155346202632L;
        public static final long META_STATE = 1155346202646L;
        public static final long ORIGINAL_EVENT_ID = 5527622909968L;
        public static final long POINTER = 2246267895817L;
        public static final long POLICY_FLAGS = 1155346202647L;
        public static final long PRECISION_X = 1108101562392L;
        public static final long PRECISION_Y = 1108101562393L;
        public static final long SOURCE = 1155346202627L;
        public AndroidMotionEvent(com.android.internal.tracing.winscope.protos.AndroidInputEventOuterClass p0) {}

        public final class Pointer {
            public static final long AXIS_VALUE = 2246267895809L;
            public static final long POINTER_ID = 1120986464258L;
            public static final long TOOL_TYPE = 1120986464259L;
            public Pointer(com.android.internal.tracing.winscope.protos.AndroidInputEventOuterClass.AndroidMotionEvent p0) {}

            public final class AxisValue {
                public static final long AXIS = 1120986464257L;
                public static final long VALUE = 1108101562370L;
                public AxisValue(com.android.internal.tracing.winscope.protos.AndroidInputEventOuterClass.AndroidMotionEvent.Pointer p0) {}
            }
        }
    }

    public final class AndroidWindowInputDispatchEvent {
        public static final long DISPATCHED_POINTER = 2246267895812L;
        public static final long EVENT_ID = 1129576398849L;
        public static final long RESOLVED_FLAGS = 1155346202629L;
        public static final long VSYNC_ID = 1112396529666L;
        public static final long WINDOW_ID = 1120986464259L;
        public AndroidWindowInputDispatchEvent(com.android.internal.tracing.winscope.protos.AndroidInputEventOuterClass p0) {}

        public final class DispatchedPointer {
            public static final long AXIS_VALUE_IN_WINDOW = 2246267895812L;
            public static final long POINTER_ID = 1120986464257L;
            public static final long X_IN_DISPLAY = 1108101562370L;
            public static final long Y_IN_DISPLAY = 1108101562371L;
            public DispatchedPointer(com.android.internal.tracing.winscope.protos.AndroidInputEventOuterClass.AndroidWindowInputDispatchEvent p0) {}
        }
    }
}
