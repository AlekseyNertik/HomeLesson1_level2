package Team;

public class Human1 implements DreamTeam {

    private String name;
    private int maxRun;
    private int maxJump;
    private boolean onDistance;

    public Human1(String name, int maxRun, int maxJump) {
        this.name=name;
        this.maxRun=maxRun;
        this.maxJump=maxJump;
        this.onDistance=true;
    }
    public Human1(String name) {this(name,300,4);}

    @Override
    public void run (int dist){
        if (dist<=maxRun) System.out.printf("Human %s может пробежать %d m\n", name, dist);
        else {
            System.out.printf("Human %s не может пробежать %d m\n", name, dist);
            onDistance=false;
        }
    }
    @Override
    public void jump (int h){
        if (h<=maxJump) System.out.printf("Human %s может прыгнуть %d m\n", name, h);
        else {
            System.out.printf("Human %s не может прыгнуть %d m\n", name, h);
            onDistance=false;
        }
        }
    @Override
    public boolean goOnDistance () {return onDistance;}

    @Override
    public void info() {
        System.out.printf("Человек %s",name);
        if (onDistance) System.out.println(" преодолел полосу препятствий");
        else System.out.println(" НЕ преодолел полосу препятствий");
    }

}
