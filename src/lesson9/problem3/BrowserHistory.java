package lesson9.problem3;

import java.util.Stack;

public class BrowserHistory {
    Stack<String> backHistory;
    Stack<String> forwardHistory;
    String currentURL;

    public BrowserHistory(String url){
        backHistory = new Stack<>();
        forwardHistory = new Stack<>();
        currentURL = url;
    }

    public void visit(String url){
        backHistory.push(currentURL);
        currentURL = url;
        forwardHistory.empty();
        System.out.println("Visited: "+url);
    }

    public void back(){
        if(backHistory.isEmpty()){
            System.out.println("No history to go back to.");
            return;
        }
        forwardHistory.push(currentURL);
        currentURL = backHistory.pop();
        System.out.println("Back to: "+currentURL);
    }

    public void forward(){
        if(forwardHistory.isEmpty()){
            System.out.println("No forward history.");
            return;
        }
        backHistory.push(currentURL);
        currentURL = forwardHistory.pop();
        System.out.println("Forward to: "+currentURL);
    }
}
