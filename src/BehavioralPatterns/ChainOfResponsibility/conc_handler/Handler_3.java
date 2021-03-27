package BehavioralPatterns.ChainOfResponsibility.conc_handler;

import BehavioralPatterns.ChainOfResponsibility.Handler.Handler;
import BehavioralPatterns.ChainOfResponsibility.Request.Request;

public class Handler_3 extends Handler{
    private static int code = 3;
    public Handler_3(Handler next) {
        super(next);
    }

    public void handle(Request request){
        if(request.getCode() == code){
            System.out.println("Request Handled by Handler Handler_3.");
        }else
            super.handle(request);
    }
}