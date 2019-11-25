package com.ladimirovich.springlesson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MusicPlayer {
    private List<Music> musics;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int volume;


    public MusicPlayer() {
        this.musics = new ArrayList<>();
    }

    public void playMusic(){
        Iterator<Music> musicIterator = musics.iterator();
        while (musicIterator.hasNext()) {
            System.out.println("Playing " + musicIterator.next().getSong());
        }
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


}
