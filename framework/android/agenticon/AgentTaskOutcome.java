package android.agenticon;

public final class AgentTaskOutcome implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.agenticon.AgentTaskOutcome> CREATOR = null;
    private static final int FLAG_AGENT_TASK_RESULT_EVENT_SHOWN = 2;
    private static final int FLAG_AGENT_TASK_RESULT_STATE_CHANGED = 1;
    private final int mResult = 0;
    private AgentTaskOutcome(int p0) {}
    private AgentTaskOutcome(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean isEventShown() { return false; }
    public boolean isStateChanged() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mResult;
        public Builder() {}
        public android.agenticon.AgentTaskOutcome build() { return null; }
        public android.agenticon.AgentTaskOutcome.Builder setEventShown(boolean p0) { return null; }
        public android.agenticon.AgentTaskOutcome.Builder setStateChanged(boolean p0) { return null; }
    }
}
