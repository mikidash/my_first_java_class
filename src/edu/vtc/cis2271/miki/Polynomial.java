package edu.vtc.cis2271.miki;

public class Polynomial {

	public static void main(String[] args) {
		Polynomial example = new Polynomial(2);
		example.setCoefficient(0,7);
		example.setCoefficient(1,3);
		example.setCoefficient(2,1);

	}
	
		private float [] _coefficients;
		public Polynomial (int degree)		
		{
			_coefficients = new float[degree + 1];
			for (int i = 0; i < _coefficients.length; i++)
				_coefficients[i] = (float) 1;		
				
		}
		public int getDegree()
		{
			return _coefficients.length;
		}
		
		public float getCoefficient(int x)
		{			
			return  _coefficients[x];				
		}
		public void setCoefficient(int x, float y)
		{
		 _coefficients[x] = y;
			
		}
		
		public String toString()
		{
			
		}
		{
			if (getCoefficient > 1 )
			{
				String output = getCoefficient() + "x^" + getDegree() ;
				
			}
			
		}
			
		
		
		

		
		
	

}
