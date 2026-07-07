package com.android.internal.widget.remotecompose.core;

public interface RemoteContextActions {
    public boolean performClick(com.android.internal.widget.remotecompose.core.CoreDocument p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, java.lang.String p2);
    public int scrollByOffset(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1);
    public boolean scrollDirection(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent.ScrollDirection p1);
    public boolean showOnScreen(com.android.internal.widget.remotecompose.core.operations.layout.Component p0);
}
