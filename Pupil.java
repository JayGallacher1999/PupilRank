
import java.io.*;
import java.util.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.lang.Math.*;

public class pupil
{
    private String vName;
    private String vSurname;
    private String vScore;
    
    public Pupil()
    {
        vName = "";
        vSurname = "";
        vScore = "";
        
    }
    
    public void readDetails (String dataItems)
    {
        String[] rowItems = dataItems.split(",");
        
        vName = rowItems[0];