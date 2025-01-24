class SomeStuff{
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        int number = 1;
        do{
            factorial *= number;
            number+=factorial;
            System.out.println(number);
        }while (number<n) ;
    }
}
