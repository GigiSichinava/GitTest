import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		String used = "";

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);

			if (!used.contains("" + ch)) {
				int amount = 0;
				
				for(int j = 0; j < text.length(); j++){
					if(ch == text.charAt(j)){
						amount++;
					}
				}
				println(ch + " : " + amount);
				used = used + ch;
			}
		}
	}
}