package android.audio.policy.configuration.V7_0;

public class Modules {
    private java.util.List<android.audio.policy.configuration.V7_0.Modules.Module> module;
    public Modules() {}
    static android.audio.policy.configuration.V7_0.Modules read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
    public java.util.List<android.audio.policy.configuration.V7_0.Modules.Module> getModule() { return null; }

    public static class Module {
        private android.audio.policy.configuration.V7_0.AttachedDevices attachedDevices;
        private java.lang.String defaultOutputDevice;
        private android.audio.policy.configuration.V7_0.DevicePorts devicePorts;
        private android.audio.policy.configuration.V7_0.HalVersion halVersion;
        private android.audio.policy.configuration.V7_0.MixPorts mixPorts;
        private java.lang.String name;
        private android.audio.policy.configuration.V7_0.Routes routes;
        public Module() {}
        static android.audio.policy.configuration.V7_0.Modules.Module read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
        public android.audio.policy.configuration.V7_0.AttachedDevices getAttachedDevices() { return null; }
        public java.lang.String getDefaultOutputDevice() { return null; }
        public android.audio.policy.configuration.V7_0.DevicePorts getDevicePorts() { return null; }
        public android.audio.policy.configuration.V7_0.HalVersion getHalVersion() { return null; }
        public android.audio.policy.configuration.V7_0.MixPorts getMixPorts() { return null; }
        public java.lang.String getName() { return null; }
        public android.audio.policy.configuration.V7_0.Routes getRoutes() { return null; }
        boolean hasAttachedDevices() { return false; }
        boolean hasDefaultOutputDevice() { return false; }
        boolean hasDevicePorts() { return false; }
        boolean hasHalVersion() { return false; }
        boolean hasMixPorts() { return false; }
        boolean hasName() { return false; }
        boolean hasRoutes() { return false; }
        public void setAttachedDevices(android.audio.policy.configuration.V7_0.AttachedDevices p0) {}
        public void setDefaultOutputDevice(java.lang.String p0) {}
        public void setDevicePorts(android.audio.policy.configuration.V7_0.DevicePorts p0) {}
        public void setHalVersion(android.audio.policy.configuration.V7_0.HalVersion p0) {}
        public void setMixPorts(android.audio.policy.configuration.V7_0.MixPorts p0) {}
        public void setName(java.lang.String p0) {}
        public void setRoutes(android.audio.policy.configuration.V7_0.Routes p0) {}
    }
}
