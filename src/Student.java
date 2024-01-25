public class Student extends Person {
    private double gpa; //gpa is only unique variable for this class

    public Student(String name, String surname, double gpa){
        super(name, surname); //inherited variables
        this.gpa = gpa;
    }

    public String toString(){
        return "Student: " + super.toString(); //inherited function
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(){
        this.gpa = gpa;
    }

    public double getPaymentAmount(){
        return (getGpa() > 2.67) ? 36660.00 : 0.00;
    }

    @Override
    public int compareTo(Person o){
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}
