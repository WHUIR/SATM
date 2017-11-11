/**
 * 
 */
package util;

/**
 * @author Li Chenliang [lich0020@ntu.edu.sg]
 *
 */
public class MathUtil {
	
	public static double sum(double[] vector){
		double sum = 0.0;
		for ( int i = 0; i < vector.length; i++ )
			sum += vector[i];
		return sum;
	}
	
	public static double[] L1NormWithReusable(double[] vector){
		double sum = 0.0;
		
		for (double value : vector){
			sum += value;
		}
		
		if ( Double.compare(sum, 0.0) > 0 ){
			for ( int i = 0; i < vector.length; i++ ){
				vector[i] = vector[i] / sum;
			}
		} else {
			return null;
		}
		
		return vector;
	}
}
