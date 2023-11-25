import acm.program.ConsoleProgram;

// strings 101

public class Practice extends ConsoleProgram {
    public void run() {
        String str = "beng biwo";
        println(str);

        String reversedStr = reversedString(str);
        println(reversedStr);
    }

    private String reversedString(String str) {
        String result = " ";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }
}
