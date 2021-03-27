package BehavioralPatterns.ChainOfResponsibility.Handler;

import BehavioralPatterns.ChainOfResponsibility.Request.Request;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    public void handle(Request request){
        if(next!=null)
            next.handle(request);
    }
}
