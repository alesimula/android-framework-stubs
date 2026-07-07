package android.media;

public class DecoderCapabilities {
    private DecoderCapabilities() {}
    public static java.util.List<android.media.DecoderCapabilities.AudioDecoder> getAudioDecoders() { return null; }
    public static java.util.List<android.media.DecoderCapabilities.VideoDecoder> getVideoDecoders() { return null; }
    private static final native int native_get_audio_decoder_type(int p0);
    private static final native int native_get_num_audio_decoders();
    private static final native int native_get_num_video_decoders();
    private static final native int native_get_video_decoder_type(int p0);
    private static final native void native_init();

    public static enum AudioDecoder {
        AUDIO_DECODER_WMA;
        private static final android.media.DecoderCapabilities.AudioDecoder[] $VALUES = null;
        private AudioDecoder() {}
    }

    public static enum VideoDecoder {
        VIDEO_DECODER_WMV;
        private static final android.media.DecoderCapabilities.VideoDecoder[] $VALUES = null;
        private VideoDecoder() {}
    }
}
