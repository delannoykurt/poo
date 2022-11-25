public class Main{
	public static void main(String[] args){
		int number = 12;
		List<Integer> number = Arrays.asList(1,2,3,4,5,6);
		number.stream().map(v => v + 1).forEach(System.out::println);

		//
		Console cons = System.console();
        int choice = 0;
        String text = "Demonstration - debug";
        Scanner scan = new Scanner(System.in);
        do{
            cons.printf("%s", "\033[05;34m \033[5m");
            System.out.println("\n\rentrez votre choix");
            System.out.println("ci-dessous: ");
            System.out.println(">");
            System.out.println(">");
            System.out.println(">");
            cons.printf("%s", "\033[ \033[0m");
            cons.flush();
            try {
                choice = (int) scan.nextInt();
                switch(choice){
                    case 1:
                        text = "<<< Debug - switch - >>>";
                        cons.printf("%s", text);
                    break;
                    
                    case 2:
                        text = "=== Debug - switch - ===";
                        cons.printf("%s", text);
                    break;

                    case 3:
                        text = "*** Debug - switch - ***";
                        cons.printf("%s", text);
                    break;

                    // to be continued ....

                    case 5:
                    break;
                }
            } catch (Exception e) {
                e.getStackTrace();
            }
        } while(choice != 5);
        
        // close the stream
        scan.close();
    }
	}
}