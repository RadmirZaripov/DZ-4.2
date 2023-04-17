public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmindex = (int) service.calculate(98, 1.87 ); //должно получиться 28
        System.out.println(bmindex);
    }
}
