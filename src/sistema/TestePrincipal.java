package sistema;

import java.util.ArrayList;
import java.util.List;

import comandaDigital.model.pessoas.Cliente;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class TestePrincipal {
	@SuppressWarnings("unchecked")
	public void teste() throws JRException {
		
		System.out.println("Gerando relatório...");

		@SuppressWarnings("rawtypes")
		List lista = new ArrayList();
		
		Cliente c1 = new Cliente();
		c1.setNome("Alexandre Macedo");
		c1.setEmail("alexbmac@gmail.com");
		c1.setTelefone("9999-9999");
		
		Cliente c2 = new Cliente();
		c2.setNome("Rafael Cosentino");
		c2.setEmail("cosen@gmail.com");
		c2.setTelefone("8888-8888");
		
		Cliente c3 = new Cliente();
		c3.setNome("Daniel Machado");
		c3.setEmail("daniel@gmail.com");
		c3.setTelefone("7777-7777");
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		JasperReport report = JasperCompileManager.compileReport("relatorios/RelatorioClientes.jrxml");
		
		JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(lista));

		JasperExportManager.exportReportToPdfFile(print, "RelatorioClientes.pdf");
		
		System.out.println("Relatório gerado.");
	}
}
