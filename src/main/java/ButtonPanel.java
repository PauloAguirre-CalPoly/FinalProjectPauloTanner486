import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ButtonPanel extends JPanel implements PropertyChangeListener {


    JButton bStop;
    JButton gas;
    ButtonPanel() {
        createButton();
    }

    public void createButton(){
        bStop = new JButton("Break Peddle");
        gas = new JButton("Gas Peddle");
        bStop.addActionListener(e-> MotivController.bStopAction());
        gas.addActionListener(e-> MotivController.gasAction());
        setLayout(new GridLayout(1,2));
        add(bStop);
        add(gas);
    }

    @Override
    protected void paintComponent(Graphics g){

        super.paintComponent(g);
        setBackground(Color.PINK);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}
