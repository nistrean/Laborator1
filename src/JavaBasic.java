public class JavaBasic {
    public static void main(String[] args){
        int a = 20;

        if(a % 2 == 0){
            System.out.println("Numarul "+a+" este par");
        }
        else{
            System.out.println("Numarul "+a+" este impar");
        }

        String zi = "Vineri";
        switch(zi){
            case "Luni": System.out.println("Azi abia e luni!");
                break;
            case"Marti": System.out.println("Azi e marti");
                break;
            case"Miercuri": System.out.println("Azi e miercuri !");
                break;
            case"Joi": System.out.println("Azi e joi");
                break;
            case"Vineri": System.out.println("Azi e vineri !!!");
                break;
            case"Simbata": System.out.println("Azi e simbata");
                break;
            case"Duminica":
                System.out.println("Azi e Duminica !!!");
                break;
        }

        String[] car = {"Toyota", "Audi", "BMW","Mercedes"};
        for(String i : car){
            System.out.println(i);
        }

        addition(5.35,8.08);
        substraction(13.2,5.09);
        square(6);
        mod(20,3);
    }

    static void addition(double x, double y){
        System.out.println(x + y);
    }
    static void substraction(double x, double y){
        System.out.println(x - y);
    }
    static void square(int c){
        System.out.println(c * c);
    }
    static void mod(int x, int y){
        System.out.println(x % y);
    }
}
