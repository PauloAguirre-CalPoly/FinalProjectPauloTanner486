import java.awt.*;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class MotivData extends PropertyChangeSupport {
    /**
     * Constructs a {@code PropertyChangeSupport} object.
     *
     * @param sourceBean The bean to be given as the source for any events.
     */
    private static MotivData instance;
    private ArrayList<String> stream;
    private ArrayList<String> jData;

    public MotivData() {
        super(new Object());
        stream = new ArrayList<>();
        jData = new ArrayList<>();

    }

    public void addData(String str){
        stream.add(str);
    }

    public void addJData(String str){jData.add(str);
    }
    public ArrayList<String> dataStream() {
        return stream;
    }

    public ArrayList<String> jData() {return jData;}

    public static MotivData getInstance() {
        if (instance == null) {
            instance = new MotivData();
        }
        return instance;
    }


    public void repaint() {
        firePropertyChange("repaint", null, null);
    }

}
