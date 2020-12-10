
public class TesteEquipamento {

	public static void main(String[] args) {
		Equipamento equip = new Equipamento();
		
		System.out.println("Está ligado? " + equip.estaLigado());
		equip.liga();
		System.out.println("Está ligado? " + equip.estaLigado());
		equip.desliga();
		System.out.println("Está ligado? " + equip.estaLigado());
		equip.inverte();
		System.out.println("Está ligado? " + equip.estaLigado());

	}

}
