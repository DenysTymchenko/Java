public class Main {
    public static void main(String[] args) {
        for(int i = 2; i<=100;i++){
            int dividers = 0;
            for(int j = 1; j<=i;j++){
                if(i%j == 0){
                    dividers++;
                }
            }
            if(dividers == 2){
                System.out.println(i);
            }
        }
    }
}
