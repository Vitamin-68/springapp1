package ua.wetal.springcourse;

// ДЗ сделать список из 3 муз жанров через List и чобы плеер воспроизводил все 3 жанра

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private List<Music> musicList = new ArrayList<>();

//    после добавления листа убираем это поле:
//    private Music music;

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {}

    //IoC
//    public MusicPlayer(Music music) {
//        this.music = music;

//    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
//    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
