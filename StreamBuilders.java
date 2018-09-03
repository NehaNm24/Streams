import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuilders {

	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Ajit");
		memberNames.add("Rahul");
		memberNames.add("Sharukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		//Stream.of(memberNames);
		
		memberNames.stream().filter((s) -> s.startsWith("A"))
		.forEach(System.out :: println);
		
		memberNames.stream().filter((s) -> s.startsWith("A"))
		.map(String :: toUpperCase)
		.forEach(System.out :: println);
		




		

	}

}
