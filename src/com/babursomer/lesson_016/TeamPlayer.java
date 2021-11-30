package com.babursomer.lesson_016;

import com.util.BAUtils;

public class TeamPlayer {
	public static void main(String[] args) {
		
		BAUtils.header("Takım Oyuncuları");
		int size = BAUtils.readInt("Takımın kaç oyuncusu var: ");
		
		String[] teamPlayers = new String[size];
		
		for (int i = 0; i < teamPlayers.length; i++) {
			teamPlayers[i] = BAUtils.readString("Oyuncu adı");
		}
		
		int i = 1;
		while (i <= size) {
			System.out.println(i + ". Oyuncu: " + teamPlayers[i - 1]);
			i++;
		}
		
		BAUtils.footer();
	}
	
}
