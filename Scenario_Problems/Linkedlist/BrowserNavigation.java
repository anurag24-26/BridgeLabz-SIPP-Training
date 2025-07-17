
package Linkedlist;

public class BrowserNavigation {
    
    static class Node{
        String url;
        Node prev,next;

        public Node(String url) {
            this.url = url;
            this.prev = null;
            this.next = null;
        }
    
    }

    static class BrowserHistory{
        protected Node current;

        public BrowserHistory(String Homepage){
            this.current=new Node (Homepage);
        }

        public void visit(String url){
            Node newNode=new Node(url);
            current.next=newNode;
            newNode.prev=current;
            current=newNode;
            System.out.println("Visited: " + url);
        }
        public String back(){
            if(current.prev!=null){
                current=current.prev;

            }
            return current.url;
        }
        public String forward() {
            if (current.next != null) {
                current = current.next;
            }
            return current.url;
        }

        public String getCurrentPage() {
            return current.url;
        }
    
    }
    static class MediaHistory extends BrowserHistory {

        public MediaHistory(String firstTrack) {
            super(firstTrack);
        }

        @Override
        public void visit(String track) {
            System.out.println("🎵 Adding to playlist...");
            super.visit(track);
        }

        public void showNowPlaying() {
            System.out.println("Now Playing: " + getCurrentPage());
        }
    }
    public static void main(String[] args) {
        System.out.println("=== Browser History ===");
        BrowserHistory history = new BrowserHistory("google.com");

        history.visit("openai.com");
        history.visit("github.com");

        System.out.println("Back to: " + history.back());       // openai.com
        System.out.println("Back to: " + history.back());       // google.com
        System.out.println("Forward to: " + history.forward()); // openai.com

        history.visit("leetcode.com");
        System.out.println("Current: " + history.getCurrentPage()); // leetcode.com
        System.out.println("Back to: " + history.back());           // openai.com

        System.out.println("\n=== Media History ===");
        MediaHistory player = new MediaHistory("Track1");
        player.visit("Track2");
        player.visit("Track3");
        player.showNowPlaying();   // Track3
        System.out.println("Back to: " + player.back());  // Track2
        player.showNowPlaying();   // Track2
    }
}
