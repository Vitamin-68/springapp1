package ua.wetal.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> playList = new ArrayList<>();
    {
        playList.add("Wind cries Mary");
        playList.add("Dancing in the Dark");
        playList.add("Tear in My Heart");
    }


    @Override
    public List<String> getSong() {
        return playList;
    }
}
