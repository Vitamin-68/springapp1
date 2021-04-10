package ua.wetal.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
//    @Autowired
//    @Qualifier("classicalMusic")
//    private Music music;


    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

// 3. ID через поле
//    @Autowired
//    private Music music;

    // 1. Внедрение зависимости (ID) через конструктор:
//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    // 2. ID через сеттер (название метода вообще может быть любым!):
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void playMusic(MusicGenre musicGenre) {
        final Random random = new Random();
        if (musicGenre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(random.nextInt(3)));
        } else {
            System.out.println(rockMusic.getSong().get(random.nextInt(3)));
        }
    }
}
