public class Test {

    private static String name="张三";
    public Integer age=10;

    class Test1{
        public void show(){
            System.out.println(name);
        }
    }

    public void print(){
        new Test1().show();
    }

    public static void main(String[] args) {
        new Test().print();
    }
}
