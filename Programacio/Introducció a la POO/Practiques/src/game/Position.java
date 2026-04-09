package game;

public class Position {
    
    private int X;
    private int Y;
    
    public Position() {
        this.X = 0;
        this.Y = 0;
    }
    
    public Position(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
    
    public int getX() {
        return X;
    }
    
    public int getY() {
        return Y;
    }
    
    public void setX(int x) {
        X = x;
    }
    
    public void setY(int y) {
        Y = y;
    }
    

    public void incX() {
        X++;
    }
    
    public void incY() {
        Y++;
    }
    
    public void decX() {
        X--;
    }
    
    public void decY() {
        Y--;
    }
    
    @Override
    public String toString() {
        return "(" + X + "," + Y + ")";
    }
}