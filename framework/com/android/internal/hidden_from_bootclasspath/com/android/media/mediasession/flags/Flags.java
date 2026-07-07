package com.android.internal.hidden_from_bootclasspath.com.android.media.mediasession.flags;

public final class Flags {
    public static final java.lang.String FLAG_DEPRECATE_PLATFORM_MEDIASESSION2_APIS = "com.android.media.mediasession.flags.deprecate_platform_mediasession2_apis";
    public static final java.lang.String FLAG_EXPOSE_BITMAP_SIZE_LIMIT_API = "com.android.media.mediasession.flags.expose_bitmap_size_limit_api";
    public static final java.lang.String FLAG_FETCH_MEDIA_CONTROLLERS_FOR_APP = "com.android.media.mediasession.flags.fetch_media_controllers_for_app";
    public static final java.lang.String FLAG_FILTER_SESSION_AUDIO_PLAYBACK_BY_USAGE = "com.android.media.mediasession.flags.filter_session_audio_playback_by_usage";
    public static final java.lang.String FLAG_OVERRIDE_MEDIA_SESSION_OWNER = "com.android.media.mediasession.flags.override_media_session_owner";
    public Flags() {}
    public static boolean deprecatePlatformMediasession2Apis() { return false; }
    public static boolean exposeBitmapSizeLimitApi() { return false; }
    public static boolean fetchMediaControllersForApp() { return false; }
    public static boolean filterSessionAudioPlaybackByUsage() { return false; }
    public static boolean overrideMediaSessionOwner() { return false; }
}
