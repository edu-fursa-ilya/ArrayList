
public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add(" hello ");
        myList.add(" my dear ");
        myList.add(" friend! ");

        myList.print();

        myList.remove(0);
        System.out.println();
        myList.print();
    }
}
