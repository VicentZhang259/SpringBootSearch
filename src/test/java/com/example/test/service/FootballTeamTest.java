package com.example.test.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.service.FootballTeam;

public class FootballTeamTest {
	
	@Test
	public void teamsWithMoreMatchesWonShouldBeGreater() {
	FootballTeam team_2 = new FootballTeam(2);
	FootballTeam team_3 = new FootballTeam(3);
	assertTrue(team_3.compareTo(team_2) == 1);
	assertTrue("team with " + team_2.getGamesWon()
	+ " games won should be ranked after the team with "
	+ team_3.getGamesWon() + " games won",
	team_2.compareTo(team_3) == -1);
	
	assertTrue("team with "+team_2.getGamesWon()+" games won should be ranked after the team with "+team_3.getGamesWon(),
			team_2.compareTo(team_2)==0);
	}
	
	

}
