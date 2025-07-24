package com.std.sbb;

import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
class PersonController {

    int lastId;
    List<Person> people;

    PersonController() {
        lastId = 0;
        people = new ArrayList<>();
    }

    @GetMapping("/home/personadd")
    @ResponseBody
    public String Personadd(@RequestParam("name") String name, @RequestParam("age") int age) {
        lastId++;
        Person person = new Person(age, lastId, name);
        people.add(person);
        return String.format("%d번째 사람이 추가", person.getId());
    }

    @GetMapping("/home/personlist")
    @ResponseBody
    public List<Person> getPeople() {
        System.out.println(people);
        return people;
    }

    @GetMapping("/home/personremove")
    @ResponseBody
    public String Personremove(@RequestParam("id") int id) {
            for (int i = 0; i < people.size(); i++) {
                if (people.get(i).getId() == id) {
                    people.remove(i);
                    return String.format("%d번째 사람이 삭제", id);
                }
            }
        return String.format("존재하지않는사람입니다.");
    }
}

@AllArgsConstructor
@Getter
@Setter
@ToString
class Person {
    private int age;
    private int id;
    private String name;
}
