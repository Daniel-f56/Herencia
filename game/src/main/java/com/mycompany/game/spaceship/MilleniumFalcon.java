package com.mycompany.game.spaceship;

public class MilleniumFalcon extends NuclearShip{
    private boolean hyperSpeed;
    private int cannons;
    private boolean shield;

    public MilleniumFalcon(boolean hyperSpeed, int cannons, boolean shield, String name, boolean armed, int crew, int damage, int health, int speed) {
        super(name, armed, crew, damage, health, speed);
        this.hyperSpeed = hyperSpeed;
        this.cannons = cannons;
        this.shield = shield;
    }

    
    
    @Override
    public void shoot(){
        System.out.println("Disparo a cañonasos!!!");
    }
    /*
    @Override
    public void fly(){}
    */
    public void toggleShield(){
        this.shield = !this.shield;
    }
}
