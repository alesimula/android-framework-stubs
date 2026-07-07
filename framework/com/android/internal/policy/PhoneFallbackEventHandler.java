package com.android.internal.policy;

public class PhoneFallbackEventHandler implements android.view.FallbackEventHandler {
    private static final boolean DEBUG = false;
    private static java.lang.String TAG;
    android.media.AudioManager mAudioManager;
    android.content.Context mContext;
    android.app.KeyguardManager mKeyguardManager;
    android.media.session.MediaSessionManager mMediaSessionManager;
    android.app.SearchManager mSearchManager;
    android.telephony.TelephonyManager mTelephonyManager;
    android.view.View mView;
    public PhoneFallbackEventHandler(android.content.Context p0) {}
    private void handleMediaKeyEvent(android.view.KeyEvent p0) {}
    private void handleVolumeKeyEvent(android.view.KeyEvent p0) {}
    private boolean isNotInstantAppAndKeyguardRestricted(android.view.KeyEvent.DispatcherState p0) { return false; }
    private boolean isUserSetupComplete() { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    android.media.AudioManager getAudioManager() { return null; }
    android.app.KeyguardManager getKeyguardManager() { return null; }
    android.media.session.MediaSessionManager getMediaSessionManager() { return null; }
    android.app.SearchManager getSearchManager() { return null; }
    android.telephony.TelephonyManager getTelephonyManager() { return null; }
    boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public void preDispatchKeyEvent(android.view.KeyEvent p0) {}
    public void setView(android.view.View p0) {}
    void startCallActivity() {}
}
