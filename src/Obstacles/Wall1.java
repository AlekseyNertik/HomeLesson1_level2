package Obstacles;

import Team.DreamTeam;

public class Wall1 implements Obstacle {

    private int height;

    public Wall1 (int height) { this.height=height; }

    @Override
    public void doIt(DreamTeam d) { d.jump(height); }
}
