package br.com.ecommerce.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.ejb.Ejb3Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GeraBancoDeDados {

	public static void main(String[] args) {
		
		Ejb3Configuration cfgConfiguration = new Ejb3Configuration();
		cfgConfiguration.configure("ecommerce", null);
		cfgConfiguration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		Configuration configuration = cfgConfiguration.getHibernateConfiguration();
		
		SchemaExport schemaExport = new SchemaExport(configuration);
		schemaExport.create(true, false);
	}
}
