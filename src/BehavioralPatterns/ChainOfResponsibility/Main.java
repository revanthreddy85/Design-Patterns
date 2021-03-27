package BehavioralPatterns.ChainOfResponsibility;

import BehavioralPatterns.ChainOfResponsibility.Handler.Handler;
import BehavioralPatterns.ChainOfResponsibility.Request.Request;
import BehavioralPatterns.ChainOfResponsibility.conc_handler.Handler_1;
import BehavioralPatterns.ChainOfResponsibility.conc_handler.Handler_2;
import BehavioralPatterns.ChainOfResponsibility.conc_handler.Handler_3;
import BehavioralPatterns.ChainOfResponsibility.conc_request.Request_1;
import BehavioralPatterns.ChainOfResponsibility.conc_request.Request_2;

public class Main {
    public static void main(String[] args) {
        Handler handler1 = new Handler_1(null);
        Handler handler2 = new Handler_2(handler1);
        Handler handler3 = new Handler_3(null);
        handler3.setNext(handler2);

        Request request = new Request_1();
        handler3.handle(request);

        request = new Request_2();
        handler3.handle(request);
    }
}
