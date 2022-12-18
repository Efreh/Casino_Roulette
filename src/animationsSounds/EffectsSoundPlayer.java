package animationsSounds;

import java.io.*;
import javax.sound.sampled.*;

public class EffectsSoundPlayer {

    private float volume = 0.8f;
    private File file;
    private AudioInputStream ais;
    private Clip clip;
    private FloatControl volumeControl;

    public void runLuse() {
        try {
            file = new File("src/musicRes/ebanyii-v-rot-etogo-kazino.wav");
            ais = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(ais);
            volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            volumeControl.setValue((volumeControl.getMaximum() - volumeControl.getMinimum()) * volume + volumeControl.getMinimum());
            clip.setFramePosition(0);
            clip.start();

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } catch (NullPointerException exp) {
        }
    }

    public void runRoulettRun() {
        try {
            file = new File("src/musicRes/ruletka-v-kazino-vraschenie-sharika-36920.wav");
            ais = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(ais);
            volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            volumeControl.setValue((volumeControl.getMaximum() - volumeControl.getMinimum()) * volume + volumeControl.getMinimum());
            clip.setFramePosition(0);
            clip.start();

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } catch (NullPointerException exp) {
        }
    }

    public void setEffectMusicVolume(float f) {
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
        volume = f;
    }
}
