package ua.wetal.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> playList = new ArrayList<>();
    {
        playList.add("Hungarian Rhapsody");
        playList.add("Symphony No 5");
        playList.add("The four season");
    }


    @Override
    public List<String> getSong() {
        return playList;
    }
}
