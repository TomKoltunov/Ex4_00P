package ex4_java_client;

import java.util.LinkedList;
import java.util.List;

/**
 * This class represent an agent.
 * id: agent's id.
 * value: agent's score.
 * src: agent's source node.
 * dest: agent's destination node.
 * speed: agent's speed.
 * location: agent's current location.
 * path: agent's node path.
 * isAllocated: true if the agent is allocated to some pokemon, else false.
 * target: pokemon's location.
 */
public class Agent {
    private int id;
    private double value;
    private int src;
    private int dest;
    private double speed;
    private GeoLocation location;
    List<Integer>path;
    boolean isAllocated;
    GeoLocation target;
    public Agent(int id, double value, int src, int dest, double speed, GeoLocation location) {
        this.id = id;
        this.value = value;
        this.src = src;
        this.dest = dest;
        this.speed = speed;
        this.location = location;
        path=new LinkedList<>();
        target=new Location(location);
        //Update the new agent list to the current list.
    }

    public Agent(Agent agent) {
        this.id=agent.getId();
        this.value=agent.getValue();
        this.src=agent.getSrc();
        this.dest=agent.getDest();
        this.speed=agent.getSpeed();
        this.location= agent.getLocation();
        this.path=agent.path;
    }

    public int getId() {
        return id;
    }
    public int getLast(){return path.isEmpty()? src:path.get(path.size()-1);}
    public double getValue() {
        return value;
    }

    public int getSrc() {
        return src;
    }

    public int getDest() {
        return dest;
    }

    public double getSpeed() {
        return speed;
    }

    public GeoLocation getLocation() {
        return location;
    }
}
