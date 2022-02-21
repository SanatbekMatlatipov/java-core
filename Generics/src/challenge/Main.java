package challenge;

public class Main {
    // Create a generic class to implement a league table for a sport.
    // The class should allow teams to be added to the list, and store
    // a list of teams that belong to the league.
    //
    // Your class should have a method to print out the teams in order,
    // with the team at the top of the league printed first.
    //
    // Only teams of the same type should be added to any particular
    // instance of the league class - the program should fail to compile
    // if an attempt is made to add an incompatible team.
    public static void main(String[] args) {
        BasketballTeam philadelphia = new BasketballTeam("Philadelphia", 8);
        BasketballTeam losAngelesLakers = new BasketballTeam("Los Angeles Lakers", 9);
        BasketballTeam bostonCeltics = new BasketballTeam("Boston Celtics", 7);
        BasketballTeam newYorkKicks = new BasketballTeam("New York Kicks", 10);

        FootballTeam manchesterUnited = new FootballTeam("Manchester United", 10);
        FootballTeam liverpool = new FootballTeam("Liverpool", 9);
        FootballTeam chelsea = new FootballTeam("Chelsea", 2);
        FootballTeam milan = new FootballTeam("Milan", 8);

        HockeyTeam detroitRedWings = new HockeyTeam("Detroit Red Wings", 10);
        HockeyTeam edmonton = new HockeyTeam("Edmonton", 9);
        HockeyTeam montrealCanadians = new HockeyTeam("Montreal Canadians", 2);
        HockeyTeam bostonBruins = new HockeyTeam("Boston Bruins", 7);

        League<FootballTeam> footballLeague = new League<>("Premier League");
        footballLeague.addTeam(manchesterUnited);
        footballLeague.addTeam(liverpool);
        footballLeague.addTeam(chelsea);
        footballLeague.addTeam(milan);

        League<BasketballTeam> nationalBasketballAssociationLeague = new League<>("National Basketball Association");
        nationalBasketballAssociationLeague.addTeam(philadelphia);
        nationalBasketballAssociationLeague.addTeam(losAngelesLakers);
        nationalBasketballAssociationLeague.addTeam(bostonCeltics);
        nationalBasketballAssociationLeague.addTeam(newYorkKicks);

        League<HockeyTeam> nationalHockeyLeague= new League<>("National Hockey League");
        nationalHockeyLeague.addTeam(detroitRedWings);
        nationalHockeyLeague.addTeam(edmonton);
        nationalHockeyLeague.addTeam(montrealCanadians);
        nationalHockeyLeague.addTeam(bostonBruins);

        footballLeague.showLeagueTable();
        nationalHockeyLeague.showLeagueTable();
        nationalBasketballAssociationLeague.showLeagueTable();
    }
}
