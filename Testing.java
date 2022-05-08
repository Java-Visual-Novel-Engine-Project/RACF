package com.marcel.RACF;

import static com.marcel.RACF.Util.puts;

public class Testing {

    public static void test() {
	    try
        {
            ConfigFile file = new ConfigFile("test.txt");

            file.DisplayTokens();
        }
        catch (Exception e)
        {
            puts("File \"test.txt\" was not found! oh ma jesus");
        }
    }
}
