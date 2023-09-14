package dersler.gun62_OopReview;

import java.util.Scanner;

public class GecmeNotuHesapla {

    private final double[] weights; //Ağırlık kat sayıları
    private double bias; //Ek ağırlık katsayısı
    private final double learningRate; //tuning, öğrenmenin hızı, öğrenmenin kalitesi

    public GecmeNotuHesapla(int numInputs, double learningRate) {
        weights = new double[numInputs]; //Herbir input için bir weight
        this.learningRate = learningRate;
        initializeWeights();
        bias = Math.random();
    }

    private void initializeWeights() {
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Math.random();
        }
    }

    public double predict(double[] inputs) {
        double weightedSum = 0.0;
        for (int i = 0; i < inputs.length; i++) {
            weightedSum += weights[i] * inputs[i];
        }
        weightedSum += bias;
        return weightedSum;
    }

    public void train(double[][] inputs, double[] output, int numEpochs) {
        for (int epoch = 0; epoch < numEpochs; epoch++) {
            for (int i = 0; i < inputs.length; i++) {
                double prediction = predict(inputs[i]);
                double error = output[i] - prediction;
                for (int j = 0; j < weights.length; j++) {
                    weights[j] += learningRate * error * inputs[i][j];
                }
                bias += learningRate * error;
                if( epoch % 100 == 0){
                    System.out.printf("Number of training: %-5d Weight[0]: %.10f Weight[1]: %.10f Weight[2]: %.10f Bias: %.10f Error: %.15f" , epoch, weights[0], weights[1],weights[2], bias, error);
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner notGir = new Scanner(System.in);

        // Example usage
        GecmeNotuHesapla perceptron = new GecmeNotuHesapla(3, 0.0001);
        //gecmeNotu = (vize1 * 0.20) + (vize2 * 0.20) + (final * 60) + bias
        //weigthedSum = w1 * input1 + w2 * input2 + w3 * input3 + bias
        //y = w1 * vize1 + w2 * vize2 + w3 * final + bias
        //Multiple inputs---vize1 vize2 final

        //Training data
        //inputs 2 vize ve 1 final notu
        double[][] inputs = {{100.0, 100.0,100.0}, {100.0, 80.0,50.0}, {80.0, 100.0, 60.0}, {40.0, 60.0, 20.0}, {70.0, 50.0, 80.0}, {50.0, 90.0, 30.0}};
        double[] output = {100.0, 66.0, 72.0, 32.0,72.0,46.0}; // Output values--Sınıf geçme notları

        //Train the perceptron with training data
        perceptron.train(inputs, output, 1000);

        System.out.println();
        System.out.println("-------- Training process is finished ---------");

        double[] testInput = new double[3];

        System.out.printf("Weight[0]: %.10f %n",perceptron.weights[0]);
        System.out.printf("Weight[1]: %.10f %n",perceptron.weights[1]);
        System.out.printf("Weight[2]: %.10f %n",perceptron.weights[2]);
        System.out.printf("Bias     : %.10f %n",perceptron.bias);

        System.out.println();
        System.out.println("Hesaplamak istediğiniz Vize1, Vize2 ve Final notunu giriniz.");
        System.out.print("1.Vize notu : ");
        testInput[0] = notGir.nextDouble();

        System.out.print("2.Vize notu : ");
        testInput[1] = notGir.nextDouble();

        System.out.print("Final notu  : ");
        testInput[2] = notGir.nextDouble();

        // Test prediction
        // double[] testInput = {10.0, 100.0, 10.0};
        double prediction = perceptron.predict(testInput);

        System.out.printf("Tahmin edilen sınıf geçme notu: %.2f %n" , prediction);
    }
}
