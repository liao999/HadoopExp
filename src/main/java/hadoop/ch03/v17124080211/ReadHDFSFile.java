package hadoop.ch03.v17124080211;

import com.google.inject.internal.util.$Lists;
import com.google.inject.internal.util.$ToStringBuilder;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.zookeeper.common.IOUtils;
import sun.nio.ch.IOUtil;

import java.lang.reflect.Type;
import java.net.URI;

public class ReadHDFSFile {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        //配置 NameNode 地址，具体根据你的 NameNode IP 配置
        URI uri = new URI("hdfs://192.168.30.131:8020");
        //指定用户名，获取FileSystem对象
        FileSystem fs = FileSystem.get(uri, conf, "hadoop");
        Path dfs = new Path("/17124080211/test5.txt");
        FSDataInputStream fis =fs.open(dfs);
        IOUtils.copyBytes(fis,System.out,4096,true);
        //System.out.println(res);

    }
}
