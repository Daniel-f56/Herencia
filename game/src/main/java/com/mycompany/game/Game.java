package com.mycompany.game;

import com.mycompany.game.spaceship.MilleniumFalcon;
import com.mycompany.game.spaceship.StellarDestroyer;

public class Game {

    public static void main(String[] args) {
        //Vamos a crear un "juego" de naves, como el space ship
        StellarDestroyer stellarDestroyer = new StellarDestroyer(true, true, "Navy!", true, 4, 20, 100, 200);
        
        stellarDestroyer.shoot();
        
        MilleniumFalcon milleniumFalcon = new MilleniumFalcon(true, 25, true, "Vuelo1", true, 25, 200, 56,500 );
        milleniumFalcon.shoot();
    }
}
