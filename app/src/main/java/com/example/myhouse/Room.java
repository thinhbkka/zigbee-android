package com.example.myhouse;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class Room {

    public int device1;
    public int humi;
    public int temp;

    public Room() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Room(int device1, int humi, int temp) {
        this.device1 = device1;
        this.humi = humi;
        this.temp = temp;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("device1", device1);
        result.put("humi", humi);
        result.put("temp", temp);
        return result;
    }

}
