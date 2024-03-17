import java.util.Stack;

public class DVD {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Shaolin Soccer");
        stack.push("IPMan");
        stack.push("Rambo");
        stack.push("Karate Kid");

        System.out.println("DVD's :- " + stack);

        stack.pop();

        System.out.println("DVD's :- " + stack);

        System.out.println("Top of the DVD rack :- " + stack.peek());

        System.out.println("0 Index in DVD rack:- " + stack.search("IPMan"));

        System.out.println("2 Index in DVD rack :- " + stack.search("Shaolin Scoccer"));

        while(!stack.isEmpty()) { // ! - negative
            System.out.println(stack.pop());

        }

        System.out.println("DVD's :- " + stack);

    }

}
