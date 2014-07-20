package evaluators;

import java.util.ArrayList;

import conte.Context1;


public class PrintlnEvaluator implements Evaluator {

	private ArrayList<Evaluator> evaluators;

	public PrintlnEvaluator() {
		this.evaluators = new ArrayList<Evaluator>();
	}

	public void addEvaluator(Evaluator ev)
	{
		evaluators.add(ev);
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) {

		StringBuilder s = new StringBuilder();
		for(int i = 0; i < evaluators.size(); i++)
			s.append(evaluators.get(i).evaluate(pila).toString());
		s.append("\n");
		System.out.println("imprimiendo.." +  s);
		
		return s.toString();
	}

}
