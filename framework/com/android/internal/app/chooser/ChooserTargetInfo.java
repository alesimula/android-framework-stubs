package com.android.internal.app.chooser;

public interface ChooserTargetInfo extends com.android.internal.app.chooser.TargetInfo {
    public android.service.chooser.ChooserTarget getChooserTarget();
    public float getModifiedScore();
    default public boolean isSimilar(com.android.internal.app.chooser.ChooserTargetInfo p0) { return false; }
}
