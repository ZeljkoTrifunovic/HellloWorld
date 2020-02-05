package main.helloworld;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line argumentsrintln
     */
    public static void main(String[] args) {
        
        System.out.println("Hello World");
        System.out.println("Zeljko Trifunovic");

System.out.println("Unesiti redni broj dana u nedelji (1-7):");
        Scanner input = new Scanner(System.in);
        int redniBrDana = input.nextInt();
        switch(redniBrDana) {
            case 1:
                System.out.println("Ponedeljak");
                break;
            case 2:
                System.out.println("Utorak");
                break;
            case 3:
                System.out.println("Sreda");
                break;
            case 4:
                System.out.println("Cetvrtak");
                break;
            case 5:
                System.out.println("Petak");
                break;
            case 6:
                System.out.println("Subota");
                break;
            case 7:
                System.out.println("Nedelja");
                break;
            default:
                System.out.println("Nedelja ima samo 7 dana");
}
    }
    
}
