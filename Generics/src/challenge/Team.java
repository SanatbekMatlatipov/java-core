package challenge;

public abstract class Team implements Comparable<Team> {
    private String name;
    private Integer score;

    public Team(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setScore(Integer score) {
        this.score = Math.max(0, score);
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public int compareTo(Team team) {
        return this.score > team.score ? -1 : 1;
    }

}
