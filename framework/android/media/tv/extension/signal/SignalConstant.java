package android.media.tv.extension.signal;

public final class SignalConstant {
    public static final int DOLBY_AUDIO_ICON_ATMOS = 2;
    public static final int DOLBY_AUDIO_ICON_AUDIO = 1;
    public static final int DOLBY_AUDIO_ICON_NONE = 0;
    public static final int FRONTEND_STATUS_LOCKED = 2;
    public static final int FRONTEND_STATUS_TUNING = 1;
    public static final int FRONTEND_STATUS_UNLOCKED = 3;
    public static final int FRONTEND_STATUS_UNTUNED = 0;
    public static final java.lang.String KEY_AUDIO_DOLBY_ICON = "DOLBY_ICON";
    public static final java.lang.String KEY_AUDIO_FRONT_CH_NUM = "FRONT_CH_NUM";
    public static final java.lang.String KEY_AUDIO_REAR_CH_NUM = "REAR_CH_NUM";
    public static final java.lang.String KEY_TUNER_SIGNAL_AGC = "AGC";
    public static final java.lang.String KEY_TUNER_SIGNAL_BANDWIDTH = "BANDWIDTH";
    public static final java.lang.String KEY_TUNER_SIGNAL_BER = "BER";
    public static final java.lang.String KEY_TUNER_SIGNAL_MODULATION = "MODULATION";
    public static final java.lang.String KEY_TUNER_SIGNAL_QUALITY_IN_PERCENT = "SIGNAL_QUALITY_IN_PERCENT";
    public static final java.lang.String KEY_TUNER_SIGNAL_SNR = "SNR";
    public static final java.lang.String KEY_TUNER_SIGNAL_STRENGTH_IN_PERCENT = "SIGNAL_STRENGTH_IN_PERCENT";
    public static final java.lang.String KEY_TUNER_SIGNAL_UEC = "UEC";
    public SignalConstant() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioSignalInfoKeys {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DolbyAudioIcon {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrontendSignalInfoKeys {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrontendStatus {
    }
}
