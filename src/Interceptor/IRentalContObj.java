package Interceptor;

import App.Movie;

// This is a context object interface

public interface IRentalContObj {
    public Movie getMovie();
    public int getDaysRented();
}