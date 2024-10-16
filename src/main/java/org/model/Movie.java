package org.model;

import java.util.Date;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Movie {

    private String title;
    private Date releaseDate;
    @SuppressWarnings("unused")
    private String duration;

    public  Movie(String title, Date releaseDate, String duration){
        super();
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    public Date getReleaseDate(){
        return releaseDate;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Movie other = (Movie) obj;
        if (releaseDate == null){
            if (other.releaseDate != null) return false;
        } else  if(!releaseDate.equals(other.releaseDate)) return false;
        if (title == null) {
            if (other.title != null) return false;
        } else if (!title.equals(other.title)) return false;
        return true;
    }
}