package org.model;

public enum Race{
    HOBBIT("Hobbit", false, Movie.Alignment.GOOD), MAIA("Maia", true, Movie.Alignment.GOOD),
    MAN("Man", false, Movie.Alignment.NEUTRAL), ELF("Elf", true, Movie.Alignment.GOOD),
    DWARF("Dwarf", false, Movie.Alignment.GOOD), ORC("Orc", false, Movie.Alignment.EVIL);

    private final String name;
    private final boolean immortal;
    private Movie.Alignment alignment;

    Race(String name, boolean immortal, Movie.Alignment alignment){
        this.name = name;
        this.immortal = immortal;
        this.alignment = alignment;
    }

    public String getName(){
        return  name;
    }

    public boolean isImmortal(){
        return immortal;
    }

    public Movie.Alignment getAlignment(){
        return alignment;
    }

    @Override
    public String toString(){
        return  "Race [name=" + name + ", immortal=" + immortal + "]";
    }
}
