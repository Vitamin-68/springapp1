package ua.wetal.springcourse;

import org.springframework.stereotype.Component;

//@Component("musicBean")
// если бину не задавать ID явно в аннотации, то у бина будет ID равен имени класса с маленькой буквы
@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
