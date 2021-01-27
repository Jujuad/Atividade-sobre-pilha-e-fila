import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Fila2 {

	public static void main(String[] args) {
		
		Fila fila1 = new Fila();
		
		fila1.push("Ju");
		fila1.push("lia");
		System.out.println(fila1);
		
		String j1 = fila1.pop();
		System.out.println(j1);
		System.out.println(fila1);
		
		Queue<String> FilaJava = new LinkedList<String>();
		FilaJava.add("Ju");
		String j2 = FilaJava.poll();
		System.out.println(j2);
	}
}
