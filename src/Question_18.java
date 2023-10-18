/*
Make your education marksheets and display in console. “BE CREATIVE”
Note: All marks from your marksheets should be store in variables and print them in
console
 */
public class Question_18 {
    public static void main(String[] args) {
        String Institute = "Gujarat University";
        String Name = "Kinjal shah";
        int Academic_Year = 2009;
        int Roll_No = 111;
        int English = 65;
        int Hindi = 71;
        int Account = 93;
        int Statistics = 95;
        int Business_Law = 72;
        int sum = English + Hindi + Account + Statistics + Business_Law;
        double div = sum / 5d;
        System.out.println("---------------------------------------");
        System.out.println("Institute:" + "              "+Institute);
        System.out.println("Name:" + "                   "+Name);
        System.out.println("Academic_Year:" + "          "+Academic_Year);
        System.out.println("Roll_No:" + "                "+Roll_No);
        System.out.println("--------------------------------------");
        System.out.println("Subject" + "                     Marks");
        System.out.println("------------------------------------");
        System.out.println("English" + "                     "+English);
        System.out.println("Hindi" + "                       "+Hindi);
        System.out.println("Account" + "                     "+Account);
        System.out.println("Statistics" + "                  "+Statistics);
        System.out.println("Bussiness_Law" + "               "+Business_Law);
        System.out.println("----------------------------------------");
        System.out.println("Total" + "                       "+sum);
        System.out.println("Percentage" + "                  "+div);
        System.out.println("------------------------------------");








    }
}
