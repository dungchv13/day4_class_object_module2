
import java.util.Arrays;
import java.util.Scanner;

public class StopWatch {
    private long startTime,endTime;

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
class RunStopWatch{
//    public static void main(String[] args) {
//        StopWatch clock = new StopWatch();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhan 0 de bat dau");
//        String value = scanner.nextLine();
//        int a = Integer.parseInt(value);
//        if (a == 0) {
//            clock.start();
//        }
//        System.out.println("nhan 9 de dung lai");
//        String value1 = scanner.nextLine();
//        int b = Integer.parseInt(value1);
//        if (b == 9) {
//            clock.stop();
//            System.out.println("thoi gian chay la:" + clock.getElapsedTime() + " milliseconds");
//        }
//    }
    public static void main(String[] args) {
        StopWatch clock = new StopWatch();
        Scanner scanner = new Scanner(System.in);

        int [] arrRandom = new int[100000];
        for(int i = 0;i < 100000;i++){
            arrRandom[i] = (int)(Math.random()*99)+1;
        }

        System.out.println("nhan 0 de bat dau sap xep mang");
        String value = scanner.nextLine();
        int b = Integer.parseInt(value);
        if(b == 0){
            clock.start();
            sortArray(arrRandom);
            clock.stop();
            System.out.println("thoi gian de sap xep mang la: "+clock.getElapsedTime());
        }
    }
    public static void sortArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length - 1; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void showArr(int[]arr){
        for (int a: arr) {
            System.out.print(a+" ");
        }
        System.out.println();
    }

}