/* Setting View */
loadmap *map name with suffix .map* //loads the map where the game can be played 
	-Ex: loadmap luca.map
gameplayer -add *player name* //adds a human player to the game. 
	-Ex: gameplayer -add player1
gameplayer -add *player name* *ai strategy* //adds an AI player to the game with the given strategy (aggressive, benevolent, cheater, random)
	Ex: gameplayer -add AIplayer1 aggressive
gameplayer -remove *player name* //removes player from the setting 
	Ex: gameplayer -remove player1
tournament -M listofmapfiles -P listofplayerstrategies -G numberofgames -D maxnumberofturns 
	-tournament mode, where multiple maps are played by multiple AI players with different strategies
	-listofmapfiles:  list of maps separated by ',' (no space)
	-listofplayerstrategies: aggressive|benevolent|cheater|random, can have multiples 
	-numberofgames: number of games played on each map 
	-maximumnumberofturns: maximum number of turns per game before game ends in draw
	Ex: tournament -M luca.map,board.map,map1.map -P aggressive,aggressive,benevolent -G 3 -D 100
populatecountries //initialize players and assign random countries for the on the map, as well as start the game
	
/* Startup Phase */
placearmy *country name* //place one army for the current player on the owned country 
placearmy //randomly place armies untill initial army count is exhausted, go to reinforcement phase

/* Any phase after Startup */
view : view percentages of the world controlled by each player, as well as their total army count and conquered Continents

/* Reinforcement Phase */
reinforce *country name* *amount* //reinforce country from specified amount of army 
	-Ex: reinforce Brazil 4 (if player currently controls brazil)
trade //toggles the trade page to trade in cards for extra reinforcement army limits

/* Attack Phase 1 */
attack *fromcountry* *tocountry* *numberofdicerolls*||-allout //issue an attack from player-owned country against enemy country 
	-Ex: attack Brazil Venezuela 3 
		 attack Brazil Venezuela -allout
-noattack //terminates attack phase for current player and goes to fortification phase 
		
/* Attack Phase 2 */
defend *numofdice* //defend the attack rolling number of dices not exceeding 2

/* Attack Phase 3 */ 
attackmove *numberofarmy* //move a certain amount of army to target conquered country after a successful attack 
	-Ex: attackmove 5 (if attacking country has 6 or more armycount)

/* Fortification Phase */
fortify *from country name* *to country name* *armycount* //transfer units from an owned country to another that is connected
	-Ex: fortify Venezuela Central-America 2
