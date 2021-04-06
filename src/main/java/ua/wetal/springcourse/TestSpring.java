package ua.wetal.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        // DI через конструктор
        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);

        // DI через сеттер
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

//        musicPlayer.playMusic();

        musicPlayer.playMusicList();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
