package Algoritm;

/**
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said alla keskmise iga grupi kohta?
 */
public class Hinded {

    public static void main(String[] args)
    {
        System.out.println(allaKeskmise(new int[]{19, 45, 55, 67, 89}));
        System.out.println(allaKeskmise(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(allaKeskmise(new int[]{21, 85, 45}));
    }


    public static String allaKeskmise( int [] nums){
        int sum = 0;
        int avg = 0;
        int allaKesk = 0;
        for (int i = 0; i <nums.length ; i++)
        {
            if (nums[i]>60){
                nums[i] =60;
            }
            sum +=nums[i];
            avg = sum/(i+1);

        }
        System.out.println("Keskmine hinne on " + avg);
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]<avg){
                allaKesk++;
            }
        }
        return "Alla keskmist on " + allaKesk + " hinnet";
    }
}
