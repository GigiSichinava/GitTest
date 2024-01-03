import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import java.util.StringTokenizer;
import acm.program.ConsoleProgram;

public class Problem63 extends ConsoleProgram {

	public void run() {

		Map<String, Collection<String>> myMap = new HashMap<String, Collection<String>>();

		while (true) {
			String line = readLine("Enter friends (use space between) : ");
			if (line.isEmpty()) {
				break;
			}
			StringTokenizer tkn = new StringTokenizer(line);
			String a = tkn.nextToken();
			String b = tkn.nextToken();
			myMap.putIfAbsent(b, new HashSet<String>());
			myMap.get(b).add(a);
		}

		println(myMap);

	}
}