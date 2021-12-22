class MethodsReturn {

    public static void main(String[] args) { 
        int x = 5;
        int y = 6;       
        int sum = sumOfTwo(x, y);
        System.out.println("The sum of " + x + " and " + y + " is " + sum + ".");

    }

    public static int sumOfTwo(int i, int j) {
        return(i + j);
    }

}