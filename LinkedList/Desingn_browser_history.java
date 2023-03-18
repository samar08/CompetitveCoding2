/*
 * You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.

Implement the BrowserHistory class:

BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
void visit(string url) Visits url from the current page. It clears up all the forward history.
string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps.

 */
class Node{
    String val;
    Node left;
    Node right;
    public Node(String val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
class BrowserHistory {
  
    Node head;
    Node current;
    public BrowserHistory(String homepage) {
       head=new Node(homepage);
       current=head;
       // System.out.println(current.val);
    }
    
    public void visit(String url) {
       Node next=new Node(url);
       current.right=next;
       next.left=current;
       current=current.right;
       //System.out.println(current.val);
    }
    
    public String back(int steps) {
        while(current.left!=null && steps>0){
            current=current.left;
            steps--;
        }
        // System.out.println(current.val);
        return current.val;
        
    }
    
    public String forward(int steps) {
        while(current.right!=null && steps>0){
            current=current.right;
            steps--;
        }
        // System.out.println(current.val);
        return current.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */