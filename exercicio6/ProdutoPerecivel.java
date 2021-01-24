package exercicio6;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ProdutoPerecivel extends Produto {
	private Date dataVencimento;
	
	ProdutoPerecivel(String descricao, int quantidade, double valor, Date dataVencimento){
		super(descricao, quantidade, valor);
		this.dataVencimento = dataVencimento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String estaVencido() {
		Date data = new Date();
		if(this.calcularDiferencaData(data) < 0) {
			return "O produto está vencido.";
		}else {
			return "O produto não está vencido.";
		}
	}
	
	private long calcularDiferencaData(Date data) {
		Calendar validade = Calendar.getInstance();
		Calendar dataHoje = Calendar.getInstance();
		validade.setTime(getDataVencimento());
		dataHoje.setTime(data);
		long qtdValidade = validade.getTimeInMillis();
		long qtdDataHoje = dataHoje.getTimeInMillis();
		long diferenca = qtdValidade -  qtdDataHoje;
		return diferenca;
	}
	
	String formato = "DD/MM/yyyy";
	DateFormat dateFormat = new SimpleDateFormat(formato);
	
	public String toString() {
		return "Data de vencimento: " + dateFormat.format(getDataVencimento());
	}
	
	
}
