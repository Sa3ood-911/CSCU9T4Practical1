package com.stir.cscu9t4practical1;




import java.util.Calendar;




public class SprintEntry extends Entry {




private int repetitions ;
private int recovery;



public SprintEntry (String n, int d, int m, int y, int h, int min, int s, float dist,int repti,int rec) {
super(n,d,m,y,h,min,s,dist);
this.repetitions=repti;
this.recovery=rec;
Calendar inst = Calendar.getInstance();
inst.set(y, m-1,d,h,min,s);
dateAndTime = inst;
distance = dist;
}
public int getrepetitions(){
return repetitions;
}



public void setrepetitions(int repet) {



this.repetitions =repet;
}



public int getrecovery(){
return recovery;
}



public void setrecovery(int rec) {



this.recovery = rec;
}



public String getEntry() {
String result =getName()+"ran" +getDistance() +"km in"
+getHour()+":"+getMin()+":"+getSec()+"on"
+getDay()+"/"+getMonth()+"/"+getYear()+"\n"+getrepetitions()+":"+getrecovery()+":";
return result;
}
}

