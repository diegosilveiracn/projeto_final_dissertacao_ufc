package br.com.ufc.banco.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import br.com.ufc.banco.persistence.BancoSQL;

/**
 * Classe utilit�rio para leitura do aquivo database.properties
 * 
 * @author Diego Silveira / Jos� Maria
 * @version 1.0.0
 * @since 07/02/2007
 */
public class UtilProperties {

	private static Properties properties;

	static {
		properties = new Properties();
		try {
			InputStream is = BancoSQL.class.getResource("database.properties")
					.openStream();
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * M�todo para recuperar um conte�do de um arquivo properties a partir de
	 * seu chave
	 * 
	 * @param key
	 *            Chave do arquivo properties Exemplo: DRIVE
	 * @return Chave do arquivo properties Exemplo:
	 *         oracle.jdbc.driver.OracleDriver
	 */
	public static String getAcessoMapCode(String key) {

		String code = properties.getProperty(key);
		return code;
	}
}
