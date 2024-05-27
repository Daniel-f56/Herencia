package com.mycompany.game.spaceship;

public class StellarDestroyer extends NuclearShip{
    private boolean hyperSpeed;
    private boolean shield;

    public StellarDestroyer(boolean hyperSpeed, boolean shield, String name, boolean armed, int crew, int damage, int health, int speed) {
        super(name, armed, crew, damage, health, speed);
        this.hyperSpeed = hyperSpeed;
        this.shield = shield;
    }

    
    
    @Override
    public void shoot(){
        super.shoot();
        System.out.println("Disparo con rayo laser");
    }
}
