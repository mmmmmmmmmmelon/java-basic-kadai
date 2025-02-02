package kadai_015;

public class Car_Chapter15 {
    private int gear = 0;
    private int speed = 0;

    public Car_Chapter15(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void gearChange(final int afterGear) {
        System.out.println("ギアを " + this.gear + " から " + afterGear + " に切り替えました");
        this.gear = afterGear;  
    }

    public void run() {
        System.out.println("速度は時速 " + this.speed + " kmです");
    }
}