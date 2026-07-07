package com.android.server.wm.nano;

public interface WindowManagerProtos {

    public static final class LetterboxProto extends com.android.framework.protobuf.nano.MessageNano {
        public static final int LETTERBOX_HORIZONTAL_REACHABILITY_POSITION_CENTER = 1;
        public static final int LETTERBOX_HORIZONTAL_REACHABILITY_POSITION_LEFT = 0;
        public static final int LETTERBOX_HORIZONTAL_REACHABILITY_POSITION_RIGHT = 2;
        public static final int LETTERBOX_VERTICAL_REACHABILITY_POSITION_BOTTOM = 2;
        public static final int LETTERBOX_VERTICAL_REACHABILITY_POSITION_CENTER = 1;
        public static final int LETTERBOX_VERTICAL_REACHABILITY_POSITION_TOP = 0;
        private static volatile com.android.server.wm.nano.WindowManagerProtos.LetterboxProto[] _emptyArray;
        public int letterboxPositionForBookModeReachability;
        public int letterboxPositionForHorizontalReachability;
        public int letterboxPositionForTabletopModeReachability;
        public int letterboxPositionForVerticalReachability;
        public LetterboxProto() { super(); }
        public static com.android.server.wm.nano.WindowManagerProtos.LetterboxProto[] emptyArray() { return null; }
        public static com.android.server.wm.nano.WindowManagerProtos.LetterboxProto parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wm.nano.WindowManagerProtos.LetterboxProto parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.wm.nano.WindowManagerProtos.LetterboxProto clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wm.nano.WindowManagerProtos.LetterboxProto mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class TaskSnapshotProto extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wm.nano.WindowManagerProtos.TaskSnapshotProto[] _emptyArray;
        public int appearance;
        public int densityDpi;
        public long id;
        public int insetBottom;
        public int insetLeft;
        public int insetRight;
        public int insetTop;
        public boolean isRealSnapshot;
        public boolean isTranslucent;
        public float legacyScale;
        public int letterboxInsetBottom;
        public int letterboxInsetLeft;
        public int letterboxInsetRight;
        public int letterboxInsetTop;
        public int orientation;
        public int rotation;
        public int systemUiVisibility;
        public int taskHeight;
        public int taskWidth;
        public java.lang.String topActivityComponent;
        public int uiMode;
        public int windowingMode;
        public TaskSnapshotProto() { super(); }
        public static com.android.server.wm.nano.WindowManagerProtos.TaskSnapshotProto[] emptyArray() { return null; }
        public static com.android.server.wm.nano.WindowManagerProtos.TaskSnapshotProto parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wm.nano.WindowManagerProtos.TaskSnapshotProto parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.wm.nano.WindowManagerProtos.TaskSnapshotProto clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wm.nano.WindowManagerProtos.TaskSnapshotProto mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }
}
