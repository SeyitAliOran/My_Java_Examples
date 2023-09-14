package dersler.gun62_OopReview;

import java.text.DecimalFormat;
import java.util.Random;

public class Perceptron {
    private double w1; //Katsayı-ağırlık
    private double bias; //Bias ek katsayı
    private double learningRate;
    private double error;

    //y(output) = mx + b; //Linear Regression

    public Perceptron(double learningRate) {
        this.learningRate = learningRate;
        this.w1 = (new Random().nextDouble());
        this.bias = (new Random().nextDouble());
    }

    public double getW1() {
        return w1;
    }

    public double getBias() {
        return bias;
    }

    public double getError() {
        return error;
    }

    public double tahmin(double x1){
        return w1 * x1 + bias;
    }

    public void train(double input, double target){
        double tahmin = tahmin(input);
        error = target - tahmin;
        w1 += error * input * learningRate;
        bias += error * learningRate;
    }

    public static void main(String[] args) throws InterruptedException {
        Perceptron beyin = new Perceptron(0.00001);
        double[][] egitimDatasi;

        //Data for training
        //Fahrenheit to Celsius Training data
        //egitimDatasi = new double[][]{{32.0, 0},{50.0, 10.0}, {68.0, 20.0}, {86.0, 30.0}, {104.0, 40.0}};

        //Celsius to Fahrenheit Training data
        egitimDatasi = new double[][]{{0.0, 32.0}, {10.0, 50.0}, {20.0, 68.0}, {30.0, 86.0}, {40.0, 104.0}};

        //Mile to Km
        //egitimDatasi = new double[][]{{4.0, 6.44}, {5.0, 8.05}, {25.0, 40.23}, {14.0, 22.53}, {62.2, 100.10}};

        //Km to Mile
        //  egitimDatasi = new double[][]{{6.44, 4.0}, {8.05, 5.0}, {40.23, 25.0}, {22.53, 14.0}, {100.10, 62.2}};

        //y = 2 * x + 1
        // egitimDatasi = new double[][]{{4.0, 9}, {5.0, 11}, {25.0, 51}, {14.0, 29}, {60.0, 121}};

        //y = 3 * x + 0
        //egitimDatasi = new double[][]{{4.0, 12}, {5.0, 15}, {25.0, 75}};

        System.out.println("Training....");
        for (int i = 0; i < 150_00000; i++) {//epoch---> öğrenme döngüsü
            for (int j = 0; j < egitimDatasi.length; j++) {
                double input = egitimDatasi[j][0]; // [row] [column]  row---> input
                double target = egitimDatasi[j][1]; //column---> target(output)
                beyin.train(input,target); //Perceptron tarin method
            }
            //   Thread.sleep(1);
            if(i % 100 == 0){ //Her 100 tekrarda ekrana öğrenme durumunu yazdır.
                System.out.printf("Egitim tekrar sayısı: %5d Weight : %.15f Bias: %.15f Error : %.15f ",i ,beyin.getW1(),beyin.getBias(),beyin.getError());
                System.out.println();
            }
        }

        DecimalFormat df = new DecimalFormat("#.##");
        double tahmin = beyin.tahmin(0);
        System.out.println("tahmin = " + df.format(tahmin));
    }
}