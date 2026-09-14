package android.app.personalcontext.understander;

public final class RegistrationResponse {
    public static final int RESPONSE_CANCEL = 2;
    public static final int RESPONSE_PROCEED = 1;
    public static final int RESPONSE_UNKNOWN = 0;
    private final android.app.personalcontext.understander.RegistrationRequest mRequest = null;
    private final int mResponse = 0;
    public RegistrationResponse(android.app.personalcontext.understander.RegistrationRequest p0, int p1) {}
    public android.app.personalcontext.understander.RegistrationRequest getRequest() { return null; }
    public int getResponse() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Response {
    }
}
