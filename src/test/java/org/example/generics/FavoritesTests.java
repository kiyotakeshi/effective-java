package org.example.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kiyota
 */
class FavoritesTests {

    @Test
    void name() {
        Favorites favorites = new Favorites();
        favorites.putFavorite(String.class, "java");
        favorites.putFavorite(String.class, "effective");
        favorites.putFavorite(Integer.class, 0xcafebabe);
        favorites.putFavorite(Class.class, Favorites.class);

        String favoriteString = favorites.getFavorite(String.class);
        int favoriteInteger = favorites.getFavorite(Integer.class);
        Class<?> favoriteClass = favorites.getFavorite(Class.class);

        System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());
    }
}