package com.marcel.RACF;

import java.util.List;

import static com.marcel.RACF.ConfigReader.ReadConfigFile;
import static com.marcel.RACF.ConfigReader.WriteConfigFile;
import static com.marcel.RACF.ConfigReader.PrintTokens;
import static com.marcel.RACF.ConfigReader.GetValue;

public class ConfigFile {

	List<ConfigTokens.ConfigObject> objectList;

	public ConfigFile(String filename) throws Exception {
		objectList = ReadConfigFile(filename);
	}

	public void ReadFromFile(String filename) throws Exception {
		objectList = ReadConfigFile(filename);
	}

	public void WriteToFile(String filename)
	{
		WriteConfigFile(filename, objectList);
	}

	public void DisplayTokens()
	{
		PrintTokens(objectList);
	}

	public ConfigTokens.ConfigVariableObjectType GetConfigValue(String configPath, boolean resolveReference) throws Exception {
		return GetValue(configPath, objectList, resolveReference);
	}

	public ConfigTokens.ConfigVariableObjectType GetConfigValue(String configPath) throws Exception {
		return GetValue(configPath, objectList, true);
	}

	public String GetConfigValueString(String configPath, boolean resolveReference) throws Exception {
		return GetValue(configPath, objectList, resolveReference).toString();
	}

	public String GetConfigValueString(String configPath) throws Exception {
		return GetValue(configPath, objectList, true).genericToString();
	}

}
