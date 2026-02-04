package game;

public class Player {
    
    private String name;
    private Position position;
    
    public Player(String name, Position position) {
        this.name = name;
        this.position = position;
    }
    

    public String getName() {
        return name;
    }
    
    public Position getPosition() {
        return position;
    }
    

    public void setName(String name) {
        this.name = name;
    }
    
    public void setPosition(Position position) {
        this.position = position;
    }
    
    public void moveRight() {
        position.incX();
    }
    
    public void moveLeft() {
        position.decX();
    }
    
    public void jump() {
        position.incY();
    }
    
    public void fall() {
        position.decY();
    }
    
    @Override
    public String toString() {
        return name + position;
    }
}