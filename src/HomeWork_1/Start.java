package HomeWork_1;

public class Start {
    public static void main(String[] args) {

    Prince prince1 = new Prince(26, "Bohdan", 39);
    Princess princess1 = new Princess(30, "Katie", 39);
    Princess princess2 = new Princess(27, "Julia",37);

        System.out.println(prince1);
        System.out.println(princess1);
        System.out.println(prince1.findPrincess(princess1));
        System.out.println(prince1.findPrincess(princess2));
    }
}
