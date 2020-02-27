package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingRegister {
    private Map<Film, List<Rating>> filmRatings;
    private HashMap<Person, HashMap<Film, Rating>> personFilmRatings;


    public RatingRegister() {
        filmRatings = new HashMap<Film, List<Rating>>();
        personFilmRatings = new HashMap<Person, HashMap<Film, Rating>>();

    }

    public void addRating(Film film, Rating rating) {
        List<Rating> ratings = filmRatings.get(film);
        if (ratings == null) {
            ratings = new ArrayList<Rating>();
            ratings.add(rating);
            filmRatings.put(film, ratings);
        } else {
            ratings.add(rating);

        }

        filmRatings.put(film, ratings);
    }

    public List<Rating> getRatings(Film film) {
        if (filmRatings.containsKey(film)) {
            return filmRatings.get(film);
        }
        return null;
    }

    public Map<Film, List<Rating>> filmRatings() {
        return filmRatings;
    }

    public void addRating(Person person, Film film, Rating rating) {
        HashMap<Film, Rating> filmRatingHashMap = personFilmRatings.get(person);
        if (filmRatingHashMap == null) {
            filmRatingHashMap = new HashMap<Film, Rating>();
            filmRatingHashMap.put(film, rating);
            personFilmRatings.put(person, filmRatingHashMap);
        } else {
            if (!filmRatingHashMap.containsKey(film)) {
                filmRatingHashMap.put(film, rating);
            }
        }
          addRating(film,rating);


    }

    public Rating getRating(Person person, Film film) {
        if (personFilmRatings.containsKey(person)) {

            Rating reviewerRate = personFilmRatings.get(person).get(film);
            if (reviewerRate != null) {
                return reviewerRate;
            } else {

                return Rating.NOT_WATCHED;
            }
        }
        return null;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (personFilmRatings.containsKey(person)) {

            return personFilmRatings.get(person);
        }else {
            HashMap<Film,Rating>unReviewed=new HashMap<Film,Rating>();

            return unReviewed;
        }


    }
    public List<Person> reviewers() {
        return new ArrayList<Person>(personFilmRatings.keySet());
    }

}
