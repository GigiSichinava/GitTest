
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem63 extends ConsoleProgram {

	public void run() {

		Map<String, Collection<String>> map = new HashMap<String, Collection<String>>();

		while (true) {
			String line = readLine();
			if (line.isEmpty()) {
				break;
			}
			StringTokenizer tokenizer = new StringTokenizer(line);
			String a = tokenizer.nextToken();
			String b = tokenizer.nextToken();
			map.putIfAbsent(b, new HashSet<String>());
			map.get(b).add(a);
		}

		println(map);

	}
}