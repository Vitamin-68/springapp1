package ua.wetal.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// этот класс используется вместо XML конфига
@Configuration
//@ComponentScan("ua.wetal.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class MySpringConfig {

    // для того, чтобы вручную создать бины и внедрить зависимости мы отключили @ComponentScan в этом конфиг файле
    // и @Component с @Autowired в остальных классах
    // Создаем все это вруячную:
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(listGenre());
    }
    @Bean
    public List<Music> listGenre() {
        List<Music> listMusic = new ArrayList<>();
        listMusic.add(classicalMusic());
        listMusic.add(rockMusic());
        listMusic.add(jazzMusic());
        return listMusic;
//        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }

//    @Bean
//    public Computer computer() {
//        return new Computer(musicPlayer());
//    }
}

