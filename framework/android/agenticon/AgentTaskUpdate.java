package android.agenticon;

public final class AgentTaskUpdate implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.agenticon.AgentTaskUpdate> CREATOR = null;
    private final android.agenticon.AgentTaskEvent mAgentTaskEvent = null;
    private final android.agenticon.AgentTaskState mAgentTaskState = null;
    private AgentTaskUpdate(android.agenticon.AgentTaskState p0, android.agenticon.AgentTaskEvent p1) {}
    private AgentTaskUpdate(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.agenticon.AgentTaskEvent getAgentTaskEvent() { return null; }
    public android.agenticon.AgentTaskState getAgentTaskState() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.agenticon.AgentTaskEvent mAgentTaskEvent;
        private android.agenticon.AgentTaskState mAgentTaskState;
        public Builder() {}
        public Builder(android.agenticon.AgentTaskUpdate.Builder p0) {}
        public android.agenticon.AgentTaskUpdate build() { return null; }
        public android.agenticon.AgentTaskUpdate.Builder setAgentTaskEvent(android.agenticon.AgentTaskEvent p0) { return null; }
        public android.agenticon.AgentTaskUpdate.Builder setAgentTaskState(android.agenticon.AgentTaskState p0) { return null; }
    }
}
