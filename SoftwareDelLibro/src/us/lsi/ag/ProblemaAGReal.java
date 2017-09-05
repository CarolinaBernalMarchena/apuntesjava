package us.lsi.ag;

import java.util.List;

import us.lsi.ag.agchromosomes.IRealChromosome;
import us.lsi.common.Tuple2;

/**
 * @author Miguel Toro
 *
 * @param <S> Tipo de la soluci�n
 * 
 * <p> Tipo adecuado para encontrar el m�ximo de una funci�n de varias varaibles reales en un dominio dado </p>
 */
public interface ProblemaAGReal<S> extends ProblemaAG {
	
	/**
	 * @return N�mero de variables
	 */
	Integer getNumeroDeVariables(); 
	
	/**
	 * @return L�mites para cada variable
	 */
	List<Tuple2<Double,Double>> getLimites();
	
	/**
	 * @param i El indice de una variable
	 * @return El l�mite inferior de la variable i
	 */
	default Double geLimiteInf(int i){
		return this.getLimites().get(i).v1;
	}
		
	/**
	 * @param i El indice de una variable
	 * @return El l�mite superior de la variable i
	 */
	default Double geLimiteSup(int i){
		return this.getLimites().get(i).v2;
	}
	
	/**
	 * @param chromosome Un cromosoma
	 * @return La funci�n de fitness del cromosoma
	 */
	Double fitnessFunction(IRealChromosome chromosome);
	
	/**
	 * @param chromosome Es un cromosoma
	 * @return La soluci�n definida por el cromosoma
	 */
	S getSolucion(IRealChromosome chromosome);
	
}
