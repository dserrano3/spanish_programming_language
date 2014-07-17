package evaluators;

import java.util.ArrayList;

import conte.Context1;

public class DeclaracionEvaluator implements Evaluator {

	String nombre;
	Evaluator e;

	public DeclaracionEvaluator(String nombre, Evaluator e) {
		this.nombre = nombre;
		this.e = e;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) {

		// System.out.println("me llamaron con pila "+pila.size());
		pila.get(pila.size() - 1).put(nombre, e);

		// System.out.println((Integer)pila.peek().get(nombre).evaluate(null));
		return null;
	}

}
