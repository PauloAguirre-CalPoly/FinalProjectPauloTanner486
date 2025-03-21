import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MotivController implements MouseListener, MouseMotionListener {

    public static void bStopAction(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = now.format(formatter);
        System.out.println("Button: Break, Time: " + formattedTime);
        MotivData.getInstance().addJData("Button: Break, Time: " + formattedTime);
    }

    public static void gasAction(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = now.format(formatter);
        System.out.println("Button: Gas, Time: " + formattedTime);
        MotivData.getInstance().addJData("Button: Gas, Time: " + formattedTime);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Component c = e.getComponent();
        System.out.println(c);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Component c = e.getComponent();
        System.out.println(c);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
