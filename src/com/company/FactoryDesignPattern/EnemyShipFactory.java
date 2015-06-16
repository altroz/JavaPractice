package com.company.FactoryDesignPattern;

public class EnemyShipFactory {
	//view sourceprint?
	// This is a factory thats only job is creating ships
	// By encapsulating ship creation, we only have one
	// place to make modifications

	    // This could be used as a static method if we
	    // are willing to give up subclassing it
	    public EnemyShip makeEnemyShip(String newShipType){
	        EnemyShip newShip = null;
	        if (newShipType.equals("U")){
	            return new UFOEnemyShip();
	        } else
	        if (newShipType.equals("R")){
	            return new RocketEnemyShip();
	        } else
	        if (newShipType.equals("B")){
	            return new BigUFOEnemyShip();
	        } else return null;

	    }

	}
