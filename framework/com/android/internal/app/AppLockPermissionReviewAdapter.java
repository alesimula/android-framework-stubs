package com.android.internal.app;

public class AppLockPermissionReviewAdapter extends com.android.internal.widget.RecyclerView.Adapter<com.android.internal.app.AppLockPermissionReviewAdapter.AppViewHolder> {
    private final java.util.List<com.android.internal.app.AppLockPermissionReviewActivity.AppWithPermissionInfo> mAppList = null;
    public AppLockPermissionReviewAdapter() { super(); }
    private boolean isListDataIdentical(java.util.List<com.android.internal.app.AppLockPermissionReviewActivity.AppWithPermissionInfo> p0, java.util.List<com.android.internal.app.AppLockPermissionReviewActivity.AppWithPermissionInfo> p1) { return false; }
    public int getItemCount() { return 0; }
    public void onBindViewHolder(com.android.internal.app.AppLockPermissionReviewAdapter.AppViewHolder p0, int p1) {}
    public com.android.internal.app.AppLockPermissionReviewAdapter.AppViewHolder onCreateViewHolder(android.view.ViewGroup p0, int p1) { return null; }
    public void updateData(java.util.List<com.android.internal.app.AppLockPermissionReviewActivity.AppWithPermissionInfo> p0) {}

    public static class AppViewHolder extends com.android.internal.widget.RecyclerView.ViewHolder {
        final android.widget.ImageView mAppIconView = null;
        final android.widget.TextView mAppNameView = null;
        public AppViewHolder(android.view.View p0) { super(null); }
        public void bind(com.android.internal.app.AppLockPermissionReviewActivity.AppWithPermissionInfo p0) {}
    }
}
