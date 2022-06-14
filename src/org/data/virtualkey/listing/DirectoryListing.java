package org.data.virtualkey.listing;
import java.io.File;

import org.data.virtualkey.entity.FileDirectory;
public class DirectoryListing {
      private static FileDirectory filedir = new FileDirectory();
      public static void showFileList() {
    	  filedir.addFiles();
    	  for(File file : DirectoryListing.getFileDirectory().getFiles()) {
    		  System.out.println(file.getName());
    	  }
      }
      public static FileDirectory  getFileDirectory() {
    	  return filedir;
      }
      public static void setFileDirectory(FileDirectory filedir) {
    	  DirectoryListing.filedir = filedir;
      }
}
