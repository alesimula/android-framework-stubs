package com.android.internal.annotations;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface VisibleForTesting {
    public com.android.internal.annotations.VisibleForTesting.Visibility visibility() default com.android.internal.annotations.VisibleForTesting.Visibility.PRIVATE;

    public static enum Visibility {
        PACKAGE,
        PRIVATE,
        PROTECTED;
        private static final com.android.internal.annotations.VisibleForTesting.Visibility[] $VALUES = null;
        private Visibility() {}
    }
}
