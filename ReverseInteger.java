class ReverseInteger {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = -456;
        int num3 = 120;
        int num4 = 0;

        System.out.println("Reverse of " + num1 + " is " + reverse(num1));
        System.out.println("Reverse of " + num2 + " is " + reverse(num2));
        System.out.println("Reverse of " + num3 + " is " + reverse(num3));
        System.out.println("Reverse of " + num4 + " is " + reverse(num4));
    }

    public static int reverse(int x) {
        StringBuilder s = new StringBuilder();
        boolean isNegative = x < 0;  
        x = Math.abs(x);
        while (x != 0) {
            int remainder = x % 10;
            s.append(remainder);
            x = x / 10;
        }
        
        try {
            int reversed = Integer.parseInt(s.toString());
            return isNegative ? -reversed : reversed;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
