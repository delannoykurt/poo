public class Main{
	public static void main(String[] args){
		int number = 12;
		List<Integer> number = Arrays.asList(1,2,3,4,5,6);
		number.stream().map(v => v + 1).forEach(System.out::println);
	}
}