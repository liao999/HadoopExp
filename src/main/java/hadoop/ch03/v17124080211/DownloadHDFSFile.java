package hadoop.ch03.v17124080211;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import java.net.URI;

public class DownloadHDFSFile {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        URI uri = new URI("hdfs://192.168.30.131:8020");
        FileSystem fs = FileSystem.get(uri, conf, "hadoop");
        Path dfs = new Path("/17124080211/test5.txt");
        FSDataOutputStream os = fs.create(dfs, true);
        os.writeBytes("Hello,World!");
        Path src = new Path("/17124080211/test5.txt");
        Path dst = new Path("e:/test5-new.txt");
        fs.copyToLocalFile(false,src,dst,true);
        fs.close();
        System.out.println("Download Successfully!");
    }
}

