package hadoop.ch03.v17124080211;


import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class UploadHDFSFile {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        URI uri = new URI("hdfs://192.168.30.131:8020");
        FileSystem fs = FileSystem.get(uri, conf, "hadoop");
        Path src = new Path("e:\\test4.txt");
        Path dst = new Path("/17124080211/test4.txt");
        fs.copyFromLocalFile(src,dst);
        fs.close();

        System.out.println("Upload Successfully!");
    }
}
