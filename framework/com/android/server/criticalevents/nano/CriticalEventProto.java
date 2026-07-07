package com.android.server.criticalevents.nano;

public final class CriticalEventProto extends com.android.framework.protobuf.nano.MessageNano {
    public static final int ANR_FIELD_NUMBER = 4;
    public static final int DATA_APP = 1;
    public static final int EXCESSIVE_BINDER_CALLS_FIELD_NUMBER = 9;
    public static final int HALF_WATCHDOG_FIELD_NUMBER = 3;
    public static final int INSTALL_PACKAGES_FIELD_NUMBER = 8;
    public static final int JAVA_CRASH_FIELD_NUMBER = 5;
    public static final int NATIVE_CRASH_FIELD_NUMBER = 6;
    public static final int PROCESS_CLASS_UNKNOWN = 0;
    public static final int SYSTEM_APP = 2;
    public static final int SYSTEM_SERVER = 3;
    public static final int SYSTEM_SERVER_STARTED_FIELD_NUMBER = 7;
    public static final int WATCHDOG_FIELD_NUMBER = 2;
    private static volatile com.android.server.criticalevents.nano.CriticalEventProto[] _emptyArray;
    private int eventCase_;
    private java.lang.Object event_;
    public long timestampMs;
    public CriticalEventProto() { super(); }
    public static com.android.server.criticalevents.nano.CriticalEventProto[] emptyArray() { return null; }
    public static com.android.server.criticalevents.nano.CriticalEventProto parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    public static com.android.server.criticalevents.nano.CriticalEventProto parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto clear() { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto clearEvent() { return null; }
    protected int computeSerializedSize() { return 0; }
    public com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding getAnr() { return null; }
    public int getEventCase() { return 0; }
    public com.android.server.criticalevents.nano.CriticalEventProto.ExcessiveBinderCalls getExcessiveBinderCalls() { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog getHalfWatchdog() { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto.InstallPackages getInstallPackages() { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash getJavaCrash() { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash getNativeCrash() { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto.SystemServerStarted getSystemServerStarted() { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto.Watchdog getWatchdog() { return null; }
    public boolean hasAnr() { return false; }
    public boolean hasExcessiveBinderCalls() { return false; }
    public boolean hasHalfWatchdog() { return false; }
    public boolean hasInstallPackages() { return false; }
    public boolean hasJavaCrash() { return false; }
    public boolean hasNativeCrash() { return false; }
    public boolean hasSystemServerStarted() { return false; }
    public boolean hasWatchdog() { return false; }
    public com.android.server.criticalevents.nano.CriticalEventProto mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto setAnr(com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding p0) { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto setExcessiveBinderCalls(com.android.server.criticalevents.nano.CriticalEventProto.ExcessiveBinderCalls p0) { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto setHalfWatchdog(com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog p0) { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto setInstallPackages(com.android.server.criticalevents.nano.CriticalEventProto.InstallPackages p0) { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto setJavaCrash(com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash p0) { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto setNativeCrash(com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash p0) { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto setSystemServerStarted(com.android.server.criticalevents.nano.CriticalEventProto.SystemServerStarted p0) { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto setWatchdog(com.android.server.criticalevents.nano.CriticalEventProto.Watchdog p0) { return null; }
    public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}

    public static final class AppNotResponding extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding[] _emptyArray;
        public int pid;
        public java.lang.String process;
        public int processClass;
        public java.lang.String subject;
        public int uid;
        public AppNotResponding() { super(); }
        public static com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding[] emptyArray() { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class ExcessiveBinderCalls extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.criticalevents.nano.CriticalEventProto.ExcessiveBinderCalls[] _emptyArray;
        public int uid;
        public ExcessiveBinderCalls() { super(); }
        public static com.android.server.criticalevents.nano.CriticalEventProto.ExcessiveBinderCalls[] emptyArray() { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.ExcessiveBinderCalls parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.ExcessiveBinderCalls parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.criticalevents.nano.CriticalEventProto.ExcessiveBinderCalls clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.criticalevents.nano.CriticalEventProto.ExcessiveBinderCalls mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class HalfWatchdog extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog[] _emptyArray;
        public java.lang.String subject;
        public HalfWatchdog() { super(); }
        public static com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog[] emptyArray() { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class InstallPackages extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.criticalevents.nano.CriticalEventProto.InstallPackages[] _emptyArray;
        public InstallPackages() { super(); }
        public static com.android.server.criticalevents.nano.CriticalEventProto.InstallPackages[] emptyArray() { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.InstallPackages parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.InstallPackages parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.criticalevents.nano.CriticalEventProto.InstallPackages clear() { return null; }
        public com.android.server.criticalevents.nano.CriticalEventProto.InstallPackages mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class JavaCrash extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash[] _emptyArray;
        public java.lang.String exceptionClass;
        public int pid;
        public java.lang.String process;
        public int processClass;
        public int uid;
        public JavaCrash() { super(); }
        public static com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash[] emptyArray() { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class NativeCrash extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash[] _emptyArray;
        public int pid;
        public java.lang.String process;
        public int processClass;
        public int uid;
        public NativeCrash() { super(); }
        public static com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash[] emptyArray() { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class SystemServerStarted extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.criticalevents.nano.CriticalEventProto.SystemServerStarted[] _emptyArray;
        public int startCount;
        public SystemServerStarted() { super(); }
        public static com.android.server.criticalevents.nano.CriticalEventProto.SystemServerStarted[] emptyArray() { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.SystemServerStarted parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.SystemServerStarted parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.criticalevents.nano.CriticalEventProto.SystemServerStarted clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.criticalevents.nano.CriticalEventProto.SystemServerStarted mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class Watchdog extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.criticalevents.nano.CriticalEventProto.Watchdog[] _emptyArray;
        public java.lang.String subject;
        public java.lang.String uuid;
        public Watchdog() { super(); }
        public static com.android.server.criticalevents.nano.CriticalEventProto.Watchdog[] emptyArray() { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.Watchdog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.Watchdog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.criticalevents.nano.CriticalEventProto.Watchdog clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.criticalevents.nano.CriticalEventProto.Watchdog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }
}
