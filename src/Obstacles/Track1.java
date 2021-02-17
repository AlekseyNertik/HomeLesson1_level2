package Obstacles;

import Team.DreamTeam;

public class Track1 implements Obstacle {

    private int dist;

    public Track1 (int dist) { this.dist=dist; }

    @Override
    public void doIt (DreamTeam d) { d.run(dist); }
}
