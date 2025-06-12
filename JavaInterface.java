


interface Client{
    void print();
    void show();
}

class Dev implements Client{
    public void print() {
        System.out.println("bill");
    }
     public void show() {
        System.out.println("billud:\\VsCode\\HAR-MERN\\hash.java");
    }
}

public class JavaInterface {
    public static void main(String[] args) {
        Dev obj = new Dev();
        obj.print();
    }
}