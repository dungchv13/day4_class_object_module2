public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }
    public boolean getOn(){
        return on;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(){
    }
    public String display(){
        if(getOn()){
            return "fan{ speed: "+speed+" color: "+color+" radius: "+radius+" fan is on};";
        }else{
            return "fan{ color: "+color+" radius: "+radius+" fan is off};";
        }
    }
}
class F1andF2{
    static Fan fan1 = new Fan();
    static Fan fan2 = new Fan();

    public static void main(String[] args) {
        fan1.setOn(true);
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.display());

        fan2.setSpeed(fan2.MEDIUM);
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.display());
    }
}
