import javax.swing.JOptionPane;

public class Trabalho2{
	
	public static void main(String[]args){
		
		
		//1) Solicitar dados do Empregado. 
		
		
		String nome = JOptionPane.showInputDialog("Nome do empregado");
		int tempo_empresa = Integer.parseInt(JOptionPane.showInputDialog("Tempo de empresa em ANOS"));
		int numero_dependentes = Integer.parseInt(JOptionPane.showInputDialog("N�mero de dependentes"));
		double salario_atual = Double.parseDouble(JOptionPane.showInputDialog("Valor do sal�rio atual"));
		
		
		//2) Mostrar um MENU com as seguintes op��es.
		
		
		int menu=0;
		double aumento=0;
		double imposto=0;
		double salario_final=0;
		while(menu!=10){
		   menu = Integer.parseInt(JOptionPane.showInputDialog("MENU: \n"
		   + "\n"
           + "3) Mostrar todos os dados do Empregado. \n"
           + "4) Mostrar o valor do Aumento.\n"
           + "5) Mostrar o valor do Imposto que ser� retido na folha de pagamento.\n"
           + "6) Mostrar o valor do Sal�rio Final.\n"
           + "7) Apresentar um resumo de c�lculos do Empregado."));
		   
			   //3) Mostrar todos os dados do Empregado.
			   
			   
			   if(menu==3){
					
					JOptionPane.showMessageDialog(null,"\n Nome do empregado: " +nome
					+"\n Tempo de empresa em ANOS: " +tempo_empresa
					+"\n N�mero de dependentes: " +numero_dependentes
					+"\n Valor do sal�rio atual: "+"R$ " +salario_atual);
				}
 
                //4) Mostrar o valor do Aumento. 
				
	
				if(menu==4){
					
					if(tempo_empresa>=3&&tempo_empresa<5){
												
						aumento = (10.0/100.0*salario_atual);
						
						JOptionPane.showMessageDialog(null,"O Valor do aumento � de: "+"R$ "+aumento);
												
					}
					if(tempo_empresa>=5&&tempo_empresa<7){
						
						aumento = (15.0/100.0*salario_atual);
						
						JOptionPane.showMessageDialog(null,"O Valor do aumento � de: "+"R$ "+aumento);
												
					}
					if(tempo_empresa>=7){
						
						aumento = (20.0/100.0*salario_atual);
						
						JOptionPane.showMessageDialog(null,"O Valor do aumento � de: "+"R$ "+aumento);
												
					}
				}
						   
				//5) Mostrar o valor do Imposto que ser� retido na folha de pagamento.
				
				
				if(menu==5){
					
					if(numero_dependentes==0){
						
						imposto = (20.0/100.0*salario_atual);
						
						JOptionPane.showMessageDialog(null,"O Valor do imposto � de: "+ "R$ "+imposto);
												
					}
					if(numero_dependentes==1){
						
						imposto = (18.0/100.0*salario_atual);
						
						JOptionPane.showMessageDialog(null,"O Valor do imposto � de: "+ "R$ "+imposto);
												
					}
					if(numero_dependentes==2){
						
						imposto = (16.0/100.0*salario_atual);
						
						JOptionPane.showMessageDialog(null,"O Valor do imposto � de: "+ "R$ "+imposto);
						
					}
					if(numero_dependentes>2){
						
						imposto = (15.0/100.0*salario_atual);
						
						JOptionPane.showMessageDialog(null,"O Valor do imposto � de: "+ "R$ "+imposto);
												
					}
				}
				
				//6) Mostrar o valor do Sal�rio Final.
				

				if(menu==6){
					
					salario_final = salario_atual + aumento - imposto;
					
					JOptionPane.showMessageDialog(null,"O sal�rio final �: "+"R$ "+salario_final);
				}
			
				
				//7) Apresentar um resumo de c�lculos do Empregado.
				
				if(menu==7){
					
					JOptionPane.showMessageDialog(null,"\n Nome: "+nome
					+"\n Tempo de Empresa: "+tempo_empresa
					+"\n Numero de Dependente: "+numero_dependentes
					+"\n Sal�rio: "+salario_atual
					+"\n Aumento: "+aumento
					+"\n Imposto: "+imposto
					+"\n Sal�rio Final: "+salario_final);
				}
			}	
	}
}				

