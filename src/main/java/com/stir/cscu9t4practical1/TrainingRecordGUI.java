
package com.stir.cscu9t4practical1;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class TrainingRecordGUI extends JFrame implements ActionListener {



 /**
     * 
 */
private static final long serialVersionUID = 1L;
 private static final Object Remove = null;
 private JTextField name = new JTextField(30);
private JTextField day = new JTextField(2);
 private JTextField month = new JTextField(2);
 private JTextField year = new JTextField(4);
 private JTextField hours = new JTextField(2);
 private JTextField mins = new JTextField(2);
 private JTextField secs = new JTextField(2);
 private JTextField dist = new JTextField(4);
 private JTextField terrain = new JTextField(8);
 private JTextField temp = new JTextField(8);
 private JTextField Repetitlons= new JTextField(2);
 private JTextField Recovery = new JTextField(2);
 private JTextField Where = new JTextField(7);

 private JLabel labn = new JLabel(" Name:");
 private JLabel labd = new JLabel(" Day:");
 private JLabel labm = new JLabel(" Month:");
 private JLabel laby = new JLabel(" Year:");
 private JLabel labh = new JLabel(" Hours:");
 private JLabel labmm = new JLabel(" Mins:");
 private JLabel labs = new JLabel(" Secs:");
 private JLabel terrainLabel = new JLabel("Terrain:");
 private JLabel tempLabel = new JLabel("Temperature:");
 private JLabel repetitionsLabel = new JLabel("Repetitions:");
 private JLabel recoveryLabel = new JLabel("Recovery:");
 private JLabel whereLabel = new JLabel("Location:");
 private JLabel labdist = new JLabel(" Distance (km):");
 private JButton addR = new JButton("Add");
 private JButton lookUpByDate = new JButton("Look Up");
 private JButton lookupAll = new JButton("Look Up All");
 private JButton remove = new JButton("Remove");








 private TrainingRecord myAthletes = new TrainingRecord();

 private JTextArea outputArea = new JTextArea(5, 50);

 public static void main(String[] args) {
     TrainingRecordGUI applic = new TrainingRecordGUI();
 } // main




// set up the GUI 
 public TrainingRecordGUI() {
 super("Training Record");
 setLayout(new FlowLayout());
 add(labn);
add(name);
 name.setEditable(true);
 add(labd);
 add(day);
 day.setEditable(true);
add(labm);
 add(month);
 month.setEditable(true);
 add(laby);
 add(year);
 year.setEditable(true);
 add(labh);
 add(hours);
 hours.setEditable(true);
 add(labmm);
 add(mins);
 mins.setEditable(true);
 add(labs);
 add(secs);
 secs.setEditable(true);

 
 add(terrain);
 add(dist);
 dist.setEditable(true);
 
 add(tempLabel);
 add(dist);
 dist.setEditable(true);
 
 add(repetitionsLabel );
 add(dist);
 dist.setEditable(true);
 
 add(Recovery);
 add(dist);
 dist.setEditable(true);
 
 add(whereLabel);
 add(dist);
 dist.setEditable(true);
 
 
 
 
 

 add(addR);
 addR.addActionListener(this);
 add(lookUpByDate);
 lookUpByDate.addActionListener(this);
 add(outputArea);
 outputArea.setEditable(false);
 setSize(720, 200);
 setVisible(true);
 blankDisplay();
    }



 // To save typing in new entries while testing, uncomment
 // the following lines (or add your own test cases)

//    } // constructor
//


 // listen for and respond to GUI events 
 public void actionPerformed(ActionEvent event) {
String message = "";
if (event.getSource() == addR) {
 message = addEntry("generic");
}
 if (event.getSource() == lookUpByDate) {
 message = lookupEntry();

}
 if (event.getSource() == lookupAll()) {
 message = lookupEntry();
 }
 if (event.getSource() == Remove) {
 message = remove() ;
        }
    }
//        }

//        }
//        outputArea.setText(message);


//      TrainingRecordGUI1() {

 // actionPerformed



 public String addEntry(String what) {
 String message = "Record added\n";
 System.out.println("Adding "+what+" entry to the records");
 String n = name.getText();
 int s = Integer.parseInt(month.getText());
 int a = Integer.parseInt(day.getText());
 int u = Integer.parseInt(year.getText());
 float km = java.lang.Float.parseFloat(dist.getText());
 int h = Integer.parseInt(hours.getText());
 int mm = Integer.parseInt(mins.getText());
 int L = Integer.parseInt(secs.getText());
 
 
 
 
 
 Entry e = new Entry(n, s, a, a, h, mm, L, km);
 myAthletes.addEntry(e);
 return message ;
    }

//        try {
//            String ter = terrain. getText();
//            String tem = tempo. getText();
//            int rec = in. getText();

//        }
//    }


 public String lookupEntry() {
 int s = Integer.parseInt(month.getText());
 int a = Integer.parseInt(day.getText());
int u= Integer.parseInt(year.getText());
 outputArea.setText("looking up record ...");
 String message = myAthletes.lookupEntry(s, a, u);
 return message ;
    }

 public String lookupAll () {
 int s = Integer.parseInt(month.getText());
 int a = Integer.parseInt(day.getText());
 int u = Integer.parseInt(year.getText());
 outputArea.setText("looking up record ...");
 String message = myAthletes.lookupEntry(s, a, u);
 return message;
    }



 public void blankDisplay() {
 name.setText("");
day.setText("");
 month.setText("");
 year.setText("");
 hours.setText("");
 mins.setText("");
 secs.setText("");
 dist.setText("");
    }



//    }// blankDisplay
 // Fills the input fields on the display for testing purposes only

 public void fillDisplay(Entry ent) {
 name.setText(ent.getName());
 day.setText(String.valueOf(ent.getDay()));
 month.setText(String.valueOf(ent.getMonth()));
 year.setText(String.valueOf(ent.getYear()));
 hours.setText(String.valueOf(ent.getHour()));
 mins.setText(String.valueOf(ent.getMin()));
 secs.setText(String.valueOf(ent.getSec()));
 dist.setText(String.valueOf(ent.getDistance()));
    }
//    }



// TrainingRecordGUI



 public String lookupAll1 () {
 int s = Integer.parseInt(month.getText());
int a = Integer.parseInt(day.getText());
 int u = Integer.parseInt(year.getText());
 outputArea.setText("looking up record ...");
 String message = myAthletes.lookupEntry(s, a, u);
 return message;
}



 public String remove () {
 String n = name.getText();
 int s = Integer.parseInt(month.getText());
 int a = Integer.parseInt(day.getText());
 int u = Integer.parseInt(year.getText());
 outputArea.setText("looking up record ...");
 String message = myAthletes.removeEntry(n,s, a, u);
 return message ;
    }
}


