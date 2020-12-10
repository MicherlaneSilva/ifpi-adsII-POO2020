
public class TestaEquipamentos {

	public static void main(String[] args) {
		Equipamento equip1 = new Equipamento();
		Equipamento equip2 = new Equipamento();
		
		equip1.liga();
		equip2.desliga();
		equip1.inverte();
		equip2.inverte();
		verificarEstado(equip1);
		verificarEstado(equip2);
		

	}
	static void verificarEstado(Equipamento equip) {
		if(equip.estaLigado()) {
			System.out.println("Equipamento 1 está ligado.");
		}else {
			System.out.println("Equipamento 1 está ligado.");
		}
	}
}
