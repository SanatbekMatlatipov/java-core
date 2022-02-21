package challenge;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teamList;

    public League(String name) {
        teamList = new ArrayList<>();
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (teamList.contains(team)) {
            System.out.println(team.getName() + " is already on this league");
            return false;
        }
        System.out.println(team.getName() + " team is added to the league of " + this.name);
        this.teamList.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(this.teamList);
        System.out.println("============");
        System.out.println(this.name + " ranking result:");
        for (T t: this.teamList) {
            System.out.println(t.getName() + " : " + t.getScore());
        }
    }

}
