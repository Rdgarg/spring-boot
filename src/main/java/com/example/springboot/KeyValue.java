package com.example.springboot;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "keyValueStore")
public class KeyValue {


    @Id
    private String id;

    private String value;

    protected KeyValue() {

    }

    public KeyValue(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValue{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
