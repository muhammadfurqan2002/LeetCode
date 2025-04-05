
class AddTwoDigits {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        while(num>9){
            int x=num%10;
            num=num/10;
            num+=x;
        }
        return num;
    }
    public static void main(String[] args) {
        AddTwoDigits addTwoDigits = new AddTwoDigits();
        System.out.println(addTwoDigits.addDigits(38));
    }
}