package code;

import org.apache.commons.vfs2.*;

public class Transfer {

    public String[] userData = new String[5];
    public String type;

    public void download(String[] userData, String type) throws FileSystemException {

        this.userData = userData;
        this.type = type;

        String[] parts = userData[0].split("@");
        String user = parts[0];
        String host = parts[1];

        FileSystemManager fsManager = VFS.getManager();
        FileSystemOptions opts = new FileSystemOptions();
        FileObject localFile = fsManager.resolveFile(userData[3]);
        //FileObject remoteFile = fsManager.resolveFile(type + user + ":" + userData[2] + "@" + host +"/" + userData[4], opts);

        
               FileObject remoteFile = fsManager.resolveFile(type + user + ":" + userData[2] + "@" + host + ":" + userData[1] + "/" + userData[4], opts);

        localFile.copyFrom(remoteFile, new AllFileSelector());

        System.out.println("OK");

    }

}
