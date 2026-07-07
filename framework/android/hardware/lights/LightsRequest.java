package android.hardware.lights;

public final class LightsRequest {
    final android.hardware.lights.MultiLightEffect mLightEffect = null;
    final java.util.List<java.lang.Integer> mLightIds = null;
    final java.util.List<android.hardware.lights.LightState> mLightStates = null;
    final java.util.Map<android.hardware.lights.Light, android.hardware.lights.LightState> mRequests = null;
    private LightsRequest(java.util.Map<android.hardware.lights.Light, android.hardware.lights.LightState> p0, android.hardware.lights.MultiLightEffect p1) {}
    public android.hardware.lights.MultiLightEffect getEffect() { return null; }
    public java.util.List<android.hardware.lights.LightState> getLightStates() { return null; }
    public java.util.List<java.lang.Integer> getLights() { return null; }
    public java.util.Map<android.hardware.lights.Light, android.hardware.lights.LightState> getLightsAndStates() { return null; }

    public static final class Builder {
        private final java.util.Map<android.hardware.lights.Light, android.hardware.lights.LightState> mChanges = null;
        private android.hardware.lights.MultiLightEffect mEffect;
        public Builder() {}
        public android.hardware.lights.LightsRequest.Builder addLight(android.hardware.lights.Light p0, android.hardware.lights.LightState p1) { return null; }
        public android.hardware.lights.LightsRequest build() { return null; }
        public android.hardware.lights.LightsRequest.Builder clearLight(android.hardware.lights.Light p0) { return null; }
        public android.hardware.lights.LightsRequest.Builder setEffect(android.hardware.lights.MultiLightEffect p0) { return null; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public android.hardware.lights.LightsRequest.Builder setLight(android.hardware.lights.Light p0, android.hardware.lights.LightState p1) { return null; }
    }
}
