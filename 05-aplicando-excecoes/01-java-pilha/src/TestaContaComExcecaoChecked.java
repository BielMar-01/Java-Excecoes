
public class TestaContaComExcecaoChecked {
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MinhaExcecaoDireta ex) {
			System.out.println("Tratamento....");
		}
	}

}
