package net.salesianosLaCuesta.utils;

import java.io.File;
import java.io.IOException;

public class ProcessLauncher {

    private static final String OPERATIONS_ROUTE = "./src/net/salesianosLaCuesta/function/operations.java";

    public static Process initOperation(String text, String outputFileName) throws IOException {
        ProcessBuilder builder = new ProcessBuilder("java", OPERATIONS_ROUTE, text);
        builder.redirectOutput(new File("./output/resultFiles/" + outputFileName));
        builder.redirectError(new File("./output/errorFiles/" + outputFileName));
        return builder.start();
    }

}
