

public class Queen extends Piece{ //Королева

    public Queen(Position thisPosition) {
        super(thisPosition);
    }

    public static boolean isLegalMove(Position thisPosition, Position nextPosition){
        return Rook.isLegalMove(thisPosition, nextPosition) || Bishop.isLegalMove(thisPosition, nextPosition);
    }
    @Override
    public boolean isLegalMove(Position nextPosition) {
        return isLegalMove(this.thisPosition, nextPosition) && isInBoard(nextPosition) && !isInOnOnePosition(nextPosition);
    }
}