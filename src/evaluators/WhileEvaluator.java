package evaluators;

import java.util.ArrayList;

import conte.Context1;



public class WhileEvaluator implements Evaluator {

	private Evaluator condicion;
	ArrayList <Evaluator> lista;
	Object objeto;
	private boolean bandera;
	public Evaluator getCondicion() {
		return condicion;
	}


	public void setCondicion(Evaluator condicion) {
		this.condicion = condicion;
	}

    
	
	
	public WhileEvaluator(Evaluator condicion) {
		this.condicion = condicion;
		lista  =  new ArrayList<Evaluator>(); ;
		bandera = false;
	}
	
	


	public boolean getBandera() {
		return bandera;
	}


	public void add(Evaluator a)
	{
		lista.add(a);
		
	}
	

	
	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		//System.out.println(condicion);
		//Context1 auxcon = new Context1();
		//pila.add(auxcon);

		while((Boolean)condicion.evaluate(pila) == true)
		{
			pila.add(new Context1());
			for(Evaluator e: lista)
			{
				if(e != null)
					e.evaluate(pila);
			}
			
			pila.remove(pila.size()-1);		
			
		}
		
		return null;
		

	}
}

