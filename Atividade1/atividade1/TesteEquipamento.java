
public class TesteEquipamento {

	public static void main(String[] args) {
		Equipamento equip = new Equipamento();
		
		System.out.println("Est� ligado? " + equip.estaLigado());
		equip.liga();
		System.out.println("Est� ligado? " + equip.estaLigado());
		equip.desliga();
		System.out.println("Est� ligado? " + equip.estaLigado());
		equip.inverte();
		System.out.println("Est� ligado? " + equip.estaLigado());

	}

}
