package BehavioralPatterns.ChainOfResponsibility.conc_handler;

import BehavioralPatterns.ChainOfResponsibility.Handler.Handler;
import BehavioralPatterns.ChainOfResponsibility.Request.Request;

public class Handler_2 extends Handler {
    private static int code = 2;

    public Handler_2(Handler next) {
        super(next);
    }

    public void handle(Request request) {
        if (request.getCode() == code) {
            System.out.println("Request Handled by Handler Handler_2.");
        } else
            super.handle(request);
    }
}
