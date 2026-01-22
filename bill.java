public class bill {
    public static void main(String[] args) {
        
        // float time = 7f;
        // float bill = 0;

        // if (time <= 2) {
        //     bill = 50 * time;
        // } else if (time <= 5) {
        //     bill = (50*2) + (time -2)*25;
        // } else {
        //     bill = (50*2) + (3*25) + (time - 5)*10;
        // }
        // System.out.println("Total bill is: " + bill);

        int units = 450;
        float totalBill = 0;
        int fixedCharge = 50;

        if (units <= 100){
            totalBill = fixedCharge + units * 2;
        }else if (units <= 200){
            totalBill = fixedCharge + (100 * 2) + (units - 100) * 3;
        }else{
            totalBill = fixedCharge + (100 * 2) + (100 * 3) + (units - 200) * 4;
        }

        if (totalBill > 2000){
            totalBill = totalBill + (totalBill * 0.10f);
        }

        System.out.println("Total bill is: " + totalBill);

    }
}
