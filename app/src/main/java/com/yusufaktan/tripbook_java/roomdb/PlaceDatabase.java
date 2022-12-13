package com.yusufaktan.tripbook_java.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.yusufaktan.tripbook_java.model.Place;

@Database(entities = {Place.class}, version = 1)
public abstract class PlaceDatabase extends RoomDatabase {
    public abstract PlaceDao placeDao();
}
