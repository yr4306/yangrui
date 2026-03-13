public class Bodyheigh {
    public static void MassIndex(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("体重过轻：低于18.5");
        } else if (bmi < 25) {
            System.out.println("正常：介于18.5至24.9之间");
        } else if (bmi < 30) {
            System.out.println("超重：介于25至29.9之间");
        } else {
            System.out.println("肥胖：30或更大");
        }
    }
}