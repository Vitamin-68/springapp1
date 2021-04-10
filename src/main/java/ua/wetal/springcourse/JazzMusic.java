package ua.wetal.springcourse;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {
    private List<String> playList = new ArrayList<>();
    @Override
    public List<String> getSong() {
        return playList;
    }
}
