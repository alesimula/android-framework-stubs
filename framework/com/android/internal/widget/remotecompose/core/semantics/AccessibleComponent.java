package com.android.internal.widget.remotecompose.core.semantics;

public interface AccessibleComponent extends com.android.internal.widget.remotecompose.core.semantics.AccessibilitySemantics {
    default public java.lang.Integer getContentDescriptionId() { return null; }
    default public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Mode getMode() { return null; }
    default public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Role getRole() { return null; }
    default public java.lang.Integer getTextId() { return null; }
    default public boolean isClickable() { return false; }

    public static enum Mode {
        CLEAR_AND_SET,
        MERGE,
        SET;
        private static final com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Mode[] $VALUES = null;
        private Mode() {}
    }

    public static enum Role {
        BUTTON,
        CAROUSEL,
        CHECKBOX,
        DROPDOWN_LIST,
        IMAGE,
        PICKER,
        RADIO_BUTTON,
        SWITCH,
        TAB,
        UNKNOWN;
        private static final com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Role[] $VALUES = null;
        private final java.lang.String mDescription = null;
        private Role() {}
        public static com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Role fromInt(int p0) { return null; }
        public java.lang.String getDescription() { return null; }
    }
}
