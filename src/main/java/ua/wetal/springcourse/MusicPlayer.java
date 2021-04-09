package ua.wetal.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
//    @Autowired
//    @Qualifier("classicalMusic")
//    private Music music;

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
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
        return "Playing " + music1.getSong() + ", " + music2.getSong();
//        return "Playing " + music.getSong();
////        System.out.println("Playing: " + music.getSong());
//        return "Playing: " + classicalMusic.getSong();
////        System.out.println("Playing: " + classicalMusic.getSong());
////        System.out.println("Playing: " + rockMusic.getSong());
    }
}
