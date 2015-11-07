package com.simpragma.baseapp.models;

import java.io.Serializable;

/**
 * Created by swagataacharyya.
 */
public class GsonData implements Serializable {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GsonData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
