package services;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.model.Race.DWARF;
import static org.model.Race.ELF;
import static org.model.Race.HOBBIT;
import static org.model.Race.MAN;
import static org.model.Race.MAIA;
import static org.model.Race.ORC;


import org.model.Movie;
import org.model.Ring;
import org.model.TolkienCharacter;

public class DataService {
    static final String ERROR_MESSAGE_EXAMPLE_FOR_ASSERTION = "{} assertion : {}\n";

    final TolkienCharacter frodo = new TolkienCharacter("Frodo", 33, HOBBIT);
    final TolkienCharacter sam = new TolkienCharacter("Sam", 38, HOBBIT);
    final TolkienCharacter merry = new TolkienCharacter("Merry", 36, HOBBIT);
    final TolkienCharacter pippin = new TolkienCharacter("Pippin", 28, HOBBIT);
    final TolkienCharacter gandalf = new TolkienCharacter("Gandalf", 2020, MAIA);
    final TolkienCharacter gimli = new TolkienCharacter("Gimli", 139, DWARF);
    final TolkienCharacter legolas = new TolkienCharacter("Legolas", 1000, ELF);
    final TolkienCharacter aragorn = new TolkienCharacter("Aragorn", 87, MAN);
    final TolkienCharacter boromir = new TolkienCharacter("Boromir", 37, MAN);
    final TolkienCharacter sauron = new TolkienCharacter("Sauron", 50000, MAIA);
    final TolkienCharacter galadriel = new TolkienCharacter("Galadriel", 3000, ELF);
    final TolkienCharacter elrond = new TolkienCharacter("Elrond", 3000, ELF);
    final TolkienCharacter guruk = new TolkienCharacter("Guruk", 20, ORC);

    final Movie theFellowshipOfTheRing = new Movie("the fellowship of the Ring", new Date(), "178 min");
    final Movie theReturnOfTheKing = new Movie("the Return of the King", new Date(), "201 min");
    final Movie theTwoTowers = new Movie("the two Towers", new Date(), "179 min");

    public List<TolkienCharacter> getFellowship(){
        final List<TolkienCharacter> fellowshipOftheRing = new ArrayList<>();

        fellowshipOftheRing.add(frodo);
        fellowshipOftheRing.add(sam);
        fellowshipOftheRing.add(merry);
        fellowshipOftheRing.add(pippin);
        fellowshipOftheRing.add(gandalf);
        fellowshipOftheRing.add(legolas);
        fellowshipOftheRing.add(gimli);
        fellowshipOftheRing.add(aragorn);
        fellowshipOftheRing.add(boromir);
        return fellowshipOftheRing;
    }

    public List<TolkienCharacter> getOrcsWithHobbitPrisoners(){
        final List<TolkienCharacter> orcsWithHobbitPrisoners = new ArrayList<TolkienCharacter>();
        orcsWithHobbitPrisoners.add(guruk);
        orcsWithHobbitPrisoners.add(merry);
        orcsWithHobbitPrisoners.add(pippin);
        return orcsWithHobbitPrisoners;
    }

    public TolkienCharacter getFellowshipCharacter(String name){
        List<TolkienCharacter> list = getFellowship();
        return list.stream().filter(s -> s.getName().equals(name)).findFirst().orElseGet(() -> null);
    }

    public Map<Ring, TolkienCharacter> getRingBearers(){

        Map<Ring, TolkienCharacter> ringBearers = new HashMap<>();

        ringBearers.put(Ring.nenya, galadriel);
        ringBearers.put(Ring.narya, gandalf);
        ringBearers.put(Ring.oneRing, frodo);
        ringBearers.put(Ring.vilya, elrond);
        return ringBearers;
    }
}
