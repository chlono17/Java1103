package com.ocp4;

import javax.crypto.Cipher;

/*
    調查五位學生之身高及體重如下。
    身高：172、168、164、170、176(公分)
    體重：62、57、58、64、64(公斤)
 */
public class ArrayDemo {

    public static void main(String[] args) {
        double h[] = {172, 168, 164, 170, 176};
        double w[] = {62, 57, 58, 64, 64};
        //算出身高總和
        double h_sum = getSum(h);

        //算出體重總和
        double w_sum = getSum(w);
        System.out.printf("h:%.1f,w:%.1f\n", h_sum, w_sum);

        //算出身高平均
        double h_avg = getAvg(h);
        //算出體重平均
        double w_avg = getAvg(w);
        System.out.printf("h:%.1f,w:%.1f\n", h_avg, w_avg);
        //算出BMI平均
        double bmi_avg = GetBMIAng(h, w);
        System.out.printf("BMI平均:%.2f", bmi_avg);
    }

    public static double getSum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double getAvg(double[] array) {
        double sum = getSum(array);
        return sum / array.length;
    }

    public static double GetBMIAng(double[] h_array, double[] w_array) {
        if (h_array.length != w_array.length) {
            System.out.println("資料不長度一致");
            return 0.0;
        }
        int len = h_array.length;
        double bmi_sum = 0;
        for (int i = 0; i < len; i++) {
            double bmi = w_array[i] / Math.pow(h_array[i] / 100, 2);
            bmi_sum += bmi;//累積BMI總和
        }
        return bmi_sum / len;//計算BMI平均
    }

}
