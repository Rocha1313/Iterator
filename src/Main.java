public class Main {
    public static void main(String[] args) {
        LL<String> myList = new LL<>();

        myList.add("abc");
        myList.add("mno");
        myList.add("pqr");
        myList.add("xyz");

        for (String s : myList){
            System.out.println("1");
            System.out.println(s);
        }
    }
}