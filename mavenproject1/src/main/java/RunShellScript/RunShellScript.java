
package RunShellScript;

    import java.io.*;

public class RunShellScript {
    public static void main(String[] args) throws IOException {
        String[] cmd = { "/bin/sh", "/root/Desktop/JavaTOOD/executavel-com-interface/jar.sh" };
        Process p = Runtime.getRuntime().exec(cmd);
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = "";
        while ((line = reader.readLine())!= null) {
            System.out.println(line);
        }
    }
}

