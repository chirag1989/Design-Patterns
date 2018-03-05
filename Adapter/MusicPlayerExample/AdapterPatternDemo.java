package DesignPatterns.Adapter.MusicPlayerExample;

public class AdapterPatternDemo {

    public static void main(String... args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "hello.mp3");
        audioPlayer.play("vlc", "hello.vlc");
        audioPlayer.play("mp4", "hello.mp4");
        audioPlayer.play("avv", "hello.avv");
    }
}
