package BehavioralPatterns.ChainOfResponsibility.Request;

public abstract class Request {
    private int code;

    public Request(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
