package game;

public class GameTUI {
    
    public static void main(String[] args) {
        Position p = new Position(5, 3);
        Player player = new Player("Stas", p);
        
        System.out.println("Primer posicion " + player);
        player.moveRight();  
        player.jump();        
        player.moveLeft();   
        System.out.println("Final posicion " + player);
    }
}