package j14l2;

import java.io.Serializable;

public class LabOne implements Serializable {
    protected static int regNo;
    protected static String name;
    protected static double[] marks = {87,68,96,67,98};

    public LabOne(int regNo, String name, double[] marks) {
        this.regNo = regNo;
        this.name = name;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double[] marks) {
        
    }
    
    public static void main(String args[]) {
    	
    	System.out.println(regNo);
    	System.out.println(name);
    	System.out.println(marks);
    	
    }
}
