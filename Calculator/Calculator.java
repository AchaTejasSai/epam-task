/**
*
*
*@author Acha Tejas Sai
*
*
*/

class Calculator{
	
    /*
	*Method that perform Arithmetic operation based on parameters
	*@param operand1
	*@param operand2
	*@param operator
	*/
    
	public int operation(int operand1,int operand2,String operator)
		switch(operator){
			case "Addition":{
				Addition(operand1,operand2);
				break;
			}
			case "Subtraction":{
				Subtraction(operand1,operand2);
				break;
			}
			case "Multiplication":{
				Multiplication(operand1,operand2);
				break;
			}
            case "Division":{
                Division(operand1,operand2);
                break;
            }    
			default:{
				return -1;
                break
			}
		}
		int Addition(int operand1,int operand2){
			return operand1+operand2;
		}
		int Subtraction(int operand1,int operand2){
			return operand1-operand2;
		}
		int Multiplication(int operand1,int operand2){
			return operand1*operand2;
		}
        int Division(int operand1,int operand2){
			return operand1*operand2;
		}
	}
