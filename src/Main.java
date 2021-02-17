import Obstacles.Obstacle;
import Obstacles.Track1;
import Obstacles.Wall1;
import Team.Cat1;
import Team.DreamTeam;
import Team.Human1;
import Team.Robot1;

public class Main {
    public static void main (String[] args){

    Human human = new Human("Сергей Бубка", 300, 4);
    Cat cat = new Cat ("Барсик", 100, 7); // создаю человека, кота, робота
    Robot robot = new Robot("Железяка", 1000, 0);
    Track track = new Track(200);
    Wall wall = new Wall(4);
    boolean canHuman, canCat, canRobot;
    boolean [] can = new boolean[3];

    System.out.println("Полоса препятствий:");
    track.trackInfo();
    wall.wallInfo();
    System.out.println("Претенденты:");
    human.humanInfo(); // информация по человеку, коту, роботу
    cat.catInfo();
    robot.RobotInfo();
// проход по полосе препятствий
    can[0] = human.runTrack(track);
    if (can[0]) can[0]=human.jumpWall(wall);
    can[1] = cat.runTrack(track);
    if (can[1]) can[1]=cat.jumpWall(wall);
    can[2] = robot.runTrack(track);
    if (can[2]) can[2]=robot.jumpWall(wall);

System.out.println("\nПоследний блок через массив классов\n");
        DreamTeam[] dreamTeams ={
                new Human1("Сергей Бубка", 400, 4),
                new Cat1("Basic"),
                new Robot1("Ведроид"),
                new Human1("Pupkin",100,1),
                new Robot1("Железяка", 1000, 0)
        };

        Obstacle[] obstacles = {
          new Track1(200),
          new Wall1(4)
        };

        for (DreamTeam d: dreamTeams) {
            for (Obstacle o: obstacles) {
                o.doIt(d);
                if (!d.goOnDistance()) break;
            }
        }
System.out.println("============== РЕЗУЛЬТАТЫ ===================");
        for (DreamTeam dreamTeam: dreamTeams) dreamTeam.info();
    }

}
