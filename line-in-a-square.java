class Program {
    public static void main(String[] args) {
        int sims = 1000000;
        
        double[] x = new double[sims * 2];
        double[] y = new double[sims * 2];

        for (int i = 0; i < x.length; i++) {
            x[i] = Math.random();
            y[i] = Math.random();
        }

        double[] line = new double[sims];

        for (int j = 0; j < line.length; j++) {
            line[j] = Math.sqrt(Math.pow(x[j] - x[j + sims], 2) + Math.pow(y[j] - y[j + sims], 2));
        }

        double result = average(line);

        System.out.println(result);
    }

    private static double average(double[] list) {
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum / list.length;
    }
}
