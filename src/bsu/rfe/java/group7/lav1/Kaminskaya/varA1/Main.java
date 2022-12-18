package bsu.rfe.java.group7.lav1.Kaminskaya.varA1;

public class Main {

    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[args.length];
        for (int i = 0; i < args.length; i++) {
            String[] parts = args[i].split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[i] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[i] = new Apple(parts[0]);
            } else if (parts[0].equals("Pie")) {
                breakfast[i] = new Pie(parts[0]);
            }
            else if (parts[0].equals("Penapple")) {
                breakfast[i] = new Penapple();
            }
            else if (parts[0].equals("tea")) {
                breakfast[i] = new tea();
            }
        }
        for (Food item : breakfast) {
            item.consume();
        }

        Food food = new Pie("яблочная");
        System.out.println(food + ": " + countFoods(breakfast, food));
        printFoods(breakfast);
        System.out.println("Всего хорошего!");
    }

    static Integer countFoods(Food[] breakfast, Food food) {
        Integer count = 0;
        for(int i = 0; i < breakfast.length; i++) {
            if(food.equals(breakfast[i]))
            {
                count++;
            }
        }
        return count;
    }

    static void printFoods(Food[] breakfast){
        int c = 0;
        int a = 0;
        int p = 0;
        int k = 0;
        int r = 0;
        for(int i = 0; i < breakfast.length; i++) {

            if(breakfast[i] instanceof Cheese){
                c++;
            }
            else if (breakfast[i] instanceof Apple){
                a++;
            }
            else if (breakfast[i] instanceof Pie){
                p++;
            }
            else if (breakfast[i] instanceof Penapple){
                k++;
            }
            else if (breakfast[i] instanceof tea){
                r++;
            }
        }
        System.out.println("CЫР - " + c);
        System.out.println("ЯБЛОКО - " + a);
        System.out.println("ПИРОГ - " + p);
        System.out.println("АНАНАС - " + k);
        System.out.println("ЧАЙ - " + r);
    }
}





