package DesignPatterns.Adapter.MusicPlayerExample;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audiotype) {
        if ("vlc".equalsIgnoreCase(audiotype)) {
            advancedMediaPlayer = new VlcPlayer();
        }
        else if ("mp4".equalsIgnoreCase(audiotype)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVlc(fileName);
        }
        else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
