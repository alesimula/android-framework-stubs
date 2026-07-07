package com.android.internal.dev.perfetto.sdk;

final class PerfettoTrackEventExtra {
    private final long mPtr = 0L;
    PerfettoTrackEventExtra(com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner p0) {}
    private static native void native_add_arg(long p0, long p1);
    private static native void native_clear_args(long p0);
    private static native long native_delete();
    public static native void native_emit(int p0, long p1, java.lang.String p2, long p3);
    private static native long native_init();
    public void addPerfettoPointer(com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer p0) {}
    public long getPtr() { return 0L; }
    public void reset() {}

    static final class Arg implements com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer {
        private final long mExtraPtr = 0L;
        private final java.lang.String mName = null;
        private final long mPtr = 0L;
        Arg(java.lang.String p0, com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner p1) {}
        private static native long native_delete();
        private static native long native_get_extra_ptr(long p0);
        private static native long native_init(java.lang.String p0);
        private static native void native_set_value_bool(long p0, boolean p1);
        private static native void native_set_value_double(long p0, double p1);
        private static native void native_set_value_int64(long p0, long p1);
        private static native void native_set_value_string(long p0, java.lang.String p1);
        public java.lang.String getName() { return null; }
        public long getPtr() { return 0L; }
        public void setValueBool(boolean p0) {}
        public void setValueDouble(double p0) {}
        public void setValueInt64(long p0) {}
        public void setValueString(java.lang.String p0) {}
    }

    static final class Counter implements com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer {
        private final long mExtraPtr = 0L;
        private final long mPtr = 0L;
        Counter(com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner p0) {}
        private static native long native_delete();
        private static native long native_get_extra_ptr(long p0);
        private static native long native_init();
        private static native void native_set_value_double(long p0, double p1);
        private static native void native_set_value_int64(long p0, long p1);
        public long getPtr() { return 0L; }
        public void setValueDouble(double p0) {}
        public void setValueInt64(long p0) {}
    }

    static final class CounterTrack implements com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer {
        private final long mExtraPtr = 0L;
        private final boolean mIsNameStatic = false;
        private final java.lang.String mName = null;
        private final long mPtr = 0L;
        CounterTrack(java.lang.String p0, long p1, boolean p2, com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner p3) {}
        private static native long native_delete();
        private static native long native_get_extra_ptr(long p0);
        private static native long native_init(java.lang.String p0, long p1, boolean p2);
        public java.lang.String getName() { return null; }
        public long getPtr() { return 0L; }
        public boolean isNameStatic() { return false; }
    }

    static final class Field implements com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer {
        private final long mFieldPtr = 0L;
        private final long mPtr = 0L;
        Field(com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner p0) {}
        private static native long native_delete();
        private static native long native_get_extra_ptr(long p0);
        private static native long native_init();
        private static native void native_set_value_double(long p0, long p1, double p2);
        private static native void native_set_value_int64(long p0, long p1, long p2);
        private static native void native_set_value_string(long p0, long p1, java.lang.String p2);
        private static native void native_set_value_with_interning(long p0, long p1, java.lang.String p2, long p3);
        public long getPtr() { return 0L; }
        public void setValueDouble(long p0, double p1) {}
        public void setValueInt64(long p0, long p1) {}
        public void setValueString(long p0, java.lang.String p1) {}
        public void setValueWithInterning(long p0, java.lang.String p1, long p2) {}
    }

    static interface FieldContainer {
        public void addField(com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer p0);
    }

    static final class FieldNested implements com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer, com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.FieldContainer {
        private final long mFieldPtr = 0L;
        private final long mPtr = 0L;
        FieldNested(com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner p0) {}
        private static native void native_add_field(long p0, long p1);
        private static native long native_delete();
        private static native long native_get_extra_ptr(long p0);
        private static native long native_init();
        private static native void native_set_id(long p0, long p1);
        public void addField(com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer p0) {}
        public long getPtr() { return 0L; }
        public void setId(long p0) {}
    }

    static final class Flow implements com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer {
        private final long mExtraPtr = 0L;
        private final long mPtr = 0L;
        Flow(com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner p0) {}
        private static native long native_delete();
        private static native long native_get_extra_ptr(long p0);
        private static native long native_init();
        private static native void native_set_process_flow(long p0, long p1);
        private static native void native_set_process_terminating_flow(long p0, long p1);
        public long getPtr() { return 0L; }
        public void setProcessFlow(long p0) {}
        public void setProcessTerminatingFlow(long p0) {}
    }

    static final class NamedTrack implements com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer {
        private final long mExtraPtr = 0L;
        private final long mId = 0L;
        private final boolean mIsNameStatic = false;
        private final java.lang.String mName = null;
        private final long mPtr = 0L;
        NamedTrack(long p0, java.lang.String p1, long p2, boolean p3, com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner p4) {}
        private static native long native_delete();
        private static native long native_get_extra_ptr(long p0);
        private static native long native_init(long p0, java.lang.String p1, long p2, boolean p3);
        public java.lang.String getName() { return null; }
        public long getPtr() { return 0L; }
        public boolean isNameStatic() { return false; }
    }

    static final class NestedTracks implements com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer {
        private final long mExtraPtr = 0L;
        private final long mPtr = 0L;
        NestedTracks(int p0, java.lang.String[] p1, long[] p2, int[] p3, int[] p4, int[] p5, java.lang.String[] p6, long[] p7, com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner p8) {}
        private static native long native_delete();
        private static native long native_get_extra_ptr(long p0);
        private static native long native_init(int p0, java.lang.String[] p1, long[] p2, int[] p3, int[] p4, int[] p5, java.lang.String[] p6, long[] p7);
        public long getPtr() { return 0L; }
    }

    static interface PerfettoPointer {
        public long getPtr();
    }

    static final class Proto implements com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer, com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.FieldContainer {
        private final long mExtraPtr = 0L;
        private final long mPtr = 0L;
        Proto(com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner p0) {}
        private static native void native_add_field(long p0, long p1);
        private static native void native_clear_fields(long p0);
        private static native long native_delete();
        private static native long native_get_extra_ptr(long p0);
        private static native long native_init();
        public void addField(com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer p0) {}
        public void clearFields() {}
        public long getPtr() { return 0L; }
    }
}
