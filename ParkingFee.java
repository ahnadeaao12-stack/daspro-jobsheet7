import java.util.Scanner;

public class ParkingFee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        do{
            System.out.print("Input vehicle type (0 to close): ");
            jenis = sc.nextInt();

            if ( jenis == 1 || jenis == 2){
            System.out.println("Input duration: ");
            durasi = sc.nextInt();
                
                if (durasi > 5){
                    total += 12500;
                } else if (jenis == 1){
                    total += durasi * 3000;
                } else if (jenis == 2){
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);

        System.out.println("Total Parking fees: Rp " + total);
        
        sc.close();
    }
}