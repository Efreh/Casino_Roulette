package animationsSounds;

import java.io.*;
import javax.sound.sampled.*;

public class SoundsPlayer {

    SoundVariables sv = new SoundVariables();
    private float fountVolume = 0.7f;
    private static float effectVolume = 0.7f;
    private InputStream bufferedIn;
    private AudioInputStream ais;
    private Clip clip;
    private FloatControl volumeControl;

    public SoundsPlayer() {
        try {
            bufferedIn = new BufferedInputStream(SoundsPlayer.class.getResourceAsStream(sv.getFountMusic()));

            ais = AudioSystem.getAudioInputStream(bufferedIn);

            clip = AudioSystem.getClip();

            clip.open(ais);

            volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            volumeControl.setValue((volumeControl.getMaximum() - volumeControl.getMinimum()) * fountVolume + volumeControl.getMinimum());
            clip.setFramePosition(0);
            clip.start();

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        }
    }

    public SoundsPlayer(String path) {
        try {
            bufferedIn = new BufferedInputStream(SoundsPlayer.class.getResourceAsStream(path));

            ais = AudioSystem.getAudioInputStream(bufferedIn);

            clip = AudioSystem.getClip();

            clip.open(ais);

            volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            volumeControl.setValue((volumeControl.getMaximum() - volumeControl.getMinimum()) * effectVolume + volumeControl.getMinimum());
            clip.setFramePosition(0);
            clip.start();

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        }
    }

    public void setFountMusicVolume(float f) {
        if (f == 0) {
            f = 0.0f;
        }
        if (f > 0 && f <= 10) {
            f = 0.1f;
        }
        if (f >= 11 && f <= 20) {
            f = 0.2f;
        }
        if (f >= 21 && f <= 30) {
            f = 0.3f;
        }
        if (f >= 31 && f <= 40) {
            f = 0.4f;
        }
        if (f >= 41 && f <= 50) {
            f = 0.5f;
        }
        if (f >= 51 && f <= 60) {
            f = 0.6f;
        }
        if (f >= 61 && f <= 70) {
            f = 0.7f;
        }
        if (f >= 71 && f <= 80) {
            f = 0.8f;
        }
        if (f >= 81 && f <= 90) {
            f = 0.9f;
        }
        if (f >= 91 && f <= 100) {
            f = 1f;
        }

        float min = volumeControl.getMinimum();
        float max = volumeControl.getMaximum();
        volumeControl.setValue((max - min) * f + min);
    }
    public static void setEffectMusicVolume(float f) {
        if (f == 0) {
            f = 0.0f;
        }
        if (f > 0 && f <= 10) {
            f = 0.1f;
        }
        if (f >= 11 && f <= 20) {
            f = 0.2f;
        }
        if (f >= 21 && f <= 30) {
            f = 0.3f;
        }
        if (f >= 31 && f <= 40) {
            f = 0.4f;
        }
        if (f >= 41 && f <= 50) {
            f = 0.5f;
        }
        if (f >= 51 && f <= 60) {
            f = 0.6f;
        }
        if (f >= 61 && f <= 70) {
            f = 0.7f;
        }
        if (f >= 71 && f <= 80) {
            f = 0.8f;
        }
        if (f >= 81 && f <= 90) {
            f = 0.9f;
        }
        if (f >= 91 && f <= 100) {
            f = 1f;
        }
        effectVolume = f;
    }
}
