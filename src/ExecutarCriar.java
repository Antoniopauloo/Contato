
	import java.util.ArrayList;

     public class ExecutarCriar {

	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				
				ArrayList<ContatoCriar> contato = new ArrayList();
				
				ContatoCriar contato1 = new ContatoCriar(0123,12454-1,"Michelle","michelle@terra.com.br","2341-2323",2340.00);
				ContatoCriar contato2 = new ContatoCriar(1021,12504-4,"Mariana","mariana@terra.com.br","2346-3455",4000.00);
				ContatoCriar contato3 = new ContatoCriar(1425,25147-3,"Breno","breno@terra.com.br","3556-4567",1230.00);
				ContatoCriar contato4 = new ContatoCriar(5412,32145-3,"Levi","Levi@terra.com.br","2344-2345",4300.00);

		        contato.add(contato1);
		        contato.add(contato2);
		        contato.add(contato3);
		        contato.add(contato4);
				
				for(ContatoCriar c:contato) {
					
					System.out.println("Agencia: "+c.getAgencia()+" , "+" Conta: "+c.getConta()+" , "+" Nome: "+c.getNome()+" , "+
					" Email: "+c.getEmail()+" , "+" Telefone: "+c.getTelefone()+" , "+" Saldo: "+c.getSaldo());
				}
				
				System.out.println("O Total de registro é "+contato.size());
				
				
				
				System.out.println(contato.get(3).getNome());
				
				System.out.println(contato.get(2).getNome());
			}
			
      }


	
			

