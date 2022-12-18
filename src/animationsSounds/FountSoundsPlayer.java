package animationsSounds;

import java.io.*;
import javax.sound.sampled.*;

public class FountSoundsPlayer {

    private float fountVolume = 0.7f;
    private File fountFile = new File("src/musicRes/fount_music1.wav");
    private AudioInputStream fountAis;
    private Clip fountClip;
    private FloatControl fountVolumeControl;

    public FountSoundsPlayer() {
        try {
            fountAis = AudioSystem.getAudioInputStream(fountFile);

            fountClip = AudioSystem.getClip();

            fountClip.open(fountAis);

            fountVolumeControl = (FloatControl) fountClip.getControl(FloatControl.Type.MASTER_GAIN);
            fountVolumeControl.setValue((fountVolumeControl.getMaximum() - fountVolumeControl.getMinimum()) * fountVolume + fountVolumeControl.getMinimum());

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        }
    }

    public void runFountMusic() {
        fountClip.setFramePosition(0);
        fountClip.start();
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

        float min = fountVolumeControl.getMinimum();
        float max = fountVolumeControl.getMaximum();
        fountVolumeControl.setValue((max - min) * f + min);
    }
}
