package Virus_Attack.src;


public interface Locatable {
    public int getX();

    public int getY();

    public double getDistance(Locatable other);
}