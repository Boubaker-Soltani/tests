class Main{
    public static void main(){
        func4();
    }
    static void func1(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void func2(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void func3(){
        for(int i = 0; i < 4; i++){
            for(int j = 4; j > i; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void func4(){
        for(int i = 0; i < 4; i++){
            for(int j = 1; j <= 3 - i ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i -1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}