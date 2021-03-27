package BehavioralPatterns.ChainOfResponsibility.conc_handler;

import BehavioralPatterns.ChainOfResponsibility.Handler.Handler;
import BehavioralPatterns.ChainOfResponsibility.Request.Request;

public class Handler_1 extends Handler {
    private static int code = 1;
    public Handler_1(Handler next) {
        super(next);
    }

    public void handle(Request request){
        if(request.getCode() == code){
            System.out.println("Request Handled by Handler Handler_1.");
        }else
            super.handle(request);
    }
}
