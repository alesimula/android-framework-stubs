package com.android.server.security.authenticationpolicy;

public final class CrossDeviceAuthenticatedMessageProto {
    public static final long CALLING_PACKAGE = 1146756268034L;
    public static final long DEVICE_LOCK_STATE = 1146756268036L;
    public static final long DEVICE_TYPE = 1146756268035L;
    public static final long UUID = 1151051235329L;
    public CrossDeviceAuthenticatedMessageProto() {}

    public final class DeviceLockStateProto {
        public static final long IS_DEVICE_LOCKED = 1133871366146L;
        public static final long IS_DEVICE_SECURE = 1133871366145L;
        public DeviceLockStateProto(com.android.server.security.authenticationpolicy.CrossDeviceAuthenticatedMessageProto p0) {}
    }

    public final class CallingPackageProto {
        public static final long CALLING_PACKAGE_WAS_IN_FOREGROUND = 1133871366149L;
        public static final long CURRENT_SIGNATURES = 2250562863106L;
        public static final long PACKAGE_NAME = 1138166333441L;
        public static final long PACKAGE_NAME_ALIASES = 2237677961222L;
        public static final long PAST_SIGNATURES = 2250562863107L;
        public static final long ROLES = 2237677961223L;
        public static final long SIGNATURE_SCHEME_VERSION = 1120986464260L;
        public CallingPackageProto(com.android.server.security.authenticationpolicy.CrossDeviceAuthenticatedMessageProto p0) {}
    }

    public final class DeviceTypeProto {
        public static final long IS_AUTOMOTIVE = 1133871366147L;
        public static final long IS_PC = 1133871366145L;
        public static final long IS_WATCH = 1133871366146L;
        public static final long IS_XR_PERIPHERAL = 1133871366148L;
        public DeviceTypeProto(com.android.server.security.authenticationpolicy.CrossDeviceAuthenticatedMessageProto p0) {}
    }
}
