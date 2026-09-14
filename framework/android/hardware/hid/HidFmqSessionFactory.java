package android.hardware.hid;

public interface HidFmqSessionFactory {
    public android.hardware.hid.HidFmqSession create(android.hardware.common.fmq.MQDescriptor<android.hardware.hid.HidReportPacket, java.lang.Byte> p0) throws java.lang.IllegalStateException;
}
