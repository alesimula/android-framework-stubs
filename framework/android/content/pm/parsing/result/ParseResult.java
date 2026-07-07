package android.content.pm.parsing.result;

public interface ParseResult<ResultType extends java.lang.Object> {
    public int getErrorCode();
    public java.lang.String getErrorMessage();
    public java.lang.Exception getException();
    public ResultType getResult();
    public boolean isError();
    public boolean isSuccess();
}
