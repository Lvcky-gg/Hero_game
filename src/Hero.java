public class Hero {
    private final String name;
    private final char symbol = '@';
    private int x;
    private int y;

    public Hero(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this. y = y;
    }
    public String getName(){
        return name;
    }
    public char getSymbol(){
        return symbol;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void moveLeft(){
        x--;
    }
    public void moveRight(){
        x++;
    }
    public void moveUp(){
        y--;
    }
    public void moveDown(){
        y++;
    }

}


