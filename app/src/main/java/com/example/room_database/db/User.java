package com.example.room_database.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "user", indices = @Index(value = {"name","capital"}, unique = true))
public class User {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "capital")
    public String capital;

    @ColumnInfo(name = "region")
    public String region;

    @ColumnInfo(name = "sub_region")
    public String sub_region;

    @ColumnInfo(name = "population")
    public long population;


}
