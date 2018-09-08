package designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class FootballTeam {
    private List<FootballPlayer> footballPlayers = new ArrayList<>();

    public FootballTeamIterator getIterator(){
        return new FootballTeamIterator();
    }

    public void addFootballPlayer(FootballPlayer footballPlayer) {
        footballPlayers.add(footballPlayer);
    }
    public void removeFootballPlayer(FootballPlayer footballPlayer) {
        footballPlayers.remove(footballPlayer);
    }

    private class FootballTeamIterator implements Iterator {

        private int position = 0;

        @Override
        public boolean hasNext() {
            return position < footballPlayers.size();
        }

        @Override
        public FootballPlayer next() {
            if (hasNext()) {
                return footballPlayers.get(position++);
            }
            return null;
        }
    }

}
