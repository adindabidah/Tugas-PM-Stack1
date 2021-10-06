import java.util.Scanner;
public class TugasPM {
    public static void main(String[] args) {

        StackAdinda<String> StackJava = new StackAdinda<>(8);
        String inp = "f(x)=x+3";
        Scanner adin = new Scanner(inp);

        adin.useDelimiter("");

        for (int a = 0; a < 8; a++) {
            String adnid = adin.next();
            if (adnid.equals("(")) {
                StackJava.push("(");
            } else if (adnid.equals(")")){
                StackJava.pop();
            }
        }
        if (StackJava.isEmpty()) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");
        }
    }
}