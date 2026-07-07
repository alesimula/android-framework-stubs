package com.android.internal.protolog.common;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER})
public @interface ProtoLogToolInjected {
    public com.android.internal.protolog.common.ProtoLogToolInjected.Value value();

    public static enum Value {
        CACHE_UPDATER,
        LOG_GROUPS,
        VIEWER_CONFIG_PATH;
        private static final com.android.internal.protolog.common.ProtoLogToolInjected.Value[] $VALUES = null;
        private Value() {}
    }
}
