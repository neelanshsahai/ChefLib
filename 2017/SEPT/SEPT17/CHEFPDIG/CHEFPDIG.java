import java.util.Scanner;

public class CHEFPDIG {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int tc = inp.nextInt();
        inp.nextLine();
        while (tc-- != 0) {
            String n = inp.nextLine();
            int count[] = new int[10];
            for(int j=0; j<10; j++) {
                count[j] = n.split(String.valueOf(j), -1).length - 1;
            }
            String final_string = "";
            for(int k=65; k<=90; k++) {
                if(k/10 == k%10) {
                    if (count[k / 10] > 1) {
                        final_string += String.valueOf((char) k);
                    }
                }
                else {
                    if (count[k / 10] > 0 && count[k % 10] > 0) {
                        final_string += String.valueOf((char) k);
                    }
                }
            }

            System.out.println(final_string);
        }
        inp.close();
    }
}
