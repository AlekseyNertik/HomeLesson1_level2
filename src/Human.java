public class Human {
        //implements Runnable,Jumpable {
    String name ;
    int run ;
    int jump ;

        public Human (String name, int run, int jump) {
            this.name = name;
            this.run = run;
            this.jump = jump;
        }

    public void humanInfo()
    {
        System.out.println("Human name: "+name+"  Distance= "+run+"m   Height= "+jump+"m");
    }

    public boolean runTrack (Track t)    {
        if (run>= t.trackLenght)         {
          System.out.println("Human "+name+" can run "+t.trackLenght+"m");
          return true;
        }
        else  {
            System.out.println("Human "+name+" CAN`T run "+t.trackLenght+"m");
            return false;
        }
    }

    public boolean jumpWall (Wall w){
        if (jump>= w.wallHeight){
            System.out.println("Human "+name+" can jump "+w.wallHeight+"m");
            return true;
        }
        else {
            System.out.println("Human " + name + " CAN`T jump " + w.wallHeight + "m");
            return false;
        }


    }
}
