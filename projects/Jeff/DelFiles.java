package file_hierarchy;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DelFiles {

	public static void main(String[] args) throws Exception {
		
		Files.walk(Paths.get("C:/tmp/sharepointdownload/teams.inside.pearson.com/"))
        .filter(Files::isRegularFile)
        .map(Path::toFile)
        .forEach(File::delete);

	}

}



/*cmd /c C:\\wget.exe --user mylogin --password mypass  --no-clobber 

--convert-links --random-wait  -r -p -E -e robots=off -U mozilla 

http://teams.inside.pearson.com/sch2/sim


no parent just folder
cmd /c C:\\wget.exe --user vk --password Co wget -m -e robots=off --no-parent http://teams.inside.pearson.com/sch2/sim/instructional/


*/