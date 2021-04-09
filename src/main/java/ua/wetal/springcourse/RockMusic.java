package ua.wetal.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component("musicBean")
// если бину не задавать ID явно в аннотации, то у бина будет ID равен имени класса с маленькой буквы
@Component
public class RockMusic implements Music {
    List<String> playList = new ArrayList<>();
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
