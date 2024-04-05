package com.learning.core.day2session2;

public class DO2P62 {
	    private String playerName;
	    private float critic1;
	    private float critic2;
	    private float critic3;
	    private float avgRating;
	    private String coins;
	 
	    public DO2P62 (String playerName, float critic1, float critic2) {
	        this.playerName = playerName;
	        this.critic1 = critic1;
	        this.critic2 = critic2;
	        calculateAverageRating(critic1, critic2);
	        this.coins = calculateCoins();
	    }
	 
	    public DO2P62 (String playerName, float critic1, float critic2, float critic3) {
	        this.playerName = playerName;
	        this.critic1 = critic1;
	        this.critic2 = critic2;
	        this.critic3 = critic3;
	        calculateAverageRating(critic1, critic2, critic3);
	        this.coins = calculateCoins();
	    }
	 
	    public DO2P62(String string, float f) {
			// TODO Auto-generated constructor stub
		}

		private void calculateAverageRating(float critic1, float critic2) {
	        this.avgRating = (critic1 + critic2) / 2;
	    }
	 
	    private void calculateAverageRating(float critic1, float critic2, float critic3) {
	        this.avgRating = (critic1 + critic2 + critic3) / 3;
	    }
	 
	    private String calculateCoins() {
	        if (avgRating >= 7) {
	            return "Gold";
	        } else if (avgRating >= 5) {
	            return "Silver";
	        } else if (avgRating >= 2) {
	            return "Copper";
	        } else {
	            throw new NotEligibleException("Not Eligible");
	        }
	    }
	 
	    public void display() {
	        System.out.println(playerName + " " + avgRating + " " + coins);
	    }
	 
	    public static void main(String[] args) {
	        // Input 1
	    	DO2P62  player1 = new DO2P62 ("John", 9.3f, 9.67f, 8.7f);
	        player1.display();
	 
	        // Input 2
	        try {
	        	DO2P62 player2 = new DO2P62 ("Henry", 1.5f);
	            player2.display();
	        } catch (NotEligibleException e) {
	            System.out.println("NotEligible");
	        }
	    }
	}
	 
	class NotEligibleException extends RuntimeException {
	    public NotEligibleException(String message) {
	        super(message);
	    }
	}


