public class LinkedPlaylist implements Playlist {
    private Node head;
    private Node curSong;

    public LinkedPlaylist(String[] songs) {
        head = new Node();
        Node cur = head;
        for (int i=0; i<songs.length; i++) {
            cur.next = new Node(songs[i]);
            cur  = cur.next;
        }
        curSong = head.next;
    }

    class Node {
        String data;
        Node next;
        Node() {
            this.data = null;
            this.next = null;
        }
        Node(String song) {
            this.data = song;
            this.next = null;
        }
    }

    public String nowPlaying() {
        return curSong.data;                
    }

    public int numRemaining() {
        return helper(curSong.next);
    }

    private int helper(Node cur) {
        if (cur == null) return 0;
        return 1 + helper(cur.next);
    }

    public void skip() {
        if (curSong.next != null) {
            this.curSong = curSong.next;
        } else {
            throw new RuntimeException("playlist is completed.");
        }
    }

    public static void main(String[] args) {
        String[] songs = {"song1", "song2", "song3"};
        LinkedPlaylist p = new LinkedPlaylist(songs);
        System.out.println(p.numRemaining());
        System.out.println(p.nowPlaying());
        p.skip();
        System.out.println(p.numRemaining());
        System.out.println(p.nowPlaying());
        p.skip();
        System.out.println(p.nowPlaying());
        p.skip();
    }
}
