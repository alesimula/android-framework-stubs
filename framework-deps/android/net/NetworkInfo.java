package android.net;

public class NetworkInfo {
    public NetworkInfo() {}
    public boolean isConnected() { return false; }

    public static class DetailedState {
        public DetailedState() {}
        public android.net.NetworkInfo.DetailedState[] values() { return null; }
        public android.net.NetworkInfo.DetailedState CONNECTING = null;
        public int ordinal() { return 0; }
        public android.net.NetworkInfo.DetailedState CONNECTED = null;
        public android.net.NetworkInfo.DetailedState DISCONNECTED = null;
        public android.net.NetworkInfo.DetailedState FAILED = null;
    }
}
