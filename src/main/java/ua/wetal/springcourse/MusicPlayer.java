package ua.wetal.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

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

    public String playMusic() {
//        System.out.println("Playing: " + music.getSong());
        return "Playing: " + classicalMusic.getSong();
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
    }
}
