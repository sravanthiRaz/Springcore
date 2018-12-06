package com.maven.springFramework.SpringCore.Properties;

import java.util.Properties;

public class Language {
	private Properties countryAndLanguage;

	public Properties getCountryAndLanguage() {
		return countryAndLanguage;
	}

	public void setCountryAndLanguage(Properties countryAndLanguage) {
		this.countryAndLanguage = countryAndLanguage;
	}

	@Override
	public String toString() {
		return "Language [countryAndLanguage=" + countryAndLanguage + "]";
	}

}
