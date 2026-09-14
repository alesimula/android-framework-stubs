package com.android.internal.widget.remotecompose.core.operations.layout.managers.policies;

public class EnforceConstraintsMeasurePolicy extends com.android.internal.widget.remotecompose.core.operations.layout.managers.policies.InlineExpressionMeasurePolicy {
    public static final com.android.internal.widget.remotecompose.core.operations.layout.managers.policies.EnforceConstraintsMeasurePolicy INSTANCE = null;
    private EnforceConstraintsMeasurePolicy() { super(); }
    protected boolean shouldEnforceConstraints() { return false; }
}
