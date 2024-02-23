public class Main {
    public static void main(String[] args) {
        //завдання 1
        int a = 9;
        int b = 2;
        double c = (double) a / b;
        int d = a%b;
        System.out.println("результат ділення:"+c);
        System.out.println("результат залишку від ділення:"+d);

        //завдання 2
        int i = 43;
        int i1 = i/10;
        int i2 = i%10;
        int sum = i1 + i2;
        System.out.println("Завдання 2");
        System.out.println("сума i1 + i2:" + sum);

        //завдання 3
        double s = 6.8;
        int v = (int)(s + 0.5);
        System.out.println("завдання 3");
        System.out.println(v);
    }
}