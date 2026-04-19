package CH_13_OOPs;

interface ChessPlayer {
    void moves ();
}

class Queen implements ChessPlayer {
    public void moves () {
        System.out.println("up , down , left , right , diagonal (in all direction)");
    }
}

class King implements ChessPlayer {
    public void moves () {
        System.out.println("up , down, right , left , diagonal ( by 1 step)");
    }
}

class Rook implements  ChessPlayer {
    public void moves () {
        System.out.println("up , down , left , right");
    }
}


public class _21_Interface {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();
        System.out.println();

        Rook rook = new Rook();
        rook.moves();
        System.out.println();

        King king = new King ();
        king.moves();
    }
}
