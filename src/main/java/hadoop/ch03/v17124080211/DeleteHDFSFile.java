package hadoop.ch03.v17124080211;

import com.google.inject.internal.util.$Lists;
import com.google.inject.internal.util.$ToStringBuilder;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

import java.lang.reflect.Type;
import java.net.URI;

public class  DeleteHDFSFile {
    public static void main(String[] args)throws Exception{
        Configuration conf = new Configuration();
        URI uri = new URI("hdfs://192.168.30.131");
        Path dfs=new Path("/17124080211/test2.txt");
        FileSystem fs =FileSystem.get(uri,conf,"hadoop");
        fs.delete(dfs,true);
        fs.close();

    }
}
