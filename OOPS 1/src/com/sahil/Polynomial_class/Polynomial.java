package com.sahil.Polynomial_class;


/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


public class Polynomial {

	  private int degrees[];
        private int coefficient[];
        private int nextIndexc;
        private int nextIndexd;

        Polynomial()
        {
            degrees=new int[5];
            for(int i=0;i<degrees.length;i++)
            {
                degrees[i]=i;
            }
            coefficient=new int[5];
            
            nextIndexc=0;
            nextIndexd=0;
        }

        Polynomial(int size)
        {
            degrees=new int[size];
            for(int i=0;i<degrees.length;i++)
            {
                degrees[i]=i;
            }
            coefficient=new int[size];
            
            nextIndexc=0;
            nextIndexd=0;
        }

	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	public void setCoefficient(int degree, int coeff){

            while(degrees.length<=degree)
            {
                restructure();
            }
            nextIndexd=degree;
            nextIndexc=degree;
            degrees[nextIndexd]=degree;
            coefficient[nextIndexc]=coeff;
            //nextIndexc++;
            //nextIndexd++;
		
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
       
       for(int i=0;i<degrees.length;i++)
       {
           if(coefficient[i]!=0)
           {
               System.out.print(coefficient[i]+"x"+degrees[i]+" ");
           }
       }
       System.out.println();
		
	}

	
	//Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){

            int size;
            if(degrees.length>p.degrees.length)
                size=degrees.length;
            else
                size=p.degrees.length;

            Polynomial temp=new Polynomial(size);

            for(int i=0;i<coefficient.length;i++)
            {
                temp.coefficient[i]+=coefficient[i];
            }
            

             for(int i=0;i<p.coefficient.length;i++)
            {
                temp.coefficient[i]+=p.coefficient[i];
            }
            
            return temp;
		
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		int size;
            if(degrees.length>p.degrees.length)
                size=degrees.length;
            else
                size=p.degrees.length;

            Polynomial temp=new Polynomial(size);

            for(int i=0;i<coefficient.length;i++)
            {
                temp.coefficient[i]+=coefficient[i];
            }
            

             for(int i=0;i<p.coefficient.length;i++)
            {
                temp.coefficient[i]-=p.coefficient[i];
            }
            
            return temp;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		
        int size=0,size1=0,size2=0;
        for(int i=degrees.length-1;i>=0;i--)
        {
            if(coefficient[i]!=0)
            {
                size1=degrees[i];
                size+=size1;
                break;
            }
        }
        
        for(int i=p.degrees.length-1;i>=0;i--)
        {
            if(p.coefficient[i]!=0)
            {
                size2=p.degrees[i];
                size+=size2;
                break;
            }
        }
      
       

        Polynomial temp=new Polynomial(size+1);
        for(int i=0;i<coefficient.length;i++)
        {
            for(int j=0;j<p.coefficient.length;j++)
            {
                if(coefficient[i]!=0 && p.coefficient[j]!=0)
                    temp.coefficient[degrees[i]+p.degrees[j]]+=coefficient[i]*p.coefficient[j];
            }
        }
        

        return temp;
	}

    private void restructure()
    {
        int temp1[]=degrees;
        int temp2[]=coefficient;
        degrees=new int[2*degrees.length];
        coefficient=new int[2*coefficient.length];
        for(int i=0;i<temp1.length;i++)
        {
            degrees[i]=temp1[i];
        }
        //nextIndexd=temp1.length;
        for(int i=temp1.length;i<degrees.length;i++)
        {
            degrees[i]=i;
        }
        for(int i=0;i<temp2.length;i++)
        {
            coefficient[i]=temp2[i];
        }
        //nextIndexc=temp2.length;
        
    }

}
