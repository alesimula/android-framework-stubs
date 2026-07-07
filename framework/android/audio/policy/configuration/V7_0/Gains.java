package android.audio.policy.configuration.V7_0;

public class Gains {
    private java.util.List<android.audio.policy.configuration.V7_0.Gains.Gain> gain;
    public Gains() {}
    static android.audio.policy.configuration.V7_0.Gains read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
    public java.util.List<android.audio.policy.configuration.V7_0.Gains.Gain> getGain() { return null; }

    public static class Gain {
        private android.audio.policy.configuration.V7_0.AudioChannelMask channel_mask;
        private java.lang.Integer defaultValueMB;
        private java.lang.Integer maxRampMs;
        private java.lang.Integer maxValueMB;
        private java.lang.Integer minRampMs;
        private java.lang.Integer minValueMB;
        private java.util.List<android.audio.policy.configuration.V7_0.AudioGainMode> mode;
        private java.lang.String name;
        private java.lang.Integer stepValueMB;
        private java.lang.Boolean useForVolume;
        public Gain() {}
        static android.audio.policy.configuration.V7_0.Gains.Gain read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
        public android.audio.policy.configuration.V7_0.AudioChannelMask getChannel_mask() { return null; }
        public int getDefaultValueMB() { return 0; }
        public int getMaxRampMs() { return 0; }
        public int getMaxValueMB() { return 0; }
        public int getMinRampMs() { return 0; }
        public int getMinValueMB() { return 0; }
        public java.util.List<android.audio.policy.configuration.V7_0.AudioGainMode> getMode() { return null; }
        public java.lang.String getName() { return null; }
        public int getStepValueMB() { return 0; }
        public boolean getUseForVolume() { return false; }
        boolean hasChannel_mask() { return false; }
        boolean hasDefaultValueMB() { return false; }
        boolean hasMaxRampMs() { return false; }
        boolean hasMaxValueMB() { return false; }
        boolean hasMinRampMs() { return false; }
        boolean hasMinValueMB() { return false; }
        boolean hasMode() { return false; }
        boolean hasName() { return false; }
        boolean hasStepValueMB() { return false; }
        boolean hasUseForVolume() { return false; }
        public void setChannel_mask(android.audio.policy.configuration.V7_0.AudioChannelMask p0) {}
        public void setDefaultValueMB(int p0) {}
        public void setMaxRampMs(int p0) {}
        public void setMaxValueMB(int p0) {}
        public void setMinRampMs(int p0) {}
        public void setMinValueMB(int p0) {}
        public void setMode(java.util.List<android.audio.policy.configuration.V7_0.AudioGainMode> p0) {}
        public void setName(java.lang.String p0) {}
        public void setStepValueMB(int p0) {}
        public void setUseForVolume(boolean p0) {}
    }
}
