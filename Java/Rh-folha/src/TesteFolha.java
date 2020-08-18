public class TesteFolha {
	public static void main(String[] args) {
		Deducao inss = new Deducao();
		inss.setNome("INSS");
		inss.setValor(64);
		Deducao valeTransporte = new Deducao();
		valeTransporte.setNome("Vale transporte");
		valeTransporte.setValor(48);
		Holerite holerite = new Holerite();
		holerite.setNomeFuncionario("João das Couves");
		holerite.setSalarioBruto(800);
		holerite.setDeducoes(new Deducao[] { inss, valeTransporte });
		System.out.println("Salário líquido: "
		+ holerite.getSalarioLiquido());
		}
	}


