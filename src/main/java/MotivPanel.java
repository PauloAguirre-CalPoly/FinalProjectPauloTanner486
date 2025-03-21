import uk.co.caprica.vlcj.player.base.MediaPlayer;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MotivPanel extends JPanel implements PropertyChangeListener {


    public MotivPanel(BorderLayout borderLayout) {
        System.setProperty("jna.library.path", "C:/Program Files/VideoLAN/VLC");
        setLayout(borderLayout);

    }

    public void creatVideoPlayer() {
        EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        add(mediaPlayerComponent, BorderLayout.CENTER);

        String vPath = "C:\\Users\\aguir\\IdeaProjects\\FinalProjectPauloTanner\\DriveSim.mp4";

        MediaPlayer mediaPlayer = mediaPlayerComponent.mediaPlayer();
        mediaPlayer.media().play(vPath);
    }

    @Override
    protected void paintComponent(Graphics g){
        //ball set goes here
        super.paintComponent(g);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        repaint();
    }
}
