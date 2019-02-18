package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.*;
public class ControllerMain {
	@FXML
	private Label myselected;
	 
	
	@FXML
	private RadioButton RBAdd;
	@FXML
	private RadioButton RBsub;
	@FXML
	private RadioButton RBmulti;
	@FXML
	private RadioButton RBdiv;
	@FXML
	private Label lblResult;
	
	@FXML
	private TextField txtnumber1;
	@FXML
	private TextField txtnumber2;
	
	
	
	public int Number1;
	public int Number2;
	 
	 public String op;
	
	public void ops()
	{
		if( RBAdd.isSelected())
		{
			op="+";
		}
		if( RBsub.isSelected())
		{
			op="-";
		}
		if( RBmulti.isSelected())
		{
			op="*";
		}
		if( RBdiv.isSelected())
		{
			op="/";
		}
		
	}
	
	
	
	   
	public void onClickButton(ActionEvent event) {
		 
		
		System.out.println();
		lblResult.setText("");
          int res=0;
		
		Number1=Integer.parseInt(txtnumber1.getText());
		Number2=Integer.parseInt(txtnumber2.getText());
		
		
		switch(op) 
		{
		  case "+":
			  res=Number1+Number2;
		    break;
		  case "-":
			  res=Number1-Number2;
			    break;   
		  case "*":
			  res=Number1*Number2;
			    break;
		  case "/":
			  res=Number1/Number2;
			    break;
		 
		 	}
		
		lblResult.setText(res+"");
		
		 
		
	}
	 
	
	
	 
	
	 


}
