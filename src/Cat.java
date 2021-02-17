public class Cat {

    String name ;
    int run ;
    int jump ;

    public Cat (String name, int run, int jump)
    {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public void catInfo()
    {
        System.out.println("Cat  name : "+name+"        Distance= "+run+"m   Height= "+jump+"m");
    }

    public boolean runTrack (Track t)    {
        if (run>= t.trackLenght)         {
            System.out.println("Cat "+name+" can run "+t.trackLenght+"m");
            return true;
        }
        else {
            System.out.println("Cat " + name + " CAN`T run " + t.trackLenght + "m");
            return false;
        }
    }

    public boolean jumpWall (Wall w) {
        if (jump >= w.wallHeight) {
            System.out.println("Cat " + name + " can jump " + w.wallHeight + "m");
            return true;
        } else {
            System.out.println("Cat " + name + " CAN`T jump " + w.wallHeight + "m");
            return false;
        }
    }
}
