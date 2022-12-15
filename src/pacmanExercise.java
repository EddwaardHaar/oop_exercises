public class pacmanExercise {

    public static void main(String[] args) {

        Pacman pacman = new Pacman();
        Ghost ghost = new Ghost();

        Fruit fruit1 = new Fruit();
        Fruit fruit2 = new Fruit();
        Fruit fruit3 = new Fruit();

        pacman.eat(fruit2);

        System.out.println(fruit1.isVisible);
        System.out.println(fruit2.isVisible);
        System.out.println(fruit3.isVisible);

        ghost.eatPacman(pacman);



    }

}

class Pacman
{
    public int points;
    public int lives;

    public Pacman()
    {
        points = 0;
        lives = 3;
    }

    public void printData()
    {
        System.out.println(points);
    }

    public void eat(Fruit eatenFruit)
    {
        System.out.println("Pac-Man ate fruit");
        eatenFruit.disappear();
    }

    public void decreaseLives(){
        lives = lives - 1;
        System.out.println("packman eaten...lives: " + lives);
    }
}


class Fruit
{
    public boolean isVisible;

    public Fruit()
    {
        isVisible = true;
    }

    public void disappear()
    {
        isVisible = false;
        System.out.println("Fruit is hidden");
    }
}

class Ghost{

    public void eatPacman(Pacman dec){
        dec.decreaseLives();
    }

}