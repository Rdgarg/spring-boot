package com.example.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/keyValueStore")
public class KeyValueStore {

    Map<String, String> keyValueStore;

    private final KeyValueDAO keyValueDAO;

    @Autowired
    KeyValueStore(KeyValueDAO keyValueDAO) {
        this.keyValueDAO = keyValueDAO;
        this.keyValueStore = new HashMap<>();
        keyValueStore.put("a", "Ronak");
    }

    @GetMapping("get/{key}")
    public KeyValue get(@PathVariable String key) {

        Optional<KeyValue> p = keyValueDAO.findById(key);
         return p.get();
    }

    @GetMapping("all/")
    public List<String> find() {
        List<String> to = getAllValueFromIterator(keyValueDAO.findAll());
        return to;
    }

    private List<String> getAllValueFromIterator(Iterable<KeyValue> all) {

        List<String> resultList = new ArrayList<>();

        for (KeyValue keyValue : all) {
            String ans = keyValue.toString();
            resultList.add(ans);
        }
        return resultList;

    }

    @GetMapping("put")
    public void put(@JsonArg("key") String key,
                    @JsonArg("value") String value) {
        System.out.println("Thi sis key");
        System.out.println(key);
        System.out.println("thi sis value");
        System.out.println(value);
        keyValueStore.put(key, value);
        keyValueDAO.save(new KeyValue(key, value));
    }


}
