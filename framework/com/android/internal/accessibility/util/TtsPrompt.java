package com.android.internal.accessibility.util;

public class TtsPrompt implements android.speech.tts.TextToSpeech.OnInitListener {
    private static final int RETRY_MILLIS = 1000;
    private static final java.lang.String TAG = "TtsPrompt";
    private final android.content.Context mContext = null;
    private boolean mDismiss;
    private final com.android.internal.accessibility.util.FrameworkObjectProvider mFrameworkObjectProvider = null;
    private final android.os.Handler mHandler = null;
    private boolean mLanguageReady;
    private int mRetryCount;
    private final java.lang.CharSequence mText = null;
    private android.speech.tts.TextToSpeech mTts;
    public TtsPrompt(android.content.Context p0, android.os.Handler p1, com.android.internal.accessibility.util.FrameworkObjectProvider p2, java.lang.CharSequence p3) {}
    private void initTextToSpeech() {}
    private void play() {}
    private void playNotificationTone() {}
    private void waitForTtsReady() {}
    public void dismiss() {}
    public void onInit(int p0) {}
}
